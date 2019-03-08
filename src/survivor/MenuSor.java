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
	JMenuItem uj = new JMenuItem("�j");
	JMenuItem mentes = new JMenuItem("ment�s");
	JMenuItem betoltes = new JMenuItem("bet�lt�s");
	JMenuItem kilepes = new JMenuItem("Kil�p�s");
	
	JMenu sugo = new JMenu("S�g�");
	JMenuItem nevjegy = new JMenuItem("n�vjegy");
	
	
//P�rbesz�d ablakok
	int kilepesKerdes;
	public MenuSor(){
		
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
		
		if(e.getSource()==kilepes){
			
			kilepesKerdes = k.showConfirmDialog(null,"<HTML><FONT SIZE=4>Val�ban ki akar l�pni?</FONT></HTML>");
			if(kilepesKerdes == JOptionPane.YES_OPTION){
				System.exit(1);
			}
		}	
	}
}