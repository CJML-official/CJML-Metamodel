/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.Actor;
import cjmlmetamodel.ActualAction;
import cjmlmetamodel.ActualCommunicationPoint;
import cjmlmetamodel.ActualJourney;
import cjmlmetamodel.ActualTouchpoint;
import cjmlmetamodel.BackendSystem;
import cjmlmetamodel.Channel;
import cjmlmetamodel.Citizen;
import cjmlmetamodel.CjmlmetamodelFactory;
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
import cjmlmetamodel.channels;
import cjmlmetamodel.comTypes;
import cjmlmetamodel.complianceValues;
import cjmlmetamodel.patientTypes;
import cjmlmetamodel.providerTypes;
import cjmlmetamodel.status;
import cjmlmetamodel.uncertaintyValues;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CjmlmetamodelFactoryImpl extends EFactoryImpl implements CjmlmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CjmlmetamodelFactory init() {
		try {
			CjmlmetamodelFactory theCjmlmetamodelFactory = (CjmlmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(CjmlmetamodelPackage.eNS_URI);
			if (theCjmlmetamodelFactory != null) {
				return theCjmlmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CjmlmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CjmlmetamodelFactoryImpl() {
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
			case CjmlmetamodelPackage.PLANNED_JOURNEY: return createPlannedJourney();
			case CjmlmetamodelPackage.ACTUAL_JOURNEY: return createActualJourney();
			case CjmlmetamodelPackage.CUSTOMER_JOURNEY: return createCustomerJourney();
			case CjmlmetamodelPackage.TOUCHPOINT: return createTouchpoint();
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT: return createPlannedTouchpoint();
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT: return createActualTouchpoint();
			case CjmlmetamodelPackage.PLANNED_ACTION: return createPlannedAction();
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT: return createPlannedCommunicationPoint();
			case CjmlmetamodelPackage.ACTUAL_COMMUNICATION_POINT: return createActualCommunicationPoint();
			case CjmlmetamodelPackage.ACTUAL_ACTION: return createActualAction();
			case CjmlmetamodelPackage.JOURNEY_OPERATOR: return createJourneyOperator();
			case CjmlmetamodelPackage.CONCURRENCY: return createConcurrency();
			case CjmlmetamodelPackage.DECISION: return createDecision();
			case CjmlmetamodelPackage.EXPERIENCE: return createExperience();
			case CjmlmetamodelPackage.BACKEND_SYSTEM: return createBackendSystem();
			case CjmlmetamodelPackage.OBJECT: return createObject();
			case CjmlmetamodelPackage.JOURNEY_PHASE: return createJourneyPhase();
			case CjmlmetamodelPackage.ACTOR: return createActor();
			case CjmlmetamodelPackage.END_USER: return createEndUser();
			case CjmlmetamodelPackage.SERVICE_PROVIDER: return createServiceProvider();
			case CjmlmetamodelPackage.EXTERNAL: return createExternal();
			case CjmlmetamodelPackage.INITIATOR: return createInitiator();
			case CjmlmetamodelPackage.RECEIVER: return createReceiver();
			case CjmlmetamodelPackage.CHANNEL: return createChannel();
			case CjmlmetamodelPackage.MESSAGE: return createMessage();
			case CjmlmetamodelPackage.CUSTOMER: return createCustomer();
			case CjmlmetamodelPackage.USER: return createUser();
			case CjmlmetamodelPackage.CITIZEN: return createCitizen();
			case CjmlmetamodelPackage.PATIENT: return createPatient();
			case CjmlmetamodelPackage.EMPLOYEE: return createEmployee();
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
			case CjmlmetamodelPackage.COMPLIANCE_VALUES:
				return createcomplianceValuesFromString(eDataType, initialValue);
			case CjmlmetamodelPackage.STATUS:
				return createstatusFromString(eDataType, initialValue);
			case CjmlmetamodelPackage.CHANNELS:
				return createchannelsFromString(eDataType, initialValue);
			case CjmlmetamodelPackage.UNCERTAINTY_VALUES:
				return createuncertaintyValuesFromString(eDataType, initialValue);
			case CjmlmetamodelPackage.COM_TYPES:
				return createcomTypesFromString(eDataType, initialValue);
			case CjmlmetamodelPackage.PROVIDER_TYPES:
				return createproviderTypesFromString(eDataType, initialValue);
			case CjmlmetamodelPackage.PATIENT_TYPES:
				return createpatientTypesFromString(eDataType, initialValue);
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
			case CjmlmetamodelPackage.COMPLIANCE_VALUES:
				return convertcomplianceValuesToString(eDataType, instanceValue);
			case CjmlmetamodelPackage.STATUS:
				return convertstatusToString(eDataType, instanceValue);
			case CjmlmetamodelPackage.CHANNELS:
				return convertchannelsToString(eDataType, instanceValue);
			case CjmlmetamodelPackage.UNCERTAINTY_VALUES:
				return convertuncertaintyValuesToString(eDataType, instanceValue);
			case CjmlmetamodelPackage.COM_TYPES:
				return convertcomTypesToString(eDataType, instanceValue);
			case CjmlmetamodelPackage.PROVIDER_TYPES:
				return convertproviderTypesToString(eDataType, instanceValue);
			case CjmlmetamodelPackage.PATIENT_TYPES:
				return convertpatientTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public CustomerJourney createCustomerJourney() {
		CustomerJourneyImpl customerJourney = new CustomerJourneyImpl();
		return customerJourney;
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
	public PlannedTouchpoint createPlannedTouchpoint() {
		PlannedTouchpointImpl plannedTouchpoint = new PlannedTouchpointImpl();
		return plannedTouchpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualTouchpoint createActualTouchpoint() {
		ActualTouchpointImpl actualTouchpoint = new ActualTouchpointImpl();
		return actualTouchpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedAction createPlannedAction() {
		PlannedActionImpl plannedAction = new PlannedActionImpl();
		return plannedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedCommunicationPoint createPlannedCommunicationPoint() {
		PlannedCommunicationPointImpl plannedCommunicationPoint = new PlannedCommunicationPointImpl();
		return plannedCommunicationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualCommunicationPoint createActualCommunicationPoint() {
		ActualCommunicationPointImpl actualCommunicationPoint = new ActualCommunicationPointImpl();
		return actualCommunicationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualAction createActualAction() {
		ActualActionImpl actualAction = new ActualActionImpl();
		return actualAction;
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
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
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
	public Experience createExperience() {
		ExperienceImpl experience = new ExperienceImpl();
		return experience;
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
	public cjmlmetamodel.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
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
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
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
	public ServiceProvider createServiceProvider() {
		ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
		return serviceProvider;
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
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Citizen createCitizen() {
		CitizenImpl citizen = new CitizenImpl();
		return citizen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public complianceValues createcomplianceValuesFromString(EDataType eDataType, String initialValue) {
		complianceValues result = complianceValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcomplianceValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public status createstatusFromString(EDataType eDataType, String initialValue) {
		status result = status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public channels createchannelsFromString(EDataType eDataType, String initialValue) {
		channels result = channels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertchannelsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uncertaintyValues createuncertaintyValuesFromString(EDataType eDataType, String initialValue) {
		uncertaintyValues result = uncertaintyValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertuncertaintyValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comTypes createcomTypesFromString(EDataType eDataType, String initialValue) {
		comTypes result = comTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcomTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public providerTypes createproviderTypesFromString(EDataType eDataType, String initialValue) {
		providerTypes result = providerTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertproviderTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public patientTypes createpatientTypesFromString(EDataType eDataType, String initialValue) {
		patientTypes result = patientTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpatientTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CjmlmetamodelPackage getCjmlmetamodelPackage() {
		return (CjmlmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CjmlmetamodelPackage getPackage() {
		return CjmlmetamodelPackage.eINSTANCE;
	}

} //CjmlmetamodelFactoryImpl
