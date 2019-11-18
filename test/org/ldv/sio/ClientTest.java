package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClientTest {

  private Client c;
  private Adresse livraison;
  private ArrayList<Adresse>adresselivraison;
  private AdresseEtendue adresseEtendue;

  @Before
  public void initializeEachTest() {
    this.c = new Client("Dijkstra", "Edsger");
    this.adresseEtendue=new AdresseEtendue("catinaud.florian@gmail.com","catinaud_florian.com");
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }

  @Test
  public void AdrLivraison(){
    assertEquals(livraison,this.c.getLivraison());
  }

  @Test
  public void AdrHabitationLivraison(){
    assertEquals(this.c.getHabitation(),this.c.getLivraison());
  }

  @Test
  public void GetUrl(){
    assertEquals("catinaud_florian.com",this.adresseEtendue.getUrl());
  }

  @Test
  public void GetEmail(){
    assertEquals("catinaud.florian@gmail.com",this.adresseEtendue.getEmail());
  }
}