/**
 */
package sosym;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.JourneyGroup#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link sosym.JourneyGroup#getGroupDescription <em>Group Description</em>}</li>
 *   <li>{@link sosym.JourneyGroup#getNumberofJourneys <em>Numberof Journeys</em>}</li>
 *   <li>{@link sosym.JourneyGroup#getJourneys <em>Journeys</em>}</li>
 *   <li>{@link sosym.JourneyGroup#getDecisionPaths <em>Decision Paths</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getJourneyGroup()
 * @model
 * @generated
 */
public interface JourneyGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see sosym.SosymPackage#getJourneyGroup_GroupID()
	 * @model
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link sosym.JourneyGroup#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Group Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Description</em>' attribute.
	 * @see #setGroupDescription(String)
	 * @see sosym.SosymPackage#getJourneyGroup_GroupDescription()
	 * @model
	 * @generated
	 */
	String getGroupDescription();

	/**
	 * Sets the value of the '{@link sosym.JourneyGroup#getGroupDescription <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Description</em>' attribute.
	 * @see #getGroupDescription()
	 * @generated
	 */
	void setGroupDescription(String value);

	/**
	 * Returns the value of the '<em><b>Numberof Journeys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numberof Journeys</em>' attribute.
	 * @see #setNumberofJourneys(int)
	 * @see sosym.SosymPackage#getJourneyGroup_NumberofJourneys()
	 * @model
	 * @generated
	 */
	int getNumberofJourneys();

	/**
	 * Sets the value of the '{@link sosym.JourneyGroup#getNumberofJourneys <em>Numberof Journeys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numberof Journeys</em>' attribute.
	 * @see #getNumberofJourneys()
	 * @generated
	 */
	void setNumberofJourneys(int value);

	/**
	 * Returns the value of the '<em><b>Journeys</b></em>' reference list.
	 * The list contents are of type {@link sosym.CustomerJourney}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journeys</em>' reference list.
	 * @see sosym.SosymPackage#getJourneyGroup_Journeys()
	 * @model required="true"
	 * @generated
	 */
	EList<CustomerJourney> getJourneys();

	/**
	 * Returns the value of the '<em><b>Decision Paths</b></em>' reference list.
	 * The list contents are of type {@link sosym.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Paths</em>' reference list.
	 * @see sosym.SosymPackage#getJourneyGroup_DecisionPaths()
	 * @model
	 * @generated
	 */
	EList<Decision> getDecisionPaths();

} // JourneyGroup
