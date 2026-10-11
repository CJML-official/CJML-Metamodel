/**
 */
package sosym.tests;

import junit.textui.TestRunner;

import sosym.ActualJourney;
import sosym.SosymFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actual Journey</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualJourneyTest extends CustomerJourneyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActualJourneyTest.class);
	}

	/**
	 * Constructs a new Actual Journey test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualJourneyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Actual Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActualJourney getFixture() {
		return (ActualJourney)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SosymFactory.eINSTANCE.createActualJourney());
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

} //ActualJourneyTest
