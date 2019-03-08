package survivor;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Fo extends JFrame {

	public static Program a = new Program();
	
	public Fo(String nev) {
		super(nev);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.add(a);
	}
	public static void main(String[] args) {
		Fo ablak = new Fo("Survivor game");
		
		ablak.pack();
		ablak.setVisible(true);
		ablak.setSize(840, 630);
		ablak.setLocation(210, 150);
		
	}
	
}