/**
 */
package sosym.tests;

import junit.textui.TestRunner;

import sosym.External;
import sosym.SosymFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalTest extends ActorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalTest.class);
	}

	/**
	 * Constructs a new External test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected External getFixture() {
		return (External)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SosymFactory.eINSTANCE.createExternal());
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

} //ExternalTest
