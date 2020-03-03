package com.company;

import java.util.ArrayList;
import java.util.List;


public class M_Noeuds {

    //variables constants
    private static final int DEF_NBMPYLONES = 0;
    private static final M_Coordonnee DEF_COORDONNEE = new M_Coordonnee(0,0);

    //Variables
    private int nbMPylones;
    private List <M_Pylones> listePylone;
    private String ipNoeud = "127.0.0.1";

    //Constructeur 1 parametre
    public M_Noeuds(String uneIP) {
        ipNoeud = uneIP;
        listePylone =  new ArrayList <M_Pylones>();
        listePylone.add(DEF_NBMPYLONES, new M_Pylones(DEF_COORDONNEE));
        nbMPylones = DEF_NBMPYLONES;
    }

    //Constructeur 3 parametres
    public M_Noeuds(int numberPylone, String uneIP, List <M_Pylones> lPylone) {
        ipNoeud = uneIP;
        listePylone = lPylone;
        nbMPylones = numberPylone;
    }

    //GET
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
        res = "Nombre de pylones : "+nbMPylones+"\t "+ipNoeud + "\n";
        for(M_Pylones pyl: listePylone) {res = res + "nombre d'antenne dans la liste :"+ pyl.getnbMantenne()  +"\t Coordonnee :" + pyl.getcoordonnee() +"\t liste d'antenne associé :"+ pyl.getlisteAntenne()+ "\n\n";};
        return res;
    }

    static void creerNoeudDefaut(String uneIP) {
        M_Noeuds unNoeud = new M_Noeuds(uneIP);
        System.out.println(unNoeud);
    }

    static void creerNoeud(int numberPylone, String uneIP, List <M_Pylones> lPylone) {
        M_Noeuds unNoeud = new M_Noeuds(numberPylone, uneIP, lPylone);
        System.out.println(unNoeud);
    }

    public void modifierNoeud(M_Noeuds unNoeud, int numberPylone, String uneIP, List <M_Pylones> lPylone) {
        unNoeud.setnbMPylones(numberPylone);
        unNoeud.setipNoeud(uneIP);
        unNoeud.setlistePylone(lPylone); //j'ai changé setlisteNoeud  à setlistePylone
        System.out.println(unNoeud);
    }

    public void supprimerNoeud(M_Noeuds unNoeud)
    {
        List <M_Pylones> thePylones = getlistePylone();
        for (M_Pylones var : thePylones)
        {
            thePylones.remove(var);
        }
        System.out.println(unNoeud);
    }

}
