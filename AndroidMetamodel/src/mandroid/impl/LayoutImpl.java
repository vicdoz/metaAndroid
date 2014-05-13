/**
 */
package mandroid.impl;

import java.util.Collection;

import mandroid.Activity;
import mandroid.Aplication;
import mandroid.Layout;
import mandroid.LayoutType;
import mandroid.MandroidPackage;
import mandroid.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link mandroid.impl.LayoutImpl#getType <em>Type</em>}</li>
 *   <li>{@link mandroid.impl.LayoutImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link mandroid.impl.LayoutImpl#getLayOn <em>Lay On</em>}</li>
 *   <li>{@link mandroid.impl.LayoutImpl#getEsMostrado <em>Es Mostrado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
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
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> contains;

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
		return MandroidPackage.Literals.LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.LAYOUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentWithInverseEList<Widget>(Widget.class, this, MandroidPackage.LAYOUT__CONTAINS, MandroidPackage.WIDGET__LAYOUT_OWNER);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplication getLayOn() {
		if (eContainerFeatureID() != MandroidPackage.LAYOUT__LAY_ON) return null;
		return (Aplication)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayOn(Aplication newLayOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLayOn, MandroidPackage.LAYOUT__LAY_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayOn(Aplication newLayOn) {
		if (newLayOn != eInternalContainer() || (eContainerFeatureID() != MandroidPackage.LAYOUT__LAY_ON && newLayOn != null)) {
			if (EcoreUtil.isAncestor(this, newLayOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLayOn != null)
				msgs = ((InternalEObject)newLayOn).eInverseAdd(this, MandroidPackage.APLICATION__CONTAINS, Aplication.class, msgs);
			msgs = basicSetLayOn(newLayOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MandroidPackage.LAYOUT__LAY_ON, newLayOn, newLayOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getEsMostrado() {
		if (esMostrado == null) {
			esMostrado = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this, MandroidPackage.LAYOUT__ES_MOSTRADO, MandroidPackage.ACTIVITY__MUESTRA);
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
			case MandroidPackage.LAYOUT__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case MandroidPackage.LAYOUT__LAY_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLayOn((Aplication)otherEnd, msgs);
			case MandroidPackage.LAYOUT__ES_MOSTRADO:
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
			case MandroidPackage.LAYOUT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case MandroidPackage.LAYOUT__LAY_ON:
				return basicSetLayOn(null, msgs);
			case MandroidPackage.LAYOUT__ES_MOSTRADO:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MandroidPackage.LAYOUT__LAY_ON:
				return eInternalContainer().eInverseRemove(this, MandroidPackage.APLICATION__CONTAINS, Aplication.class, msgs);
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
			case MandroidPackage.LAYOUT__TYPE:
				return getType();
			case MandroidPackage.LAYOUT__CONTAINS:
				return getContains();
			case MandroidPackage.LAYOUT__LAY_ON:
				return getLayOn();
			case MandroidPackage.LAYOUT__ES_MOSTRADO:
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
			case MandroidPackage.LAYOUT__TYPE:
				setType((LayoutType)newValue);
				return;
			case MandroidPackage.LAYOUT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Widget>)newValue);
				return;
			case MandroidPackage.LAYOUT__LAY_ON:
				setLayOn((Aplication)newValue);
				return;
			case MandroidPackage.LAYOUT__ES_MOSTRADO:
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
			case MandroidPackage.LAYOUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MandroidPackage.LAYOUT__CONTAINS:
				getContains().clear();
				return;
			case MandroidPackage.LAYOUT__LAY_ON:
				setLayOn((Aplication)null);
				return;
			case MandroidPackage.LAYOUT__ES_MOSTRADO:
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
			case MandroidPackage.LAYOUT__TYPE:
				return type != TYPE_EDEFAULT;
			case MandroidPackage.LAYOUT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case MandroidPackage.LAYOUT__LAY_ON:
				return getLayOn() != null;
			case MandroidPackage.LAYOUT__ES_MOSTRADO:
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
