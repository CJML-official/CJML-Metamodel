/**
 */
package cjmlmetamodel;

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
 *   <li>{@link cjmlmetamodel.CustomerJourney#getJourneyOperators <em>Journey Operators</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getJourneyPhases <em>Journey Phases</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getEndUser <em>End User</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getExternal <em>External</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getJourneyID <em>Journey ID</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getJourneyTitle <em>Journey Title</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}</li>
 *   <li>{@link cjmlmetamodel.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney()
 * @model
 * @generated
 */
public interface CustomerJourney extends EObject {
	/**
	 * Returns the value of the '<em><b>Journey Operators</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.JourneyOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Operators</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyOperators()
	 * @model
	 * @generated
	 */
	EList<JourneyOperator> getJourneyOperators();

	/**
	 * Returns the value of the '<em><b>Journey Phases</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.JourneyPhase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Phases</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyPhases()
	 * @model
	 * @generated
	 */
	EList<JourneyPhase> getJourneyPhases();

	/**
	 * Returns the value of the '<em><b>End User</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.EndUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_EndUser()
	 * @model required="true"
	 * @generated
	 */
	EList<EndUser> getEndUser();

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_ServiceProvider()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceProvider> getServiceProvider();

	/**
	 * Returns the value of the '<em><b>External</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.External}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_External()
	 * @model
	 * @generated
	 */
	EList<External> getExternal();

	/**
	 * Returns the value of the '<em><b>Journey ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey ID</em>' attribute.
	 * @see #setJourneyID(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyID()
	 * @model unique="false"
	 * @generated
	 */
	String getJourneyID();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.CustomerJourney#getJourneyID <em>Journey ID</em>}' attribute.
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyTitle()
	 * @model unique="false"
	 * @generated
	 */
	String getJourneyTitle();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.CustomerJourney#getJourneyTitle <em>Journey Title</em>}' attribute.
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyShortSummary()
	 * @model unique="false"
	 * @generated
	 */
	String getJourneyShortSummary();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.CustomerJourney#getJourneyShortSummary <em>Journey Short Summary</em>}' attribute.
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getCustomerJourney_JourneyLongSummary()
	 * @model unique="false"
	 * @generated
	 */
	String getJourneyLongSummary();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.CustomerJourney#getJourneyLongSummary <em>Journey Long Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Long Summary</em>' attribute.
	 * @see #getJourneyLongSummary()
	 * @generated
	 */
	void setJourneyLongSummary(String value);

} // CustomerJourney
