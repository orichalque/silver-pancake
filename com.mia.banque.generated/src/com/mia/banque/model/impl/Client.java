package src.com.mia.banque.model.impl;
import java.util.ArrayList;
import java.util.List;

public class Client implements src.com.mia.banque.model.IClient {

			private String Nom;
		
		public String getNom() {
			return this.Nom;
		}
		
		public void setNom(String newValue) {
			this.Nom = newValue;
		}

		private String Prenom;
		
		public String getPrenom() {
			return this.Prenom;
		}
		
		public void setPrenom(String newValue) {
			this.Prenom = newValue;
		}

		private String Adresse;
		
		public String getAdresse() {
			return this.Adresse;
		}
		
		public void setAdresse(String newValue) {
			this.Adresse = newValue;
		}


	
	private List<src.com.mia.banque.model.ICompte> listCompte;

public List<src.com.mia.banque.model.ICompte> getComptes(){
if (this.listCompte == null) {
			this.listCompte = new ArrayList<src.com.mia.banque.model.ICompte>();
		}
		return this.listCompte;
}
public void setCompte(List<src.com.mia.banque.model.ICompte> newValue){
	this.listCompte = newValue;
}	
	
}

