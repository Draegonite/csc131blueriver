package reader;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BudgetApplication extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BudgetApplication frame = new BudgetApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BudgetApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Upload Excel");
		btnNewButton.setBounds(10, 90, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(10, 179, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(10, 272, 113, 23);
		contentPane.add(btnNewButton_2);

		Object[] columns = {"Department", "CE", "CSC", "EEE", "CM", "ME", "ECSCS", "TOTAL"};
		Object[][] data = new Object[0][0];
		Object[] firstRowData = {"Department", "CE", "CSC", "EEE", "CM", "ME", "ECSCS", "TOTAL"};
		Object[] secondRowData = {"Lab $", "10k", "20k", "30k", "20k", "20k", "0", "100k"};
		Object[] thirdRowData = {"Lab %", "10%", "20%", "30%", "20%", "20%", "0%", "100%"};
		Object[] fourthRowData = {"All $", "100k", "100k", "100k", "50k", "100k", "0", "450k"};
		Object[] fifthRowData = {"All %", "22.2%", "22.2%", "22.2%", "11.1%", "22.2%", "0%", "100%"};
		/*Object[][] rowData = {{"Department", "CE", "CSC", "EEE", "CM", "ME", "ECSCS", "TOTAL"}, 
				{"Lab $", "10k", "20k", "30k", "20k", "20k", "0", "100k"},
				{"Department", "10%", "20%", "30%", "20%", "20%", "0%", "100%"},
				{"Department", "100k", "100k", "100k", "50k", "100k", "0", "450k"},
				{"Department", "22.2%", "22.2%", "22.2%", "11.1%", "22.2%", "0%", "100%"}};*/
		JTable table = new JTable();
	    table.setModel(new DefaultTableModel(data,columns));
		table.setBounds(155, 338, 463, 77);
		contentPane.add(table);
		
		JButton btnNewButton_3 = new JButton("Generate Report");
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addColumn(columns);
				model.addRow(firstRowData);
				model.addRow(secondRowData);
				model.addRow(thirdRowData);
				model.addRow(fourthRowData);
				model.addRow(fifthRowData);
				//JTable table = new JTable(rowData, columnNames);
				//contentPane.add(table);
			}
		});
		btnNewButton_3.setBounds(10, 358, 113, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblExcelFile = new JLabel("Excel File:");
		lblExcelFile.setBounds(155, 26, 56, 14);
		contentPane.add(lblExcelFile);
		
		JLabel lblLastEdited = new JLabel("Last Edited");
		lblLastEdited.setBounds(279, 26, 72, 14);
		contentPane.add(lblLastEdited);
		
		JLabel lblNewLabel = new JLabel("Department2010.xlsx");
		lblNewLabel.setBounds(155, 61, 114, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Department2017.xlsx");
		lblNewLabel_1.setBounds(155, 94, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("7/01/2010");
		label.setBounds(279, 61, 62, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("7/01/2017");
		label_1.setBounds(279, 94, 62, 14);
		contentPane.add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(133, 11, 267, 107);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(155, 261, 197, 34);
		contentPane.add(panel_1);
		
		JLabel lblDepartmentxlsx = new JLabel("Department 2017.xlsx");
		panel_1.add(lblDepartmentxlsx);

	}
}
