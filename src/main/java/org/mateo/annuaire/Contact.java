package org.mateo.annuaire;

public class Contact {
    final private int id;
    private String prenom;
    private String nom;
    private String numeroTelephone;
    static private int compteur = 0;

    public Contact(String prenom, String nom, String numeroTelephone) { 
        this.id = compteur++;
        this.prenom = prenom;
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " : " + numeroTelephone;
    }
}
