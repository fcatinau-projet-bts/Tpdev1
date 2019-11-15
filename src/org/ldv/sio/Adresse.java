package org.ldv.sio;

public class Adresse {
    private String Rue;
    private String Ville;
    private int CodePostal;
    private String Nom;

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String rue) {
        Rue = rue;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public int getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(int codePostal) {
        CodePostal = codePostal;
    }

    /*public Client(String Nom, String preNom) {
        this.Nom = Nom;
        this.preNom = preNom;
    }*/

    public Adresse(String Rue, String Ville, int codePostal, String Nom) {
        this.Nom = Nom;
        this.Rue = Rue;
        this.Ville = Ville;
        this.CodePostal = codePostal;


    }

    @Override
    public String toString() {
        return "Adresse{" +
                "Nom'" + Nom + '\'' +
                "Rue='" + Rue + '\'' +
                ", Ville='" + Ville + '\'' +
                ", CodePostal=" + CodePostal +
                '}';
    }
}
