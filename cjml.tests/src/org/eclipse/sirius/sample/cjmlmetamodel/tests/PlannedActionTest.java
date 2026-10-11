/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Planned Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlannedActionTest extends PlannedTouchpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlannedActionTest.class);
	}

	/**
	 * Constructs a new Planned Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Planned Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlannedAction getFixture() {
		return (PlannedAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createPlannedAction());
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

} //PlannedActionTest
