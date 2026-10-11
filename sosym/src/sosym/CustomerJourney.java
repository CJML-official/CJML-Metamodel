/**
 */
package sosym;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.CustomerJourney#getJourneyID <em>Journey ID</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getJourneyTitle <em>Journey Title</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getElements <em>Elements</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getPhases <em>Phases</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getConcurrentPaths <em>Concurrent Paths</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getEndUsers <em>End Users</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getProviders <em>Providers</em>}</li>
 *   <li>{@link sosym.CustomerJourney#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getCustomerJourney()
 * @model
 * @generated
 */
public interface CustomerJourney extends EObject {
	/**
	 * Returns the value of the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey ID</em>' attribute.
	 * @see #setJourneyID(String)
	 * @see sosym.SosymPackage#getCustomerJourney_JourneyID()
	 * @model
	 * @generated
	 */
	String getJourneyID();

	/**
	 * Sets the value of the '{@link sosym.CustomerJourney#getJourneyID <em>Journey ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey ID</em>' attribute.
	 * @see #getJourneyID()
	 * @generated
	 */
	void setJourneyID(String value);

	/**
	 * Returns the value of the '<em><b>Journey Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Title</em>' attribute.
	 * @see #setJourneyTitle(String)
	 * @see sosym.SosymPackage#getCustomerJourney_JourneyTitle()
	 * @model
	 * @generated
	 */
	String getJourneyTitle();

	/**
	 * Sets the value of the '{@link sosym.CustomerJourney#getJourneyTitle <em>Journey Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Title</em>' attribute.
	 * @see #getJourneyTitle()
	 * @generated
	 */
	void setJourneyTitle(String value);

	/**
	 * Returns the value of the '<em><b>Journey Short Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Short Summary</em>' attribute.
	 * @see #setJourneyShortSummary(String)
	 * @see sosym.SosymPackage#getCustomerJourney_JourneyShortSummary()
	 * @model
	 * @generated
	 */
	String getJourneyShortSummary();

	/**
	 * Sets the value of the '{@link sosym.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Short Summary</em>' attribute.
	 * @see #getJourneyShortSummary()
	 * @generated
	 */
	void setJourneyShortSummary(String value);

	/**
	 * Returns the value of the '<em><b>Journey Long Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Long Summary</em>' attribute.
	 * @see #setJourneyLongSummary(String)
	 * @see sosym.SosymPackage#getCustomerJourney_JourneyLongSummary()
	 * @model
	 * @generated
	 */
	String getJourneyLongSummary();

	/**
	 * Sets the value of the '{@link sosym.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Long Summary</em>' attribute.
	 * @see #getJourneyLongSummary()
	 * @generated
	 */
	void setJourneyLongSummary(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link sosym.CustomerJourneyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see sosym.SosymPackage#getCustomerJourney_Elements()
	 * @model lower="2"
	 * @generated
	 */
	EList<CustomerJourneyElement> getElements();

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' reference list.
	 * The list contents are of type {@link sosym.JourneyPhase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' reference list.
	 * @see sosym.SosymPackage#getCustomerJourney_Phases()
	 * @model
	 * @generated
	 */
	EList<JourneyPhase> getPhases();

	/**
	 * Returns the value of the '<em><b>Concurrent Paths</b></em>' reference list.
	 * The list contents are of type {@link sosym.Concurrency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Paths</em>' reference list.
	 * @see sosym.SosymPackage#getCustomerJourney_ConcurrentPaths()
	 * @model
	 * @generated
	 */
	EList<Concurrency> getConcurrentPaths();

	/**
	 * Returns the value of the '<em><b>End Users</b></em>' reference list.
	 * The list contents are of type {@link sosym.EndUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Users</em>' reference list.
	 * @see sosym.SosymPackage#getCustomerJourney_EndUsers()
	 * @model required="true"
	 * @generated
	 */
	EList<EndUser> getEndUsers();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' reference list.
	 * The list contents are of type {@link sosym.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' reference list.
	 * @see sosym.SosymPackage#getCustomerJourney_Providers()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceProvider> getProviders();

	/**
	 * Returns the value of the '<em><b>Externals</b></em>' reference list.
	 * The list contents are of type {@link sosym.External}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals</em>' reference list.
	 * @see sosym.SosymPackage#getCustomerJourney_Externals()
	 * @model
	 * @generated
	 */
	EList<External> getExternals();

} // CustomerJourney
