/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.ActualTouchpoint;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actual Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualTouchpointTest extends TouchpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActualTouchpointTest.class);
	}

	/**
	 * Constructs a new Actual Touchpoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualTouchpointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actual Touchpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActualTouchpoint getFixture() {
		return (ActualTouchpoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createActualTouchpoint());
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

} //ActualTouchpointTest
