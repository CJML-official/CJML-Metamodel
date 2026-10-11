/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.cjmlmetamodel.BackendSystem;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backend System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.BackendSystemImpl#getSystemID <em>System ID</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.BackendSystemImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.BackendSystemImpl#getSystemDescription <em>System Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackendSystemImpl extends MinimalEObjectImpl.Container implements BackendSystem {
	/**
	 * The default value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected String systemID = SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemDescription() <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemDescription() <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDescription()
	 * @generated
	 * @ordered
	 */
	protected String systemDescription = SYSTEM_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackendSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.BACKEND_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemID() {
		return systemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemID(String newSystemID) {
		String oldSystemID = systemID;
		systemID = newSystemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_ID, oldSystemID, systemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemDescription() {
		return systemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemDescription(String newSystemDescription) {
		String oldSystemDescription = systemDescription;
		systemDescription = newSystemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_DESCRIPTION, oldSystemDescription, systemDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_ID:
				return getSystemID();
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_NAME:
				return getSystemName();
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_DESCRIPTION:
				return getSystemDescription();
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
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_ID:
				setSystemID((String)newValue);
				return;
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_DESCRIPTION:
				setSystemDescription((String)newValue);
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
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_ID:
				setSystemID(SYSTEM_ID_EDEFAULT);
				return;
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_DESCRIPTION:
				setSystemDescription(SYSTEM_DESCRIPTION_EDEFAULT);
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
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? systemID != null : !SYSTEM_ID_EDEFAULT.equals(systemID);
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CjmlmetamodelPackage.BACKEND_SYSTEM__SYSTEM_DESCRIPTION:
				return SYSTEM_DESCRIPTION_EDEFAULT == null ? systemDescription != null : !SYSTEM_DESCRIPTION_EDEFAULT.equals(systemDescription);
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
		result.append(" (systemID: ");
		result.append(systemID);
		result.append(", systemName: ");
		result.append(systemName);
		result.append(", systemDescription: ");
		result.append(systemDescription);
		result.append(')');
		return result.toString();
	}

} //BackendSystemImpl
