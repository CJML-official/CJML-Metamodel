/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedTouchpoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Planned Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlannedTouchpointTest extends TouchpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlannedTouchpointTest.class);
	}

	/**
	 * Constructs a new Planned Touchpoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedTouchpointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Planned Touchpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlannedTouchpoint getFixture() {
		return (PlannedTouchpoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createPlannedTouchpoint());
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

} //PlannedTouchpointTest
