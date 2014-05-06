/**
 */
package Android.impl;

import Android.AndroidPackage;
import Android.Aplicacion;
import Android.permiso;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>permiso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.permisoImpl#getDaPermisoA <em>Da Permiso A</em>}</li>
 *   <li>{@link Android.impl.permisoImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class permisoImpl extends MinimalEObjectImpl.Container implements permiso {
	/**
	 * The cached value of the '{@link #getDaPermisoA() <em>Da Permiso A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaPermisoA()
	 * @generated
	 * @ordered
	 */
	protected Aplicacion daPermisoA;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected permiso nombre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected permisoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.PERMISO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion getDaPermisoA() {
		if (daPermisoA != null && daPermisoA.eIsProxy()) {
			InternalEObject oldDaPermisoA = (InternalEObject)daPermisoA;
			daPermisoA = (Aplicacion)eResolveProxy(oldDaPermisoA);
			if (daPermisoA != oldDaPermisoA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.PERMISO__DA_PERMISO_A, oldDaPermisoA, daPermisoA));
			}
		}
		return daPermisoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion basicGetDaPermisoA() {
		return daPermisoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaPermisoA(Aplicacion newDaPermisoA) {
		Aplicacion oldDaPermisoA = daPermisoA;
		daPermisoA = newDaPermisoA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.PERMISO__DA_PERMISO_A, oldDaPermisoA, daPermisoA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public permiso getNombre() {
		if (nombre != null && nombre.eIsProxy()) {
			InternalEObject oldNombre = (InternalEObject)nombre;
			nombre = (permiso)eResolveProxy(oldNombre);
			if (nombre != oldNombre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.PERMISO__NOMBRE, oldNombre, nombre));
			}
		}
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public permiso basicGetNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(permiso newNombre) {
		permiso oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.PERMISO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidPackage.PERMISO__DA_PERMISO_A:
				if (resolve) return getDaPermisoA();
				return basicGetDaPermisoA();
			case AndroidPackage.PERMISO__NOMBRE:
				if (resolve) return getNombre();
				return basicGetNombre();
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
			case AndroidPackage.PERMISO__DA_PERMISO_A:
				setDaPermisoA((Aplicacion)newValue);
				return;
			case AndroidPackage.PERMISO__NOMBRE:
				setNombre((permiso)newValue);
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
			case AndroidPackage.PERMISO__DA_PERMISO_A:
				setDaPermisoA((Aplicacion)null);
				return;
			case AndroidPackage.PERMISO__NOMBRE:
				setNombre((permiso)null);
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
			case AndroidPackage.PERMISO__DA_PERMISO_A:
				return daPermisoA != null;
			case AndroidPackage.PERMISO__NOMBRE:
				return nombre != null;
		}
		return super.eIsSet(featureID);
	}

} //permisoImpl
