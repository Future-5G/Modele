/*
 * M_Antenne_Omnidirectionnel.java
 *  
 */


public class M_Antenne_Omnidirectionnel extends M_Antenne{
	
	public M_Antenne_Omnidirectionnel (double uneFrequence, int unePuissance_Emission, int uneSensibilite, String unePolarisation){
		super(uneFrequence, unePuissance_Emission, uneSensibilite, unePolarisation);
	}
	
	//accesseurs variable static

	public void modifierAntenne_Omnidirectionnel(M_Antenne_Omnidirectionnel uneAntenne_Omnidirectionnel,double uneFrequence, int unePuissance_Emission, int uneSensibilite, String unePolarisation)
	{
		uneAntenne_Omnidirectionnel.setFrequence(uneFrequence);
		uneAntenne_Omnidirectionnel.setPuissance_Emission(unePuissance_Emission);
		uneAntenne_Omnidirectionnel.setSensibilite(uneSensibilite);
		uneAntenne_Omnidirectionnel.setPolarisation(unePolarisation);
		System.out.println(uneAntenne_Omnidirectionnel);
	}
	
}

