/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.PlannedJourney;
import cjmlmetamodel.PlannedTouchpoint;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.PlannedJourneyImpl#getPlannedTouchpoints <em>Planned Touchpoints</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.PLANNED_JOURNEY__PLANNED_TOUCHPOINTS:
				return getPlannedTouchpoints();
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
		}
		return super.eIsSet(featureID);
	}

} //PlannedJourneyImpl
