/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.Initiator;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.PlannedActionImpl#getInitiator <em>Initiator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedActionImpl extends PlannedTouchpointImpl implements PlannedAction {
	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected Initiator initiator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.PLANNED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator getInitiator() {
		if (initiator != null && initiator.eIsProxy()) {
			InternalEObject oldInitiator = (InternalEObject)initiator;
			initiator = (Initiator)eResolveProxy(oldInitiator);
			if (initiator != oldInitiator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.PLANNED_ACTION__INITIATOR, oldInitiator, initiator));
			}
		}
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator basicGetInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiator(Initiator newInitiator) {
		Initiator oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.PLANNED_ACTION__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_ACTION__INITIATOR:
				if (resolve) return getInitiator();
				return basicGetInitiator();
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
			case CjmlmetamodelPackage.PLANNED_ACTION__INITIATOR:
				setInitiator((Initiator)newValue);
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
			case CjmlmetamodelPackage.PLANNED_ACTION__INITIATOR:
				setInitiator((Initiator)null);
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
			case CjmlmetamodelPackage.PLANNED_ACTION__INITIATOR:
				return initiator != null;
		}
		return super.eIsSet(featureID);
	}

} //PlannedActionImpl
