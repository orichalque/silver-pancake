package src.com.mia.banque.ui.view.swt;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Group;

import src.com.mia.banque.ui.controller.IOperationController;
import src.com.mia.banque.ui.view.IOperationView;
import src.com.mia.banque.model.IOperation;

public class OperationView extends Shell implements IOperationView {
		private IOperationController controller;
		private IOperation model;
		private Button btnquitter;

		
		public List List;
		public OperationView(Display display, src.com.mia.banque.model.IOperation model,  src.com.mia.banque.ui.controller.IOperationController controller){
				super(display, SWT.SHELL_TRIM);
				this.model = model;
				this.controller = controller;
				
		}
		
		public void quitter() {
				this.controller.quitter();
		}
	
		private void createContents(){
			setText("Vue Operation");
			setSize(458, 308);
			setLayout(new GridLayout(2, false));
	
			// Liste
			
			
	
	
	
	
			Group grpButtons = new Group(this, SWT.NONE);
			grpButtons.setLayout(new GridLayout(2, false));
			grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			
			btnquitter = new Button(grpButtons, SWT.NONE);
			btnquitter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
			btnquitter.setText("quitter");
			btnquitter.addSelectionListener(new SelectionAdapter(){
			        public void widgetSelected(SelectionEvent event)
			        {
			          quitter();
			        }
			      });
			
	
			

	}

		@Override
		protected void checkSubclass() {
			// Disable the check that prevents subclassing of SWT components
		}
	
}