package src.com.mia.banque.ui.controller.swt;
import src.com.mia.banque.model.IOperation;
import src.com.mia.banque.ui.view.swt.OperationView;

public class OperationController {
		private OperationView view;
		private IOperation model;
		
		public OperationController(src.com.mia.banque.model.IOperation model){
				this.model = model;
		}
		public void quitter() {
				this.controller.quitter();
		}
	