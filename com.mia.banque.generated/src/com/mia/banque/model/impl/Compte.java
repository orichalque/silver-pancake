package src.com.mia.banque.model.impl;
import java.util.ArrayList;
import java.util.List;

public class Compte implements src.com.mia.banque.model.ICompte {

			private String Numero;
		
		public String getNumero() {
			return this.Numero;
		}
		
		public void setNumero(String newValue) {
			this.Numero = newValue;
		}


	
	private List<src.com.mia.banque.model.IOperation> listOperation;

public List<src.com.mia.banque.model.IOperation> getOperations(){
if (this.listOperation == null) {
			this.listOperation = new ArrayList<src.com.mia.banque.model.IOperation>();
		}
		return this.listOperation;
}
public void setOperation(List<src.com.mia.banque.model.IOperation> newValue){
	this.listOperation = newValue;
}	
	
}

