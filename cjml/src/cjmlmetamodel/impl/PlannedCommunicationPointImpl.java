/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.Channel;
import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.Initiator;
import cjmlmetamodel.Message;
import cjmlmetamodel.PlannedCommunicationPoint;
import cjmlmetamodel.Receiver;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Communication Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.PlannedCommunicationPointImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.PlannedCommunicationPointImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.PlannedCommunicationPointImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.PlannedCommunicationPointImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedCommunicationPointImpl extends PlannedTouchpointImpl implements PlannedCommunicationPoint {
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
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Receiver receiver;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected Channel channel;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedCommunicationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.PLANNED_COMMUNICATION_POINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__INITIATOR, oldInitiator, initiator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (Receiver)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Receiver newReceiver) {
		Receiver oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannel() {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject)channel;
			channel = (Channel)eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(Channel newChannel) {
		Channel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__INITIATOR:
				if (resolve) return getInitiator();
				return basicGetInitiator();
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
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
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__INITIATOR:
				setInitiator((Initiator)newValue);
				return;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__RECEIVER:
				setReceiver((Receiver)newValue);
				return;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__CHANNEL:
				setChannel((Channel)newValue);
				return;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__MESSAGE:
				setMessage((Message)newValue);
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
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__INITIATOR:
				setInitiator((Initiator)null);
				return;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__RECEIVER:
				setReceiver((Receiver)null);
				return;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__CHANNEL:
				setChannel((Channel)null);
				return;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__MESSAGE:
				setMessage((Message)null);
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
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__INITIATOR:
				return initiator != null;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__RECEIVER:
				return receiver != null;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__CHANNEL:
				return channel != null;
			case CjmlmetamodelPackage.PLANNED_COMMUNICATION_POINT__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

} //PlannedCommunicationPointImpl
