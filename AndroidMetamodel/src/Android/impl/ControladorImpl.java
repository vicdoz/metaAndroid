/**
 */
package Android.impl;

import Android.Activity;
import Android.AndroidPackage;
import Android.Controlador;
import Android.Widget;
import Android.accion;

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
 * An implementation of the model object '<em><b>Controlador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.ControladorImpl#getEsControladaPor <em>Es Controlada Por</em>}</li>
 *   <li>{@link Android.impl.ControladorImpl#getManejaWidget <em>Maneja Widget</em>}</li>
 *   <li>{@link Android.impl.ControladorImpl#getHaceAccion <em>Hace Accion</em>}</li>
 *   <li>{@link Android.impl.ControladorImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControladorImpl extends MinimalEObjectImpl.Container implements Controlador {
	/**
	 * The cached value of the '{@link #getEsControladaPor() <em>Es Controlada Por</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsControladaPor()
	 * @generated
	 * @ordered
	 */
	protected Activity esControladaPor;

	/**
	 * The cached value of the '{@link #getManejaWidget() <em>Maneja Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManejaWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget manejaWidget;

	/**
	 * The cached value of the '{@link #getHaceAccion() <em>Hace Accion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaceAccion()
	 * @generated
	 * @ordered
	 */
	protected EList<accion> haceAccion;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControladorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.CONTROLADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getEsControladaPor() {
		if (esControladaPor != null && esControladaPor.eIsProxy()) {
			InternalEObject oldEsControladaPor = (InternalEObject)esControladaPor;
			esControladaPor = (Activity)eResolveProxy(oldEsControladaPor);
			if (esControladaPor != oldEsControladaPor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR, oldEsControladaPor, esControladaPor));
			}
		}
		return esControladaPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetEsControladaPor() {
		return esControladaPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEsControladaPor(Activity newEsControladaPor, NotificationChain msgs) {
		Activity oldEsControladaPor = esControladaPor;
		esControladaPor = newEsControladaPor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR, oldEsControladaPor, newEsControladaPor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsControladaPor(Activity newEsControladaPor) {
		if (newEsControladaPor != esControladaPor) {
			NotificationChain msgs = null;
			if (esControladaPor != null)
				msgs = ((InternalEObject)esControladaPor).eInverseRemove(this, AndroidPackage.ACTIVITY__CONTROLA, Activity.class, msgs);
			if (newEsControladaPor != null)
				msgs = ((InternalEObject)newEsControladaPor).eInverseAdd(this, AndroidPackage.ACTIVITY__CONTROLA, Activity.class, msgs);
			msgs = basicSetEsControladaPor(newEsControladaPor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR, newEsControladaPor, newEsControladaPor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget getManejaWidget() {
		if (manejaWidget != null && manejaWidget.eIsProxy()) {
			InternalEObject oldManejaWidget = (InternalEObject)manejaWidget;
			manejaWidget = (Widget)eResolveProxy(oldManejaWidget);
			if (manejaWidget != oldManejaWidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.CONTROLADOR__MANEJA_WIDGET, oldManejaWidget, manejaWidget));
			}
		}
		return manejaWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget basicGetManejaWidget() {
		return manejaWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManejaWidget(Widget newManejaWidget, NotificationChain msgs) {
		Widget oldManejaWidget = manejaWidget;
		manejaWidget = newManejaWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.CONTROLADOR__MANEJA_WIDGET, oldManejaWidget, newManejaWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManejaWidget(Widget newManejaWidget) {
		if (newManejaWidget != manejaWidget) {
			NotificationChain msgs = null;
			if (manejaWidget != null)
				msgs = ((InternalEObject)manejaWidget).eInverseRemove(this, AndroidPackage.WIDGET__ES_CONTROLADO_POR, Widget.class, msgs);
			if (newManejaWidget != null)
				msgs = ((InternalEObject)newManejaWidget).eInverseAdd(this, AndroidPackage.WIDGET__ES_CONTROLADO_POR, Widget.class, msgs);
			msgs = basicSetManejaWidget(newManejaWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.CONTROLADOR__MANEJA_WIDGET, newManejaWidget, newManejaWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<accion> getHaceAccion() {
		if (haceAccion == null) {
			haceAccion = new EObjectWithInverseResolvingEList<accion>(accion.class, this, AndroidPackage.CONTROLADOR__HACE_ACCION, AndroidPackage.ACCION__PERTENECE_A);
		}
		return haceAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.CONTROLADOR__NOMBRE, oldNombre, nombre));
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
			case AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR:
				if (esControladaPor != null)
					msgs = ((InternalEObject)esControladaPor).eInverseRemove(this, AndroidPackage.ACTIVITY__CONTROLA, Activity.class, msgs);
				return basicSetEsControladaPor((Activity)otherEnd, msgs);
			case AndroidPackage.CONTROLADOR__MANEJA_WIDGET:
				if (manejaWidget != null)
					msgs = ((InternalEObject)manejaWidget).eInverseRemove(this, AndroidPackage.WIDGET__ES_CONTROLADO_POR, Widget.class, msgs);
				return basicSetManejaWidget((Widget)otherEnd, msgs);
			case AndroidPackage.CONTROLADOR__HACE_ACCION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHaceAccion()).basicAdd(otherEnd, msgs);
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
			case AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR:
				return basicSetEsControladaPor(null, msgs);
			case AndroidPackage.CONTROLADOR__MANEJA_WIDGET:
				return basicSetManejaWidget(null, msgs);
			case AndroidPackage.CONTROLADOR__HACE_ACCION:
				return ((InternalEList<?>)getHaceAccion()).basicRemove(otherEnd, msgs);
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
			case AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR:
				if (resolve) return getEsControladaPor();
				return basicGetEsControladaPor();
			case AndroidPackage.CONTROLADOR__MANEJA_WIDGET:
				if (resolve) return getManejaWidget();
				return basicGetManejaWidget();
			case AndroidPackage.CONTROLADOR__HACE_ACCION:
				return getHaceAccion();
			case AndroidPackage.CONTROLADOR__NOMBRE:
				return getNombre();
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
			case AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR:
				setEsControladaPor((Activity)newValue);
				return;
			case AndroidPackage.CONTROLADOR__MANEJA_WIDGET:
				setManejaWidget((Widget)newValue);
				return;
			case AndroidPackage.CONTROLADOR__HACE_ACCION:
				getHaceAccion().clear();
				getHaceAccion().addAll((Collection<? extends accion>)newValue);
				return;
			case AndroidPackage.CONTROLADOR__NOMBRE:
				setNombre((String)newValue);
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
			case AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR:
				setEsControladaPor((Activity)null);
				return;
			case AndroidPackage.CONTROLADOR__MANEJA_WIDGET:
				setManejaWidget((Widget)null);
				return;
			case AndroidPackage.CONTROLADOR__HACE_ACCION:
				getHaceAccion().clear();
				return;
			case AndroidPackage.CONTROLADOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR:
				return esControladaPor != null;
			case AndroidPackage.CONTROLADOR__MANEJA_WIDGET:
				return manejaWidget != null;
			case AndroidPackage.CONTROLADOR__HACE_ACCION:
				return haceAccion != null && !haceAccion.isEmpty();
			case AndroidPackage.CONTROLADOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ControladorImpl
