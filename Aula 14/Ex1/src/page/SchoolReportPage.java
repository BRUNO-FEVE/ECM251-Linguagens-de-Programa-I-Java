package page;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;

import components.RecordTable;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class SchoolReportPage extends JFrame {
    private JTable recordTable;
    private String[] columnsName = {"Matéria", "Notas", "Faltas"};
    private ArrayList<Object[]> tableData = new ArrayList<>();
    private DefaultTableCellRenderer centerRender;

    public SchoolReportPage () {
        super("Boletim");

        recordTable = new JTable();

        Container caixa = getContentPane();
        caixa.setLayout(new FlowLayout());

        centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(JLabel.CENTER);
        recordTable.setDefaultRenderer(String.class, centerRender);

        caixa.add(recordTable);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setUserData(ArrayList<Object[]> data, Object[] user) {
        tableData.clear();
        tableData.add(columnsName);

        for (Object[] hour : data) {
            tableData.add(hour);
        }

        this.recordTable.setModel(new RecordTable(columnsName, tableData));

        for (int i = 0; i < recordTable.getColumnCount(); i++) {
            recordTable.getColumnModel().getColumn(i).setCellRenderer(centerRender);
        }
    }
}
