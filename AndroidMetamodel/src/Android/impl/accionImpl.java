/**
 */
package Android.impl;

import Android.AndroidPackage;
import Android.Boton;
import Android.Controlador;
import Android.Dialogo;
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
 * An implementation of the model object '<em><b>accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.accionImpl#isClick <em>Click</em>}</li>
 *   <li>{@link Android.impl.accionImpl#isLongClick <em>Long Click</em>}</li>
 *   <li>{@link Android.impl.accionImpl#getPerteneceA <em>Pertenece A</em>}</li>
 *   <li>{@link Android.impl.accionImpl#getMuestra <em>Muestra</em>}</li>
 *   <li>{@link Android.impl.accionImpl#getEsAccionadoPor <em>Es Accionado Por</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class accionImpl extends MinimalEObjectImpl.Container implements accion {
	/**
	 * The default value of the '{@link #isClick() <em>Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClick()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLICK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClick() <em>Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClick()
	 * @generated
	 * @ordered
	 */
	protected boolean click = CLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #isLongClick() <em>Long Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLongClick()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LONG_CLICK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLongClick() <em>Long Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLongClick()
	 * @generated
	 * @ordered
	 */
	protected boolean longClick = LONG_CLICK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerteneceA() <em>Pertenece A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerteneceA()
	 * @generated
	 * @ordered
	 */
	protected Controlador perteneceA;

	/**
	 * The cached value of the '{@link #getMuestra() <em>Muestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuestra()
	 * @generated
	 * @ordered
	 */
	protected Dialogo muestra;

	/**
	 * The cached value of the '{@link #getEsAccionadoPor() <em>Es Accionado Por</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsAccionadoPor()
	 * @generated
	 * @ordered
	 */
	protected EList<Boton> esAccionadoPor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected accionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClick() {
		return click;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClick(boolean newClick) {
		boolean oldClick = click;
		click = newClick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACCION__CLICK, oldClick, click));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLongClick() {
		return longClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongClick(boolean newLongClick) {
		boolean oldLongClick = longClick;
		longClick = newLongClick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACCION__LONG_CLICK, oldLongClick, longClick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlador getPerteneceA() {
		if (perteneceA != null && perteneceA.eIsProxy()) {
			InternalEObject oldPerteneceA = (InternalEObject)perteneceA;
			perteneceA = (Controlador)eResolveProxy(oldPerteneceA);
			if (perteneceA != oldPerteneceA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACCION__PERTENECE_A, oldPerteneceA, perteneceA));
			}
		}
		return perteneceA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlador basicGetPerteneceA() {
		return perteneceA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerteneceA(Controlador newPerteneceA, NotificationChain msgs) {
		Controlador oldPerteneceA = perteneceA;
		perteneceA = newPerteneceA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACCION__PERTENECE_A, oldPerteneceA, newPerteneceA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerteneceA(Controlador newPerteneceA) {
		if (newPerteneceA != perteneceA) {
			NotificationChain msgs = null;
			if (perteneceA != null)
				msgs = ((InternalEObject)perteneceA).eInverseRemove(this, AndroidPackage.CONTROLADOR__HACE_ACCION, Controlador.class, msgs);
			if (newPerteneceA != null)
				msgs = ((InternalEObject)newPerteneceA).eInverseAdd(this, AndroidPackage.CONTROLADOR__HACE_ACCION, Controlador.class, msgs);
			msgs = basicSetPerteneceA(newPerteneceA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACCION__PERTENECE_A, newPerteneceA, newPerteneceA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogo getMuestra() {
		if (muestra != null && muestra.eIsProxy()) {
			InternalEObject oldMuestra = (InternalEObject)muestra;
			muestra = (Dialogo)eResolveProxy(oldMuestra);
			if (muestra != oldMuestra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACCION__MUESTRA, oldMuestra, muestra));
			}
		}
		return muestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogo basicGetMuestra() {
		return muestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMuestra(Dialogo newMuestra, NotificationChain msgs) {
		Dialogo oldMuestra = muestra;
		muestra = newMuestra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACCION__MUESTRA, oldMuestra, newMuestra);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuestra(Dialogo newMuestra) {
		if (newMuestra != muestra) {
			NotificationChain msgs = null;
			if (muestra != null)
				msgs = ((InternalEObject)muestra).eInverseRemove(this, AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION, Dialogo.class, msgs);
			if (newMuestra != null)
				msgs = ((InternalEObject)newMuestra).eInverseAdd(this, AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION, Dialogo.class, msgs);
			msgs = basicSetMuestra(newMuestra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACCION__MUESTRA, newMuestra, newMuestra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boton> getEsAccionadoPor() {
		if (esAccionadoPor == null) {
			esAccionadoPor = new EObjectWithInverseResolvingEList.ManyInverse<Boton>(Boton.class, this, AndroidPackage.ACCION__ES_ACCIONADO_POR, AndroidPackage.BOTON__ACCION);
		}
		return esAccionadoPor;
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
			case AndroidPackage.ACCION__PERTENECE_A:
				if (perteneceA != null)
					msgs = ((InternalEObject)perteneceA).eInverseRemove(this, AndroidPackage.CONTROLADOR__HACE_ACCION, Controlador.class, msgs);
				return basicSetPerteneceA((Controlador)otherEnd, msgs);
			case AndroidPackage.ACCION__MUESTRA:
				if (muestra != null)
					msgs = ((InternalEObject)muestra).eInverseRemove(this, AndroidPackage.DIALOGO__ES_MOSTRADO_EN_UNA_ACCION, Dialogo.class, msgs);
				return basicSetMuestra((Dialogo)otherEnd, msgs);
			case AndroidPackage.ACCION__ES_ACCIONADO_POR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsAccionadoPor()).basicAdd(otherEnd, msgs);
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
			case AndroidPackage.ACCION__PERTENECE_A:
				return basicSetPerteneceA(null, msgs);
			case AndroidPackage.ACCION__MUESTRA:
				return basicSetMuestra(null, msgs);
			case AndroidPackage.ACCION__ES_ACCIONADO_POR:
				return ((InternalEList<?>)getEsAccionadoPor()).basicRemove(otherEnd, msgs);
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
			case AndroidPackage.ACCION__CLICK:
				return isClick();
			case AndroidPackage.ACCION__LONG_CLICK:
				return isLongClick();
			case AndroidPackage.ACCION__PERTENECE_A:
				if (resolve) return getPerteneceA();
				return basicGetPerteneceA();
			case AndroidPackage.ACCION__MUESTRA:
				if (resolve) return getMuestra();
				return basicGetMuestra();
			case AndroidPackage.ACCION__ES_ACCIONADO_POR:
				return getEsAccionadoPor();
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
			case AndroidPackage.ACCION__CLICK:
				setClick((Boolean)newValue);
				return;
			case AndroidPackage.ACCION__LONG_CLICK:
				setLongClick((Boolean)newValue);
				return;
			case AndroidPackage.ACCION__PERTENECE_A:
				setPerteneceA((Controlador)newValue);
				return;
			case AndroidPackage.ACCION__MUESTRA:
				setMuestra((Dialogo)newValue);
				return;
			case AndroidPackage.ACCION__ES_ACCIONADO_POR:
				getEsAccionadoPor().clear();
				getEsAccionadoPor().addAll((Collection<? extends Boton>)newValue);
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
			case AndroidPackage.ACCION__CLICK:
				setClick(CLICK_EDEFAULT);
				return;
			case AndroidPackage.ACCION__LONG_CLICK:
				setLongClick(LONG_CLICK_EDEFAULT);
				return;
			case AndroidPackage.ACCION__PERTENECE_A:
				setPerteneceA((Controlador)null);
				return;
			case AndroidPackage.ACCION__MUESTRA:
				setMuestra((Dialogo)null);
				return;
			case AndroidPackage.ACCION__ES_ACCIONADO_POR:
				getEsAccionadoPor().clear();
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
			case AndroidPackage.ACCION__CLICK:
				return click != CLICK_EDEFAULT;
			case AndroidPackage.ACCION__LONG_CLICK:
				return longClick != LONG_CLICK_EDEFAULT;
			case AndroidPackage.ACCION__PERTENECE_A:
				return perteneceA != null;
			case AndroidPackage.ACCION__MUESTRA:
				return muestra != null;
			case AndroidPackage.ACCION__ES_ACCIONADO_POR:
				return esAccionadoPor != null && !esAccionadoPor.isEmpty();
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
		result.append(" (click: ");
		result.append(click);
		result.append(", longClick: ");
		result.append(longClick);
		result.append(')');
		return result.toString();
	}

} //accionImpl
