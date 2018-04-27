/*
Classname checkBoxwrapperTableModel.java
Date 25/4/18
@reference1: https://stackoverflow.com/questions/44147350/how-to-add-checkbox-if-i-fetch-the-record-from-database
@Yamina Santillan (x16110561) 
 * 
 */
package timetable.tracking.solution;

import java.util.HashMap;
import java.util.Map;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *@author Yamina, Owen, Richard, Boris
 *Creating a wrapper Table Model class, will add a check box column at the start of the table
 */
public class CheckBoxwrapperTableModel extends AbstractTableModel {
 
    private Map<Integer, Boolean> checkBoxes = new HashMap<Integer, Boolean>();

    private TableModel model;
    private String columnName;

    public CheckBoxwrapperTableModel(TableModel model, String columnName)
    {
        this.model = model;
        this.columnName = columnName;
    }

    @Override
    public String getColumnName(int col)
    {
        return (col > 0) ? model.getColumnName(col - 1) : columnName;
    }

    @Override
    public int getRowCount()
    {
        return model.getRowCount();
    }

    @Override
    public int getColumnCount()
    {
        return model.getColumnCount() + 1;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        if (col > 0)
            return model.getValueAt(row, col - 1);
        else
        {
            Object value = checkBoxes.get(row);
            return (value == null) ? Boolean.FALSE : value;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return col == 0;
    }

    @Override
    public void setValueAt(Object value, int row, int col)
    {
        if (col > 0)
            model.setValueAt(value, row, col - 1);
        else
            checkBoxes.put(row, (Boolean) value);

        fireTableCellUpdated(row, col);
    }

    @Override
    public Class getColumnClass(int col)
    {
        return (col > 0) ? model.getColumnClass(col - 1) : Boolean.class;
    }
}