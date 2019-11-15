package org.ldv.sio;

public class Client {
    private String nom;
    private String prenom;
    private Adresse Habitation;
    private Adresse Livraison;

    public Client(String nom, String prenom, Adresse Livraison, Adresse Habitation) {
        this.nom = nom;
        this.prenom = prenom;
        this.Habitation = Habitation;
        this.Livraison = Livraison;
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client(String nom, String prenom, Adresse habitation) {
        this.nom = nom;
        this.prenom = prenom;
        Livraison = habitation;

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
                " Prenom='" + prenom + '\n' +
                " Habitation='" + Habitation + '\n' +
                " Livraison='" + Livraison + '\n' +
                '}';
    }
}
