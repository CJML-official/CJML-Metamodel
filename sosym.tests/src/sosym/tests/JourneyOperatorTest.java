/**
 */
package sosym.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sosym.JourneyOperator;
import sosym.SosymFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Journey Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneyOperatorTest extends TestCase {

	/**
	 * The fixture for this Journey Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyOperator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JourneyOperatorTest.class);
	}

	/**
	 * Constructs a new Journey Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyOperatorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Journey Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JourneyOperator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Journey Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyOperator getFixture() {
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
		setFixture(SosymFactory.eINSTANCE.createJourneyOperator());
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

} //JourneyOperatorTest
