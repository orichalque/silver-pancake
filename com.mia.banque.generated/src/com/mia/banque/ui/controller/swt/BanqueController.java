package src.com.mia.banque.ui.controller.swt;
import src.com.mia.banque.model.IBanque;
import src.com.mia.banque.ui.view.swt.BanqueView;

public class BanqueController {
		private BanqueView view;
		private IBanque model;
		
		public BanqueController(src.com.mia.banque.model.IBanque model){
				this.model = model;
		}
		public void afficherClient() {
				this.controller.afficherClient();
		}
			public void quitter() {
				this.controller.quitter();
		}
	