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

import src.com.mia.banque.ui.controller.IClientController;
import src.com.mia.banque.ui.view.IClientView;
import src.com.mia.banque.model.IClient;

public class ClientView extends Shell implements IClientView {
		private IClientController controller;
		private IClient model;
		private Button btnafficherCompte;
		private Button btnquitter;

		
		public List CompteList;
		public ClientView(Display display, src.com.mia.banque.model.IClient model,  src.com.mia.banque.ui.controller.IClientController controller){
				super(display, SWT.SHELL_TRIM);
				this.model = model;
				this.controller = controller;
				
		}
		
		public void afficherCompte() {
				this.controller.afficherCompte();
		}
			public void quitter() {
				this.controller.quitter();
		}
	
		private void createContents(){
			setText("Vue Client");
			setSize(458, 308);
			setLayout(new GridLayout(2, false));
	
			// Liste
			
			
	
	
	
	
			Group grpButtons = new Group(this, SWT.NONE);
			grpButtons.setLayout(new GridLayout(2, false));
			grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			
			btnafficherCompte = new Button(grpButtons, SWT.NONE);
			btnafficherCompte.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
			btnafficherCompte.setText("afficherCompte");
			btnafficherCompte.addSelectionListener(new SelectionAdapter(){
			        public void widgetSelected(SelectionEvent event)
			        {
			          afficherCompte();
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