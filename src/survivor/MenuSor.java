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
	JMenuItem uj = new JMenuItem("Új");
	JMenuItem mentes = new JMenuItem("mentés");
	JMenuItem betoltes = new JMenuItem("betöltés");
	JMenuItem kilepes = new JMenuItem("Kilépés");
	
	JMenu sugo = new JMenu("Súgó");
	JMenuItem nevjegy = new JMenuItem("névjegy");
	
	
//Párbeszéd ablakok
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
		
		uj.setToolTipText("Új játék létrehozása.");
		uj.addActionListener(this);
		mentes.setToolTipText("Játék mentése.");
		mentes.addActionListener(this);
		betoltes.addActionListener(this);
		betoltes.setToolTipText("Mentett állás betöltése.");
		kilepes.setToolTipText("Kilépés a programból.");
		kilepes.addActionListener(this);
		
		nevjegy.setToolTipText("A készítõ névjegye.");
		nevjegy.addActionListener(this);
//menupontok hozzáadása 
		this.add(file);
		this.add(sugo);
		
	}


	public void actionPerformed(ActionEvent e) {
		this.add(a);
		if(e.getSource()==kilepes){
			
			kilepesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Valóban ki akar lépni?</FONT></HTML>");
			if(kilepesKerdes == JOptionPane.YES_OPTION){
				System.exit(1);
			}
		}
		
		if(e.getSource()==uj){
			
			ujjatekKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Új játékot akarsz játszani?</FONT></HTML>");
			if(ujjatekKerdes == JOptionPane.YES_OPTION){
				a.setVisible(true);
			}
			else {
				
			}
		}
		
		if(e.getSource()==mentes){
			
			mentesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Menteni akarod a játékot?</FONT></HTML>");
			if(mentesKerdes == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Mentés!!");
			}
			else {
				
			}
		}
		if(e.getSource()==betoltes){
			
			betoltesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Betölteni akarod a játékot?</FONT></HTML>");
			if(betoltesKerdes == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Betöltés!!");
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