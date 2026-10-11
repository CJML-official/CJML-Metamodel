/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.Experience;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.ExperienceImpl#getEndUserRating <em>End User Rating</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.ExperienceImpl#getEndUserExperienceRating <em>End User Experience Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperienceImpl extends MinimalEObjectImpl.Container implements Experience {
	/**
	 * The default value of the '{@link #getEndUserRating() <em>End User Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserRating()
	 * @generated
	 * @ordered
	 */
	protected static final String END_USER_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndUserRating() <em>End User Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserRating()
	 * @generated
	 * @ordered
	 */
	protected String endUserRating = END_USER_RATING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndUserExperienceRating() <em>End User Experience Rating</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUserExperienceRating()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> endUserExperienceRating;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndUserRating() {
		return endUserRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndUserRating(String newEndUserRating) {
		String oldEndUserRating = endUserRating;
		endUserRating = newEndUserRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.EXPERIENCE__END_USER_RATING, oldEndUserRating, endUserRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getEndUserExperienceRating() {
		if (endUserExperienceRating == null) {
			endUserExperienceRating = new EDataTypeUniqueEList<Integer>(Integer.class, this, CjmlmetamodelPackage.EXPERIENCE__END_USER_EXPERIENCE_RATING);
		}
		return endUserExperienceRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_RATING:
				return getEndUserRating();
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_EXPERIENCE_RATING:
				return getEndUserExperienceRating();
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
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_RATING:
				setEndUserRating((String)newValue);
				return;
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_EXPERIENCE_RATING:
				getEndUserExperienceRating().clear();
				getEndUserExperienceRating().addAll((Collection<? extends Integer>)newValue);
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
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_RATING:
				setEndUserRating(END_USER_RATING_EDEFAULT);
				return;
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_EXPERIENCE_RATING:
				getEndUserExperienceRating().clear();
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
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_RATING:
				return END_USER_RATING_EDEFAULT == null ? endUserRating != null : !END_USER_RATING_EDEFAULT.equals(endUserRating);
			case CjmlmetamodelPackage.EXPERIENCE__END_USER_EXPERIENCE_RATING:
				return endUserExperienceRating != null && !endUserExperienceRating.isEmpty();
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
		result.append(" (EndUserRating: ");
		result.append(endUserRating);
		result.append(", EndUserExperienceRating: ");
		result.append(endUserExperienceRating);
		result.append(')');
		return result.toString();
	}

} //ExperienceImpl
