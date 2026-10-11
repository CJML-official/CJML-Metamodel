/**
 */
package cjmlmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Communication Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.PlannedCommunicationPoint#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link cjmlmetamodel.PlannedCommunicationPoint#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link cjmlmetamodel.PlannedCommunicationPoint#getChannel <em>Channel</em>}</li>
 *   <li>{@link cjmlmetamodel.PlannedCommunicationPoint#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getPlannedCommunicationPoint()
 * @model
 * @generated
 */
public interface PlannedCommunicationPoint extends PlannedTouchpoint {
	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' reference.
	 * @see #setInitiator(Initiator)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getPlannedCommunicationPoint_Initiator()
	 * @model required="true"
	 * @generated
	 */
	Initiator getInitiator();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.PlannedCommunicationPoint#getInitiator <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(Initiator value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Receiver)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getPlannedCommunicationPoint_Receiver()
	 * @model required="true"
	 * @generated
	 */
	Receiver getReceiver();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.PlannedCommunicationPoint#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Receiver value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(Channel)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getPlannedCommunicationPoint_Channel()
	 * @model required="true"
	 * @generated
	 */
	Channel getChannel();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.PlannedCommunicationPoint#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(Channel value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getPlannedCommunicationPoint_Message()
	 * @model required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.PlannedCommunicationPoint#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // PlannedCommunicationPoint
