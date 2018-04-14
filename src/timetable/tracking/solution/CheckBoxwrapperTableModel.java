/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.tracking.solution;

import java.util.HashMap;
import java.util.Map;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author x16110561
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