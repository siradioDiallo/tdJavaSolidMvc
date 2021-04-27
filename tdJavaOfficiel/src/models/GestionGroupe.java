package models;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.IModification;

public class GestionGroupe implements IModification<Groupe>{
	ArrayList<Groupe> groupes;
	
	public GestionGroupe() {
		this.groupes = new ArrayList<Groupe>();
	}
	
	public void add(Groupe groupe) {
		groupes.add(groupe);
	}
	
	public void delete(int id) {
		 //Vérification de l'existance de l'étudiant et affichage
		  boolean existe=false;
		  Groupe grp = new Groupe();
		  for(Groupe groupe:groupes) {
		
		     if(groupe.getIdGroupe()==id ) {
			    grp=groupe;
				existe=true;
			  }
			}
		    if(existe) {
			  System.out.println("Le Groupe "+grp+" a été suprimé");
			  groupes.remove(groupes.indexOf(grp));
		    }
		    else {
			  System.out.println("Groupe indisponible !");
		    }  
		
	}
	
	public void update(int id) {
		//Vérification de l'existance de l'étudiant
		  boolean existe=false;
		  Groupe groupe = new Groupe();
		  for(Groupe grp:groupes) {
				
			     if(grp.getIdGroupe()==id) {
						  groupe=grp;
						  existe=true;
				  }
			     
				}
		  if(existe) {
			  Scanner sc = new Scanner(System.in);
			  
			  System.out.println("");
			  System.out.println("Entrer le nom du groupe:");
			  groupe.setNom(sc.nextLine());
				 //sc.nextLine();
		    }
		    else {
			  System.out.println("Groupe indisponible !");
			  
		    }  
	}
    
  public void showDetail(int id) {
	  //Vérification de l'existance de l'étudiant et affichage
	  boolean existe=false;
	  Groupe groupe = new Groupe();
	 
	  for(Groupe grp:groupes) {
	
	     if(grp.getIdGroupe()==id) {
	    	 groupe=grp;
			 existe=true;
		  }
	     
		}
	    if(existe) {
		  System.out.println(groupe.toString());
	    }
	    else {
		  System.out.println("Groupe indisponible !");
	    }  
  }

    public void showAll() {
    if(groupes.isEmpty()) {
    	System.out.println("Aucune donnée n'a été enregistré");
    }
    else 
    {System.out.println("Les Groupes dans l'écoles sont:");
    	for(Groupe grp:groupes) {
       	 System.out.println(grp.toString());
   		}
   	}
 
  }
     
  public boolean verify(int id) {
	//Vérification de l'existance de l'étudiant et affichage
	  boolean existe=false;
	  Groupe groupe = new Groupe();
	 
	  for(Groupe grp:groupes) {
	
	     if(grp.getIdGroupe()==id) {
	    	 groupe=grp;
			 existe=true;
		  }
	     
		}
	    if(existe) {
		  System.out.println(groupe.toString());
	    }
	    else {
		  System.out.println("Groupe indisponible !");
		  existe =false;
		  
	    }  
	    return existe;
  }
    public Groupe getGroupeById(int id) {
    	Groupe groupe = new Groupe();
   	 
  	  for(Groupe grp:groupes) {
  	
  	     if(grp.getIdGroupe()==id) {
  	    	 groupe=grp;
  		  }
  		}
  	  return groupe;
    }
 }

