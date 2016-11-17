package src.com.mia.banque.model;
import java.util.List;

public interface IClient {
		public void setNom(String Nom);
	public String getNom();
	public void setPrenom(String Prenom);
	public String getPrenom();
	public void setAdresse(String Adresse);
	public String getAdresse();

	
	public List<ICompte> getComptes();
public void setCompte(List<ICompte> newValue);
}