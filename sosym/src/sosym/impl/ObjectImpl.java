/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.ObjectImpl#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link sosym.impl.ObjectImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link sosym.impl.ObjectImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link sosym.impl.ObjectImpl#getObjectDescription <em>Object Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements sosym.Object {
	/**
	 * The default value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectID() <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectID()
	 * @generated
	 * @ordered
	 */
	protected String objectID = OBJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected String objectName = OBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VIRTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected boolean isVirtual = IS_VIRTUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectDescription() <em>Object Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectDescription() <em>Object Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectDescription()
	 * @generated
	 * @ordered
	 */
	protected String objectDescription = OBJECT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectID() {
		return objectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectID(String newObjectID) {
		String oldObjectID = objectID;
		objectID = newObjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.OBJECT__OBJECT_ID, oldObjectID, objectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectName(String newObjectName) {
		String oldObjectName = objectName;
		objectName = newObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.OBJECT__OBJECT_NAME, oldObjectName, objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVirtual() {
		return isVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVirtual(boolean newIsVirtual) {
		boolean oldIsVirtual = isVirtual;
		isVirtual = newIsVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.OBJECT__IS_VIRTUAL, oldIsVirtual, isVirtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectDescription() {
		return objectDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectDescription(String newObjectDescription) {
		String oldObjectDescription = objectDescription;
		objectDescription = newObjectDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.OBJECT__OBJECT_DESCRIPTION, oldObjectDescription, objectDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.OBJECT__OBJECT_ID:
				return getObjectID();
			case SosymPackage.OBJECT__OBJECT_NAME:
				return getObjectName();
			case SosymPackage.OBJECT__IS_VIRTUAL:
				return isIsVirtual();
			case SosymPackage.OBJECT__OBJECT_DESCRIPTION:
				return getObjectDescription();
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
			case SosymPackage.OBJECT__OBJECT_ID:
				setObjectID((String)newValue);
				return;
			case SosymPackage.OBJECT__OBJECT_NAME:
				setObjectName((String)newValue);
				return;
			case SosymPackage.OBJECT__IS_VIRTUAL:
				setIsVirtual((Boolean)newValue);
				return;
			case SosymPackage.OBJECT__OBJECT_DESCRIPTION:
				setObjectDescription((String)newValue);
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
			case SosymPackage.OBJECT__OBJECT_ID:
				setObjectID(OBJECT_ID_EDEFAULT);
				return;
			case SosymPackage.OBJECT__OBJECT_NAME:
				setObjectName(OBJECT_NAME_EDEFAULT);
				return;
			case SosymPackage.OBJECT__IS_VIRTUAL:
				setIsVirtual(IS_VIRTUAL_EDEFAULT);
				return;
			case SosymPackage.OBJECT__OBJECT_DESCRIPTION:
				setObjectDescription(OBJECT_DESCRIPTION_EDEFAULT);
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
			case SosymPackage.OBJECT__OBJECT_ID:
				return OBJECT_ID_EDEFAULT == null ? objectID != null : !OBJECT_ID_EDEFAULT.equals(objectID);
			case SosymPackage.OBJECT__OBJECT_NAME:
				return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
			case SosymPackage.OBJECT__IS_VIRTUAL:
				return isVirtual != IS_VIRTUAL_EDEFAULT;
			case SosymPackage.OBJECT__OBJECT_DESCRIPTION:
				return OBJECT_DESCRIPTION_EDEFAULT == null ? objectDescription != null : !OBJECT_DESCRIPTION_EDEFAULT.equals(objectDescription);
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
		result.append(" (objectID: ");
		result.append(objectID);
		result.append(", objectName: ");
		result.append(objectName);
		result.append(", isVirtual: ");
		result.append(isVirtual);
		result.append(", objectDescription: ");
		result.append(objectDescription);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
