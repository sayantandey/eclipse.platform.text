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
package org.eclipse.search.ui;

import org.eclipse.jface.action.IMenuManager;

import org.eclipse.ui.IViewPart;


/**
 * Interface to the search results view. 
 * This interface is not intended to be implemented.
 * This API is preliminary and subject to change at any time.
 * @since 3.0
 */
public interface ISearchResultPageContainer extends IViewPart {
	/**
	 * Clients can call this method to have the search results view
	 * contribute to their context menus.
	 * @param menuManager
	 */
	void fillContextMenu(IMenuManager menuManager);
}
