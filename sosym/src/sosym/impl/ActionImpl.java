/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sosym.Action;
import sosym.Initiator;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.ActionImpl#getHasInitiator <em>Has Initiator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends TouchpointImpl implements Action {
	/**
	 * The cached value of the '{@link #getHasInitiator() <em>Has Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInitiator()
	 * @generated
	 * @ordered
	 */
	protected Initiator hasInitiator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator getHasInitiator() {
		if (hasInitiator != null && hasInitiator.eIsProxy()) {
			InternalEObject oldHasInitiator = (InternalEObject)hasInitiator;
			hasInitiator = (Initiator)eResolveProxy(oldHasInitiator);
			if (hasInitiator != oldHasInitiator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.ACTION__HAS_INITIATOR, oldHasInitiator, hasInitiator));
			}
		}
		return hasInitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator basicGetHasInitiator() {
		return hasInitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInitiator(Initiator newHasInitiator) {
		Initiator oldHasInitiator = hasInitiator;
		hasInitiator = newHasInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.ACTION__HAS_INITIATOR, oldHasInitiator, hasInitiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.ACTION__HAS_INITIATOR:
				if (resolve) return getHasInitiator();
				return basicGetHasInitiator();
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
			case SosymPackage.ACTION__HAS_INITIATOR:
				setHasInitiator((Initiator)newValue);
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
			case SosymPackage.ACTION__HAS_INITIATOR:
				setHasInitiator((Initiator)null);
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
			case SosymPackage.ACTION__HAS_INITIATOR:
				return hasInitiator != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
