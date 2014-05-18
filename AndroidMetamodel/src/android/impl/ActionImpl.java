/**
 */
package android.impl;

import android.Action;
import android.ActionType;
import android.AndroidPackage;
import android.Button;
import android.Dialog;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.ActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link android.impl.ActionImpl#getButtonOwner <em>Button Owner</em>}</li>
 *   <li>{@link android.impl.ActionImpl#getShows <em>Shows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType TYPE_EDEFAULT = ActionType.CLICK;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getButtonOwner() <em>Button Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonOwner()
	 * @generated
	 * @ordered
	 */
	protected Button buttonOwner;

	/**
	 * The cached value of the '{@link #getShows() <em>Shows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShows()
	 * @generated
	 * @ordered
	 */
	protected Dialog shows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActionType newType) {
		ActionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button getButtonOwner() {
		if (buttonOwner != null && buttonOwner.eIsProxy()) {
			InternalEObject oldButtonOwner = (InternalEObject)buttonOwner;
			buttonOwner = (Button)eResolveProxy(oldButtonOwner);
			if (buttonOwner != oldButtonOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACTION__BUTTON_OWNER, oldButtonOwner, buttonOwner));
			}
		}
		return buttonOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button basicGetButtonOwner() {
		return buttonOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetButtonOwner(Button newButtonOwner, NotificationChain msgs) {
		Button oldButtonOwner = buttonOwner;
		buttonOwner = newButtonOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTION__BUTTON_OWNER, oldButtonOwner, newButtonOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButtonOwner(Button newButtonOwner) {
		if (newButtonOwner != buttonOwner) {
			NotificationChain msgs = null;
			if (buttonOwner != null)
				msgs = ((InternalEObject)buttonOwner).eInverseRemove(this, AndroidPackage.BUTTON__TRIGGERS, Button.class, msgs);
			if (newButtonOwner != null)
				msgs = ((InternalEObject)newButtonOwner).eInverseAdd(this, AndroidPackage.BUTTON__TRIGGERS, Button.class, msgs);
			msgs = basicSetButtonOwner(newButtonOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTION__BUTTON_OWNER, newButtonOwner, newButtonOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog getShows() {
		if (shows != null && shows.eIsProxy()) {
			InternalEObject oldShows = (InternalEObject)shows;
			shows = (Dialog)eResolveProxy(oldShows);
			if (shows != oldShows) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACTION__SHOWS, oldShows, shows));
			}
		}
		return shows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog basicGetShows() {
		return shows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShows(Dialog newShows, NotificationChain msgs) {
		Dialog oldShows = shows;
		shows = newShows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTION__SHOWS, oldShows, newShows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShows(Dialog newShows) {
		if (newShows != shows) {
			NotificationChain msgs = null;
			if (shows != null)
				msgs = ((InternalEObject)shows).eInverseRemove(this, AndroidPackage.DIALOG__ACTION_OWNER, Dialog.class, msgs);
			if (newShows != null)
				msgs = ((InternalEObject)newShows).eInverseAdd(this, AndroidPackage.DIALOG__ACTION_OWNER, Dialog.class, msgs);
			msgs = basicSetShows(newShows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTION__SHOWS, newShows, newShows));
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
			case AndroidPackage.ACTION__BUTTON_OWNER:
				if (buttonOwner != null)
					msgs = ((InternalEObject)buttonOwner).eInverseRemove(this, AndroidPackage.BUTTON__TRIGGERS, Button.class, msgs);
				return basicSetButtonOwner((Button)otherEnd, msgs);
			case AndroidPackage.ACTION__SHOWS:
				if (shows != null)
					msgs = ((InternalEObject)shows).eInverseRemove(this, AndroidPackage.DIALOG__ACTION_OWNER, Dialog.class, msgs);
				return basicSetShows((Dialog)otherEnd, msgs);
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
			case AndroidPackage.ACTION__BUTTON_OWNER:
				return basicSetButtonOwner(null, msgs);
			case AndroidPackage.ACTION__SHOWS:
				return basicSetShows(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidPackage.ACTION__TYPE:
				return getType();
			case AndroidPackage.ACTION__BUTTON_OWNER:
				if (resolve) return getButtonOwner();
				return basicGetButtonOwner();
			case AndroidPackage.ACTION__SHOWS:
				if (resolve) return getShows();
				return basicGetShows();
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
			case AndroidPackage.ACTION__TYPE:
				setType((ActionType)newValue);
				return;
			case AndroidPackage.ACTION__BUTTON_OWNER:
				setButtonOwner((Button)newValue);
				return;
			case AndroidPackage.ACTION__SHOWS:
				setShows((Dialog)newValue);
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
			case AndroidPackage.ACTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AndroidPackage.ACTION__BUTTON_OWNER:
				setButtonOwner((Button)null);
				return;
			case AndroidPackage.ACTION__SHOWS:
				setShows((Dialog)null);
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
			case AndroidPackage.ACTION__TYPE:
				return type != TYPE_EDEFAULT;
			case AndroidPackage.ACTION__BUTTON_OWNER:
				return buttonOwner != null;
			case AndroidPackage.ACTION__SHOWS:
				return shows != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
