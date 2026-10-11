/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.cjmlmetamodel.ActualTouchpoint;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.EndUserExperience;
import org.eclipse.sirius.sample.cjmlmetamodel.PlannedTouchpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ActualTouchpointImpl#getTimeStarted <em>Time Started</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ActualTouchpointImpl#getTimeCompleted <em>Time Completed</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ActualTouchpointImpl#getTouchpointCompliance <em>Touchpoint Compliance</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ActualTouchpointImpl#getTouchpointExperience <em>Touchpoint Experience</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActualTouchpointImpl extends TouchpointImpl implements ActualTouchpoint {
	/**
	 * The default value of the '{@link #getTimeStarted() <em>Time Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStarted() <em>Time Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStarted()
	 * @generated
	 * @ordered
	 */
	protected Date timeStarted = TIME_STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCompleted() <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_COMPLETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeCompleted() <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCompleted()
	 * @generated
	 * @ordered
	 */
	protected Date timeCompleted = TIME_COMPLETED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTouchpointCompliance() <em>Touchpoint Compliance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointCompliance()
	 * @generated
	 * @ordered
	 */
	protected PlannedTouchpoint touchpointCompliance;

	/**
	 * The cached value of the '{@link #getTouchpointExperience() <em>Touchpoint Experience</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointExperience()
	 * @generated
	 * @ordered
	 */
	protected EndUserExperience touchpointExperience;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualTouchpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.ACTUAL_TOUCHPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStarted() {
		return timeStarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStarted(Date newTimeStarted) {
		Date oldTimeStarted = timeStarted;
		timeStarted = newTimeStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_STARTED, oldTimeStarted, timeStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeCompleted() {
		return timeCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCompleted(Date newTimeCompleted) {
		Date oldTimeCompleted = timeCompleted;
		timeCompleted = newTimeCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_COMPLETED, oldTimeCompleted, timeCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedTouchpoint getTouchpointCompliance() {
		if (touchpointCompliance != null && touchpointCompliance.eIsProxy()) {
			InternalEObject oldTouchpointCompliance = (InternalEObject)touchpointCompliance;
			touchpointCompliance = (PlannedTouchpoint)eResolveProxy(oldTouchpointCompliance);
			if (touchpointCompliance != oldTouchpointCompliance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE, oldTouchpointCompliance, touchpointCompliance));
			}
		}
		return touchpointCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedTouchpoint basicGetTouchpointCompliance() {
		return touchpointCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouchpointCompliance(PlannedTouchpoint newTouchpointCompliance) {
		PlannedTouchpoint oldTouchpointCompliance = touchpointCompliance;
		touchpointCompliance = newTouchpointCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE, oldTouchpointCompliance, touchpointCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndUserExperience getTouchpointExperience() {
		if (touchpointExperience != null && touchpointExperience.eIsProxy()) {
			InternalEObject oldTouchpointExperience = (InternalEObject)touchpointExperience;
			touchpointExperience = (EndUserExperience)eResolveProxy(oldTouchpointExperience);
			if (touchpointExperience != oldTouchpointExperience) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE, oldTouchpointExperience, touchpointExperience));
			}
		}
		return touchpointExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndUserExperience basicGetTouchpointExperience() {
		return touchpointExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouchpointExperience(EndUserExperience newTouchpointExperience) {
		EndUserExperience oldTouchpointExperience = touchpointExperience;
		touchpointExperience = newTouchpointExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE, oldTouchpointExperience, touchpointExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_STARTED:
				return getTimeStarted();
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_COMPLETED:
				return getTimeCompleted();
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE:
				if (resolve) return getTouchpointCompliance();
				return basicGetTouchpointCompliance();
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE:
				if (resolve) return getTouchpointExperience();
				return basicGetTouchpointExperience();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_STARTED:
				setTimeStarted((Date)newValue);
				return;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_COMPLETED:
				setTimeCompleted((Date)newValue);
				return;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE:
				setTouchpointCompliance((PlannedTouchpoint)newValue);
				return;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE:
				setTouchpointExperience((EndUserExperience)newValue);
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
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_STARTED:
				setTimeStarted(TIME_STARTED_EDEFAULT);
				return;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_COMPLETED:
				setTimeCompleted(TIME_COMPLETED_EDEFAULT);
				return;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE:
				setTouchpointCompliance((PlannedTouchpoint)null);
				return;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE:
				setTouchpointExperience((EndUserExperience)null);
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
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_STARTED:
				return TIME_STARTED_EDEFAULT == null ? timeStarted != null : !TIME_STARTED_EDEFAULT.equals(timeStarted);
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_COMPLETED:
				return TIME_COMPLETED_EDEFAULT == null ? timeCompleted != null : !TIME_COMPLETED_EDEFAULT.equals(timeCompleted);
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE:
				return touchpointCompliance != null;
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE:
				return touchpointExperience != null;
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
		result.append(" (timeStarted: ");
		result.append(timeStarted);
		result.append(", timeCompleted: ");
		result.append(timeCompleted);
		result.append(')');
		return result.toString();
	}

} //ActualTouchpointImpl
