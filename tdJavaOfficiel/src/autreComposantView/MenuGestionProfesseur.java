package autreComposantView;

import interfaces.IMenuView;

public class MenuGestionProfesseur implements IMenuView{
	
	public void showMenu() {
		  System.out.println("1-Cr�er un Professeur\n"+ 
		  		"2- Modifier un Professeur\n" + 
		  		"3- Voir les d�tails d'un Professeur\n" + 
		  		"4- Supprimer un Professeur\n" + 
		  		"5- Afficher tous les Professeur\n"+
		  		"6- Quitter");
	  }

}
