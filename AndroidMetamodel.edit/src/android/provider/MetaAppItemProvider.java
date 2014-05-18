/**
 */
package android.provider;


import android.AndroidFactory;
import android.AndroidPackage;
import android.MetaApp;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link android.MetaApp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaAppItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaAppItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_APP);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_ACTIVITY);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_MENU);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_STRING);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_LAYOUT);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_ITEM);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_WIDGET);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_ACTION);
			childrenFeatures.add(AndroidPackage.Literals.META_APP__CREATE_DIALOG);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MetaApp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetaApp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MetaApp_type");
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

		switch (notification.getFeatureID(MetaApp.class)) {
			case AndroidPackage.META_APP__CREATE_APP:
			case AndroidPackage.META_APP__CREATE_ACTIVITY:
			case AndroidPackage.META_APP__CREATE_MENU:
			case AndroidPackage.META_APP__CREATE_STRING:
			case AndroidPackage.META_APP__CREATE_LAYOUT:
			case AndroidPackage.META_APP__CREATE_ITEM:
			case AndroidPackage.META_APP__CREATE_WIDGET:
			case AndroidPackage.META_APP__CREATE_ACTION:
			case AndroidPackage.META_APP__CREATE_DIALOG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_APP,
				 AndroidFactory.eINSTANCE.createAplication()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_ACTIVITY,
				 AndroidFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_MENU,
				 AndroidFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_STRING,
				 AndroidFactory.eINSTANCE.createCreateString()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_LAYOUT,
				 AndroidFactory.eINSTANCE.createLayout()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_ITEM,
				 AndroidFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_WIDGET,
				 AndroidFactory.eINSTANCE.createWidget()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_WIDGET,
				 AndroidFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_WIDGET,
				 AndroidFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_WIDGET,
				 AndroidFactory.eINSTANCE.createTextView()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_ACTION,
				 AndroidFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidPackage.Literals.META_APP__CREATE_DIALOG,
				 AndroidFactory.eINSTANCE.createDialog()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AndroidEditPlugin.INSTANCE;
	}

}
