package models;

import java.util.ArrayList;

import interfaces.IModification;
import java.util.Scanner;

public class GestionEtudiant implements IModification<Etudiant>{
	
	ArrayList<Etudiant> etudiants;
	
	Scanner sc = new Scanner(System.in);
	
	public GestionEtudiant() {
	 etudiants = new ArrayList<Etudiant>();
		
	}
	
	public GestionEtudiant(ArrayList<Etudiant> ets) {
		this.etudiants=ets;
	}
	
	
	public void add(Etudiant etudiant) {
		etudiants.add(etudiant);
	}
	public void update(int id) {
		//Vérification de l'existance de l'étudiant
		  boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:etudiants) {
				
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
						  
				  }
			     
				}
		  if(existe) {
			  System.out.println("");
			  System.out.println("Entrer le nom de l'étudiant:");
			  etud.setNom(sc.nextLine());
				 //sc.nextLine();
				 System.out.println("Entrer le Prénom de L'étudiant:");
				 etud.setPrenom(sc.nextLine());
				 System.out.println("Entrer le matricule de L'étudiant:");
				 etud.setMatricule(sc.nextLine());
				 System.out.println("Entrer le genre de L'étudiant:");
				 etud.setGenre(sc.nextLine());
				 System.out.println("Entrer l'adresse de L'étudiant:");
				 etud.setAdresse(sc.nextLine());
				 System.out.println("Entrer la date de L'étudiant:");
				 etud.setDateDeNaissance(sc.nextLine());
				 System.out.println("Entrer le lieu de naissance de L'étudiant:");
				 etud.setLieuDeNaissance(sc.nextLine());
				 System.out.println("Entrer la nationalité de L'étudiant:");
				 etud.setNationalite(sc.nextLine());
				 System.out.println("Entrer la situation matrimoniale de L'étudiant:");
				 etud.setSituationMatri(sc.nextLine());
				 System.out.println("Entrer le numéro de L'étudiant:");
				 etud.setTel(sc.nextLine());
				 System.out.println("Entrer l'email de L'étudiant:");
				 etud.setEmail(sc.nextLine());
				 System.out.println("Entrer le groupe sanguin de L'étudiant:");
				 etud.setGroupeSanguin(sc.nextLine());
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
			  
		    }  
	}

	/*
	public int getById(Etudiant e) {
		//Vérification de l'existance de l'étudiant
		  boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:etudiants) {
				
			     if(ets.getId()==e.getId()) {
						  etud=ets;
						  existe=true;
				  }
			     
				}
		  if(existe) {
			  System.out.println("L'étudiant "+e.getPrenom()+" "+e.getNationalite()+" a été suprimé");
			  return e.getId();
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
			  return 0;
		    }  
		  }
	}*/
	
	public void delete(int id) {
		 //Vérification de l'existance de l'étudiant et affichage
		  boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:etudiants) {
				
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
				  }
			     
				}
		  if(existe) {
			  System.out.println("L'étudiant "+etud.getPrenom()+" "+etud.getNom()+" a été suprimé");
			  etudiants.remove(etudiants.indexOf(etud));
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
		    }  
	}
    
  public void showDetail(int id) {
	  //Vérification de l'existance de l'étudiant et affichage
	  boolean existe=false;
	  Etudiant etud = new Etudiant();
	 
	  for(Etudiant ets:etudiants) {
	
	     if(ets.getId()==id) {
				  etud=ets;
				  existe=true;
		  }
	     
		}
	    if(existe) {
		  System.out.println(etud.toString());
	    }
	    else {
		  System.out.println("Etudiant insponible !");
	    }  
  }

    public void showAll() {
    if(etudiants.isEmpty()) {
    	System.out.println("Aucune donnée n'a été enregistré");
    }
    else 
    {
    	
    	for(Etudiant ets:etudiants) {
       	 System.out.println("Nom:"+ets.getNom()+" Prénom:"+ets.getPrenom()+" Matricule:"+ets.getMatricule());
   		}
   	}
 
  }

	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}

    
    
    
}
