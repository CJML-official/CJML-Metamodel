/**
 */
package sosym.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sosym.SosymPackage
 * @generated
 */
public class SosymAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SosymPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosymAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SosymPackage.eINSTANCE;
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
	protected SosymSwitch<Adapter> modelSwitch =
		new SosymSwitch<Adapter>() {
			@Override
			public Adapter caseServiceProcess(ServiceProcess object) {
				return createServiceProcessAdapter();
			}
			@Override
			public Adapter caseJourneyGroup(JourneyGroup object) {
				return createJourneyGroupAdapter();
			}
			@Override
			public Adapter caseCustomerJourney(CustomerJourney object) {
				return createCustomerJourneyAdapter();
			}
			@Override
			public Adapter casePlannedJourney(PlannedJourney object) {
				return createPlannedJourneyAdapter();
			}
			@Override
			public Adapter caseActualJourney(ActualJourney object) {
				return createActualJourneyAdapter();
			}
			@Override
			public Adapter caseTouchpoint(Touchpoint object) {
				return createTouchpointAdapter();
			}
			@Override
			public Adapter caseCustomerJourneyElement(CustomerJourneyElement object) {
				return createCustomerJourneyElementAdapter();
			}
			@Override
			public Adapter caseJourneyPhase(JourneyPhase object) {
				return createJourneyPhaseAdapter();
			}
			@Override
			public Adapter caseJourneyOperator(JourneyOperator object) {
				return createJourneyOperatorAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseConcurrency(Concurrency object) {
				return createConcurrencyAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseExternal(External object) {
				return createExternalAdapter();
			}
			@Override
			public Adapter caseServiceProvider(ServiceProvider object) {
				return createServiceProviderAdapter();
			}
			@Override
			public Adapter caseEndUser(EndUser object) {
				return createEndUserAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCommunicationPoint(CommunicationPoint object) {
				return createCommunicationPointAdapter();
			}
			@Override
			public Adapter caseObject(sosym.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseBackendSystem(BackendSystem object) {
				return createBackendSystemAdapter();
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
	 * Creates a new adapter for an object of class '{@link sosym.ServiceProcess <em>Service Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.ServiceProcess
	 * @generated
	 */
	public Adapter createServiceProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.JourneyGroup <em>Journey Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.JourneyGroup
	 * @generated
	 */
	public Adapter createJourneyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.CustomerJourney <em>Customer Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.CustomerJourney
	 * @generated
	 */
	public Adapter createCustomerJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.PlannedJourney <em>Planned Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.PlannedJourney
	 * @generated
	 */
	public Adapter createPlannedJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.ActualJourney <em>Actual Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.ActualJourney
	 * @generated
	 */
	public Adapter createActualJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Touchpoint
	 * @generated
	 */
	public Adapter createTouchpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.CustomerJourneyElement <em>Customer Journey Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.CustomerJourneyElement
	 * @generated
	 */
	public Adapter createCustomerJourneyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.JourneyPhase <em>Journey Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.JourneyPhase
	 * @generated
	 */
	public Adapter createJourneyPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.JourneyOperator <em>Journey Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.JourneyOperator
	 * @generated
	 */
	public Adapter createJourneyOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Concurrency
	 * @generated
	 */
	public Adapter createConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.External
	 * @generated
	 */
	public Adapter createExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.ServiceProvider
	 * @generated
	 */
	public Adapter createServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.EndUser <em>End User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.EndUser
	 * @generated
	 */
	public Adapter createEndUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.CommunicationPoint <em>Communication Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.CommunicationPoint
	 * @generated
	 */
	public Adapter createCommunicationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.BackendSystem <em>Backend System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.BackendSystem
	 * @generated
	 */
	public Adapter createBackendSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Initiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Initiator
	 * @generated
	 */
	public Adapter createInitiatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sosym.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sosym.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
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

} //SosymAdapterFactory
