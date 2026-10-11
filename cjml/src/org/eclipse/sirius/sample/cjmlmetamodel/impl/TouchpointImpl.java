/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.sample.cjmlmetamodel.BackendSystem;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.JourneyPhase;
import org.eclipse.sirius.sample.cjmlmetamodel.Touchpoint;
import org.eclipse.sirius.sample.cjmlmetamodel.uncertaintyValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.TouchpointImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.TouchpointImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.TouchpointImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.TouchpointImpl#getTouchpointID <em>Touchpoint ID</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.TouchpointImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchpointImpl extends MinimalEObjectImpl.Container implements Touchpoint {
	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<BackendSystem> systems;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.sirius.sample.cjmlmetamodel.Object> objects;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected JourneyPhase belongsTo;

	/**
	 * The default value of the '{@link #getTouchpointID() <em>Touchpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointID()
	 * @generated
	 * @ordered
	 */
	protected static final String TOUCHPOINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTouchpointID() <em>Touchpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpointID()
	 * @generated
	 * @ordered
	 */
	protected String touchpointID = TOUCHPOINT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected EList<uncertaintyValues> uncertainty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.TOUCHPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BackendSystem> getSystems() {
		if (systems == null) {
			systems = new EObjectResolvingEList<BackendSystem>(BackendSystem.class, this, CjmlmetamodelPackage.TOUCHPOINT__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.sirius.sample.cjmlmetamodel.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectResolvingEList<org.eclipse.sirius.sample.cjmlmetamodel.Object>(org.eclipse.sirius.sample.cjmlmetamodel.Object.class, this, CjmlmetamodelPackage.TOUCHPOINT__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyPhase getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (JourneyPhase)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyPhase basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(JourneyPhase newBelongsTo) {
		JourneyPhase oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO, oldBelongsTo, belongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTouchpointID() {
		return touchpointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouchpointID(String newTouchpointID) {
		String oldTouchpointID = touchpointID;
		touchpointID = newTouchpointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID, oldTouchpointID, touchpointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uncertaintyValues> getUncertainty() {
		if (uncertainty == null) {
			uncertainty = new EDataTypeUniqueEList<uncertaintyValues>(uncertaintyValues.class, this, CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY);
		}
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.TOUCHPOINT__SYSTEMS:
				return getSystems();
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				return getObjects();
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				return getTouchpointID();
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				return getUncertainty();
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
			case CjmlmetamodelPackage.TOUCHPOINT__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends BackendSystem>)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends org.eclipse.sirius.sample.cjmlmetamodel.Object>)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				setBelongsTo((JourneyPhase)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				setTouchpointID((String)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				getUncertainty().clear();
				getUncertainty().addAll((Collection<? extends uncertaintyValues>)newValue);
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
			case CjmlmetamodelPackage.TOUCHPOINT__SYSTEMS:
				getSystems().clear();
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				getObjects().clear();
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				setBelongsTo((JourneyPhase)null);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				setTouchpointID(TOUCHPOINT_ID_EDEFAULT);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				getUncertainty().clear();
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
			case CjmlmetamodelPackage.TOUCHPOINT__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				return objects != null && !objects.isEmpty();
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				return belongsTo != null;
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				return TOUCHPOINT_ID_EDEFAULT == null ? touchpointID != null : !TOUCHPOINT_ID_EDEFAULT.equals(touchpointID);
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				return uncertainty != null && !uncertainty.isEmpty();
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
		result.append(" (touchpointID: ");
		result.append(touchpointID);
		result.append(", uncertainty: ");
		result.append(uncertainty);
		result.append(')');
		return result.toString();
	}

} //TouchpointImpl
