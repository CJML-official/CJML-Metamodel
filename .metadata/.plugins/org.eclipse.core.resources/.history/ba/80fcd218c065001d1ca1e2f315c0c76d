/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.Concurrency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.ConcurrencyImpl#getConcurrencypaths <em>Concurrencypaths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyImpl extends JourneyOperatorImpl implements Concurrency {
	/**
	 * The cached value of the '{@link #getConcurrencypaths() <em>Concurrencypaths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencypaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> concurrencypaths;

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
		return CjmlmetamodelPackage.Literals.CONCURRENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getConcurrencypaths() {
		if (concurrencypaths == null) {
			concurrencypaths = new EDataTypeUniqueEList<Integer>(Integer.class, this, CjmlmetamodelPackage.CONCURRENCY__CONCURRENCYPATHS);
		}
		return concurrencypaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.CONCURRENCY__CONCURRENCYPATHS:
				return getConcurrencypaths();
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
			case CjmlmetamodelPackage.CONCURRENCY__CONCURRENCYPATHS:
				getConcurrencypaths().clear();
				getConcurrencypaths().addAll((Collection<? extends Integer>)newValue);
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
			case CjmlmetamodelPackage.CONCURRENCY__CONCURRENCYPATHS:
				getConcurrencypaths().clear();
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
			case CjmlmetamodelPackage.CONCURRENCY__CONCURRENCYPATHS:
				return concurrencypaths != null && !concurrencypaths.isEmpty();
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
		result.append(" (concurrencypaths: ");
		result.append(concurrencypaths);
		result.append(')');
		return result.toString();
	}

} //ConcurrencyImpl
