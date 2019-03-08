package survivor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Program extends JPanel implements ActionListener {
	

	public JLabel szoveg2 = new JLabel("<HTML><FONT SIZE=2>Tulajdonságok</HTML>");
	public JLabel szoveg3 = new JLabel("<HTML><FONT SIZE=2>Erõ:</HTML>");
	public JLabel szoveg4 = new JLabel("<HTML><FONT SIZE=2>Gyorsaság:</HTML>");
	public JLabel szoveg5 = new JLabel("<HTML><FONT SIZE=2>Ügyesség:</HTML>");
	public JLabel szoveg6 = new JLabel("<HTML><FONT SIZE=2>Szerencse:</HTML>");
	public JLabel szoveg7 = new JLabel("<HTML><FONT SIZE=2>Kitartás:</HTML>");
	public JLabel szoveg8 = new JLabel("<HTML><FONT SIZE=2>Fegyver:</HTML>");
	public JLabel szoveg9 = new JLabel("<HTML><FONT SIZE=2>Tapasztalati pont:</HTML>");
	public JLabel szoveg10 = new JLabel("<HTML><FONT SIZE=2>Támadóérték:</HTML>");
	public JLabel szoveg11 = new JLabel("<HTML><FONT SIZE=2>Védõérték:</HTML>");
	public JLabel szoveg12 = new JLabel("<HTML><FONT SIZE=2>Sebzés:</HTML>");
	public JLabel szoveg13 = new JLabel("<HTML><FONT SIZE=2>Életpont:</HTML>");
	private JLabel szoveg14 = new JLabel("<HTML><FONT SIZE=2>Utolsó mozgás:</HTML>");
	private JLabel szoveg15 = new JLabel("<HTML><FONT SIZE=2>Esemény:</HTML>");
	public JLabel szoveg16 = new JLabel("<HTML><FONT SIZE=2>Varázspont:</HTML>");
	public SzornyAdatok szAdatok = new SzornyAdatok(); 
	public JTextField szovegdoboz = new JTextField();
	public JTextField szovegdoboz2 = new JTextField();
	private JButton gomb = new JButton("Észak");
	private JButton gomb2 = new JButton("Kelet");
	private JButton gomb3 = new JButton("Dél");
	private JButton gomb4 = new JButton("Nyugat");
	private JButton gomb5 = new JButton("Bolt");
	private Palya a = new Palya();
	
	public Program() {
		this.setLayout(null);
		szoveg2.setBounds(95, 100, 200, 40);
		szoveg3.setBounds(65, 120, 200, 40);
		szoveg4.setBounds(30, 161, 200, 40);
		szoveg5.setBounds(30, 184, 200, 40);
		szoveg6.setBounds(30, 207, 200, 40);
		szoveg7.setBounds(30, 230, 200, 40);
		szoveg8.setBounds(200, 138, 200, 40);
		szoveg9.setBounds(200, 161, 200, 40);
		szoveg10.setBounds(200, 184, 200, 40);
		szoveg11.setBounds(200, 207, 200, 40);
		szoveg12.setBounds(200, 230, 200, 40);
		szoveg13.setBounds(65, 270, 200, 40);
		szoveg14.setBounds(25, 325, 200, 40);
		szoveg15.setBounds(25, 375, 200, 40);
		szoveg16.setBounds(30, 138, 200, 40);
		szAdatok.setBounds(380, 20, 430, 550);
		szAdatok.setBorder(new TitledBorder("A szörny adatai"));
		szovegdoboz.setBounds(120, 335, 125, 20);
		szovegdoboz2.setBounds(120, 385, 125, 20);
		gomb.setBounds(110, 435, 75, 20);
		gomb2.setBounds(185, 455, 75, 20);
		gomb3.setBounds(110, 475, 75, 20);
		gomb4.setBounds(35, 455, 75, 20);
		gomb5.setBounds(110, 550, 75, 20);
		gomb2.addActionListener(this);		
		gomb4.addActionListener(this);
		gomb.addActionListener(this);
		gomb3.addActionListener(this);
		gomb5.addActionListener(this);

		this.add(szoveg2);
		this.add(szoveg3);
		this.add(szoveg4);
		this.add(szoveg5);
		this.add(szoveg6);
		this.add(szoveg7);
		this.add(szoveg8);
		this.add(szoveg9);
		this.add(szoveg10);
		this.add(szoveg11);
		this.add(szoveg12);
		this.add(szoveg13);
		this.add(szoveg14);
		this.add(szoveg15);
		this.add(szoveg16);
		this.add(szAdatok);
		this.add(szovegdoboz);
		this.add(szovegdoboz2);
		this.add(gomb);
		this.add(gomb2);
		this.add(gomb3);
		this.add(gomb4);
		this.add(gomb5);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==gomb4){
			a.lepes('n', a.Szorny25);
		}
		if(e.getSource()==gomb2){
			
			a.lepes('k', a.Szorny25);
		}
		if(e.getSource()==gomb){
			a.lepes('e', a.Szorny25);
		}
		if(e.getSource()==gomb3){
			a.lepes('d', a.Szorny25);
		}
		if(e.getSource()==gomb5) {
			a.boltolas();
	}
	}
}