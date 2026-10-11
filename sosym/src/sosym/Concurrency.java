/**
 */
package sosym;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Concurrency#getConcurrencyPaths <em>Concurrency Paths</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getConcurrency()
 * @model
 * @generated
 */
public interface Concurrency extends JourneyOperator {
	/**
	 * Returns the value of the '<em><b>Concurrency Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Paths</em>' attribute.
	 * @see #setConcurrencyPaths(int)
	 * @see sosym.SosymPackage#getConcurrency_ConcurrencyPaths()
	 * @model
	 * @generated
	 */
	int getConcurrencyPaths();

	/**
	 * Sets the value of the '{@link sosym.Concurrency#getConcurrencyPaths <em>Concurrency Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Paths</em>' attribute.
	 * @see #getConcurrencyPaths()
	 * @generated
	 */
	void setConcurrencyPaths(int value);

} // Concurrency
