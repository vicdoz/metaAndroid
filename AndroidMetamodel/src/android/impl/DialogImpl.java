/**
 */
package android.impl;

import android.Action;
import android.AndroidPackage;
import android.Dialog;
import android.Length;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.DialogImpl#getTime <em>Time</em>}</li>
 *   <li>{@link android.impl.DialogImpl#getText <em>Text</em>}</li>
 *   <li>{@link android.impl.DialogImpl#getActionOwner <em>Action Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogImpl extends MinimalEObjectImpl.Container implements Dialog {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Length TIME_EDEFAULT = Length.LONG;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Length time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActionOwner() <em>Action Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionOwner()
	 * @generated
	 * @ordered
	 */
	protected Action actionOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.DIALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Length newTime) {
		Length oldTime = time;
		time = newTime == null ? TIME_EDEFAULT : newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOG__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOG__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionOwner() {
		if (actionOwner != null && actionOwner.eIsProxy()) {
			InternalEObject oldActionOwner = (InternalEObject)actionOwner;
			actionOwner = (Action)eResolveProxy(oldActionOwner);
			if (actionOwner != oldActionOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.DIALOG__ACTION_OWNER, oldActionOwner, actionOwner));
			}
		}
		return actionOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetActionOwner() {
		return actionOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionOwner(Action newActionOwner, NotificationChain msgs) {
		Action oldActionOwner = actionOwner;
		actionOwner = newActionOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOG__ACTION_OWNER, oldActionOwner, newActionOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionOwner(Action newActionOwner) {
		if (newActionOwner != actionOwner) {
			NotificationChain msgs = null;
			if (actionOwner != null)
				msgs = ((InternalEObject)actionOwner).eInverseRemove(this, AndroidPackage.ACTION__SHOWS, Action.class, msgs);
			if (newActionOwner != null)
				msgs = ((InternalEObject)newActionOwner).eInverseAdd(this, AndroidPackage.ACTION__SHOWS, Action.class, msgs);
			msgs = basicSetActionOwner(newActionOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOG__ACTION_OWNER, newActionOwner, newActionOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.DIALOG__ACTION_OWNER:
				if (actionOwner != null)
					msgs = ((InternalEObject)actionOwner).eInverseRemove(this, AndroidPackage.ACTION__SHOWS, Action.class, msgs);
				return basicSetActionOwner((Action)otherEnd, msgs);
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
			case AndroidPackage.DIALOG__ACTION_OWNER:
				return basicSetActionOwner(null, msgs);
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
			case AndroidPackage.DIALOG__TIME:
				return getTime();
			case AndroidPackage.DIALOG__TEXT:
				return getText();
			case AndroidPackage.DIALOG__ACTION_OWNER:
				if (resolve) return getActionOwner();
				return basicGetActionOwner();
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
			case AndroidPackage.DIALOG__TIME:
				setTime((Length)newValue);
				return;
			case AndroidPackage.DIALOG__TEXT:
				setText((String)newValue);
				return;
			case AndroidPackage.DIALOG__ACTION_OWNER:
				setActionOwner((Action)newValue);
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
			case AndroidPackage.DIALOG__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case AndroidPackage.DIALOG__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case AndroidPackage.DIALOG__ACTION_OWNER:
				setActionOwner((Action)null);
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
			case AndroidPackage.DIALOG__TIME:
				return time != TIME_EDEFAULT;
			case AndroidPackage.DIALOG__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case AndroidPackage.DIALOG__ACTION_OWNER:
				return actionOwner != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //DialogImpl
