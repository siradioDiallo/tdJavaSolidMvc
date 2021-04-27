package models;

import java.util.ArrayList;
import java.util.Scanner;
import interfaces.IModification;

public class GestionProfesseur implements IModification<Professeur>{
ArrayList<Professeur> professeurs;

	public GestionProfesseur(){
		this.professeurs=new ArrayList<>();
	}
	
	public void add(Professeur toAdd) {
		professeurs.add(toAdd);
	}
	
	public void delete(int id) {
		//Vérification de l'existance de l'étudiant et affichage
		  boolean existe=false;
		  Professeur etud = new Professeur();
		  for(Professeur ets:professeurs) {
				
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
				  }
			     
				}
		  if(existe) {
			  System.out.println("Mr "+etud.getNom()+" "+etud.getPrenom()+" a été suprimé");
			  professeurs.remove(professeurs.indexOf(etud));
		    }
		    else {
			  System.out.println("Professeur indisponible !");
		    }  
	}
	
	public void update(int id) {
	Scanner sc = new Scanner(System.in);
		 //Vérification de l'existance de l'étudiant
		  boolean existe=false;
		  Professeur etud = new Professeur();
		  for(Professeur ets:professeurs) {
				
			     if(ets.getId()==id) {
						  etud=ets;
						  existe=true;
						  
				  }
			     
				}
		  if(existe) {
			  System.out.println("");
			  System.out.println("Entrer le nom du professeur:");
			  etud.setNom(sc.nextLine());
				 //sc.nextLine();
				 System.out.println("Entrer le Prénom du professeur:");
				 etud.setPrenom(sc.nextLine());
				 System.out.println("Entrer le matricule du professeur:");
				 etud.setMatricule(sc.nextLine());
				 System.out.println("Entrer le genre du professeur:");
				 etud.setGenre(sc.nextLine());
				 System.out.println("Entrer l'adresse du professeur:");
				 etud.setAdresse(sc.nextLine());
				 System.out.println("Entrer la date de naissance du professeur:");
				 etud.setDateDeNaissance(sc.nextLine());
				 System.out.println("Entrer le lieu de naissance du professeur:");
				 etud.setLieuDeNaissance(sc.nextLine());
				 System.out.println("Entrer la nationalité du professeur:");
				 etud.setNationalite(sc.nextLine());
				 System.out.println("Entrer la situation matrimoniale du professeur:");
				 etud.setSituationMatri(sc.nextLine());
				 System.out.println("Entrer le numéro du professeur:");
				 etud.setTel(sc.nextLine());
				 System.out.println("Entrer l'email du professeur:");
				 etud.setEmail(sc.nextLine());
				 System.out.println("Entrer la spécialité du professeur:");
				 etud.setSpeciality(sc.nextLine());
		    }
		    else {
			  System.out.println("Professeur indisponible !");
			  
		    }  
		
	}
	
	public void showDetail(int id) {
		 boolean existe=false;
		  Professeur etud = new Professeur();
		 
		  for(Professeur ets:professeurs) {
		
		     if(ets.getId()==id) {
					  etud=ets;
					  existe=true;
			  }
		     
			}
		    if(existe) {
			  System.out.println(etud.toString());
		    }
		    else {
			  System.out.println("Professeur indisponible !");
		    }  
	}
	
	public void showAll() {
		if(professeurs.isEmpty()) {
	    	System.out.println("Aucune donnée n'a été enregistré");
	    }
	    else 
	    {
	    	
	    	for(Professeur ets:professeurs) {
	       	 System.out.println("Nom:"+ets.getNom()+" Prénom:"+ets.getPrenom()+" Matricule:"+ets.getMatricule()+" ID:"+ets.getId());
	   		}
	   	}
	}


}
