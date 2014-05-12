/**
 */
package Android.impl;

import Android.Activity;
import Android.AndroidPackage;
import Android.Aplicacion;
import Android.Controlador;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.ActivityImpl#getApp <em>App</em>}</li>
 *   <li>{@link Android.impl.ActivityImpl#getControla <em>Controla</em>}</li>
 *   <li>{@link Android.impl.ActivityImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Android.impl.ActivityImpl#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Android.impl.ActivityImpl#isIsmain <em>Ismain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The cached value of the '{@link #getControla() <em>Controla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControla()
	 * @generated
	 * @ordered
	 */
	protected Controlador controla;

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
	 * The default value of the '{@link #getPaquete() <em>Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaquete()
	 * @generated
	 * @ordered
	 */
	protected static final String PAQUETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaquete() <em>Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaquete()
	 * @generated
	 * @ordered
	 */
	protected String paquete = PAQUETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsmain() <em>Ismain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsmain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISMAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsmain() <em>Ismain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsmain()
	 * @generated
	 * @ordered
	 */
	protected boolean ismain = ISMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion getApp() {
		if (eContainerFeatureID() != AndroidPackage.ACTIVITY__APP) return null;
		return (Aplicacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp(Aplicacion newApp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApp, AndroidPackage.ACTIVITY__APP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(Aplicacion newApp) {
		if (newApp != eInternalContainer() || (eContainerFeatureID() != AndroidPackage.ACTIVITY__APP && newApp != null)) {
			if (EcoreUtil.isAncestor(this, newApp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApp != null)
				msgs = ((InternalEObject)newApp).eInverseAdd(this, AndroidPackage.APLICACION__ACTIVIDADES, Aplicacion.class, msgs);
			msgs = basicSetApp(newApp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__APP, newApp, newApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlador getControla() {
		if (controla != null && controla.eIsProxy()) {
			InternalEObject oldControla = (InternalEObject)controla;
			controla = (Controlador)eResolveProxy(oldControla);
			if (controla != oldControla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACTIVITY__CONTROLA, oldControla, controla));
			}
		}
		return controla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlador basicGetControla() {
		return controla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControla(Controlador newControla, NotificationChain msgs) {
		Controlador oldControla = controla;
		controla = newControla;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__CONTROLA, oldControla, newControla);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControla(Controlador newControla) {
		if (newControla != controla) {
			NotificationChain msgs = null;
			if (controla != null)
				msgs = ((InternalEObject)controla).eInverseRemove(this, AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR, Controlador.class, msgs);
			if (newControla != null)
				msgs = ((InternalEObject)newControla).eInverseAdd(this, AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR, Controlador.class, msgs);
			msgs = basicSetControla(newControla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__CONTROLA, newControla, newControla));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaquete() {
		return paquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaquete(String newPaquete) {
		String oldPaquete = paquete;
		paquete = newPaquete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__PAQUETE, oldPaquete, paquete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsmain() {
		return ismain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsmain(boolean newIsmain) {
		boolean oldIsmain = ismain;
		ismain = newIsmain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__ISMAIN, oldIsmain, ismain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.ACTIVITY__APP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApp((Aplicacion)otherEnd, msgs);
			case AndroidPackage.ACTIVITY__CONTROLA:
				if (controla != null)
					msgs = ((InternalEObject)controla).eInverseRemove(this, AndroidPackage.CONTROLADOR__ES_CONTROLADA_POR, Controlador.class, msgs);
				return basicSetControla((Controlador)otherEnd, msgs);
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
			case AndroidPackage.ACTIVITY__APP:
				return basicSetApp(null, msgs);
			case AndroidPackage.ACTIVITY__CONTROLA:
				return basicSetControla(null, msgs);
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
			case AndroidPackage.ACTIVITY__APP:
				return eInternalContainer().eInverseRemove(this, AndroidPackage.APLICACION__ACTIVIDADES, Aplicacion.class, msgs);
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
			case AndroidPackage.ACTIVITY__APP:
				return getApp();
			case AndroidPackage.ACTIVITY__CONTROLA:
				if (resolve) return getControla();
				return basicGetControla();
			case AndroidPackage.ACTIVITY__NOMBRE:
				return getNombre();
			case AndroidPackage.ACTIVITY__PAQUETE:
				return getPaquete();
			case AndroidPackage.ACTIVITY__ISMAIN:
				return isIsmain();
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
			case AndroidPackage.ACTIVITY__APP:
				setApp((Aplicacion)newValue);
				return;
			case AndroidPackage.ACTIVITY__CONTROLA:
				setControla((Controlador)newValue);
				return;
			case AndroidPackage.ACTIVITY__NOMBRE:
				setNombre((String)newValue);
				return;
			case AndroidPackage.ACTIVITY__PAQUETE:
				setPaquete((String)newValue);
				return;
			case AndroidPackage.ACTIVITY__ISMAIN:
				setIsmain((Boolean)newValue);
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
			case AndroidPackage.ACTIVITY__APP:
				setApp((Aplicacion)null);
				return;
			case AndroidPackage.ACTIVITY__CONTROLA:
				setControla((Controlador)null);
				return;
			case AndroidPackage.ACTIVITY__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AndroidPackage.ACTIVITY__PAQUETE:
				setPaquete(PAQUETE_EDEFAULT);
				return;
			case AndroidPackage.ACTIVITY__ISMAIN:
				setIsmain(ISMAIN_EDEFAULT);
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
			case AndroidPackage.ACTIVITY__APP:
				return getApp() != null;
			case AndroidPackage.ACTIVITY__CONTROLA:
				return controla != null;
			case AndroidPackage.ACTIVITY__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AndroidPackage.ACTIVITY__PAQUETE:
				return PAQUETE_EDEFAULT == null ? paquete != null : !PAQUETE_EDEFAULT.equals(paquete);
			case AndroidPackage.ACTIVITY__ISMAIN:
				return ismain != ISMAIN_EDEFAULT;
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
		result.append(", paquete: ");
		result.append(paquete);
		result.append(", ismain: ");
		result.append(ismain);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
