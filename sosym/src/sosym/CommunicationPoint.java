/**
 */
package sosym;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.CommunicationPoint#getTimeOriginated <em>Time Originated</em>}</li>
 *   <li>{@link sosym.CommunicationPoint#getTimeReceived <em>Time Received</em>}</li>
 *   <li>{@link sosym.CommunicationPoint#getTimeConsumed <em>Time Consumed</em>}</li>
 *   <li>{@link sosym.CommunicationPoint#getHasInitiator <em>Has Initiator</em>}</li>
 *   <li>{@link sosym.CommunicationPoint#getHasReceiver <em>Has Receiver</em>}</li>
 *   <li>{@link sosym.CommunicationPoint#getHasChannel <em>Has Channel</em>}</li>
 *   <li>{@link sosym.CommunicationPoint#getHasMessage <em>Has Message</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getCommunicationPoint()
 * @model
 * @generated
 */
public interface CommunicationPoint extends Touchpoint {
	/**
	 * Returns the value of the '<em><b>Time Originated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Originated</em>' attribute.
	 * @see #setTimeOriginated(Date)
	 * @see sosym.SosymPackage#getCommunicationPoint_TimeOriginated()
	 * @model
	 * @generated
	 */
	Date getTimeOriginated();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getTimeOriginated <em>Time Originated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Originated</em>' attribute.
	 * @see #getTimeOriginated()
	 * @generated
	 */
	void setTimeOriginated(Date value);

	/**
	 * Returns the value of the '<em><b>Time Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Received</em>' attribute.
	 * @see #setTimeReceived(Date)
	 * @see sosym.SosymPackage#getCommunicationPoint_TimeReceived()
	 * @model
	 * @generated
	 */
	Date getTimeReceived();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getTimeReceived <em>Time Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Received</em>' attribute.
	 * @see #getTimeReceived()
	 * @generated
	 */
	void setTimeReceived(Date value);

	/**
	 * Returns the value of the '<em><b>Time Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Consumed</em>' attribute.
	 * @see #setTimeConsumed(Date)
	 * @see sosym.SosymPackage#getCommunicationPoint_TimeConsumed()
	 * @model
	 * @generated
	 */
	Date getTimeConsumed();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getTimeConsumed <em>Time Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Consumed</em>' attribute.
	 * @see #getTimeConsumed()
	 * @generated
	 */
	void setTimeConsumed(Date value);

	/**
	 * Returns the value of the '<em><b>Has Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initiator</em>' reference.
	 * @see #setHasInitiator(Initiator)
	 * @see sosym.SosymPackage#getCommunicationPoint_HasInitiator()
	 * @model required="true"
	 * @generated
	 */
	Initiator getHasInitiator();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getHasInitiator <em>Has Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Initiator</em>' reference.
	 * @see #getHasInitiator()
	 * @generated
	 */
	void setHasInitiator(Initiator value);

	/**
	 * Returns the value of the '<em><b>Has Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Receiver</em>' reference.
	 * @see #setHasReceiver(Receiver)
	 * @see sosym.SosymPackage#getCommunicationPoint_HasReceiver()
	 * @model required="true"
	 * @generated
	 */
	Receiver getHasReceiver();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getHasReceiver <em>Has Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Receiver</em>' reference.
	 * @see #getHasReceiver()
	 * @generated
	 */
	void setHasReceiver(Receiver value);

	/**
	 * Returns the value of the '<em><b>Has Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Channel</em>' reference.
	 * @see #setHasChannel(Channel)
	 * @see sosym.SosymPackage#getCommunicationPoint_HasChannel()
	 * @model required="true"
	 * @generated
	 */
	Channel getHasChannel();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getHasChannel <em>Has Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Channel</em>' reference.
	 * @see #getHasChannel()
	 * @generated
	 */
	void setHasChannel(Channel value);

	/**
	 * Returns the value of the '<em><b>Has Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message</em>' reference.
	 * @see #setHasMessage(Message)
	 * @see sosym.SosymPackage#getCommunicationPoint_HasMessage()
	 * @model required="true"
	 * @generated
	 */
	Message getHasMessage();

	/**
	 * Sets the value of the '{@link sosym.CommunicationPoint#getHasMessage <em>Has Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Message</em>' reference.
	 * @see #getHasMessage()
	 * @generated
	 */
	void setHasMessage(Message value);

} // CommunicationPoint
