/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.BackendSystem;
import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.JourneyPhase;
import cjmlmetamodel.Touchpoint;
import cjmlmetamodel.uncertaintyValues;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.TouchpointImpl#getBackendSystems <em>Backend Systems</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.TouchpointImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.TouchpointImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.TouchpointImpl#getTouchpointID <em>Touchpoint ID</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.TouchpointImpl#getUncertainty <em>Uncertainty</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.TouchpointImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchpointImpl extends MinimalEObjectImpl.Container implements Touchpoint {
	/**
	 * The cached value of the '{@link #getBackendSystems() <em>Backend Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackendSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<BackendSystem> backendSystems;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<cjmlmetamodel.Object> objects;

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
	 * The default value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected static final uncertaintyValues UNCERTAINTY_EDEFAULT = uncertaintyValues.UNCERTAIN_OCCURRENCE;

	/**
	 * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected uncertaintyValues uncertainty = UNCERTAINTY_EDEFAULT;

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
	public EList<BackendSystem> getBackendSystems() {
		if (backendSystems == null) {
			backendSystems = new EObjectResolvingEList<BackendSystem>(BackendSystem.class, this, CjmlmetamodelPackage.TOUCHPOINT__BACKEND_SYSTEMS);
		}
		return backendSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cjmlmetamodel.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectResolvingEList<cjmlmetamodel.Object>(cjmlmetamodel.Object.class, this, CjmlmetamodelPackage.TOUCHPOINT__OBJECTS);
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
	public uncertaintyValues getUncertainty() {
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertainty(uncertaintyValues newUncertainty) {
		uncertaintyValues oldUncertainty = uncertainty;
		uncertainty = newUncertainty == null ? UNCERTAINTY_EDEFAULT : newUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY, oldUncertainty, uncertainty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.TOUCHPOINT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.TOUCHPOINT__BACKEND_SYSTEMS:
				return getBackendSystems();
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				return getObjects();
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				return getTouchpointID();
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				return getUncertainty();
			case CjmlmetamodelPackage.TOUCHPOINT__COMMENT:
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
			case CjmlmetamodelPackage.TOUCHPOINT__BACKEND_SYSTEMS:
				getBackendSystems().clear();
				getBackendSystems().addAll((Collection<? extends BackendSystem>)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends cjmlmetamodel.Object>)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				setBelongsTo((JourneyPhase)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				setTouchpointID((String)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				setUncertainty((uncertaintyValues)newValue);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__COMMENT:
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
			case CjmlmetamodelPackage.TOUCHPOINT__BACKEND_SYSTEMS:
				getBackendSystems().clear();
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
				setUncertainty(UNCERTAINTY_EDEFAULT);
				return;
			case CjmlmetamodelPackage.TOUCHPOINT__COMMENT:
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
			case CjmlmetamodelPackage.TOUCHPOINT__BACKEND_SYSTEMS:
				return backendSystems != null && !backendSystems.isEmpty();
			case CjmlmetamodelPackage.TOUCHPOINT__OBJECTS:
				return objects != null && !objects.isEmpty();
			case CjmlmetamodelPackage.TOUCHPOINT__BELONGS_TO:
				return belongsTo != null;
			case CjmlmetamodelPackage.TOUCHPOINT__TOUCHPOINT_ID:
				return TOUCHPOINT_ID_EDEFAULT == null ? touchpointID != null : !TOUCHPOINT_ID_EDEFAULT.equals(touchpointID);
			case CjmlmetamodelPackage.TOUCHPOINT__UNCERTAINTY:
				return uncertainty != UNCERTAINTY_EDEFAULT;
			case CjmlmetamodelPackage.TOUCHPOINT__COMMENT:
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
		result.append(" (touchpointID: ");
		result.append(touchpointID);
		result.append(", uncertainty: ");
		result.append(uncertainty);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //TouchpointImpl
