package org.ldv.sio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Adresse> livraison = new ArrayList<>();


        Adresse DomTest = new Adresse("Rue du test", "Test", 0000, "Test01");

        Adresse Livkernighan = new Adresse("2 rue du cimetière", "Paris", 75001, "Kernighan");
        Adresse LivKnuth = new Adresse("1 rue du cinema", "Marseille", 13001, "Knuth");

        livraison.add(Livkernighan);
        livraison.add(LivKnuth);


        Client Test = new Client("Test01", "test01", livraison, DomTest);


        System.out.println(Test.toString());


    }
}
