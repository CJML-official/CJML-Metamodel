/**
 */
package sosym.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sosym.Action;
import sosym.Actor;
import sosym.ActualJourney;
import sosym.BackendSystem;
import sosym.Channel;
import sosym.CommunicationPoint;
import sosym.Concurrency;
import sosym.CustomerJourney;
import sosym.CustomerJourneyElement;
import sosym.Decision;
import sosym.EndUser;
import sosym.External;
import sosym.Initiator;
import sosym.JourneyGroup;
import sosym.JourneyOperator;
import sosym.JourneyPhase;
import sosym.Message;
import sosym.PlannedJourney;
import sosym.Receiver;
import sosym.ServiceProcess;
import sosym.ServiceProvider;
import sosym.SosymPackage;
import sosym.Touchpoint;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sosym.SosymPackage
 * @generated
 */
public class SosymSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SosymPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosymSwitch() {
		if (modelPackage == null) {
			modelPackage = SosymPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SosymPackage.SERVICE_PROCESS: {
				ServiceProcess serviceProcess = (ServiceProcess)theEObject;
				T result = caseServiceProcess(serviceProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.JOURNEY_GROUP: {
				JourneyGroup journeyGroup = (JourneyGroup)theEObject;
				T result = caseJourneyGroup(journeyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.CUSTOMER_JOURNEY: {
				CustomerJourney customerJourney = (CustomerJourney)theEObject;
				T result = caseCustomerJourney(customerJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.PLANNED_JOURNEY: {
				PlannedJourney plannedJourney = (PlannedJourney)theEObject;
				T result = casePlannedJourney(plannedJourney);
				if (result == null) result = caseCustomerJourney(plannedJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.ACTUAL_JOURNEY: {
				ActualJourney actualJourney = (ActualJourney)theEObject;
				T result = caseActualJourney(actualJourney);
				if (result == null) result = caseCustomerJourney(actualJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.TOUCHPOINT: {
				Touchpoint touchpoint = (Touchpoint)theEObject;
				T result = caseTouchpoint(touchpoint);
				if (result == null) result = caseCustomerJourneyElement(touchpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.CUSTOMER_JOURNEY_ELEMENT: {
				CustomerJourneyElement customerJourneyElement = (CustomerJourneyElement)theEObject;
				T result = caseCustomerJourneyElement(customerJourneyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.JOURNEY_PHASE: {
				JourneyPhase journeyPhase = (JourneyPhase)theEObject;
				T result = caseJourneyPhase(journeyPhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.JOURNEY_OPERATOR: {
				JourneyOperator journeyOperator = (JourneyOperator)theEObject;
				T result = caseJourneyOperator(journeyOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseJourneyOperator(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.CONCURRENCY: {
				Concurrency concurrency = (Concurrency)theEObject;
				T result = caseConcurrency(concurrency);
				if (result == null) result = caseJourneyOperator(concurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseActor(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.SERVICE_PROVIDER: {
				ServiceProvider serviceProvider = (ServiceProvider)theEObject;
				T result = caseServiceProvider(serviceProvider);
				if (result == null) result = caseActor(serviceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.END_USER: {
				EndUser endUser = (EndUser)theEObject;
				T result = caseEndUser(endUser);
				if (result == null) result = caseActor(endUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseTouchpoint(action);
				if (result == null) result = caseCustomerJourneyElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.COMMUNICATION_POINT: {
				CommunicationPoint communicationPoint = (CommunicationPoint)theEObject;
				T result = caseCommunicationPoint(communicationPoint);
				if (result == null) result = caseTouchpoint(communicationPoint);
				if (result == null) result = caseCustomerJourneyElement(communicationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.OBJECT: {
				sosym.Object object = (sosym.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.BACKEND_SYSTEM: {
				BackendSystem backendSystem = (BackendSystem)theEObject;
				T result = caseBackendSystem(backendSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.INITIATOR: {
				Initiator initiator = (Initiator)theEObject;
				T result = caseInitiator(initiator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.RECEIVER: {
				Receiver receiver = (Receiver)theEObject;
				T result = caseReceiver(receiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosymPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProcess(ServiceProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyGroup(JourneyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerJourney(CustomerJourney object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedJourney(PlannedJourney object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualJourney(ActualJourney object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touchpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touchpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchpoint(Touchpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Journey Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Journey Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerJourneyElement(CustomerJourneyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyPhase(JourneyPhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyOperator(JourneyOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrency(Concurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal(External object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProvider(ServiceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndUser(EndUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPoint(CommunicationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(sosym.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backend System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backend System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackendSystem(BackendSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiator(Initiator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiver(Receiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SosymSwitch
