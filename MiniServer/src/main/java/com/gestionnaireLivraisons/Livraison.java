package com.gestionnaireLivraisons;

import java.util.ArrayList;

/**
 * La classe qui modélise une livraison.
 */
public class Livraison
        // TODO : À compléter/modifier
{
    // Les données membres statiques
    final private int MAX_TENTATIVES = 3;

    // Les attributs d'instance
    // TODO : À compléter/modifier
    private int id;
    private Priorite priorite;
    private int tentative;
    private int lot;
    private Statut statut;
    private static int idSequentiel = 0;


    /**
     * Constructeur d'une livraison.
     *
     * @param priorite La priorité de la nouvelle livraison.
     * @param lot      Le lot auquel cette livraison appartient.
     */
    // TODO : À compléter/modifier
    public Livraison(Priorite priorite, int lot){
        this.priorite = priorite;
        this.lot = lot;
        this.id = prochainID();
        this.tentative = 0;
        this.statut = Statut.EN_ATTENTE;
    }

    /**
     * Produit un nouvel ID pour la Livraison
     */
    private static int prochainID() {
        // TODO : À compléter/modifier
        idSequentiel++;
        return idSequentiel;
    }

    /**
     * Retourne l'identifiant de cette livraison.
     *
     * @return L'id de cette livraison.
     */
    public int getId() {
        // TODO : À compléter/modifier
        System.err.println("Méthode Livraison::getId non implémentée");
        return 0;
    }

    /**
     * Retourne la priorité de cette livraison.
     *
     * @return La priorite de cette livraison.
     */
    // TODO : À compléter/modifier

    /**
     * Retourne la tentative pour cette livraison.
     *
     * @return La tentative de cette livraison.
     */
    public int getTentative() {
        // TODO : À compléter/modifier
        System.err.println("Méthode Livraison::getTentative non implémentée");
        return 0;
    }

    /**
     * Retourne le lot auquel appartient cette livraison.
     *
     * @return Le lot de cette livraison.
     */
    public int getLot() {
        // TODO : À compléter/modifier
        System.err.println("Méthode Livraison::getLot non implémentée");
        return 0;
    }

    /**
     * Mutateur pour le statut de la livraison.
     *
     */
    public void setStatut(Statut statut) {
        // TODO : À compléter/modifier
        System.err.println("Méthode Livraison::setStatut non implémentée");
    }

    /**
     * Ajoute UN au numéro de tentative pour cette livraison.
     *
     */
    public void nouvelleTentative() {
        // TODO : À compléter/modifier
        this.tentative++;
    }

    /**
     * Vérifie s'il reste des tentatives ou non pour cette livraison.
     *
     * @return true s'il reste des tentatives, false sinon.
     */
    public boolean resteTentatives() {
        // TODO : À compléter/modifier
        return this.tentative < MAX_TENTATIVES;
    }


    /**
     * Construit et retourne une chaîne de caractères équivalente à cette livraison.
     *
     * @return String La chaîne qui représente cette livraison.
     */
    @Override
    public String toString() {
        // TODO : À compléter/modifier
        return "Livraison N°" + this.id + "\n" +
                "Priorité : " + this.priorite + "\n" +
                "Status : " + this.statut + "\n" +
                "Nombre de tentatives : " + this.tentative + "\n" +
                "Numéro de lot : " + this.lot + "\n";
    }

    /**
     * Compare cette livraison avec une autre livraison.
     *
     * @param autreLivraison La seconde livraison à comparer avec cette livraison.
     * @return Le résultat de la comparaison au sens de l'interface Comparable<T>.
     */
    // TODO : À compléter/modifier
}
