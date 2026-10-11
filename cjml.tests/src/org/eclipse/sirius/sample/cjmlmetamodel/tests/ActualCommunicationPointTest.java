/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.ActualCommunicationPoint;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actual Communication Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualCommunicationPointTest extends ActualTouchpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActualCommunicationPointTest.class);
	}

	/**
	 * Constructs a new Actual Communication Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualCommunicationPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actual Communication Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActualCommunicationPoint getFixture() {
		return (ActualCommunicationPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createActualCommunicationPoint());
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

} //ActualCommunicationPointTest
