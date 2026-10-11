/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedJourney;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedTouchpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.PlannedJourneyImpl#getPlannedTouchpoints <em>Planned Touchpoints</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.PlannedJourneyImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedJourneyImpl extends CustomerJourneyImpl implements PlannedJourney {
	/**
	 * The cached value of the '{@link #getPlannedTouchpoints() <em>Planned Touchpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedTouchpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<PlannedTouchpoint> plannedTouchpoints;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedJourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.PLANNED_JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedTouchpoint> getPlannedTouchpoints() {
		if (plannedTouchpoints == null) {
			plannedTouchpoints = new EObjectResolvingEList<PlannedTouchpoint>(PlannedTouchpoint.class, this, CjmlmetamodelPackage.PLANNED_JOURNEY__PLANNED_TOUCHPOINTS);
		}
		return plannedTouchpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.PLANNED_JOURNEY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_JOURNEY__PLANNED_TOUCHPOINTS:
				return getPlannedTouchpoints();
			case CjmlmetamodelPackage.PLANNED_JOURNEY__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_JOURNEY__PLANNED_TOUCHPOINTS:
				getPlannedTouchpoints().clear();
				getPlannedTouchpoints().addAll((Collection<? extends PlannedTouchpoint>)newValue);
				return;
			case CjmlmetamodelPackage.PLANNED_JOURNEY__COMMENT:
				setComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_JOURNEY__PLANNED_TOUCHPOINTS:
				getPlannedTouchpoints().clear();
				return;
			case CjmlmetamodelPackage.PLANNED_JOURNEY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_JOURNEY__PLANNED_TOUCHPOINTS:
				return plannedTouchpoints != null && !plannedTouchpoints.isEmpty();
			case CjmlmetamodelPackage.PLANNED_JOURNEY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PlannedJourneyImpl
