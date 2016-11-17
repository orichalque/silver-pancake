package src.com.mia.banque.model;
import java.util.List;

public interface ICompte {
		public void setNumero(String Numero);
	public String getNumero();

	
	public List<IOperation> getOperations();
public void setOperation(List<IOperation> newValue);
}