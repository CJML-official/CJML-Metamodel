/**
 */
package cjmlmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.ActualAction#getInitiator <em>Initiator</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualAction()
 * @model
 * @generated
 */
public interface ActualAction extends ActualTouchpoint {
	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' reference.
	 * @see #setInitiator(Initiator)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualAction_Initiator()
	 * @model required="true"
	 * @generated
	 */
	Initiator getInitiator();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.ActualAction#getInitiator <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(Initiator value);

} // ActualAction
