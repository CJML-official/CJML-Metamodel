/**
 */
package org.eclipse.sirius.sample.cjmlmetamodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sirius.sample.cjmlmetamodel.ActualTouchpoint;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.sample.cjmlmetamodel.ActualTouchpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualTouchpointItemProvider extends TouchpointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualTouchpointItemProvider(AdapterFactory adapterFactory) {
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

			addTimeStartedPropertyDescriptor(object);
			addTimeCompletedPropertyDescriptor(object);
			addTouchpointCompliancePropertyDescriptor(object);
			addTouchpointExperiencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ActualTouchpoint_timeStarted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualTouchpoint_timeStarted_feature", "_UI_ActualTouchpoint_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_TOUCHPOINT__TIME_STARTED,
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
				 getString("_UI_ActualTouchpoint_timeCompleted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualTouchpoint_timeCompleted_feature", "_UI_ActualTouchpoint_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_TOUCHPOINT__TIME_COMPLETED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Touchpoint Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchpointCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualTouchpoint_touchpointCompliance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualTouchpoint_touchpointCompliance_feature", "_UI_ActualTouchpoint_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_TOUCHPOINT__TOUCHPOINT_COMPLIANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Touchpoint Experience feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchpointExperiencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualTouchpoint_touchpointExperience_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualTouchpoint_touchpointExperience_feature", "_UI_ActualTouchpoint_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_TOUCHPOINT__TOUCHPOINT_EXPERIENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ActualTouchpoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActualTouchpoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActualTouchpoint)object).getTouchpointID();
		return label == null || label.length() == 0 ?
			getString("_UI_ActualTouchpoint_type") :
			getString("_UI_ActualTouchpoint_type") + " " + label;
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

		switch (notification.getFeatureID(ActualTouchpoint.class)) {
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_STARTED:
			case CjmlmetamodelPackage.ACTUAL_TOUCHPOINT__TIME_COMPLETED:
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
