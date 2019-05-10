package survivor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuSor extends JMenuBar implements ActionListener{
	public static Program a = new Program();
	JOptionPane k = new JOptionPane();
//A Menu elemei
	JMenu file = new JMenu("File");
	JMenuItem uj = new JMenuItem("�j");
	JMenuItem mentes = new JMenuItem("ment�s");
	JMenuItem betoltes = new JMenuItem("bet�lt�s");
	JMenuItem kilepes = new JMenuItem("Kil�p�s");
	
	JMenu sugo = new JMenu("S�g�");
	JMenuItem nevjegy = new JMenuItem("n�vjegy");
	
	
//P�rbesz�d ablakok
	int kilepesKerdes;
	int ujjatekKerdes;
	int mentesKerdes;
	int betoltesKerdes;
	public MenuSor(){
		this.add(a);
		file.add(uj);
		file.addSeparator();
		
		file.add(uj);
		file.add(mentes);
		file.add(betoltes);
		file.add(kilepes);
		
		sugo.add(nevjegy);
		
		uj.setToolTipText("�j j�t�k l�trehoz�sa.");
		uj.addActionListener(this);
		mentes.setToolTipText("J�t�k ment�se.");
		mentes.addActionListener(this);
		betoltes.addActionListener(this);
		betoltes.setToolTipText("Mentett �ll�s bet�lt�se.");
		kilepes.setToolTipText("Kil�p�s a programb�l.");
		kilepes.addActionListener(this);
		
		nevjegy.setToolTipText("A k�sz�t� n�vjegye.");
		nevjegy.addActionListener(this);
//menupontok hozz�ad�sa 
		this.add(file);
		this.add(sugo);
		
	}


	public void actionPerformed(ActionEvent e) {
		this.add(a);
		if(e.getSource()==kilepes){
			
			kilepesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Val�ban ki akar l�pni?</FONT></HTML>");
			if(kilepesKerdes == JOptionPane.YES_OPTION){
				System.exit(1);
			}
		}
		
		if(e.getSource()==uj){
			
			ujjatekKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>�j j�t�kot akarsz j�tszani?</FONT></HTML>");
			if(ujjatekKerdes == JOptionPane.YES_OPTION){
				a.setVisible(true);
			}
			else {
				
			}
		}
		
		if(e.getSource()==mentes){
			
			mentesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Menteni akarod a j�t�kot?</FONT></HTML>");
			if(mentesKerdes == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Ment�s!!");
			}
			else {
				
			}
		}
		if(e.getSource()==betoltes){
			
			betoltesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Bet�lteni akarod a j�t�kot?</FONT></HTML>");
			if(betoltesKerdes == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Bet�lt�s!!");
			}
			else {
				
			}
		}
		if(e.getSource()==nevjegy){
				JOptionPane.showMessageDialog(null, "Survivor");
			}
			else {
				
			}
		
	}
}