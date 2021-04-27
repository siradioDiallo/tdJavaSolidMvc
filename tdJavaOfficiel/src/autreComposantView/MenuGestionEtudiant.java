package autreComposantView;

import interfaces.IMenuView;

public class MenuGestionEtudiant implements IMenuView{
	
	public void showMenu() {
		  System.out.println("1-Créer un Etudiant\n"+ 
		  		"2- Modifier un Etudiant\n" + 
		  		"3- Voir les détails d'un Etudiant\n" + 
		  		"4- Supprimer un Etudiant\n" + 
		  		"5- Afficher tous les Etudiants\n"+
		  		"6- Quitter");
	  }

}
