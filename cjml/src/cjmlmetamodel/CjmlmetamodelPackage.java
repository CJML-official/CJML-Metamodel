/**
 */
package cjmlmetamodel;

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
 * @see cjmlmetamodel.CjmlmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface CjmlmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cjmlmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cjml.no/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cjml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CjmlmetamodelPackage eINSTANCE = cjmlmetamodel.impl.CjmlmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.CustomerJourneyImpl <em>Customer Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.CustomerJourneyImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getCustomerJourney()
	 * @generated
	 */
	int CUSTOMER_JOURNEY = 2;

	/**
	 * The feature id for the '<em><b>Journey Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_OPERATORS = 0;

	/**
	 * The feature id for the '<em><b>Journey Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_PHASES = 1;

	/**
	 * The feature id for the '<em><b>End User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__END_USER = 2;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__SERVICE_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>External</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__EXTERNAL = 4;

	/**
	 * The feature id for the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_ID = 5;

	/**
	 * The feature id for the '<em><b>Journey Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_TITLE = 6;

	/**
	 * The feature id for the '<em><b>Journey Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY = 7;

	/**
	 * The feature id for the '<em><b>Journey Long Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY = 8;

	/**
	 * The number of structural features of the '<em>Customer Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Customer Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.PlannedJourneyImpl <em>Planned Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.PlannedJourneyImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedJourney()
	 * @generated
	 */
	int PLANNED_JOURNEY = 0;

	/**
	 * The feature id for the '<em><b>Journey Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__JOURNEY_OPERATORS = CUSTOMER_JOURNEY__JOURNEY_OPERATORS;

	/**
	 * The feature id for the '<em><b>Journey Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__JOURNEY_PHASES = CUSTOMER_JOURNEY__JOURNEY_PHASES;

	/**
	 * The feature id for the '<em><b>End User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__END_USER = CUSTOMER_JOURNEY__END_USER;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__SERVICE_PROVIDER = CUSTOMER_JOURNEY__SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>External</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__EXTERNAL = CUSTOMER_JOURNEY__EXTERNAL;

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
	 * The feature id for the '<em><b>Planned Touchpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY__PLANNED_TOUCHPOINTS = CUSTOMER_JOURNEY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Planned Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY_FEATURE_COUNT = CUSTOMER_JOURNEY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Planned Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_JOURNEY_OPERATION_COUNT = CUSTOMER_JOURNEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.ActualJourneyImpl <em>Actual Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ActualJourneyImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualJourney()
	 * @generated
	 */
	int ACTUAL_JOURNEY = 1;

	/**
	 * The feature id for the '<em><b>Journey Operators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_OPERATORS = CUSTOMER_JOURNEY__JOURNEY_OPERATORS;

	/**
	 * The feature id for the '<em><b>Journey Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_PHASES = CUSTOMER_JOURNEY__JOURNEY_PHASES;

	/**
	 * The feature id for the '<em><b>End User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__END_USER = CUSTOMER_JOURNEY__END_USER;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__SERVICE_PROVIDER = CUSTOMER_JOURNEY__SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>External</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__EXTERNAL = CUSTOMER_JOURNEY__EXTERNAL;

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
	 * The feature id for the '<em><b>Actual Touchpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__ACTUAL_TOUCHPOINTS = CUSTOMER_JOURNEY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Journey Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Journey Experience</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_EXPERIENCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Journey Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__JOURNEY_STATUS = CUSTOMER_JOURNEY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__CONTENT_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sequence Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timing Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY__TIMING_COMPLIANCE = CUSTOMER_JOURNEY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Actual Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY_FEATURE_COUNT = CUSTOMER_JOURNEY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Actual Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_JOURNEY_OPERATION_COUNT = CUSTOMER_JOURNEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.TouchpointImpl <em>Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.TouchpointImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getTouchpoint()
	 * @generated
	 */
	int TOUCHPOINT = 3;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__BACKEND_SYSTEMS = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__BELONGS_TO = 2;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__TOUCHPOINT_ID = 3;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__UNCERTAINTY = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__COMMENT = 5;

	/**
	 * The number of structural features of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.PlannedTouchpointImpl <em>Planned Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.PlannedTouchpointImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedTouchpoint()
	 * @generated
	 */
	int PLANNED_TOUCHPOINT = 4;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__BACKEND_SYSTEMS = TOUCHPOINT__BACKEND_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__OBJECTS = TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__BELONGS_TO = TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__TOUCHPOINT_ID = TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__UNCERTAINTY = TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__COMMENT = TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Delta Start Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__DELTA_START_TIME = TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Touchpoint Duration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION = TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Planned Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT_FEATURE_COUNT = TOUCHPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Planned Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUCHPOINT_OPERATION_COUNT = TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.ActualTouchpointImpl <em>Actual Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ActualTouchpointImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualTouchpoint()
	 * @generated
	 */
	int ACTUAL_TOUCHPOINT = 5;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__BACKEND_SYSTEMS = TOUCHPOINT__BACKEND_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__OBJECTS = TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__BELONGS_TO = TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__TOUCHPOINT_ID = TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__UNCERTAINTY = TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__COMMENT = TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__TIME_STARTED = TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__TIME_COMPLETED = TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Touchpoint Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE = TOUCHPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__COMPLIANCE = TOUCHPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Touchpoint Experience</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE = TOUCHPOINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actual Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT_FEATURE_COUNT = TOUCHPOINT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Actual Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_TOUCHPOINT_OPERATION_COUNT = TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.PlannedActionImpl <em>Planned Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.PlannedActionImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedAction()
	 * @generated
	 */
	int PLANNED_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__BACKEND_SYSTEMS = PLANNED_TOUCHPOINT__BACKEND_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__OBJECTS = PLANNED_TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__BELONGS_TO = PLANNED_TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__TOUCHPOINT_ID = PLANNED_TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__UNCERTAINTY = PLANNED_TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__COMMENT = PLANNED_TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Delta Start Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__DELTA_START_TIME = PLANNED_TOUCHPOINT__DELTA_START_TIME;

	/**
	 * The feature id for the '<em><b>Touchpoint Duration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__TOUCHPOINT_DURATION = PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION__INITIATOR = PLANNED_TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Planned Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION_FEATURE_COUNT = PLANNED_TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Planned Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_ACTION_OPERATION_COUNT = PLANNED_TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.PlannedCommunicationPointImpl <em>Planned Communication Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.PlannedCommunicationPointImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedCommunicationPoint()
	 * @generated
	 */
	int PLANNED_COMMUNICATION_POINT = 7;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__BACKEND_SYSTEMS = PLANNED_TOUCHPOINT__BACKEND_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__OBJECTS = PLANNED_TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__BELONGS_TO = PLANNED_TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__TOUCHPOINT_ID = PLANNED_TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__UNCERTAINTY = PLANNED_TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__COMMENT = PLANNED_TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Delta Start Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__DELTA_START_TIME = PLANNED_TOUCHPOINT__DELTA_START_TIME;

	/**
	 * The feature id for the '<em><b>Touchpoint Duration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__TOUCHPOINT_DURATION = PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__INITIATOR = PLANNED_TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__RECEIVER = PLANNED_TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__CHANNEL = PLANNED_TOUCHPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT__MESSAGE = PLANNED_TOUCHPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Planned Communication Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT_FEATURE_COUNT = PLANNED_TOUCHPOINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Planned Communication Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_COMMUNICATION_POINT_OPERATION_COUNT = PLANNED_TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.ActualCommunicationPointImpl <em>Actual Communication Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ActualCommunicationPointImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualCommunicationPoint()
	 * @generated
	 */
	int ACTUAL_COMMUNICATION_POINT = 8;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__BACKEND_SYSTEMS = ACTUAL_TOUCHPOINT__BACKEND_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__OBJECTS = ACTUAL_TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__BELONGS_TO = ACTUAL_TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TOUCHPOINT_ID = ACTUAL_TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__UNCERTAINTY = ACTUAL_TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__COMMENT = ACTUAL_TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TIME_STARTED = ACTUAL_TOUCHPOINT__TIME_STARTED;

	/**
	 * The feature id for the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TIME_COMPLETED = ACTUAL_TOUCHPOINT__TIME_COMPLETED;

	/**
	 * The feature id for the '<em><b>Touchpoint Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TOUCHPOINT_COMPLIANCE = ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__COMPLIANCE = ACTUAL_TOUCHPOINT__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Touchpoint Experience</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TOUCHPOINT_EXPERIENCE = ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE;

	/**
	 * The feature id for the '<em><b>Time Originated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TIME_ORIGINATED = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TIME_AVAILABLE = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__TIME_CONSUMED = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__INITIATOR = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__RECEIVER = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__CHANNEL = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT__MESSAGE = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Actual Communication Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT_FEATURE_COUNT = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Actual Communication Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_COMMUNICATION_POINT_OPERATION_COUNT = ACTUAL_TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.ActualActionImpl <em>Actual Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ActualActionImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualAction()
	 * @generated
	 */
	int ACTUAL_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Backend Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__BACKEND_SYSTEMS = ACTUAL_TOUCHPOINT__BACKEND_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__OBJECTS = ACTUAL_TOUCHPOINT__OBJECTS;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__BELONGS_TO = ACTUAL_TOUCHPOINT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__TOUCHPOINT_ID = ACTUAL_TOUCHPOINT__TOUCHPOINT_ID;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__UNCERTAINTY = ACTUAL_TOUCHPOINT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__COMMENT = ACTUAL_TOUCHPOINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__TIME_STARTED = ACTUAL_TOUCHPOINT__TIME_STARTED;

	/**
	 * The feature id for the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__TIME_COMPLETED = ACTUAL_TOUCHPOINT__TIME_COMPLETED;

	/**
	 * The feature id for the '<em><b>Touchpoint Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__TOUCHPOINT_COMPLIANCE = ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__COMPLIANCE = ACTUAL_TOUCHPOINT__COMPLIANCE;

	/**
	 * The feature id for the '<em><b>Touchpoint Experience</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__TOUCHPOINT_EXPERIENCE = ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION__INITIATOR = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actual Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION_FEATURE_COUNT = ACTUAL_TOUCHPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actual Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ACTION_OPERATION_COUNT = ACTUAL_TOUCHPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.JourneyOperatorImpl <em>Journey Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.JourneyOperatorImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getJourneyOperator()
	 * @generated
	 */
	int JOURNEY_OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATOR__BELONGS_TO = 0;

	/**
	 * The feature id for the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATOR__OPERATOR_ID = 1;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ConcurrencyImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getConcurrency()
	 * @generated
	 */
	int CONCURRENCY = 11;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__BELONGS_TO = JOURNEY_OPERATOR__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__OPERATOR_ID = JOURNEY_OPERATOR__OPERATOR_ID;

	/**
	 * The feature id for the '<em><b>Concurrencypaths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__CONCURRENCYPATHS = JOURNEY_OPERATOR_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.DecisionImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 12;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__BELONGS_TO = JOURNEY_OPERATOR__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OPERATOR_ID = JOURNEY_OPERATOR__OPERATOR_ID;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ExperienceImpl <em>Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ExperienceImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getExperience()
	 * @generated
	 */
	int EXPERIENCE = 13;

	/**
	 * The feature id for the '<em><b>End User Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__END_USER_RATING = 0;

	/**
	 * The feature id for the '<em><b>End User Experience Rating</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__END_USER_EXPERIENCE_RATING = 1;

	/**
	 * The number of structural features of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.BackendSystemImpl <em>Backend System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.BackendSystemImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getBackendSystem()
	 * @generated
	 */
	int BACKEND_SYSTEM = 14;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ObjectImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 15;

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
	 * The feature id for the '<em><b>Object Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IS_VIRTUAL = 3;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.JourneyPhaseImpl <em>Journey Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.JourneyPhaseImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getJourneyPhase()
	 * @generated
	 */
	int JOURNEY_PHASE = 16;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ActorImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 17;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.EndUserImpl <em>End User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.EndUserImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getEndUser()
	 * @generated
	 */
	int END_USER = 18;

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
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER__IS_MAIN = ACTOR_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ServiceProviderImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 19;

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
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__POSITION = ACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__TYPE = ACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.ExternalImpl <em>External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ExternalImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 20;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.InitiatorImpl <em>Initiator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.InitiatorImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getInitiator()
	 * @generated
	 */
	int INITIATOR = 21;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ReceiverImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 22;

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
	 * The meta object id for the '{@link cjmlmetamodel.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.ChannelImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 23;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Com Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__COM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__IS_SYNCHRONOUS = 2;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.MessageImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 24;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Key Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__KEY_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Derived Key Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DERIVED_KEY_CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.CustomerImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 25;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ACTOR_ID = END_USER__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ACTOR_NAME = END_USER__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ACTOR_DESCRIPTION = END_USER__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__IS_VIRTUAL = END_USER__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__IS_MAIN = END_USER__IS_MAIN;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LIKES = END_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frustrations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FRUSTRATIONS = END_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preferred Channels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PREFERRED_CHANNELS = END_USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = END_USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = END_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.UserImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 26;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTOR_ID = END_USER__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTOR_NAME = END_USER__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTOR_DESCRIPTION = END_USER__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_VIRTUAL = END_USER__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_MAIN = END_USER__IS_MAIN;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = END_USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = END_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.CitizenImpl <em>Citizen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.CitizenImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getCitizen()
	 * @generated
	 */
	int CITIZEN = 27;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN__ACTOR_ID = END_USER__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN__ACTOR_NAME = END_USER__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN__ACTOR_DESCRIPTION = END_USER__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN__IS_VIRTUAL = END_USER__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN__IS_MAIN = END_USER__IS_MAIN;

	/**
	 * The number of structural features of the '<em>Citizen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN_FEATURE_COUNT = END_USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Citizen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIZEN_OPERATION_COUNT = END_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.PatientImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 28;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTOR_ID = END_USER__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTOR_NAME = END_USER__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTOR_DESCRIPTION = END_USER__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__IS_VIRTUAL = END_USER__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__IS_MAIN = END_USER__IS_MAIN;

	/**
	 * The feature id for the '<em><b>Patient Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_TYPE = END_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagnosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DIAGNOSIS = END_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Insurance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__INSURANCE_NAME = END_USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = END_USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = END_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.impl.EmployeeImpl
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 29;

	/**
	 * The feature id for the '<em><b>Actor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ACTOR_ID = END_USER__ACTOR_ID;

	/**
	 * The feature id for the '<em><b>Actor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ACTOR_NAME = END_USER__ACTOR_NAME;

	/**
	 * The feature id for the '<em><b>Actor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ACTOR_DESCRIPTION = END_USER__ACTOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__IS_VIRTUAL = END_USER__IS_VIRTUAL;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__IS_MAIN = END_USER__IS_MAIN;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__COMPANY_NAME = END_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DEPARTMENT = END_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__POSITION = END_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Years Experience</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__YEARS_EXPERIENCE = END_USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = END_USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = END_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.complianceValues <em>compliance Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.complianceValues
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getcomplianceValues()
	 * @generated
	 */
	int COMPLIANCE_VALUES = 30;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.status <em>status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.status
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getstatus()
	 * @generated
	 */
	int STATUS = 31;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.channels <em>channels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.channels
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getchannels()
	 * @generated
	 */
	int CHANNELS = 32;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.uncertaintyValues <em>uncertainty Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.uncertaintyValues
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getuncertaintyValues()
	 * @generated
	 */
	int UNCERTAINTY_VALUES = 33;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.comTypes <em>com Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.comTypes
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getcomTypes()
	 * @generated
	 */
	int COM_TYPES = 34;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.providerTypes <em>provider Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.providerTypes
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getproviderTypes()
	 * @generated
	 */
	int PROVIDER_TYPES = 35;

	/**
	 * The meta object id for the '{@link cjmlmetamodel.patientTypes <em>patient Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cjmlmetamodel.patientTypes
	 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getpatientTypes()
	 * @generated
	 */
	int PATIENT_TYPES = 36;


	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.PlannedJourney <em>Planned Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Journey</em>'.
	 * @see cjmlmetamodel.PlannedJourney
	 * @generated
	 */
	EClass getPlannedJourney();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.PlannedJourney#getPlannedTouchpoints <em>Planned Touchpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planned Touchpoints</em>'.
	 * @see cjmlmetamodel.PlannedJourney#getPlannedTouchpoints()
	 * @see #getPlannedJourney()
	 * @generated
	 */
	EReference getPlannedJourney_PlannedTouchpoints();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.ActualJourney <em>Actual Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Journey</em>'.
	 * @see cjmlmetamodel.ActualJourney
	 * @generated
	 */
	EClass getActualJourney();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.ActualJourney#getActualTouchpoints <em>Actual Touchpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Touchpoints</em>'.
	 * @see cjmlmetamodel.ActualJourney#getActualTouchpoints()
	 * @see #getActualJourney()
	 * @generated
	 */
	EReference getActualJourney_ActualTouchpoints();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualJourney#getJourneyCompliance <em>Journey Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Journey Compliance</em>'.
	 * @see cjmlmetamodel.ActualJourney#getJourneyCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EReference getActualJourney_JourneyCompliance();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualJourney#getJourneyExperience <em>Journey Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Journey Experience</em>'.
	 * @see cjmlmetamodel.ActualJourney#getJourneyExperience()
	 * @see #getActualJourney()
	 * @generated
	 */
	EReference getActualJourney_JourneyExperience();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualJourney#getJourneyStatus <em>Journey Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Status</em>'.
	 * @see cjmlmetamodel.ActualJourney#getJourneyStatus()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_JourneyStatus();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualJourney#isContentCompliance <em>Content Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Compliance</em>'.
	 * @see cjmlmetamodel.ActualJourney#isContentCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_ContentCompliance();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualJourney#isSequenceCompliance <em>Sequence Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Compliance</em>'.
	 * @see cjmlmetamodel.ActualJourney#isSequenceCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_SequenceCompliance();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualJourney#isTimingCompliance <em>Timing Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timing Compliance</em>'.
	 * @see cjmlmetamodel.ActualJourney#isTimingCompliance()
	 * @see #getActualJourney()
	 * @generated
	 */
	EAttribute getActualJourney_TimingCompliance();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.CustomerJourney <em>Customer Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Journey</em>'.
	 * @see cjmlmetamodel.CustomerJourney
	 * @generated
	 */
	EClass getCustomerJourney();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.CustomerJourney#getJourneyOperators <em>Journey Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Journey Operators</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getJourneyOperators()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_JourneyOperators();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.CustomerJourney#getJourneyPhases <em>Journey Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Journey Phases</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getJourneyPhases()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_JourneyPhases();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.CustomerJourney#getEndUser <em>End User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End User</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getEndUser()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_EndUser();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.CustomerJourney#getServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Provider</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getServiceProvider()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_ServiceProvider();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.CustomerJourney#getExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getExternal()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_External();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.CustomerJourney#getJourneyID <em>Journey ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey ID</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getJourneyID()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyID();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.CustomerJourney#getJourneyTitle <em>Journey Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Title</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getJourneyTitle()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyTitle();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Short Summary</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getJourneyShortSummary()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyShortSummary();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Long Summary</em>'.
	 * @see cjmlmetamodel.CustomerJourney#getJourneyLongSummary()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_JourneyLongSummary();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchpoint</em>'.
	 * @see cjmlmetamodel.Touchpoint
	 * @generated
	 */
	EClass getTouchpoint();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.Touchpoint#getBackendSystems <em>Backend Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Backend Systems</em>'.
	 * @see cjmlmetamodel.Touchpoint#getBackendSystems()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EReference getTouchpoint_BackendSystems();

	/**
	 * Returns the meta object for the reference list '{@link cjmlmetamodel.Touchpoint#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see cjmlmetamodel.Touchpoint#getObjects()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EReference getTouchpoint_Objects();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.Touchpoint#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see cjmlmetamodel.Touchpoint#getBelongsTo()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EReference getTouchpoint_BelongsTo();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Touchpoint#getTouchpointID <em>Touchpoint ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touchpoint ID</em>'.
	 * @see cjmlmetamodel.Touchpoint#getTouchpointID()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_TouchpointID();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Touchpoint#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see cjmlmetamodel.Touchpoint#getUncertainty()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Uncertainty();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Touchpoint#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see cjmlmetamodel.Touchpoint#getComment()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Comment();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.PlannedTouchpoint <em>Planned Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Touchpoint</em>'.
	 * @see cjmlmetamodel.PlannedTouchpoint
	 * @generated
	 */
	EClass getPlannedTouchpoint();

	/**
	 * Returns the meta object for the attribute list '{@link cjmlmetamodel.PlannedTouchpoint#getDeltaStartTime <em>Delta Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Delta Start Time</em>'.
	 * @see cjmlmetamodel.PlannedTouchpoint#getDeltaStartTime()
	 * @see #getPlannedTouchpoint()
	 * @generated
	 */
	EAttribute getPlannedTouchpoint_DeltaStartTime();

	/**
	 * Returns the meta object for the attribute list '{@link cjmlmetamodel.PlannedTouchpoint#getTouchpointDuration <em>Touchpoint Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Touchpoint Duration</em>'.
	 * @see cjmlmetamodel.PlannedTouchpoint#getTouchpointDuration()
	 * @see #getPlannedTouchpoint()
	 * @generated
	 */
	EAttribute getPlannedTouchpoint_TouchpointDuration();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.ActualTouchpoint <em>Actual Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Touchpoint</em>'.
	 * @see cjmlmetamodel.ActualTouchpoint
	 * @generated
	 */
	EClass getActualTouchpoint();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualTouchpoint#getTimeStarted <em>Time Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Started</em>'.
	 * @see cjmlmetamodel.ActualTouchpoint#getTimeStarted()
	 * @see #getActualTouchpoint()
	 * @generated
	 */
	EAttribute getActualTouchpoint_TimeStarted();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualTouchpoint#getTimeCompleted <em>Time Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Completed</em>'.
	 * @see cjmlmetamodel.ActualTouchpoint#getTimeCompleted()
	 * @see #getActualTouchpoint()
	 * @generated
	 */
	EAttribute getActualTouchpoint_TimeCompleted();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualTouchpoint#getTouchpointCompliance <em>Touchpoint Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Touchpoint Compliance</em>'.
	 * @see cjmlmetamodel.ActualTouchpoint#getTouchpointCompliance()
	 * @see #getActualTouchpoint()
	 * @generated
	 */
	EReference getActualTouchpoint_TouchpointCompliance();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualTouchpoint#getCompliance <em>Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance</em>'.
	 * @see cjmlmetamodel.ActualTouchpoint#getCompliance()
	 * @see #getActualTouchpoint()
	 * @generated
	 */
	EAttribute getActualTouchpoint_Compliance();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualTouchpoint#getTouchpointExperience <em>Touchpoint Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Touchpoint Experience</em>'.
	 * @see cjmlmetamodel.ActualTouchpoint#getTouchpointExperience()
	 * @see #getActualTouchpoint()
	 * @generated
	 */
	EReference getActualTouchpoint_TouchpointExperience();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.PlannedAction <em>Planned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Action</em>'.
	 * @see cjmlmetamodel.PlannedAction
	 * @generated
	 */
	EClass getPlannedAction();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.PlannedAction#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiator</em>'.
	 * @see cjmlmetamodel.PlannedAction#getInitiator()
	 * @see #getPlannedAction()
	 * @generated
	 */
	EReference getPlannedAction_Initiator();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.PlannedCommunicationPoint <em>Planned Communication Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Communication Point</em>'.
	 * @see cjmlmetamodel.PlannedCommunicationPoint
	 * @generated
	 */
	EClass getPlannedCommunicationPoint();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.PlannedCommunicationPoint#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiator</em>'.
	 * @see cjmlmetamodel.PlannedCommunicationPoint#getInitiator()
	 * @see #getPlannedCommunicationPoint()
	 * @generated
	 */
	EReference getPlannedCommunicationPoint_Initiator();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.PlannedCommunicationPoint#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see cjmlmetamodel.PlannedCommunicationPoint#getReceiver()
	 * @see #getPlannedCommunicationPoint()
	 * @generated
	 */
	EReference getPlannedCommunicationPoint_Receiver();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.PlannedCommunicationPoint#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see cjmlmetamodel.PlannedCommunicationPoint#getChannel()
	 * @see #getPlannedCommunicationPoint()
	 * @generated
	 */
	EReference getPlannedCommunicationPoint_Channel();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.PlannedCommunicationPoint#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see cjmlmetamodel.PlannedCommunicationPoint#getMessage()
	 * @see #getPlannedCommunicationPoint()
	 * @generated
	 */
	EReference getPlannedCommunicationPoint_Message();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.ActualCommunicationPoint <em>Actual Communication Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Communication Point</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint
	 * @generated
	 */
	EClass getActualCommunicationPoint();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualCommunicationPoint#getTimeOriginated <em>Time Originated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Originated</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getTimeOriginated()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EAttribute getActualCommunicationPoint_TimeOriginated();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualCommunicationPoint#getTimeAvailable <em>Time Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Available</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getTimeAvailable()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EAttribute getActualCommunicationPoint_TimeAvailable();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ActualCommunicationPoint#getTimeConsumed <em>Time Consumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Consumed</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getTimeConsumed()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EAttribute getActualCommunicationPoint_TimeConsumed();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualCommunicationPoint#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiator</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getInitiator()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EReference getActualCommunicationPoint_Initiator();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualCommunicationPoint#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getReceiver()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EReference getActualCommunicationPoint_Receiver();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualCommunicationPoint#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getChannel()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EReference getActualCommunicationPoint_Channel();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualCommunicationPoint#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see cjmlmetamodel.ActualCommunicationPoint#getMessage()
	 * @see #getActualCommunicationPoint()
	 * @generated
	 */
	EReference getActualCommunicationPoint_Message();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.ActualAction <em>Actual Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Action</em>'.
	 * @see cjmlmetamodel.ActualAction
	 * @generated
	 */
	EClass getActualAction();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.ActualAction#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiator</em>'.
	 * @see cjmlmetamodel.ActualAction#getInitiator()
	 * @see #getActualAction()
	 * @generated
	 */
	EReference getActualAction_Initiator();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.JourneyOperator <em>Journey Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Operator</em>'.
	 * @see cjmlmetamodel.JourneyOperator
	 * @generated
	 */
	EClass getJourneyOperator();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.JourneyOperator#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see cjmlmetamodel.JourneyOperator#getBelongsTo()
	 * @see #getJourneyOperator()
	 * @generated
	 */
	EReference getJourneyOperator_BelongsTo();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.JourneyOperator#getOperatorID <em>Operator ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator ID</em>'.
	 * @see cjmlmetamodel.JourneyOperator#getOperatorID()
	 * @see #getJourneyOperator()
	 * @generated
	 */
	EAttribute getJourneyOperator_OperatorID();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency</em>'.
	 * @see cjmlmetamodel.Concurrency
	 * @generated
	 */
	EClass getConcurrency();

	/**
	 * Returns the meta object for the attribute list '{@link cjmlmetamodel.Concurrency#getConcurrencypaths <em>Concurrencypaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Concurrencypaths</em>'.
	 * @see cjmlmetamodel.Concurrency#getConcurrencypaths()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_Concurrencypaths();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see cjmlmetamodel.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Decision#getDecisionPaths <em>Decision Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Paths</em>'.
	 * @see cjmlmetamodel.Decision#getDecisionPaths()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_DecisionPaths();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Decision#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see cjmlmetamodel.Decision#getCondition()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Condition();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.Decision#getDecisionMaker <em>Decision Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Maker</em>'.
	 * @see cjmlmetamodel.Decision#getDecisionMaker()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_DecisionMaker();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Experience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experience</em>'.
	 * @see cjmlmetamodel.Experience
	 * @generated
	 */
	EClass getExperience();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Experience#getEndUserRating <em>End User Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End User Rating</em>'.
	 * @see cjmlmetamodel.Experience#getEndUserRating()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_EndUserRating();

	/**
	 * Returns the meta object for the attribute list '{@link cjmlmetamodel.Experience#getEndUserExperienceRating <em>End User Experience Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>End User Experience Rating</em>'.
	 * @see cjmlmetamodel.Experience#getEndUserExperienceRating()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_EndUserExperienceRating();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.BackendSystem <em>Backend System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backend System</em>'.
	 * @see cjmlmetamodel.BackendSystem
	 * @generated
	 */
	EClass getBackendSystem();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.BackendSystem#getSystemID <em>System ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System ID</em>'.
	 * @see cjmlmetamodel.BackendSystem#getSystemID()
	 * @see #getBackendSystem()
	 * @generated
	 */
	EAttribute getBackendSystem_SystemID();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.BackendSystem#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see cjmlmetamodel.BackendSystem#getSystemName()
	 * @see #getBackendSystem()
	 * @generated
	 */
	EAttribute getBackendSystem_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.BackendSystem#getSystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Description</em>'.
	 * @see cjmlmetamodel.BackendSystem#getSystemDescription()
	 * @see #getBackendSystem()
	 * @generated
	 */
	EAttribute getBackendSystem_SystemDescription();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see cjmlmetamodel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Object#getObjectID <em>Object ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object ID</em>'.
	 * @see cjmlmetamodel.Object#getObjectID()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectID();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Object#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see cjmlmetamodel.Object#getObjectName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectName();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Object#getObjectDescription <em>Object Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Description</em>'.
	 * @see cjmlmetamodel.Object#getObjectDescription()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectDescription();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Object#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see cjmlmetamodel.Object#isIsVirtual()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_IsVirtual();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.JourneyPhase <em>Journey Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Phase</em>'.
	 * @see cjmlmetamodel.JourneyPhase
	 * @generated
	 */
	EClass getJourneyPhase();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.JourneyPhase#getPhaseName <em>Phase Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Name</em>'.
	 * @see cjmlmetamodel.JourneyPhase#getPhaseName()
	 * @see #getJourneyPhase()
	 * @generated
	 */
	EAttribute getJourneyPhase_PhaseName();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.JourneyPhase#getPhaseDescription <em>Phase Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Description</em>'.
	 * @see cjmlmetamodel.JourneyPhase#getPhaseDescription()
	 * @see #getJourneyPhase()
	 * @generated
	 */
	EAttribute getJourneyPhase_PhaseDescription();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see cjmlmetamodel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Actor#getActorID <em>Actor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor ID</em>'.
	 * @see cjmlmetamodel.Actor#getActorID()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorID();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Actor#getActorName <em>Actor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Name</em>'.
	 * @see cjmlmetamodel.Actor#getActorName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorName();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Actor#getActorDescription <em>Actor Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Description</em>'.
	 * @see cjmlmetamodel.Actor#getActorDescription()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorDescription();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Actor#getIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see cjmlmetamodel.Actor#getIsVirtual()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_IsVirtual();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.EndUser <em>End User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End User</em>'.
	 * @see cjmlmetamodel.EndUser
	 * @generated
	 */
	EClass getEndUser();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.EndUser#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see cjmlmetamodel.EndUser#isIsMain()
	 * @see #getEndUser()
	 * @generated
	 */
	EAttribute getEndUser_IsMain();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider</em>'.
	 * @see cjmlmetamodel.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ServiceProvider#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see cjmlmetamodel.ServiceProvider#getCompanyName()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ServiceProvider#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see cjmlmetamodel.ServiceProvider#getDepartment()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Department();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ServiceProvider#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see cjmlmetamodel.ServiceProvider#getPosition()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Position();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.ServiceProvider#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cjmlmetamodel.ServiceProvider#getType()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_Type();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External</em>'.
	 * @see cjmlmetamodel.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Initiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiator</em>'.
	 * @see cjmlmetamodel.Initiator
	 * @generated
	 */
	EClass getInitiator();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.Initiator#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see cjmlmetamodel.Initiator#getRefersTo()
	 * @see #getInitiator()
	 * @generated
	 */
	EReference getInitiator_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Initiator#getInitiatorLabel <em>Initiator Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator Label</em>'.
	 * @see cjmlmetamodel.Initiator#getInitiatorLabel()
	 * @see #getInitiator()
	 * @generated
	 */
	EAttribute getInitiator_InitiatorLabel();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see cjmlmetamodel.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for the reference '{@link cjmlmetamodel.Receiver#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see cjmlmetamodel.Receiver#getRefersTo()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_RefersTo();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Receiver#getReceiverLabel <em>Receiver Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Label</em>'.
	 * @see cjmlmetamodel.Receiver#getReceiverLabel()
	 * @see #getReceiver()
	 * @generated
	 */
	EAttribute getReceiver_ReceiverLabel();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see cjmlmetamodel.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Channel#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see cjmlmetamodel.Channel#getChannel()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Channel();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Channel#getComType <em>Com Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Com Type</em>'.
	 * @see cjmlmetamodel.Channel#getComType()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_ComType();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Channel#isIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronous</em>'.
	 * @see cjmlmetamodel.Channel#isIsSynchronous()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_IsSynchronous();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see cjmlmetamodel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Message#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see cjmlmetamodel.Message#getContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Content();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Message#getKeyContent <em>Key Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Content</em>'.
	 * @see cjmlmetamodel.Message#getKeyContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_KeyContent();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Message#getDerivedKeyContent <em>Derived Key Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Key Content</em>'.
	 * @see cjmlmetamodel.Message#getDerivedKeyContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_DerivedKeyContent();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see cjmlmetamodel.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Customer#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likes</em>'.
	 * @see cjmlmetamodel.Customer#getLikes()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Likes();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Customer#getFrustrations <em>Frustrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frustrations</em>'.
	 * @see cjmlmetamodel.Customer#getFrustrations()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Frustrations();

	/**
	 * Returns the meta object for the attribute list '{@link cjmlmetamodel.Customer#getPreferredChannels <em>Preferred Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preferred Channels</em>'.
	 * @see cjmlmetamodel.Customer#getPreferredChannels()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PreferredChannels();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see cjmlmetamodel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Citizen <em>Citizen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citizen</em>'.
	 * @see cjmlmetamodel.Citizen
	 * @generated
	 */
	EClass getCitizen();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see cjmlmetamodel.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Patient#getPatientType <em>Patient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Type</em>'.
	 * @see cjmlmetamodel.Patient#getPatientType()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientType();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Patient#getDiagnosis <em>Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnosis</em>'.
	 * @see cjmlmetamodel.Patient#getDiagnosis()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Diagnosis();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Patient#getInsuranceName <em>Insurance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insurance Name</em>'.
	 * @see cjmlmetamodel.Patient#getInsuranceName()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_InsuranceName();

	/**
	 * Returns the meta object for class '{@link cjmlmetamodel.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see cjmlmetamodel.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Employee#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see cjmlmetamodel.Employee#getCompanyName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Employee#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see cjmlmetamodel.Employee#getDepartment()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Department();

	/**
	 * Returns the meta object for the attribute '{@link cjmlmetamodel.Employee#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see cjmlmetamodel.Employee#getPosition()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Position();

	/**
	 * Returns the meta object for the attribute list '{@link cjmlmetamodel.Employee#getYearsExperience <em>Years Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Years Experience</em>'.
	 * @see cjmlmetamodel.Employee#getYearsExperience()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_YearsExperience();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.complianceValues <em>compliance Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>compliance Values</em>'.
	 * @see cjmlmetamodel.complianceValues
	 * @generated
	 */
	EEnum getcomplianceValues();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.status <em>status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>status</em>'.
	 * @see cjmlmetamodel.status
	 * @generated
	 */
	EEnum getstatus();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.channels <em>channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>channels</em>'.
	 * @see cjmlmetamodel.channels
	 * @generated
	 */
	EEnum getchannels();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.uncertaintyValues <em>uncertainty Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>uncertainty Values</em>'.
	 * @see cjmlmetamodel.uncertaintyValues
	 * @generated
	 */
	EEnum getuncertaintyValues();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.comTypes <em>com Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>com Types</em>'.
	 * @see cjmlmetamodel.comTypes
	 * @generated
	 */
	EEnum getcomTypes();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.providerTypes <em>provider Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>provider Types</em>'.
	 * @see cjmlmetamodel.providerTypes
	 * @generated
	 */
	EEnum getproviderTypes();

	/**
	 * Returns the meta object for enum '{@link cjmlmetamodel.patientTypes <em>patient Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>patient Types</em>'.
	 * @see cjmlmetamodel.patientTypes
	 * @generated
	 */
	EEnum getpatientTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CjmlmetamodelFactory getCjmlmetamodelFactory();

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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.PlannedJourneyImpl <em>Planned Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.PlannedJourneyImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedJourney()
		 * @generated
		 */
		EClass PLANNED_JOURNEY = eINSTANCE.getPlannedJourney();

		/**
		 * The meta object literal for the '<em><b>Planned Touchpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_JOURNEY__PLANNED_TOUCHPOINTS = eINSTANCE.getPlannedJourney_PlannedTouchpoints();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ActualJourneyImpl <em>Actual Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ActualJourneyImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualJourney()
		 * @generated
		 */
		EClass ACTUAL_JOURNEY = eINSTANCE.getActualJourney();

		/**
		 * The meta object literal for the '<em><b>Actual Touchpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_JOURNEY__ACTUAL_TOUCHPOINTS = eINSTANCE.getActualJourney_ActualTouchpoints();

		/**
		 * The meta object literal for the '<em><b>Journey Compliance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_JOURNEY__JOURNEY_COMPLIANCE = eINSTANCE.getActualJourney_JourneyCompliance();

		/**
		 * The meta object literal for the '<em><b>Journey Experience</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_JOURNEY__JOURNEY_EXPERIENCE = eINSTANCE.getActualJourney_JourneyExperience();

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
		 * The meta object literal for the '<em><b>Timing Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_JOURNEY__TIMING_COMPLIANCE = eINSTANCE.getActualJourney_TimingCompliance();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.CustomerJourneyImpl <em>Customer Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.CustomerJourneyImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getCustomerJourney()
		 * @generated
		 */
		EClass CUSTOMER_JOURNEY = eINSTANCE.getCustomerJourney();

		/**
		 * The meta object literal for the '<em><b>Journey Operators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__JOURNEY_OPERATORS = eINSTANCE.getCustomerJourney_JourneyOperators();

		/**
		 * The meta object literal for the '<em><b>Journey Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__JOURNEY_PHASES = eINSTANCE.getCustomerJourney_JourneyPhases();

		/**
		 * The meta object literal for the '<em><b>End User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__END_USER = eINSTANCE.getCustomerJourney_EndUser();

		/**
		 * The meta object literal for the '<em><b>Service Provider</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__SERVICE_PROVIDER = eINSTANCE.getCustomerJourney_ServiceProvider();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__EXTERNAL = eINSTANCE.getCustomerJourney_External();

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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.TouchpointImpl <em>Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.TouchpointImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getTouchpoint()
		 * @generated
		 */
		EClass TOUCHPOINT = eINSTANCE.getTouchpoint();

		/**
		 * The meta object literal for the '<em><b>Backend Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHPOINT__BACKEND_SYSTEMS = eINSTANCE.getTouchpoint_BackendSystems();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHPOINT__OBJECTS = eINSTANCE.getTouchpoint_Objects();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHPOINT__BELONGS_TO = eINSTANCE.getTouchpoint_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Touchpoint ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__TOUCHPOINT_ID = eINSTANCE.getTouchpoint_TouchpointID();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__UNCERTAINTY = eINSTANCE.getTouchpoint_Uncertainty();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__COMMENT = eINSTANCE.getTouchpoint_Comment();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.PlannedTouchpointImpl <em>Planned Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.PlannedTouchpointImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedTouchpoint()
		 * @generated
		 */
		EClass PLANNED_TOUCHPOINT = eINSTANCE.getPlannedTouchpoint();

		/**
		 * The meta object literal for the '<em><b>Delta Start Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_TOUCHPOINT__DELTA_START_TIME = eINSTANCE.getPlannedTouchpoint_DeltaStartTime();

		/**
		 * The meta object literal for the '<em><b>Touchpoint Duration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION = eINSTANCE.getPlannedTouchpoint_TouchpointDuration();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ActualTouchpointImpl <em>Actual Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ActualTouchpointImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualTouchpoint()
		 * @generated
		 */
		EClass ACTUAL_TOUCHPOINT = eINSTANCE.getActualTouchpoint();

		/**
		 * The meta object literal for the '<em><b>Time Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_TOUCHPOINT__TIME_STARTED = eINSTANCE.getActualTouchpoint_TimeStarted();

		/**
		 * The meta object literal for the '<em><b>Time Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_TOUCHPOINT__TIME_COMPLETED = eINSTANCE.getActualTouchpoint_TimeCompleted();

		/**
		 * The meta object literal for the '<em><b>Touchpoint Compliance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE = eINSTANCE.getActualTouchpoint_TouchpointCompliance();

		/**
		 * The meta object literal for the '<em><b>Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_TOUCHPOINT__COMPLIANCE = eINSTANCE.getActualTouchpoint_Compliance();

		/**
		 * The meta object literal for the '<em><b>Touchpoint Experience</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE = eINSTANCE.getActualTouchpoint_TouchpointExperience();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.PlannedActionImpl <em>Planned Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.PlannedActionImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedAction()
		 * @generated
		 */
		EClass PLANNED_ACTION = eINSTANCE.getPlannedAction();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_ACTION__INITIATOR = eINSTANCE.getPlannedAction_Initiator();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.PlannedCommunicationPointImpl <em>Planned Communication Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.PlannedCommunicationPointImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPlannedCommunicationPoint()
		 * @generated
		 */
		EClass PLANNED_COMMUNICATION_POINT = eINSTANCE.getPlannedCommunicationPoint();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_COMMUNICATION_POINT__INITIATOR = eINSTANCE.getPlannedCommunicationPoint_Initiator();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_COMMUNICATION_POINT__RECEIVER = eINSTANCE.getPlannedCommunicationPoint_Receiver();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_COMMUNICATION_POINT__CHANNEL = eINSTANCE.getPlannedCommunicationPoint_Channel();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_COMMUNICATION_POINT__MESSAGE = eINSTANCE.getPlannedCommunicationPoint_Message();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ActualCommunicationPointImpl <em>Actual Communication Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ActualCommunicationPointImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualCommunicationPoint()
		 * @generated
		 */
		EClass ACTUAL_COMMUNICATION_POINT = eINSTANCE.getActualCommunicationPoint();

		/**
		 * The meta object literal for the '<em><b>Time Originated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_COMMUNICATION_POINT__TIME_ORIGINATED = eINSTANCE.getActualCommunicationPoint_TimeOriginated();

		/**
		 * The meta object literal for the '<em><b>Time Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_COMMUNICATION_POINT__TIME_AVAILABLE = eINSTANCE.getActualCommunicationPoint_TimeAvailable();

		/**
		 * The meta object literal for the '<em><b>Time Consumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_COMMUNICATION_POINT__TIME_CONSUMED = eINSTANCE.getActualCommunicationPoint_TimeConsumed();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_COMMUNICATION_POINT__INITIATOR = eINSTANCE.getActualCommunicationPoint_Initiator();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_COMMUNICATION_POINT__RECEIVER = eINSTANCE.getActualCommunicationPoint_Receiver();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_COMMUNICATION_POINT__CHANNEL = eINSTANCE.getActualCommunicationPoint_Channel();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_COMMUNICATION_POINT__MESSAGE = eINSTANCE.getActualCommunicationPoint_Message();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ActualActionImpl <em>Actual Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ActualActionImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActualAction()
		 * @generated
		 */
		EClass ACTUAL_ACTION = eINSTANCE.getActualAction();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_ACTION__INITIATOR = eINSTANCE.getActualAction_Initiator();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.JourneyOperatorImpl <em>Journey Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.JourneyOperatorImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getJourneyOperator()
		 * @generated
		 */
		EClass JOURNEY_OPERATOR = eINSTANCE.getJourneyOperator();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_OPERATOR__BELONGS_TO = eINSTANCE.getJourneyOperator_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Operator ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_OPERATOR__OPERATOR_ID = eINSTANCE.getJourneyOperator_OperatorID();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ConcurrencyImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getConcurrency()
		 * @generated
		 */
		EClass CONCURRENCY = eINSTANCE.getConcurrency();

		/**
		 * The meta object literal for the '<em><b>Concurrencypaths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__CONCURRENCYPATHS = eINSTANCE.getConcurrency_Concurrencypaths();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.DecisionImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getDecision()
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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ExperienceImpl <em>Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ExperienceImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getExperience()
		 * @generated
		 */
		EClass EXPERIENCE = eINSTANCE.getExperience();

		/**
		 * The meta object literal for the '<em><b>End User Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__END_USER_RATING = eINSTANCE.getExperience_EndUserRating();

		/**
		 * The meta object literal for the '<em><b>End User Experience Rating</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__END_USER_EXPERIENCE_RATING = eINSTANCE.getExperience_EndUserExperienceRating();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.BackendSystemImpl <em>Backend System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.BackendSystemImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getBackendSystem()
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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ObjectImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getObject()
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
		 * The meta object literal for the '<em><b>Object Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT_DESCRIPTION = eINSTANCE.getObject_ObjectDescription();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__IS_VIRTUAL = eINSTANCE.getObject_IsVirtual();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.JourneyPhaseImpl <em>Journey Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.JourneyPhaseImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getJourneyPhase()
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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ActorImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getActor()
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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.EndUserImpl <em>End User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.EndUserImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getEndUser()
		 * @generated
		 */
		EClass END_USER = eINSTANCE.getEndUser();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_USER__IS_MAIN = eINSTANCE.getEndUser_IsMain();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ServiceProviderImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getServiceProvider()
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
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__POSITION = eINSTANCE.getServiceProvider_Position();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__TYPE = eINSTANCE.getServiceProvider_Type();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ExternalImpl <em>External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ExternalImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getExternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getExternal();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.InitiatorImpl <em>Initiator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.InitiatorImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getInitiator()
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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ReceiverImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getReceiver()
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
		 * The meta object literal for the '{@link cjmlmetamodel.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.ChannelImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CHANNEL = eINSTANCE.getChannel_Channel();

		/**
		 * The meta object literal for the '<em><b>Com Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__COM_TYPE = eINSTANCE.getChannel_ComType();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__IS_SYNCHRONOUS = eINSTANCE.getChannel_IsSynchronous();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.MessageImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CONTENT = eINSTANCE.getMessage_Content();

		/**
		 * The meta object literal for the '<em><b>Key Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__KEY_CONTENT = eINSTANCE.getMessage_KeyContent();

		/**
		 * The meta object literal for the '<em><b>Derived Key Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DERIVED_KEY_CONTENT = eINSTANCE.getMessage_DerivedKeyContent();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.CustomerImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LIKES = eINSTANCE.getCustomer_Likes();

		/**
		 * The meta object literal for the '<em><b>Frustrations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FRUSTRATIONS = eINSTANCE.getCustomer_Frustrations();

		/**
		 * The meta object literal for the '<em><b>Preferred Channels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PREFERRED_CHANNELS = eINSTANCE.getCustomer_PreferredChannels();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.UserImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.CitizenImpl <em>Citizen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.CitizenImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getCitizen()
		 * @generated
		 */
		EClass CITIZEN = eINSTANCE.getCitizen();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.PatientImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Patient Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_TYPE = eINSTANCE.getPatient_PatientType();

		/**
		 * The meta object literal for the '<em><b>Diagnosis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__DIAGNOSIS = eINSTANCE.getPatient_Diagnosis();

		/**
		 * The meta object literal for the '<em><b>Insurance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__INSURANCE_NAME = eINSTANCE.getPatient_InsuranceName();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.impl.EmployeeImpl
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__COMPANY_NAME = eINSTANCE.getEmployee_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__DEPARTMENT = eINSTANCE.getEmployee_Department();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__POSITION = eINSTANCE.getEmployee_Position();

		/**
		 * The meta object literal for the '<em><b>Years Experience</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__YEARS_EXPERIENCE = eINSTANCE.getEmployee_YearsExperience();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.complianceValues <em>compliance Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.complianceValues
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getcomplianceValues()
		 * @generated
		 */
		EEnum COMPLIANCE_VALUES = eINSTANCE.getcomplianceValues();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.status <em>status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.status
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getstatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getstatus();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.channels <em>channels</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.channels
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getchannels()
		 * @generated
		 */
		EEnum CHANNELS = eINSTANCE.getchannels();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.uncertaintyValues <em>uncertainty Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.uncertaintyValues
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getuncertaintyValues()
		 * @generated
		 */
		EEnum UNCERTAINTY_VALUES = eINSTANCE.getuncertaintyValues();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.comTypes <em>com Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.comTypes
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getcomTypes()
		 * @generated
		 */
		EEnum COM_TYPES = eINSTANCE.getcomTypes();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.providerTypes <em>provider Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.providerTypes
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getproviderTypes()
		 * @generated
		 */
		EEnum PROVIDER_TYPES = eINSTANCE.getproviderTypes();

		/**
		 * The meta object literal for the '{@link cjmlmetamodel.patientTypes <em>patient Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cjmlmetamodel.patientTypes
		 * @see cjmlmetamodel.impl.CjmlmetamodelPackageImpl#getpatientTypes()
		 * @generated
		 */
		EEnum PATIENT_TYPES = eINSTANCE.getpatientTypes();

	}

} //CjmlmetamodelPackage
