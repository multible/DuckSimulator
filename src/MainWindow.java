import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frmDucksimluator;
	private JTextField txtQuak;
	private JTextField txtFlug;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmDucksimluator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				

			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDucksimluator = new JFrame();
		frmDucksimluator.getContentPane().setBackground(Color.WHITE);
		frmDucksimluator.setTitle("DuckSimluator");
		frmDucksimluator.setResizable(false);
		frmDucksimluator.setBounds(100, 100, 550, 400);
		frmDucksimluator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDucksimluator.getContentPane().setLayout(null);
		
		

		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(42, 185, 89, 23);
		frmDucksimluator.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(42, 219, 89, 23);
		frmDucksimluator.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("res\\ente logo.png"));
		lblNewLabel.setBounds(174, 24, 315, 218);
		frmDucksimluator.getContentPane().add(lblNewLabel);
		
		JButton btnEnte = new JButton("Ente");
		btnEnte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ente ente = new Ente(new Quaken(), new Fluegelschlagen());
				lblNewLabel.setIcon(new ImageIcon(ente.anzeigen())); 				
				txtFlug.setText(ente.fliegenAusfuehren());
				txtQuak.setText(ente.quakenAusfuehren());
			}
		});
		btnEnte.setBounds(42, 83, 89, 23);
		frmDucksimluator.getContentPane().add(btnEnte);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon("res\\ente logo.png"));
				txtFlug.setText(null);
				txtQuak.setText(null);
			}
		});
		btnReset.setBounds(42, 253, 89, 23);
		frmDucksimluator.getContentPane().add(btnReset);
		
		txtQuak = new JTextField();
		txtQuak.setText("testText");
		txtQuak.setBounds(174, 275, 150, 20);
		frmDucksimluator.getContentPane().add(txtQuak);
		txtQuak.setColumns(10);
		
		txtFlug = new JTextField();
		txtFlug.setText("testText");
		txtFlug.setColumns(10);
		txtFlug.setBounds(359, 275, 164, 20);
		frmDucksimluator.getContentPane().add(txtFlug);
		
		JButton btnStockEnte = new JButton("Stockente");
		btnStockEnte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//StockEnte 
				Ente stockEnte = new StockEnte(new Quaken(), new Fluegelschlagen());
				lblNewLabel.setIcon(new ImageIcon(stockEnte.anzeigen())); 				
				txtFlug.setText(stockEnte.fliegenAusfuehren());
				txtQuak.setText(stockEnte.quakenAusfuehren());
			}
		});
		btnStockEnte.setBounds(42, 117, 89, 23);
		frmDucksimluator.getContentPane().add(btnStockEnte);
	
		JButton btnGummiEnte = new JButton("Gummiente");
		btnGummiEnte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ente GummiEnte = new Gummiente(new Quietschen(), new NichtFliegen());
				lblNewLabel.setIcon(new ImageIcon(GummiEnte.anzeigen())); 				
				txtFlug.setText(GummiEnte.fliegenAusfuehren());
				txtQuak.setText(GummiEnte.quakenAusfuehren());
			}
		});
		btnGummiEnte.setBounds(42, 151, 89, 23);
		frmDucksimluator.getContentPane().add(btnGummiEnte);
	}
}
