/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.Concurrency#getConcurrencypaths <em>Concurrencypaths</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getConcurrency()
 * @model
 * @generated
 */
public interface Concurrency extends JourneyOperator {
	/**
	 * Returns the value of the '<em><b>Concurrencypaths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrencypaths</em>' attribute list.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getConcurrency_Concurrencypaths()
	 * @model
	 * @generated
	 */
	EList<Integer> getConcurrencypaths();

} // Concurrency
