/**
 */
package Android.impl;

import Android.Activity;
import Android.AndroidPackage;
import Android.Aplicacion;
import Android.Layout;
import Android.Widget;
import Android.tipoLayout;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Android.impl.LayoutImpl#getPadre <em>Padre</em>}</li>
 *   <li>{@link Android.impl.LayoutImpl#getHijo <em>Hijo</em>}</li>
 *   <li>{@link Android.impl.LayoutImpl#getWidget <em>Widget</em>}</li>
 *   <li>{@link Android.impl.LayoutImpl#getPerteneceAapp <em>Pertenece Aapp</em>}</li>
 *   <li>{@link Android.impl.LayoutImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link Android.impl.LayoutImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
	/**
	 * The cached value of the '{@link #getPadre() <em>Padre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadre()
	 * @generated
	 * @ordered
	 */
	protected Layout padre;

	/**
	 * The cached value of the '{@link #getHijo() <em>Hijo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHijo()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> hijo;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final tipoLayout TIPO_EDEFAULT = tipoLayout.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected tipoLayout tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getPadre() {
		if (padre != null && padre.eIsProxy()) {
			InternalEObject oldPadre = (InternalEObject)padre;
			padre = (Layout)eResolveProxy(oldPadre);
			if (padre != oldPadre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.LAYOUT__PADRE, oldPadre, padre));
			}
		}
		return padre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetPadre() {
		return padre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadre(Layout newPadre, NotificationChain msgs) {
		Layout oldPadre = padre;
		padre = newPadre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__PADRE, oldPadre, newPadre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadre(Layout newPadre) {
		if (newPadre != padre) {
			NotificationChain msgs = null;
			if (padre != null)
				msgs = ((InternalEObject)padre).eInverseRemove(this, AndroidPackage.LAYOUT__HIJO, Layout.class, msgs);
			if (newPadre != null)
				msgs = ((InternalEObject)newPadre).eInverseAdd(this, AndroidPackage.LAYOUT__HIJO, Layout.class, msgs);
			msgs = basicSetPadre(newPadre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__PADRE, newPadre, newPadre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getHijo() {
		if (hijo == null) {
			hijo = new EObjectWithInverseResolvingEList<Layout>(Layout.class, this, AndroidPackage.LAYOUT__HIJO, AndroidPackage.LAYOUT__PADRE);
		}
		return hijo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget getWidget() {
		if (widget != null && widget.eIsProxy()) {
			InternalEObject oldWidget = (InternalEObject)widget;
			widget = (Widget)eResolveProxy(oldWidget);
			if (widget != oldWidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.LAYOUT__WIDGET, oldWidget, widget));
			}
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget basicGetWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__WIDGET, oldWidget, newWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, AndroidPackage.WIDGET__PERTENECE_ALAYOUT, Widget.class, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, AndroidPackage.WIDGET__PERTENECE_ALAYOUT, Widget.class, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion getPerteneceAapp() {
		if (eContainerFeatureID() != AndroidPackage.LAYOUT__PERTENECE_AAPP) return null;
		return (Aplicacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerteneceAapp(Aplicacion newPerteneceAapp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPerteneceAapp, AndroidPackage.LAYOUT__PERTENECE_AAPP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerteneceAapp(Aplicacion newPerteneceAapp) {
		if (newPerteneceAapp != eInternalContainer() || (eContainerFeatureID() != AndroidPackage.LAYOUT__PERTENECE_AAPP && newPerteneceAapp != null)) {
			if (EcoreUtil.isAncestor(this, newPerteneceAapp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPerteneceAapp != null)
				msgs = ((InternalEObject)newPerteneceAapp).eInverseAdd(this, AndroidPackage.APLICACION__LAYOUT, Aplicacion.class, msgs);
			msgs = basicSetPerteneceAapp(newPerteneceAapp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__PERTENECE_AAPP, newPerteneceAapp, newPerteneceAapp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectResolvingEList<Activity>(Activity.class, this, AndroidPackage.LAYOUT__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tipoLayout getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(tipoLayout newTipo) {
		tipoLayout oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__TIPO, oldTipo, tipo));
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
			case AndroidPackage.LAYOUT__PADRE:
				if (padre != null)
					msgs = ((InternalEObject)padre).eInverseRemove(this, AndroidPackage.LAYOUT__HIJO, Layout.class, msgs);
				return basicSetPadre((Layout)otherEnd, msgs);
			case AndroidPackage.LAYOUT__HIJO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHijo()).basicAdd(otherEnd, msgs);
			case AndroidPackage.LAYOUT__WIDGET:
				if (widget != null)
					msgs = ((InternalEObject)widget).eInverseRemove(this, AndroidPackage.WIDGET__PERTENECE_ALAYOUT, Widget.class, msgs);
				return basicSetWidget((Widget)otherEnd, msgs);
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPerteneceAapp((Aplicacion)otherEnd, msgs);
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
			case AndroidPackage.LAYOUT__PADRE:
				return basicSetPadre(null, msgs);
			case AndroidPackage.LAYOUT__HIJO:
				return ((InternalEList<?>)getHijo()).basicRemove(otherEnd, msgs);
			case AndroidPackage.LAYOUT__WIDGET:
				return basicSetWidget(null, msgs);
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				return basicSetPerteneceAapp(null, msgs);
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
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				return eInternalContainer().eInverseRemove(this, AndroidPackage.APLICACION__LAYOUT, Aplicacion.class, msgs);
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
			case AndroidPackage.LAYOUT__PADRE:
				if (resolve) return getPadre();
				return basicGetPadre();
			case AndroidPackage.LAYOUT__HIJO:
				return getHijo();
			case AndroidPackage.LAYOUT__WIDGET:
				if (resolve) return getWidget();
				return basicGetWidget();
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				return getPerteneceAapp();
			case AndroidPackage.LAYOUT__ACTIVITIES:
				return getActivities();
			case AndroidPackage.LAYOUT__TIPO:
				return getTipo();
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
			case AndroidPackage.LAYOUT__PADRE:
				setPadre((Layout)newValue);
				return;
			case AndroidPackage.LAYOUT__HIJO:
				getHijo().clear();
				getHijo().addAll((Collection<? extends Layout>)newValue);
				return;
			case AndroidPackage.LAYOUT__WIDGET:
				setWidget((Widget)newValue);
				return;
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				setPerteneceAapp((Aplicacion)newValue);
				return;
			case AndroidPackage.LAYOUT__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case AndroidPackage.LAYOUT__TIPO:
				setTipo((tipoLayout)newValue);
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
			case AndroidPackage.LAYOUT__PADRE:
				setPadre((Layout)null);
				return;
			case AndroidPackage.LAYOUT__HIJO:
				getHijo().clear();
				return;
			case AndroidPackage.LAYOUT__WIDGET:
				setWidget((Widget)null);
				return;
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				setPerteneceAapp((Aplicacion)null);
				return;
			case AndroidPackage.LAYOUT__ACTIVITIES:
				getActivities().clear();
				return;
			case AndroidPackage.LAYOUT__TIPO:
				setTipo(TIPO_EDEFAULT);
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
			case AndroidPackage.LAYOUT__PADRE:
				return padre != null;
			case AndroidPackage.LAYOUT__HIJO:
				return hijo != null && !hijo.isEmpty();
			case AndroidPackage.LAYOUT__WIDGET:
				return widget != null;
			case AndroidPackage.LAYOUT__PERTENECE_AAPP:
				return getPerteneceAapp() != null;
			case AndroidPackage.LAYOUT__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case AndroidPackage.LAYOUT__TIPO:
				return tipo != TIPO_EDEFAULT;
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
