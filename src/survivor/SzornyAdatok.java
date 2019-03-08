package survivor;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SzornyAdatok extends JPanel {
	
	JLabel nev = new JLabel();
	JLabel tamadoertek=new JLabel();
	JLabel vedoertek=new JLabel();
	JLabel szorny_sebzese=new JLabel();
	JLabel szorny_eletpontja=new JLabel();
	JLabel szorny_gyorsasaga=new JLabel();;
	JLabel tapasztalatip=new JLabel();
	JLabel szorny_cucca=new JLabel();
	JLabel varazspont=new JLabel();
	
	JLabel tamadoertekLabel=new JLabel("Támadó érték:");
	JLabel vedoertekLabel=new JLabel("Védõ érték:");
	JLabel szorny_sebzeseLabel=new JLabel("Sebzés:");
	JLabel szorny_eletpontjaLabel=new JLabel("Életpont:");
	JLabel szorny_gyorsasagaLabel=new JLabel("Gyorsaság:");
	JLabel tapasztalatipLabel=new JLabel("Tapasztalat:");
	JLabel szorny_cuccaLabel=new JLabel("Fegyver:");
	JLabel varazspontLabel=new JLabel("Varázspont:");
	public KepVaszon k;
	
	String m_filenev=null;
	Image m_aktkep=null;
	int m_Xpoz, m_Ypoz;
	int m_kep_x1, m_kep_y1;
	int m_kep_x2, m_kep_y2;
	int m_kepMagas, m_KepSzeles;
	
  public SzornyAdatok(){
	  setLayout(null);
	  nev.setBounds(170,15,250,25);
	  nev.setFont(new Font("nev",1,20));
	  this.add(nev);
	  

		tamadoertekLabel.setBounds(15,15,150,25);
		vedoertekLabel.setBounds(15,45,150,25);
		szorny_sebzeseLabel.setBounds(15,75,150,25);
		szorny_eletpontjaLabel.setBounds(15,105,150,25);
		szorny_gyorsasagaLabel.setBounds(15,135,150,25);
		tapasztalatipLabel.setBounds(15,165,150,25);
		szorny_cuccaLabel.setBounds(15,195,150,25);
		varazspontLabel.setBounds(15,225,150,25);
		
		tamadoertek.setBounds(120,15,150,25);
		vedoertek.setBounds(120,45,150,25);
		szorny_sebzese.setBounds(120,75,150,25);
		szorny_eletpontja.setBounds(120,105,150,25);
		szorny_gyorsasaga.setBounds(120,135,150,25);
		tapasztalatip.setBounds(120,165,150,25);
		szorny_cucca.setBounds(120,195,150,25);
		varazspont.setBounds(120,225,150,25);
		
		this.add(tamadoertekLabel);
		this.add(vedoertekLabel);
		this.add(szorny_sebzeseLabel);
		this.add(szorny_eletpontjaLabel);
		this.add(szorny_gyorsasagaLabel);
		this.add(tapasztalatipLabel);
		this.add(szorny_cuccaLabel);
		this.add(tamadoertek);
		this.add(vedoertek);
		this.add(szorny_sebzese);
		this.add(szorny_eletpontja);
		this.add(szorny_gyorsasaga);
		this.add(tapasztalatip);
		this.add(szorny_cucca);
		this.add(varazspont);
		this.add(varazspontLabel);
		
		k= new KepVaszon();
		k.setBounds(5, 220, 395, 300);
		this.add(k);
//Kép
		
  }

  public void szornyAdatokRajz(Szorny sz, String kep){
	  kepToltes(kep);
	  nev.setText(sz.szorny_neve);
		tamadoertek.setText(""+sz.tamadoertek);
		vedoertek.setText(""+sz.vedoertek);
		szorny_sebzese.setText(""+sz.szorny_sebzese);
		szorny_eletpontja.setText(""+sz.szorny_eletpontja);
		szorny_gyorsasaga.setText(""+sz.szorny_gyorsasaga);
		tapasztalatip.setText(""+sz.tapasztalatip);
		szorny_cucca.setText(""+sz.szorny_cucca);
		varazspont.setText(""+sz.varazs_pont);
		
  }
   public void kepToltes(String kepM){

	   m_filenev="c:\\survivor\\" + kepM;
	   if(m_filenev == null){
		   return;
	   }
	   ImageIcon tmp = new ImageIcon(m_filenev);
	   m_aktkep=tmp.getImage();
   }
   
   class KepVaszon extends JPanel{
	   public void paintComponent(Graphics g){
		   super.paintComponent(g);
		   if(m_aktkep!=null){
			   g.drawImage(m_aktkep, 5, 5,this);
		   }
		   
	   }
	   
   }
}

