package com.mia.banque.ui.controller.swt;
import com.mia.banque.model.IOperation;
import com.mia.banque.ui.view.swt.OperationView;
import  com.mia.banque.ui.controller.IOperationController;

import org.eclipse.swt.widgets.Display;

public class OperationController implements IOperationController {
		private OperationView view;
		private IOperation model;
		
		public OperationController(com.mia.banque.model.IOperation model){
				this.model = model;
		}
		
		public void initView() {
			Display display = Display.getDefault();
					
			this.view = new  OperationView(display, this.model, this);
			this.view.open();
			this.view.layout();
			
			while (!this.view.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}
			
			public void quitter() {
	// Start of user code for quitter
	
	// End of user code for quitter
	}
			
	}
		
		
		