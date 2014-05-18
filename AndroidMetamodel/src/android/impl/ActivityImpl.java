/**
 */
package android.impl;

import android.Activity;
import android.AndroidPackage;
import android.Aplication;
import android.Layout;
import android.Menu;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link android.impl.ActivityImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link android.impl.ActivityImpl#isMain <em>Main</em>}</li>
 *   <li>{@link android.impl.ActivityImpl#getShow <em>Show</em>}</li>
 *   <li>{@link android.impl.ActivityImpl#getRunsIn <em>Runs In</em>}</li>
 *   <li>{@link android.impl.ActivityImpl#getMuestra <em>Muestra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected boolean main = MAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected Menu show;

	/**
	 * The cached value of the '{@link #getRunsIn() <em>Runs In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsIn()
	 * @generated
	 * @ordered
	 */
	protected Aplication runsIn;

	/**
	 * The cached value of the '{@link #getMuestra() <em>Muestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuestra()
	 * @generated
	 * @ordered
	 */
	protected Layout muestra;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(boolean newMain) {
		boolean oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getShow() {
		if (show != null && show.eIsProxy()) {
			InternalEObject oldShow = (InternalEObject)show;
			show = (Menu)eResolveProxy(oldShow);
			if (show != oldShow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACTIVITY__SHOW, oldShow, show));
			}
		}
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShow(Menu newShow, NotificationChain msgs) {
		Menu oldShow = show;
		show = newShow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__SHOW, oldShow, newShow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(Menu newShow) {
		if (newShow != show) {
			NotificationChain msgs = null;
			if (show != null)
				msgs = ((InternalEObject)show).eInverseRemove(this, AndroidPackage.MENU__IS_SHOWED, Menu.class, msgs);
			if (newShow != null)
				msgs = ((InternalEObject)newShow).eInverseAdd(this, AndroidPackage.MENU__IS_SHOWED, Menu.class, msgs);
			msgs = basicSetShow(newShow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__SHOW, newShow, newShow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplication getRunsIn() {
		if (runsIn != null && runsIn.eIsProxy()) {
			InternalEObject oldRunsIn = (InternalEObject)runsIn;
			runsIn = (Aplication)eResolveProxy(oldRunsIn);
			if (runsIn != oldRunsIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACTIVITY__RUNS_IN, oldRunsIn, runsIn));
			}
		}
		return runsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplication basicGetRunsIn() {
		return runsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunsIn(Aplication newRunsIn, NotificationChain msgs) {
		Aplication oldRunsIn = runsIn;
		runsIn = newRunsIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__RUNS_IN, oldRunsIn, newRunsIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunsIn(Aplication newRunsIn) {
		if (newRunsIn != runsIn) {
			NotificationChain msgs = null;
			if (runsIn != null)
				msgs = ((InternalEObject)runsIn).eInverseRemove(this, AndroidPackage.APLICATION__RUN, Aplication.class, msgs);
			if (newRunsIn != null)
				msgs = ((InternalEObject)newRunsIn).eInverseAdd(this, AndroidPackage.APLICATION__RUN, Aplication.class, msgs);
			msgs = basicSetRunsIn(newRunsIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__RUNS_IN, newRunsIn, newRunsIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getMuestra() {
		if (muestra != null && muestra.eIsProxy()) {
			InternalEObject oldMuestra = (InternalEObject)muestra;
			muestra = (Layout)eResolveProxy(oldMuestra);
			if (muestra != oldMuestra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.ACTIVITY__MUESTRA, oldMuestra, muestra));
			}
		}
		return muestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetMuestra() {
		return muestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMuestra(Layout newMuestra, NotificationChain msgs) {
		Layout oldMuestra = muestra;
		muestra = newMuestra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__MUESTRA, oldMuestra, newMuestra);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuestra(Layout newMuestra) {
		if (newMuestra != muestra) {
			NotificationChain msgs = null;
			if (muestra != null)
				msgs = ((InternalEObject)muestra).eInverseRemove(this, AndroidPackage.LAYOUT__ES_MOSTRADO, Layout.class, msgs);
			if (newMuestra != null)
				msgs = ((InternalEObject)newMuestra).eInverseAdd(this, AndroidPackage.LAYOUT__ES_MOSTRADO, Layout.class, msgs);
			msgs = basicSetMuestra(newMuestra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ACTIVITY__MUESTRA, newMuestra, newMuestra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.ACTIVITY__SHOW:
				if (show != null)
					msgs = ((InternalEObject)show).eInverseRemove(this, AndroidPackage.MENU__IS_SHOWED, Menu.class, msgs);
				return basicSetShow((Menu)otherEnd, msgs);
			case AndroidPackage.ACTIVITY__RUNS_IN:
				if (runsIn != null)
					msgs = ((InternalEObject)runsIn).eInverseRemove(this, AndroidPackage.APLICATION__RUN, Aplication.class, msgs);
				return basicSetRunsIn((Aplication)otherEnd, msgs);
			case AndroidPackage.ACTIVITY__MUESTRA:
				if (muestra != null)
					msgs = ((InternalEObject)muestra).eInverseRemove(this, AndroidPackage.LAYOUT__ES_MOSTRADO, Layout.class, msgs);
				return basicSetMuestra((Layout)otherEnd, msgs);
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
			case AndroidPackage.ACTIVITY__SHOW:
				return basicSetShow(null, msgs);
			case AndroidPackage.ACTIVITY__RUNS_IN:
				return basicSetRunsIn(null, msgs);
			case AndroidPackage.ACTIVITY__MUESTRA:
				return basicSetMuestra(null, msgs);
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
			case AndroidPackage.ACTIVITY__NAME:
				return getName();
			case AndroidPackage.ACTIVITY__PACKAGE:
				return getPackage();
			case AndroidPackage.ACTIVITY__MAIN:
				return isMain();
			case AndroidPackage.ACTIVITY__SHOW:
				if (resolve) return getShow();
				return basicGetShow();
			case AndroidPackage.ACTIVITY__RUNS_IN:
				if (resolve) return getRunsIn();
				return basicGetRunsIn();
			case AndroidPackage.ACTIVITY__MUESTRA:
				if (resolve) return getMuestra();
				return basicGetMuestra();
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
			case AndroidPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case AndroidPackage.ACTIVITY__PACKAGE:
				setPackage((String)newValue);
				return;
			case AndroidPackage.ACTIVITY__MAIN:
				setMain((Boolean)newValue);
				return;
			case AndroidPackage.ACTIVITY__SHOW:
				setShow((Menu)newValue);
				return;
			case AndroidPackage.ACTIVITY__RUNS_IN:
				setRunsIn((Aplication)newValue);
				return;
			case AndroidPackage.ACTIVITY__MUESTRA:
				setMuestra((Layout)newValue);
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
			case AndroidPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AndroidPackage.ACTIVITY__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case AndroidPackage.ACTIVITY__MAIN:
				setMain(MAIN_EDEFAULT);
				return;
			case AndroidPackage.ACTIVITY__SHOW:
				setShow((Menu)null);
				return;
			case AndroidPackage.ACTIVITY__RUNS_IN:
				setRunsIn((Aplication)null);
				return;
			case AndroidPackage.ACTIVITY__MUESTRA:
				setMuestra((Layout)null);
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
			case AndroidPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AndroidPackage.ACTIVITY__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case AndroidPackage.ACTIVITY__MAIN:
				return main != MAIN_EDEFAULT;
			case AndroidPackage.ACTIVITY__SHOW:
				return show != null;
			case AndroidPackage.ACTIVITY__RUNS_IN:
				return runsIn != null;
			case AndroidPackage.ACTIVITY__MUESTRA:
				return muestra != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", package: ");
		result.append(package_);
		result.append(", main: ");
		result.append(main);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
