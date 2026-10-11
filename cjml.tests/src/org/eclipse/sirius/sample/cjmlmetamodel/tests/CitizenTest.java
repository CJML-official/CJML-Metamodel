/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.Citizen;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Citizen</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CitizenTest extends EndUserTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CitizenTest.class);
	}

	/**
	 * Constructs a new Citizen test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitizenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Citizen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Citizen getFixture() {
		return (Citizen)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createCitizen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CitizenTest
