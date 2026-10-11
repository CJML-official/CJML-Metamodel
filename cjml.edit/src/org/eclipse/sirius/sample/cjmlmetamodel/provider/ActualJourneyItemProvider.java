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

import org.eclipse.sirius.sample.cjmlmetamodel.ActualJourney;
import org.eclipse.sirius.sample.cjmlmetamodel.CjmlmetamodelPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.sample.cjmlmetamodel.ActualJourney} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActualJourneyItemProvider extends CustomerJourneyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualJourneyItemProvider(AdapterFactory adapterFactory) {
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

			addActualTouchpointsPropertyDescriptor(object);
			addJourneyCompliancePropertyDescriptor(object);
			addJourneyExperiencePropertyDescriptor(object);
			addJourneyStatusPropertyDescriptor(object);
			addPlannedReferencePropertyDescriptor(object);
			addContentCompliancePropertyDescriptor(object);
			addSequenceCompliancePropertyDescriptor(object);
			addTimingCompliancePropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actual Touchpoints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualTouchpointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_actualTouchpoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_actualTouchpoints_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__ACTUAL_TOUCHPOINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Journey Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJourneyCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_journeyCompliance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_journeyCompliance_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__JOURNEY_COMPLIANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Journey Experience feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJourneyExperiencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_journeyExperience_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_journeyExperience_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__JOURNEY_EXPERIENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Journey Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJourneyStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_journeyStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_journeyStatus_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__JOURNEY_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Planned Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlannedReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_plannedReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_plannedReference_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__PLANNED_REFERENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_contentCompliance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_contentCompliance_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__CONTENT_COMPLIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_sequenceCompliance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_sequenceCompliance_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timing Compliance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimingCompliancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActualJourney_timingCompliance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_timingCompliance_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__TIMING_COMPLIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ActualJourney_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActualJourney_comment_feature", "_UI_ActualJourney_type"),
				 CjmlmetamodelPackage.Literals.ACTUAL_JOURNEY__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ActualJourney.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActualJourney"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActualJourney)object).getJourneyID();
		return label == null || label.length() == 0 ?
			getString("_UI_ActualJourney_type") :
			getString("_UI_ActualJourney_type") + " " + label;
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

		switch (notification.getFeatureID(ActualJourney.class)) {
			case CjmlmetamodelPackage.ACTUAL_JOURNEY__JOURNEY_STATUS:
			case CjmlmetamodelPackage.ACTUAL_JOURNEY__PLANNED_REFERENCE:
			case CjmlmetamodelPackage.ACTUAL_JOURNEY__CONTENT_COMPLIANCE:
			case CjmlmetamodelPackage.ACTUAL_JOURNEY__SEQUENCE_COMPLIANCE:
			case CjmlmetamodelPackage.ACTUAL_JOURNEY__TIMING_COMPLIANCE:
			case CjmlmetamodelPackage.ACTUAL_JOURNEY__COMMENT:
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
