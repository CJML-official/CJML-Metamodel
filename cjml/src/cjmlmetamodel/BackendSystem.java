/**
 */
package cjmlmetamodel;

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
 *   <li>{@link cjmlmetamodel.BackendSystem#getSystemID <em>System ID</em>}</li>
 *   <li>{@link cjmlmetamodel.BackendSystem#getSystemName <em>System Name</em>}</li>
 *   <li>{@link cjmlmetamodel.BackendSystem#getSystemDescription <em>System Description</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getBackendSystem()
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getBackendSystem_SystemID()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemID();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.BackendSystem#getSystemID <em>System ID</em>}' attribute.
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getBackendSystem_SystemName()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.BackendSystem#getSystemName <em>System Name</em>}' attribute.
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getBackendSystem_SystemDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemDescription();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.BackendSystem#getSystemDescription <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Description</em>' attribute.
	 * @see #getSystemDescription()
	 * @generated
	 */
	void setSystemDescription(String value);

} // BackendSystem
