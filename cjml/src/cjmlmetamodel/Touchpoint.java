/**
 */
package cjmlmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.Touchpoint#getBackendSystems <em>Backend Systems</em>}</li>
 *   <li>{@link cjmlmetamodel.Touchpoint#getObjects <em>Objects</em>}</li>
 *   <li>{@link cjmlmetamodel.Touchpoint#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link cjmlmetamodel.Touchpoint#getTouchpointID <em>Touchpoint ID</em>}</li>
 *   <li>{@link cjmlmetamodel.Touchpoint#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link cjmlmetamodel.Touchpoint#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint()
 * @model
 * @generated
 */
public interface Touchpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Backend Systems</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.BackendSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backend Systems</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint_BackendSystems()
	 * @model
	 * @generated
	 */
	EList<BackendSystem> getBackendSystems();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link cjmlmetamodel.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint_Objects()
	 * @model
	 * @generated
	 */
	EList<cjmlmetamodel.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(JourneyPhase)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint_BelongsTo()
	 * @model
	 * @generated
	 */
	JourneyPhase getBelongsTo();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Touchpoint#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(JourneyPhase value);

	/**
	 * Returns the value of the '<em><b>Touchpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touchpoint ID</em>' attribute.
	 * @see #setTouchpointID(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint_TouchpointID()
	 * @model unique="false"
	 * @generated
	 */
	String getTouchpointID();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Touchpoint#getTouchpointID <em>Touchpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touchpoint ID</em>' attribute.
	 * @see #getTouchpointID()
	 * @generated
	 */
	void setTouchpointID(String value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * The literals are from the enumeration {@link cjmlmetamodel.uncertaintyValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see cjmlmetamodel.uncertaintyValues
	 * @see #setUncertainty(uncertaintyValues)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint_Uncertainty()
	 * @model unique="false"
	 * @generated
	 */
	uncertaintyValues getUncertainty();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Touchpoint#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see cjmlmetamodel.uncertaintyValues
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(uncertaintyValues value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see cjmlmetamodel.CjmlmetamodelPackage#getTouchpoint_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link cjmlmetamodel.Touchpoint#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Touchpoint
