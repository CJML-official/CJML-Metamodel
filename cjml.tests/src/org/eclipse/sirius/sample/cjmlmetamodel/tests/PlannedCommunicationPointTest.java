/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedCommunicationPoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Planned Communication Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlannedCommunicationPointTest extends PlannedTouchpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlannedCommunicationPointTest.class);
	}

	/**
	 * Constructs a new Planned Communication Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedCommunicationPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Planned Communication Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlannedCommunicationPoint getFixture() {
		return (PlannedCommunicationPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createPlannedCommunicationPoint());
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

} //PlannedCommunicationPointTest
