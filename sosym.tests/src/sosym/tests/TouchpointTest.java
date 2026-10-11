/**
 */
package sosym.tests;

import junit.textui.TestRunner;

import sosym.SosymFactory;
import sosym.Touchpoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchpointTest extends CustomerJourneyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TouchpointTest.class);
	}

	/**
	 * Constructs a new Touchpoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchpointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Touchpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Touchpoint getFixture() {
		return (Touchpoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SosymFactory.eINSTANCE.createTouchpoint());
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

} //TouchpointTest
