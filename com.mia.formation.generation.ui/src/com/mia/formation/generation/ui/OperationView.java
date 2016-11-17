package com.mia.formation.generation.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public class OperationView extends Shell {


	/**
	 * Create the shell.
	 * @param display
	 */
	public OperationView(Display display) {
		super(display, SWT.SHELL_TRIM);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Vue des opérations");
		setSize(450, 300);
		setLayout(new GridLayout(2, false));
		
		Group grpButtons = new Group(this, SWT.NONE);
		grpButtons.setLayout(new GridLayout(2, false));
		grpButtons.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
	}
		
	@Override
	 protected void checkSubclass() {
	 
	 }
	
	
		 
	 public static void main(String[] args) {
		Display display = Display.getDefault();

		OperationView instanceOperationView = new OperationView(display);
		
		instanceOperationView.open();
		instanceOperationView.layout();
		
		while (!instanceOperationView.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
