package models;

import java.util.ArrayList;

public class GestionGroupeEtudiant {
Groupe groupe;
GestionGroupe allGroup;
GestionEtudiant allEtudiants;
ArrayList<Etudiant> lesEtudiantGrp;
	
	public GestionGroupeEtudiant(Groupe grp,ArrayList<Etudiant> etud) {
		this.allGroup=new GestionGroupe();
		this.allEtudiants=new GestionEtudiant(etud);
		this.lesEtudiantGrp =grp.getEtudiantGroupe();
		this.groupe=grp;
	}
	
	public void add(int id) {
		 boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:allEtudiants.etudiants) {
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
						  lesEtudiantGrp.add(etud);
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
		  for(Etudiant ets:allEtudiants.etudiants) {
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
