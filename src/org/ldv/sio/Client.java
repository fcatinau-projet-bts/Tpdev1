package org.ldv.sio;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private Adresse Habitation;
    private ArrayList<Adresse> Livraison;

    public Client(String nom, String prenom, ArrayList<Adresse>Livraison, Adresse Habitation) {
        this.nom = nom;
        this.prenom = prenom;
        if(this.Livraison == null){
            this.Habitation=Habitation;
            this.Livraison =Livraison;
        }else {
            this.Livraison=Livraison;
            this.Habitation=Habitation;
        }
    }

    public Client(String nom, String prenom, Adresse habitation) {
        this.nom = nom;
        this.prenom = prenom;
        Habitation = habitation;
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public Adresse getHabitation() {
        return Habitation;
    }

    public void setHabitation(Adresse habitation) {
        Habitation = habitation;
    }

    public ArrayList<Adresse> getLivraison() {
        return Livraison;
    }

    public void setLivraison(ArrayList<Adresse> livraison) {
        Livraison = livraison;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\n' +
                ", prenom='" + prenom + '\n' +
                ", Habitation=" + Habitation + '\n' +'\n'+
                ", Livraison=" + Livraison + '\n' +'\n'+
                '}';
    }
}
