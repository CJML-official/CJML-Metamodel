/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sosym.JourneyOperator;
import sosym.JourneyPhase;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.JourneyOperatorImpl#getOperatorID <em>Operator ID</em>}</li>
 *   <li>{@link sosym.impl.JourneyOperatorImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyOperatorImpl extends MinimalEObjectImpl.Container implements JourneyOperator {
	/**
	 * The default value of the '{@link #getOperatorID() <em>Operator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorID()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatorID() <em>Operator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorID()
	 * @generated
	 * @ordered
	 */
	protected String operatorID = OPERATOR_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.JOURNEY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperatorID() {
		return operatorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorID(String newOperatorID) {
		String oldOperatorID = operatorID;
		operatorID = newOperatorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_OPERATOR__OPERATOR_ID, oldOperatorID, operatorID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.JOURNEY_OPERATOR__BELONGS_TO, oldBelongsTo, belongsTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.JOURNEY_OPERATOR__BELONGS_TO, oldBelongsTo, belongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.JOURNEY_OPERATOR__OPERATOR_ID:
				return getOperatorID();
			case SosymPackage.JOURNEY_OPERATOR__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
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
			case SosymPackage.JOURNEY_OPERATOR__OPERATOR_ID:
				setOperatorID((String)newValue);
				return;
			case SosymPackage.JOURNEY_OPERATOR__BELONGS_TO:
				setBelongsTo((JourneyPhase)newValue);
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
			case SosymPackage.JOURNEY_OPERATOR__OPERATOR_ID:
				setOperatorID(OPERATOR_ID_EDEFAULT);
				return;
			case SosymPackage.JOURNEY_OPERATOR__BELONGS_TO:
				setBelongsTo((JourneyPhase)null);
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
			case SosymPackage.JOURNEY_OPERATOR__OPERATOR_ID:
				return OPERATOR_ID_EDEFAULT == null ? operatorID != null : !OPERATOR_ID_EDEFAULT.equals(operatorID);
			case SosymPackage.JOURNEY_OPERATOR__BELONGS_TO:
				return belongsTo != null;
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
		result.append(" (operatorID: ");
		result.append(operatorID);
		result.append(')');
		return result.toString();
	}

} //JourneyOperatorImpl
