package survivor;

public class Szorny {

	public String szorny_neve;
	public Integer tamadoertek;
	public Integer vedoertek;
	public Integer szorny_sebzese;
	public Integer szorny_eletpontja;
	public Integer szorny_gyorsasaga;
	public Integer tapasztalatip;
	public String szorny_cucca;
	public Integer varazs_pont;
	
	public Szorny( String nev, Integer tamadoe, Integer vedoe, Integer sebzes, Integer eletpont, Integer gyorsasag, Integer tapasztalatipont, String cucc, Integer varazspont) {
		szorny_neve=nev;
		tamadoertek=tamadoe;
		vedoertek=vedoe;
		szorny_sebzese=sebzes;
		szorny_eletpontja=eletpont;
		szorny_gyorsasaga=gyorsasag;
		tapasztalatip=tapasztalatipont;
		szorny_cucca=cucc;
		varazs_pont = varazspont;
	}
}