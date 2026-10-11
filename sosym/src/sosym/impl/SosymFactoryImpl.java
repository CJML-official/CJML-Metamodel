/**
 */
package sosym.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sosym.Action;
import sosym.Actor;
import sosym.ActualJourney;
import sosym.BackendSystem;
import sosym.Channel;
import sosym.Channels;
import sosym.CommunicationPoint;
import sosym.ComplianceValues;
import sosym.Concurrency;
import sosym.CustomerJourney;
import sosym.CustomerJourneyElement;
import sosym.Decision;
import sosym.EUTypes;
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
import sosym.SosymFactory;
import sosym.SosymPackage;
import sosym.Status;
import sosym.Touchpoint;
import sosym.UncertaintyValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SosymFactoryImpl extends EFactoryImpl implements SosymFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SosymFactory init() {
		try {
			SosymFactory theSosymFactory = (SosymFactory)EPackage.Registry.INSTANCE.getEFactory(SosymPackage.eNS_URI);
			if (theSosymFactory != null) {
				return theSosymFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SosymFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosymFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SosymPackage.SERVICE_PROCESS: return createServiceProcess();
			case SosymPackage.JOURNEY_GROUP: return createJourneyGroup();
			case SosymPackage.CUSTOMER_JOURNEY: return createCustomerJourney();
			case SosymPackage.PLANNED_JOURNEY: return createPlannedJourney();
			case SosymPackage.ACTUAL_JOURNEY: return createActualJourney();
			case SosymPackage.TOUCHPOINT: return createTouchpoint();
			case SosymPackage.CUSTOMER_JOURNEY_ELEMENT: return createCustomerJourneyElement();
			case SosymPackage.JOURNEY_PHASE: return createJourneyPhase();
			case SosymPackage.JOURNEY_OPERATOR: return createJourneyOperator();
			case SosymPackage.DECISION: return createDecision();
			case SosymPackage.CONCURRENCY: return createConcurrency();
			case SosymPackage.ACTOR: return createActor();
			case SosymPackage.EXTERNAL: return createExternal();
			case SosymPackage.SERVICE_PROVIDER: return createServiceProvider();
			case SosymPackage.END_USER: return createEndUser();
			case SosymPackage.ACTION: return createAction();
			case SosymPackage.COMMUNICATION_POINT: return createCommunicationPoint();
			case SosymPackage.OBJECT: return createObject();
			case SosymPackage.BACKEND_SYSTEM: return createBackendSystem();
			case SosymPackage.INITIATOR: return createInitiator();
			case SosymPackage.RECEIVER: return createReceiver();
			case SosymPackage.CHANNEL: return createChannel();
			case SosymPackage.MESSAGE: return createMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SosymPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case SosymPackage.EU_TYPES:
				return createEUTypesFromString(eDataType, initialValue);
			case SosymPackage.COMPLIANCE_VALUES:
				return createComplianceValuesFromString(eDataType, initialValue);
			case SosymPackage.UNCERTAINTY_VALUES:
				return createUncertaintyValuesFromString(eDataType, initialValue);
			case SosymPackage.CHANNELS:
				return createChannelsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SosymPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case SosymPackage.EU_TYPES:
				return convertEUTypesToString(eDataType, instanceValue);
			case SosymPackage.COMPLIANCE_VALUES:
				return convertComplianceValuesToString(eDataType, instanceValue);
			case SosymPackage.UNCERTAINTY_VALUES:
				return convertUncertaintyValuesToString(eDataType, instanceValue);
			case SosymPackage.CHANNELS:
				return convertChannelsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProcess createServiceProcess() {
		ServiceProcessImpl serviceProcess = new ServiceProcessImpl();
		return serviceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyGroup createJourneyGroup() {
		JourneyGroupImpl journeyGroup = new JourneyGroupImpl();
		return journeyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerJourney createCustomerJourney() {
		CustomerJourneyImpl customerJourney = new CustomerJourneyImpl();
		return customerJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedJourney createPlannedJourney() {
		PlannedJourneyImpl plannedJourney = new PlannedJourneyImpl();
		return plannedJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualJourney createActualJourney() {
		ActualJourneyImpl actualJourney = new ActualJourneyImpl();
		return actualJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touchpoint createTouchpoint() {
		TouchpointImpl touchpoint = new TouchpointImpl();
		return touchpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerJourneyElement createCustomerJourneyElement() {
		CustomerJourneyElementImpl customerJourneyElement = new CustomerJourneyElementImpl();
		return customerJourneyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyPhase createJourneyPhase() {
		JourneyPhaseImpl journeyPhase = new JourneyPhaseImpl();
		return journeyPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyOperator createJourneyOperator() {
		JourneyOperatorImpl journeyOperator = new JourneyOperatorImpl();
		return journeyOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public External createExternal() {
		ExternalImpl external = new ExternalImpl();
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvider createServiceProvider() {
		ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndUser createEndUser() {
		EndUserImpl endUser = new EndUserImpl();
		return endUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPoint createCommunicationPoint() {
		CommunicationPointImpl communicationPoint = new CommunicationPointImpl();
		return communicationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sosym.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackendSystem createBackendSystem() {
		BackendSystemImpl backendSystem = new BackendSystemImpl();
		return backendSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator createInitiator() {
		InitiatorImpl initiator = new InitiatorImpl();
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUTypes createEUTypesFromString(EDataType eDataType, String initialValue) {
		EUTypes result = EUTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEUTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceValues createComplianceValuesFromString(EDataType eDataType, String initialValue) {
		ComplianceValues result = ComplianceValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplianceValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyValues createUncertaintyValuesFromString(EDataType eDataType, String initialValue) {
		UncertaintyValues result = UncertaintyValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUncertaintyValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channels createChannelsFromString(EDataType eDataType, String initialValue) {
		Channels result = Channels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosymPackage getSosymPackage() {
		return (SosymPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SosymPackage getPackage() {
		return SosymPackage.eINSTANCE;
	}

} //SosymFactoryImpl
