/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.search2.internal.ui.basic.views;

import org.eclipse.jface.action.Action;

/**
 * @author Thomas M�der
 *
 */
public class SortByAction extends Action {
	private DefaultSearchViewPage fPage;
	private String fSortAttribute;

	public SortByAction(DefaultSearchViewPage page, String sortAttribute) {
		super();
		setText(sortAttribute);
		fPage= page;
		fSortAttribute= sortAttribute;
	}
	
	public void run() {
		fPage.setSortAttribute(fSortAttribute);
	}

}
