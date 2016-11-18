package com.mia.banque.ui.controller.swt;
import com.mia.banque.model.IBanque;
import com.mia.banque.ui.view.swt.BanqueView;
import  com.mia.banque.ui.controller.IBanqueController;

import org.eclipse.swt.widgets.Display;

public class BanqueController implements IBanqueController {
		private BanqueView view;
		private IBanque model;
		
		public BanqueController(com.mia.banque.model.IBanque model){
				this.model = model;
		}
		
		public void initView() {
			Display display = Display.getDefault();
					
			this.view = new  BanqueView(display, this.model, this);
			this.view.open();
			this.view.layout();
			
			while (!this.view.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}
			
			public void afficherClient() {
	// Start of user code for afficherClient
	
	// End of user code for afficherClient
	}	public void quitter() {
	// Start of user code for quitter
	
	// End of user code for quitter
	}
			
	}
		
		
		