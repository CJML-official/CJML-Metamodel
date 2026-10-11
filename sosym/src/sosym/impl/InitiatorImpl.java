/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sosym.Actor;
import sosym.Initiator;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initiator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.InitiatorImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link sosym.impl.InitiatorImpl#getInitiatorLabel <em>Initiator Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitiatorImpl extends MinimalEObjectImpl.Container implements Initiator {
	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Actor refersTo;

	/**
	 * The default value of the '{@link #getInitiatorLabel() <em>Initiator Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIATOR_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiatorLabel() <em>Initiator Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatorLabel()
	 * @generated
	 * @ordered
	 */
	protected String initiatorLabel = INITIATOR_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitiatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.INITIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Actor)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.INITIATOR__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Actor newRefersTo) {
		Actor oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.INITIATOR__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitiatorLabel() {
		return initiatorLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatorLabel(String newInitiatorLabel) {
		String oldInitiatorLabel = initiatorLabel;
		initiatorLabel = newInitiatorLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.INITIATOR__INITIATOR_LABEL, oldInitiatorLabel, initiatorLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.INITIATOR__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case SosymPackage.INITIATOR__INITIATOR_LABEL:
				return getInitiatorLabel();
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
			case SosymPackage.INITIATOR__REFERS_TO:
				setRefersTo((Actor)newValue);
				return;
			case SosymPackage.INITIATOR__INITIATOR_LABEL:
				setInitiatorLabel((String)newValue);
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
			case SosymPackage.INITIATOR__REFERS_TO:
				setRefersTo((Actor)null);
				return;
			case SosymPackage.INITIATOR__INITIATOR_LABEL:
				setInitiatorLabel(INITIATOR_LABEL_EDEFAULT);
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
			case SosymPackage.INITIATOR__REFERS_TO:
				return refersTo != null;
			case SosymPackage.INITIATOR__INITIATOR_LABEL:
				return INITIATOR_LABEL_EDEFAULT == null ? initiatorLabel != null : !INITIATOR_LABEL_EDEFAULT.equals(initiatorLabel);
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
		result.append(" (initiatorLabel: ");
		result.append(initiatorLabel);
		result.append(')');
		return result.toString();
	}

} //InitiatorImpl
