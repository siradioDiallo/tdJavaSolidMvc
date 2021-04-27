package autreComposantView;

import interfaces.IMenuView;

public class MenuPrincipale implements IMenuView{
	@Override
  public void showMenu() {
	  System.out.println("1- Gestion Groupe\n"+ 
	  		"2- Gestion Etudiant\n" + 
	  		"3- Gestion Professeurs\n" + 
	  		"4- Gestion GroupeEtudiant\n" + 
	  		"5- Quitter");
  }
}
