/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.tests;

import junit.textui.TestRunner;

import org.eclipse.sirius.sample.cjmlmetamodel.ActualAction;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actual Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualActionTest extends ActualTouchpointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActualActionTest.class);
	}

	/**
	 * Constructs a new Actual Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actual Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActualAction getFixture() {
		return (ActualAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CjmlmetamodelFactory.eINSTANCE.createActualAction());
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

} //ActualActionTest
