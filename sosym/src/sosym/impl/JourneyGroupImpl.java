/**
 */
package sosym.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sosym.CustomerJourney;
import sosym.Decision;
import sosym.JourneyGroup;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.JourneyGroupImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link sosym.impl.JourneyGroupImpl#getGroupDescription <em>Group Description</em>}</li>
 *   <li>{@link sosym.impl.JourneyGroupImpl#getNumberofJourneys <em>Numberof Journeys</em>}</li>
 *   <li>{@link sosym.impl.JourneyGroupImpl#getJourneys <em>Journeys</em>}</li>
 *   <li>{@link sosym.impl.JourneyGroupImpl#getDecisionPaths <em>Decision Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyGroupImpl extends MinimalEObjectImpl.Container implements JourneyGroup {
	/**
	 * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected String groupID = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupDescription() <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupDescription() <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupDescription()
	 * @generated
	 * @ordered
	 */
	protected String groupDescription = GROUP_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberofJourneys() <em>Numberof Journeys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofJourneys()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBEROF_JOURNEYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberofJourneys() <em>Numberof Journeys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofJourneys()
	 * @generated
	 * @ordered
	 */
	protected int numberofJourneys = NUMBEROF_JOURNEYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJourneys() <em>Journeys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneys()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerJourney> journeys;

	/**
	 * The cached value of the '{@link #getDecisionPaths() <em>Decision Paths</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Decision> decisionPaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.JOURNEY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupID() {
		return groupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupID(String newGroupID) {
		String oldGroupID = groupID;
		groupID = newGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_GROUP__GROUP_ID, oldGroupID, groupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupDescription() {
		return groupDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupDescription(String newGroupDescription) {
		String oldGroupDescription = groupDescription;
		groupDescription = newGroupDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_GROUP__GROUP_DESCRIPTION, oldGroupDescription, groupDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberofJourneys() {
		return numberofJourneys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberofJourneys(int newNumberofJourneys) {
		int oldNumberofJourneys = numberofJourneys;
		numberofJourneys = newNumberofJourneys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_GROUP__NUMBEROF_JOURNEYS, oldNumberofJourneys, numberofJourneys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerJourney> getJourneys() {
		if (journeys == null) {
			journeys = new EObjectResolvingEList<CustomerJourney>(CustomerJourney.class, this, SosymPackage.JOURNEY_GROUP__JOURNEYS);
		}
		return journeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecisionPaths() {
		if (decisionPaths == null) {
			decisionPaths = new EObjectResolvingEList<Decision>(Decision.class, this, SosymPackage.JOURNEY_GROUP__DECISION_PATHS);
		}
		return decisionPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.JOURNEY_GROUP__GROUP_ID:
				return getGroupID();
			case SosymPackage.JOURNEY_GROUP__GROUP_DESCRIPTION:
				return getGroupDescription();
			case SosymPackage.JOURNEY_GROUP__NUMBEROF_JOURNEYS:
				return getNumberofJourneys();
			case SosymPackage.JOURNEY_GROUP__JOURNEYS:
				return getJourneys();
			case SosymPackage.JOURNEY_GROUP__DECISION_PATHS:
				return getDecisionPaths();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SosymPackage.JOURNEY_GROUP__GROUP_ID:
				setGroupID((String)newValue);
				return;
			case SosymPackage.JOURNEY_GROUP__GROUP_DESCRIPTION:
				setGroupDescription((String)newValue);
				return;
			case SosymPackage.JOURNEY_GROUP__NUMBEROF_JOURNEYS:
				setNumberofJourneys((Integer)newValue);
				return;
			case SosymPackage.JOURNEY_GROUP__JOURNEYS:
				getJourneys().clear();
				getJourneys().addAll((Collection<? extends CustomerJourney>)newValue);
				return;
			case SosymPackage.JOURNEY_GROUP__DECISION_PATHS:
				getDecisionPaths().clear();
				getDecisionPaths().addAll((Collection<? extends Decision>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SosymPackage.JOURNEY_GROUP__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case SosymPackage.JOURNEY_GROUP__GROUP_DESCRIPTION:
				setGroupDescription(GROUP_DESCRIPTION_EDEFAULT);
				return;
			case SosymPackage.JOURNEY_GROUP__NUMBEROF_JOURNEYS:
				setNumberofJourneys(NUMBEROF_JOURNEYS_EDEFAULT);
				return;
			case SosymPackage.JOURNEY_GROUP__JOURNEYS:
				getJourneys().clear();
				return;
			case SosymPackage.JOURNEY_GROUP__DECISION_PATHS:
				getDecisionPaths().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SosymPackage.JOURNEY_GROUP__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
			case SosymPackage.JOURNEY_GROUP__GROUP_DESCRIPTION:
				return GROUP_DESCRIPTION_EDEFAULT == null ? groupDescription != null : !GROUP_DESCRIPTION_EDEFAULT.equals(groupDescription);
			case SosymPackage.JOURNEY_GROUP__NUMBEROF_JOURNEYS:
				return numberofJourneys != NUMBEROF_JOURNEYS_EDEFAULT;
			case SosymPackage.JOURNEY_GROUP__JOURNEYS:
				return journeys != null && !journeys.isEmpty();
			case SosymPackage.JOURNEY_GROUP__DECISION_PATHS:
				return decisionPaths != null && !decisionPaths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (groupID: ");
		result.append(groupID);
		result.append(", groupDescription: ");
		result.append(groupDescription);
		result.append(", numberofJourneys: ");
		result.append(numberofJourneys);
		result.append(')');
		return result.toString();
	}

} //JourneyGroupImpl
