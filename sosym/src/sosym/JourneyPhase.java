/**
 */
package sosym;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.JourneyPhase#getPhaseName <em>Phase Name</em>}</li>
 *   <li>{@link sosym.JourneyPhase#getPhaseDescription <em>Phase Description</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getJourneyPhase()
 * @model
 * @generated
 */
public interface JourneyPhase extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Name</em>' attribute.
	 * @see #setPhaseName(String)
	 * @see sosym.SosymPackage#getJourneyPhase_PhaseName()
	 * @model
	 * @generated
	 */
	String getPhaseName();

	/**
	 * Sets the value of the '{@link sosym.JourneyPhase#getPhaseName <em>Phase Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Name</em>' attribute.
	 * @see #getPhaseName()
	 * @generated
	 */
	void setPhaseName(String value);

	/**
	 * Returns the value of the '<em><b>Phase Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Description</em>' attribute.
	 * @see #setPhaseDescription(String)
	 * @see sosym.SosymPackage#getJourneyPhase_PhaseDescription()
	 * @model
	 * @generated
	 */
	String getPhaseDescription();

	/**
	 * Sets the value of the '{@link sosym.JourneyPhase#getPhaseDescription <em>Phase Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Description</em>' attribute.
	 * @see #getPhaseDescription()
	 * @generated
	 */
	void setPhaseDescription(String value);

} // JourneyPhase
