/*
 * M_Antenne.java
 * 
 * Copyright 2020 XIXI8 <XIXI8@MSI>
 * 
 */


public class M_Antenne {
	
	//Constantes
	public static final double FREQUENCE = 0;
	public static final int PUISSANCE_EMISSION = 0;

	public static final String POLARISATION = "inconnu";
	
	//variable de la classe
	public static int cmpMAntenne = 0;

	
	// Variables d’instances 
	private double Frequence;
	private int Puissance_Emission;
	private int Sensibilite;
	private String Polarisation;;
	
	//constructeur par défaut
	public M_Antenne (){
		this(FREQUENCE,PUISSANCE_EMISSION,SENSIBILITE,POLARISATION);
		cmpMAntenne++
	}
	
	//constructeur 4 paramètres
	public M_Antenne (double uneFrequence, int unePuissance_Emission, int uneSensibilite, String unePolarisation){
		Frequence = uneFrequence;
		Puissance_Emission = unePuissance_Emission;
		Sensibilite = uneSensibilite;
		Polarisation = unePolarisation;
		cmpMAntenne++;
	}
	
	//Accesseurs
	
		//GET
	public double getLaFrequence(){
		return Frequence;
	}
	
	public int getLaPuissance_Emission(){
		return Puissance_Emission;
	}
	
	public int getLaSensibilite(){
		return Sensibilite;
	}
	
	public String getLaPolarisation(){
		return Polarisation;
	}
		
		//SET
	public void setFrequence(double uneFrequence){
		Frequence = uneFrequence;
	}
	
	public void setPuissance_Emission(int unePuissance_Emission){
		Puissance_Emission = unePuissance_Emission;
	}
	
	public void setSensibilite(int uneSensibilite){
		Sensibilite = uneSensibilite;
	}
	
	public void setPolarisation(String unePolarisation){
		Polarisation = unePolarisation;
	}
	
	//accesseurs variable static
	public static int getcmpMAntenne()
	{
		return cmpMAntenne;
	}
	
	public void modifierAntenne(M_Antenne uneAntenne,double uneFrequence, int unePuissance_Emission, int uneSensibilite, String unePolarisation)
	{
		uneAntenne.setFrequence(uneFrequence);
		uneAntenne.setPuissance_Emission(unePuissance_Emission);
		uneAntenne.setSensibilite(uneSensibilite);
		uneAntenne.setPolarisation(unePolarisation);
		System.out.println(uneAntenne);
	}
		
}

