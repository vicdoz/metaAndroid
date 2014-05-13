/**
 */
package mandroid.impl;

import mandroid.Action;
import mandroid.Button;
import mandroid.Dialog;
import mandroid.MandroidPackage;
import mandroid.TypeAction;

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
 *   <li>{@link mandroid.impl.ActionImpl#getShows <em>Shows</em>}</li>
 *   <li>{@link mandroid.impl.ActionImpl#getButtonOwner <em>Button Owner</em>}</li>
 *   <li>{@link mandroid.impl.ActionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getShows() <em>Shows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShows()
	 * @generated
	 * @ordered
	 */
	protected Dialog shows;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAction TYPE_EDEFAULT = TypeAction.ALWAYS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeAction type = TYPE_EDEFAULT;

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
		return MandroidPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialog getShows() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MandroidPackage.ACTION__SHOWS, oldShows, newShows);
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
				msgs = ((InternalEObject)shows).eInverseRemove(this, MandroidPackage.DIALOG__ACTION_OWNER, Dialog.class, msgs);
			if (newShows != null)
				msgs = ((InternalEObject)newShows).eInverseAdd(this, MandroidPackage.DIALOG__ACTION_OWNER, Dialog.class, msgs);
			msgs = basicSetShows(newShows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.ACTION__SHOWS, newShows, newShows));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MandroidPackage.ACTION__BUTTON_OWNER, oldButtonOwner, buttonOwner));
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
	public void setButtonOwner(Button newButtonOwner) {
		Button oldButtonOwner = buttonOwner;
		buttonOwner = newButtonOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.ACTION__BUTTON_OWNER, oldButtonOwner, buttonOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAction getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeAction newType) {
		TypeAction oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MandroidPackage.ACTION__SHOWS:
				if (shows != null)
					msgs = ((InternalEObject)shows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MandroidPackage.ACTION__SHOWS, null, msgs);
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
			case MandroidPackage.ACTION__SHOWS:
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
			case MandroidPackage.ACTION__SHOWS:
				return getShows();
			case MandroidPackage.ACTION__BUTTON_OWNER:
				if (resolve) return getButtonOwner();
				return basicGetButtonOwner();
			case MandroidPackage.ACTION__TYPE:
				return getType();
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
			case MandroidPackage.ACTION__SHOWS:
				setShows((Dialog)newValue);
				return;
			case MandroidPackage.ACTION__BUTTON_OWNER:
				setButtonOwner((Button)newValue);
				return;
			case MandroidPackage.ACTION__TYPE:
				setType((TypeAction)newValue);
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
			case MandroidPackage.ACTION__SHOWS:
				setShows((Dialog)null);
				return;
			case MandroidPackage.ACTION__BUTTON_OWNER:
				setButtonOwner((Button)null);
				return;
			case MandroidPackage.ACTION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MandroidPackage.ACTION__SHOWS:
				return shows != null;
			case MandroidPackage.ACTION__BUTTON_OWNER:
				return buttonOwner != null;
			case MandroidPackage.ACTION__TYPE:
				return type != TYPE_EDEFAULT;
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
