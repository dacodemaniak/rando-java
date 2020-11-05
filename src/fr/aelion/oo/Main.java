package fr.aelion.oo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Randonneur jeanlouis = new Randonneur();
		jeanlouis.setNom("Jean-Louis");
		jeanlouis.setAge(50);
		jeanlouis.setFamille(true);
		
		Randonneur jeanluc = new Randonneur();
		jeanluc.setNom("Jean-Luc");
		jeanluc.setAge(52);
		jeanluc.setFamille(false);
		
		System.out.println("Bonjour " + jeanlouis.getNom());
		System.out.println("Hello " + jeanluc.getNom());
		
		// Créer une randonnée
		Randonnee rando1 = new Randonnee();
		rando1.setNom("PR20");
		rando1.setNbKilometres(20);
		rando1.setNiveauDifficulte(5);
		rando1.setAgeMini(15);
		rando1.setAgeMaxi(77);
	
		// Créer une randonnée
		Randonnee rando2 = new Randonnee();
		rando2.setNom("PR21");
		rando2.setNbKilometres(21);
		rando2.setNiveauDifficulte(3);
		rando2.setAgeMini(10);
		rando2.setAgeMaxi(85);
		
		// D'abord, créer une instance de la classe ListeRandonnee
		ListeRandonnee liste = new ListeRandonnee();
		liste.ajouterRandonnee(rando1);
		liste.ajouterRandonnee(rando2);
		System.out.println(liste.afficherListe());
	}

}
