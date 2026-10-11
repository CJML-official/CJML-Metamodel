/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.MessageImpl#getMessageContent <em>Message Content</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.MessageImpl#getKeyMessageContent <em>Key Message Content</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.MessageImpl#getDerivedMessageContent <em>Derived Message Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getMessageContent() <em>Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageContent()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageContent() <em>Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageContent()
	 * @generated
	 * @ordered
	 */
	protected String messageContent = MESSAGE_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyMessageContent() <em>Key Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyMessageContent()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_MESSAGE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyMessageContent() <em>Key Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyMessageContent()
	 * @generated
	 * @ordered
	 */
	protected String keyMessageContent = KEY_MESSAGE_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedMessageContent() <em>Derived Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedMessageContent()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_MESSAGE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedMessageContent() <em>Derived Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedMessageContent()
	 * @generated
	 * @ordered
	 */
	protected String derivedMessageContent = DERIVED_MESSAGE_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageContent() {
		return messageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageContent(String newMessageContent) {
		String oldMessageContent = messageContent;
		messageContent = newMessageContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.MESSAGE__MESSAGE_CONTENT, oldMessageContent, messageContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyMessageContent() {
		return keyMessageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyMessageContent(String newKeyMessageContent) {
		String oldKeyMessageContent = keyMessageContent;
		keyMessageContent = newKeyMessageContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.MESSAGE__KEY_MESSAGE_CONTENT, oldKeyMessageContent, keyMessageContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedMessageContent() {
		return derivedMessageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedMessageContent(String newDerivedMessageContent) {
		String oldDerivedMessageContent = derivedMessageContent;
		derivedMessageContent = newDerivedMessageContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.MESSAGE__DERIVED_MESSAGE_CONTENT, oldDerivedMessageContent, derivedMessageContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.MESSAGE__MESSAGE_CONTENT:
				return getMessageContent();
			case CjmlmetamodelPackage.MESSAGE__KEY_MESSAGE_CONTENT:
				return getKeyMessageContent();
			case CjmlmetamodelPackage.MESSAGE__DERIVED_MESSAGE_CONTENT:
				return getDerivedMessageContent();
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
			case CjmlmetamodelPackage.MESSAGE__MESSAGE_CONTENT:
				setMessageContent((String)newValue);
				return;
			case CjmlmetamodelPackage.MESSAGE__KEY_MESSAGE_CONTENT:
				setKeyMessageContent((String)newValue);
				return;
			case CjmlmetamodelPackage.MESSAGE__DERIVED_MESSAGE_CONTENT:
				setDerivedMessageContent((String)newValue);
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
			case CjmlmetamodelPackage.MESSAGE__MESSAGE_CONTENT:
				setMessageContent(MESSAGE_CONTENT_EDEFAULT);
				return;
			case CjmlmetamodelPackage.MESSAGE__KEY_MESSAGE_CONTENT:
				setKeyMessageContent(KEY_MESSAGE_CONTENT_EDEFAULT);
				return;
			case CjmlmetamodelPackage.MESSAGE__DERIVED_MESSAGE_CONTENT:
				setDerivedMessageContent(DERIVED_MESSAGE_CONTENT_EDEFAULT);
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
			case CjmlmetamodelPackage.MESSAGE__MESSAGE_CONTENT:
				return MESSAGE_CONTENT_EDEFAULT == null ? messageContent != null : !MESSAGE_CONTENT_EDEFAULT.equals(messageContent);
			case CjmlmetamodelPackage.MESSAGE__KEY_MESSAGE_CONTENT:
				return KEY_MESSAGE_CONTENT_EDEFAULT == null ? keyMessageContent != null : !KEY_MESSAGE_CONTENT_EDEFAULT.equals(keyMessageContent);
			case CjmlmetamodelPackage.MESSAGE__DERIVED_MESSAGE_CONTENT:
				return DERIVED_MESSAGE_CONTENT_EDEFAULT == null ? derivedMessageContent != null : !DERIVED_MESSAGE_CONTENT_EDEFAULT.equals(derivedMessageContent);
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
		result.append(" (messageContent: ");
		result.append(messageContent);
		result.append(", keyMessageContent: ");
		result.append(keyMessageContent);
		result.append(", derivedMessageContent: ");
		result.append(derivedMessageContent);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
