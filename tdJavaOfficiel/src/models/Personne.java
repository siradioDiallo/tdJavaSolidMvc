package models;


public abstract class Personne {

		private int id;
		private String matricule;
		private String genre;
		private String nom;
		private String prenom;
		private String adresse;
		private String dateDeNaissance;
		private String lieuDeNaissance;
		private String nationalite;
		private String situationMatri;
		private String tel;
		private String email;

		public Personne(int id, String matricule, String genre, String nom, String prenom, String adresse,
				String dateDeNaissance, String lieuDeNaissance, String nationalite, String situationMatri, String tel,
				String email) {
			this.id = id;
			this.matricule = matricule;
			this.genre = genre;
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.dateDeNaissance = dateDeNaissance;
			this.lieuDeNaissance = lieuDeNaissance;
			this.nationalite = nationalite;
			this.situationMatri = situationMatri;
			this.tel = tel;
			this.email = email;
		}
		public Personne() {}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMatricule() {
			return matricule;
		}
		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getDateDeNaissance() {
			return dateDeNaissance;
		}
		public void setDateDeNaissance(String dateDeNaissance) {
			this.dateDeNaissance = dateDeNaissance;
		}
		public String getLieuDeNaissance() {
			return lieuDeNaissance;
		}
		public void setLieuDeNaissance(String lieuDeNaissance) {
			this.lieuDeNaissance = lieuDeNaissance;
		}
		public String getNationalite() {
			return nationalite;
		}
		public void setNationalite(String nationalite) {
			this.nationalite = nationalite;
		}
		public String getSituationMatri() {
			return situationMatri;
		}
		public void setSituationMatri(String situationMatri) {
			this.situationMatri = situationMatri;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public String toString() {
			return "id:" + id + " matricule:" + matricule + " genre=" + genre + " nom=" + nom + " prenom:"
					+ prenom + "\n adresse:" + adresse + " dateDeNaissance:" + dateDeNaissance + " lieuDeNaissance:"
					+ lieuDeNaissance + "\n nationalite:" + nationalite + " situationMatri:" + situationMatri + " tel=" + tel
					+ " email=" + email+" ";
		}

}
