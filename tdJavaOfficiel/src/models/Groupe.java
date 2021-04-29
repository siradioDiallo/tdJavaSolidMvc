package models;

import java.util.ArrayList;

public class Groupe {

private String nom;
private int idGroupe;
ArrayList<Etudiant> etudiantGroupe;

public Groupe() {
	etudiantGroupe=new ArrayList<Etudiant>();
}
	public Groupe(String nom,int id) {
		this.etudiantGroupe=new ArrayList<Etudiant>();
		this.nom = nom;
		this.idGroupe=id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Etudiant> getEtudiantGroupe() {
		return etudiantGroupe;
	}
	public void setEtudiantGroupe(ArrayList<Etudiant> etudiantGroupe) {
		this.etudiantGroupe = etudiantGroupe;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	
	
	public void addEtud(Etudiant e) {
		this.etudiantGroupe.add(e);
	}
	
	
	@Override
	public String toString() {
		return "nom=" + nom + ", idGroupe=" + idGroupe;
	}
	
	public void afficher() {
		System.out.println("Nom du Groupe=" + nom + " ID:" + idGroupe);
		for(Etudiant ets:etudiantGroupe) {
			System.out.println("Nom:"+ets.getNom()+" Prenom:"+ets.getPrenom()+" matricule:"+ets.getMatricule());
		}
	}
	
}
