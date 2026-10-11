/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sosym.Actor;
import sosym.Decision;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.DecisionImpl#getDecisionPaths <em>Decision Paths</em>}</li>
 *   <li>{@link sosym.impl.DecisionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sosym.impl.DecisionImpl#getDecisionMaker <em>Decision Maker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends JourneyOperatorImpl implements Decision {
	/**
	 * The default value of the '{@link #getDecisionPaths() <em>Decision Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionPaths()
	 * @generated
	 * @ordered
	 */
	protected static final int DECISION_PATHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecisionPaths() <em>Decision Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionPaths()
	 * @generated
	 * @ordered
	 */
	protected int decisionPaths = DECISION_PATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecisionMaker() <em>Decision Maker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionMaker()
	 * @generated
	 * @ordered
	 */
	protected Actor decisionMaker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecisionPaths() {
		return decisionPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionPaths(int newDecisionPaths) {
		int oldDecisionPaths = decisionPaths;
		decisionPaths = newDecisionPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.DECISION__DECISION_PATHS, oldDecisionPaths, decisionPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.DECISION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getDecisionMaker() {
		if (decisionMaker != null && decisionMaker.eIsProxy()) {
			InternalEObject oldDecisionMaker = (InternalEObject)decisionMaker;
			decisionMaker = (Actor)eResolveProxy(oldDecisionMaker);
			if (decisionMaker != oldDecisionMaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SosymPackage.DECISION__DECISION_MAKER, oldDecisionMaker, decisionMaker));
			}
		}
		return decisionMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetDecisionMaker() {
		return decisionMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionMaker(Actor newDecisionMaker) {
		Actor oldDecisionMaker = decisionMaker;
		decisionMaker = newDecisionMaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.DECISION__DECISION_MAKER, oldDecisionMaker, decisionMaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.DECISION__DECISION_PATHS:
				return getDecisionPaths();
			case SosymPackage.DECISION__CONDITION:
				return getCondition();
			case SosymPackage.DECISION__DECISION_MAKER:
				if (resolve) return getDecisionMaker();
				return basicGetDecisionMaker();
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
			case SosymPackage.DECISION__DECISION_PATHS:
				setDecisionPaths((Integer)newValue);
				return;
			case SosymPackage.DECISION__CONDITION:
				setCondition((String)newValue);
				return;
			case SosymPackage.DECISION__DECISION_MAKER:
				setDecisionMaker((Actor)newValue);
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
			case SosymPackage.DECISION__DECISION_PATHS:
				setDecisionPaths(DECISION_PATHS_EDEFAULT);
				return;
			case SosymPackage.DECISION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SosymPackage.DECISION__DECISION_MAKER:
				setDecisionMaker((Actor)null);
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
			case SosymPackage.DECISION__DECISION_PATHS:
				return decisionPaths != DECISION_PATHS_EDEFAULT;
			case SosymPackage.DECISION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case SosymPackage.DECISION__DECISION_MAKER:
				return decisionMaker != null;
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
		result.append(" (decisionPaths: ");
		result.append(decisionPaths);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
