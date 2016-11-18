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
	
	// End of user code for afficherOperation
	}	public void quitter() {
	// Start of user code for quitter
	
	// End of user code for quitter
	}
			
	}
		
		
		