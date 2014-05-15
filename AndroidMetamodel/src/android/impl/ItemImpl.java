/**
 */
package android.impl;

import android.AndroidPackage;
import android.Item;
import android.Menu;
import android.TypeAction;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.ItemImpl#getTittle <em>Tittle</em>}</li>
 *   <li>{@link android.impl.ItemImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link android.impl.ItemImpl#getShowAsAction <em>Show As Action</em>}</li>
 *   <li>{@link android.impl.ItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link android.impl.ItemImpl#getMenuOwner <em>Menu Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #getTittle() <em>Tittle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTittle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITTLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTittle() <em>Tittle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTittle()
	 * @generated
	 * @ordered
	 */
	protected String tittle = TITTLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowAsAction() <em>Show As Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowAsAction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAction SHOW_AS_ACTION_EDEFAULT = TypeAction.ALWAYS;

	/**
	 * The cached value of the '{@link #getShowAsAction() <em>Show As Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowAsAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAction showAsAction = SHOW_AS_ACTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTittle() {
		return tittle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTittle(String newTittle) {
		String oldTittle = tittle;
		tittle = newTittle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ITEM__TITTLE, oldTittle, tittle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(BigInteger newOrder) {
		BigInteger oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ITEM__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAction getShowAsAction() {
		return showAsAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowAsAction(TypeAction newShowAsAction) {
		TypeAction oldShowAsAction = showAsAction;
		showAsAction = newShowAsAction == null ? SHOW_AS_ACTION_EDEFAULT : newShowAsAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ITEM__SHOW_AS_ACTION, oldShowAsAction, showAsAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getMenuOwner() {
		if (eContainerFeatureID() != AndroidPackage.ITEM__MENU_OWNER) return null;
		return (Menu)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenuOwner(Menu newMenuOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMenuOwner, AndroidPackage.ITEM__MENU_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuOwner(Menu newMenuOwner) {
		if (newMenuOwner != eInternalContainer() || (eContainerFeatureID() != AndroidPackage.ITEM__MENU_OWNER && newMenuOwner != null)) {
			if (EcoreUtil.isAncestor(this, newMenuOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMenuOwner != null)
				msgs = ((InternalEObject)newMenuOwner).eInverseAdd(this, AndroidPackage.MENU__HAS_ITEM, Menu.class, msgs);
			msgs = basicSetMenuOwner(newMenuOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ITEM__MENU_OWNER, newMenuOwner, newMenuOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.ITEM__MENU_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMenuOwner((Menu)otherEnd, msgs);
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
			case AndroidPackage.ITEM__MENU_OWNER:
				return basicSetMenuOwner(null, msgs);
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
			case AndroidPackage.ITEM__MENU_OWNER:
				return eInternalContainer().eInverseRemove(this, AndroidPackage.MENU__HAS_ITEM, Menu.class, msgs);
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
			case AndroidPackage.ITEM__TITTLE:
				return getTittle();
			case AndroidPackage.ITEM__ORDER:
				return getOrder();
			case AndroidPackage.ITEM__SHOW_AS_ACTION:
				return getShowAsAction();
			case AndroidPackage.ITEM__ID:
				return getId();
			case AndroidPackage.ITEM__MENU_OWNER:
				return getMenuOwner();
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
			case AndroidPackage.ITEM__TITTLE:
				setTittle((String)newValue);
				return;
			case AndroidPackage.ITEM__ORDER:
				setOrder((BigInteger)newValue);
				return;
			case AndroidPackage.ITEM__SHOW_AS_ACTION:
				setShowAsAction((TypeAction)newValue);
				return;
			case AndroidPackage.ITEM__ID:
				setId((String)newValue);
				return;
			case AndroidPackage.ITEM__MENU_OWNER:
				setMenuOwner((Menu)newValue);
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
			case AndroidPackage.ITEM__TITTLE:
				setTittle(TITTLE_EDEFAULT);
				return;
			case AndroidPackage.ITEM__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case AndroidPackage.ITEM__SHOW_AS_ACTION:
				setShowAsAction(SHOW_AS_ACTION_EDEFAULT);
				return;
			case AndroidPackage.ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case AndroidPackage.ITEM__MENU_OWNER:
				setMenuOwner((Menu)null);
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
			case AndroidPackage.ITEM__TITTLE:
				return TITTLE_EDEFAULT == null ? tittle != null : !TITTLE_EDEFAULT.equals(tittle);
			case AndroidPackage.ITEM__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case AndroidPackage.ITEM__SHOW_AS_ACTION:
				return showAsAction != SHOW_AS_ACTION_EDEFAULT;
			case AndroidPackage.ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AndroidPackage.ITEM__MENU_OWNER:
				return getMenuOwner() != null;
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
		result.append(" (tittle: ");
		result.append(tittle);
		result.append(", order: ");
		result.append(order);
		result.append(", showAsAction: ");
		result.append(showAsAction);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
