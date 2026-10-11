/**
 */
package sosym;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sosym.SosymFactory
 * @model kind="package"
 * @generated
 */
public interface SosymPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sosym";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sosym";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sosym";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SosymPackage eINSTANCE = sosym.impl.SosymPackageImpl.init();

	/**
	 * The meta object id for the '{@link sosym.impl.ServiceProcessImpl <em>Service Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ServiceProcessImpl
	 * @see sosym.impl.SosymPackageImpl#getServiceProcess()
	 * @generated
	 */
	int SERVICE_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROCESS__GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Service Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROCESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.JourneyGroupImpl <em>Journey Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.JourneyGroupImpl
	 * @see sosym.impl.SosymPackageImpl#getJourneyGroup()
	 * @generated
	 */
	int JOURNEY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Group Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP__GROUP_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Numberof Journeys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP__NUMBEROF_JOURNEYS = 2;

	/**
	 * The feature id for the '<em><b>Journeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP__JOURNEYS = 3;

	/**
	 * The feature id for the '<em><b>Decision Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP__DECISION_PATHS = 4;

	/**
	 * The number of structural features of the '<em>Journey Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Journey Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.CustomerJourneyImpl <em>Customer Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.CustomerJourneyImpl
	 * @see sosym.impl.SosymPackageImpl#getCustomerJourney()
	 * @generated
	 */
	int CUSTOMER_JOURNEY = 2;

	/**
	 * The feature id for the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Journey Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>Journey Long Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__PHASES = 5;

	/**
	 * The feature id for the '<em><b>Concurrent Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__CONCURRENT_PATHS = 6;

	/**
	 * The feature id for the '<em><b>End Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__END_USERS = 7;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__PROVIDERS = 8;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__EXTERNALS = 9;

	/**
	 * The number of structural features of the '<em>Customer Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Customer Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.PlannedJourneyImpl <em>Planned Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.PlannedJourneyImpl
	 * @see sosym.impl.SosymPackageImpl#getPlannedJourney()
	 * @generated
	 */
	int PLANNED_JOURNEY = 3;

	/**
	 * The feature id for the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__JOURNEY_ID = CUSTOMER_JOURNEY__JOURNEY_ID;

	/**
	 * The feature id for the '<em><b>Journey Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__JOURNEY_TITLE = CUSTOMER_JOURNEY__JOURNEY_TITLE;

	/**
	 * The feature id for the '<em><b>Journey Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__JOURNEY_SHORT_SUMMARY = CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY;

	/**
	 * The feature id for the '<em><b>Journey Long Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__JOURNEY_LONG_SUMMARY = CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__ELEMENTS = CUSTOMER_JOURNEY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__PHASES = CUSTOMER_JOURNEY__PHASES;

	/**
	 * The feature id for the '<em><b>Concurrent Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__CONCURRENT_PATHS = CUSTOMER_JOURNEY__CONCURRENT_PATHS;

	/**
	 * The feature id for the '<em><b>End Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__END_USERS = CUSTOMER_JOURNEY__END_USERS;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__PROVIDERS = CUSTOMER_JOURNEY__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__EXTERNALS = CUSTOMER_JOURNEY__EXTERNALS;

	/**
	 * The number of structural features of the '<em>Planned Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY_FEATURE_COUNT = CUSTOMER_JOURNEY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Planned Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY_OPERATION_COUNT = CUSTOMER_JOURNEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ActualJourneyImpl <em>Actual Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ActualJourneyImpl
	 * @see sosym.impl.SosymPackageImpl#getActualJourney()
	 * @generated
	 */
	int ACTUAL_JOURNEY = 4;

	/**
	 * The feature id for the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_ID = CUSTOMER_JOURNEY__JOURNEY_ID;

	/**
	 * The feature id for the '<em><b>Journey Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_TITLE = CUSTOMER_JOURNEY__JOURNEY_TITLE;

	/**
	 * The feature id for the '<em><b>Journey Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_SHORT_SUMMARY = CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY;

	/**
	 * The feature id for the '<em><b>Journey Long Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_LONG_SUMMARY = CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__ELEMENTS = CUSTOMER_JOURNEY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__PHASES = CUSTOMER_JOURNEY__PHASES;

	/**
	 * The feature id for the '<em><b>Concurrent Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__CONCURRENT_PATHS = CUSTOMER_JOURNEY__CONCURRENT_PATHS;

	/**
	 * The feature id for the '<em><b>End Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__END_USERS = CUSTOMER_JOURNEY__END_USERS;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__PROVIDERS = CUSTOMER_JOURNEY__PROVIDERS;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__EXTERNALS = CUSTOMER_JOURNEY__EXTERNALS;

	/**
	 * The feature id for the '<em><b>Journey Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Journey Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_STATUS = CUSTOMER_JOURNEY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__CONTENT_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End User Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__END_USER_EXPERIENCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End User Experience Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING = CUSTOMER_JOURNEY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Actual Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY_FEATURE_COUNT = CUSTOMER_JOURNEY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Actual Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY_OPERATION_COUNT = CUSTOMER_JOURNEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.CustomerJourneyElementImpl <em>Customer Journey Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.CustomerJourneyElementImpl
	 * @see sosym.impl.SosymPackageImpl#getCustomerJourneyElement()
	 * @generated
	 */
	int CUSTOMER_JOURNEY_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_ELEMENT__BELONGS_TO = 0;

	/**
	 * The number of structural features of the '<em>Customer Journey Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customer Journey Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.TouchpointImpl <em>Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.TouchpointImpl
	 * @see sosym.impl.SosymPackageImpl#getTouchpoint()
	 * @generated
	 */
	int TOUCHPOINT = 5;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__BELONGS_TO = CUSTOMER_JOURNEY_ELEMENT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__TOUCHPOINT_ID = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__COMPLIANCE = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__UNCERTAINTY = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End User Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__END_USER_EXPERIENCE = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End User Experience Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__END_USER_EXPERIENCE_RATING = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__TIME_STARTED = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__TIME_COMPLETED = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__COMMENT = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__OBJECTS = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__SYSTEMS = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_FEATURE_COUNT = CUSTOMER_JOURNEY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_OPERATION_COUNT = CUSTOMER_JOURNEY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.JourneyPhaseImpl <em>Journey Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.JourneyPhaseImpl
	 * @see sosym.impl.SosymPackageImpl#getJourneyPhase()
	 * @generated
	 */
	int JOURNEY_PHASE = 7;

	/**
	 * The feature id for the '<em><b>Phase Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PHASE__PHASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Phase Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PHASE__PHASE_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Journey Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PHASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Journey Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.JourneyOperatorImpl <em>Journey Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.JourneyOperatorImpl
	 * @see sosym.impl.SosymPackageImpl#getJourneyOperator()
	 * @generated
	 */
	int JOURNEY_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATOR__OPERATOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATOR__BELONGS_TO = 1;

	/**
	 * The number of structural features of the '<em>Journey Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Journey Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.DecisionImpl
	 * @see sosym.impl.SosymPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 9;

	/**
	 * The feature id for the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OPERATOR_ID = JOURNEY_OPERATOR__OPERATOR_ID;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__BELONGS_TO = JOURNEY_OPERATOR__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Decision Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DECISION_PATHS = JOURNEY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONDITION = JOURNEY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decision Maker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DECISION_MAKER = JOURNEY_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = JOURNEY_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = JOURNEY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ConcurrencyImpl
	 * @see sosym.impl.SosymPackageImpl#getConcurrency()
	 * @generated
	 */
	int CONCURRENCY = 10;

	/**
	 * The feature id for the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__OPERATOR_ID = JOURNEY_OPERATOR__OPERATOR_ID;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__BELONGS_TO = JOURNEY_OPERATOR__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Concurrency Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__CONCURRENCY_PATHS = JOURNEY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_FEATURE_COUNT = JOURNEY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_OPERATION_COUNT = JOURNEY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ActorImpl
	 * @see sosym.impl.SosymPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 11;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_VIRTUAL = 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ExternalImpl <em>External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ExternalImpl
	 * @see sosym.impl.SosymPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 12;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ACTOR_ID = ACTOR__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ACTOR_NAME = ACTOR__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ACTOR_DESCRIPTION = ACTOR__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__IS_VIRTUAL = ACTOR__IS_VIRTUAL;

	/**
	 * The number of structural features of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ServiceProviderImpl
	 * @see sosym.impl.SosymPackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__ACTOR_ID = ACTOR__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__ACTOR_NAME = ACTOR__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__ACTOR_DESCRIPTION = ACTOR__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__IS_VIRTUAL = ACTOR__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__COMPANY_NAME = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__DEPARTMENT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.EndUserImpl <em>End User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.EndUserImpl
	 * @see sosym.impl.SosymPackageImpl#getEndUser()
	 * @generated
	 */
	int END_USER = 14;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER__ACTOR_ID = ACTOR__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER__ACTOR_NAME = ACTOR__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER__ACTOR_DESCRIPTION = ACTOR__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER__IS_VIRTUAL = ACTOR__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>End User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER__END_USER_TYPE = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ActionImpl
	 * @see sosym.impl.SosymPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 15;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BELONGS_TO = TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOUCHPOINT_ID = TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMPLIANCE = TOUCHPOINT__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UNCERTAINTY = TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>End User Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_USER_EXPERIENCE = TOUCHPOINT__END_USER_EXPERIENCE;

	/**
	 * The feature id for the '<em><b>End User Experience Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_USER_EXPERIENCE_RATING = TOUCHPOINT__END_USER_EXPERIENCE_RATING;

	/**
	 * The feature id for the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TIME_STARTED = TOUCHPOINT__TIME_STARTED;

	/**
	 * The feature id for the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TIME_COMPLETED = TOUCHPOINT__TIME_COMPLETED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMENT = TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OBJECTS = TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SYSTEMS = TOUCHPOINT__SYSTEMS;

	/**
	 * The feature id for the '<em><b>Has Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_INITIATOR = TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.CommunicationPointImpl <em>Communication Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.CommunicationPointImpl
	 * @see sosym.impl.SosymPackageImpl#getCommunicationPoint()
	 * @generated
	 */
	int COMMUNICATION_POINT = 16;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__BELONGS_TO = TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__TOUCHPOINT_ID = TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__COMPLIANCE = TOUCHPOINT__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__UNCERTAINTY = TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>End User Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__END_USER_EXPERIENCE = TOUCHPOINT__END_USER_EXPERIENCE;

	/**
	 * The feature id for the '<em><b>End User Experience Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__END_USER_EXPERIENCE_RATING = TOUCHPOINT__END_USER_EXPERIENCE_RATING;

	/**
	 * The feature id for the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__TIME_STARTED = TOUCHPOINT__TIME_STARTED;

	/**
	 * The feature id for the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__TIME_COMPLETED = TOUCHPOINT__TIME_COMPLETED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__COMMENT = TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__OBJECTS = TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__SYSTEMS = TOUCHPOINT__SYSTEMS;

	/**
	 * The feature id for the '<em><b>Time Originated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__TIME_ORIGINATED = TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__TIME_RECEIVED = TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__TIME_CONSUMED = TOUCHPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__HAS_INITIATOR = TOUCHPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__HAS_RECEIVER = TOUCHPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__HAS_CHANNEL = TOUCHPOINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT__HAS_MESSAGE = TOUCHPOINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Communication Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT_FEATURE_COUNT = TOUCHPOINT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Communication Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_POINT_OPERATION_COUNT = TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ObjectImpl
	 * @see sosym.impl.SosymPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 17;

	/**
	 * The feature id for the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_VIRTUAL = 2;

	/**
	 * The feature id for the '<em><b>Object Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.BackendSystemImpl <em>Backend System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.BackendSystemImpl
	 * @see sosym.impl.SosymPackageImpl#getBackendSystem()
	 * @generated
	 */
	int BACKEND_SYSTEM = 18;

	/**
	 * The feature id for the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_SYSTEM__SYSTEM_ID = 0;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_SYSTEM__SYSTEM_NAME = 1;

	/**
	 * The feature id for the '<em><b>System Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_SYSTEM__SYSTEM_DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Backend System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Backend System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.InitiatorImpl <em>Initiator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.InitiatorImpl
	 * @see sosym.impl.SosymPackageImpl#getInitiator()
	 * @generated
	 */
	int INITIATOR = 19;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__REFERS_TO = 0;

	/**
	 * The feature id for the '<em><b>Initiator Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR__INITIATOR_LABEL = 1;

	/**
	 * The number of structural features of the '<em>Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ReceiverImpl
	 * @see sosym.impl.SosymPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 20;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__REFERS_TO = 0;

	/**
	 * The feature id for the '<em><b>Receiver Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__RECEIVER_LABEL = 1;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.ChannelImpl
	 * @see sosym.impl.SosymPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 21;

	/**
	 * The feature id for the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_NAME = 0;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.impl.MessageImpl
	 * @see sosym.impl.SosymPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 22;

	/**
	 * The feature id for the '<em><b>Key Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__KEY_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Message Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sosym.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.Status
	 * @see sosym.impl.SosymPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 23;

	/**
	 * The meta object id for the '{@link sosym.EUTypes <em>EU Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.EUTypes
	 * @see sosym.impl.SosymPackageImpl#getEUTypes()
	 * @generated
	 */
	int EU_TYPES = 24;

	/**
	 * The meta object id for the '{@link sosym.ComplianceValues <em>Compliance Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.ComplianceValues
	 * @see sosym.impl.SosymPackageImpl#getComplianceValues()
	 * @generated
	 */
	int COMPLIANCE_VALUES = 25;

	/**
	 * The meta object id for the '{@link sosym.UncertaintyValues <em>Uncertainty Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.UncertaintyValues
	 * @see sosym.impl.SosymPackageImpl#getUncertaintyValues()
	 * @generated
	 */
	int UNCERTAINTY_VALUES = 26;

	/**
	 * The meta object id for the '{@link sosym.Channels <em>Channels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sosym.Channels
	 * @see sosym.impl.SosymPackageImpl#getChannels()
	 * @generated
	 */
	int CHANNELS = 27;


	/**
	 * Returns the meta object for class '{@link sosym.ServiceProcess <em>Service Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Process</em>'.
	 * @see sosym.ServiceProcess
	 * @generated
	 */
	EClass getServiceProcess();

	/**
	 * Returns the meta object for the reference list '{@link sosym.ServiceProcess#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see sosym.ServiceProcess#getGroups()
	 * @see #getServiceProcess()
	 * @generated
	 */
	EReference getServiceProcess_Groups();

	/**
	 * Returns the meta object for class '{@link sosym.JourneyGroup <em>Journey Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Group</em>'.
	 * @see sosym.JourneyGroup
	 * @generated
	 */
	EClass getJourneyGroup();

	/**
	 * Returns the meta object for the attribute '{@link sosym.JourneyGroup#getGroupID <em>Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group ID</em>'.
	 * @see sosym.JourneyGroup#getGroupID()
	 * @see #getJourneyGroup()
	 * @generated
	 */
	EAttribute getJourneyGroup_GroupID();

	/**
	 * Returns the meta object for the attribute '{@link sosym.JourneyGroup#getGroupDescription <em>Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Description</em>'.
	 * @see sosym.JourneyGroup#getGroupDescription()
	 * @see #getJourneyGroup()
	 * @generated
	 */
	EAttribute getJourneyGroup_GroupDescription();

	/**
	 * Returns the meta object for the attribute '{@link sosym.JourneyGroup#getNumberofJourneys <em>Numberof Journeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numberof Journeys</em>'.
	 * @see sosym.JourneyGroup#getNumberofJourneys()
	 * @see #getJourneyGroup()
	 * @generated
	 */
	EAttribute getJourneyGroup_NumberofJourneys();

	/**
	 * Returns the meta object for the reference list '{@link sosym.JourneyGroup#getJourneys <em>Journeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Journeys</em>'.
	 * @see sosym.JourneyGroup#getJourneys()
	 * @see #getJourneyGroup()
	 * @generated
	 */
	EReference getJourneyGroup_Journeys();

	/**
	 * Returns the meta object for the reference list '{@link sosym.JourneyGroup#getDecisionPaths <em>Decision Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decision Paths</em>'.
	 * @see sosym.JourneyGroup#getDecisionPaths()
	 * @see #getJourneyGroup()
	 * @generated
	 */
	EReference getJourneyGroup_DecisionPaths();

	/**
	 * Returns the meta object for class '{@link sosym.CustomerJourney <em>Customer Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Journey</em>'.
	 * @see sosym.CustomerJourney
	 * @generated
	 */
	EClass getCustomerJourney();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CustomerJourney#getJourneyID <em>Journey ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey ID</em>'.
	 * @see sosym.CustomerJourney#getJourneyID()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyID();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CustomerJourney#getJourneyTitle <em>Journey Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Title</em>'.
	 * @see sosym.CustomerJourney#getJourneyTitle()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyTitle();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Short Summary</em>'.
	 * @see sosym.CustomerJourney#getJourneyShortSummary()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyShortSummary();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Long Summary</em>'.
	 * @see sosym.CustomerJourney#getJourneyLongSummary()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyLongSummary();

	/**
	 * Returns the meta object for the reference list '{@link sosym.CustomerJourney#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see sosym.CustomerJourney#getElements()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_Elements();

	/**
	 * Returns the meta object for the reference list '{@link sosym.CustomerJourney#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phases</em>'.
	 * @see sosym.CustomerJourney#getPhases()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_Phases();

	/**
	 * Returns the meta object for the reference list '{@link sosym.CustomerJourney#getConcurrentPaths <em>Concurrent Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concurrent Paths</em>'.
	 * @see sosym.CustomerJourney#getConcurrentPaths()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_ConcurrentPaths();

	/**
	 * Returns the meta object for the reference list '{@link sosym.CustomerJourney#getEndUsers <em>End Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Users</em>'.
	 * @see sosym.CustomerJourney#getEndUsers()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_EndUsers();

	/**
	 * Returns the meta object for the reference list '{@link sosym.CustomerJourney#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers</em>'.
	 * @see sosym.CustomerJourney#getProviders()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_Providers();

	/**
	 * Returns the meta object for the reference list '{@link sosym.CustomerJourney#getExternals <em>Externals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Externals</em>'.
	 * @see sosym.CustomerJourney#getExternals()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_Externals();

	/**
	 * Returns the meta object for class '{@link sosym.PlannedJourney <em>Planned Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Journey</em>'.
	 * @see sosym.PlannedJourney
	 * @generated
	 */
	EClass getPlannedJourney();

	/**
	 * Returns the meta object for class '{@link sosym.ActualJourney <em>Actual Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Journey</em>'.
	 * @see sosym.ActualJourney
	 * @generated
	 */
	EClass getActualJourney();

	/**
	 * Returns the meta object for the reference '{@link sosym.ActualJourney#getJourneyCompliance <em>Journey Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Journey Compliance</em>'.
	 * @see sosym.ActualJourney#getJourneyCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EReference getActualJourney_JourneyCompliance();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ActualJourney#getJourneyStatus <em>Journey Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Status</em>'.
	 * @see sosym.ActualJourney#getJourneyStatus()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_JourneyStatus();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ActualJourney#isContentCompliance <em>Content Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Compliance</em>'.
	 * @see sosym.ActualJourney#isContentCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_ContentCompliance();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ActualJourney#isSequenceCompliance <em>Sequence Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Compliance</em>'.
	 * @see sosym.ActualJourney#isSequenceCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_SequenceCompliance();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ActualJourney#getEndUserExperience <em>End User Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End User Experience</em>'.
	 * @see sosym.ActualJourney#getEndUserExperience()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_EndUserExperience();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ActualJourney#getEndUserExperienceRating <em>End User Experience Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End User Experience Rating</em>'.
	 * @see sosym.ActualJourney#getEndUserExperienceRating()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_EndUserExperienceRating();

	/**
	 * Returns the meta object for class '{@link sosym.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchpoint</em>'.
	 * @see sosym.Touchpoint
	 * @generated
	 */
	EClass getTouchpoint();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getTouchpointID <em>Touchpoint ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touchpoint ID</em>'.
	 * @see sosym.Touchpoint#getTouchpointID()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_TouchpointID();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getCompliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance</em>'.
	 * @see sosym.Touchpoint#getCompliance()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Compliance();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see sosym.Touchpoint#getUncertainty()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Uncertainty();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getEndUserExperience <em>End User Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End User Experience</em>'.
	 * @see sosym.Touchpoint#getEndUserExperience()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_EndUserExperience();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getEndUserExperienceRating <em>End User Experience Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End User Experience Rating</em>'.
	 * @see sosym.Touchpoint#getEndUserExperienceRating()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_EndUserExperienceRating();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getTimeStarted <em>Time Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Started</em>'.
	 * @see sosym.Touchpoint#getTimeStarted()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_TimeStarted();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getTimeCompleted <em>Time Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Completed</em>'.
	 * @see sosym.Touchpoint#getTimeCompleted()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_TimeCompleted();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Touchpoint#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see sosym.Touchpoint#getComment()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Comment();

	/**
	 * Returns the meta object for the reference list '{@link sosym.Touchpoint#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see sosym.Touchpoint#getObjects()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EReference getTouchpoint_Objects();

	/**
	 * Returns the meta object for the reference list '{@link sosym.Touchpoint#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Systems</em>'.
	 * @see sosym.Touchpoint#getSystems()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EReference getTouchpoint_Systems();

	/**
	 * Returns the meta object for class '{@link sosym.CustomerJourneyElement <em>Customer Journey Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Journey Element</em>'.
	 * @see sosym.CustomerJourneyElement
	 * @generated
	 */
	EClass getCustomerJourneyElement();

	/**
	 * Returns the meta object for the reference '{@link sosym.CustomerJourneyElement#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see sosym.CustomerJourneyElement#getBelongsTo()
	 * @see #getCustomerJourneyElement()
	 * @generated
	 */
	EReference getCustomerJourneyElement_BelongsTo();

	/**
	 * Returns the meta object for class '{@link sosym.JourneyPhase <em>Journey Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Phase</em>'.
	 * @see sosym.JourneyPhase
	 * @generated
	 */
	EClass getJourneyPhase();

	/**
	 * Returns the meta object for the attribute '{@link sosym.JourneyPhase#getPhaseName <em>Phase Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Name</em>'.
	 * @see sosym.JourneyPhase#getPhaseName()
	 * @see #getJourneyPhase()
	 * @generated
	 */
	EAttribute getJourneyPhase_PhaseName();

	/**
	 * Returns the meta object for the attribute '{@link sosym.JourneyPhase#getPhaseDescription <em>Phase Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Description</em>'.
	 * @see sosym.JourneyPhase#getPhaseDescription()
	 * @see #getJourneyPhase()
	 * @generated
	 */
	EAttribute getJourneyPhase_PhaseDescription();

	/**
	 * Returns the meta object for class '{@link sosym.JourneyOperator <em>Journey Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Operator</em>'.
	 * @see sosym.JourneyOperator
	 * @generated
	 */
	EClass getJourneyOperator();

	/**
	 * Returns the meta object for the attribute '{@link sosym.JourneyOperator#getOperatorID <em>Operator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator ID</em>'.
	 * @see sosym.JourneyOperator#getOperatorID()
	 * @see #getJourneyOperator()
	 * @generated
	 */
	EAttribute getJourneyOperator_OperatorID();

	/**
	 * Returns the meta object for the reference '{@link sosym.JourneyOperator#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see sosym.JourneyOperator#getBelongsTo()
	 * @see #getJourneyOperator()
	 * @generated
	 */
	EReference getJourneyOperator_BelongsTo();

	/**
	 * Returns the meta object for class '{@link sosym.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see sosym.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Decision#getDecisionPaths <em>Decision Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Paths</em>'.
	 * @see sosym.Decision#getDecisionPaths()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_DecisionPaths();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Decision#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sosym.Decision#getCondition()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Condition();

	/**
	 * Returns the meta object for the reference '{@link sosym.Decision#getDecisionMaker <em>Decision Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Maker</em>'.
	 * @see sosym.Decision#getDecisionMaker()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_DecisionMaker();

	/**
	 * Returns the meta object for class '{@link sosym.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency</em>'.
	 * @see sosym.Concurrency
	 * @generated
	 */
	EClass getConcurrency();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Concurrency#getConcurrencyPaths <em>Concurrency Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency Paths</em>'.
	 * @see sosym.Concurrency#getConcurrencyPaths()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_ConcurrencyPaths();

	/**
	 * Returns the meta object for class '{@link sosym.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see sosym.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Actor#getActorID <em>Actor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor ID</em>'.
	 * @see sosym.Actor#getActorID()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorID();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Actor#getActorName <em>Actor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Name</em>'.
	 * @see sosym.Actor#getActorName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorName();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Actor#getActorDescription <em>Actor Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Description</em>'.
	 * @see sosym.Actor#getActorDescription()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorDescription();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Actor#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see sosym.Actor#isIsVirtual()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_IsVirtual();

	/**
	 * Returns the meta object for class '{@link sosym.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External</em>'.
	 * @see sosym.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '{@link sosym.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider</em>'.
	 * @see sosym.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ServiceProvider#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see sosym.ServiceProvider#getCompanyName()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link sosym.ServiceProvider#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see sosym.ServiceProvider#getDepartment()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Department();

	/**
	 * Returns the meta object for class '{@link sosym.EndUser <em>End User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End User</em>'.
	 * @see sosym.EndUser
	 * @generated
	 */
	EClass getEndUser();

	/**
	 * Returns the meta object for the attribute '{@link sosym.EndUser#getEndUserType <em>End User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End User Type</em>'.
	 * @see sosym.EndUser#getEndUserType()
	 * @see #getEndUser()
	 * @generated
	 */
	EAttribute getEndUser_EndUserType();

	/**
	 * Returns the meta object for class '{@link sosym.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see sosym.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link sosym.Action#getHasInitiator <em>Has Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Initiator</em>'.
	 * @see sosym.Action#getHasInitiator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_HasInitiator();

	/**
	 * Returns the meta object for class '{@link sosym.CommunicationPoint <em>Communication Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Point</em>'.
	 * @see sosym.CommunicationPoint
	 * @generated
	 */
	EClass getCommunicationPoint();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CommunicationPoint#getTimeOriginated <em>Time Originated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Originated</em>'.
	 * @see sosym.CommunicationPoint#getTimeOriginated()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EAttribute getCommunicationPoint_TimeOriginated();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CommunicationPoint#getTimeReceived <em>Time Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Received</em>'.
	 * @see sosym.CommunicationPoint#getTimeReceived()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EAttribute getCommunicationPoint_TimeReceived();

	/**
	 * Returns the meta object for the attribute '{@link sosym.CommunicationPoint#getTimeConsumed <em>Time Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Consumed</em>'.
	 * @see sosym.CommunicationPoint#getTimeConsumed()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EAttribute getCommunicationPoint_TimeConsumed();

	/**
	 * Returns the meta object for the reference '{@link sosym.CommunicationPoint#getHasInitiator <em>Has Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Initiator</em>'.
	 * @see sosym.CommunicationPoint#getHasInitiator()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EReference getCommunicationPoint_HasInitiator();

	/**
	 * Returns the meta object for the reference '{@link sosym.CommunicationPoint#getHasReceiver <em>Has Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Receiver</em>'.
	 * @see sosym.CommunicationPoint#getHasReceiver()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EReference getCommunicationPoint_HasReceiver();

	/**
	 * Returns the meta object for the reference '{@link sosym.CommunicationPoint#getHasChannel <em>Has Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Channel</em>'.
	 * @see sosym.CommunicationPoint#getHasChannel()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EReference getCommunicationPoint_HasChannel();

	/**
	 * Returns the meta object for the reference '{@link sosym.CommunicationPoint#getHasMessage <em>Has Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Message</em>'.
	 * @see sosym.CommunicationPoint#getHasMessage()
	 * @see #getCommunicationPoint()
	 * @generated
	 */
	EReference getCommunicationPoint_HasMessage();

	/**
	 * Returns the meta object for class '{@link sosym.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see sosym.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Object#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see sosym.Object#getObjectID()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectID();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Object#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see sosym.Object#getObjectName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Object#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see sosym.Object#isIsVirtual()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_IsVirtual();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Object#getObjectDescription <em>Object Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Description</em>'.
	 * @see sosym.Object#getObjectDescription()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectDescription();

	/**
	 * Returns the meta object for class '{@link sosym.BackendSystem <em>Backend System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backend System</em>'.
	 * @see sosym.BackendSystem
	 * @generated
	 */
	EClass getBackendSystem();

	/**
	 * Returns the meta object for the attribute '{@link sosym.BackendSystem#getSystemID <em>System ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System ID</em>'.
	 * @see sosym.BackendSystem#getSystemID()
	 * @see #getBackendSystem()
	 * @generated
	 */
	EAttribute getBackendSystem_SystemID();

	/**
	 * Returns the meta object for the attribute '{@link sosym.BackendSystem#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see sosym.BackendSystem#getSystemName()
	 * @see #getBackendSystem()
	 * @generated
	 */
	EAttribute getBackendSystem_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link sosym.BackendSystem#getSystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Description</em>'.
	 * @see sosym.BackendSystem#getSystemDescription()
	 * @see #getBackendSystem()
	 * @generated
	 */
	EAttribute getBackendSystem_SystemDescription();

	/**
	 * Returns the meta object for class '{@link sosym.Initiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiator</em>'.
	 * @see sosym.Initiator
	 * @generated
	 */
	EClass getInitiator();

	/**
	 * Returns the meta object for the reference '{@link sosym.Initiator#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see sosym.Initiator#getRefersTo()
	 * @see #getInitiator()
	 * @generated
	 */
	EReference getInitiator_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Initiator#getInitiatorLabel <em>Initiator Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator Label</em>'.
	 * @see sosym.Initiator#getInitiatorLabel()
	 * @see #getInitiator()
	 * @generated
	 */
	EAttribute getInitiator_InitiatorLabel();

	/**
	 * Returns the meta object for class '{@link sosym.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see sosym.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for the reference '{@link sosym.Receiver#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see sosym.Receiver#getRefersTo()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Receiver#getReceiverLabel <em>Receiver Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Label</em>'.
	 * @see sosym.Receiver#getReceiverLabel()
	 * @see #getReceiver()
	 * @generated
	 */
	EAttribute getReceiver_ReceiverLabel();

	/**
	 * Returns the meta object for class '{@link sosym.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see sosym.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Channel#getChannelName <em>Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Name</em>'.
	 * @see sosym.Channel#getChannelName()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_ChannelName();

	/**
	 * Returns the meta object for class '{@link sosym.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see sosym.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Message#getKeyMessage <em>Key Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Message</em>'.
	 * @see sosym.Message#getKeyMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_KeyMessage();

	/**
	 * Returns the meta object for the attribute '{@link sosym.Message#getMessageContent <em>Message Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Content</em>'.
	 * @see sosym.Message#getMessageContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageContent();

	/**
	 * Returns the meta object for enum '{@link sosym.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see sosym.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link sosym.EUTypes <em>EU Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EU Types</em>'.
	 * @see sosym.EUTypes
	 * @generated
	 */
	EEnum getEUTypes();

	/**
	 * Returns the meta object for enum '{@link sosym.ComplianceValues <em>Compliance Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compliance Values</em>'.
	 * @see sosym.ComplianceValues
	 * @generated
	 */
	EEnum getComplianceValues();

	/**
	 * Returns the meta object for enum '{@link sosym.UncertaintyValues <em>Uncertainty Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uncertainty Values</em>'.
	 * @see sosym.UncertaintyValues
	 * @generated
	 */
	EEnum getUncertaintyValues();

	/**
	 * Returns the meta object for enum '{@link sosym.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channels</em>'.
	 * @see sosym.Channels
	 * @generated
	 */
	EEnum getChannels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SosymFactory getSosymFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sosym.impl.ServiceProcessImpl <em>Service Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ServiceProcessImpl
		 * @see sosym.impl.SosymPackageImpl#getServiceProcess()
		 * @generated
		 */
		EClass SERVICE_PROCESS = eINSTANCE.getServiceProcess();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROCESS__GROUPS = eINSTANCE.getServiceProcess_Groups();

		/**
		 * The meta object literal for the '{@link sosym.impl.JourneyGroupImpl <em>Journey Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.JourneyGroupImpl
		 * @see sosym.impl.SosymPackageImpl#getJourneyGroup()
		 * @generated
		 */
		EClass JOURNEY_GROUP = eINSTANCE.getJourneyGroup();

		/**
		 * The meta object literal for the '<em><b>Group ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_GROUP__GROUP_ID = eINSTANCE.getJourneyGroup_GroupID();

		/**
		 * The meta object literal for the '<em><b>Group Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_GROUP__GROUP_DESCRIPTION = eINSTANCE.getJourneyGroup_GroupDescription();

		/**
		 * The meta object literal for the '<em><b>Numberof Journeys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_GROUP__NUMBEROF_JOURNEYS = eINSTANCE.getJourneyGroup_NumberofJourneys();

		/**
		 * The meta object literal for the '<em><b>Journeys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_GROUP__JOURNEYS = eINSTANCE.getJourneyGroup_Journeys();

		/**
		 * The meta object literal for the '<em><b>Decision Paths</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_GROUP__DECISION_PATHS = eINSTANCE.getJourneyGroup_DecisionPaths();

		/**
		 * The meta object literal for the '{@link sosym.impl.CustomerJourneyImpl <em>Customer Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.CustomerJourneyImpl
		 * @see sosym.impl.SosymPackageImpl#getCustomerJourney()
		 * @generated
		 */
		EClass CUSTOMER_JOURNEY = eINSTANCE.getCustomerJourney();

		/**
		 * The meta object literal for the '<em><b>Journey ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__JOURNEY_ID = eINSTANCE.getCustomerJourney_JourneyID();

		/**
		 * The meta object literal for the '<em><b>Journey Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__JOURNEY_TITLE = eINSTANCE.getCustomerJourney_JourneyTitle();

		/**
		 * The meta object literal for the '<em><b>Journey Short Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY = eINSTANCE.getCustomerJourney_JourneyShortSummary();

		/**
		 * The meta object literal for the '<em><b>Journey Long Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY = eINSTANCE.getCustomerJourney_JourneyLongSummary();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__ELEMENTS = eINSTANCE.getCustomerJourney_Elements();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__PHASES = eINSTANCE.getCustomerJourney_Phases();

		/**
		 * The meta object literal for the '<em><b>Concurrent Paths</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__CONCURRENT_PATHS = eINSTANCE.getCustomerJourney_ConcurrentPaths();

		/**
		 * The meta object literal for the '<em><b>End Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__END_USERS = eINSTANCE.getCustomerJourney_EndUsers();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__PROVIDERS = eINSTANCE.getCustomerJourney_Providers();

		/**
		 * The meta object literal for the '<em><b>Externals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__EXTERNALS = eINSTANCE.getCustomerJourney_Externals();

		/**
		 * The meta object literal for the '{@link sosym.impl.PlannedJourneyImpl <em>Planned Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.PlannedJourneyImpl
		 * @see sosym.impl.SosymPackageImpl#getPlannedJourney()
		 * @generated
		 */
		EClass PLANNED_JOURNEY = eINSTANCE.getPlannedJourney();

		/**
		 * The meta object literal for the '{@link sosym.impl.ActualJourneyImpl <em>Actual Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ActualJourneyImpl
		 * @see sosym.impl.SosymPackageImpl#getActualJourney()
		 * @generated
		 */
		EClass ACTUAL_JOURNEY = eINSTANCE.getActualJourney();

		/**
		 * The meta object literal for the '<em><b>Journey Compliance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_JOURNEY__JOURNEY_COMPLIANCE = eINSTANCE.getActualJourney_JourneyCompliance();

		/**
		 * The meta object literal for the '<em><b>Journey Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_JOURNEY__JOURNEY_STATUS = eINSTANCE.getActualJourney_JourneyStatus();

		/**
		 * The meta object literal for the '<em><b>Content Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_JOURNEY__CONTENT_COMPLIANCE = eINSTANCE.getActualJourney_ContentCompliance();

		/**
		 * The meta object literal for the '<em><b>Sequence Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE = eINSTANCE.getActualJourney_SequenceCompliance();

		/**
		 * The meta object literal for the '<em><b>End User Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_JOURNEY__END_USER_EXPERIENCE = eINSTANCE.getActualJourney_EndUserExperience();

		/**
		 * The meta object literal for the '<em><b>End User Experience Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING = eINSTANCE.getActualJourney_EndUserExperienceRating();

		/**
		 * The meta object literal for the '{@link sosym.impl.TouchpointImpl <em>Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.TouchpointImpl
		 * @see sosym.impl.SosymPackageImpl#getTouchpoint()
		 * @generated
		 */
		EClass TOUCHPOINT = eINSTANCE.getTouchpoint();

		/**
		 * The meta object literal for the '<em><b>Touchpoint ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__TOUCHPOINT_ID = eINSTANCE.getTouchpoint_TouchpointID();

		/**
		 * The meta object literal for the '<em><b>Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__COMPLIANCE = eINSTANCE.getTouchpoint_Compliance();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__UNCERTAINTY = eINSTANCE.getTouchpoint_Uncertainty();

		/**
		 * The meta object literal for the '<em><b>End User Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__END_USER_EXPERIENCE = eINSTANCE.getTouchpoint_EndUserExperience();

		/**
		 * The meta object literal for the '<em><b>End User Experience Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__END_USER_EXPERIENCE_RATING = eINSTANCE.getTouchpoint_EndUserExperienceRating();

		/**
		 * The meta object literal for the '<em><b>Time Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__TIME_STARTED = eINSTANCE.getTouchpoint_TimeStarted();

		/**
		 * The meta object literal for the '<em><b>Time Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__TIME_COMPLETED = eINSTANCE.getTouchpoint_TimeCompleted();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__COMMENT = eINSTANCE.getTouchpoint_Comment();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHPOINT__OBJECTS = eINSTANCE.getTouchpoint_Objects();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHPOINT__SYSTEMS = eINSTANCE.getTouchpoint_Systems();

		/**
		 * The meta object literal for the '{@link sosym.impl.CustomerJourneyElementImpl <em>Customer Journey Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.CustomerJourneyElementImpl
		 * @see sosym.impl.SosymPackageImpl#getCustomerJourneyElement()
		 * @generated
		 */
		EClass CUSTOMER_JOURNEY_ELEMENT = eINSTANCE.getCustomerJourneyElement();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY_ELEMENT__BELONGS_TO = eINSTANCE.getCustomerJourneyElement_BelongsTo();

		/**
		 * The meta object literal for the '{@link sosym.impl.JourneyPhaseImpl <em>Journey Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.JourneyPhaseImpl
		 * @see sosym.impl.SosymPackageImpl#getJourneyPhase()
		 * @generated
		 */
		EClass JOURNEY_PHASE = eINSTANCE.getJourneyPhase();

		/**
		 * The meta object literal for the '<em><b>Phase Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_PHASE__PHASE_NAME = eINSTANCE.getJourneyPhase_PhaseName();

		/**
		 * The meta object literal for the '<em><b>Phase Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_PHASE__PHASE_DESCRIPTION = eINSTANCE.getJourneyPhase_PhaseDescription();

		/**
		 * The meta object literal for the '{@link sosym.impl.JourneyOperatorImpl <em>Journey Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.JourneyOperatorImpl
		 * @see sosym.impl.SosymPackageImpl#getJourneyOperator()
		 * @generated
		 */
		EClass JOURNEY_OPERATOR = eINSTANCE.getJourneyOperator();

		/**
		 * The meta object literal for the '<em><b>Operator ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_OPERATOR__OPERATOR_ID = eINSTANCE.getJourneyOperator_OperatorID();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_OPERATOR__BELONGS_TO = eINSTANCE.getJourneyOperator_BelongsTo();

		/**
		 * The meta object literal for the '{@link sosym.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.DecisionImpl
		 * @see sosym.impl.SosymPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Decision Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__DECISION_PATHS = eINSTANCE.getDecision_DecisionPaths();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__CONDITION = eINSTANCE.getDecision_Condition();

		/**
		 * The meta object literal for the '<em><b>Decision Maker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__DECISION_MAKER = eINSTANCE.getDecision_DecisionMaker();

		/**
		 * The meta object literal for the '{@link sosym.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ConcurrencyImpl
		 * @see sosym.impl.SosymPackageImpl#getConcurrency()
		 * @generated
		 */
		EClass CONCURRENCY = eINSTANCE.getConcurrency();

		/**
		 * The meta object literal for the '<em><b>Concurrency Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__CONCURRENCY_PATHS = eINSTANCE.getConcurrency_ConcurrencyPaths();

		/**
		 * The meta object literal for the '{@link sosym.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ActorImpl
		 * @see sosym.impl.SosymPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Actor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_ID = eINSTANCE.getActor_ActorID();

		/**
		 * The meta object literal for the '<em><b>Actor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_NAME = eINSTANCE.getActor_ActorName();

		/**
		 * The meta object literal for the '<em><b>Actor Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_DESCRIPTION = eINSTANCE.getActor_ActorDescription();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__IS_VIRTUAL = eINSTANCE.getActor_IsVirtual();

		/**
		 * The meta object literal for the '{@link sosym.impl.ExternalImpl <em>External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ExternalImpl
		 * @see sosym.impl.SosymPackageImpl#getExternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getExternal();

		/**
		 * The meta object literal for the '{@link sosym.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ServiceProviderImpl
		 * @see sosym.impl.SosymPackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__COMPANY_NAME = eINSTANCE.getServiceProvider_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__DEPARTMENT = eINSTANCE.getServiceProvider_Department();

		/**
		 * The meta object literal for the '{@link sosym.impl.EndUserImpl <em>End User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.EndUserImpl
		 * @see sosym.impl.SosymPackageImpl#getEndUser()
		 * @generated
		 */
		EClass END_USER = eINSTANCE.getEndUser();

		/**
		 * The meta object literal for the '<em><b>End User Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_USER__END_USER_TYPE = eINSTANCE.getEndUser_EndUserType();

		/**
		 * The meta object literal for the '{@link sosym.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ActionImpl
		 * @see sosym.impl.SosymPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Has Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__HAS_INITIATOR = eINSTANCE.getAction_HasInitiator();

		/**
		 * The meta object literal for the '{@link sosym.impl.CommunicationPointImpl <em>Communication Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.CommunicationPointImpl
		 * @see sosym.impl.SosymPackageImpl#getCommunicationPoint()
		 * @generated
		 */
		EClass COMMUNICATION_POINT = eINSTANCE.getCommunicationPoint();

		/**
		 * The meta object literal for the '<em><b>Time Originated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_POINT__TIME_ORIGINATED = eINSTANCE.getCommunicationPoint_TimeOriginated();

		/**
		 * The meta object literal for the '<em><b>Time Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_POINT__TIME_RECEIVED = eINSTANCE.getCommunicationPoint_TimeReceived();

		/**
		 * The meta object literal for the '<em><b>Time Consumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_POINT__TIME_CONSUMED = eINSTANCE.getCommunicationPoint_TimeConsumed();

		/**
		 * The meta object literal for the '<em><b>Has Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_POINT__HAS_INITIATOR = eINSTANCE.getCommunicationPoint_HasInitiator();

		/**
		 * The meta object literal for the '<em><b>Has Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_POINT__HAS_RECEIVER = eINSTANCE.getCommunicationPoint_HasReceiver();

		/**
		 * The meta object literal for the '<em><b>Has Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_POINT__HAS_CHANNEL = eINSTANCE.getCommunicationPoint_HasChannel();

		/**
		 * The meta object literal for the '<em><b>Has Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_POINT__HAS_MESSAGE = eINSTANCE.getCommunicationPoint_HasMessage();

		/**
		 * The meta object literal for the '{@link sosym.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ObjectImpl
		 * @see sosym.impl.SosymPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Object ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT_ID = eINSTANCE.getObject_ObjectID();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT_NAME = eINSTANCE.getObject_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__IS_VIRTUAL = eINSTANCE.getObject_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>Object Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT_DESCRIPTION = eINSTANCE.getObject_ObjectDescription();

		/**
		 * The meta object literal for the '{@link sosym.impl.BackendSystemImpl <em>Backend System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.BackendSystemImpl
		 * @see sosym.impl.SosymPackageImpl#getBackendSystem()
		 * @generated
		 */
		EClass BACKEND_SYSTEM = eINSTANCE.getBackendSystem();

		/**
		 * The meta object literal for the '<em><b>System ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKEND_SYSTEM__SYSTEM_ID = eINSTANCE.getBackendSystem_SystemID();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKEND_SYSTEM__SYSTEM_NAME = eINSTANCE.getBackendSystem_SystemName();

		/**
		 * The meta object literal for the '<em><b>System Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKEND_SYSTEM__SYSTEM_DESCRIPTION = eINSTANCE.getBackendSystem_SystemDescription();

		/**
		 * The meta object literal for the '{@link sosym.impl.InitiatorImpl <em>Initiator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.InitiatorImpl
		 * @see sosym.impl.SosymPackageImpl#getInitiator()
		 * @generated
		 */
		EClass INITIATOR = eINSTANCE.getInitiator();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATOR__REFERS_TO = eINSTANCE.getInitiator_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Initiator Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIATOR__INITIATOR_LABEL = eINSTANCE.getInitiator_InitiatorLabel();

		/**
		 * The meta object literal for the '{@link sosym.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ReceiverImpl
		 * @see sosym.impl.SosymPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__REFERS_TO = eINSTANCE.getReceiver_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Receiver Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVER__RECEIVER_LABEL = eINSTANCE.getReceiver_ReceiverLabel();

		/**
		 * The meta object literal for the '{@link sosym.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.ChannelImpl
		 * @see sosym.impl.SosymPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CHANNEL_NAME = eINSTANCE.getChannel_ChannelName();

		/**
		 * The meta object literal for the '{@link sosym.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.impl.MessageImpl
		 * @see sosym.impl.SosymPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Key Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__KEY_MESSAGE = eINSTANCE.getMessage_KeyMessage();

		/**
		 * The meta object literal for the '<em><b>Message Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_CONTENT = eINSTANCE.getMessage_MessageContent();

		/**
		 * The meta object literal for the '{@link sosym.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.Status
		 * @see sosym.impl.SosymPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link sosym.EUTypes <em>EU Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.EUTypes
		 * @see sosym.impl.SosymPackageImpl#getEUTypes()
		 * @generated
		 */
		EEnum EU_TYPES = eINSTANCE.getEUTypes();

		/**
		 * The meta object literal for the '{@link sosym.ComplianceValues <em>Compliance Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.ComplianceValues
		 * @see sosym.impl.SosymPackageImpl#getComplianceValues()
		 * @generated
		 */
		EEnum COMPLIANCE_VALUES = eINSTANCE.getComplianceValues();

		/**
		 * The meta object literal for the '{@link sosym.UncertaintyValues <em>Uncertainty Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.UncertaintyValues
		 * @see sosym.impl.SosymPackageImpl#getUncertaintyValues()
		 * @generated
		 */
		EEnum UNCERTAINTY_VALUES = eINSTANCE.getUncertaintyValues();

		/**
		 * The meta object literal for the '{@link sosym.Channels <em>Channels</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sosym.Channels
		 * @see sosym.impl.SosymPackageImpl#getChannels()
		 * @generated
		 */
		EEnum CHANNELS = eINSTANCE.getChannels();

	}

} //SosymPackage
