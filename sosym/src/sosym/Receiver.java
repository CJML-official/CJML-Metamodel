/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Receiver#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link sosym.Receiver#getReceiverLabel <em>Receiver Label</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getReceiver()
 * @model
 * @generated
 */
public interface Receiver extends EObject {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Actor)
	 * @see sosym.SosymPackage#getReceiver_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	Actor getRefersTo();

	/**
	 * Sets the value of the '{@link sosym.Receiver#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Actor value);

	/**
	 * Returns the value of the '<em><b>Receiver Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Label</em>' attribute.
	 * @see #setReceiverLabel(String)
	 * @see sosym.SosymPackage#getReceiver_ReceiverLabel()
	 * @model
	 * @generated
	 */
	String getReceiverLabel();

	/**
	 * Sets the value of the '{@link sosym.Receiver#getReceiverLabel <em>Receiver Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Label</em>' attribute.
	 * @see #getReceiverLabel()
	 * @generated
	 */
	void setReceiverLabel(String value);

} // Receiver
