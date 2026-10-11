/**
 */
package sosym.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SosymPackageImpl extends EPackageImpl implements SosymPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyGroupEClass = null;

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
	private EClass touchpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerJourneyElementEClass = null;

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
	private EClass journeyOperatorEClass = null;

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
	private EClass concurrencyEClass = null;

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
	private EClass externalEClass = null;

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
	private EClass endUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPointEClass = null;

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
	private EClass backendSystemEClass = null;

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
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum euTypesEEnum = null;

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
	private EEnum uncertaintyValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelsEEnum = null;

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
	 * @see sosym.SosymPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SosymPackageImpl() {
		super(eNS_URI, SosymFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SosymPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SosymPackage init() {
		if (isInited) return (SosymPackage)EPackage.Registry.INSTANCE.getEPackage(SosymPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSosymPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SosymPackageImpl theSosymPackage = registeredSosymPackage instanceof SosymPackageImpl ? (SosymPackageImpl)registeredSosymPackage : new SosymPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSosymPackage.createPackageContents();

		// Initialize created meta-data
		theSosymPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSosymPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SosymPackage.eNS_URI, theSosymPackage);
		return theSosymPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProcess() {
		return serviceProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceProcess_Groups() {
		return (EReference)serviceProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyGroup() {
		return journeyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyGroup_GroupID() {
		return (EAttribute)journeyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyGroup_GroupDescription() {
		return (EAttribute)journeyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyGroup_NumberofJourneys() {
		return (EAttribute)journeyGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneyGroup_Journeys() {
		return (EReference)journeyGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneyGroup_DecisionPaths() {
		return (EReference)journeyGroupEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getCustomerJourney_JourneyID() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyTitle() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyShortSummary() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyLongSummary() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_Elements() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_Phases() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_ConcurrentPaths() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_EndUsers() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_Providers() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_Externals() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(9);
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
	public EClass getActualJourney() {
		return actualJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_JourneyCompliance() {
		return (EReference)actualJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_JourneyStatus() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_ContentCompliance() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_SequenceCompliance() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_EndUserExperience() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_EndUserExperienceRating() {
		return (EAttribute)actualJourneyEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getTouchpoint_TouchpointID() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Compliance() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Uncertainty() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_EndUserExperience() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_EndUserExperienceRating() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_TimeStarted() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_TimeCompleted() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Comment() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_Objects() {
		return (EReference)touchpointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_Systems() {
		return (EReference)touchpointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerJourneyElement() {
		return customerJourneyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourneyElement_BelongsTo() {
		return (EReference)customerJourneyElementEClass.getEStructuralFeatures().get(0);
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
	public EClass getJourneyOperator() {
		return journeyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyOperator_OperatorID() {
		return (EAttribute)journeyOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneyOperator_BelongsTo() {
		return (EReference)journeyOperatorEClass.getEStructuralFeatures().get(1);
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
	public EClass getConcurrency() {
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcurrency_ConcurrencyPaths() {
		return (EAttribute)concurrencyEClass.getEStructuralFeatures().get(0);
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
	public EClass getExternal() {
		return externalEClass;
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
	public EClass getEndUser() {
		return endUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUser_EndUserType() {
		return (EAttribute)endUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_HasInitiator() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPoint() {
		return communicationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPoint_TimeOriginated() {
		return (EAttribute)communicationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPoint_TimeReceived() {
		return (EAttribute)communicationPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationPoint_TimeConsumed() {
		return (EAttribute)communicationPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPoint_HasInitiator() {
		return (EReference)communicationPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPoint_HasReceiver() {
		return (EReference)communicationPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPoint_HasChannel() {
		return (EReference)communicationPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPoint_HasMessage() {
		return (EReference)communicationPointEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getObject_IsVirtual() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectDescription() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getChannel_ChannelName() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMessage_KeyMessage() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageContent() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEUTypes() {
		return euTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplianceValues() {
		return complianceValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUncertaintyValues() {
		return uncertaintyValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannels() {
		return channelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosymFactory getSosymFactory() {
		return (SosymFactory)getEFactoryInstance();
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
		serviceProcessEClass = createEClass(SERVICE_PROCESS);
		createEReference(serviceProcessEClass, SERVICE_PROCESS__GROUPS);

		journeyGroupEClass = createEClass(JOURNEY_GROUP);
		createEAttribute(journeyGroupEClass, JOURNEY_GROUP__GROUP_ID);
		createEAttribute(journeyGroupEClass, JOURNEY_GROUP__GROUP_DESCRIPTION);
		createEAttribute(journeyGroupEClass, JOURNEY_GROUP__NUMBEROF_JOURNEYS);
		createEReference(journeyGroupEClass, JOURNEY_GROUP__JOURNEYS);
		createEReference(journeyGroupEClass, JOURNEY_GROUP__DECISION_PATHS);

		customerJourneyEClass = createEClass(CUSTOMER_JOURNEY);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_ID);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_TITLE);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__ELEMENTS);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__PHASES);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__CONCURRENT_PATHS);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__END_USERS);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__PROVIDERS);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__EXTERNALS);

		plannedJourneyEClass = createEClass(PLANNED_JOURNEY);

		actualJourneyEClass = createEClass(ACTUAL_JOURNEY);
		createEReference(actualJourneyEClass, ACTUAL_JOURNEY__JOURNEY_COMPLIANCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__JOURNEY_STATUS);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__CONTENT_COMPLIANCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__END_USER_EXPERIENCE);
		createEAttribute(actualJourneyEClass, ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING);

		touchpointEClass = createEClass(TOUCHPOINT);
		createEAttribute(touchpointEClass, TOUCHPOINT__TOUCHPOINT_ID);
		createEAttribute(touchpointEClass, TOUCHPOINT__COMPLIANCE);
		createEAttribute(touchpointEClass, TOUCHPOINT__UNCERTAINTY);
		createEAttribute(touchpointEClass, TOUCHPOINT__END_USER_EXPERIENCE);
		createEAttribute(touchpointEClass, TOUCHPOINT__END_USER_EXPERIENCE_RATING);
		createEAttribute(touchpointEClass, TOUCHPOINT__TIME_STARTED);
		createEAttribute(touchpointEClass, TOUCHPOINT__TIME_COMPLETED);
		createEAttribute(touchpointEClass, TOUCHPOINT__COMMENT);
		createEReference(touchpointEClass, TOUCHPOINT__OBJECTS);
		createEReference(touchpointEClass, TOUCHPOINT__SYSTEMS);

		customerJourneyElementEClass = createEClass(CUSTOMER_JOURNEY_ELEMENT);
		createEReference(customerJourneyElementEClass, CUSTOMER_JOURNEY_ELEMENT__BELONGS_TO);

		journeyPhaseEClass = createEClass(JOURNEY_PHASE);
		createEAttribute(journeyPhaseEClass, JOURNEY_PHASE__PHASE_NAME);
		createEAttribute(journeyPhaseEClass, JOURNEY_PHASE__PHASE_DESCRIPTION);

		journeyOperatorEClass = createEClass(JOURNEY_OPERATOR);
		createEAttribute(journeyOperatorEClass, JOURNEY_OPERATOR__OPERATOR_ID);
		createEReference(journeyOperatorEClass, JOURNEY_OPERATOR__BELONGS_TO);

		decisionEClass = createEClass(DECISION);
		createEAttribute(decisionEClass, DECISION__DECISION_PATHS);
		createEAttribute(decisionEClass, DECISION__CONDITION);
		createEReference(decisionEClass, DECISION__DECISION_MAKER);

		concurrencyEClass = createEClass(CONCURRENCY);
		createEAttribute(concurrencyEClass, CONCURRENCY__CONCURRENCY_PATHS);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__ACTOR_ID);
		createEAttribute(actorEClass, ACTOR__ACTOR_NAME);
		createEAttribute(actorEClass, ACTOR__ACTOR_DESCRIPTION);
		createEAttribute(actorEClass, ACTOR__IS_VIRTUAL);

		externalEClass = createEClass(EXTERNAL);

		serviceProviderEClass = createEClass(SERVICE_PROVIDER);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__COMPANY_NAME);
		createEAttribute(serviceProviderEClass, SERVICE_PROVIDER__DEPARTMENT);

		endUserEClass = createEClass(END_USER);
		createEAttribute(endUserEClass, END_USER__END_USER_TYPE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__HAS_INITIATOR);

		communicationPointEClass = createEClass(COMMUNICATION_POINT);
		createEAttribute(communicationPointEClass, COMMUNICATION_POINT__TIME_ORIGINATED);
		createEAttribute(communicationPointEClass, COMMUNICATION_POINT__TIME_RECEIVED);
		createEAttribute(communicationPointEClass, COMMUNICATION_POINT__TIME_CONSUMED);
		createEReference(communicationPointEClass, COMMUNICATION_POINT__HAS_INITIATOR);
		createEReference(communicationPointEClass, COMMUNICATION_POINT__HAS_RECEIVER);
		createEReference(communicationPointEClass, COMMUNICATION_POINT__HAS_CHANNEL);
		createEReference(communicationPointEClass, COMMUNICATION_POINT__HAS_MESSAGE);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__OBJECT_ID);
		createEAttribute(objectEClass, OBJECT__OBJECT_NAME);
		createEAttribute(objectEClass, OBJECT__IS_VIRTUAL);
		createEAttribute(objectEClass, OBJECT__OBJECT_DESCRIPTION);

		backendSystemEClass = createEClass(BACKEND_SYSTEM);
		createEAttribute(backendSystemEClass, BACKEND_SYSTEM__SYSTEM_ID);
		createEAttribute(backendSystemEClass, BACKEND_SYSTEM__SYSTEM_NAME);
		createEAttribute(backendSystemEClass, BACKEND_SYSTEM__SYSTEM_DESCRIPTION);

		initiatorEClass = createEClass(INITIATOR);
		createEReference(initiatorEClass, INITIATOR__REFERS_TO);
		createEAttribute(initiatorEClass, INITIATOR__INITIATOR_LABEL);

		receiverEClass = createEClass(RECEIVER);
		createEReference(receiverEClass, RECEIVER__REFERS_TO);
		createEAttribute(receiverEClass, RECEIVER__RECEIVER_LABEL);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL_NAME);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__KEY_MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_CONTENT);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		euTypesEEnum = createEEnum(EU_TYPES);
		complianceValuesEEnum = createEEnum(COMPLIANCE_VALUES);
		uncertaintyValuesEEnum = createEEnum(UNCERTAINTY_VALUES);
		channelsEEnum = createEEnum(CHANNELS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		plannedJourneyEClass.getESuperTypes().add(this.getCustomerJourney());
		actualJourneyEClass.getESuperTypes().add(this.getCustomerJourney());
		touchpointEClass.getESuperTypes().add(this.getCustomerJourneyElement());
		decisionEClass.getESuperTypes().add(this.getJourneyOperator());
		concurrencyEClass.getESuperTypes().add(this.getJourneyOperator());
		externalEClass.getESuperTypes().add(this.getActor());
		serviceProviderEClass.getESuperTypes().add(this.getActor());
		endUserEClass.getESuperTypes().add(this.getActor());
		actionEClass.getESuperTypes().add(this.getTouchpoint());
		communicationPointEClass.getESuperTypes().add(this.getTouchpoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceProcessEClass, ServiceProcess.class, "ServiceProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceProcess_Groups(), this.getJourneyGroup(), null, "groups", null, 1, -1, ServiceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyGroupEClass, JourneyGroup.class, "JourneyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyGroup_GroupID(), ecorePackage.getEString(), "groupID", null, 0, 1, JourneyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyGroup_GroupDescription(), ecorePackage.getEString(), "groupDescription", null, 0, 1, JourneyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyGroup_NumberofJourneys(), ecorePackage.getEInt(), "numberofJourneys", null, 0, 1, JourneyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyGroup_Journeys(), this.getCustomerJourney(), null, "journeys", null, 1, -1, JourneyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyGroup_DecisionPaths(), this.getDecision(), null, "decisionPaths", null, 0, -1, JourneyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerJourneyEClass, CustomerJourney.class, "CustomerJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerJourney_JourneyID(), ecorePackage.getEString(), "journeyID", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyTitle(), ecorePackage.getEString(), "journeyTitle", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyShortSummary(), ecorePackage.getEString(), "journeyShortSummary", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_JourneyLongSummary(), ecorePackage.getEString(), "journeyLongSummary", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_Elements(), this.getCustomerJourneyElement(), null, "elements", null, 2, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_Phases(), this.getJourneyPhase(), null, "phases", null, 0, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_ConcurrentPaths(), this.getConcurrency(), null, "concurrentPaths", null, 0, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_EndUsers(), this.getEndUser(), null, "endUsers", null, 1, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_Providers(), this.getServiceProvider(), null, "providers", null, 1, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_Externals(), this.getExternal(), null, "externals", null, 0, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannedJourneyEClass, PlannedJourney.class, "PlannedJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualJourneyEClass, ActualJourney.class, "ActualJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualJourney_JourneyCompliance(), this.getPlannedJourney(), null, "journeyCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_JourneyStatus(), this.getStatus(), "journeyStatus", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_ContentCompliance(), ecorePackage.getEBoolean(), "contentCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_SequenceCompliance(), ecorePackage.getEBoolean(), "sequenceCompliance", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_EndUserExperience(), ecorePackage.getEString(), "endUserExperience", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActualJourney_EndUserExperienceRating(), ecorePackage.getEInt(), "endUserExperienceRating", null, 0, 1, ActualJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchpointEClass, Touchpoint.class, "Touchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchpoint_TouchpointID(), ecorePackage.getEString(), "touchpointID", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Compliance(), this.getComplianceValues(), "compliance", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Uncertainty(), this.getUncertaintyValues(), "uncertainty", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_EndUserExperience(), ecorePackage.getEString(), "endUserExperience", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_EndUserExperienceRating(), ecorePackage.getEInt(), "endUserExperienceRating", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_TimeStarted(), ecorePackage.getEDate(), "timeStarted", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_TimeCompleted(), ecorePackage.getEDate(), "timeCompleted", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchpoint_Objects(), this.getObject(), null, "objects", null, 0, -1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchpoint_Systems(), this.getBackendSystem(), null, "systems", null, 0, -1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerJourneyElementEClass, CustomerJourneyElement.class, "CustomerJourneyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerJourneyElement_BelongsTo(), this.getJourneyPhase(), null, "belongsTo", null, 0, 1, CustomerJourneyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyPhaseEClass, JourneyPhase.class, "JourneyPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyPhase_PhaseName(), ecorePackage.getEString(), "phaseName", null, 0, 1, JourneyPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyPhase_PhaseDescription(), ecorePackage.getEString(), "phaseDescription", null, 0, 1, JourneyPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyOperatorEClass, JourneyOperator.class, "JourneyOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyOperator_OperatorID(), ecorePackage.getEString(), "operatorID", null, 0, 1, JourneyOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyOperator_BelongsTo(), this.getJourneyPhase(), null, "belongsTo", null, 0, 1, JourneyOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecision_DecisionPaths(), ecorePackage.getEInt(), "decisionPaths", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_DecisionMaker(), this.getActor(), null, "decisionMaker", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concurrencyEClass, Concurrency.class, "Concurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcurrency_ConcurrencyPaths(), ecorePackage.getEInt(), "concurrencyPaths", null, 0, 1, Concurrency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_ActorID(), ecorePackage.getEString(), "actorID", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorName(), ecorePackage.getEString(), "actorName", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorDescription(), ecorePackage.getEString(), "actorDescription", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_IsVirtual(), ecorePackage.getEBoolean(), "isVirtual", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProvider_CompanyName(), ecorePackage.getEString(), "companyName", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceProvider_Department(), ecorePackage.getEString(), "department", null, 0, 1, ServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endUserEClass, EndUser.class, "EndUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndUser_EndUserType(), this.getEUTypes(), "endUserType", null, 0, 1, EndUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_HasInitiator(), this.getInitiator(), null, "hasInitiator", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationPointEClass, CommunicationPoint.class, "CommunicationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationPoint_TimeOriginated(), ecorePackage.getEDate(), "timeOriginated", null, 0, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPoint_TimeReceived(), ecorePackage.getEDate(), "timeReceived", null, 0, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPoint_TimeConsumed(), ecorePackage.getEDate(), "timeConsumed", null, 0, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationPoint_HasInitiator(), this.getInitiator(), null, "hasInitiator", null, 1, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationPoint_HasReceiver(), this.getReceiver(), null, "hasReceiver", null, 1, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationPoint_HasChannel(), this.getChannel(), null, "hasChannel", null, 1, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationPoint_HasMessage(), this.getMessage(), null, "hasMessage", null, 1, 1, CommunicationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, sosym.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_ObjectID(), ecorePackage.getEString(), "objectID", null, 0, 1, sosym.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_ObjectName(), ecorePackage.getEString(), "objectName", null, 0, 1, sosym.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_IsVirtual(), ecorePackage.getEBoolean(), "isVirtual", null, 0, 1, sosym.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_ObjectDescription(), ecorePackage.getEString(), "objectDescription", null, 0, 1, sosym.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backendSystemEClass, BackendSystem.class, "BackendSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackendSystem_SystemID(), ecorePackage.getEString(), "systemID", null, 0, 1, BackendSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackendSystem_SystemName(), ecorePackage.getEString(), "systemName", null, 0, 1, BackendSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackendSystem_SystemDescription(), ecorePackage.getEString(), "systemDescription", null, 0, 1, BackendSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initiatorEClass, Initiator.class, "Initiator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitiator_RefersTo(), this.getActor(), null, "refersTo", null, 1, 1, Initiator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitiator_InitiatorLabel(), ecorePackage.getEString(), "initiatorLabel", null, 0, 1, Initiator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiver_RefersTo(), this.getActor(), null, "refersTo", null, 1, 1, Receiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReceiver_ReceiverLabel(), ecorePackage.getEString(), "receiverLabel", null, 0, 1, Receiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_ChannelName(), this.getChannels(), "channelName", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_KeyMessage(), ecorePackage.getEString(), "keyMessage", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_MessageContent(), ecorePackage.getEString(), "messageContent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.IN_PROGRESS);
		addEEnumLiteral(statusEEnum, Status.COMPLETED);
		addEEnumLiteral(statusEEnum, Status.ABORTED);

		initEEnum(euTypesEEnum, EUTypes.class, "EUTypes");
		addEEnumLiteral(euTypesEEnum, EUTypes.CUSTOMER);
		addEEnumLiteral(euTypesEEnum, EUTypes.USER);
		addEEnumLiteral(euTypesEEnum, EUTypes.CITIZEN);
		addEEnumLiteral(euTypesEEnum, EUTypes.PATIENT);
		addEEnumLiteral(euTypesEEnum, EUTypes.EMPLOYEE);

		initEEnum(complianceValuesEEnum, ComplianceValues.class, "ComplianceValues");
		addEEnumLiteral(complianceValuesEEnum, ComplianceValues.PLANNED);
		addEEnumLiteral(complianceValuesEEnum, ComplianceValues.ADHOC);
		addEEnumLiteral(complianceValuesEEnum, ComplianceValues.MISSING);
		addEEnumLiteral(complianceValuesEEnum, ComplianceValues.FAILING);

		initEEnum(uncertaintyValuesEEnum, UncertaintyValues.class, "UncertaintyValues");
		addEEnumLiteral(uncertaintyValuesEEnum, UncertaintyValues.UNCERTAIN_OCCURRENCE);
		addEEnumLiteral(uncertaintyValuesEEnum, UncertaintyValues.UNCERTAIN_NO_OF_OCCURRENCE);
		addEEnumLiteral(uncertaintyValuesEEnum, UncertaintyValues.UNCERTAIN_CHANNEL);
		addEEnumLiteral(uncertaintyValuesEEnum, UncertaintyValues.UNCERTAIN_INITIATOR);

		initEEnum(channelsEEnum, Channels.class, "Channels");
		addEEnumLiteral(channelsEEnum, Channels.TELEPHONE);
		addEEnumLiteral(channelsEEnum, Channels.SMS);
		addEEnumLiteral(channelsEEnum, Channels.FACE_TO_FACE);
		addEEnumLiteral(channelsEEnum, Channels.INTERNET);
		addEEnumLiteral(channelsEEnum, Channels.EMAIL);

		// Create resource
		createResource(eNS_URI);
	}

} //SosymPackageImpl
