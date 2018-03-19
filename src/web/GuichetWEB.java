package web;

import compte.Compte;
import compte.Implementation_du_Compte;

public class GuichetWEB {
    // Variables
    public Compte compte = new Implementation_du_Compte("007", "Antoine", "0687878787", "service Web");
    private double montantRetrait;
    private double montantDepot;

    public double getMontantRetrait() {
        return montantRetrait;
    }

    public void setMontantRetrait(double montant) {
        this.montantRetrait = montant;
    }

    public double getMontantDepot() {
        return montantDepot;
    }

    public void setMontantDepot(double montant) {
        this.montantDepot = montant;
    }

    // Constructeurs
    public GuichetWEB(Compte compte){
        this.compte = compte;
    }

    public GuichetWEB(){
    }

    // Methodes
    public void depot(double montant){
        compte.deposer(montant);
    }

    public void retirer(double montant){
        compte.retirer(montant);
    }

    public String getNom(){
        return compte.getNom();
    }

    public String getNumero(){
        return compte.getNumero();
    }

    public String getTelephone(){
        return compte.getNumeroTel();
    }

    public String getService(){
        return compte.getService();
    }

    public double getSolde(){
        return compte.getSolde();
    }
}
