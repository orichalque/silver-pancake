package com.mia.banque.ui.controller.swt;
import com.mia.banque.model.IClient;
import com.mia.banque.ui.view.swt.ClientView;
import  com.mia.banque.ui.controller.IClientController;

import org.eclipse.swt.widgets.Display;

public class ClientController implements IClientController {
		private ClientView view;
		private IClient model;
		
		public ClientController(com.mia.banque.model.IClient model){
				this.model = model;
		}
		
		public void initView() {
			Display display = Display.getDefault();
					
			this.view = new  ClientView(display, this.model, this);
			this.view.open();
			this.view.layout();
			
			while (!this.view.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}
			
			public void afficherCompte() {
	// Start of user code for afficherCompte
	
	// End of user code for afficherCompte
	}	public void quitter() {
	// Start of user code for quitter
	
	// End of user code for quitter
	}
			
	}
		
		
		