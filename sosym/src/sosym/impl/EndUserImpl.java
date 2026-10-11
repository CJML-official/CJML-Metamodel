/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sosym.EUTypes;
import sosym.EndUser;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.EndUserImpl#getEndUserType <em>End User Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndUserImpl extends ActorImpl implements EndUser {
	/**
	 * The default value of the '{@link #getEndUserType() <em>End User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserType()
	 * @generated
	 * @ordered
	 */
	protected static final EUTypes END_USER_TYPE_EDEFAULT = EUTypes.CUSTOMER;

	/**
	 * The cached value of the '{@link #getEndUserType() <em>End User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserType()
	 * @generated
	 * @ordered
	 */
	protected EUTypes endUserType = END_USER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.END_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EUTypes getEndUserType() {
		return endUserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndUserType(EUTypes newEndUserType) {
		EUTypes oldEndUserType = endUserType;
		endUserType = newEndUserType == null ? END_USER_TYPE_EDEFAULT : newEndUserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.END_USER__END_USER_TYPE, oldEndUserType, endUserType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.END_USER__END_USER_TYPE:
				return getEndUserType();
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
			case SosymPackage.END_USER__END_USER_TYPE:
				setEndUserType((EUTypes)newValue);
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
			case SosymPackage.END_USER__END_USER_TYPE:
				setEndUserType(END_USER_TYPE_EDEFAULT);
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
			case SosymPackage.END_USER__END_USER_TYPE:
				return endUserType != END_USER_TYPE_EDEFAULT;
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
		result.append(" (endUserType: ");
		result.append(endUserType);
		result.append(')');
		return result.toString();
	}

} //EndUserImpl
