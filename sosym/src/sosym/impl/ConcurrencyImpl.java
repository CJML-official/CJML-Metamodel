/**
 */
package sosym.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sosym.Concurrency;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.ConcurrencyImpl#getConcurrencyPaths <em>Concurrency Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyImpl extends JourneyOperatorImpl implements Concurrency {
	/**
	 * The default value of the '{@link #getConcurrencyPaths() <em>Concurrency Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyPaths()
	 * @generated
	 * @ordered
	 */
	protected static final int CONCURRENCY_PATHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConcurrencyPaths() <em>Concurrency Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyPaths()
	 * @generated
	 * @ordered
	 */
	protected int concurrencyPaths = CONCURRENCY_PATHS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.CONCURRENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConcurrencyPaths() {
		return concurrencyPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrencyPaths(int newConcurrencyPaths) {
		int oldConcurrencyPaths = concurrencyPaths;
		concurrencyPaths = newConcurrencyPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.CONCURRENCY__CONCURRENCY_PATHS, oldConcurrencyPaths, concurrencyPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.CONCURRENCY__CONCURRENCY_PATHS:
				return getConcurrencyPaths();
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
			case SosymPackage.CONCURRENCY__CONCURRENCY_PATHS:
				setConcurrencyPaths((Integer)newValue);
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
			case SosymPackage.CONCURRENCY__CONCURRENCY_PATHS:
				setConcurrencyPaths(CONCURRENCY_PATHS_EDEFAULT);
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
			case SosymPackage.CONCURRENCY__CONCURRENCY_PATHS:
				return concurrencyPaths != CONCURRENCY_PATHS_EDEFAULT;
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
		result.append(" (concurrencyPaths: ");
		result.append(concurrencyPaths);
		result.append(')');
		return result.toString();
	}

} //ConcurrencyImpl
