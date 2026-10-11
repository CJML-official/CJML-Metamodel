/**
 */
package cjmlmetamodel;

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
 *   <li>{@link cjmlmetamodel.Message#getContent <em>Content</em>}</li>
 *   <li>{@link cjmlmetamodel.Message#getKeyContent <em>Key Content</em>}</li>
 *   <li>{@link cjmlmetamodel.Message#getDerivedKeyContent <em>Derived Key Content</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getMessage_Content()
	 * @model unique="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Message#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Key Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Content</em>' attribute.
	 * @see #setKeyContent(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getMessage_KeyContent()
	 * @model unique="false"
	 * @generated
	 */
	String getKeyContent();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Message#getKeyContent <em>Key Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Content</em>' attribute.
	 * @see #getKeyContent()
	 * @generated
	 */
	void setKeyContent(String value);

	/**
	 * Returns the value of the '<em><b>Derived Key Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Key Content</em>' attribute.
	 * @see #setDerivedKeyContent(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getMessage_DerivedKeyContent()
	 * @model unique="false"
	 * @generated
	 */
	String getDerivedKeyContent();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Message#getDerivedKeyContent <em>Derived Key Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Key Content</em>' attribute.
	 * @see #getDerivedKeyContent()
	 * @generated
	 */
	void setDerivedKeyContent(String value);

} // Message
