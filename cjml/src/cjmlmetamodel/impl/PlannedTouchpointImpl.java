/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.PlannedTouchpoint;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.PlannedTouchpointImpl#getDeltaStartTime <em>Delta Start Time</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.PlannedTouchpointImpl#getTouchpointDuration <em>Touchpoint Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedTouchpointImpl extends TouchpointImpl implements PlannedTouchpoint {
	/**
	 * The cached value of the '{@link #getDeltaStartTime() <em>Delta Start Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaStartTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> deltaStartTime;

	/**
	 * The cached value of the '{@link #getTouchpointDuration() <em>Touchpoint Duration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointDuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> touchpointDuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedTouchpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.PLANNED_TOUCHPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getDeltaStartTime() {
		if (deltaStartTime == null) {
			deltaStartTime = new EDataTypeUniqueEList<Float>(Float.class, this, CjmlmetamodelPackage.PLANNED_TOUCHPOINT__DELTA_START_TIME);
		}
		return deltaStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getTouchpointDuration() {
		if (touchpointDuration == null) {
			touchpointDuration = new EDataTypeUniqueEList<Float>(Float.class, this, CjmlmetamodelPackage.PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION);
		}
		return touchpointDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__DELTA_START_TIME:
				return getDeltaStartTime();
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION:
				return getTouchpointDuration();
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
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__DELTA_START_TIME:
				getDeltaStartTime().clear();
				getDeltaStartTime().addAll((Collection<? extends Float>)newValue);
				return;
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION:
				getTouchpointDuration().clear();
				getTouchpointDuration().addAll((Collection<? extends Float>)newValue);
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
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__DELTA_START_TIME:
				getDeltaStartTime().clear();
				return;
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION:
				getTouchpointDuration().clear();
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
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__DELTA_START_TIME:
				return deltaStartTime != null && !deltaStartTime.isEmpty();
			case CjmlmetamodelPackage.PLANNED_TOUCHPOINT__TOUCHPOINT_DURATION:
				return touchpointDuration != null && !touchpointDuration.isEmpty();
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
		result.append(" (deltaStartTime: ");
		result.append(deltaStartTime);
		result.append(", touchpointDuration: ");
		result.append(touchpointDuration);
		result.append(')');
		return result.toString();
	}

} //PlannedTouchpointImpl
