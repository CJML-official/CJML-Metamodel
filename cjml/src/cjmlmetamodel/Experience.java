/**
 */
package cjmlmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.Experience#getEndUserRating <em>End User Rating</em>}</li>
 *   <li>{@link cjmlmetamodel.Experience#getEndUserExperienceRating <em>End User Experience Rating</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getExperience()
 * @model
 * @generated
 */
public interface Experience extends EObject {
	/**
	 * Returns the value of the '<em><b>End User Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User Rating</em>' attribute.
	 * @see #setEndUserRating(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getExperience_EndUserRating()
	 * @model unique="false"
	 * @generated
	 */
	String getEndUserRating();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Experience#getEndUserRating <em>End User Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End User Rating</em>' attribute.
	 * @see #getEndUserRating()
	 * @generated
	 */
	void setEndUserRating(String value);

	/**
	 * Returns the value of the '<em><b>End User Experience Rating</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User Experience Rating</em>' attribute list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getExperience_EndUserExperienceRating()
	 * @model required="true" upper="5"
	 * @generated
	 */
	EList<Integer> getEndUserExperienceRating();

} // Experience
