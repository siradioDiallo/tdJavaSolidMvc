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
		//V�rification de l'existance de l'�tudiant
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
			  System.out.println("Entrer le nom de l'�tudiant:");
			  etud.setNom(sc.nextLine());
				 //sc.nextLine();
				 System.out.println("Entrer le Pr�nom de L'�tudiant:");
				 etud.setPrenom(sc.nextLine());
				 System.out.println("Entrer le matricule de L'�tudiant:");
				 etud.setMatricule(sc.nextLine());
				 System.out.println("Entrer le genre de L'�tudiant:");
				 etud.setGenre(sc.nextLine());
				 System.out.println("Entrer l'adresse de L'�tudiant:");
				 etud.setAdresse(sc.nextLine());
				 System.out.println("Entrer la date de L'�tudiant:");
				 etud.setDateDeNaissance(sc.nextLine());
				 System.out.println("Entrer le lieu de naissance de L'�tudiant:");
				 etud.setLieuDeNaissance(sc.nextLine());
				 System.out.println("Entrer la nationalit� de L'�tudiant:");
				 etud.setNationalite(sc.nextLine());
				 System.out.println("Entrer la situation matrimoniale de L'�tudiant:");
				 etud.setSituationMatri(sc.nextLine());
				 System.out.println("Entrer le num�ro de L'�tudiant:");
				 etud.setTel(sc.nextLine());
				 System.out.println("Entrer l'email de L'�tudiant:");
				 etud.setEmail(sc.nextLine());
				 System.out.println("Entrer le groupe sanguin de L'�tudiant:");
				 etud.setGroupeSanguin(sc.nextLine());
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
			  
		    }  
	}

	/*
	public int getById(Etudiant e) {
		//V�rification de l'existance de l'�tudiant
		  boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:etudiants) {
				
			     if(ets.getId()==e.getId()) {
						  etud=ets;
						  existe=true;
				  }
			     
				}
		  if(existe) {
			  System.out.println("L'�tudiant "+e.getPrenom()+" "+e.getNationalite()+" a �t� suprim�");
			  return e.getId();
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
			  return 0;
		    }  
		  }
	}*/
	
	public void delete(int id) {
		 //V�rification de l'existance de l'�tudiant et affichage
		  boolean existe=false;
		  Etudiant etud = new Etudiant();
		  for(Etudiant ets:etudiants) {
				
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
				  }
			     
				}
		  if(existe) {
			  System.out.println("L'�tudiant "+etud.getPrenom()+" "+etud.getNom()+" a �t� suprim�");
			  etudiants.remove(etudiants.indexOf(etud));
		    }
		    else {
			  System.out.println("Etudiant indisponible !");
		    }  
	}
    
  public void showDetail(int id) {
	  //V�rification de l'existance de l'�tudiant et affichage
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
    	System.out.println("Aucune donn�e n'a �t� enregistr�");
    }
    else 
    {
    	
    	for(Etudiant ets:etudiants) {
       	 System.out.println("Nom:"+ets.getNom()+" Pr�nom:"+ets.getPrenom()+" Matricule:"+ets.getMatricule());
   		}
   	}
 
  }

	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}

    
    
    
}
