/**
 */
package Android.impl;

import Android.AndroidPackage;
import Android.Dialogo;
import Android.accion;
import Android.duracionDialogo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialogo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.DialogoImpl#getEsMostradoEnUnaAccion <em>Es Mostrado En Una Accion</em>}</li>
 *   <li>{@link Android.impl.DialogoImpl#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link Android.impl.DialogoImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link Android.impl.DialogoImpl#getImagen <em>Imagen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogoImpl extends MinimalEObjectImpl.Container implements Dialogo {
	/**
	 * The cached value of the '{@link #getEsMostradoEnUnaAccion() <em>Es Mostrado En Una Accion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsMostradoEnUnaAccion()
	 * @generated
	 * @ordered
	 */
	protected accion esMostradoEnUnaAccion;

	/**
	 * The default value of the '{@link #getDuracion() <em>Duracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuracion()
	 * @generated
	 * @ordered
	 */
	protected static final duracionDialogo DURACION_EDEFAULT = duracionDialogo.SHORT;

	/**
	 * The cached value of the '{@link #getDuracion() <em>Duracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuracion()
	 * @generated
	 * @ordered
	 */
	protected duracionDialogo duracion = DURACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagen() <em>Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagen()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagen() <em>Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagen()
	 * @generated
	 * @ordered
	 */
	protected String imagen = IMAGEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.DIALOGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accion getEsMostradoEnUnaAccion() {
		if (esMostradoEnUnaAccion != null && esMostradoEnUnaAccion.eIsProxy()) {
			InternalEObject oldEsMostradoEnUnaAccion = (InternalEObject)esMostradoEnUnaAccion;
			esMostradoEnUnaAccion = (accion)eResolveProxy(oldEsMostradoEnUnaAccion);
			if (esMostradoEnUnaAccion != oldEsMostradoEnUnaAccion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION, oldEsMostradoEnUnaAccion, esMostradoEnUnaAccion));
			}
		}
		return esMostradoEnUnaAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accion basicGetEsMostradoEnUnaAccion() {
		return esMostradoEnUnaAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEsMostradoEnUnaAccion(accion newEsMostradoEnUnaAccion, NotificationChain msgs) {
		accion oldEsMostradoEnUnaAccion = esMostradoEnUnaAccion;
		esMostradoEnUnaAccion = newEsMostradoEnUnaAccion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION, oldEsMostradoEnUnaAccion, newEsMostradoEnUnaAccion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsMostradoEnUnaAccion(accion newEsMostradoEnUnaAccion) {
		if (newEsMostradoEnUnaAccion != esMostradoEnUnaAccion) {
			NotificationChain msgs = null;
			if (esMostradoEnUnaAccion != null)
				msgs = ((InternalEObject)esMostradoEnUnaAccion).eInverseRemove(this, AndroidPackage.ACCION__MUESTRA, accion.class, msgs);
			if (newEsMostradoEnUnaAccion != null)
				msgs = ((InternalEObject)newEsMostradoEnUnaAccion).eInverseAdd(this, AndroidPackage.ACCION__MUESTRA, accion.class, msgs);
			msgs = basicSetEsMostradoEnUnaAccion(newEsMostradoEnUnaAccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION, newEsMostradoEnUnaAccion, newEsMostradoEnUnaAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public duracionDialogo getDuracion() {
		return duracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuracion(duracionDialogo newDuracion) {
		duracionDialogo oldDuracion = duracion;
		duracion = newDuracion == null ? DURACION_EDEFAULT : newDuracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOGO__DURACION, oldDuracion, duracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOGO__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagen(String newImagen) {
		String oldImagen = imagen;
		imagen = newImagen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.DIALOGO__IMAGEN, oldImagen, imagen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION:
				if (esMostradoEnUnaAccion != null)
					msgs = ((InternalEObject)esMostradoEnUnaAccion).eInverseRemove(this, AndroidPackage.ACCION__MUESTRA, accion.class, msgs);
				return basicSetEsMostradoEnUnaAccion((accion)otherEnd, msgs);
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
			case AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION:
				return basicSetEsMostradoEnUnaAccion(null, msgs);
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
			case AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION:
				if (resolve) return getEsMostradoEnUnaAccion();
				return basicGetEsMostradoEnUnaAccion();
			case AndroidPackage.DIALOGO__DURACION:
				return getDuracion();
			case AndroidPackage.DIALOGO__TEXTO:
				return getTexto();
			case AndroidPackage.DIALOGO__IMAGEN:
				return getImagen();
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
			case AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION:
				setEsMostradoEnUnaAccion((accion)newValue);
				return;
			case AndroidPackage.DIALOGO__DURACION:
				setDuracion((duracionDialogo)newValue);
				return;
			case AndroidPackage.DIALOGO__TEXTO:
				setTexto((String)newValue);
				return;
			case AndroidPackage.DIALOGO__IMAGEN:
				setImagen((String)newValue);
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
			case AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION:
				setEsMostradoEnUnaAccion((accion)null);
				return;
			case AndroidPackage.DIALOGO__DURACION:
				setDuracion(DURACION_EDEFAULT);
				return;
			case AndroidPackage.DIALOGO__TEXTO:
				setTexto(TEXTO_EDEFAULT);
				return;
			case AndroidPackage.DIALOGO__IMAGEN:
				setImagen(IMAGEN_EDEFAULT);
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
			case AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION:
				return esMostradoEnUnaAccion != null;
			case AndroidPackage.DIALOGO__DURACION:
				return duracion != DURACION_EDEFAULT;
			case AndroidPackage.DIALOGO__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
			case AndroidPackage.DIALOGO__IMAGEN:
				return IMAGEN_EDEFAULT == null ? imagen != null : !IMAGEN_EDEFAULT.equals(imagen);
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
		result.append(" (Duracion: ");
		result.append(duracion);
		result.append(", Texto: ");
		result.append(texto);
		result.append(", Imagen: ");
		result.append(imagen);
		result.append(')');
		return result.toString();
	}

} //DialogoImpl
