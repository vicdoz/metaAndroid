/**
 */
package mandroid;

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
 *   <li>{@link mandroid.Aplication#getName <em>Name</em>}</li>
 *   <li>{@link mandroid.Aplication#getPackage <em>Package</em>}</li>
 *   <li>{@link mandroid.Aplication#getMinSDK <em>Min SDK</em>}</li>
 *   <li>{@link mandroid.Aplication#getTargetSDK <em>Target SDK</em>}</li>
 *   <li>{@link mandroid.Aplication#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link mandroid.Aplication#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link mandroid.Aplication#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link mandroid.Aplication#getRun <em>Run</em>}</li>
 *   <li>{@link mandroid.Aplication#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getAplication()
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
	 * @see mandroid.MandroidPackage#getAplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getName <em>Name</em>}' attribute.
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
	 * @see mandroid.MandroidPackage#getAplication_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getPackage <em>Package</em>}' attribute.
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
	 * @see mandroid.MandroidPackage#getAplication_MinSDK()
	 * @model
	 * @generated
	 */
	BigInteger getMinSDK();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getMinSDK <em>Min SDK</em>}' attribute.
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
	 * @see mandroid.MandroidPackage#getAplication_TargetSDK()
	 * @model
	 * @generated
	 */
	BigInteger getTargetSDK();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getTargetSDK <em>Target SDK</em>}' attribute.
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
	 * @see #setVersionCode(BigInteger)
	 * @see mandroid.MandroidPackage#getAplication_VersionCode()
	 * @model
	 * @generated
	 */
	BigInteger getVersionCode();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getVersionCode <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Code</em>' attribute.
	 * @see #getVersionCode()
	 * @generated
	 */
	void setVersionCode(BigInteger value);

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
	 * @see mandroid.MandroidPackage#getAplication_VersionName()
	 * @model
	 * @generated
	 */
	String getVersionName();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Name</em>' attribute.
	 * @see #getVersionName()
	 * @generated
	 */
	void setVersionName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * The literals are from the enumeration {@link mandroid.Permissions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see mandroid.Permissions
	 * @see #setPermissions(Permissions)
	 * @see mandroid.MandroidPackage#getAplication_Permissions()
	 * @model
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Sets the value of the '{@link mandroid.Aplication#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see mandroid.Permissions
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions value);

	/**
	 * Returns the value of the '<em><b>Run</b></em>' containment reference list.
	 * The list contents are of type {@link mandroid.Activity}.
	 * It is bidirectional and its opposite is '{@link mandroid.Activity#getRunsIn <em>Runs In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' containment reference list.
	 * @see mandroid.MandroidPackage#getAplication_Run()
	 * @see mandroid.Activity#getRunsIn
	 * @model opposite="runsIn" containment="true"
	 * @generated
	 */
	EList<Activity> getRun();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link mandroid.Layout}.
	 * It is bidirectional and its opposite is '{@link mandroid.Layout#getLayOn <em>Lay On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see mandroid.MandroidPackage#getAplication_Contains()
	 * @see mandroid.Layout#getLayOn
	 * @model opposite="layOn" containment="true"
	 * @generated
	 */
	EList<Layout> getContains();

} // Aplication
