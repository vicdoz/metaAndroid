/**
 */
package mandroid.impl;

import mandroid.Action;
import mandroid.Button;
import mandroid.MandroidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mandroid.impl.ButtonImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends WidgetImpl implements Button {
	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected Action triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MandroidPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getTriggers() {
		if (triggers != null && triggers.eIsProxy()) {
			InternalEObject oldTriggers = (InternalEObject)triggers;
			triggers = (Action)eResolveProxy(oldTriggers);
			if (triggers != oldTriggers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MandroidPackage.BUTTON__TRIGGERS, oldTriggers, triggers));
			}
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetTriggers() {
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggers(Action newTriggers) {
		Action oldTriggers = triggers;
		triggers = newTriggers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.BUTTON__TRIGGERS, oldTriggers, triggers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MandroidPackage.BUTTON__TRIGGERS:
				if (resolve) return getTriggers();
				return basicGetTriggers();
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
			case MandroidPackage.BUTTON__TRIGGERS:
				setTriggers((Action)newValue);
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
			case MandroidPackage.BUTTON__TRIGGERS:
				setTriggers((Action)null);
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
			case MandroidPackage.BUTTON__TRIGGERS:
				return triggers != null;
		}
		return super.eIsSet(featureID);
	}

} //ButtonImpl
