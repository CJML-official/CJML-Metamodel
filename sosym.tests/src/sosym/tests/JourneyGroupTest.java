/**
 */
package sosym.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sosym.JourneyGroup;
import sosym.SosymFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Journey Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneyGroupTest extends TestCase {

	/**
	 * The fixture for this Journey Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JourneyGroupTest.class);
	}

	/**
	 * Constructs a new Journey Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Journey Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JourneyGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Journey Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyGroup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SosymFactory.eINSTANCE.createJourneyGroup());
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

} //JourneyGroupTest
