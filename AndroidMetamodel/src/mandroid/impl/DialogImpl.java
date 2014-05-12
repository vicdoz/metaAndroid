/**
 */
package mandroid.impl;

import mandroid.Action;
import mandroid.Dialog;
import mandroid.MandroidPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mandroid.impl.DialogImpl#getActionOwner <em>Action Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogImpl extends MinimalEObjectImpl.Container implements Dialog {
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
		return MandroidPackage.Literals.DIALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionOwner() {
		if (eContainerFeatureID() != MandroidPackage.DIALOG__ACTION_OWNER) return null;
		return (Action)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionOwner(Action newActionOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActionOwner, MandroidPackage.DIALOG__ACTION_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionOwner(Action newActionOwner) {
		if (newActionOwner != eInternalContainer() || (eContainerFeatureID() != MandroidPackage.DIALOG__ACTION_OWNER && newActionOwner != null)) {
			if (EcoreUtil.isAncestor(this, newActionOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActionOwner != null)
				msgs = ((InternalEObject)newActionOwner).eInverseAdd(this, MandroidPackage.ACTION__SHOWS, Action.class, msgs);
			msgs = basicSetActionOwner(newActionOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.DIALOG__ACTION_OWNER, newActionOwner, newActionOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MandroidPackage.DIALOG__ACTION_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case MandroidPackage.DIALOG__ACTION_OWNER:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MandroidPackage.DIALOG__ACTION_OWNER:
				return eInternalContainer().eInverseRemove(this, MandroidPackage.ACTION__SHOWS, Action.class, msgs);
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
			case MandroidPackage.DIALOG__ACTION_OWNER:
				return getActionOwner();
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
			case MandroidPackage.DIALOG__ACTION_OWNER:
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
			case MandroidPackage.DIALOG__ACTION_OWNER:
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
			case MandroidPackage.DIALOG__ACTION_OWNER:
				return getActionOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //DialogImpl
