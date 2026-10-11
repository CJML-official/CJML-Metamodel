/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.Customer;
import cjmlmetamodel.channels;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.CustomerImpl#getLikes <em>Likes</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.CustomerImpl#getFrustrations <em>Frustrations</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.CustomerImpl#getPreferredChannels <em>Preferred Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends EndUserImpl implements Customer {
	/**
	 * The default value of the '{@link #getLikes() <em>Likes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected static final String LIKES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLikes() <em>Likes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected String likes = LIKES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrustrations() <em>Frustrations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrustrations()
	 * @generated
	 * @ordered
	 */
	protected static final String FRUSTRATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrustrations() <em>Frustrations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrustrations()
	 * @generated
	 * @ordered
	 */
	protected String frustrations = FRUSTRATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreferredChannels() <em>Preferred Channels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<channels> preferredChannels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLikes() {
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikes(String newLikes) {
		String oldLikes = likes;
		likes = newLikes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.CUSTOMER__LIKES, oldLikes, likes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrustrations() {
		return frustrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrustrations(String newFrustrations) {
		String oldFrustrations = frustrations;
		frustrations = newFrustrations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.CUSTOMER__FRUSTRATIONS, oldFrustrations, frustrations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<channels> getPreferredChannels() {
		if (preferredChannels == null) {
			preferredChannels = new EDataTypeUniqueEList<channels>(channels.class, this, CjmlmetamodelPackage.CUSTOMER__PREFERRED_CHANNELS);
		}
		return preferredChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.CUSTOMER__LIKES:
				return getLikes();
			case CjmlmetamodelPackage.CUSTOMER__FRUSTRATIONS:
				return getFrustrations();
			case CjmlmetamodelPackage.CUSTOMER__PREFERRED_CHANNELS:
				return getPreferredChannels();
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
			case CjmlmetamodelPackage.CUSTOMER__LIKES:
				setLikes((String)newValue);
				return;
			case CjmlmetamodelPackage.CUSTOMER__FRUSTRATIONS:
				setFrustrations((String)newValue);
				return;
			case CjmlmetamodelPackage.CUSTOMER__PREFERRED_CHANNELS:
				getPreferredChannels().clear();
				getPreferredChannels().addAll((Collection<? extends channels>)newValue);
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
			case CjmlmetamodelPackage.CUSTOMER__LIKES:
				setLikes(LIKES_EDEFAULT);
				return;
			case CjmlmetamodelPackage.CUSTOMER__FRUSTRATIONS:
				setFrustrations(FRUSTRATIONS_EDEFAULT);
				return;
			case CjmlmetamodelPackage.CUSTOMER__PREFERRED_CHANNELS:
				getPreferredChannels().clear();
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
			case CjmlmetamodelPackage.CUSTOMER__LIKES:
				return LIKES_EDEFAULT == null ? likes != null : !LIKES_EDEFAULT.equals(likes);
			case CjmlmetamodelPackage.CUSTOMER__FRUSTRATIONS:
				return FRUSTRATIONS_EDEFAULT == null ? frustrations != null : !FRUSTRATIONS_EDEFAULT.equals(frustrations);
			case CjmlmetamodelPackage.CUSTOMER__PREFERRED_CHANNELS:
				return preferredChannels != null && !preferredChannels.isEmpty();
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
		result.append(" (likes: ");
		result.append(likes);
		result.append(", frustrations: ");
		result.append(frustrations);
		result.append(", preferredChannels: ");
		result.append(preferredChannels);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
