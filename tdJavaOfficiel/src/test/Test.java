package test;

import autreComposantView.*;
import controllers.ProjetController;
import models.*;
import views.ProjetView;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Créations de quelques étudiants 
		Etudiant e1 = new Etudiant(1,"0160","M","diop","moussa","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","1234567","diop@gmail.com","B");
		Etudiant e2 = new Etudiant(2,"0060","F","Sarr","Fatou","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","77453325","sarr@gmail.com","A");
		Etudiant e3 = new Etudiant(3,"5067","M","Diouf","Ousmane","Dakar plateau","22/12/2020","Guinée","Sénégalaise","Mariée","785256635","diop@gmail.com","B");
		
		//Ins des professeurs 
		Professeur mrDiop = new Professeur(1,"5065","M","Diop","Moussa","Dakar plateau","22/12/2020","Guinée","Guinéenne","Mariée","785256635","diop@gmail.com","Php");
	    Professeur mrBah = new Professeur(2,"5060","M","Sarr","Ousmane","Castor","22/12/2010","Sénégal","Sénégalaise","Mariée","785256635","ous@gmail.com","Java");
	    
	    //Création des groupes;
	    Groupe pr213=new Groupe("pr213",1);
	    Groupe pr214=new Groupe("pr214",2);
	    
	    //Instantiation des ArrayList
	    GestionEtudiant tabEtudiants= new GestionEtudiant();
	    GestionProfesseur tabProfs = new GestionProfesseur();
	    GestionGroupe tabGroupes = new GestionGroupe(); 
	    //insertion des données dans les ArrayList
	    
	    tabEtudiants.add(e1);
	    tabEtudiants.add(e2);
	    tabEtudiants.add(e3);
	    
	    tabProfs.add(mrDiop);
	    tabProfs.add(mrBah);
	    
	    tabGroupes.add(pr214);
	    tabGroupes.add(pr213);
	    
	    //Instantion du Controller
	    ProjetController controller = new ProjetController(new ProjetView(new MenuPrincipale()),tabProfs,tabEtudiants,tabGroupes);
	   // ProjetController controller = new ProjetController(new ProjetView(new MenuPrincipale()),new GestionProfesseur(),new GestionEtudiant(),new GestionGroupe());
	    controller.run();
	}

}
