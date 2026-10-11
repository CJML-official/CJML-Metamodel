/**
 */
package cjmlmetamodel.impl;

import cjmlmetamodel.CjmlmetamodelPackage;
import cjmlmetamodel.Message;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cjmlmetamodel.impl.MessageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.MessageImpl#getKeyContent <em>Key Content</em>}</li>
 *   <li>{@link cjmlmetamodel.impl.MessageImpl#getDerivedKeyContent <em>Derived Key Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyContent() <em>Key Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyContent()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyContent() <em>Key Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyContent()
	 * @generated
	 * @ordered
	 */
	protected String keyContent = KEY_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedKeyContent() <em>Derived Key Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedKeyContent()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_KEY_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedKeyContent() <em>Derived Key Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedKeyContent()
	 * @generated
	 * @ordered
	 */
	protected String derivedKeyContent = DERIVED_KEY_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CjmlmetamodelPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.MESSAGE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyContent() {
		return keyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyContent(String newKeyContent) {
		String oldKeyContent = keyContent;
		keyContent = newKeyContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.MESSAGE__KEY_CONTENT, oldKeyContent, keyContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedKeyContent() {
		return derivedKeyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedKeyContent(String newDerivedKeyContent) {
		String oldDerivedKeyContent = derivedKeyContent;
		derivedKeyContent = newDerivedKeyContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CjmlmetamodelPackage.MESSAGE__DERIVED_KEY_CONTENT, oldDerivedKeyContent, derivedKeyContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CjmlmetamodelPackage.MESSAGE__CONTENT:
				return getContent();
			case CjmlmetamodelPackage.MESSAGE__KEY_CONTENT:
				return getKeyContent();
			case CjmlmetamodelPackage.MESSAGE__DERIVED_KEY_CONTENT:
				return getDerivedKeyContent();
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
			case CjmlmetamodelPackage.MESSAGE__CONTENT:
				setContent((String)newValue);
				return;
			case CjmlmetamodelPackage.MESSAGE__KEY_CONTENT:
				setKeyContent((String)newValue);
				return;
			case CjmlmetamodelPackage.MESSAGE__DERIVED_KEY_CONTENT:
				setDerivedKeyContent((String)newValue);
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
			case CjmlmetamodelPackage.MESSAGE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CjmlmetamodelPackage.MESSAGE__KEY_CONTENT:
				setKeyContent(KEY_CONTENT_EDEFAULT);
				return;
			case CjmlmetamodelPackage.MESSAGE__DERIVED_KEY_CONTENT:
				setDerivedKeyContent(DERIVED_KEY_CONTENT_EDEFAULT);
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
			case CjmlmetamodelPackage.MESSAGE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CjmlmetamodelPackage.MESSAGE__KEY_CONTENT:
				return KEY_CONTENT_EDEFAULT == null ? keyContent != null : !KEY_CONTENT_EDEFAULT.equals(keyContent);
			case CjmlmetamodelPackage.MESSAGE__DERIVED_KEY_CONTENT:
				return DERIVED_KEY_CONTENT_EDEFAULT == null ? derivedKeyContent != null : !DERIVED_KEY_CONTENT_EDEFAULT.equals(derivedKeyContent);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", keyContent: ");
		result.append(keyContent);
		result.append(", derivedKeyContent: ");
		result.append(derivedKeyContent);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
