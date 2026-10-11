/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Object#getObjectID <em>Object ID</em>}</li>
 *   <li>{@link sosym.Object#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link sosym.Object#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link sosym.Object#getObjectDescription <em>Object Description</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Object ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object ID</em>' attribute.
	 * @see #setObjectID(String)
	 * @see sosym.SosymPackage#getObject_ObjectID()
	 * @model
	 * @generated
	 */
	String getObjectID();

	/**
	 * Sets the value of the '{@link sosym.Object#getObjectID <em>Object ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object ID</em>' attribute.
	 * @see #getObjectID()
	 * @generated
	 */
	void setObjectID(String value);

	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see sosym.SosymPackage#getObject_ObjectName()
	 * @model
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link sosym.Object#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #setIsVirtual(boolean)
	 * @see sosym.SosymPackage#getObject_IsVirtual()
	 * @model
	 * @generated
	 */
	boolean isIsVirtual();

	/**
	 * Sets the value of the '{@link sosym.Object#isIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #isIsVirtual()
	 * @generated
	 */
	void setIsVirtual(boolean value);

	/**
	 * Returns the value of the '<em><b>Object Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Description</em>' attribute.
	 * @see #setObjectDescription(String)
	 * @see sosym.SosymPackage#getObject_ObjectDescription()
	 * @model
	 * @generated
	 */
	String getObjectDescription();

	/**
	 * Sets the value of the '{@link sosym.Object#getObjectDescription <em>Object Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Description</em>' attribute.
	 * @see #getObjectDescription()
	 * @generated
	 */
	void setObjectDescription(String value);

} // Object
