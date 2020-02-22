/*@author Ojo Juliana
 * Projet : FUTUR 5G
 * Date : 14/02/2020
 * Classe = M_Pylones
 */

import java.util.ArrayList;
import java.util.List;


public class M_Pylones {
	//variables constants 
	private static final int DEF_NBMANTENNE = 0;
	
	
	//variable de la classe
	public static int cmpMPylones = 0;

	
	//variable d'instance
	private int nbMantenne;
	private float x, y; 
	private M_Coordonnee coordonnee = new M_Coordonnee(x,y);
	private List <M_Antenne> listeAntenne; //= new ArrayList <M_Antenne>();

	//constructeur par defaut
	public M_Pylones(M_Coordonnee unCoordonnee) //, List <M_Antenne> lAntenne
	{
		nbMantenne = DEF_NBMANTENNE;
		coordonnee = unCoordonnee;
		listeAntenne =  new ArrayList <M_Antenne>(); //allocation en memoire
		listeAntenne.add(DEF_NBMANTENNE, new M_Antenne());
		//partie statiic
		cmpMPylones++;
			
	}
	
	//constructeur
	public M_Pylones(int numberAntenne, M_Coordonnee unCoordonnee, List <M_Antenne> lAntenne)
	{
		nbMantenne = numberAntenne;
		coordonnee = unCoordonnee;
		listeAntenne =  lAntenne; //location en memoire
		cmpMPylones++;
	}
	
	//accesseurs de lecture
	public int getnbMantenne()
	{
		return nbMantenne;
	}
	
	public M_Coordonnee getcoordonnee()
	{
		return coordonnee;
	}
	
	public List<M_Antenne> getlisteAntenne()
	{
		return listeAntenne;
	}
	
	//accesseurs d'écriture
	public void setnbMantenne(int numberAntenne)
	{
		nbMantenne = numberAntenne;
	}
	
	public void setcoordonnee(M_Coordonnee unCoordonnee)
	{
		coordonnee = unCoordonnee;
	}
	
	public void setlisteAntenne(List <M_Antenne> lAntenne)
	{
		listeAntenne = lAntenne;
	}
	
	//accesseurs variable static
	public static int getcmpMPylones()
	{
		return cmpMPylones;
	}
	
	public String toString()
	{
		String answer;
		answer = "Nombre d'Antenne : "+nbMantenne+"\t "+coordonnee + "\t";
		for(M_Antenne ant: listeAntenne) {answer = answer + "freq :" + ant.getfreq() +"\t puiss :"+ ant.getpuiss()+ "\t";};
		return answer;
	}
	
	static void creerPylone(int numberAntenne, M_Coordonnee unCoordonnee, List <M_Antenne> lAntenne)
	{
		M_Pylones unPylone = new M_Pylones(numberAntenne, unCoordonnee, lAntenne);
		System.out.println(unPylone);
	}
	
	public void modifierPylone(M_Pylones unPylone,int numberAntenne, M_Coordonnee unCoordonnee, List <M_Antenne> lAntenne)
	{
		unPylone.setnbMantenne(numberAntenne);
		unPylone.setcoordonnee(unCoordonnee);
		unPylone.setlisteAntenne(lAntenne);
		System.out.println(unPylone);
	}
	public void supprimerPylone(M_Pylones unPylone)
	{
		List <M_Antenne> theAntenne = getlisteAntenne();
		for (M_Antenne var : theAntenne) 
		{ 
			theAntenne.remove(var);
		}
		System.out.println(unPylone);
	}
}
