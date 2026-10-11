/**
 */
package sosym.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sosym.Channel;
import sosym.CommunicationPoint;
import sosym.Initiator;
import sosym.Message;
import sosym.Receiver;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getTimeOriginated <em>Time Originated</em>}</li>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getTimeReceived <em>Time Received</em>}</li>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getTimeConsumed <em>Time Consumed</em>}</li>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getHasInitiator <em>Has Initiator</em>}</li>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getHasReceiver <em>Has Receiver</em>}</li>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getHasChannel <em>Has Channel</em>}</li>
 *   <li>{@link sosym.impl.CommunicationPointImpl#getHasMessage <em>Has Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationPointImpl extends TouchpointImpl implements CommunicationPoint {
	/**
	 * The default value of the '{@link #getTimeOriginated() <em>Time Originated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOriginated()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_ORIGINATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOriginated() <em>Time Originated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOriginated()
	 * @generated
	 * @ordered
	 */
	protected Date timeOriginated = TIME_ORIGINATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeReceived() <em>Time Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeReceived() <em>Time Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeReceived()
	 * @generated
	 * @ordered
	 */
	protected Date timeReceived = TIME_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeConsumed() <em>Time Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConsumed()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_CONSUMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeConsumed() <em>Time Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConsumed()
	 * @generated
	 * @ordered
	 */
	protected Date timeConsumed = TIME_CONSUMED_EDEFAULT;

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
	 * The cached value of the '{@link #getHasReceiver() <em>Has Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReceiver()
	 * @generated
	 * @ordered
	 */
	protected Receiver hasReceiver;

	/**
	 * The cached value of the '{@link #getHasChannel() <em>Has Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChannel()
	 * @generated
	 * @ordered
	 */
	protected Channel hasChannel;

	/**
	 * The cached value of the '{@link #getHasMessage() <em>Has Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessage()
	 * @generated
	 * @ordered
	 */
	protected Message hasMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.COMMUNICATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeOriginated() {
		return timeOriginated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOriginated(Date newTimeOriginated) {
		Date oldTimeOriginated = timeOriginated;
		timeOriginated = newTimeOriginated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__TIME_ORIGINATED, oldTimeOriginated, timeOriginated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeReceived() {
		return timeReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeReceived(Date newTimeReceived) {
		Date oldTimeReceived = timeReceived;
		timeReceived = newTimeReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__TIME_RECEIVED, oldTimeReceived, timeReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeConsumed() {
		return timeConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConsumed(Date newTimeConsumed) {
		Date oldTimeConsumed = timeConsumed;
		timeConsumed = newTimeConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__TIME_CONSUMED, oldTimeConsumed, timeConsumed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.COMMUNICATION_POINT__HAS_INITIATOR, oldHasInitiator, hasInitiator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__HAS_INITIATOR, oldHasInitiator, hasInitiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getHasReceiver() {
		if (hasReceiver != null && hasReceiver.eIsProxy()) {
			InternalEObject oldHasReceiver = (InternalEObject)hasReceiver;
			hasReceiver = (Receiver)eResolveProxy(oldHasReceiver);
			if (hasReceiver != oldHasReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.COMMUNICATION_POINT__HAS_RECEIVER, oldHasReceiver, hasReceiver));
			}
		}
		return hasReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver basicGetHasReceiver() {
		return hasReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReceiver(Receiver newHasReceiver) {
		Receiver oldHasReceiver = hasReceiver;
		hasReceiver = newHasReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__HAS_RECEIVER, oldHasReceiver, hasReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getHasChannel() {
		if (hasChannel != null && hasChannel.eIsProxy()) {
			InternalEObject oldHasChannel = (InternalEObject)hasChannel;
			hasChannel = (Channel)eResolveProxy(oldHasChannel);
			if (hasChannel != oldHasChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.COMMUNICATION_POINT__HAS_CHANNEL, oldHasChannel, hasChannel));
			}
		}
		return hasChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetHasChannel() {
		return hasChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasChannel(Channel newHasChannel) {
		Channel oldHasChannel = hasChannel;
		hasChannel = newHasChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__HAS_CHANNEL, oldHasChannel, hasChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getHasMessage() {
		if (hasMessage != null && hasMessage.eIsProxy()) {
			InternalEObject oldHasMessage = (InternalEObject)hasMessage;
			hasMessage = (Message)eResolveProxy(oldHasMessage);
			if (hasMessage != oldHasMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.COMMUNICATION_POINT__HAS_MESSAGE, oldHasMessage, hasMessage));
			}
		}
		return hasMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetHasMessage() {
		return hasMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMessage(Message newHasMessage) {
		Message oldHasMessage = hasMessage;
		hasMessage = newHasMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.COMMUNICATION_POINT__HAS_MESSAGE, oldHasMessage, hasMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.COMMUNICATION_POINT__TIME_ORIGINATED:
				return getTimeOriginated();
			case SosymPackage.COMMUNICATION_POINT__TIME_RECEIVED:
				return getTimeReceived();
			case SosymPackage.COMMUNICATION_POINT__TIME_CONSUMED:
				return getTimeConsumed();
			case SosymPackage.COMMUNICATION_POINT__HAS_INITIATOR:
				if (resolve) return getHasInitiator();
				return basicGetHasInitiator();
			case SosymPackage.COMMUNICATION_POINT__HAS_RECEIVER:
				if (resolve) return getHasReceiver();
				return basicGetHasReceiver();
			case SosymPackage.COMMUNICATION_POINT__HAS_CHANNEL:
				if (resolve) return getHasChannel();
				return basicGetHasChannel();
			case SosymPackage.COMMUNICATION_POINT__HAS_MESSAGE:
				if (resolve) return getHasMessage();
				return basicGetHasMessage();
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
			case SosymPackage.COMMUNICATION_POINT__TIME_ORIGINATED:
				setTimeOriginated((Date)newValue);
				return;
			case SosymPackage.COMMUNICATION_POINT__TIME_RECEIVED:
				setTimeReceived((Date)newValue);
				return;
			case SosymPackage.COMMUNICATION_POINT__TIME_CONSUMED:
				setTimeConsumed((Date)newValue);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_INITIATOR:
				setHasInitiator((Initiator)newValue);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_RECEIVER:
				setHasReceiver((Receiver)newValue);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_CHANNEL:
				setHasChannel((Channel)newValue);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_MESSAGE:
				setHasMessage((Message)newValue);
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
			case SosymPackage.COMMUNICATION_POINT__TIME_ORIGINATED:
				setTimeOriginated(TIME_ORIGINATED_EDEFAULT);
				return;
			case SosymPackage.COMMUNICATION_POINT__TIME_RECEIVED:
				setTimeReceived(TIME_RECEIVED_EDEFAULT);
				return;
			case SosymPackage.COMMUNICATION_POINT__TIME_CONSUMED:
				setTimeConsumed(TIME_CONSUMED_EDEFAULT);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_INITIATOR:
				setHasInitiator((Initiator)null);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_RECEIVER:
				setHasReceiver((Receiver)null);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_CHANNEL:
				setHasChannel((Channel)null);
				return;
			case SosymPackage.COMMUNICATION_POINT__HAS_MESSAGE:
				setHasMessage((Message)null);
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
			case SosymPackage.COMMUNICATION_POINT__TIME_ORIGINATED:
				return TIME_ORIGINATED_EDEFAULT == null ? timeOriginated != null : !TIME_ORIGINATED_EDEFAULT.equals(timeOriginated);
			case SosymPackage.COMMUNICATION_POINT__TIME_RECEIVED:
				return TIME_RECEIVED_EDEFAULT == null ? timeReceived != null : !TIME_RECEIVED_EDEFAULT.equals(timeReceived);
			case SosymPackage.COMMUNICATION_POINT__TIME_CONSUMED:
				return TIME_CONSUMED_EDEFAULT == null ? timeConsumed != null : !TIME_CONSUMED_EDEFAULT.equals(timeConsumed);
			case SosymPackage.COMMUNICATION_POINT__HAS_INITIATOR:
				return hasInitiator != null;
			case SosymPackage.COMMUNICATION_POINT__HAS_RECEIVER:
				return hasReceiver != null;
			case SosymPackage.COMMUNICATION_POINT__HAS_CHANNEL:
				return hasChannel != null;
			case SosymPackage.COMMUNICATION_POINT__HAS_MESSAGE:
				return hasMessage != null;
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
		result.append(" (timeOriginated: ");
		result.append(timeOriginated);
		result.append(", timeReceived: ");
		result.append(timeReceived);
		result.append(", timeConsumed: ");
		result.append(timeConsumed);
		result.append(')');
		return result.toString();
	}

} //CommunicationPointImpl
