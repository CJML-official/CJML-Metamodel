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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CjmlmetamodelPackageImpl extends EPackageImpl implements CjmlmetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedJourneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualJourneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerJourneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedTouchpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualTouchpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedCommunicationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualCommunicationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experienceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backendSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citizenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complianceValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uncertaintyValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cjmlmetamodel.CjmlmetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CjmlmetamodelPackageImpl() {
		super(eNS_URI, CjmlmetamodelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CjmlmetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CjmlmetamodelPackage init() {
		if (isInited) return (CjmlmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCjmlmetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CjmlmetamodelPackageImpl theCjmlmetamodelPackage = registeredCjmlmetamodelPackage instanceof CjmlmetamodelPackageImpl ? (CjmlmetamodelPackageImpl)registeredCjmlmetamodelPackage : new CjmlmetamodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCjmlmetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theCjmlmetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCjmlmetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CjmlmetamodelPackage.eNS_URI, theCjmlmetamodelPackage);
		return theCjmlmetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedJourney() {
		return plannedJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedJourney_PlannedTouchpoints() {
		return (EReference)plannedJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualJourney() {
		return actualJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_ActualTouchpoints() {
		return (EReference)actualJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_JourneyCompliance() {
		return (EReference)actualJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_JourneyExperience() {
		return (EReference)actualJourneyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_JourneyStatus() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_ContentCompliance() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_SequenceCompliance() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_TimingCompliance() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerJourney() {
		return customerJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_JourneyOperators() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_JourneyPhases() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_EndUser() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_ServiceProvider() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_External() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyID() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyTitle() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyShortSummary() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyLongSummary() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchpoint() {
		return touchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_BackendSystems() {
		return (EReference)touchpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_Objects() {
		return (EReference)touchpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_BelongsTo() {
		return (EReference)touchpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_TouchpointID() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Uncertainty() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Comment() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedTouchpoint() {
		return plannedTouchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlannedTouchpoint_DeltaStartTime() {
		return (EAttribute)plannedTouchpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlannedTouchpoint_TouchpointDuration() {
		return (EAttribute)plannedTouchpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualTouchpoint() {
		return actualTouchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualTouchpoint_TimeStarted() {
		return (EAttribute)actualTouchpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualTouchpoint_TimeCompleted() {
		return (EAttribute)actualTouchpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualTouchpoint_TouchpointCompliance() {
		return (EReference)actualTouchpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualTouchpoint_Compliance() {
		return (EAttribute)actualTouchpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualTouchpoint_TouchpointExperience() {
		return (EReference)actualTouchpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedAction() {
		return plannedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedAction_Initiator() {
		return (EReference)plannedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedCommunicationPoint() {
		return plannedCommunicationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Initiator() {
		return (EReference)plannedCommunicationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Receiver() {
		return (EReference)plannedCommunicationPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Channel() {
		return (EReference)plannedCommunicationPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Message() {
		return (EReference)plannedCommunicationPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualCommunicationPoint() {
		return actualCommunicationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_TimeOriginated() {
		return (EAttribute)actualCommunicationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_TimeAvailable() {
		return (EAttribute)actualCommunicationPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_TimeConsumed() {
		return (EAttribute)actualCommunicationPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Initiator() {
		return (EReference)actualCommunicationPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Receiver() {
		return (EReference)actualCommunicationPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Channel() {
		return (EReference)actualCommunicationPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Message() {
		return (EReference)actualCommunicationPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualAction() {
		return actualActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAction_Initiator() {
		return (EReference)actualActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyOperator() {
		return journeyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneyOperator_BelongsTo() {
		return (EReference)journeyOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyOperator_OperatorID() {
		return (EAttribute)journeyOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrency() {
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcurrency_Concurrencypaths() {
		return (EAttribute)concurrencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_DecisionPaths() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Condition() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_DecisionMaker() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperience() {
		return experienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_EndUserRating() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperience_EndUserExperienceRating() {
		return (EAttribute)experienceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackendSystem() {
		return backendSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackendSystem_SystemID() {
		return (EAttribute)backendSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackendSystem_SystemName() {
		return (EAttribute)backendSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackendSystem_SystemDescription() {
		return (EAttribute)backendSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectID() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectName() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectDescription() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_IsVirtual() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyPhase() {
		return journeyPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyPhase_PhaseName() {
		return (EAttribute)journeyPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyPhase_PhaseDescription() {
		return (EAttribute)journeyPhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorID() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorName() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorDescription() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_IsVirtual() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndUser() {
		return endUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUser_IsMain() {
		return (EAttribute)endUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProvider() {
		return serviceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_CompanyName() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Department() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Position() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Type() {
		return (EAttribute)serviceProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiator() {
		return initiatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiator_RefersTo() {
		return (EReference)initiatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiator_InitiatorLabel() {
		return (EAttribute)initiatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiver_RefersTo() {
		return (EReference)receiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiver_ReceiverLabel() {
		return (EAttribute)receiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Channel() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_ComType() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_IsSynchronous() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Content() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_KeyContent() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_DerivedKeyContent() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Likes() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Frustrations() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_PreferredChannels() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitizen() {
		return citizenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_PatientType() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Diagnosis() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_InsuranceName() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_CompanyName() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Department() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Position() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_YearsExperience() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcomplianceValues() {
		return complianceValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getstatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getchannels() {
		return channelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getuncertaintyValues() {
		return uncertaintyValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcomTypes() {
		return comTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getproviderTypes() {
		return providerTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpatientTypes() {
		return patientTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CjmlmetamodelFactory getCjmlmetamodelFactory() {
		return (CjmlmetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		plannedJourneyEClass = createEClass(PLANNED_JOURNEY);
		createEReference(plannedJourneyEClass, PLANNED_JOURNEY__PLANNED_TOUCHPOINTS);

		actualJourneyEClass = createEClass(ACTUAL_JOURNEY);
		createEReference(actualJourneyEClass, ACTUAL_JOURNEY__ACTUAL_TOUCHPOINTS);
		createEReference(actualJourneyEClass, ACTUAL_JOURNEY__JOURNEY_COMPLIANCE);
		createEReference(actualJourneyEClass, ACTUAL_JOURNEY__JOURNEY_EXPERIENCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__JOURNEY_STATUS);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__CONTENT_COMPLIANCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__TIMING_COMPLIANCE);

		customerJourneyEClass = createEClass(CUSTOMER_JOURNEY);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_OPERATORS);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_PHASES);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__END_USER);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__SERVICE_PROVIDER);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__EXTERNAL);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_ID);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_TITLE);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY);

		touchpointEClass = createEClass(TOUCHPOINT);
		createEReference(touchpointEClass, TOUCHPOINT__BACKEND_SYSTEMS);
		createEReference(touchpointEClass, TOUCHPOINT__OBJECTS);
		createEReference(touchpointEClass, TOUCHPOINT__BELONGS_TO);
		createEAttribute(touchpointEClass, TOUCHPOINT__TOUCHPOINT_ID);
		createEAttribute(touchpointEClass, TOUCHPOINT__UNCERTAINTY);
		createEAttribute(touchpointEClass, TOUCHPOINT__COMMENT);

		plannedTouchpointEClass = createEClass(PLANNED_TOUCHPOINT);
		createEAttribute(plannedTouchpointEClass, PLANNED_TOUCHPOINT__DELTA_START_TIME);
		createEAttribute(plannedTouchpointEClass, PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION);

		actualTouchpointEClass = createEClass(ACTUAL_TOUCHPOINT);
		createEAttribute(actualTouchpointEClass, ACTUAL_TOUCHPOINT__TIME_STARTED);
		createEAttribute(actualTouchpointEClass, ACTUAL_TOUCHPOINT__TIME_COMPLETED);
		createEReference(actualTouchpointEClass, ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE);
		createEAttribute(actualTouchpointEClass, ACTUAL_TOUCHPOINT__COMPLIANCE);
		createEReference(actualTouchpointEClass, ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE);

		plannedActionEClass = createEClass(PLANNED_ACTION);
		createEReference(plannedActionEClass, PLANNED_ACTION__INITIATOR);

		plannedCommunicationPointEClass = createEClass(PLANNED_COMMUNICATION_POINT);
		createEReference(plannedCommunicationPointEClass, PLANNED_COMMUNICATION_POINT__INITIATOR);
		createEReference(plannedCommunicationPointEClass, PLANNED_COMMUNICATION_POINT__RECEIVER);
		createEReference(plannedCommunicationPointEClass, PLANNED_COMMUNICATION_POINT__CHANNEL);
		createEReference(plannedCommunicationPointEClass, PLANNED_COMMUNICATION_POINT__MESSAGE);

		actualCommunicationPointEClass = createEClass(ACTUAL_COMMUNICATION_POINT);
		createEAttribute(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__TIME_ORIGINATED);
		createEAttribute(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__TIME_AVAILABLE);
		createEAttribute(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__TIME_CONSUMED);
		createEReference(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__INITIATOR);
		createEReference(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__RECEIVER);
		createEReference(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__CHANNEL);
		createEReference(actualCommunicationPointEClass, ACTUAL_COMMUNICATION_POINT__MESSAGE);

		actualActionEClass = createEClass(ACTUAL_ACTION);
		createEReference(actualActionEClass, ACTUAL_ACTION__INITIATOR);

		journeyOperatorEClass = createEClass(JOURNEY_OPERATOR);
		createEReference(journeyOperatorEClass, JOURNEY_OPERATOR__BELONGS_TO);
		createEAttribute(journeyOperatorEClass, JOURNEY_OPERATOR__OPERATOR_ID);

		concurrencyEClass = createEClass(CONCURRENCY);
		createEAttribute(concurrencyEClass, CONCURRENCY__CONCURRENCYPATHS);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__DECISION_PATHS);
		createEAttribute(decisionEClass, DECISION__CONDITION);
		createEReference(decisionEClass, DECISION__DECISION_MAKER);

		experienceEClass = createEClass(EXPERIENCE);
		createEAttribute(experienceEClass, EXPERIENCE__END_USER_RATING);
		createEAttribute(experienceEClass, EXPERIENCE__END_USER_EXPERIENCE_RATING);

		backendSystemEClass = createEClass(BACKEND_SYSTEM);
		createEAttribute(backendSystemEClass, BACKEND_SYSTEM__SYSTEM_ID);
		createEAttribute(backendSystemEClass, BACKEND_SYSTEM__SYSTEM_NAME);
		createEAttribute(backendSystemEClass, BACKEND_SYSTEM__SYSTEM_DESCRIPTION);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__OBJECT_ID);
		createEAttribute(objectEClass, OBJECT__OBJECT_NAME);
		createEAttribute(objectEClass, OBJECT__OBJECT_DESCRIPTION);
		createEAttribute(objectEClass, OBJECT__IS_VIRTUAL);

		journeyPhaseEClass = createEClass(JOURNEY_PHASE);
		createEAttribute(journeyPhaseEClass, JOURNEY_PHASE__PHASE_NAME);
		createEAttribute(journeyPhaseEClass, JOURNEY_PHASE__PHASE_DESCRIPTION);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__ACTOR_ID);
		createEAttribute(actorEClass, ACTOR__ACTOR_NAME);
		createEAttribute(actorEClass, ACTOR__ACTOR_DESCRIPTION);
		createEAttribute(actorEClass, ACTOR__IS_VIRTUAL);

		endUserEClass = createEClass(END_USER);
		createEAttribute(endUserEClass, END_USER__IS_MAIN);

		serviceProviderEClass = createEClass(SERVICE_PROVIDER);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__COMPANY_NAME);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DEPARTMENT);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__POSITION);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__TYPE);

		externalEClass = createEClass(EXTERNAL);

		initiatorEClass = createEClass(INITIATOR);
		createEReference(initiatorEClass, INITIATOR__REFERS_TO);
		createEAttribute(initiatorEClass, INITIATOR__INITIATOR_LABEL);

		receiverEClass = createEClass(RECEIVER);
		createEReference(receiverEClass, RECEIVER__REFERS_TO);
		createEAttribute(receiverEClass, RECEIVER__RECEIVER_LABEL);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL);
		createEAttribute(channelEClass, CHANNEL__COM_TYPE);
		createEAttribute(channelEClass, CHANNEL__IS_SYNCHRONOUS);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__CONTENT);
		createEAttribute(messageEClass, MESSAGE__KEY_CONTENT);
		createEAttribute(messageEClass, MESSAGE__DERIVED_KEY_CONTENT);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__LIKES);
		createEAttribute(customerEClass, CUSTOMER__FRUSTRATIONS);
		createEAttribute(customerEClass, CUSTOMER__PREFERRED_CHANNELS);

		userEClass = createEClass(USER);

		citizenEClass = createEClass(CITIZEN);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__PATIENT_TYPE);
		createEAttribute(patientEClass, PATIENT__DIAGNOSIS);
		createEAttribute(patientEClass, PATIENT__INSURANCE_NAME);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__COMPANY_NAME);
		createEAttribute(employeeEClass, EMPLOYEE__DEPARTMENT);
		createEAttribute(employeeEClass, EMPLOYEE__POSITION);
		createEAttribute(employeeEClass, EMPLOYEE__YEARS_EXPERIENCE);

		// Create enums
		complianceValuesEEnum = createEEnum(COMPLIANCE_VALUES);
		statusEEnum = createEEnum(STATUS);
		channelsEEnum = createEEnum(CHANNELS);
		uncertaintyValuesEEnum = createEEnum(UNCERTAINTY_VALUES);
		comTypesEEnum = createEEnum(COM_TYPES);
		providerTypesEEnum = createEEnum(PROVIDER_TYPES);
		patientTypesEEnum = createEEnum(PATIENT_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		plannedJourneyEClass.getESuperTypes().add(this.getCustomerJourney());
		actualJourneyEClass.getESuperTypes().add(this.getCustomerJourney());
		plannedTouchpointEClass.getESuperTypes().add(this.getTouchpoint());
		actualTouchpointEClass.getESuperTypes().add(this.getTouchpoint());
		plannedActionEClass.getESuperTypes().add(this.getPlannedTouchpoint());
		plannedCommunicationPointEClass.getESuperTypes().add(this.getPlannedTouchpoint());
		actualCommunicationPointEClass.getESuperTypes().add(this.getActualTouchpoint());
		actualActionEClass.getESuperTypes().add(this.getActualTouchpoint());
		concurrencyEClass.getESuperTypes().add(this.getJourneyOperator());
		decisionEClass.getESuperTypes().add(this.getJourneyOperator());
		endUserEClass.getESuperTypes().add(this.getActor());
		serviceProviderEClass.getESuperTypes().add(this.getActor());
		externalEClass.getESuperTypes().add(this.getActor());
		customerEClass.getESuperTypes().add(this.getEndUser());
		userEClass.getESuperTypes().add(this.getEndUser());
		citizenEClass.getESuperTypes().add(this.getEndUser());
		patientEClass.getESuperTypes().add(this.getEndUser());
		employeeEClass.getESuperTypes().add(this.getEndUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(plannedJourneyEClass, PlannedJourney.class, "PlannedJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlannedJourney_PlannedTouchpoints(), this.getPlannedTouchpoint(), null, "plannedTouchpoints", null, 2, -1, PlannedJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actualJourneyEClass, ActualJourney.class, "ActualJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualJourney_ActualTouchpoints(), this.getActualTouchpoint(), null, "actualTouchpoints", null, 2, -1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualJourney_JourneyCompliance(), this.getPlannedJourney(), null, "journeyCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualJourney_JourneyExperience(), this.getExperience(), null, "journeyExperience", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_JourneyStatus(), this.getstatus(), "journeyStatus", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_ContentCompliance(), theEcorePackage.getEBoolean(), "contentCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_SequenceCompliance(), theEcorePackage.getEBoolean(), "sequenceCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_TimingCompliance(), theEcorePackage.getEBoolean(), "timingCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerJourneyEClass, CustomerJourney.class, "CustomerJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerJourney_JourneyOperators(), this.getJourneyOperator(), null, "journeyOperators", null, 0, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_JourneyPhases(), this.getJourneyPhase(), null, "journeyPhases", null, 0, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_EndUser(), this.getEndUser(), null, "endUser", null, 1, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_ServiceProvider(), this.getServiceProvider(), null, "serviceProvider", null, 1, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_External(), this.getExternal(), null, "external", null, 0, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyID(), theEcorePackage.getEString(), "journeyID", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyTitle(), theEcorePackage.getEString(), "journeyTitle", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyShortSummary(), theEcorePackage.getEString(), "journeyShortSummary", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyLongSummary(), theEcorePackage.getEString(), "journeyLongSummary", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchpointEClass, Touchpoint.class, "Touchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTouchpoint_BackendSystems(), this.getBackendSystem(), null, "backendSystems", null, 0, -1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchpoint_Objects(), this.getObject(), null, "objects", null, 0, -1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchpoint_BelongsTo(), this.getJourneyPhase(), null, "belongsTo", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_TouchpointID(), theEcorePackage.getEString(), "touchpointID", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Uncertainty(), this.getuncertaintyValues(), "uncertainty", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannedTouchpointEClass, PlannedTouchpoint.class, "PlannedTouchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlannedTouchpoint_DeltaStartTime(), theEcorePackage.getEFloat(), "deltaStartTime", null, 0, -1, PlannedTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlannedTouchpoint_TouchpointDuration(), theEcorePackage.getEFloat(), "touchpointDuration", null, 0, -1, PlannedTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actualTouchpointEClass, ActualTouchpoint.class, "ActualTouchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActualTouchpoint_TimeStarted(), theEcorePackage.getEDate(), "timeStarted", null, 0, 1, ActualTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualTouchpoint_TimeCompleted(), theEcorePackage.getEDate(), "timeCompleted", null, 0, 1, ActualTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualTouchpoint_TouchpointCompliance(), this.getPlannedTouchpoint(), null, "touchpointCompliance", null, 0, 1, ActualTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualTouchpoint_Compliance(), this.getcomplianceValues(), "compliance", null, 0, 1, ActualTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualTouchpoint_TouchpointExperience(), this.getExperience(), null, "touchpointExperience", null, 0, 1, ActualTouchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannedActionEClass, PlannedAction.class, "PlannedAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlannedAction_Initiator(), this.getInitiator(), null, "initiator", null, 1, 1, PlannedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannedCommunicationPointEClass, PlannedCommunicationPoint.class, "PlannedCommunicationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlannedCommunicationPoint_Initiator(), this.getInitiator(), null, "initiator", null, 1, 1, PlannedCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlannedCommunicationPoint_Receiver(), this.getReceiver(), null, "receiver", null, 1, 1, PlannedCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlannedCommunicationPoint_Channel(), this.getChannel(), null, "channel", null, 1, 1, PlannedCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlannedCommunicationPoint_Message(), this.getMessage(), null, "message", null, 1, 1, PlannedCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actualCommunicationPointEClass, ActualCommunicationPoint.class, "ActualCommunicationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActualCommunicationPoint_TimeOriginated(), theEcorePackage.getEDate(), "timeOriginated", null, 0, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualCommunicationPoint_TimeAvailable(), theEcorePackage.getEDate(), "timeAvailable", null, 0, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualCommunicationPoint_TimeConsumed(), theEcorePackage.getEDate(), "timeConsumed", null, 0, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualCommunicationPoint_Initiator(), this.getInitiator(), null, "initiator", null, 1, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualCommunicationPoint_Receiver(), this.getReceiver(), null, "receiver", null, 1, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualCommunicationPoint_Channel(), this.getChannel(), null, "channel", null, 1, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualCommunicationPoint_Message(), this.getMessage(), null, "message", null, 1, 1, ActualCommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actualActionEClass, ActualAction.class, "ActualAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualAction_Initiator(), this.getInitiator(), null, "initiator", null, 1, 1, ActualAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyOperatorEClass, JourneyOperator.class, "JourneyOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourneyOperator_BelongsTo(), this.getJourneyPhase(), null, "belongsTo", null, 0, 1, JourneyOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyOperator_OperatorID(), theEcorePackage.getEString(), "operatorID", null, 0, 1, JourneyOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concurrencyEClass, Concurrency.class, "Concurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcurrency_Concurrencypaths(), theEcorePackage.getEInt(), "concurrencypaths", null, 0, -1, Concurrency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_DecisionPaths(), theEcorePackage.getEInt(), "decisionPaths", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_DecisionMaker(), this.getActor(), null, "decisionMaker", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experienceEClass, Experience.class, "Experience", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperience_EndUserRating(), theEcorePackage.getEString(), "EndUserRating", null, 0, 1, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperience_EndUserExperienceRating(), theEcorePackage.getEInt(), "EndUserExperienceRating", null, 1, 5, Experience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backendSystemEClass, BackendSystem.class, "BackendSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackendSystem_SystemID(), theEcorePackage.getEString(), "systemID", null, 0, 1, BackendSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackendSystem_SystemName(), theEcorePackage.getEString(), "systemName", null, 0, 1, BackendSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackendSystem_SystemDescription(), theEcorePackage.getEString(), "systemDescription", null, 0, 1, BackendSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, cjmlmetamodel.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_ObjectID(), theEcorePackage.getEString(), "objectID", null, 0, 1, cjmlmetamodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_ObjectName(), theEcorePackage.getEString(), "objectName", null, 0, 1, cjmlmetamodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_ObjectDescription(), theEcorePackage.getEString(), "objectDescription", null, 0, 1, cjmlmetamodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_IsVirtual(), theEcorePackage.getEBoolean(), "isVirtual", null, 0, 1, cjmlmetamodel.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyPhaseEClass, JourneyPhase.class, "JourneyPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyPhase_PhaseName(), theEcorePackage.getEString(), "phaseName", null, 0, 1, JourneyPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyPhase_PhaseDescription(), theEcorePackage.getEString(), "phaseDescription", null, 0, 1, JourneyPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_ActorID(), theEcorePackage.getEString(), "actorID", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorName(), theEcorePackage.getEString(), "actorName", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorDescription(), theEcorePackage.getEString(), "actorDescription", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_IsVirtual(), theEcorePackage.getEBooleanObject(), "isVirtual", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endUserEClass, EndUser.class, "EndUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndUser_IsMain(), theEcorePackage.getEBoolean(), "isMain", null, 0, 1, EndUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProvider_CompanyName(), theEcorePackage.getEString(), "companyName", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_Department(), theEcorePackage.getEString(), "department", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_Position(), theEcorePackage.getEString(), "position", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_Type(), this.getproviderTypes(), "type", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initiatorEClass, Initiator.class, "Initiator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitiator_RefersTo(), this.getActor(), null, "refersTo", null, 1, 1, Initiator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitiator_InitiatorLabel(), theEcorePackage.getEString(), "initiatorLabel", null, 0, 1, Initiator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiver_RefersTo(), this.getActor(), null, "refersTo", null, 1, 1, Receiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReceiver_ReceiverLabel(), theEcorePackage.getEString(), "receiverLabel", null, 0, 1, Receiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Channel(), this.getchannels(), "channel", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_ComType(), this.getcomTypes(), "comType", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_IsSynchronous(), theEcorePackage.getEBoolean(), "isSynchronous", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_KeyContent(), theEcorePackage.getEString(), "keyContent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_DerivedKeyContent(), theEcorePackage.getEString(), "derivedKeyContent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Likes(), theEcorePackage.getEString(), "likes", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_Frustrations(), theEcorePackage.getEString(), "frustrations", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_PreferredChannels(), this.getchannels(), "preferredChannels", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(citizenEClass, Citizen.class, "Citizen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_PatientType(), this.getpatientTypes(), "patientType", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Diagnosis(), theEcorePackage.getEString(), "diagnosis", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_InsuranceName(), theEcorePackage.getEString(), "insuranceName", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_CompanyName(), theEcorePackage.getEString(), "companyName", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Department(), theEcorePackage.getEString(), "department", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Position(), theEcorePackage.getEString(), "position", null, 0, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_YearsExperience(), theEcorePackage.getEInt(), "yearsExperience", null, 18, 100, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(complianceValuesEEnum, complianceValues.class, "complianceValues");
		addEEnumLiteral(complianceValuesEEnum, complianceValues.PLANNED);
		addEEnumLiteral(complianceValuesEEnum, complianceValues.ADHOC);
		addEEnumLiteral(complianceValuesEEnum, complianceValues.MISSING);
		addEEnumLiteral(complianceValuesEEnum, complianceValues.FAILING);

		initEEnum(statusEEnum, status.class, "status");
		addEEnumLiteral(statusEEnum, status.IN_PROGRESS);
		addEEnumLiteral(statusEEnum, status.COMPLETED);
		addEEnumLiteral(statusEEnum, status.ABORTED);

		initEEnum(channelsEEnum, channels.class, "channels");
		addEEnumLiteral(channelsEEnum, channels.TELEPHONE);
		addEEnumLiteral(channelsEEnum, channels.SMS);
		addEEnumLiteral(channelsEEnum, channels.EMAIL);
		addEEnumLiteral(channelsEEnum, channels.INTERNET);
		addEEnumLiteral(channelsEEnum, channels.FACE_TO_FACE);
		addEEnumLiteral(channelsEEnum, channels.PAYMENT);
		addEEnumLiteral(channelsEEnum, channels.PACKAGE);
		addEEnumLiteral(channelsEEnum, channels.LETTER);
		addEEnumLiteral(channelsEEnum, channels.INVOICE);
		addEEnumLiteral(channelsEEnum, channels.SOCIAL_MEDIA_MESSAGE_OR_INTERACTION);
		addEEnumLiteral(channelsEEnum, channels.CALL_CENTER);
		addEEnumLiteral(channelsEEnum, channels.CHAT);
		addEEnumLiteral(channelsEEnum, channels.SHOPPING);
		addEEnumLiteral(channelsEEnum, channels.ONLINE_SHOPPING);
		addEEnumLiteral(channelsEEnum, channels.LOGISTICS);
		addEEnumLiteral(channelsEEnum, channels.SERVICE_DESK);
		addEEnumLiteral(channelsEEnum, channels.SHOP_COUNTER);
		addEEnumLiteral(channelsEEnum, channels.APP_ON_PC);
		addEEnumLiteral(channelsEEnum, channels.MESSAGE_SERVICE);
		addEEnumLiteral(channelsEEnum, channels.SMART_PHONE);

		initEEnum(uncertaintyValuesEEnum, uncertaintyValues.class, "uncertaintyValues");
		addEEnumLiteral(uncertaintyValuesEEnum, uncertaintyValues.UNCERTAIN_OCCURRENCE);
		addEEnumLiteral(uncertaintyValuesEEnum, uncertaintyValues.UNCERTAIN_NO_OF_OCCURRENCE);
		addEEnumLiteral(uncertaintyValuesEEnum, uncertaintyValues.UNCERTAIN_CHANNEL);
		addEEnumLiteral(uncertaintyValuesEEnum, uncertaintyValues.UNCERTAIN_INITIATOR);

		initEEnum(comTypesEEnum, comTypes.class, "comTypes");
		addEEnumLiteral(comTypesEEnum, comTypes.UNICAST);
		addEEnumLiteral(comTypesEEnum, comTypes.MULTICAST);
		addEEnumLiteral(comTypesEEnum, comTypes.BROADCAST);

		initEEnum(providerTypesEEnum, providerTypes.class, "providerTypes");
		addEEnumLiteral(providerTypesEEnum, providerTypes.TYPE1_INTERNAL_MAIN);
		addEEnumLiteral(providerTypesEEnum, providerTypes.TYPE2_INTERNAL_SHARED);
		addEEnumLiteral(providerTypesEEnum, providerTypes.TYPE3_EXTERNAL);

		initEEnum(patientTypesEEnum, patientTypes.class, "patientTypes");
		addEEnumLiteral(patientTypesEEnum, patientTypes.IN_PATIENT);
		addEEnumLiteral(patientTypesEEnum, patientTypes.OUT_PATIENT);
		addEEnumLiteral(patientTypesEEnum, patientTypes.DAY_CASE);
		addEEnumLiteral(patientTypesEEnum, patientTypes.DAY_PATIENT);
		addEEnumLiteral(patientTypesEEnum, patientTypes.AMBULATORY_EMERGENCY_CARE);
		addEEnumLiteral(patientTypesEEnum, patientTypes.COMMUNITY_CARE);
		addEEnumLiteral(patientTypesEEnum, patientTypes.INTENSIVE_CARE);

		// Create resource
		createResource(eNS_URI);
	}

} //CjmlmetamodelPackageImpl
