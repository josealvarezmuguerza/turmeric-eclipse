/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.codgen.model.tests;

import static org.junit.Assert.*;

import org.ebayopensource.turmeric.eclipse.codegen.model.GenTypeGlobalServerConfig;
import org.ebayopensource.turmeric.eclipse.repositorysystem.model.BaseCodeGenModel;
import org.junit.Test;


public class GenTypeGlobalServerConfigTest {


	@Test
	public void testGenTypeGlobalServerConfig() {
		GenTypeGlobalServerConfig model = new GenTypeGlobalServerConfig();
		assertEquals(BaseCodeGenModel.GENTYPE_GLOBAL_SERVER_CONFIG, model.getGenType());
	}


}
