/**
 */
package sosym;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.Touchpoint#getTouchpointID <em>Touchpoint ID</em>}</li>
 *   <li>{@link sosym.Touchpoint#getCompliance <em>Compliance</em>}</li>
 *   <li>{@link sosym.Touchpoint#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link sosym.Touchpoint#getEndUserExperience <em>End User Experience</em>}</li>
 *   <li>{@link sosym.Touchpoint#getEndUserExperienceRating <em>End User Experience Rating</em>}</li>
 *   <li>{@link sosym.Touchpoint#getTimeStarted <em>Time Started</em>}</li>
 *   <li>{@link sosym.Touchpoint#getTimeCompleted <em>Time Completed</em>}</li>
 *   <li>{@link sosym.Touchpoint#getComment <em>Comment</em>}</li>
 *   <li>{@link sosym.Touchpoint#getObjects <em>Objects</em>}</li>
 *   <li>{@link sosym.Touchpoint#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getTouchpoint()
 * @model
 * @generated
 */
public interface Touchpoint extends CustomerJourneyElement {
	/**
	 * Returns the value of the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touchpoint ID</em>' attribute.
	 * @see #setTouchpointID(String)
	 * @see sosym.SosymPackage#getTouchpoint_TouchpointID()
	 * @model
	 * @generated
	 */
	String getTouchpointID();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getTouchpointID <em>Touchpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touchpoint ID</em>' attribute.
	 * @see #getTouchpointID()
	 * @generated
	 */
	void setTouchpointID(String value);

	/**
	 * Returns the value of the '<em><b>Compliance</b></em>' attribute.
	 * The literals are from the enumeration {@link sosym.ComplianceValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance</em>' attribute.
	 * @see sosym.ComplianceValues
	 * @see #setCompliance(ComplianceValues)
	 * @see sosym.SosymPackage#getTouchpoint_Compliance()
	 * @model
	 * @generated
	 */
	ComplianceValues getCompliance();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getCompliance <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance</em>' attribute.
	 * @see sosym.ComplianceValues
	 * @see #getCompliance()
	 * @generated
	 */
	void setCompliance(ComplianceValues value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * The literals are from the enumeration {@link sosym.UncertaintyValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see sosym.UncertaintyValues
	 * @see #setUncertainty(UncertaintyValues)
	 * @see sosym.SosymPackage#getTouchpoint_Uncertainty()
	 * @model
	 * @generated
	 */
	UncertaintyValues getUncertainty();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see sosym.UncertaintyValues
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(UncertaintyValues value);

	/**
	 * Returns the value of the '<em><b>End User Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User Experience</em>' attribute.
	 * @see #setEndUserExperience(String)
	 * @see sosym.SosymPackage#getTouchpoint_EndUserExperience()
	 * @model
	 * @generated
	 */
	String getEndUserExperience();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getEndUserExperience <em>End User Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End User Experience</em>' attribute.
	 * @see #getEndUserExperience()
	 * @generated
	 */
	void setEndUserExperience(String value);

	/**
	 * Returns the value of the '<em><b>End User Experience Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User Experience Rating</em>' attribute.
	 * @see #setEndUserExperienceRating(int)
	 * @see sosym.SosymPackage#getTouchpoint_EndUserExperienceRating()
	 * @model
	 * @generated
	 */
	int getEndUserExperienceRating();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getEndUserExperienceRating <em>End User Experience Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End User Experience Rating</em>' attribute.
	 * @see #getEndUserExperienceRating()
	 * @generated
	 */
	void setEndUserExperienceRating(int value);

	/**
	 * Returns the value of the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Started</em>' attribute.
	 * @see #setTimeStarted(Date)
	 * @see sosym.SosymPackage#getTouchpoint_TimeStarted()
	 * @model
	 * @generated
	 */
	Date getTimeStarted();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getTimeStarted <em>Time Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Started</em>' attribute.
	 * @see #getTimeStarted()
	 * @generated
	 */
	void setTimeStarted(Date value);

	/**
	 * Returns the value of the '<em><b>Time Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Completed</em>' attribute.
	 * @see #setTimeCompleted(Date)
	 * @see sosym.SosymPackage#getTouchpoint_TimeCompleted()
	 * @model
	 * @generated
	 */
	Date getTimeCompleted();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getTimeCompleted <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Completed</em>' attribute.
	 * @see #getTimeCompleted()
	 * @generated
	 */
	void setTimeCompleted(Date value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see sosym.SosymPackage#getTouchpoint_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link sosym.Touchpoint#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link sosym.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see sosym.SosymPackage#getTouchpoint_Objects()
	 * @model
	 * @generated
	 */
	EList<sosym.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' reference list.
	 * The list contents are of type {@link sosym.BackendSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' reference list.
	 * @see sosym.SosymPackage#getTouchpoint_Systems()
	 * @model
	 * @generated
	 */
	EList<BackendSystem> getSystems();

} // Touchpoint
