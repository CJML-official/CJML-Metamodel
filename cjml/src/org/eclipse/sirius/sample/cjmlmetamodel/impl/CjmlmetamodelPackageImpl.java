/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelFactory;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;

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
	protected String packageFilename = "cjmlmetamodel.ecore";

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
	private EClass endUserExperienceEClass = null;

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
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#eNS_URI
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
	 * @generated
	 */
	public static CjmlmetamodelPackage init() {
		if (isInited) return (CjmlmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCjmlmetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CjmlmetamodelPackageImpl theCjmlmetamodelPackage = registeredCjmlmetamodelPackage instanceof CjmlmetamodelPackageImpl ? (CjmlmetamodelPackageImpl)registeredCjmlmetamodelPackage : new CjmlmetamodelPackageImpl();

		isInited = true;

		// Load packages
		theCjmlmetamodelPackage.loadPackage();

		// Fix loaded packages
		theCjmlmetamodelPackage.fixPackageContents();

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
		if (plannedJourneyEClass == null) {
			plannedJourneyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(0);
		}
		return plannedJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedJourney_PlannedTouchpoints() {
        return (EReference)getPlannedJourney().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlannedJourney_Comment() {
        return (EAttribute)getPlannedJourney().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualJourney() {
		if (actualJourneyEClass == null) {
			actualJourneyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(1);
		}
		return actualJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_ActualTouchpoints() {
        return (EReference)getActualJourney().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_JourneyCompliance() {
        return (EReference)getActualJourney().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualJourney_JourneyExperience() {
        return (EReference)getActualJourney().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_JourneyStatus() {
        return (EAttribute)getActualJourney().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_PlannedReference() {
        return (EAttribute)getActualJourney().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_ContentCompliance() {
        return (EAttribute)getActualJourney().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_SequenceCompliance() {
        return (EAttribute)getActualJourney().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_TimingCompliance() {
        return (EAttribute)getActualJourney().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualJourney_Comment() {
        return (EAttribute)getActualJourney().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerJourney() {
		if (customerJourneyEClass == null) {
			customerJourneyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(2);
		}
		return customerJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_JourneyOperators() {
        return (EReference)getCustomerJourney().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_JourneyPhases() {
        return (EReference)getCustomerJourney().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_EndUsers() {
        return (EReference)getCustomerJourney().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_ServiceProviders() {
        return (EReference)getCustomerJourney().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_Externals() {
        return (EReference)getCustomerJourney().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyID() {
        return (EAttribute)getCustomerJourney().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyTitle() {
        return (EAttribute)getCustomerJourney().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyShortSummary() {
        return (EAttribute)getCustomerJourney().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_JourneyLongSummary() {
        return (EAttribute)getCustomerJourney().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchpoint() {
		if (touchpointEClass == null) {
			touchpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(3);
		}
		return touchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_Systems() {
        return (EReference)getTouchpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_Objects() {
        return (EReference)getTouchpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchpoint_BelongsTo() {
        return (EReference)getTouchpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_TouchpointID() {
        return (EAttribute)getTouchpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Uncertainty() {
        return (EAttribute)getTouchpoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedTouchpoint() {
		if (plannedTouchpointEClass == null) {
			plannedTouchpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(4);
		}
		return plannedTouchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlannedTouchpoint_DeltaTime() {
        return (EAttribute)getPlannedTouchpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlannedTouchpoint_TouchpointDuration() {
        return (EAttribute)getPlannedTouchpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlannedTouchpoint_Comment() {
        return (EAttribute)getPlannedTouchpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualTouchpoint() {
		if (actualTouchpointEClass == null) {
			actualTouchpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(5);
		}
		return actualTouchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualTouchpoint_TimeStarted() {
        return (EAttribute)getActualTouchpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualTouchpoint_TimeCompleted() {
        return (EAttribute)getActualTouchpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualTouchpoint_TouchpointCompliance() {
        return (EReference)getActualTouchpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualTouchpoint_TouchpointExperience() {
        return (EReference)getActualTouchpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedAction() {
		if (plannedActionEClass == null) {
			plannedActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(6);
		}
		return plannedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedAction_Initiator() {
        return (EReference)getPlannedAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedCommunicationPoint() {
		if (plannedCommunicationPointEClass == null) {
			plannedCommunicationPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(7);
		}
		return plannedCommunicationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Initiator() {
        return (EReference)getPlannedCommunicationPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Receiver() {
        return (EReference)getPlannedCommunicationPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Channel() {
        return (EReference)getPlannedCommunicationPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlannedCommunicationPoint_Message() {
        return (EReference)getPlannedCommunicationPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualCommunicationPoint() {
		if (actualCommunicationPointEClass == null) {
			actualCommunicationPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(8);
		}
		return actualCommunicationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_TimeOriginated() {
        return (EAttribute)getActualCommunicationPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_TimeAvailable() {
        return (EAttribute)getActualCommunicationPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_TimeConsumed() {
        return (EAttribute)getActualCommunicationPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Initiator() {
        return (EReference)getActualCommunicationPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Receiver() {
        return (EReference)getActualCommunicationPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Channel() {
        return (EReference)getActualCommunicationPoint().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualCommunicationPoint_Message() {
        return (EReference)getActualCommunicationPoint().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_Compliance() {
        return (EAttribute)getActualCommunicationPoint().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualCommunicationPoint_Comment() {
        return (EAttribute)getActualCommunicationPoint().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualAction() {
		if (actualActionEClass == null) {
			actualActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(9);
		}
		return actualActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualAction_Initiator() {
        return (EReference)getActualAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualAction_Compliance() {
        return (EAttribute)getActualAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualAction_Comment() {
        return (EAttribute)getActualAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyOperator() {
		if (journeyOperatorEClass == null) {
			journeyOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(10);
		}
		return journeyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneyOperator_BelongsTo() {
        return (EReference)getJourneyOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyOperator_OperatorID() {
        return (EAttribute)getJourneyOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrency() {
		if (concurrencyEClass == null) {
			concurrencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(11);
		}
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcurrency_Concurrencypaths() {
        return (EAttribute)getConcurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		if (decisionEClass == null) {
			decisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(12);
		}
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_DecisionPaths() {
        return (EAttribute)getDecision().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Condition() {
        return (EAttribute)getDecision().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_DecisionMaker() {
        return (EReference)getDecision().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndUserExperience() {
		if (endUserExperienceEClass == null) {
			endUserExperienceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(13);
		}
		return endUserExperienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUserExperience_ExperienceDescription() {
        return (EAttribute)getEndUserExperience().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUserExperience_ExperienceRating() {
        return (EAttribute)getEndUserExperience().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackendSystem() {
		if (backendSystemEClass == null) {
			backendSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(14);
		}
		return backendSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackendSystem_SystemID() {
        return (EAttribute)getBackendSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackendSystem_SystemName() {
        return (EAttribute)getBackendSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackendSystem_SystemDescription() {
        return (EAttribute)getBackendSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		if (objectEClass == null) {
			objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(15);
		}
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectID() {
        return (EAttribute)getObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectName() {
        return (EAttribute)getObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_ObjectDescription() {
        return (EAttribute)getObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_IsVirtual() {
        return (EAttribute)getObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyPhase() {
		if (journeyPhaseEClass == null) {
			journeyPhaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(16);
		}
		return journeyPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyPhase_PhaseName() {
        return (EAttribute)getJourneyPhase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyPhase_PhaseDescription() {
        return (EAttribute)getJourneyPhase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyPhase_PhaseID() {
        return (EAttribute)getJourneyPhase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		if (actorEClass == null) {
			actorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(17);
		}
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorID() {
        return (EAttribute)getActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorName() {
        return (EAttribute)getActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorDescription() {
        return (EAttribute)getActor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_IsVirtual() {
        return (EAttribute)getActor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndUser() {
		if (endUserEClass == null) {
			endUserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(18);
		}
		return endUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUser_IsMain() {
        return (EAttribute)getEndUser().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUser_Preferences() {
        return (EAttribute)getEndUser().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUser_Frustrations() {
        return (EAttribute)getEndUser().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUser_PreferredChannels() {
        return (EAttribute)getEndUser().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProvider() {
		if (serviceProviderEClass == null) {
			serviceProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(19);
		}
		return serviceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_CompanyName() {
        return (EAttribute)getServiceProvider().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Department() {
        return (EAttribute)getServiceProvider().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_Position() {
        return (EAttribute)getServiceProvider().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceProvider_ProviderType() {
        return (EAttribute)getServiceProvider().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		if (externalEClass == null) {
			externalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(20);
		}
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiator() {
		if (initiatorEClass == null) {
			initiatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(22);
		}
		return initiatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiator_RefersTo() {
        return (EReference)getInitiator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiator_InitiatorLabel() {
        return (EAttribute)getInitiator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		if (receiverEClass == null) {
			receiverEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(23);
		}
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiver_RefersTo() {
        return (EReference)getReceiver().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiver_ReceiverLabel() {
        return (EAttribute)getReceiver().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		if (channelEClass == null) {
			channelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(24);
		}
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Channel() {
        return (EAttribute)getChannel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_ComType() {
        return (EAttribute)getChannel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_IsSynchronous() {
        return (EAttribute)getChannel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		if (messageEClass == null) {
			messageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(25);
		}
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageContent() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_KeyMessageContent() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_DerivedMessageContent() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		if (customerEClass == null) {
			customerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(27);
		}
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		if (userEClass == null) {
			userEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(28);
		}
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitizen() {
		if (citizenEClass == null) {
			citizenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(29);
		}
		return citizenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		if (patientEClass == null) {
			patientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(30);
		}
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_PatientType() {
        return (EAttribute)getPatient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Diagnosis() {
        return (EAttribute)getPatient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_InsuranceName() {
        return (EAttribute)getPatient().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		if (employeeEClass == null) {
			employeeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(31);
		}
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_CompanyName() {
        return (EAttribute)getEmployee().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Department() {
        return (EAttribute)getEmployee().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Position() {
        return (EAttribute)getEmployee().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_YearsExperience() {
        return (EAttribute)getEmployee().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcomplianceValues() {
		if (complianceValuesEEnum == null) {
			complianceValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(21);
		}
		return complianceValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getstatus() {
		if (statusEEnum == null) {
			statusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(26);
		}
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getchannels() {
		if (channelsEEnum == null) {
			channelsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(32);
		}
		return channelsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getuncertaintyValues() {
		if (uncertaintyValuesEEnum == null) {
			uncertaintyValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(33);
		}
		return uncertaintyValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcomTypes() {
		if (comTypesEEnum == null) {
			comTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(34);
		}
		return comTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getproviderTypes() {
		if (providerTypesEEnum == null) {
			providerTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(35);
		}
		return providerTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpatientTypes() {
		if (patientTypesEEnum == null) {
			patientTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CjmlmetamodelPackage.eNS_URI).getEClassifiers().get(36);
		}
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
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.sirius.sample.cjmlmetamodel." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CjmlmetamodelPackageImpl
