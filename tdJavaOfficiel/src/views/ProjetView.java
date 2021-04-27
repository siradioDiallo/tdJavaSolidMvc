package views;

import java.util.Scanner;

import autreComposantView.*;
import controllers.ProjetController;
import interfaces.IMenuView;
import models.*;

public class ProjetView {
IMenuView view;
ProjetController controller;
static int id=0;

Scanner sc = new Scanner(System.in);

public ProjetView(IMenuView view) {
	this.view=view;
}
public void setView(IMenuView view) {
	this.view=view;
}

public void setController(ProjetController controller) {
	this.controller=controller;
}

public void promptForMenu() {
	view.showMenu();
	System.out.println("votre Choix:");
	controller.choix=sc.nextInt();
	controller.showMenuView(); 
}

public void promptForMenuGroupe() {
	boolean continuer=true;
	do{	 
		//System.out.println();	
	this.view= new MenuGestionGroupe();
	view.showMenu();
	System.out.println("votre Choix:");
	int choixSousMenu = sc.nextInt();
	switch(choixSousMenu) {
	 case 1:
		 sc.nextLine();
		   System.out.println("Entrer le nom du groupe:");
		   String nomgrp=sc.nextLine();
		   System.out.println("Entrer l'ID du groupe:");
		   int idgrp=sc.nextInt();
		   controller.addGroupe(new Groupe(nomgrp,idgrp));
	       break;
	 case 2: 
		 System.out.println("Entrer l'ID du groupe � modifier:");
	    int idToUpdate=sc.nextInt();
	    controller.updateGroupe(idToUpdate);
	    sc.nextLine();
	    break;
	   //Groupe grp=new Groupe(nomgrp,idgrp);break;
	 case 3:
		 System.out.println("Entrer l'ID du groupe � afficher:");
	     controller.showDetailGroupe(sc.nextInt());
	     break;
	 case 4: 
		 System.out.println("Entrer l'ID du groupe � supprimer:");
		 controller.deleteGroupe(sc.nextInt());
		 break;
	 case 5:
		 controller.showAllGroupe();
		 break;
	 case 6:continuer=false;break;
	 default: System.out.println("Erreur de choix !");
	}
	}
	while(continuer);//end boucle while
	this.view=new MenuPrincipale();
}

public void promptForMenuEtudiant() {
	boolean continuer = true;
	do{	 
		System.out.println();	
	this.view= new MenuGestionEtudiant();
	view.showMenu();
	System.out.println("votre Choix:");
	int choixSousMenu = sc.nextInt();
	
	switch(choixSousMenu) {
	 case 1:
		 sc.nextLine();
		 System.out.println("Entrer le nom de l'�tudiant:");
		 String nom=sc.nextLine();
		 System.out.println("Entrer le Pr�nom de "+nom);
		 String prenom=sc.nextLine();
		 System.out.println("Entrer le maticule de "+nom);
		 String matricule=sc.nextLine();
		 System.out.println("Entrer le genre de "+nom);
		 String genre=sc.nextLine();
		 System.out.println("Entrer l'adresse de "+nom);
		 String adresse=sc.nextLine();
		 System.out.println("Entrer la date de naissance de "+nom);
		 String dateDeNaissance=sc.nextLine();
		 System.out.println("Entrer le lieu de naissance de "+nom);
		 String lieuDeNaissance=sc.nextLine();
		 System.out.println("Entrer la nationalit� de "+nom);
		 String nationalite=sc.nextLine();
		 System.out.println("Entrer la situation matrimoniale "+nom);
		 String situationMatri=sc.nextLine();
		 System.out.println("Entrer le num�ro "+nom);
		 String tel=sc.nextLine();
		 System.out.println("Entrer l'email "+nom);
		 String email=sc.nextLine();
		 System.out.println("Entrer le groupe sanguin "+nom);
		 String groupeSanguin = sc.nextLine();
	
		 //cr�ation de l'�tudiant
		 Etudiant nouvelEtudiant = new Etudiant(id++,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
				  tel,email,groupeSanguin);
		 //Ajout de l'�tudiant dans AllEtudiant
		 controller.addEtudiant(nouvelEtudiant);
		 break;
		 
	 case 2:
		 System.out.println("Entrer l'Id de L'�tudiant � Modifier:");
		 int idUpdate=sc.nextInt();
		 sc.nextLine();
		 controller.updateEtudiant(idUpdate); break;
	 case 3:
		 System.out.println("Entrer l'ID de l'�tudiant:");
		 int idEtudiant1=sc.nextInt();
		 controller.showDetailEtudiant(idEtudiant1); break;
	 case 4:
		 System.out.println("Entrer l'ID de l'Etudiant:");
		 int id=sc.nextInt();
		  controller.deleteEtudiant(id); break;
	 case 5:controller.showAllEtudiant();break;
	 case 6:continuer=false;break;
	 default: System.out.println("Erreur de choix !");
	}
	System.out.println("");
  }while(continuer);//end boucle while
	this.view=new MenuPrincipale();
	
}

public void promptForMenuProf() {
	boolean continuer=true;
	do{	 
	System.out.println();	
	this.view= new MenuGestionProfesseur();
	view.showMenu();
	System.out.println("votre Choix:");
	int choixSousMenu = sc.nextInt();
	switch(choixSousMenu) {
	 case 1:
		 sc.nextLine();
		 System.out.println("Entrer le nom du prof�sseur:");
		 String nom=sc.nextLine();
		 System.out.println("Entrer le Pr�nom de "+nom);
		 String prenom=sc.nextLine();
		 System.out.println("Entrer le maticule de "+nom);
		 String matricule=sc.nextLine();
		 System.out.println("Entrer le genre de "+nom);
		 String genre=sc.nextLine();
		 System.out.println("Entrer l'adresse de "+nom);
		 String adresse=sc.nextLine();
		 System.out.println("Entrer la date de naissance de "+nom);
		 String dateDeNaissance=sc.nextLine();
		 System.out.println("Entrer le lieu de naissance de "+nom);
		 String lieuDeNaissance=sc.nextLine();
		 System.out.println("Entrer la nationalit� de "+nom);
		 String nationalite=sc.nextLine();
		 System.out.println("Entrer la situation matrimoniale "+nom);
		 String situationMatri=sc.nextLine();
		 System.out.println("Entrer le num�ro "+nom);
		 String tel=sc.nextLine();
		 System.out.println("Entrer l'email "+nom);
		 String email=sc.nextLine();
		 System.out.println("Entrer la sp�cialit� de "+nom);
		 String speciality = sc.nextLine();
	
		 //cr�ation de l'�tudiant
		 Professeur nouvelProf = new Professeur(id++,matricule,genre,nom,prenom,adresse,dateDeNaissance,lieuDeNaissance,nationalite,situationMatri,
				  tel,email,speciality);
		 //Ajout de l'�tudiant dans AllEtudiant
		 controller.addProf(nouvelProf);break;
	 case 2:
		 System.out.println("Entrer l'Id du professeur � Modifier:");
		 int idUpdate=sc.nextInt();
		 sc.nextLine();
		 controller.updateProf(idUpdate); break;
	 case 3:
		 System.out.println("Entrer l'ID du Professeur:");
		 int idEtudiant1=sc.nextInt();
		 controller.showDetailProf(idEtudiant1); break;
	 case 4:
		 System.out.println("Entrer l'ID de l'Etudiant:");
		 int id=sc.nextInt();
		  controller.deleteProf(id); break;
	 case 5:controller.showAllProf();break;
	 case 6:continuer=false;break;
	 default: System.out.println("Erreur de choix !");
	}
	System.out.println("");
	
    }while(continuer);//end boucle while
	this.view=new MenuPrincipale();
}


public void promptForMenuGestionGrpEtd() {
	boolean continuer=true;
	System.out.println();	
	System.out.println("Entrer l'Id du groupe:");
	int idGrp = sc.nextInt();
	do{	 
		controller.newGestionGroupeEtudiant(idGrp);
		this.view= new MenuGestionGroupeEtudiant();
		view.showMenu();
		System.out.println("votre Choix:");
		int choixSousMenu = sc.nextInt();
		switch(choixSousMenu) {
		case 1: 
			System.out.println("Entrer l'id de l'�tudiant:");
			int idEt = sc.nextInt();
			controller.addEtudiantToGroupe(idEt);
			break;
		case 2:
			System.out.println("Entrer l'id de l'�tudiant:");
		   int idToDel = sc.nextInt();controller.deleteEtudiantfromGrp(idToDel);
		   break;
		case 3:controller.afficherEtudiantsGrp(); break;
		case 4:continuer=false;break;
		}
	System.out.println("");
	
    }
	while(continuer);//end boucle while
	this.view=new MenuPrincipale();
}

}
