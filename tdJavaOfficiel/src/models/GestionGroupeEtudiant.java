package models;

import java.util.ArrayList;

import interfaces.IGestionGE;

public class GestionGroupeEtudiant implements IGestionGE{
Groupe groupe;
GestionGroupe allGroup;
GestionEtudiant gestionEtudiant;
ArrayList<Etudiant> lesEtudiantGrp;
ArrayList<Etudiant> allEtudiants;
	
	public GestionGroupeEtudiant(Groupe grp,ArrayList<Etudiant> ets) {
		allGroup=new GestionGroupe();
		allEtudiants=ets;
		lesEtudiantGrp =grp.etudiantGroupe;
		groupe=grp;
	}
	
	public void add(int id) {
		 boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:allEtudiants) {
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
						  groupe.etudiantGroupe.add(etud);
				  }
			     
				}
		  if(existe) {
			  System.out.println("L'étudiant "+etud.getPrenom()+" "+etud.getNom()+" a été Ajouter au Groupe");
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
		    }  
	}
	
	public void delete(int id) {
		boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:allEtudiants) {
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
						  lesEtudiantGrp.remove(lesEtudiantGrp.indexOf(etud));
				  }
			     
				}
		  if(existe) {
			  System.out.println("L'étudiant "+etud.getPrenom()+" "+etud.getNom()+" a été suprimé au Groupe");
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
		    }  
		//group.remove(grp);
	}
	
	public void showAll() {
		for(Etudiant ets:lesEtudiantGrp) {
			System.out.println(ets.toString());
		}
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
     
	public Groupe getGroupe() {
		return this.groupe;
	}
     
}
