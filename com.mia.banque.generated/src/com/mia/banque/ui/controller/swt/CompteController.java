package src.com.mia.banque.ui.controller.swt;
import src.com.mia.banque.model.ICompte;
import src.com.mia.banque.ui.view.swt.CompteView;

public class CompteController {
		private CompteView view;
		private ICompte model;
		
		public CompteController(src.com.mia.banque.model.ICompte model){
				this.model = model;
		}
		public void afficherOperation() {
				this.controller.afficherOperation();
		}
			public void quitter() {
				this.controller.quitter();
		}
	