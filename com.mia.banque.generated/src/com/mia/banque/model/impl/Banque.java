package src.com.mia.banque.model.impl;
import java.util.ArrayList;
import java.util.List;

public class Banque implements src.com.mia.banque.model.IBanque {

	
	
	private List<src.com.mia.banque.model.IClient> listClient;

public List<src.com.mia.banque.model.IClient> getClients(){
if (this.listClient == null) {
			this.listClient = new ArrayList<src.com.mia.banque.model.IClient>();
		}
		return this.listClient;
}
public void setClient(List<src.com.mia.banque.model.IClient> newValue){
	this.listClient = newValue;
}	
	
}

