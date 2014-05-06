/**
 */
package Android.impl;

import Android.Activity;
import Android.AndroidPackage;
import Android.Aplicacion;
import Android.Layout;
import Android.tipo_permiso;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.AplicacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getActividades <em>Actividades</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getPermiso <em>Permiso</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getMinSDK <em>Min SDK</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getTargetSDK <em>Target SDK</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link Android.impl.AplicacionImpl#getVersionName <em>Version Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AplicacionImpl extends MinimalEObjectImpl.Container implements Aplicacion {
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
	 * The cached value of the '{@link #getActividades() <em>Actividades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActividades()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> actividades;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> layout;

	/**
	 * The cached value of the '{@link #getPermiso() <em>Permiso</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermiso()
	 * @generated
	 * @ordered
	 */
	protected EList<tipo_permiso> permiso;

	/**
	 * The default value of the '{@link #getMinSDK() <em>Min SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSDK()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_SDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinSDK() <em>Min SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSDK()
	 * @generated
	 * @ordered
	 */
	protected Integer minSDK = MIN_SDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSDK() <em>Target SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSDK()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_SDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSDK() <em>Target SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSDK()
	 * @generated
	 * @ordered
	 */
	protected Integer targetSDK = TARGET_SDK_EDEFAULT;

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
	 * The default value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERSION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected Integer versionCode = VERSION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionName()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionName()
	 * @generated
	 * @ordered
	 */
	protected String versionName = VERSION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.APLICACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActividades() {
		if (actividades == null) {
			actividades = new EObjectContainmentWithInverseEList<Activity>(Activity.class, this, AndroidPackage.APLICACION__ACTIVIDADES, AndroidPackage.ACTIVITY__APP);
		}
		return actividades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getLayout() {
		if (layout == null) {
			layout = new EObjectContainmentWithInverseEList<Layout>(Layout.class, this, AndroidPackage.APLICACION__LAYOUT, AndroidPackage.LAYOUT__PERTENECE_AAPP);
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tipo_permiso> getPermiso() {
		if (permiso == null) {
			permiso = new EDataTypeUniqueEList<tipo_permiso>(tipo_permiso.class, this, AndroidPackage.APLICACION__PERMISO);
		}
		return permiso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinSDK() {
		return minSDK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSDK(Integer newMinSDK) {
		Integer oldMinSDK = minSDK;
		minSDK = newMinSDK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICACION__MIN_SDK, oldMinSDK, minSDK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetSDK() {
		return targetSDK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSDK(Integer newTargetSDK) {
		Integer oldTargetSDK = targetSDK;
		targetSDK = newTargetSDK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICACION__TARGET_SDK, oldTargetSDK, targetSDK));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICACION__PAQUETE, oldPaquete, paquete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVersionCode() {
		return versionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionCode(Integer newVersionCode) {
		Integer oldVersionCode = versionCode;
		versionCode = newVersionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICACION__VERSION_CODE, oldVersionCode, versionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionName(String newVersionName) {
		String oldVersionName = versionName;
		versionName = newVersionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICACION__VERSION_NAME, oldVersionName, versionName));
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
			case AndroidPackage.APLICACION__ACTIVIDADES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActividades()).basicAdd(otherEnd, msgs);
			case AndroidPackage.APLICACION__LAYOUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayout()).basicAdd(otherEnd, msgs);
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
			case AndroidPackage.APLICACION__ACTIVIDADES:
				return ((InternalEList<?>)getActividades()).basicRemove(otherEnd, msgs);
			case AndroidPackage.APLICACION__LAYOUT:
				return ((InternalEList<?>)getLayout()).basicRemove(otherEnd, msgs);
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
			case AndroidPackage.APLICACION__NOMBRE:
				return getNombre();
			case AndroidPackage.APLICACION__ACTIVIDADES:
				return getActividades();
			case AndroidPackage.APLICACION__LAYOUT:
				return getLayout();
			case AndroidPackage.APLICACION__PERMISO:
				return getPermiso();
			case AndroidPackage.APLICACION__MIN_SDK:
				return getMinSDK();
			case AndroidPackage.APLICACION__TARGET_SDK:
				return getTargetSDK();
			case AndroidPackage.APLICACION__PAQUETE:
				return getPaquete();
			case AndroidPackage.APLICACION__VERSION_CODE:
				return getVersionCode();
			case AndroidPackage.APLICACION__VERSION_NAME:
				return getVersionName();
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
			case AndroidPackage.APLICACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case AndroidPackage.APLICACION__ACTIVIDADES:
				getActividades().clear();
				getActividades().addAll((Collection<? extends Activity>)newValue);
				return;
			case AndroidPackage.APLICACION__LAYOUT:
				getLayout().clear();
				getLayout().addAll((Collection<? extends Layout>)newValue);
				return;
			case AndroidPackage.APLICACION__PERMISO:
				getPermiso().clear();
				getPermiso().addAll((Collection<? extends tipo_permiso>)newValue);
				return;
			case AndroidPackage.APLICACION__MIN_SDK:
				setMinSDK((Integer)newValue);
				return;
			case AndroidPackage.APLICACION__TARGET_SDK:
				setTargetSDK((Integer)newValue);
				return;
			case AndroidPackage.APLICACION__PAQUETE:
				setPaquete((String)newValue);
				return;
			case AndroidPackage.APLICACION__VERSION_CODE:
				setVersionCode((Integer)newValue);
				return;
			case AndroidPackage.APLICACION__VERSION_NAME:
				setVersionName((String)newValue);
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
			case AndroidPackage.APLICACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AndroidPackage.APLICACION__ACTIVIDADES:
				getActividades().clear();
				return;
			case AndroidPackage.APLICACION__LAYOUT:
				getLayout().clear();
				return;
			case AndroidPackage.APLICACION__PERMISO:
				getPermiso().clear();
				return;
			case AndroidPackage.APLICACION__MIN_SDK:
				setMinSDK(MIN_SDK_EDEFAULT);
				return;
			case AndroidPackage.APLICACION__TARGET_SDK:
				setTargetSDK(TARGET_SDK_EDEFAULT);
				return;
			case AndroidPackage.APLICACION__PAQUETE:
				setPaquete(PAQUETE_EDEFAULT);
				return;
			case AndroidPackage.APLICACION__VERSION_CODE:
				setVersionCode(VERSION_CODE_EDEFAULT);
				return;
			case AndroidPackage.APLICACION__VERSION_NAME:
				setVersionName(VERSION_NAME_EDEFAULT);
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
			case AndroidPackage.APLICACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AndroidPackage.APLICACION__ACTIVIDADES:
				return actividades != null && !actividades.isEmpty();
			case AndroidPackage.APLICACION__LAYOUT:
				return layout != null && !layout.isEmpty();
			case AndroidPackage.APLICACION__PERMISO:
				return permiso != null && !permiso.isEmpty();
			case AndroidPackage.APLICACION__MIN_SDK:
				return MIN_SDK_EDEFAULT == null ? minSDK != null : !MIN_SDK_EDEFAULT.equals(minSDK);
			case AndroidPackage.APLICACION__TARGET_SDK:
				return TARGET_SDK_EDEFAULT == null ? targetSDK != null : !TARGET_SDK_EDEFAULT.equals(targetSDK);
			case AndroidPackage.APLICACION__PAQUETE:
				return PAQUETE_EDEFAULT == null ? paquete != null : !PAQUETE_EDEFAULT.equals(paquete);
			case AndroidPackage.APLICACION__VERSION_CODE:
				return VERSION_CODE_EDEFAULT == null ? versionCode != null : !VERSION_CODE_EDEFAULT.equals(versionCode);
			case AndroidPackage.APLICACION__VERSION_NAME:
				return VERSION_NAME_EDEFAULT == null ? versionName != null : !VERSION_NAME_EDEFAULT.equals(versionName);
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
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(", permiso: ");
		result.append(permiso);
		result.append(", minSDK: ");
		result.append(minSDK);
		result.append(", targetSDK: ");
		result.append(targetSDK);
		result.append(", paquete: ");
		result.append(paquete);
		result.append(", versionCode: ");
		result.append(versionCode);
		result.append(", versionName: ");
		result.append(versionName);
		result.append(')');
		return result.toString();
	}

} //AplicacionImpl
