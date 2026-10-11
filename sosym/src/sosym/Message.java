/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Message#getKeyMessage <em>Key Message</em>}</li>
 *   <li>{@link sosym.Message#getMessageContent <em>Message Content</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Message</em>' attribute.
	 * @see #setKeyMessage(String)
	 * @see sosym.SosymPackage#getMessage_KeyMessage()
	 * @model
	 * @generated
	 */
	String getKeyMessage();

	/**
	 * Sets the value of the '{@link sosym.Message#getKeyMessage <em>Key Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Message</em>' attribute.
	 * @see #getKeyMessage()
	 * @generated
	 */
	void setKeyMessage(String value);

	/**
	 * Returns the value of the '<em><b>Message Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Content</em>' attribute.
	 * @see #setMessageContent(String)
	 * @see sosym.SosymPackage#getMessage_MessageContent()
	 * @model
	 * @generated
	 */
	String getMessageContent();

	/**
	 * Sets the value of the '{@link sosym.Message#getMessageContent <em>Message Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Content</em>' attribute.
	 * @see #getMessageContent()
	 * @generated
	 */
	void setMessageContent(String value);

} // Message
