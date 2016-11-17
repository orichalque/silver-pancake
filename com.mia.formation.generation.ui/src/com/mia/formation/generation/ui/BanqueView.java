package com.mia.formation.generation.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class BanqueView extends Shell {
	private Button btnafficherClient;
		private Button btnafficherCompte;
		private Button btnquitter;
	

	/**
	 * Create the shell.
	 * @param display
	 */
	public BanqueView(Display display) {
		super(display, SWT.SHELL_TRIM);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Caisse d'épargne");
		setSize(450, 300);
		setLayout(new GridLayout(2, false));
		
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
		      });btnafficherCompte = new Button(grpButtons, SWT.NONE);
		btnafficherCompte.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		btnafficherCompte.setText("afficherCompte");
		btnafficherCompte.addSelectionListener(new SelectionAdapter(){
		        public void widgetSelected(SelectionEvent event)
		        {
		          afficherCompte();
		        }
		      });btnquitter = new Button(grpButtons, SWT.NONE);
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
	 
	 }
	
	public void afficherClient() {
		// Start of user code  for afficherClient
		ClientView.main(null);
		// End of user code
	
	}
	public void afficherCompte() {
		// Start of user code  for afficherCompte
		CompteView.main(null);
		// End of user code
	
	}
	public void quitter() {
		// Start of user code  for quitter
			System.exit(1);
		// End of user code
	
	}
	
		 
	 public static void main(String[] args) {
		Display display = Display.getDefault();

		BanqueView instanceBanqueView = new BanqueView(display);
		
		instanceBanqueView.open();
		instanceBanqueView.layout();
		
		while (!instanceBanqueView.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
