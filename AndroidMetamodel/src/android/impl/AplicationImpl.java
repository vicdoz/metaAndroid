/**
 */
package android.impl;

import android.Activity;
import android.AndroidPackage;
import android.Aplication;
import android.CreateString;
import android.Layout;
import android.Permissions;
import java.math.BigInteger;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.AplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getMinSDK <em>Min SDK</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getTargetSDK <em>Target SDK</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getCreates <em>Creates</em>}</li>
 *   <li>{@link android.impl.AplicationImpl#getRun <em>Run</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AplicationImpl extends MinimalEObjectImpl.Container implements Aplication {
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
	 * The default value of the '{@link #getMinSDK() <em>Min SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSDK()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_SDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinSDK() <em>Min SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSDK()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minSDK = MIN_SDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSDK() <em>Target SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSDK()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_SDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSDK() <em>Target SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSDK()
	 * @generated
	 * @ordered
	 */
	protected BigInteger targetSDK = TARGET_SDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionCode()
	 * @generated
	 * @ordered
	 */
	protected String versionCode = VERSION_CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permissions> permissions;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> contains;

	/**
	 * The cached value of the '{@link #getCreates() <em>Creates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreates()
	 * @generated
	 * @ordered
	 */
	protected EList<CreateString> creates;

	/**
	 * The cached value of the '{@link #getRun() <em>Run</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> run;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.APLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICATION__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinSDK() {
		return minSDK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSDK(BigInteger newMinSDK) {
		BigInteger oldMinSDK = minSDK;
		minSDK = newMinSDK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICATION__MIN_SDK, oldMinSDK, minSDK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTargetSDK() {
		return targetSDK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSDK(BigInteger newTargetSDK) {
		BigInteger oldTargetSDK = targetSDK;
		targetSDK = newTargetSDK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICATION__TARGET_SDK, oldTargetSDK, targetSDK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionCode() {
		return versionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionCode(String newVersionCode) {
		String oldVersionCode = versionCode;
		versionCode = newVersionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICATION__VERSION_CODE, oldVersionCode, versionCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.APLICATION__VERSION_NAME, oldVersionName, versionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permissions> getPermissions() {
		if (permissions == null) {
			permissions = new EDataTypeUniqueEList<Permissions>(Permissions.class, this, AndroidPackage.APLICATION__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Layout>(Layout.class, this, AndroidPackage.APLICATION__CONTAINS, AndroidPackage.LAYOUT__LAY_ON);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateString> getCreates() {
		if (creates == null) {
			creates = new EObjectWithInverseResolvingEList<CreateString>(CreateString.class, this, AndroidPackage.APLICATION__CREATES, AndroidPackage.CREATE_STRING__STORED);
		}
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getRun() {
		if (run == null) {
			run = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this, AndroidPackage.APLICATION__RUN, AndroidPackage.ACTIVITY__RUNS_IN);
		}
		return run;
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
			case AndroidPackage.APLICATION__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case AndroidPackage.APLICATION__CREATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreates()).basicAdd(otherEnd, msgs);
			case AndroidPackage.APLICATION__RUN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRun()).basicAdd(otherEnd, msgs);
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
			case AndroidPackage.APLICATION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case AndroidPackage.APLICATION__CREATES:
				return ((InternalEList<?>)getCreates()).basicRemove(otherEnd, msgs);
			case AndroidPackage.APLICATION__RUN:
				return ((InternalEList<?>)getRun()).basicRemove(otherEnd, msgs);
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
			case AndroidPackage.APLICATION__NAME:
				return getName();
			case AndroidPackage.APLICATION__PACKAGE:
				return getPackage();
			case AndroidPackage.APLICATION__MIN_SDK:
				return getMinSDK();
			case AndroidPackage.APLICATION__TARGET_SDK:
				return getTargetSDK();
			case AndroidPackage.APLICATION__VERSION_CODE:
				return getVersionCode();
			case AndroidPackage.APLICATION__VERSION_NAME:
				return getVersionName();
			case AndroidPackage.APLICATION__PERMISSIONS:
				return getPermissions();
			case AndroidPackage.APLICATION__CONTAINS:
				return getContains();
			case AndroidPackage.APLICATION__CREATES:
				return getCreates();
			case AndroidPackage.APLICATION__RUN:
				return getRun();
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
			case AndroidPackage.APLICATION__NAME:
				setName((String)newValue);
				return;
			case AndroidPackage.APLICATION__PACKAGE:
				setPackage((String)newValue);
				return;
			case AndroidPackage.APLICATION__MIN_SDK:
				setMinSDK((BigInteger)newValue);
				return;
			case AndroidPackage.APLICATION__TARGET_SDK:
				setTargetSDK((BigInteger)newValue);
				return;
			case AndroidPackage.APLICATION__VERSION_CODE:
				setVersionCode((String)newValue);
				return;
			case AndroidPackage.APLICATION__VERSION_NAME:
				setVersionName((String)newValue);
				return;
			case AndroidPackage.APLICATION__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permissions>)newValue);
				return;
			case AndroidPackage.APLICATION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Layout>)newValue);
				return;
			case AndroidPackage.APLICATION__CREATES:
				getCreates().clear();
				getCreates().addAll((Collection<? extends CreateString>)newValue);
				return;
			case AndroidPackage.APLICATION__RUN:
				getRun().clear();
				getRun().addAll((Collection<? extends Activity>)newValue);
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
			case AndroidPackage.APLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AndroidPackage.APLICATION__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case AndroidPackage.APLICATION__MIN_SDK:
				setMinSDK(MIN_SDK_EDEFAULT);
				return;
			case AndroidPackage.APLICATION__TARGET_SDK:
				setTargetSDK(TARGET_SDK_EDEFAULT);
				return;
			case AndroidPackage.APLICATION__VERSION_CODE:
				setVersionCode(VERSION_CODE_EDEFAULT);
				return;
			case AndroidPackage.APLICATION__VERSION_NAME:
				setVersionName(VERSION_NAME_EDEFAULT);
				return;
			case AndroidPackage.APLICATION__PERMISSIONS:
				getPermissions().clear();
				return;
			case AndroidPackage.APLICATION__CONTAINS:
				getContains().clear();
				return;
			case AndroidPackage.APLICATION__CREATES:
				getCreates().clear();
				return;
			case AndroidPackage.APLICATION__RUN:
				getRun().clear();
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
			case AndroidPackage.APLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AndroidPackage.APLICATION__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case AndroidPackage.APLICATION__MIN_SDK:
				return MIN_SDK_EDEFAULT == null ? minSDK != null : !MIN_SDK_EDEFAULT.equals(minSDK);
			case AndroidPackage.APLICATION__TARGET_SDK:
				return TARGET_SDK_EDEFAULT == null ? targetSDK != null : !TARGET_SDK_EDEFAULT.equals(targetSDK);
			case AndroidPackage.APLICATION__VERSION_CODE:
				return VERSION_CODE_EDEFAULT == null ? versionCode != null : !VERSION_CODE_EDEFAULT.equals(versionCode);
			case AndroidPackage.APLICATION__VERSION_NAME:
				return VERSION_NAME_EDEFAULT == null ? versionName != null : !VERSION_NAME_EDEFAULT.equals(versionName);
			case AndroidPackage.APLICATION__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case AndroidPackage.APLICATION__CONTAINS:
				return contains != null && !contains.isEmpty();
			case AndroidPackage.APLICATION__CREATES:
				return creates != null && !creates.isEmpty();
			case AndroidPackage.APLICATION__RUN:
				return run != null && !run.isEmpty();
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
		result.append(", minSDK: ");
		result.append(minSDK);
		result.append(", targetSDK: ");
		result.append(targetSDK);
		result.append(", versionCode: ");
		result.append(versionCode);
		result.append(", versionName: ");
		result.append(versionName);
		result.append(", permissions: ");
		result.append(permissions);
		result.append(')');
		return result.toString();
	}

} //AplicationImpl
