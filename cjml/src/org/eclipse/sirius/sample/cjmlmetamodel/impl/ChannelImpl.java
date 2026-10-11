/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.cjmlmetamodel.Channel;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.channels;
import org.eclipse.sirius.sample.cjmlmetamodel.comTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ChannelImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ChannelImpl#getComType <em>Com Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ChannelImpl#isIsSynchronous <em>Is Synchronous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends MinimalEObjectImpl.Container implements Channel {
	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final channels CHANNEL_EDEFAULT = channels.TELEPHONE;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected channels channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getComType() <em>Com Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComType()
	 * @generated
	 * @ordered
	 */
	protected static final comTypes COM_TYPE_EDEFAULT = comTypes.UNICAST;

	/**
	 * The cached value of the '{@link #getComType() <em>Com Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComType()
	 * @generated
	 * @ordered
	 */
	protected comTypes comType = COM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSynchronous() <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynchronous = IS_SYNCHRONOUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public channels getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(channels newChannel) {
		channels oldChannel = channel;
		channel = newChannel == null ? CHANNEL_EDEFAULT : newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.CHANNEL__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comTypes getComType() {
		return comType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComType(comTypes newComType) {
		comTypes oldComType = comType;
		comType = newComType == null ? COM_TYPE_EDEFAULT : newComType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.CHANNEL__COM_TYPE, oldComType, comType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSynchronous() {
		return isSynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronous(boolean newIsSynchronous) {
		boolean oldIsSynchronous = isSynchronous;
		isSynchronous = newIsSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.CHANNEL__IS_SYNCHRONOUS, oldIsSynchronous, isSynchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.CHANNEL__CHANNEL:
				return getChannel();
			case CjmlmetamodelPackage.CHANNEL__COM_TYPE:
				return getComType();
			case CjmlmetamodelPackage.CHANNEL__IS_SYNCHRONOUS:
				return isIsSynchronous();
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
			case CjmlmetamodelPackage.CHANNEL__CHANNEL:
				setChannel((channels)newValue);
				return;
			case CjmlmetamodelPackage.CHANNEL__COM_TYPE:
				setComType((comTypes)newValue);
				return;
			case CjmlmetamodelPackage.CHANNEL__IS_SYNCHRONOUS:
				setIsSynchronous((Boolean)newValue);
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
			case CjmlmetamodelPackage.CHANNEL__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case CjmlmetamodelPackage.CHANNEL__COM_TYPE:
				setComType(COM_TYPE_EDEFAULT);
				return;
			case CjmlmetamodelPackage.CHANNEL__IS_SYNCHRONOUS:
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
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
			case CjmlmetamodelPackage.CHANNEL__CHANNEL:
				return channel != CHANNEL_EDEFAULT;
			case CjmlmetamodelPackage.CHANNEL__COM_TYPE:
				return comType != COM_TYPE_EDEFAULT;
			case CjmlmetamodelPackage.CHANNEL__IS_SYNCHRONOUS:
				return isSynchronous != IS_SYNCHRONOUS_EDEFAULT;
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
		result.append(" (channel: ");
		result.append(channel);
		result.append(", comType: ");
		result.append(comType);
		result.append(", isSynchronous: ");
		result.append(isSynchronous);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
