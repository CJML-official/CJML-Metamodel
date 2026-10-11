/**
 */
package cjmlmetamodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.ActualTouchpoint#getTimeStarted <em>Time Started</em>}</li>
 *   <li>{@link cjmlmetamodel.ActualTouchpoint#getTimeCompleted <em>Time Completed</em>}</li>
 *   <li>{@link cjmlmetamodel.ActualTouchpoint#getTouchpointCompliance <em>Touchpoint Compliance</em>}</li>
 *   <li>{@link cjmlmetamodel.ActualTouchpoint#getCompliance <em>Compliance</em>}</li>
 *   <li>{@link cjmlmetamodel.ActualTouchpoint#getTouchpointExperience <em>Touchpoint Experience</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualTouchpoint()
 * @model
 * @generated
 */
public interface ActualTouchpoint extends Touchpoint {
	/**
	 * Returns the value of the '<em><b>Time Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Started</em>' attribute.
	 * @see #setTimeStarted(Date)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualTouchpoint_TimeStarted()
	 * @model unique="false"
	 * @generated
	 */
	Date getTimeStarted();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.ActualTouchpoint#getTimeStarted <em>Time Started</em>}' attribute.
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
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualTouchpoint_TimeCompleted()
	 * @model unique="false"
	 * @generated
	 */
	Date getTimeCompleted();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.ActualTouchpoint#getTimeCompleted <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Completed</em>' attribute.
	 * @see #getTimeCompleted()
	 * @generated
	 */
	void setTimeCompleted(Date value);

	/**
	 * Returns the value of the '<em><b>Touchpoint Compliance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touchpoint Compliance</em>' reference.
	 * @see #setTouchpointCompliance(PlannedTouchpoint)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualTouchpoint_TouchpointCompliance()
	 * @model
	 * @generated
	 */
	PlannedTouchpoint getTouchpointCompliance();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.ActualTouchpoint#getTouchpointCompliance <em>Touchpoint Compliance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touchpoint Compliance</em>' reference.
	 * @see #getTouchpointCompliance()
	 * @generated
	 */
	void setTouchpointCompliance(PlannedTouchpoint value);

	/**
	 * Returns the value of the '<em><b>Compliance</b></em>' attribute.
	 * The literals are from the enumeration {@link cjmlmetamodel.complianceValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance</em>' attribute.
	 * @see cjmlmetamodel.complianceValues
	 * @see #setCompliance(complianceValues)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualTouchpoint_Compliance()
	 * @model unique="false"
	 * @generated
	 */
	complianceValues getCompliance();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.ActualTouchpoint#getCompliance <em>Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance</em>' attribute.
	 * @see cjmlmetamodel.complianceValues
	 * @see #getCompliance()
	 * @generated
	 */
	void setCompliance(complianceValues value);

	/**
	 * Returns the value of the '<em><b>Touchpoint Experience</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touchpoint Experience</em>' reference.
	 * @see #setTouchpointExperience(Experience)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getActualTouchpoint_TouchpointExperience()
	 * @model
	 * @generated
	 */
	Experience getTouchpointExperience();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.ActualTouchpoint#getTouchpointExperience <em>Touchpoint Experience</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touchpoint Experience</em>' reference.
	 * @see #getTouchpointExperience()
	 * @generated
	 */
	void setTouchpointExperience(Experience value);

} // ActualTouchpoint
