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

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.spd.Processor;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorTest extends TestCase {

	/**
	 * The fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Processor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessorTest.class);
	}

	/**
	 * Constructs a new Processor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Processor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Processor getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createProcessor());
		this.resourceSet = new ResourceSetImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
		this.resourceSet = null;
	}

	public void testParse() throws Exception {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true));
		final Processor processor = softPkg.getImplementation().get(0).getProcessor().get(0);
		Assert.assertNotNull(processor);
		Assert.assertEquals("x86", processor.getName());
	}

} //ProcessorTest
