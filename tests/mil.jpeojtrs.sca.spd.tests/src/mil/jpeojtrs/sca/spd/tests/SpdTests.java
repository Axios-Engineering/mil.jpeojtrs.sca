/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.spd.tests;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>spd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class SpdTests  {

	public static URI getURI(final String filePath) throws IOException {
		final URL url = FileLocator.toFileURL(FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.spd.tests"), new Path(filePath), null));
		return URI.createURI(url.toString());
	}

} //SpdTests
