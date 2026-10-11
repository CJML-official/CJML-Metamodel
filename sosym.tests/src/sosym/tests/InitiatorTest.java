/**
 */
package sosym.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import sosym.Initiator;
import sosym.SosymFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initiator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitiatorTest extends TestCase {

	/**
	 * The fixture for this Initiator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Initiator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitiatorTest.class);
	}

	/**
	 * Constructs a new Initiator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Initiator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Initiator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Initiator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Initiator getFixture() {
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
		setFixture(SosymFactory.eINSTANCE.createInitiator());
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

} //InitiatorTest
