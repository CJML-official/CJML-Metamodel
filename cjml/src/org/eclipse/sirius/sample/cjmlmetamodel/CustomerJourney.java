/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel;

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
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyOperators <em>Journey Operators</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyPhases <em>Journey Phases</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getEndUsers <em>End Users</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getServiceProviders <em>Service Providers</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getExternals <em>Externals</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyID <em>Journey ID</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyTitle <em>Journey Title</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney()
 * @model
 * @generated
 */
public interface CustomerJourney extends EObject {
	/**
	 * Returns the value of the '<em><b>Journey Operators</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.cjmlmetamodel.JourneyOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Operators</em>' reference list.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyOperators()
	 * @model
	 * @generated
	 */
	EList<JourneyOperator> getJourneyOperators();

	/**
	 * Returns the value of the '<em><b>Journey Phases</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.cjmlmetamodel.JourneyPhase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Phases</em>' reference list.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyPhases()
	 * @model
	 * @generated
	 */
	EList<JourneyPhase> getJourneyPhases();

	/**
	 * Returns the value of the '<em><b>End Users</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.cjmlmetamodel.EndUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Users</em>' reference list.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_EndUsers()
	 * @model required="true"
	 * @generated
	 */
	EList<EndUser> getEndUsers();

	/**
	 * Returns the value of the '<em><b>Service Providers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Providers</em>' reference list.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_ServiceProviders()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceProvider> getServiceProviders();

	/**
	 * Returns the value of the '<em><b>Externals</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.cjmlmetamodel.External}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals</em>' reference list.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_Externals()
	 * @model
	 * @generated
	 */
	EList<External> getExternals();

	/**
	 * Returns the value of the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey ID</em>' attribute.
	 * @see #setJourneyID(String)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyID()
	 * @model
	 * @generated
	 */
	String getJourneyID();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyID <em>Journey ID</em>}' attribute.
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
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyTitle()
	 * @model
	 * @generated
	 */
	String getJourneyTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyTitle <em>Journey Title</em>}' attribute.
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
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyShortSummary()
	 * @model
	 * @generated
	 */
	String getJourneyShortSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}' attribute.
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
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyLongSummary()
	 * @model
	 * @generated
	 */
	String getJourneyLongSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Long Summary</em>' attribute.
	 * @see #getJourneyLongSummary()
	 * @generated
	 */
	void setJourneyLongSummary(String value);

} // CustomerJourney
