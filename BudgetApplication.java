package reader;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class BudgetApplication extends JFrame 
{

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					BudgetApplication frame = new BudgetApplication();
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BudgetApplication() 
	{
		Date date = new Date();
		setTitle("BAP - Excel Spreadsheet " + date);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Upload = new JButton("Upload Excel");
		Upload.setBounds(42, 165, 113, 23);
		contentPane.add(Upload);
		
		JButton search = new JButton("search");
		search.setBounds(42, 254, 113, 23);
		contentPane.add(search);
		
		JButton save = new JButton("save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		save.setBounds(42, 353, 113, 23);
		contentPane.add(save);
		
		
		JButton generateReport = new JButton("Generate Report");
		generateReport.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Report frame1 = new Report();
				frame1.setVisible(true);
			}
		});
		generateReport.setBounds(42, 454, 113, 23);
		contentPane.add(generateReport);
		
		
		JLabel lblExcelFile = new JLabel("Excel File:");
		lblExcelFile.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblExcelFile.setBounds(222, 50, 67, 23);
		contentPane.add(lblExcelFile);
		
		JLabel lblLastEdited = new JLabel("Last Edited:");
		lblLastEdited.setBounds(397, 54, 76, 14);
		contentPane.add(lblLastEdited);
		
		JLabel lblDepartmentxlsx = new JLabel("Department2010.xlsx");
		lblDepartmentxlsx.setBounds(222, 84, 136, 14);
		contentPane.add(lblDepartmentxlsx);
		
		JLabel lblDepartmentxlsx_1 = new JLabel("Department2017.xlsx");
		lblDepartmentxlsx_1.setBounds(222, 125, 136, 14);
		contentPane.add(lblDepartmentxlsx_1);
		
		JLabel lblNewLabel = new JLabel("7/01/2010");
		lblNewLabel.setBounds(397, 84, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("7/01/2017");
		label.setBounds(397, 125, 76, 14);
		contentPane.add(label);
		
		JLabel lblDepartmentxlsx_2 = new JLabel("Department 2017.xlsx");
		lblDepartmentxlsx_2.setBounds(222, 357, 163, 14);
		contentPane.add(lblDepartmentxlsx_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(215, 341, 607, 47);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(215, 43, 305, 104);
		contentPane.add(panel_1);
	}
}
