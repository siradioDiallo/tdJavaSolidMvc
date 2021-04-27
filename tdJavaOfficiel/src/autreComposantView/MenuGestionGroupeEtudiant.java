package autreComposantView;

import interfaces.IMenuView;

public class MenuGestionGroupeEtudiant implements IMenuView {
 
	public void showMenu() {
	System.out.println("1-Ajouter un Etudiant au Groupe\n"+ 
		  		"2- Supprimer un Etudiant du Groupe\n" + 
		  		"3- Afficher tous les Etudiants du Groupe\n"+
		  		"4- Quitter");
	 
 }
}
