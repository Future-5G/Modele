/*@author Ojo Juliana
 * Projet : FUTUR 5G
 * Date : 14/02/2020
 * Classe = M_Coordonnee
 */
package com.company;

public class M_Coordonnee {


    //attributs (varibles d'instances)
    private float longitude, latitude;

    //constructeur
    public M_Coordonnee(float longi, float lati) {
        longitude = longi;
        latitude = lati;
    }

    //accesseurs de lecture
    public float getlongitude()
    {
        return longitude;
    }

    public float getlatitude()
    {
        return latitude;
    }

    //accesseurs d'ecriture
    public void setlongitude(float longi)
    {
        longitude = longi;
    }

    public void setlatitude(float lati)
    {
        latitude = lati;
    }

    //description
    public String toString()
    {
        return "longitude = "+ longitude + "\t latitude :"+ latitude;
    }

}
