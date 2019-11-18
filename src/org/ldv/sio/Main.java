package org.ldv.sio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Adresse> livraison = new ArrayList<>();

        Client Flo=new Client("CATINAUD","Florian");
        Adresse LivVierzon= new Adresse("79 Rue beau site","VIERZON",18100,"CATINAUD");
        Adresse LivTours = new Adresse("1 Square Francis Poulenc","TOURS",37000,"CATINAUD");

        Adresse DomFlo = new Adresse("79 Rue beau site","VIERZON",18100,"CATINAUD");

        AdresseEtendue adetendueFlo= new AdresseEtendue("catinaud.florian@gmail.com","catinaud_florian.com");

        livraison.add(LivTours);
        livraison.add(LivVierzon);


        //Client TestDom = new Client("Test02", "test01", DomtestDom);
        Client CTest = new Client("CATINAUD", "Florian", livraison, DomFlo,adetendueFlo);

        //System.out.println(TestDom.toString());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(CTest.toString());


    }
}
