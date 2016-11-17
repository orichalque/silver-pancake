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

import src.com.mia.banque.ui.controller.ICompteController;
import src.com.mia.banque.ui.view.ICompteView;
import src.com.mia.banque.model.ICompte;

public class CompteView extends Shell implements ICompteView {
		private ICompteController controller;
		private ICompte model;
		private Button btnafficherOperation;
		private Button btnquitter;

		
		public List OperationList;
		public CompteView(Display display, src.com.mia.banque.model.ICompte model,  src.com.mia.banque.ui.controller.ICompteController controller){
				super(display, SWT.SHELL_TRIM);
				this.model = model;
				this.controller = controller;
				
		}
		
		public void afficherOperation() {
				this.controller.afficherOperation();
		}
			public void quitter() {
				this.controller.quitter();
		}
	
		private void createContents(){
			setText("Vue Compte");
			setSize(458, 308);
			setLayout(new GridLayout(2, false));
	
			// Liste
			
			
	
	
	
	
			Group grpButtons = new Group(this, SWT.NONE);
			grpButtons.setLayout(new GridLayout(2, false));
			grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			
			btnafficherOperation = new Button(grpButtons, SWT.NONE);
			btnafficherOperation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
			btnafficherOperation.setText("afficherOperation");
			btnafficherOperation.addSelectionListener(new SelectionAdapter(){
			        public void widgetSelected(SelectionEvent event)
			        {
			          afficherOperation();
			        }
			      });
			
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