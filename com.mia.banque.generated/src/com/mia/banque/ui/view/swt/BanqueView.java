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

import src.com.mia.banque.ui.controller.IBanqueController;
import src.com.mia.banque.ui.view.IBanqueView;
import src.com.mia.banque.model.IBanque;

public class BanqueView extends Shell implements IBanqueView {
		private IBanqueController controller;
		private IBanque model;
		private Button btnafficherClient;
		private Button btnquitter;

		
		public List ClientList;
		public BanqueView(Display display, src.com.mia.banque.model.IBanque model,  src.com.mia.banque.ui.controller.IBanqueController controller){
				super(display, SWT.SHELL_TRIM);
				this.model = model;
				this.controller = controller;
				
		}
		
		public void afficherClient() {
				this.controller.afficherClient();
		}
			public void quitter() {
				this.controller.quitter();
		}
	
		private void createContents(){
			setText("Vue Banque");
			setSize(458, 308);
			setLayout(new GridLayout(2, false));
	
			// Liste
			
			
	
	
	
	
			Group grpButtons = new Group(this, SWT.NONE);
			grpButtons.setLayout(new GridLayout(2, false));
			grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			
			btnafficherClient = new Button(grpButtons, SWT.NONE);
			btnafficherClient.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
			btnafficherClient.setText("afficherClient");
			btnafficherClient.addSelectionListener(new SelectionAdapter(){
			        public void widgetSelected(SelectionEvent event)
			        {
			          afficherClient();
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