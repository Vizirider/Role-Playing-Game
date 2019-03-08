package survivor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuSor extends JMenuBar implements ActionListener{
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
	public MenuSor(){
		
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
		
		if(e.getSource()==kilepes){
			
			kilepesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Valóban ki akar lépni?</FONT></HTML>");
			if(kilepesKerdes == JOptionPane.YES_OPTION){
				System.exit(1);
			}
		}	
	}
}