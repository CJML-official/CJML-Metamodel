/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;
import org.eclipse.sirius.sample.cjmlmetamodel.EndUserExperience;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End User Experience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.EndUserExperienceImpl#getExperienceDescription <em>Experience Description</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.cjmlmetamodel.impl.EndUserExperienceImpl#getExperienceRating <em>Experience Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndUserExperienceImpl extends MinimalEObjectImpl.Container implements EndUserExperience {
	/**
	 * The default value of the '{@link #getExperienceDescription() <em>Experience Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPERIENCE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExperienceDescription() <em>Experience Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceDescription()
	 * @generated
	 * @ordered
	 */
	protected String experienceDescription = EXPERIENCE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExperienceRating() <em>Experience Rating</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceRating()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> experienceRating;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndUserExperienceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.END_USER_EXPERIENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExperienceDescription() {
		return experienceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperienceDescription(String newExperienceDescription) {
		String oldExperienceDescription = experienceDescription;
		experienceDescription = newExperienceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_DESCRIPTION, oldExperienceDescription, experienceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getExperienceRating() {
		if (experienceRating == null) {
			experienceRating = new EDataTypeUniqueEList<Integer>(Integer.class, this, CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_RATING);
		}
		return experienceRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_DESCRIPTION:
				return getExperienceDescription();
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_RATING:
				return getExperienceRating();
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
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_DESCRIPTION:
				setExperienceDescription((String)newValue);
				return;
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_RATING:
				getExperienceRating().clear();
				getExperienceRating().addAll((Collection<? extends Integer>)newValue);
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
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_DESCRIPTION:
				setExperienceDescription(EXPERIENCE_DESCRIPTION_EDEFAULT);
				return;
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_RATING:
				getExperienceRating().clear();
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
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_DESCRIPTION:
				return EXPERIENCE_DESCRIPTION_EDEFAULT == null ? experienceDescription != null : !EXPERIENCE_DESCRIPTION_EDEFAULT.equals(experienceDescription);
			case CjmlmetamodelPackage.END_USER_EXPERIENCE__EXPERIENCE_RATING:
				return experienceRating != null && !experienceRating.isEmpty();
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
		result.append(" (experienceDescription: ");
		result.append(experienceDescription);
		result.append(", experienceRating: ");
		result.append(experienceRating);
		result.append(')');
		return result.toString();
	}

} //EndUserExperienceImpl
