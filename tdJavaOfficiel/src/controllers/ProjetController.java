package controllers;

import java.util.ArrayList;
import java.util.List;

import models.*;
import views.ProjetView;

public class ProjetController {
GestionEtudiant allEtudiant;
GestionProfesseur allProfs;
GestionGroupe allGroupes;
GestionGroupeEtudiant groupeEts;
Groupe groupe;
projetState state;
ProjetView view;

public int choix;
public int choixSousMenu;
public int choixState;

public enum projetState{
	Start,
	StartOption1,
	StartOption2,
	StartOption3,
	StartOption4,
	End
}

public ProjetController(ProjetView view,GestionProfesseur profs,GestionEtudiant ets,GestionGroupe groupe) {
	this.view=view;
	this.allEtudiant=ets;
	this.allProfs=profs;
	this.allGroupes=groupe;
	view.setController(this);
	state = projetState.Start;
}

public ProjetController(ProjetView view) {
	this.view=view;
	this.allEtudiant=new GestionEtudiant();
	this.allProfs=new GestionProfesseur();
	this.allGroupes=new GestionGroupe();
	view.setController(this);
	state = projetState.Start;
}

public void run() {
	while(true) {
		switch(state) {
		 case Start:view.promptForMenu();break;
		 case StartOption1:view.promptForMenuGroupe();view.promptForMenu();break;
		 case StartOption2:view.promptForMenuEtudiant();view.promptForMenu();break;
		  case StartOption3:view.promptForMenuProf();view.promptForMenu();break;
		  case StartOption4:view.promptForMenuGestionGrpEtd();view.promptForMenu();break;
		  case End:System.exit(0);break;
		  
		}
	}
}

public void showMenuView() {
	if(choix==1) {
		state=projetState.StartOption1;	
	}
	else if(choix==2) {
		state=projetState.StartOption2;	
	}
	else if(choix==3) {
		state=projetState.StartOption3;	
	}
	else if(choix==4) {
		state=projetState.StartOption4;	
	}
	else if(choix==5) {
		state=projetState.End;	
	}
	else {
		state=projetState.StartOption1;	
	}
	
}
//CONTROL POUR ETUDIANT
public void addEtudiant(Etudiant etudiant) {
	allEtudiant.add(etudiant);
}

public void deleteEtudiant(int id) {
	allEtudiant.delete(id);
}

public void showDetailEtudiant(int id) {
	allEtudiant.showDetail(id);
}
public void showAllEtudiant () {
	//allEtudiant.showAllEtudiant();
	allEtudiant.showAll();
}

public void updateEtudiant(int id) {
	allEtudiant.update(id);
}

public ArrayList<Etudiant> getListEtudiant(){
	return allEtudiant.getEtudiants();
}

//CONTROL POUR PROFESSEUR
public void addProf(Professeur grp) {
	allProfs.add(grp);
}

public void deleteProf(int id) {
	allProfs.delete(id);
}

public void showDetailProf(int id) {
	allProfs.showDetail(id);
}

public void showAllProf() {
	allProfs.showAll();
}

public void updateProf(int id) {
	allProfs.update(id);
}

//CONTROL POUR GROUPE
public void addGroupe(Groupe grp) {
	allGroupes.add(grp);
}

public void deleteGroupe(int id) {
	allGroupes.delete(id);
}

public void showDetailGroupe(int id) {
	allGroupes.showDetail(id);
}

public void showAllGroupe() {
	allGroupes.showAll();
}

public void updateGroupe(int id) {
	allGroupes.update(id);
}

//CONTROLE GESTIONgROUPEeTUDIANT
	public void addEtudiantToGroupe(int id) {
		groupeEts.add(id);
	}
	
public void newGestionGroupeEtudiant(int id) {
		if(allGroupes.verify(id)){
			//groupeEts.setGroupe();
			Groupe grp = new Groupe();
			grp = allGroupes.getGroupeById(id);
			GestionGroupeEtudiant gs = new GestionGroupeEtudiant(grp,allEtudiant.getEtudiants());
			groupeEts=gs;
		}
		//
	}

public void afficherEtudiantsGrp() {
	groupeEts.showAll();
}

public void setState(projetState state) {
	this.state = state;
}

public void deleteEtudiantfromGrp(int id) {
	groupeEts.delete(id);
}

}
