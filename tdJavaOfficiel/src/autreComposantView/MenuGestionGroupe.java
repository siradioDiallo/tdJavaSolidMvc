package autreComposantView;

import interfaces.IMenuView;

public class MenuGestionGroupe implements IMenuView{

	public void showMenu() {
		  System.out.println("1-Cr�er un Groupe\n"+ 
		  		"2- Modifier un Groupe\n" + 
		  		"3- Voir les d�tails d'un Groupe\n" + 
		  		"4- Supprimer un groupe\n" + 
		  		"5- Afficher tous les groupes\n"+
		  		"6- Quitter");
	  }
}
