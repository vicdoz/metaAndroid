/**
 */
package android;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Aplication#getName <em>Name</em>}</li>
 *   <li>{@link android.Aplication#getPackage <em>Package</em>}</li>
 *   <li>{@link android.Aplication#getMinSDK <em>Min SDK</em>}</li>
 *   <li>{@link android.Aplication#getTargetSDK <em>Target SDK</em>}</li>
 *   <li>{@link android.Aplication#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link android.Aplication#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link android.Aplication#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link android.Aplication#getContains <em>Contains</em>}</li>
 *   <li>{@link android.Aplication#getCreates <em>Creates</em>}</li>
 *   <li>{@link android.Aplication#getRun <em>Run</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getAplication()
 * @model
 * @generated
 */
public interface Aplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see android.AndroidPackage#getAplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link android.Aplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see android.AndroidPackage#getAplication_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link android.Aplication#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Min SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min SDK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min SDK</em>' attribute.
	 * @see #setMinSDK(BigInteger)
	 * @see android.AndroidPackage#getAplication_MinSDK()
	 * @model
	 * @generated
	 */
	BigInteger getMinSDK();

	/**
	 * Sets the value of the '{@link android.Aplication#getMinSDK <em>Min SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min SDK</em>' attribute.
	 * @see #getMinSDK()
	 * @generated
	 */
	void setMinSDK(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Target SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target SDK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target SDK</em>' attribute.
	 * @see #setTargetSDK(BigInteger)
	 * @see android.AndroidPackage#getAplication_TargetSDK()
	 * @model
	 * @generated
	 */
	BigInteger getTargetSDK();

	/**
	 * Sets the value of the '{@link android.Aplication#getTargetSDK <em>Target SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target SDK</em>' attribute.
	 * @see #getTargetSDK()
	 * @generated
	 */
	void setTargetSDK(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Code</em>' attribute.
	 * @see #setVersionCode(String)
	 * @see android.AndroidPackage#getAplication_VersionCode()
	 * @model
	 * @generated
	 */
	String getVersionCode();

	/**
	 * Sets the value of the '{@link android.Aplication#getVersionCode <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Code</em>' attribute.
	 * @see #getVersionCode()
	 * @generated
	 */
	void setVersionCode(String value);

	/**
	 * Returns the value of the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Name</em>' attribute.
	 * @see #setVersionName(String)
	 * @see android.AndroidPackage#getAplication_VersionName()
	 * @model
	 * @generated
	 */
	String getVersionName();

	/**
	 * Sets the value of the '{@link android.Aplication#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Name</em>' attribute.
	 * @see #getVersionName()
	 * @generated
	 */
	void setVersionName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute list.
	 * The list contents are of type {@link android.Permissions}.
	 * The literals are from the enumeration {@link android.Permissions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute list.
	 * @see android.Permissions
	 * @see android.AndroidPackage#getAplication_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permissions> getPermissions();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link android.Layout}.
	 * It is bidirectional and its opposite is '{@link android.Layout#getLayOn <em>Lay On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see android.AndroidPackage#getAplication_Contains()
	 * @see android.Layout#getLayOn
	 * @model opposite="layOn" containment="true"
	 * @generated
	 */
	EList<Layout> getContains();

	/**
	 * Returns the value of the '<em><b>Creates</b></em>' containment reference list.
	 * The list contents are of type {@link android.CreateString}.
	 * It is bidirectional and its opposite is '{@link android.CreateString#getStored <em>Stored</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates</em>' containment reference list.
	 * @see android.AndroidPackage#getAplication_Creates()
	 * @see android.CreateString#getStored
	 * @model opposite="stored" containment="true"
	 * @generated
	 */
	EList<CreateString> getCreates();

	/**
	 * Returns the value of the '<em><b>Run</b></em>' containment reference list.
	 * The list contents are of type {@link android.Activity}.
	 * It is bidirectional and its opposite is '{@link android.Activity#getRunsIn <em>Runs In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' containment reference list.
	 * @see android.AndroidPackage#getAplication_Run()
	 * @see android.Activity#getRunsIn
	 * @model opposite="runsIn" containment="true"
	 * @generated
	 */
	EList<Activity> getRun();

} // Aplication
