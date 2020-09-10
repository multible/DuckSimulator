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

	private JFrame frmDuckSimulator;
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
					window.frmDuckSimulator.setVisible(true);
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
		frmDuckSimulator = new JFrame();
		frmDuckSimulator.getContentPane().setBackground(Color.WHITE);
		frmDuckSimulator.setTitle("DuckSimulator");
		frmDuckSimulator.setResizable(false);
		frmDuckSimulator.setBounds(100, 100, 550, 400);
		frmDuckSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDuckSimulator.getContentPane().setLayout(null);
		
		
<<<<<<< HEAD
=======

		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(42, 185, 89, 23);
		frmDuckSimulator.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(42, 219, 89, 23);
		frmDuckSimulator.getContentPane().add(btnNewButton_3);
		
>>>>>>> afd5a525eb9e4d567f86efc0d5006a8cc41ee77b
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("res\\ente logo.png"));
		lblNewLabel.setBounds(174, 24, 315, 218);
		frmDuckSimulator.getContentPane().add(lblNewLabel);
		
		
		JButton btnMoorEnte = new JButton("Moorente");
		btnMoorEnte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				Ente moorEnte = new MoorEnte(new Quaken(), new Duesenantriebsfliegen());
				lblNewLabel.setIcon(new ImageIcon(moorEnte.anzeigen())); 				
				txtFlug.setText(moorEnte.fliegenAusfuehren());
				txtQuak.setText(moorEnte.quakenAusfuehren());
				
			}
		});
		btnMoorEnte.setBounds(42, 185, 89, 23);
		frmDucksimluator.getContentPane().add(btnMoorEnte);
		
		JButton btnTonEnte = new JButton("Tonente");
		btnTonEnte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ente tonEnte = new TonEnte(new Still(), new NichtFliegen());
				lblNewLabel.setIcon(new ImageIcon(tonEnte.anzeigen())); 				
				txtFlug.setText(tonEnte.fliegenAusfuehren());
				txtQuak.setText(tonEnte.quakenAusfuehren());
			}
		});
		btnTonEnte.setBounds(42, 219, 89, 23);
		frmDucksimluator.getContentPane().add(btnTonEnte);
		

		
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
		frmDuckSimulator.getContentPane().add(btnEnte);
		
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
		frmDuckSimulator.getContentPane().add(btnReset);
		
		txtQuak = new JTextField();
		txtQuak.setText("testText");
		txtQuak.setBounds(174, 275, 150, 20);
		frmDuckSimulator.getContentPane().add(txtQuak);
		txtQuak.setColumns(10);
		
		txtFlug = new JTextField();
		txtFlug.setText("testText");
		txtFlug.setColumns(10);
		txtFlug.setBounds(359, 275, 164, 20);
		frmDuckSimulator.getContentPane().add(txtFlug);
		
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
		frmDuckSimulator.getContentPane().add(btnStockEnte);
	
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
		frmDuckSimulator.getContentPane().add(btnGummiEnte);
	}
}
