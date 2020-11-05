package fr.aelion.oo;

public class Randonneur {

	/**
	 * @property String nom
	 * 	Définit le nom des Randonneurs de l'application
	 */
	private String nom;
	
	/**
	 * @property int age
	 * 	Définit l'âge des randonneurs de l'application
	 */
	private int age;

	/**
	 * @property booleen famille
	 * 	Définit si le randonneur est en famille de l'application
	 */
	private boolean famille;
	
    public void setAge(int age) {
    	if (age >= 0 && age <= 110) {
    		this.age = age; // this fait référence à l'instance courante de la classe
    	} else {
    		System.out.println("L'âge " + age + " n'est pas autorisé");
    	}
    }

	public void setNom(String nom) {
		this.nom = nom;
	}
    public String getNom() {return this.nom;}

	public void setFamille(boolean famille) {
		this.famille = famille;
	}
    public boolean getFamille() {return this.famille;}
}
