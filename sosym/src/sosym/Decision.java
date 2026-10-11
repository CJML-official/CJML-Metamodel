/**
 */
package sosym;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Decision#getDecisionPaths <em>Decision Paths</em>}</li>
 *   <li>{@link sosym.Decision#getCondition <em>Condition</em>}</li>
 *   <li>{@link sosym.Decision#getDecisionMaker <em>Decision Maker</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends JourneyOperator {
	/**
	 * Returns the value of the '<em><b>Decision Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Paths</em>' attribute.
	 * @see #setDecisionPaths(int)
	 * @see sosym.SosymPackage#getDecision_DecisionPaths()
	 * @model
	 * @generated
	 */
	int getDecisionPaths();

	/**
	 * Sets the value of the '{@link sosym.Decision#getDecisionPaths <em>Decision Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Paths</em>' attribute.
	 * @see #getDecisionPaths()
	 * @generated
	 */
	void setDecisionPaths(int value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see sosym.SosymPackage#getDecision_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link sosym.Decision#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Decision Maker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Maker</em>' reference.
	 * @see #setDecisionMaker(Actor)
	 * @see sosym.SosymPackage#getDecision_DecisionMaker()
	 * @model
	 * @generated
	 */
	Actor getDecisionMaker();

	/**
	 * Sets the value of the '{@link sosym.Decision#getDecisionMaker <em>Decision Maker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Maker</em>' reference.
	 * @see #getDecisionMaker()
	 * @generated
	 */
	void setDecisionMaker(Actor value);

} // Decision
