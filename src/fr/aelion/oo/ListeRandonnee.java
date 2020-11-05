package fr.aelion.oo;

import java.util.ArrayList;

public class ListeRandonnee {
	private ArrayList<Randonnee> rSimples = new ArrayList<Randonnee>();
	private ArrayList<Randonnee> rCompliquees = new ArrayList<Randonnee>();
	
	public void ajouterRandonnee(Randonnee randonnee) {
		if (randonnee.getNiveauDifficulte() >= 4) {
			this.rCompliquees.add(randonnee);	
		} else {
			this.rSimples.add(randonnee);
		}
		
	}
	
	
	public String afficherListe() {
		String listeRando = "Liste des randonnées\n\n";
		
		// Boucler sur les valeurs contenues dans l'attribut randonnees
		for (Randonnee randonnee : this.rSimples) {
			// Concaténer les données avec la variable listeRando
			listeRando = listeRando + randonnee.getNom() + " (" + randonnee.getNbKilometres() + ")\n";
 		}
		
		// Boucler sur les valeurs contenues dans l'attribut randonnees
		for (Randonnee randonnee : this.rCompliquees) {
			// Concaténer les données avec la variable listeRando
			listeRando = listeRando + randonnee.getNom() + " (" + randonnee.getNbKilometres() + ")\n";
 		}
		
		return listeRando;
	}
}
