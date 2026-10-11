/**
 */
package sosym;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sosym.SosymPackage
 * @generated
 */
public interface SosymFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SosymFactory eINSTANCE = sosym.impl.SosymFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Process</em>'.
	 * @generated
	 */
	ServiceProcess createServiceProcess();

	/**
	 * Returns a new object of class '<em>Journey Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey Group</em>'.
	 * @generated
	 */
	JourneyGroup createJourneyGroup();

	/**
	 * Returns a new object of class '<em>Customer Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Journey</em>'.
	 * @generated
	 */
	CustomerJourney createCustomerJourney();

	/**
	 * Returns a new object of class '<em>Planned Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Journey</em>'.
	 * @generated
	 */
	PlannedJourney createPlannedJourney();

	/**
	 * Returns a new object of class '<em>Actual Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Journey</em>'.
	 * @generated
	 */
	ActualJourney createActualJourney();

	/**
	 * Returns a new object of class '<em>Touchpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touchpoint</em>'.
	 * @generated
	 */
	Touchpoint createTouchpoint();

	/**
	 * Returns a new object of class '<em>Customer Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Journey Element</em>'.
	 * @generated
	 */
	CustomerJourneyElement createCustomerJourneyElement();

	/**
	 * Returns a new object of class '<em>Journey Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey Phase</em>'.
	 * @generated
	 */
	JourneyPhase createJourneyPhase();

	/**
	 * Returns a new object of class '<em>Journey Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey Operator</em>'.
	 * @generated
	 */
	JourneyOperator createJourneyOperator();

	/**
	 * Returns a new object of class '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision</em>'.
	 * @generated
	 */
	Decision createDecision();

	/**
	 * Returns a new object of class '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency</em>'.
	 * @generated
	 */
	Concurrency createConcurrency();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External</em>'.
	 * @generated
	 */
	External createExternal();

	/**
	 * Returns a new object of class '<em>Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Provider</em>'.
	 * @generated
	 */
	ServiceProvider createServiceProvider();

	/**
	 * Returns a new object of class '<em>End User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End User</em>'.
	 * @generated
	 */
	EndUser createEndUser();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Communication Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Point</em>'.
	 * @generated
	 */
	CommunicationPoint createCommunicationPoint();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Backend System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backend System</em>'.
	 * @generated
	 */
	BackendSystem createBackendSystem();

	/**
	 * Returns a new object of class '<em>Initiator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initiator</em>'.
	 * @generated
	 */
	Initiator createInitiator();

	/**
	 * Returns a new object of class '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver</em>'.
	 * @generated
	 */
	Receiver createReceiver();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SosymPackage getSosymPackage();

} //SosymFactory
