/**
 */
package android.impl;

import android.Activity;
import android.AndroidPackage;
import android.Item;
import android.Menu;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.MenuImpl#getId <em>Id</em>}</li>
 *   <li>{@link android.impl.MenuImpl#getIsShowed <em>Is Showed</em>}</li>
 *   <li>{@link android.impl.MenuImpl#getHasItem <em>Has Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasItem() <em>Has Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> hasItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.MENU__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getIsShowed() {
		if (eContainerFeatureID() != AndroidPackage.MENU__IS_SHOWED) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsShowed(Activity newIsShowed, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsShowed, AndroidPackage.MENU__IS_SHOWED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShowed(Activity newIsShowed) {
		if (newIsShowed != eInternalContainer() || (eContainerFeatureID() != AndroidPackage.MENU__IS_SHOWED && newIsShowed != null)) {
			if (EcoreUtil.isAncestor(this, newIsShowed))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsShowed != null)
				msgs = ((InternalEObject)newIsShowed).eInverseAdd(this, AndroidPackage.ACTIVITY__SHOW, Activity.class, msgs);
			msgs = basicSetIsShowed(newIsShowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.MENU__IS_SHOWED, newIsShowed, newIsShowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getHasItem() {
		if (hasItem == null) {
			hasItem = new EObjectContainmentWithInverseEList<Item>(Item.class, this, AndroidPackage.MENU__HAS_ITEM, AndroidPackage.ITEM__MENU_OWNER);
		}
		return hasItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.MENU__IS_SHOWED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsShowed((Activity)otherEnd, msgs);
			case AndroidPackage.MENU__HAS_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasItem()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.MENU__IS_SHOWED:
				return basicSetIsShowed(null, msgs);
			case AndroidPackage.MENU__HAS_ITEM:
				return ((InternalEList<?>)getHasItem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AndroidPackage.MENU__IS_SHOWED:
				return eInternalContainer().eInverseRemove(this, AndroidPackage.ACTIVITY__SHOW, Activity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidPackage.MENU__ID:
				return getId();
			case AndroidPackage.MENU__IS_SHOWED:
				return getIsShowed();
			case AndroidPackage.MENU__HAS_ITEM:
				return getHasItem();
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
			case AndroidPackage.MENU__ID:
				setId((String)newValue);
				return;
			case AndroidPackage.MENU__IS_SHOWED:
				setIsShowed((Activity)newValue);
				return;
			case AndroidPackage.MENU__HAS_ITEM:
				getHasItem().clear();
				getHasItem().addAll((Collection<? extends Item>)newValue);
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
			case AndroidPackage.MENU__ID:
				setId(ID_EDEFAULT);
				return;
			case AndroidPackage.MENU__IS_SHOWED:
				setIsShowed((Activity)null);
				return;
			case AndroidPackage.MENU__HAS_ITEM:
				getHasItem().clear();
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
			case AndroidPackage.MENU__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AndroidPackage.MENU__IS_SHOWED:
				return getIsShowed() != null;
			case AndroidPackage.MENU__HAS_ITEM:
				return hasItem != null && !hasItem.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
