package components;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class RecordTable extends AbstractTableModel {

    private String[] columnsName;
    private ArrayList<Object[]> userData;

    public RecordTable(String[] columnName, ArrayList<Object[]> userData) {
        this.columnsName = columnName;
        this.userData = userData;
    }

    public int getRowCount() {
        return userData.size();
    }

    
    public int getColumnCount() {
        return columnsName.length;
    }

    public Object getValueAt(int row, int column) {
        Object[] rowData = userData.get(row);
        return rowData[column];
    }
    

}