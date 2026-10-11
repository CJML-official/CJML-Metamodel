/**
 */
package sosym.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sosym.SosymPackage;
import sosym.Touchpoint;

/**
 * This is the item provider adapter for a {@link sosym.Touchpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchpointItemProvider extends CustomerJourneyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchpointItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTouchpointIDPropertyDescriptor(object);
			addCompliancePropertyDescriptor(object);
			addUncertaintyPropertyDescriptor(object);
			addEndUserExperiencePropertyDescriptor(object);
			addEndUserExperienceRatingPropertyDescriptor(object);
			addTimeStartedPropertyDescriptor(object);
			addTimeCompletedPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addObjectsPropertyDescriptor(object);
			addSystemsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Touchpoint ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchpointIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_touchpointID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_touchpointID_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__TOUCHPOINT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_compliance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_compliance_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__COMPLIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uncertainty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUncertaintyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_uncertainty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_uncertainty_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__UNCERTAINTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End User Experience feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndUserExperiencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_endUserExperience_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_endUserExperience_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__END_USER_EXPERIENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End User Experience Rating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndUserExperienceRatingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_endUserExperienceRating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_endUserExperienceRating_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__END_USER_EXPERIENCE_RATING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_timeStarted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_timeStarted_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__TIME_STARTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Completed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeCompletedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_timeCompleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_timeCompleted_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__TIME_COMPLETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_comment_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_objects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_objects_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__OBJECTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Systems feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Touchpoint_systems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Touchpoint_systems_feature", "_UI_Touchpoint_type"),
				 SosymPackage.Literals.TOUCHPOINT__SYSTEMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Touchpoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Touchpoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Touchpoint)object).getTouchpointID();
		return label == null || label.length() == 0 ?
			getString("_UI_Touchpoint_type") :
			getString("_UI_Touchpoint_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Touchpoint.class)) {
			case SosymPackage.TOUCHPOINT__TOUCHPOINT_ID:
			case SosymPackage.TOUCHPOINT__COMPLIANCE:
			case SosymPackage.TOUCHPOINT__UNCERTAINTY:
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE:
			case SosymPackage.TOUCHPOINT__END_USER_EXPERIENCE_RATING:
			case SosymPackage.TOUCHPOINT__TIME_STARTED:
			case SosymPackage.TOUCHPOINT__TIME_COMPLETED:
			case SosymPackage.TOUCHPOINT__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
