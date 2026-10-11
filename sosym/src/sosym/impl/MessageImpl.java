/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sosym.Message;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.MessageImpl#getKeyMessage <em>Key Message</em>}</li>
 *   <li>{@link sosym.impl.MessageImpl#getMessageContent <em>Message Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getKeyMessage() <em>Key Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyMessage() <em>Key Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyMessage()
	 * @generated
	 * @ordered
	 */
	protected String keyMessage = KEY_MESSAGE_EDEFAULT;

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
		return SosymPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyMessage() {
		return keyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyMessage(String newKeyMessage) {
		String oldKeyMessage = keyMessage;
		keyMessage = newKeyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.MESSAGE__KEY_MESSAGE, oldKeyMessage, keyMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.MESSAGE__MESSAGE_CONTENT, oldMessageContent, messageContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.MESSAGE__KEY_MESSAGE:
				return getKeyMessage();
			case SosymPackage.MESSAGE__MESSAGE_CONTENT:
				return getMessageContent();
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
			case SosymPackage.MESSAGE__KEY_MESSAGE:
				setKeyMessage((String)newValue);
				return;
			case SosymPackage.MESSAGE__MESSAGE_CONTENT:
				setMessageContent((String)newValue);
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
			case SosymPackage.MESSAGE__KEY_MESSAGE:
				setKeyMessage(KEY_MESSAGE_EDEFAULT);
				return;
			case SosymPackage.MESSAGE__MESSAGE_CONTENT:
				setMessageContent(MESSAGE_CONTENT_EDEFAULT);
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
			case SosymPackage.MESSAGE__KEY_MESSAGE:
				return KEY_MESSAGE_EDEFAULT == null ? keyMessage != null : !KEY_MESSAGE_EDEFAULT.equals(keyMessage);
			case SosymPackage.MESSAGE__MESSAGE_CONTENT:
				return MESSAGE_CONTENT_EDEFAULT == null ? messageContent != null : !MESSAGE_CONTENT_EDEFAULT.equals(messageContent);
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
		result.append(" (keyMessage: ");
		result.append(keyMessage);
		result.append(", messageContent: ");
		result.append(messageContent);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
