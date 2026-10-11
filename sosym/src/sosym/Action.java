/**
 */
package sosym;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Action#getHasInitiator <em>Has Initiator</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Touchpoint {
	/**
	 * Returns the value of the '<em><b>Has Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Initiator</em>' reference.
	 * @see #setHasInitiator(Initiator)
	 * @see sosym.SosymPackage#getAction_HasInitiator()
	 * @model required="true"
	 * @generated
	 */
	Initiator getHasInitiator();

	/**
	 * Sets the value of the '{@link sosym.Action#getHasInitiator <em>Has Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Initiator</em>' reference.
	 * @see #getHasInitiator()
	 * @generated
	 */
	void setHasInitiator(Initiator value);

} // Action
