package org.ldv.sio;

public class Main {

    public static void main(String[] args) {
        Adresse Dom =new Adresse( "3 rue du clocher", "Melun", 77000,"Kernighan");
        //Adresse Liv=new Adresse("2 rue du cimetière","Paris",75001,"Kernighan");
        Client c = new Client("Dijkstra", "Edsger",Dom);
        System.out.println(c.toString());


    }
}
