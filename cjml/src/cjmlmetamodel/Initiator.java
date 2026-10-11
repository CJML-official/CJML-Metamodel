/**
 */
package cjmlmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initiator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.Initiator#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link cjmlmetamodel.Initiator#getInitiatorLabel <em>Initiator Label</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getInitiator()
 * @model
 * @generated
 */
public interface Initiator extends EObject {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Actor)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getInitiator_RefersTo()
	 * @model required="true"
	 * @generated
	 */
	Actor getRefersTo();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Initiator#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Actor value);

	/**
	 * Returns the value of the '<em><b>Initiator Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator Label</em>' attribute.
	 * @see #setInitiatorLabel(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getInitiator_InitiatorLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getInitiatorLabel();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Initiator#getInitiatorLabel <em>Initiator Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator Label</em>' attribute.
	 * @see #getInitiatorLabel()
	 * @generated
	 */
	void setInitiatorLabel(String value);

} // Initiator
