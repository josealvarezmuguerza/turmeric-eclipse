/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.errorlibrary.properties.eclipse;

import org.ebayopensource.turmeric.eclipse.core.buildsystem.AbstractSOANature;
import org.ebayopensource.turmeric.eclipse.core.resources.constants.SOAProjectConstants.SupportedProjectType;
import org.ebayopensource.turmeric.eclipse.errorlibrary.properties.Activator;
import org.ebayopensource.turmeric.eclipse.repositorysystem.core.GlobalRepositorySystem;


/**
 * The Class TurmericErrorLibraryProjectNature.
 *
 * @author yayu
 */
public class TurmericErrorLibraryProjectNature extends AbstractSOANature{
	
	/** The Constant NATURE_ID. */
	public static final String NATURE_ID = 
		Activator.PLUGIN_ID + ".ErrorLibraryProjectNature";
	
	/**
	 * Gets the nature id.
	 *
	 * @return the nature id
	 */
	public static String getNatureId() {
		return GlobalRepositorySystem.instanceOf().getActiveRepositorySystem()
		.getProjectNatureId(SupportedProjectType.ERROR_LIBRARY);
	}
	
	/**
	 * Instantiates a new turmeric error library project nature.
	 */
	public TurmericErrorLibraryProjectNature() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.ebayopensource.turmeric.eclipse.core.buildsystem.AbstractSOANature#getBuilderName()
	 */
	@Override
	public String getBuilderName() {
		return TurmericErrorLibraryProjectBuilder.BUILDER_ID;
	}

}
