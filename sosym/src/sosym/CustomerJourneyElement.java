/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Journey Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.CustomerJourneyElement#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getCustomerJourneyElement()
 * @model
 * @generated
 */
public interface CustomerJourneyElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(JourneyPhase)
	 * @see sosym.SosymPackage#getCustomerJourneyElement_BelongsTo()
	 * @model
	 * @generated
	 */
	JourneyPhase getBelongsTo();

	/**
	 * Sets the value of the '{@link sosym.CustomerJourneyElement#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(JourneyPhase value);

} // CustomerJourneyElement
