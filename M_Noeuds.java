package defaut;

import java.util.ArrayList;
import java.util.List;


public class M_Noeuds {
	
	//variables constants 
	private static final int DEF_NBMPYLONES = 0;
	private static final M_Coordonnee DEF_COORDONNEE = new M_Coordonnee(0,0);
	
	//variable de la classe
	public static int cmpMNoeuds = 0;
	
	//Variables
	private String nomNoeud;
	private int nbMPylones;
	private List <M_Pylones> listePylone;
	private String ipNoeud = "127.0.0.1";

	//Constructeur 1 parametre
	public M_Noeuds(String uneIP) {
		nomNoeud = "Noeud " + Integer.toString(cmpMNoeuds);
		ipNoeud = uneIP;
		listePylone =  new ArrayList <M_Pylones>();
		listePylone.add(DEF_NBMPYLONES, new M_Pylones(DEF_COORDONNEE));
		nbMPylones = DEF_NBMPYLONES;
		cmpMNoeuds++;
	}
	
	//Constructeur 3 parametres
	public M_Noeuds(String uneIP, List <M_Pylones> lPylone) {
		nomNoeud = "Noeud" + Integer.toString(cmpMNoeuds);
		ipNoeud = uneIP;
		listePylone = lPylone;
		nbMPylones = lPylone.size();
		cmpMNoeuds++;
	}
	
	//GET
	public String getnomNoeud() {
		return nomNoeud;
	}
	
	public String getipNoeud() {
		return ipNoeud;
	}
	
	public int getnbMPylones() {
		return nbMPylones;
	}
	
	public List <M_Pylones> getlistePylone() {
		return listePylone;
	}
	
	//SET
	public void setipNoeud(String uneIP) {
		ipNoeud = uneIP;
	}
	
	public void setnbMPylones(int numberPylone) {
		nbMPylones = numberPylone;
	}
	
	public void setlistePylone(List <M_Pylones> lPylone) {
		listePylone = lPylone;
	}
	
	public String toString() {
		String res;
		res = "Nom de Noeud : "+nomNoeud+"\t Nombre de pylones : "+nbMPylones+"\t "+ipNoeud + "\n";
		for(M_Pylones pyl: listePylone) {res = res + "nombre d'antenne dans la liste :"+ pyl.getnbMantenne()  +"\t Coordonnee :" + pyl.getcoordonnee() +"\t liste d'antenne associé :"+ pyl.getlisteAntenne()+ "\n\n";};
		return res;
	}
	
	public void modifierNoeud(M_Noeuds unNoeud, String uneIP, List <M_Pylones> lPylone) {
		
		unNoeud.setipNoeud(uneIP);
		unNoeud.setlistePylone(lPylone); //j'ai changé setlisteNoeud  à setlistePylone
		unNoeud.setnbMPylones(lPylone.size());
		System.out.println(unNoeud);
	}
	
	public void supprimerNoeud(M_Noeuds unNoeud)
	{
		List <M_Pylones> thePylones = getlistePylone();
		thePylones.clear();
		System.out.println(unNoeud);
	}

}
