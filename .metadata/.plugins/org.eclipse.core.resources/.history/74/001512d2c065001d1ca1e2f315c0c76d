/**
 */
package cjmlmetamodel.util;

import cjmlmetamodel.Actor;
import cjmlmetamodel.ActualAction;
import cjmlmetamodel.ActualCommunicationPoint;
import cjmlmetamodel.ActualJourney;
import cjmlmetamodel.ActualTouchpoint;
import cjmlmetamodel.BackendSystem;
import cjmlmetamodel.Channel;
import cjmlmetamodel.Citizen;
import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.Concurrency;
import cjmlmetamodel.Customer;
import cjmlmetamodel.CustomerJourney;
import cjmlmetamodel.Decision;
import cjmlmetamodel.Employee;
import cjmlmetamodel.EndUser;
import cjmlmetamodel.Experience;
import cjmlmetamodel.External;
import cjmlmetamodel.Initiator;
import cjmlmetamodel.JourneyOperator;
import cjmlmetamodel.JourneyPhase;
import cjmlmetamodel.Message;
import cjmlmetamodel.Patient;
import cjmlmetamodel.PlannedAction;
import cjmlmetamodel.PlannedCommunicationPoint;
import cjmlmetamodel.PlannedJourney;
import cjmlmetamodel.PlannedTouchpoint;
import cjmlmetamodel.Receiver;
import cjmlmetamodel.ServiceProvider;
import cjmlmetamodel.Touchpoint;
import cjmlmetamodel.User;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see cjmlmetamodel.CjmlmetamodelPackage
 * @generated
 */
public class CjmlmetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CjmlmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CjmlmetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = CjmlmetamodelPackage.eINSTANCE;
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
			case CjmlmetamodelPackage.PLANNED_JOURNEY: {
				PlannedJourney plannedJourney = (PlannedJourney)theEObject;
				T result = casePlannedJourney(plannedJourney);
				if (result == null) result = caseCustomerJourney(plannedJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.ACTUAL_JOURNEY: {
				ActualJourney actualJourney = (ActualJourney)theEObject;
				T result = caseActualJourney(actualJourney);
				if (result == null) result = caseCustomerJourney(actualJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.CUSTOMER_JOURNEY: {
				CustomerJourney customerJourney = (CustomerJourney)theEObject;
				T result = caseCustomerJourney(customerJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.TOUCHPOINT: {
				Touchpoint touchpoint = (Touchpoint)theEObject;
				T result = caseTouchpoint(touchpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT: {
				PlannedTouchpoint plannedTouchpoint = (PlannedTouchpoint)theEObject;
				T result = casePlannedTouchpoint(plannedTouchpoint);
				if (result == null) result = caseTouchpoint(plannedTouchpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT: {
				ActualTouchpoint actualTouchpoint = (ActualTouchpoint)theEObject;
				T result = caseActualTouchpoint(actualTouchpoint);
				if (result == null) result = caseTouchpoint(actualTouchpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.PLANNED_ACTION: {
				PlannedAction plannedAction = (PlannedAction)theEObject;
				T result = casePlannedAction(plannedAction);
				if (result == null) result = casePlannedTouchpoint(plannedAction);
				if (result == null) result = caseTouchpoint(plannedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT: {
				PlannedCommunicationPoint plannedCommunicationPoint = (PlannedCommunicationPoint)theEObject;
				T result = casePlannedCommunicationPoint(plannedCommunicationPoint);
				if (result == null) result = casePlannedTouchpoint(plannedCommunicationPoint);
				if (result == null) result = caseTouchpoint(plannedCommunicationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.ACTUAL_COMMUNICATION_POINT: {
				ActualCommunicationPoint actualCommunicationPoint = (ActualCommunicationPoint)theEObject;
				T result = caseActualCommunicationPoint(actualCommunicationPoint);
				if (result == null) result = caseActualTouchpoint(actualCommunicationPoint);
				if (result == null) result = caseTouchpoint(actualCommunicationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.ACTUAL_ACTION: {
				ActualAction actualAction = (ActualAction)theEObject;
				T result = caseActualAction(actualAction);
				if (result == null) result = caseActualTouchpoint(actualAction);
				if (result == null) result = caseTouchpoint(actualAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.JOURNEY_OPERATOR: {
				JourneyOperator journeyOperator = (JourneyOperator)theEObject;
				T result = caseJourneyOperator(journeyOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.CONCURRENCY: {
				Concurrency concurrency = (Concurrency)theEObject;
				T result = caseConcurrency(concurrency);
				if (result == null) result = caseJourneyOperator(concurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseJourneyOperator(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.EXPERIENCE: {
				Experience experience = (Experience)theEObject;
				T result = caseExperience(experience);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.BACKEND_SYSTEM: {
				BackendSystem backendSystem = (BackendSystem)theEObject;
				T result = caseBackendSystem(backendSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.OBJECT: {
				cjmlmetamodel.Object object = (cjmlmetamodel.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.JOURNEY_PHASE: {
				JourneyPhase journeyPhase = (JourneyPhase)theEObject;
				T result = caseJourneyPhase(journeyPhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.END_USER: {
				EndUser endUser = (EndUser)theEObject;
				T result = caseEndUser(endUser);
				if (result == null) result = caseActor(endUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.SERVICE_PROVIDER: {
				ServiceProvider serviceProvider = (ServiceProvider)theEObject;
				T result = caseServiceProvider(serviceProvider);
				if (result == null) result = caseActor(serviceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseActor(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.INITIATOR: {
				Initiator initiator = (Initiator)theEObject;
				T result = caseInitiator(initiator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.RECEIVER: {
				Receiver receiver = (Receiver)theEObject;
				T result = caseReceiver(receiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = caseEndUser(customer);
				if (result == null) result = caseActor(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseEndUser(user);
				if (result == null) result = caseActor(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.CITIZEN: {
				Citizen citizen = (Citizen)theEObject;
				T result = caseCitizen(citizen);
				if (result == null) result = caseEndUser(citizen);
				if (result == null) result = caseActor(citizen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseEndUser(patient);
				if (result == null) result = caseActor(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CjmlmetamodelPackage.EMPLOYEE: {
				Employee employee = (Employee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = caseEndUser(employee);
				if (result == null) result = caseActor(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Planned Touchpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Touchpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedTouchpoint(PlannedTouchpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Touchpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Touchpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualTouchpoint(ActualTouchpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedAction(PlannedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Communication Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Communication Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedCommunicationPoint(PlannedCommunicationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Communication Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Communication Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualCommunicationPoint(ActualCommunicationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualAction(ActualAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperience(Experience object) {
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
	public T caseObject(cjmlmetamodel.Object object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citizen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citizen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitizen(Citizen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
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

} //CjmlmetamodelSwitch
