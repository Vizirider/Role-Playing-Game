package survivor;

import javax.swing.JOptionPane;
import java.util.*;  

public class Palya {
	
	public int[][] palyaTerkep = new int[10][10];
	
	public int tapasztalatip = 155;
	ArrayList<String> gyujtottfegyver = new ArrayList<String>();
	public int sorszam;
	public int szorny1=1;
	public int szorny2=2;
	public int szorny3=3;
	public int szorny4=4;
	public int szorny5=5;
	public int szorny6=6;
	public int szorny7=7;
	public int szorny8=8;
	public int szorny9=9;
	public int szorny10=10;
	public int szorny11=11;
	public int szorny12=12;
	public int szorny13=13;
	public int szorny14=14;
	public int szorny16=16;
	public int szorny17=17;
	public int szorny18=18;
	public int szorny19=19;
	public int szorny20=20;
	public int szorny21=21;
	public int szorny22=22;
	public int szorny23=23;
	public int szorny24=24;
	public int mi=25;
	public int miX=1;
	public int miY=1;
	public Szorny Szorny1 = new Szorny("Bakkura", 50, 60, 40, 100, 20, 80, "Kard", 20);
	public Szorny Szorny2 = new Szorny("Bó-Skorpió", 60, 70, 45, 110, 30, 70, "Fejsze", 20);
	public Szorny Szorny3 = new Szorny("Bombagoly", 30, 40, 20, 80, 30, 90, "Kõ", 20);
	public Szorny Szorny4 = new Szorny("Burástyakölyök", 70, 30, 60, 130, 50, 70, "Bot", 20);
	public Szorny Szorny5 = new Szorny("Darazsfelhõ", 90, 70, 80, 150, 30, 50, "Kés", 20);
	public Szorny Szorny6 = new Szorny("Duer-ork", 70, 50, 80, 130, 40, 100, "Szigony", 20);
	public Szorny Szorny7 = new Szorny("Fekete Ölész", 60, 70, 30, 110, 30, 70, "Kard", 20);
	public Szorny Szorny8 = new Szorny("Garokk", 65, 45, 75, 100, 65, 55, "Kõ", 20);
	public Szorny Szorny9 = new Szorny("Gátvakond", 80, 60, 50, 140, 50, 40, "Fejsze", 20);
	public Szorny Szorny10 = new Szorny("Gorombilla", 100, 75, 85, 115, 70, 150, "Kés", 20);
	public Szorny Szorny11 = new Szorny("Harci Sámán", 70, 85, 45, 125, 25, 95, "Bot", 20);
	public Szorny Szorny12 = new Szorny("Hegyi rák", 30, 20, 70, 170, 200, 120, "Szigony", 20);
	public Szorny Szorny13 = new Szorny("Kobra", 150, 90, 60, 130, 120, 100, "Kard", 20);
	public Szorny Szorny14 = new Szorny("Lebegõ gomba", 80, 60, 50, 140, 30, 50, "Kõ", 20);
	public Szorny Szorny15 = new Szorny("Lila brekk", 20, 40, 50, 80, 40, 50, "Fejsze", 20);
	public Szorny Szorny16 = new Szorny("Mérges pók", 70, 60, 20, 170, 30, 40, "Bot", 20);
	public Szorny Szorny17 = new Szorny("Rájanyék", 80, 40, 100, 180, 60, 130, "Szigony", 20);
	public Szorny Szorny18 = new Szorny("Sörényes ubuk", 80, 30, 20, 60, 90, 150, "Kés", 20);
	public Szorny Szorny19 = new Szorny("Százfogú", 70, 40, 30, 180, 120, 70, "Kard", 20);
	public Szorny Szorny20 = new Szorny("Sziklozug", 60, 110, 45, 135, 45, 95, "Fejsze", 20);
	public Szorny Szorny21 = new Szorny("Umor pióca", 145, 160, 145, 175, 130, 160, "Kõ", 20);
	public Szorny Szorny22 = new Szorny("Vadász varkaudar", 140, 150, 145, 175, 155, 135, "Szigony", 20);
	public Szorny Szorny23 = new Szorny("Varkaudar harcos", 180, 165, 190, 175, 105, 145, "Kés", 20);
	public Szorny Szorny24 = new Szorny("Varkaudar hírnök", 160, 130, 175, 165, 95, 155, "Bot", 20);
	public Szorny Szorny25 = new Szorny("Én", 160, 130, 175, 65, 95, tapasztalatip, "Kard", 20);
	
	public Palya(){
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				palyaTerkep[i][j]=0;
			}
		}
		palyaTerkep[1][0]=1;
		palyaTerkep[5][4]=2;
		palyaTerkep[6][1]=3;
		palyaTerkep[2][8]=4;
		palyaTerkep[4][6]=5;
		palyaTerkep[3][9]=6;
		palyaTerkep[1][4]=7;
		palyaTerkep[5][7]=8;
		palyaTerkep[0][8]=9;
		palyaTerkep[3][7]=10;
		palyaTerkep[9][2]=11;
		palyaTerkep[6][8]=12;
		palyaTerkep[7][0]=13;
		palyaTerkep[4][4]=14;
		palyaTerkep[4][1]=15;
		palyaTerkep[6][6]=16;
		palyaTerkep[9][9]=17;
		palyaTerkep[2][5]=18;
		palyaTerkep[0][3]=19;
		palyaTerkep[9][5]=20;
		palyaTerkep[1][9]=21;
		palyaTerkep[3][2]=22;
		palyaTerkep[2][1]=23;
		palyaTerkep[8][7]=24;
		palyaTerkep[miX][miY]=25;
		
/*		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(palyaTerkep[i][j] + " | ");				
			}
			System.out.print("\n");
		}
*/		
	}
	public void harc(Szorny sz, Szorny mi) {
		Fo.a.szAdatok.setVisible(true);
    	while(!(sz.szorny_eletpontja<=0)||!(mi.szorny_eletpontja<=0)) {
   				

    		
    		JOptionPane.showMessageDialog(null, "Te támadsz a szörnyre.");
    		if(mi.szorny_sebzese>sz.vedoertek) {   			
    			sz.szorny_eletpontja-=(mi.szorny_sebzese-sz.vedoertek);
    			if(sz.szorny_eletpontja<=0) {
    				JOptionPane.showMessageDialog(null, "Legyõzted a szörnyet!!");
                    gyujtottfegyver.add(sz.szorny_cucca);
                    JOptionPane.showMessageDialog(null, "Az elnyert fegyvered: " + sz.szorny_cucca);
                                 Fo.a.szAdatok.setVisible(true);
                                 mi.tapasztalatip += 10;
                                 if(mi.tapasztalatip > 180)
                                 {
                                	 mi.szorny_eletpontja += 10;
                                 }
                                 if(mi.tapasztalatip > 200)
                                 {
                                	 mi.szorny_eletpontja += 20;
                                 }
    							}
                                 break;
    			}
    			JOptionPane.showMessageDialog(null, "Rád támad a szörny.");
    		if(sz.szorny_sebzese>mi.vedoertek) {   			
    			mi.szorny_eletpontja-=(sz.szorny_sebzese-mi.szorny_eletpontja);
    			if(mi.szorny_eletpontja<=0) {
    				JOptionPane.showMessageDialog(null, "Vesztettél!!");
    				Fo.a.szAdatok.setVisible(true);
    				
    				break;
    				}
    			}
    		}
    				Fo.a.szoveg4.setText("Gyorsaság: "+mi.szorny_gyorsasaga);
    				Fo.a.szoveg9.setText("Tapasztalati pont: "+mi.tapasztalatip);
    				Fo.a.szoveg13.setText("Életpont: "+mi.szorny_eletpontja);
    				Fo.a.szoveg10.setText("Támadóérték: "+mi.tamadoertek);
    				Fo.a.szoveg11.setText("Védõérték: "+mi.vedoertek);
    				Fo.a.szoveg12.setText("Sebzés: "+mi.szorny_sebzese);
    				Fo.a.szoveg8.setText("Fegyver: "+mi.szorny_cucca);
    	}
    
	
	public void lepes(char irany, Szorny mi){
		Fo.a.szovegdoboz2.setText("Lépés");
		if(irany=='n'){
			Fo.a.szovegdoboz.setText("Nyugat");
			if(miY>0) {
				miY-=1;
			    if(palyaTerkep[miX][miY]==0){
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX][miY+1]=0;
			        mi.szorny_eletpontja += 1;
			    }else {
			    	if(palyaTerkep[miX][miY]==1){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny1.szorny_neve);
			        Fo.a.szAdatok.szornyAdatokRajz(Szorny1,"1.jpg");
			        harc(Szorny1,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==2){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny2.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny2,"2.jpg");
			        harc(Szorny2,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==3){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny3.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny3,"3.jpg");
			        harc(Szorny3,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==4){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny4.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny4,"4.jpg");
			        harc(Szorny4,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==5){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny5.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny5,"5.jpg");
			        harc(Szorny5,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==6){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny6.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny6,"6.jpg");
			        harc(Szorny6,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==7){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny7.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny7,"7.jpg");
			        harc(Szorny7,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==8){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny8.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny8,"8.jpg");
			        harc(Szorny8,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==9){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny9.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny9,"9.jpg");
			        harc(Szorny9,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==10){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny10.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny10,"10.jpg");
			        harc(Szorny10,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==11){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny11.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny11,"11.jpg");
			        harc(Szorny11,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==12){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny12.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny12,"12.jpg");
			        harc(Szorny12,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==13){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny13.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny13,"13.jpg");
			        harc(Szorny13,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==14){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny14.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny14,"14.jpg");
			        harc(Szorny14,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==15){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny15.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny15,"15.jpg");
			        harc(Szorny15,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==16){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny16.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny16,"16.jpg");
			        harc(Szorny16,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==17){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny17.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny17,"17.jpg");
			        harc(Szorny17,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==18){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny18.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny18,"18.jpg");
			        harc(Szorny18,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==19){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny19.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny19,"19.jpg");
			        harc(Szorny19,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==20){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny20.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny20,"20.jpg");
			        harc(Szorny20,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==21){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny21.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny21,"21.jpg");
			        harc(Szorny21,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==22){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny22.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny22,"22.jpg");
			        harc(Szorny22,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==23){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny23.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny23,"23.jpg");
			        harc(Szorny23,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==24){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny24.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny24,"24.jpg");
			        harc(Szorny24,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    }
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX][miY+1]=0;
			    	mi.szorny_eletpontja += 1;
			}else JOptionPane.showMessageDialog(null, "Nem mehetsz nyugatra!");
		}
/*		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(palyaTerkep[i][j] + " | ");				
			}
			System.out.print("\n");
		}
		System.out.println("\n\n");
		
*/		
		if(irany=='k'){
			Fo.a.szovegdoboz.setText("Kelet");
			if(miY<9) {
				miY+=1;
			    if(palyaTerkep[miX][miY]==0){
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX][miY-1]=0;
			    	mi.szorny_eletpontja += 1;
			    }else {
			    	if(palyaTerkep[miX][miY]==1){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny1.szorny_neve);
			        Fo.a.szAdatok.szornyAdatokRajz(Szorny1,"1.jpg");
			        harc(Szorny1,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==2){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny2.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny2,"2.jpg");
			        harc(Szorny2,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==3){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny3.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny3,"3.jpg");
			        harc(Szorny3,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==4){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny4.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny4,"4.jpg");
			        harc(Szorny4,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==5){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny5.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny5,"5.jpg");
			        harc(Szorny5,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==6){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny6.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny6,"6.jpg");
			        harc(Szorny6,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==7){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny7.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny7,"7.jpg");
			        harc(Szorny7,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==8){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny8.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny8,"8.jpg");
			        harc(Szorny8,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==9){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny9.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny9,"9.jpg");
			        harc(Szorny9,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==10){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny10.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny10,"10.jpg");
			        harc(Szorny10,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==11){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny11.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny11,"11.jpg");
			        harc(Szorny11,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==12){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny12.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny12,"12.jpg");
			        harc(Szorny12,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==13){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny13.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny13,"13.jpg");
			        harc(Szorny13,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==14){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny14.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny14,"14.jpg");
			        harc(Szorny14,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==15){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny15.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny15,"15.jpg");
			        harc(Szorny15,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==16){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny16.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny16,"16.jpg");
			        harc(Szorny16,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==17){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny17.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny17,"17.jpg");
			        harc(Szorny17,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==18){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny18.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny18,"18.jpg");
			        harc(Szorny18,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==19){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny19.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny19,"19.jpg");
			        harc(Szorny19,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==20){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny20.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny20,"20.jpg");
			        harc(Szorny20,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==21){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny21.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny21,"21.jpg");
			        harc(Szorny21,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==22){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny22.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny22,"22.jpg");
			        harc(Szorny22,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==23){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny23.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny23,"23.jpg");
			        harc(Szorny23,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==24){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny24.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny24,"24.jpg");
			        harc(Szorny24,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    }
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX][miY-1]=0;
			    	mi.tapasztalatip += mi.tapasztalatip;
			}else JOptionPane.showMessageDialog(null, "Nem mehetsz keletre!");
		}
/*		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(palyaTerkep[i][j] + " | ");				
			}
			System.out.print("\n");
		}
		System.out.println("\n\n");
		
*/		
		if(irany=='e'){
			Fo.a.szovegdoboz.setText("Észak");
			if(miX>0) {
				miX-=1;
			    if(palyaTerkep[miX][miY]==0){
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX+1][miY]=0;
			    	mi.szorny_eletpontja += 1;
			    }else {
			    	if(palyaTerkep[miX][miY]==1){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny1.szorny_neve);
			        Fo.a.szAdatok.szornyAdatokRajz(Szorny1,"1.jpg");
			        harc(Szorny1,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==2){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny2.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny2,"2.jpg");
			        harc(Szorny2,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==3){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny3.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny3,"3.jpg");
			        harc(Szorny3,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==4){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny4.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny4,"4.jpg");
			        harc(Szorny4,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==5){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny5.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny5,"5.jpg");
			        harc(Szorny5,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==6){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny6.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny6,"6.jpg");
			        harc(Szorny6,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==7){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny7.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny7,"7.jpg");
			        harc(Szorny7,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==8){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny8.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny8,"8.jpg");
			        harc(Szorny8,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==9){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny9.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny9,"9.jpg");
			        harc(Szorny9,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==10){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny10.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny10,"10.jpg");
			        harc(Szorny10,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==11){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny11.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny11,"11.jpg");
			        harc(Szorny11,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==12){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny12.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny12,"12.jpg");
			        harc(Szorny12,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==13){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny13.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny13,"13.jpg");
			        harc(Szorny13,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==14){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny14.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny14,"14.jpg");
			        harc(Szorny14,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==15){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny15.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny15,"15.jpg");
			        harc(Szorny15,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==16){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny16.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny16,"16.jpg");
			        harc(Szorny16,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==17){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny17.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny17,"17.jpg");
			        harc(Szorny17,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==18){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny18.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny18,"18.jpg");
			        harc(Szorny18,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==19){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny19.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny19,"19.jpg");
			        harc(Szorny19,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==20){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny20.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny20,"20.jpg");
			        harc(Szorny20,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==21){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny21.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny21,"21.jpg");
			        harc(Szorny21,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==22){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny22.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny22,"22.jpg");
			        harc(Szorny22,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==23){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny23.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny23,"23.jpg");
			        harc(Szorny23,Szorny25);
			        mi.tapasztalatip += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==24){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny24.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny24,"24.jpg");
			        harc(Szorny24,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    }
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX+1][miY]=0;
			    	mi.tapasztalatip += 1;
			}else JOptionPane.showMessageDialog(null, "Nem mehetsz északra!");
		}
/*		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(palyaTerkep[i][j] + " | ");				
			}
			System.out.print("\n");
		}
		System.out.println("\n\n");
*/		
		
		if(irany=='d'){
			Fo.a.szovegdoboz.setText("Dél");
			if(miX<9) {
				miX+=1;
			    if(palyaTerkep[miX][miY]==0){
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX-1][miY]=0;
			    	mi.tapasztalatip += 10;
			    }else {
			    	if(palyaTerkep[miX][miY]==1){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny1.szorny_neve);
			        Fo.a.szAdatok.szornyAdatokRajz(Szorny1,"1.jpg");
			        harc(Szorny1,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==2){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny2.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny2,"2.jpg");
			        harc(Szorny2,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==3){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny3.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny3,"3.jpg");
			        harc(Szorny3,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==4){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny4.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny4,"4.jpg");
			        harc(Szorny4,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==5){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny5.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny5,"5.jpg");
			        harc(Szorny5,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==6){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny6.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny6,"6.jpg");
			        harc(Szorny6,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==7){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny7.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny7,"7.jpg");
			        harc(Szorny7,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==8){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny8.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny8,"8.jpg");
			        harc(Szorny8,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==9){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny9.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny9,"9.jpg");
			        harc(Szorny9,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==10){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny10.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny10,"10.jpg");
			        harc(Szorny10,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==11){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny11.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny11,"11.jpg");
			        harc(Szorny11,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==12){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny12.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny12,"12.jpg");
			        harc(Szorny12,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==13){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny13.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny13,"13.jpg");
			        harc(Szorny13,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==14){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny14.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny14,"14.jpg");
			        harc(Szorny14,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==15){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny15.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny15,"15.jpg");
			        harc(Szorny15,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==16){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny16.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny16,"16.jpg");
			        harc(Szorny16,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==17){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny17.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny17,"17.jpg");
			        harc(Szorny17,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==18){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny18.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny18,"18.jpg");
			        harc(Szorny18,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==19){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny19.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny19,"19.jpg");
			        harc(Szorny19,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==20){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny20.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny20,"20.jpg");
			        harc(Szorny20,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==21){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny21.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny21,"21.jpg");
			        harc(Szorny21,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==22){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny22.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny22,"22.jpg");
			        harc(Szorny22,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==23){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny23.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny23,"23.jpg");
			        harc(Szorny23,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    	if(palyaTerkep[miX][miY]==24){
			    		JOptionPane.showMessageDialog(null, "Harcolsz egy szörnnyel! A neve: " + Szorny24.szorny_neve);
			    		Fo.a.szAdatok.szornyAdatokRajz(Szorny24,"24.jpg");
			        harc(Szorny24,Szorny25);
			        mi.szorny_eletpontja += 1;
			    	}
			    }
			    	mi.tapasztalatip = 1;
			    	palyaTerkep[miX][miY]=25;
			    	palyaTerkep[miX-1][miY]=0;
			}else JOptionPane.showMessageDialog(null, "Nem mehetsz délre!");
		}
/*		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(palyaTerkep[i][j] + " | ");				
			}
			System.out.print("\n");
		}
		System.out.println("\n\n");*/
	}
	public void boltolas(){
		
		JOptionPane.showMessageDialog(null, "A gyûjtött fegyvereid:" + gyujtottfegyver);
		String input = JOptionPane.showInputDialog(null, "Melyik fegyveredtõl válnál meg? [0 - 25]"); 
		
		sorszam = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "Az eladott fegyvered:" + gyujtottfegyver.get(sorszam));
		gyujtottfegyver.remove(sorszam);
			    	
		}
	

}