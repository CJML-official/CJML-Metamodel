/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.JourneyOperator#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.JourneyOperator#getOperatorID <em>Operator ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getJourneyOperator()
 * @model
 * @generated
 */
public interface JourneyOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(JourneyPhase)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getJourneyOperator_BelongsTo()
	 * @model
	 * @generated
	 */
	JourneyPhase getBelongsTo();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.JourneyOperator#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(JourneyPhase value);

	/**
	 * Returns the value of the '<em><b>Operator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator ID</em>' attribute.
	 * @see #setOperatorID(String)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getJourneyOperator_OperatorID()
	 * @model
	 * @generated
	 */
	String getOperatorID();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.JourneyOperator#getOperatorID <em>Operator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator ID</em>' attribute.
	 * @see #getOperatorID()
	 * @generated
	 */
	void setOperatorID(String value);

} // JourneyOperator
