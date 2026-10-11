/**
 */
package sosym;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sosym.ActualJourney#getJourneyCompliance <em>Journey Compliance</em>}</li>
 *   <li>{@link sosym.ActualJourney#getJourneyStatus <em>Journey Status</em>}</li>
 *   <li>{@link sosym.ActualJourney#isContentCompliance <em>Content Compliance</em>}</li>
 *   <li>{@link sosym.ActualJourney#isSequenceCompliance <em>Sequence Compliance</em>}</li>
 *   <li>{@link sosym.ActualJourney#getEndUserExperience <em>End User Experience</em>}</li>
 *   <li>{@link sosym.ActualJourney#getEndUserExperienceRating <em>End User Experience Rating</em>}</li>
 * </ul>
 *
 * @see sosym.SosymPackage#getActualJourney()
 * @model
 * @generated
 */
public interface ActualJourney extends CustomerJourney {
	/**
	 * Returns the value of the '<em><b>Journey Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Compliance</em>' reference.
	 * @see #setJourneyCompliance(PlannedJourney)
	 * @see sosym.SosymPackage#getActualJourney_JourneyCompliance()
	 * @model
	 * @generated
	 */
	PlannedJourney getJourneyCompliance();

	/**
	 * Sets the value of the '{@link sosym.ActualJourney#getJourneyCompliance <em>Journey Compliance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Compliance</em>' reference.
	 * @see #getJourneyCompliance()
	 * @generated
	 */
	void setJourneyCompliance(PlannedJourney value);

	/**
	 * Returns the value of the '<em><b>Journey Status</b></em>' attribute.
	 * The literals are from the enumeration {@link sosym.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Status</em>' attribute.
	 * @see sosym.Status
	 * @see #setJourneyStatus(Status)
	 * @see sosym.SosymPackage#getActualJourney_JourneyStatus()
	 * @model
	 * @generated
	 */
	Status getJourneyStatus();

	/**
	 * Sets the value of the '{@link sosym.ActualJourney#getJourneyStatus <em>Journey Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Status</em>' attribute.
	 * @see sosym.Status
	 * @see #getJourneyStatus()
	 * @generated
	 */
	void setJourneyStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Content Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Compliance</em>' attribute.
	 * @see #setContentCompliance(boolean)
	 * @see sosym.SosymPackage#getActualJourney_ContentCompliance()
	 * @model
	 * @generated
	 */
	boolean isContentCompliance();

	/**
	 * Sets the value of the '{@link sosym.ActualJourney#isContentCompliance <em>Content Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Compliance</em>' attribute.
	 * @see #isContentCompliance()
	 * @generated
	 */
	void setContentCompliance(boolean value);

	/**
	 * Returns the value of the '<em><b>Sequence Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Compliance</em>' attribute.
	 * @see #setSequenceCompliance(boolean)
	 * @see sosym.SosymPackage#getActualJourney_SequenceCompliance()
	 * @model
	 * @generated
	 */
	boolean isSequenceCompliance();

	/**
	 * Sets the value of the '{@link sosym.ActualJourney#isSequenceCompliance <em>Sequence Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Compliance</em>' attribute.
	 * @see #isSequenceCompliance()
	 * @generated
	 */
	void setSequenceCompliance(boolean value);

	/**
	 * Returns the value of the '<em><b>End User Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End User Experience</em>' attribute.
	 * @see #setEndUserExperience(String)
	 * @see sosym.SosymPackage#getActualJourney_EndUserExperience()
	 * @model
	 * @generated
	 */
	String getEndUserExperience();

	/**
	 * Sets the value of the '{@link sosym.ActualJourney#getEndUserExperience <em>End User Experience</em>}' attribute.
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
	 * @see sosym.SosymPackage#getActualJourney_EndUserExperienceRating()
	 * @model
	 * @generated
	 */
	int getEndUserExperienceRating();

	/**
	 * Sets the value of the '{@link sosym.ActualJourney#getEndUserExperienceRating <em>End User Experience Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End User Experience Rating</em>' attribute.
	 * @see #getEndUserExperienceRating()
	 * @generated
	 */
	void setEndUserExperienceRating(int value);

} // ActualJourney
