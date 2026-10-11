/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sosym.JourneyPhase;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.JourneyPhaseImpl#getPhaseName <em>Phase Name</em>}</li>
 *   <li>{@link sosym.impl.JourneyPhaseImpl#getPhaseDescription <em>Phase Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyPhaseImpl extends MinimalEObjectImpl.Container implements JourneyPhase {
	/**
	 * The default value of the '{@link #getPhaseName() <em>Phase Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseName() <em>Phase Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseName()
	 * @generated
	 * @ordered
	 */
	protected String phaseName = PHASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseDescription() <em>Phase Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseDescription() <em>Phase Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseDescription()
	 * @generated
	 * @ordered
	 */
	protected String phaseDescription = PHASE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyPhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.JOURNEY_PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseName() {
		return phaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseName(String newPhaseName) {
		String oldPhaseName = phaseName;
		phaseName = newPhaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_PHASE__PHASE_NAME, oldPhaseName, phaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseDescription() {
		return phaseDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseDescription(String newPhaseDescription) {
		String oldPhaseDescription = phaseDescription;
		phaseDescription = newPhaseDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_PHASE__PHASE_DESCRIPTION, oldPhaseDescription, phaseDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.JOURNEY_PHASE__PHASE_NAME:
				return getPhaseName();
			case SosymPackage.JOURNEY_PHASE__PHASE_DESCRIPTION:
				return getPhaseDescription();
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
			case SosymPackage.JOURNEY_PHASE__PHASE_NAME:
				setPhaseName((String)newValue);
				return;
			case SosymPackage.JOURNEY_PHASE__PHASE_DESCRIPTION:
				setPhaseDescription((String)newValue);
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
			case SosymPackage.JOURNEY_PHASE__PHASE_NAME:
				setPhaseName(PHASE_NAME_EDEFAULT);
				return;
			case SosymPackage.JOURNEY_PHASE__PHASE_DESCRIPTION:
				setPhaseDescription(PHASE_DESCRIPTION_EDEFAULT);
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
			case SosymPackage.JOURNEY_PHASE__PHASE_NAME:
				return PHASE_NAME_EDEFAULT == null ? phaseName != null : !PHASE_NAME_EDEFAULT.equals(phaseName);
			case SosymPackage.JOURNEY_PHASE__PHASE_DESCRIPTION:
				return PHASE_DESCRIPTION_EDEFAULT == null ? phaseDescription != null : !PHASE_DESCRIPTION_EDEFAULT.equals(phaseDescription);
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
		result.append(" (phaseName: ");
		result.append(phaseName);
		result.append(", phaseDescription: ");
		result.append(phaseDescription);
		result.append(')');
		return result.toString();
	}

} //JourneyPhaseImpl
