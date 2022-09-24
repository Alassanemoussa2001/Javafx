package application;

public class Fournisseurs {
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	public Fournisseurs(String nom, String adresse, String telephone, String email) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNomDuFournisseur(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Fournisseurs [nom=" + nom + ", adresse=" + adresse + ", telephone="
				+ telephone + ", email=" + email + "]";
	}

}
