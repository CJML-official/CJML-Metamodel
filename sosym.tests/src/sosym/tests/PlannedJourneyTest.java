/**
 */
package sosym.tests;

import junit.textui.TestRunner;

import sosym.PlannedJourney;
import sosym.SosymFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Planned Journey</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlannedJourneyTest extends CustomerJourneyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlannedJourneyTest.class);
	}

	/**
	 * Constructs a new Planned Journey test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedJourneyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Planned Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlannedJourney getFixture() {
		return (PlannedJourney)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SosymFactory.eINSTANCE.createPlannedJourney());
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

} //PlannedJourneyTest
