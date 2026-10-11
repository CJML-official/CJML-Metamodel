/**
 */
package sosym;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.EndUser#getEndUserType <em>End User Type</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getEndUser()
 * @model
 * @generated
 */
public interface EndUser extends Actor {
	/**
	 * Returns the value of the '<em><b>End User Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sosym.EUTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User Type</em>' attribute.
	 * @see sosym.EUTypes
	 * @see #setEndUserType(EUTypes)
	 * @see sosym.SosymPackage#getEndUser_EndUserType()
	 * @model
	 * @generated
	 */
	EUTypes getEndUserType();

	/**
	 * Sets the value of the '{@link sosym.EndUser#getEndUserType <em>End User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End User Type</em>' attribute.
	 * @see sosym.EUTypes
	 * @see #getEndUserType()
	 * @generated
	 */
	void setEndUserType(EUTypes value);

} // EndUser
