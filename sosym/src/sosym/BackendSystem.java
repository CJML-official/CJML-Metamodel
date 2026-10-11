/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backend System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.BackendSystem#getSystemID <em>System ID</em>}</li>
 *   <li>{@link sosym.BackendSystem#getSystemName <em>System Name</em>}</li>
 *   <li>{@link sosym.BackendSystem#getSystemDescription <em>System Description</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getBackendSystem()
 * @model
 * @generated
 */
public interface BackendSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System ID</em>' attribute.
	 * @see #setSystemID(String)
	 * @see sosym.SosymPackage#getBackendSystem_SystemID()
	 * @model
	 * @generated
	 */
	String getSystemID();

	/**
	 * Sets the value of the '{@link sosym.BackendSystem#getSystemID <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System ID</em>' attribute.
	 * @see #getSystemID()
	 * @generated
	 */
	void setSystemID(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see sosym.SosymPackage#getBackendSystem_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link sosym.BackendSystem#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>System Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Description</em>' attribute.
	 * @see #setSystemDescription(String)
	 * @see sosym.SosymPackage#getBackendSystem_SystemDescription()
	 * @model
	 * @generated
	 */
	String getSystemDescription();

	/**
	 * Sets the value of the '{@link sosym.BackendSystem#getSystemDescription <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Description</em>' attribute.
	 * @see #getSystemDescription()
	 * @generated
	 */
	void setSystemDescription(String value);

} // BackendSystem
