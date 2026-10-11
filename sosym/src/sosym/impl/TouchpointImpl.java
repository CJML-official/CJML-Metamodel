/**
 */
package sosym.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sosym.BackendSystem;
import sosym.ComplianceValues;
import sosym.SosymPackage;
import sosym.Touchpoint;
import sosym.UncertaintyValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.TouchpointImpl#getTouchpointID <em>Touchpoint ID</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getCompliance <em>Compliance</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getEndUserExperience <em>End User Experience</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getEndUserExperienceRating <em>End User Experience Rating</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getTimeStarted <em>Time Started</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getTimeCompleted <em>Time Completed</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link sosym.impl.TouchpointImpl#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchpointImpl extends CustomerJourneyElementImpl implements Touchpoint {
	/**
	 * The default value of the '{@link #getTouchpointID() <em>Touchpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointID()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUCHPOINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTouchpointID() <em>Touchpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointID()
	 * @generated
	 * @ordered
	 */
	protected String touchpointID = TOUCHPOINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompliance() <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final ComplianceValues COMPLIANCE_EDEFAULT = ComplianceValues.PLANNED;

	/**
	 * The cached value of the '{@link #getCompliance() <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliance()
	 * @generated
	 * @ordered
	 */
	protected ComplianceValues compliance = COMPLIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final UncertaintyValues UNCERTAINTY_EDEFAULT = UncertaintyValues.UNCERTAIN_OCCURRENCE;

	/**
	 * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected UncertaintyValues uncertainty = UNCERTAINTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndUserExperience() <em>End User Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserExperience()
	 * @generated
	 * @ordered
	 */
	protected static final String END_USER_EXPERIENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndUserExperience() <em>End User Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserExperience()
	 * @generated
	 * @ordered
	 */
	protected String endUserExperience = END_USER_EXPERIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndUserExperienceRating() <em>End User Experience Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserExperienceRating()
	 * @generated
	 * @ordered
	 */
	protected static final int END_USER_EXPERIENCE_RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndUserExperienceRating() <em>End User Experience Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserExperienceRating()
	 * @generated
	 * @ordered
	 */
	protected int endUserExperienceRating = END_USER_EXPERIENCE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStarted() <em>Time Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStarted() <em>Time Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStarted()
	 * @generated
	 * @ordered
	 */
	protected Date timeStarted = TIME_STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCompleted() <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_COMPLETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeCompleted() <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCompleted()
	 * @generated
	 * @ordered
	 */
	protected Date timeCompleted = TIME_COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<sosym.Object> objects;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<BackendSystem> systems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.TOUCHPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTouchpointID() {
		return touchpointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouchpointID(String newTouchpointID) {
		String oldTouchpointID = touchpointID;
		touchpointID = newTouchpointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__TOUCHPOINT_ID, oldTouchpointID, touchpointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceValues getCompliance() {
		return compliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompliance(ComplianceValues newCompliance) {
		ComplianceValues oldCompliance = compliance;
		compliance = newCompliance == null ? COMPLIANCE_EDEFAULT : newCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__COMPLIANCE, oldCompliance, compliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyValues getUncertainty() {
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertainty(UncertaintyValues newUncertainty) {
		UncertaintyValues oldUncertainty = uncertainty;
		uncertainty = newUncertainty == null ? UNCERTAINTY_EDEFAULT : newUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__UNCERTAINTY, oldUncertainty, uncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndUserExperience() {
		return endUserExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndUserExperience(String newEndUserExperience) {
		String oldEndUserExperience = endUserExperience;
		endUserExperience = newEndUserExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE, oldEndUserExperience, endUserExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndUserExperienceRating() {
		return endUserExperienceRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndUserExperienceRating(int newEndUserExperienceRating) {
		int oldEndUserExperienceRating = endUserExperienceRating;
		endUserExperienceRating = newEndUserExperienceRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE_RATING, oldEndUserExperienceRating, endUserExperienceRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStarted() {
		return timeStarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStarted(Date newTimeStarted) {
		Date oldTimeStarted = timeStarted;
		timeStarted = newTimeStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__TIME_STARTED, oldTimeStarted, timeStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeCompleted() {
		return timeCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCompleted(Date newTimeCompleted) {
		Date oldTimeCompleted = timeCompleted;
		timeCompleted = newTimeCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__TIME_COMPLETED, oldTimeCompleted, timeCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.TOUCHPOINT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<sosym.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectResolvingEList<sosym.Object>(sosym.Object.class, this, SosymPackage.TOUCHPOINT__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackendSystem> getSystems() {
		if (systems == null) {
			systems = new EObjectResolvingEList<BackendSystem>(BackendSystem.class, this, SosymPackage.TOUCHPOINT__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.TOUCHPOINT__TOUCHPOINT_ID:
				return getTouchpointID();
			case SosymPackage.TOUCHPOINT__COMPLIANCE:
				return getCompliance();
			case SosymPackage.TOUCHPOINT__UNCERTAINTY:
				return getUncertainty();
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE:
				return getEndUserExperience();
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE_RATING:
				return getEndUserExperienceRating();
			case SosymPackage.TOUCHPOINT__TIME_STARTED:
				return getTimeStarted();
			case SosymPackage.TOUCHPOINT__TIME_COMPLETED:
				return getTimeCompleted();
			case SosymPackage.TOUCHPOINT__COMMENT:
				return getComment();
			case SosymPackage.TOUCHPOINT__OBJECTS:
				return getObjects();
			case SosymPackage.TOUCHPOINT__SYSTEMS:
				return getSystems();
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
			case SosymPackage.TOUCHPOINT__TOUCHPOINT_ID:
				setTouchpointID((String)newValue);
				return;
			case SosymPackage.TOUCHPOINT__COMPLIANCE:
				setCompliance((ComplianceValues)newValue);
				return;
			case SosymPackage.TOUCHPOINT__UNCERTAINTY:
				setUncertainty((UncertaintyValues)newValue);
				return;
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE:
				setEndUserExperience((String)newValue);
				return;
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE_RATING:
				setEndUserExperienceRating((Integer)newValue);
				return;
			case SosymPackage.TOUCHPOINT__TIME_STARTED:
				setTimeStarted((Date)newValue);
				return;
			case SosymPackage.TOUCHPOINT__TIME_COMPLETED:
				setTimeCompleted((Date)newValue);
				return;
			case SosymPackage.TOUCHPOINT__COMMENT:
				setComment((String)newValue);
				return;
			case SosymPackage.TOUCHPOINT__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends sosym.Object>)newValue);
				return;
			case SosymPackage.TOUCHPOINT__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends BackendSystem>)newValue);
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
			case SosymPackage.TOUCHPOINT__TOUCHPOINT_ID:
				setTouchpointID(TOUCHPOINT_ID_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__COMPLIANCE:
				setCompliance(COMPLIANCE_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__UNCERTAINTY:
				setUncertainty(UNCERTAINTY_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE:
				setEndUserExperience(END_USER_EXPERIENCE_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE_RATING:
				setEndUserExperienceRating(END_USER_EXPERIENCE_RATING_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__TIME_STARTED:
				setTimeStarted(TIME_STARTED_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__TIME_COMPLETED:
				setTimeCompleted(TIME_COMPLETED_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SosymPackage.TOUCHPOINT__OBJECTS:
				getObjects().clear();
				return;
			case SosymPackage.TOUCHPOINT__SYSTEMS:
				getSystems().clear();
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
			case SosymPackage.TOUCHPOINT__TOUCHPOINT_ID:
				return TOUCHPOINT_ID_EDEFAULT == null ? touchpointID != null : !TOUCHPOINT_ID_EDEFAULT.equals(touchpointID);
			case SosymPackage.TOUCHPOINT__COMPLIANCE:
				return compliance != COMPLIANCE_EDEFAULT;
			case SosymPackage.TOUCHPOINT__UNCERTAINTY:
				return uncertainty != UNCERTAINTY_EDEFAULT;
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE:
				return END_USER_EXPERIENCE_EDEFAULT == null ? endUserExperience != null : !END_USER_EXPERIENCE_EDEFAULT.equals(endUserExperience);
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE_RATING:
				return endUserExperienceRating != END_USER_EXPERIENCE_RATING_EDEFAULT;
			case SosymPackage.TOUCHPOINT__TIME_STARTED:
				return TIME_STARTED_EDEFAULT == null ? timeStarted != null : !TIME_STARTED_EDEFAULT.equals(timeStarted);
			case SosymPackage.TOUCHPOINT__TIME_COMPLETED:
				return TIME_COMPLETED_EDEFAULT == null ? timeCompleted != null : !TIME_COMPLETED_EDEFAULT.equals(timeCompleted);
			case SosymPackage.TOUCHPOINT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case SosymPackage.TOUCHPOINT__OBJECTS:
				return objects != null && !objects.isEmpty();
			case SosymPackage.TOUCHPOINT__SYSTEMS:
				return systems != null && !systems.isEmpty();
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
		result.append(" (touchpointID: ");
		result.append(touchpointID);
		result.append(", compliance: ");
		result.append(compliance);
		result.append(", uncertainty: ");
		result.append(uncertainty);
		result.append(", endUserExperience: ");
		result.append(endUserExperience);
		result.append(", endUserExperienceRating: ");
		result.append(endUserExperienceRating);
		result.append(", timeStarted: ");
		result.append(timeStarted);
		result.append(", timeCompleted: ");
		result.append(timeCompleted);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //TouchpointImpl
