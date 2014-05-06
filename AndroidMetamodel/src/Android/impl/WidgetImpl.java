/**
 */
package Android.impl;

import Android.AndroidPackage;
import Android.Controlador;
import Android.Layout;
import Android.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.WidgetImpl#getPerteneceAlayout <em>Pertenece Alayout</em>}</li>
 *   <li>{@link Android.impl.WidgetImpl#getEsControladoPor <em>Es Controlado Por</em>}</li>
 *   <li>{@link Android.impl.WidgetImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget {
	/**
	 * The cached value of the '{@link #getPerteneceAlayout() <em>Pertenece Alayout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerteneceAlayout()
	 * @generated
	 * @ordered
	 */
	protected Layout perteneceAlayout;

	/**
	 * The cached value of the '{@link #getEsControladoPor() <em>Es Controlado Por</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsControladoPor()
	 * @generated
	 * @ordered
	 */
	protected EList<Controlador> esControladoPor;

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
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getPerteneceAlayout() {
		if (perteneceAlayout != null && perteneceAlayout.eIsProxy()) {
			InternalEObject oldPerteneceAlayout = (InternalEObject)perteneceAlayout;
			perteneceAlayout = (Layout)eResolveProxy(oldPerteneceAlayout);
			if (perteneceAlayout != oldPerteneceAlayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.WIDGET__PERTENECE_ALAYOUT, oldPerteneceAlayout, perteneceAlayout));
			}
		}
		return perteneceAlayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetPerteneceAlayout() {
		return perteneceAlayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerteneceAlayout(Layout newPerteneceAlayout, NotificationChain msgs) {
		Layout oldPerteneceAlayout = perteneceAlayout;
		perteneceAlayout = newPerteneceAlayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.WIDGET__PERTENECE_ALAYOUT, oldPerteneceAlayout, newPerteneceAlayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerteneceAlayout(Layout newPerteneceAlayout) {
		if (newPerteneceAlayout != perteneceAlayout) {
			NotificationChain msgs = null;
			if (perteneceAlayout != null)
				msgs = ((InternalEObject)perteneceAlayout).eInverseRemove(this, AndroidPackage.LAYOUT__WIDGET, Layout.class, msgs);
			if (newPerteneceAlayout != null)
				msgs = ((InternalEObject)newPerteneceAlayout).eInverseAdd(this, AndroidPackage.LAYOUT__WIDGET, Layout.class, msgs);
			msgs = basicSetPerteneceAlayout(newPerteneceAlayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.WIDGET__PERTENECE_ALAYOUT, newPerteneceAlayout, newPerteneceAlayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controlador> getEsControladoPor() {
		if (esControladoPor == null) {
			esControladoPor = new EObjectWithInverseResolvingEList<Controlador>(Controlador.class, this, AndroidPackage.WIDGET__ES_CONTROLADO_POR, AndroidPackage.CONTROLADOR__MANEJA_WIDGET);
		}
		return esControladoPor;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.WIDGET__ID, oldId, id));
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
			case AndroidPackage.WIDGET__PERTENECE_ALAYOUT:
				if (perteneceAlayout != null)
					msgs = ((InternalEObject)perteneceAlayout).eInverseRemove(this, AndroidPackage.LAYOUT__WIDGET, Layout.class, msgs);
				return basicSetPerteneceAlayout((Layout)otherEnd, msgs);
			case AndroidPackage.WIDGET__ES_CONTROLADO_POR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsControladoPor()).basicAdd(otherEnd, msgs);
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
			case AndroidPackage.WIDGET__PERTENECE_ALAYOUT:
				return basicSetPerteneceAlayout(null, msgs);
			case AndroidPackage.WIDGET__ES_CONTROLADO_POR:
				return ((InternalEList<?>)getEsControladoPor()).basicRemove(otherEnd, msgs);
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
			case AndroidPackage.WIDGET__PERTENECE_ALAYOUT:
				if (resolve) return getPerteneceAlayout();
				return basicGetPerteneceAlayout();
			case AndroidPackage.WIDGET__ES_CONTROLADO_POR:
				return getEsControladoPor();
			case AndroidPackage.WIDGET__ID:
				return getId();
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
			case AndroidPackage.WIDGET__PERTENECE_ALAYOUT:
				setPerteneceAlayout((Layout)newValue);
				return;
			case AndroidPackage.WIDGET__ES_CONTROLADO_POR:
				getEsControladoPor().clear();
				getEsControladoPor().addAll((Collection<? extends Controlador>)newValue);
				return;
			case AndroidPackage.WIDGET__ID:
				setId((String)newValue);
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
			case AndroidPackage.WIDGET__PERTENECE_ALAYOUT:
				setPerteneceAlayout((Layout)null);
				return;
			case AndroidPackage.WIDGET__ES_CONTROLADO_POR:
				getEsControladoPor().clear();
				return;
			case AndroidPackage.WIDGET__ID:
				setId(ID_EDEFAULT);
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
			case AndroidPackage.WIDGET__PERTENECE_ALAYOUT:
				return perteneceAlayout != null;
			case AndroidPackage.WIDGET__ES_CONTROLADO_POR:
				return esControladoPor != null && !esControladoPor.isEmpty();
			case AndroidPackage.WIDGET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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

} //WidgetImpl
