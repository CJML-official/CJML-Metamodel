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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cjmlmetamodel.CjmlmetamodelPackage
 * @generated
 */
public class CjmlmetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CjmlmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CjmlmetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CjmlmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CjmlmetamodelSwitch<Adapter> modelSwitch =
		new CjmlmetamodelSwitch<Adapter>() {
			@Override
			public Adapter casePlannedJourney(PlannedJourney object) {
				return createPlannedJourneyAdapter();
			}
			@Override
			public Adapter caseActualJourney(ActualJourney object) {
				return createActualJourneyAdapter();
			}
			@Override
			public Adapter caseCustomerJourney(CustomerJourney object) {
				return createCustomerJourneyAdapter();
			}
			@Override
			public Adapter caseTouchpoint(Touchpoint object) {
				return createTouchpointAdapter();
			}
			@Override
			public Adapter casePlannedTouchpoint(PlannedTouchpoint object) {
				return createPlannedTouchpointAdapter();
			}
			@Override
			public Adapter caseActualTouchpoint(ActualTouchpoint object) {
				return createActualTouchpointAdapter();
			}
			@Override
			public Adapter casePlannedAction(PlannedAction object) {
				return createPlannedActionAdapter();
			}
			@Override
			public Adapter casePlannedCommunicationPoint(PlannedCommunicationPoint object) {
				return createPlannedCommunicationPointAdapter();
			}
			@Override
			public Adapter caseActualCommunicationPoint(ActualCommunicationPoint object) {
				return createActualCommunicationPointAdapter();
			}
			@Override
			public Adapter caseActualAction(ActualAction object) {
				return createActualActionAdapter();
			}
			@Override
			public Adapter caseJourneyOperator(JourneyOperator object) {
				return createJourneyOperatorAdapter();
			}
			@Override
			public Adapter caseConcurrency(Concurrency object) {
				return createConcurrencyAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseExperience(Experience object) {
				return createExperienceAdapter();
			}
			@Override
			public Adapter caseBackendSystem(BackendSystem object) {
				return createBackendSystemAdapter();
			}
			@Override
			public Adapter caseObject(cjmlmetamodel.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseJourneyPhase(JourneyPhase object) {
				return createJourneyPhaseAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseEndUser(EndUser object) {
				return createEndUserAdapter();
			}
			@Override
			public Adapter caseServiceProvider(ServiceProvider object) {
				return createServiceProviderAdapter();
			}
			@Override
			public Adapter caseExternal(External object) {
				return createExternalAdapter();
			}
			@Override
			public Adapter caseInitiator(Initiator object) {
				return createInitiatorAdapter();
			}
			@Override
			public Adapter caseReceiver(Receiver object) {
				return createReceiverAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseCitizen(Citizen object) {
				return createCitizenAdapter();
			}
			@Override
			public Adapter casePatient(Patient object) {
				return createPatientAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.PlannedJourney <em>Planned Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.PlannedJourney
	 * @generated
	 */
	public Adapter createPlannedJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.ActualJourney <em>Actual Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.ActualJourney
	 * @generated
	 */
	public Adapter createActualJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.CustomerJourney <em>Customer Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.CustomerJourney
	 * @generated
	 */
	public Adapter createCustomerJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Touchpoint
	 * @generated
	 */
	public Adapter createTouchpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.PlannedTouchpoint <em>Planned Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.PlannedTouchpoint
	 * @generated
	 */
	public Adapter createPlannedTouchpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.ActualTouchpoint <em>Actual Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.ActualTouchpoint
	 * @generated
	 */
	public Adapter createActualTouchpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.PlannedAction <em>Planned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.PlannedAction
	 * @generated
	 */
	public Adapter createPlannedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.PlannedCommunicationPoint <em>Planned Communication Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.PlannedCommunicationPoint
	 * @generated
	 */
	public Adapter createPlannedCommunicationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.ActualCommunicationPoint <em>Actual Communication Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.ActualCommunicationPoint
	 * @generated
	 */
	public Adapter createActualCommunicationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.ActualAction <em>Actual Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.ActualAction
	 * @generated
	 */
	public Adapter createActualActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.JourneyOperator <em>Journey Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.JourneyOperator
	 * @generated
	 */
	public Adapter createJourneyOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Concurrency
	 * @generated
	 */
	public Adapter createConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Experience
	 * @generated
	 */
	public Adapter createExperienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.BackendSystem <em>Backend System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.BackendSystem
	 * @generated
	 */
	public Adapter createBackendSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.JourneyPhase <em>Journey Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.JourneyPhase
	 * @generated
	 */
	public Adapter createJourneyPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.EndUser <em>End User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.EndUser
	 * @generated
	 */
	public Adapter createEndUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.ServiceProvider
	 * @generated
	 */
	public Adapter createServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.External
	 * @generated
	 */
	public Adapter createExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Initiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Initiator
	 * @generated
	 */
	public Adapter createInitiatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Citizen <em>Citizen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Citizen
	 * @generated
	 */
	public Adapter createCitizenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cjmlmetamodel.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cjmlmetamodel.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CjmlmetamodelAdapterFactory
