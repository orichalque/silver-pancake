package src.com.mia.banque.ui.controller.swt;
import src.com.mia.banque.model.IClient;
import src.com.mia.banque.ui.view.swt.ClientView;

public class ClientController {
		private ClientView view;
		private IClient model;
		
		public ClientController(src.com.mia.banque.model.IClient model){
				this.model = model;
		}
		public void afficherCompte() {
				this.controller.afficherCompte();
		}
			public void quitter() {
				this.controller.quitter();
		}
	