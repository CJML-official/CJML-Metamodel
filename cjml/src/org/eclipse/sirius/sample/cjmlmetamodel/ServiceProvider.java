/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getProviderType <em>Provider Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends Actor {
	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getServiceProvider_CompanyName()
	 * @model
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getServiceProvider_Department()
	 * @model
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getServiceProvider_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Provider Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.sample.cjmlmetamodel.providerTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.providerTypes
	 * @see #isSetProviderType()
	 * @see #unsetProviderType()
	 * @see #setProviderType(providerTypes)
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage#getServiceProvider_ProviderType()
	 * @model unsettable="true"
	 * @generated
	 */
	providerTypes getProviderType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getProviderType <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Type</em>' attribute.
	 * @see org.eclipse.sirius.sample.cjmlmetamodel.providerTypes
	 * @see #isSetProviderType()
	 * @see #unsetProviderType()
	 * @see #getProviderType()
	 * @generated
	 */
	void setProviderType(providerTypes value);

	/**
	 * Unsets the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getProviderType <em>Provider Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProviderType()
	 * @see #getProviderType()
	 * @see #setProviderType(providerTypes)
	 * @generated
	 */
	void unsetProviderType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.sirius.sample.cjmlmetamodel.ServiceProvider#getProviderType <em>Provider Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provider Type</em>' attribute is set.
	 * @see #unsetProviderType()
	 * @see #getProviderType()
	 * @see #setProviderType(providerTypes)
	 * @generated
	 */
	boolean isSetProviderType();

} // ServiceProvider
