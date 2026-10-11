/**
 */
package sosym.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sosym.Concurrency;
import sosym.CustomerJourney;
import sosym.CustomerJourneyElement;
import sosym.EndUser;
import sosym.External;
import sosym.JourneyPhase;
import sosym.ServiceProvider;
import sosym.SosymPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getJourneyID <em>Journey ID</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getJourneyTitle <em>Journey Title</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getJourneyShortSummary <em>Journey Short Summary</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getJourneyLongSummary <em>Journey Long Summary</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getConcurrentPaths <em>Concurrent Paths</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getEndUsers <em>End Users</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link sosym.impl.CustomerJourneyImpl#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerJourneyImpl extends MinimalEObjectImpl.Container implements CustomerJourney {
	/**
	 * The default value of the '{@link #getJourneyID() <em>Journey ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyID()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourneyID() <em>Journey ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyID()
	 * @generated
	 * @ordered
	 */
	protected String journeyID = JOURNEY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJourneyTitle() <em>Journey Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNEY_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourneyTitle() <em>Journey Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyTitle()
	 * @generated
	 * @ordered
	 */
	protected String journeyTitle = JOURNEY_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJourneyShortSummary() <em>Journey Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyShortSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNEY_SHORT_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourneyShortSummary() <em>Journey Short Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyShortSummary()
	 * @generated
	 * @ordered
	 */
	protected String journeyShortSummary = JOURNEY_SHORT_SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJourneyLongSummary() <em>Journey Long Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyLongSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNEY_LONG_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourneyLongSummary() <em>Journey Long Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyLongSummary()
	 * @generated
	 * @ordered
	 */
	protected String journeyLongSummary = JOURNEY_LONG_SUMMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerJourneyElement> elements;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<JourneyPhase> phases;

	/**
	 * The cached value of the '{@link #getConcurrentPaths() <em>Concurrent Paths</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Concurrency> concurrentPaths;

	/**
	 * The cached value of the '{@link #getEndUsers() <em>End Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<EndUser> endUsers;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProvider> providers;

	/**
	 * The cached value of the '{@link #getExternals() <em>Externals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternals()
	 * @generated
	 * @ordered
	 */
	protected EList<External> externals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerJourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SosymPackage.Literals.CUSTOMER_JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJourneyID() {
		return journeyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyID(String newJourneyID) {
		String oldJourneyID = journeyID;
		journeyID = newJourneyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.CUSTOMER_JOURNEY__JOURNEY_ID, oldJourneyID, journeyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJourneyTitle() {
		return journeyTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyTitle(String newJourneyTitle) {
		String oldJourneyTitle = journeyTitle;
		journeyTitle = newJourneyTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.CUSTOMER_JOURNEY__JOURNEY_TITLE, oldJourneyTitle, journeyTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJourneyShortSummary() {
		return journeyShortSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyShortSummary(String newJourneyShortSummary) {
		String oldJourneyShortSummary = journeyShortSummary;
		journeyShortSummary = newJourneyShortSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY, oldJourneyShortSummary, journeyShortSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJourneyLongSummary() {
		return journeyLongSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyLongSummary(String newJourneyLongSummary) {
		String oldJourneyLongSummary = journeyLongSummary;
		journeyLongSummary = newJourneyLongSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SosymPackage.CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY, oldJourneyLongSummary, journeyLongSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerJourneyElement> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<CustomerJourneyElement>(CustomerJourneyElement.class, this, SosymPackage.CUSTOMER_JOURNEY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JourneyPhase> getPhases() {
		if (phases == null) {
			phases = new EObjectResolvingEList<JourneyPhase>(JourneyPhase.class, this, SosymPackage.CUSTOMER_JOURNEY__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concurrency> getConcurrentPaths() {
		if (concurrentPaths == null) {
			concurrentPaths = new EObjectResolvingEList<Concurrency>(Concurrency.class, this, SosymPackage.CUSTOMER_JOURNEY__CONCURRENT_PATHS);
		}
		return concurrentPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndUser> getEndUsers() {
		if (endUsers == null) {
			endUsers = new EObjectResolvingEList<EndUser>(EndUser.class, this, SosymPackage.CUSTOMER_JOURNEY__END_USERS);
		}
		return endUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceProvider> getProviders() {
		if (providers == null) {
			providers = new EObjectResolvingEList<ServiceProvider>(ServiceProvider.class, this, SosymPackage.CUSTOMER_JOURNEY__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<External> getExternals() {
		if (externals == null) {
			externals = new EObjectResolvingEList<External>(External.class, this, SosymPackage.CUSTOMER_JOURNEY__EXTERNALS);
		}
		return externals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_ID:
				return getJourneyID();
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_TITLE:
				return getJourneyTitle();
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY:
				return getJourneyShortSummary();
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY:
				return getJourneyLongSummary();
			case SosymPackage.CUSTOMER_JOURNEY__ELEMENTS:
				return getElements();
			case SosymPackage.CUSTOMER_JOURNEY__PHASES:
				return getPhases();
			case SosymPackage.CUSTOMER_JOURNEY__CONCURRENT_PATHS:
				return getConcurrentPaths();
			case SosymPackage.CUSTOMER_JOURNEY__END_USERS:
				return getEndUsers();
			case SosymPackage.CUSTOMER_JOURNEY__PROVIDERS:
				return getProviders();
			case SosymPackage.CUSTOMER_JOURNEY__EXTERNALS:
				return getExternals();
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
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_ID:
				setJourneyID((String)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_TITLE:
				setJourneyTitle((String)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY:
				setJourneyShortSummary((String)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY:
				setJourneyLongSummary((String)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends CustomerJourneyElement>)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__PHASES:
				getPhases().clear();
				getPhases().addAll((Collection<? extends JourneyPhase>)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__CONCURRENT_PATHS:
				getConcurrentPaths().clear();
				getConcurrentPaths().addAll((Collection<? extends Concurrency>)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__END_USERS:
				getEndUsers().clear();
				getEndUsers().addAll((Collection<? extends EndUser>)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends ServiceProvider>)newValue);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__EXTERNALS:
				getExternals().clear();
				getExternals().addAll((Collection<? extends External>)newValue);
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
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_ID:
				setJourneyID(JOURNEY_ID_EDEFAULT);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_TITLE:
				setJourneyTitle(JOURNEY_TITLE_EDEFAULT);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY:
				setJourneyShortSummary(JOURNEY_SHORT_SUMMARY_EDEFAULT);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY:
				setJourneyLongSummary(JOURNEY_LONG_SUMMARY_EDEFAULT);
				return;
			case SosymPackage.CUSTOMER_JOURNEY__ELEMENTS:
				getElements().clear();
				return;
			case SosymPackage.CUSTOMER_JOURNEY__PHASES:
				getPhases().clear();
				return;
			case SosymPackage.CUSTOMER_JOURNEY__CONCURRENT_PATHS:
				getConcurrentPaths().clear();
				return;
			case SosymPackage.CUSTOMER_JOURNEY__END_USERS:
				getEndUsers().clear();
				return;
			case SosymPackage.CUSTOMER_JOURNEY__PROVIDERS:
				getProviders().clear();
				return;
			case SosymPackage.CUSTOMER_JOURNEY__EXTERNALS:
				getExternals().clear();
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
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyID != null : !JOURNEY_ID_EDEFAULT.equals(journeyID);
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_TITLE:
				return JOURNEY_TITLE_EDEFAULT == null ? journeyTitle != null : !JOURNEY_TITLE_EDEFAULT.equals(journeyTitle);
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_SHORT_SUMMARY:
				return JOURNEY_SHORT_SUMMARY_EDEFAULT == null ? journeyShortSummary != null : !JOURNEY_SHORT_SUMMARY_EDEFAULT.equals(journeyShortSummary);
			case SosymPackage.CUSTOMER_JOURNEY__JOURNEY_LONG_SUMMARY:
				return JOURNEY_LONG_SUMMARY_EDEFAULT == null ? journeyLongSummary != null : !JOURNEY_LONG_SUMMARY_EDEFAULT.equals(journeyLongSummary);
			case SosymPackage.CUSTOMER_JOURNEY__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SosymPackage.CUSTOMER_JOURNEY__PHASES:
				return phases != null && !phases.isEmpty();
			case SosymPackage.CUSTOMER_JOURNEY__CONCURRENT_PATHS:
				return concurrentPaths != null && !concurrentPaths.isEmpty();
			case SosymPackage.CUSTOMER_JOURNEY__END_USERS:
				return endUsers != null && !endUsers.isEmpty();
			case SosymPackage.CUSTOMER_JOURNEY__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case SosymPackage.CUSTOMER_JOURNEY__EXTERNALS:
				return externals != null && !externals.isEmpty();
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
		result.append(" (journeyID: ");
		result.append(journeyID);
		result.append(", journeyTitle: ");
		result.append(journeyTitle);
		result.append(", journeyShortSummary: ");
		result.append(journeyShortSummary);
		result.append(", journeyLongSummary: ");
		result.append(journeyLongSummary);
		result.append(')');
		return result.toString();
	}

} //CustomerJourneyImpl
