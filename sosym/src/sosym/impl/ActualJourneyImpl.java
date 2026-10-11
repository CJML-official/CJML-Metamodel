/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sosym.ActualJourney;
import sosym.PlannedJourney;
import sosym.SosymPackage;
import sosym.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.ActualJourneyImpl#getJourneyCompliance <em>Journey Compliance</em>}</li>
 *   <li>{@link sosym.impl.ActualJourneyImpl#getJourneyStatus <em>Journey Status</em>}</li>
 *   <li>{@link sosym.impl.ActualJourneyImpl#isContentCompliance <em>Content Compliance</em>}</li>
 *   <li>{@link sosym.impl.ActualJourneyImpl#isSequenceCompliance <em>Sequence Compliance</em>}</li>
 *   <li>{@link sosym.impl.ActualJourneyImpl#getEndUserExperience <em>End User Experience</em>}</li>
 *   <li>{@link sosym.impl.ActualJourneyImpl#getEndUserExperienceRating <em>End User Experience Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActualJourneyImpl extends CustomerJourneyImpl implements ActualJourney {
	/**
	 * The cached value of the '{@link #getJourneyCompliance() <em>Journey Compliance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyCompliance()
	 * @generated
	 * @ordered
	 */
	protected PlannedJourney journeyCompliance;

	/**
	 * The default value of the '{@link #getJourneyStatus() <em>Journey Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status JOURNEY_STATUS_EDEFAULT = Status.IN_PROGRESS;

	/**
	 * The cached value of the '{@link #getJourneyStatus() <em>Journey Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyStatus()
	 * @generated
	 * @ordered
	 */
	protected Status journeyStatus = JOURNEY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isContentCompliance() <em>Content Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContentCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTENT_COMPLIANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContentCompliance() <em>Content Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContentCompliance()
	 * @generated
	 * @ordered
	 */
	protected boolean contentCompliance = CONTENT_COMPLIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSequenceCompliance() <em>Sequence Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequenceCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEQUENCE_COMPLIANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSequenceCompliance() <em>Sequence Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequenceCompliance()
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceCompliance = SEQUENCE_COMPLIANCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualJourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.ACTUAL_JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedJourney getJourneyCompliance() {
		if (journeyCompliance != null && journeyCompliance.eIsProxy()) {
			InternalEObject oldJourneyCompliance = (InternalEObject)journeyCompliance;
			journeyCompliance = (PlannedJourney)eResolveProxy(oldJourneyCompliance);
			if (journeyCompliance != oldJourneyCompliance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE, oldJourneyCompliance, journeyCompliance));
			}
		}
		return journeyCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedJourney basicGetJourneyCompliance() {
		return journeyCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyCompliance(PlannedJourney newJourneyCompliance) {
		PlannedJourney oldJourneyCompliance = journeyCompliance;
		journeyCompliance = newJourneyCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE, oldJourneyCompliance, journeyCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getJourneyStatus() {
		return journeyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyStatus(Status newJourneyStatus) {
		Status oldJourneyStatus = journeyStatus;
		journeyStatus = newJourneyStatus == null ? JOURNEY_STATUS_EDEFAULT : newJourneyStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTUAL_JOURNEY__JOURNEY_STATUS, oldJourneyStatus, journeyStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContentCompliance() {
		return contentCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentCompliance(boolean newContentCompliance) {
		boolean oldContentCompliance = contentCompliance;
		contentCompliance = newContentCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTUAL_JOURNEY__CONTENT_COMPLIANCE, oldContentCompliance, contentCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSequenceCompliance() {
		return sequenceCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceCompliance(boolean newSequenceCompliance) {
		boolean oldSequenceCompliance = sequenceCompliance;
		sequenceCompliance = newSequenceCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE, oldSequenceCompliance, sequenceCompliance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE, oldEndUserExperience, endUserExperience));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING, oldEndUserExperienceRating, endUserExperienceRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE:
				if (resolve) return getJourneyCompliance();
				return basicGetJourneyCompliance();
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_STATUS:
				return getJourneyStatus();
			case SosymPackage.ACTUAL_JOURNEY__CONTENT_COMPLIANCE:
				return isContentCompliance();
			case SosymPackage.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE:
				return isSequenceCompliance();
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE:
				return getEndUserExperience();
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING:
				return getEndUserExperienceRating();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE:
				setJourneyCompliance((PlannedJourney)newValue);
				return;
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_STATUS:
				setJourneyStatus((Status)newValue);
				return;
			case SosymPackage.ACTUAL_JOURNEY__CONTENT_COMPLIANCE:
				setContentCompliance((Boolean)newValue);
				return;
			case SosymPackage.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE:
				setSequenceCompliance((Boolean)newValue);
				return;
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE:
				setEndUserExperience((String)newValue);
				return;
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING:
				setEndUserExperienceRating((Integer)newValue);
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
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE:
				setJourneyCompliance((PlannedJourney)null);
				return;
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_STATUS:
				setJourneyStatus(JOURNEY_STATUS_EDEFAULT);
				return;
			case SosymPackage.ACTUAL_JOURNEY__CONTENT_COMPLIANCE:
				setContentCompliance(CONTENT_COMPLIANCE_EDEFAULT);
				return;
			case SosymPackage.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE:
				setSequenceCompliance(SEQUENCE_COMPLIANCE_EDEFAULT);
				return;
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE:
				setEndUserExperience(END_USER_EXPERIENCE_EDEFAULT);
				return;
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING:
				setEndUserExperienceRating(END_USER_EXPERIENCE_RATING_EDEFAULT);
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
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE:
				return journeyCompliance != null;
			case SosymPackage.ACTUAL_JOURNEY__JOURNEY_STATUS:
				return journeyStatus != JOURNEY_STATUS_EDEFAULT;
			case SosymPackage.ACTUAL_JOURNEY__CONTENT_COMPLIANCE:
				return contentCompliance != CONTENT_COMPLIANCE_EDEFAULT;
			case SosymPackage.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE:
				return sequenceCompliance != SEQUENCE_COMPLIANCE_EDEFAULT;
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE:
				return END_USER_EXPERIENCE_EDEFAULT == null ? endUserExperience != null : !END_USER_EXPERIENCE_EDEFAULT.equals(endUserExperience);
			case SosymPackage.ACTUAL_JOURNEY__END_USER_EXPERIENCE_RATING:
				return endUserExperienceRating != END_USER_EXPERIENCE_RATING_EDEFAULT;
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
		result.append(" (journeyStatus: ");
		result.append(journeyStatus);
		result.append(", contentCompliance: ");
		result.append(contentCompliance);
		result.append(", sequenceCompliance: ");
		result.append(sequenceCompliance);
		result.append(", endUserExperience: ");
		result.append(endUserExperience);
		result.append(", endUserExperienceRating: ");
		result.append(endUserExperienceRating);
		result.append(')');
		return result.toString();
	}

} //ActualJourneyImpl
