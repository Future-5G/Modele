package defaut;

public class M_Antenne_Directive extends M_Antenne{
	
	//Constantes
	public static final int ORIENTATION = 0;
	public static final int OUVERTURE = -3;
	
	// Variables d’instances 
	private int Orientation;
	private int Ouverture;
	
	public M_Antenne_Directive(){
		super();
		Orientation = ORIENTATION;
		Ouverture = OUVERTURE;
	}
	
	//Constructeur
	public M_Antenne_Directive(int uneOrientation, int uneOuverture){
		super();
		Orientation = uneOrientation;
		Ouverture = uneOuverture;
	}

	//Méthodes
	public int getOrientation(){
		return Orientation;
	}

	public void setOrientation(int nouvelOrientation){
		Orientation = nouvelOrientation;
	}

	public int getOuverture(){
		return Ouverture;
	}

	public void setOuverture(int nouvelOuverture){
		Ouverture = nouvelOuverture;
	}
	
	//accesseurs variable static

	public void modifierAntenne_Directive(M_Antenne_Directive uneAntenne_Directive,int uneOrientation, int uneOuverture,double uneFrequence, int unePuissance_Emission, int uneSensibilite, String unePolarisation)
	{
		uneAntenne_Directive.setFrequence(uneOrientation);
		uneAntenne_Directive.setPuissance_Emission(uneOuverture);
		uneAntenne_Directive.setFrequence(uneFrequence);
		uneAntenne_Directive.setPuissance_Emission(unePuissance_Emission);
		uneAntenne_Directive.setSensibilite(uneSensibilite);
		uneAntenne_Directive.setPolarisation(unePolarisation);
		System.out.println(uneAntenne_Directive);
	}
}
