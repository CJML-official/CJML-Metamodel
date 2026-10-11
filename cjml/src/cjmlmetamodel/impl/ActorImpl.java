/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.Actor;
import cjmlmetamodel.CjmlmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.ActorImpl#getActorID <em>Actor ID</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.ActorImpl#getActorName <em>Actor Name</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.ActorImpl#getActorDescription <em>Actor Description</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.ActorImpl#getIsVirtual <em>Is Virtual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor {
	/**
	 * The default value of the '{@link #getActorID() <em>Actor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorID() <em>Actor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorID()
	 * @generated
	 * @ordered
	 */
	protected String actorID = ACTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorName() <em>Actor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorName() <em>Actor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorName()
	 * @generated
	 * @ordered
	 */
	protected String actorName = ACTOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorDescription() <em>Actor Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorDescription() <em>Actor Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDescription()
	 * @generated
	 * @ordered
	 */
	protected String actorDescription = ACTOR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VIRTUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVirtual = IS_VIRTUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorID() {
		return actorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorID(String newActorID) {
		String oldActorID = actorID;
		actorID = newActorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTOR__ACTOR_ID, oldActorID, actorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorName() {
		return actorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorName(String newActorName) {
		String oldActorName = actorName;
		actorName = newActorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTOR__ACTOR_NAME, oldActorName, actorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorDescription() {
		return actorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorDescription(String newActorDescription) {
		String oldActorDescription = actorDescription;
		actorDescription = newActorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTOR__ACTOR_DESCRIPTION, oldActorDescription, actorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVirtual() {
		return isVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVirtual(Boolean newIsVirtual) {
		Boolean oldIsVirtual = isVirtual;
		isVirtual = newIsVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTOR__IS_VIRTUAL, oldIsVirtual, isVirtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.ACTOR__ACTOR_ID:
				return getActorID();
			case CjmlmetamodelPackage.ACTOR__ACTOR_NAME:
				return getActorName();
			case CjmlmetamodelPackage.ACTOR__ACTOR_DESCRIPTION:
				return getActorDescription();
			case CjmlmetamodelPackage.ACTOR__IS_VIRTUAL:
				return getIsVirtual();
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
			case CjmlmetamodelPackage.ACTOR__ACTOR_ID:
				setActorID((String)newValue);
				return;
			case CjmlmetamodelPackage.ACTOR__ACTOR_NAME:
				setActorName((String)newValue);
				return;
			case CjmlmetamodelPackage.ACTOR__ACTOR_DESCRIPTION:
				setActorDescription((String)newValue);
				return;
			case CjmlmetamodelPackage.ACTOR__IS_VIRTUAL:
				setIsVirtual((Boolean)newValue);
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
			case CjmlmetamodelPackage.ACTOR__ACTOR_ID:
				setActorID(ACTOR_ID_EDEFAULT);
				return;
			case CjmlmetamodelPackage.ACTOR__ACTOR_NAME:
				setActorName(ACTOR_NAME_EDEFAULT);
				return;
			case CjmlmetamodelPackage.ACTOR__ACTOR_DESCRIPTION:
				setActorDescription(ACTOR_DESCRIPTION_EDEFAULT);
				return;
			case CjmlmetamodelPackage.ACTOR__IS_VIRTUAL:
				setIsVirtual(IS_VIRTUAL_EDEFAULT);
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
			case CjmlmetamodelPackage.ACTOR__ACTOR_ID:
				return ACTOR_ID_EDEFAULT == null ? actorID != null : !ACTOR_ID_EDEFAULT.equals(actorID);
			case CjmlmetamodelPackage.ACTOR__ACTOR_NAME:
				return ACTOR_NAME_EDEFAULT == null ? actorName != null : !ACTOR_NAME_EDEFAULT.equals(actorName);
			case CjmlmetamodelPackage.ACTOR__ACTOR_DESCRIPTION:
				return ACTOR_DESCRIPTION_EDEFAULT == null ? actorDescription != null : !ACTOR_DESCRIPTION_EDEFAULT.equals(actorDescription);
			case CjmlmetamodelPackage.ACTOR__IS_VIRTUAL:
				return IS_VIRTUAL_EDEFAULT == null ? isVirtual != null : !IS_VIRTUAL_EDEFAULT.equals(isVirtual);
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
		result.append(" (actorID: ");
		result.append(actorID);
		result.append(", actorName: ");
		result.append(actorName);
		result.append(", actorDescription: ");
		result.append(actorDescription);
		result.append(", isVirtual: ");
		result.append(isVirtual);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
