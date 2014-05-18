/**
 */
package android.impl;

import android.Activity;
import android.AndroidPackage;
import android.Aplication;
import android.Layout;
import android.LayoutType;
import android.Widget;
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
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.LayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link android.impl.LayoutImpl#getType <em>Type</em>}</li>
 *   <li>{@link android.impl.LayoutImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link android.impl.LayoutImpl#getLayOn <em>Lay On</em>}</li>
 *   <li>{@link android.impl.LayoutImpl#getEsMostrado <em>Es Mostrado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutType TYPE_EDEFAULT = LayoutType.VERTICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LayoutType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> contains;

	/**
	 * The cached value of the '{@link #getLayOn() <em>Lay On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayOn()
	 * @generated
	 * @ordered
	 */
	protected Aplication layOn;

	/**
	 * The cached value of the '{@link #getEsMostrado() <em>Es Mostrado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsMostrado()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> esMostrado;

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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LayoutType newType) {
		LayoutType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Widget>(Widget.class, this, AndroidPackage.LAYOUT__CONTAINS, AndroidPackage.WIDGET__LAYOUT_OWNER);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplication getLayOn() {
		if (layOn != null && layOn.eIsProxy()) {
			InternalEObject oldLayOn = (InternalEObject)layOn;
			layOn = (Aplication)eResolveProxy(oldLayOn);
			if (layOn != oldLayOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidPackage.LAYOUT__LAY_ON, oldLayOn, layOn));
			}
		}
		return layOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplication basicGetLayOn() {
		return layOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayOn(Aplication newLayOn, NotificationChain msgs) {
		Aplication oldLayOn = layOn;
		layOn = newLayOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__LAY_ON, oldLayOn, newLayOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayOn(Aplication newLayOn) {
		if (newLayOn != layOn) {
			NotificationChain msgs = null;
			if (layOn != null)
				msgs = ((InternalEObject)layOn).eInverseRemove(this, AndroidPackage.APLICATION__CONTAINS, Aplication.class, msgs);
			if (newLayOn != null)
				msgs = ((InternalEObject)newLayOn).eInverseAdd(this, AndroidPackage.APLICATION__CONTAINS, Aplication.class, msgs);
			msgs = basicSetLayOn(newLayOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.LAYOUT__LAY_ON, newLayOn, newLayOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getEsMostrado() {
		if (esMostrado == null) {
			esMostrado = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this, AndroidPackage.LAYOUT__ES_MOSTRADO, AndroidPackage.ACTIVITY__MUESTRA);
		}
		return esMostrado;
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
			case AndroidPackage.LAYOUT__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case AndroidPackage.LAYOUT__LAY_ON:
				if (layOn != null)
					msgs = ((InternalEObject)layOn).eInverseRemove(this, AndroidPackage.APLICATION__CONTAINS, Aplication.class, msgs);
				return basicSetLayOn((Aplication)otherEnd, msgs);
			case AndroidPackage.LAYOUT__ES_MOSTRADO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsMostrado()).basicAdd(otherEnd, msgs);
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
			case AndroidPackage.LAYOUT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case AndroidPackage.LAYOUT__LAY_ON:
				return basicSetLayOn(null, msgs);
			case AndroidPackage.LAYOUT__ES_MOSTRADO:
				return ((InternalEList<?>)getEsMostrado()).basicRemove(otherEnd, msgs);
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
			case AndroidPackage.LAYOUT__NAME:
				return getName();
			case AndroidPackage.LAYOUT__TYPE:
				return getType();
			case AndroidPackage.LAYOUT__CONTAINS:
				return getContains();
			case AndroidPackage.LAYOUT__LAY_ON:
				if (resolve) return getLayOn();
				return basicGetLayOn();
			case AndroidPackage.LAYOUT__ES_MOSTRADO:
				return getEsMostrado();
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
			case AndroidPackage.LAYOUT__NAME:
				setName((String)newValue);
				return;
			case AndroidPackage.LAYOUT__TYPE:
				setType((LayoutType)newValue);
				return;
			case AndroidPackage.LAYOUT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Widget>)newValue);
				return;
			case AndroidPackage.LAYOUT__LAY_ON:
				setLayOn((Aplication)newValue);
				return;
			case AndroidPackage.LAYOUT__ES_MOSTRADO:
				getEsMostrado().clear();
				getEsMostrado().addAll((Collection<? extends Activity>)newValue);
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
			case AndroidPackage.LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AndroidPackage.LAYOUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AndroidPackage.LAYOUT__CONTAINS:
				getContains().clear();
				return;
			case AndroidPackage.LAYOUT__LAY_ON:
				setLayOn((Aplication)null);
				return;
			case AndroidPackage.LAYOUT__ES_MOSTRADO:
				getEsMostrado().clear();
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
			case AndroidPackage.LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AndroidPackage.LAYOUT__TYPE:
				return type != TYPE_EDEFAULT;
			case AndroidPackage.LAYOUT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case AndroidPackage.LAYOUT__LAY_ON:
				return layOn != null;
			case AndroidPackage.LAYOUT__ES_MOSTRADO:
				return esMostrado != null && !esMostrado.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
