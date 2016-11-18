package com.mia.banque.ui.controller.swt;
import com.mia.banque.model.ICompte;
import com.mia.banque.ui.view.swt.CompteView;
import  com.mia.banque.ui.controller.ICompteController;

import org.eclipse.swt.widgets.Display;

public class CompteController implements ICompteController {
		private CompteView view;
		private ICompte model;
		
		public CompteController(com.mia.banque.model.ICompte model){
				this.model = model;
		}
		
		public void initView() {
			Display display = Display.getDefault();
					
			this.view = new  CompteView(display, this.model, this);
			this.view.open();
			this.view.layout();
			
			while (!this.view.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}
			
			public void afficherOperation() {
	// Start of user code for afficherOperation
		if (this.view.OperationList.getSelection().length > 0) {
			String compteSelection = this.view.OperationList.getSelection()[0];
			for (final com.mia.banque.model.IOperation aOp : this.model.getOperations()) {
				if (aOp.toString().equals(compteSelection)) { // TODO gerer un
																// champ id
																// plut�t que
																// utiliser
																// toString()
					OperationController opeControler = new OperationController(aOp);
					opeControler.initView();
				}
			}
		}
		// End of user code for afficherOperation
	}	public void quitter() {
	// Start of user code for quitter
		// On veut fermer toutes les fen�tres ouvertes
		Display.getCurrent().dispose();
		// End of user code for quitter
	}
			
	}
		
		
		