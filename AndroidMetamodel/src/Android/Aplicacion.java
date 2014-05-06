/**
 */
package Android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.Aplicacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Android.Aplicacion#getActividades <em>Actividades</em>}</li>
 *   <li>{@link Android.Aplicacion#getLayout <em>Layout</em>}</li>
 *   <li>{@link Android.Aplicacion#getPermiso <em>Permiso</em>}</li>
 *   <li>{@link Android.Aplicacion#getMinSDK <em>Min SDK</em>}</li>
 *   <li>{@link Android.Aplicacion#getTargetSDK <em>Target SDK</em>}</li>
 *   <li>{@link Android.Aplicacion#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Android.Aplicacion#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link Android.Aplicacion#getVersionName <em>Version Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getAplicacion()
 * @model
 * @generated
 */
public interface Aplicacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Android.AndroidPackage#getAplicacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Android.Aplicacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Actividades</b></em>' containment reference list.
	 * The list contents are of type {@link Android.Activity}.
	 * It is bidirectional and its opposite is '{@link Android.Activity#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividades</em>' containment reference list.
	 * @see Android.AndroidPackage#getAplicacion_Actividades()
	 * @see Android.Activity#getApp
	 * @model opposite="app" containment="true"
	 * @generated
	 */
	EList<Activity> getActividades();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference list.
	 * The list contents are of type {@link Android.Layout}.
	 * It is bidirectional and its opposite is '{@link Android.Layout#getPerteneceAapp <em>Pertenece Aapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference list.
	 * @see Android.AndroidPackage#getAplicacion_Layout()
	 * @see Android.Layout#getPerteneceAapp
	 * @model opposite="perteneceAapp" containment="true"
	 * @generated
	 */
	EList<Layout> getLayout();

	/**
	 * Returns the value of the '<em><b>Permiso</b></em>' attribute list.
	 * The list contents are of type {@link Android.tipo_permiso}.
	 * The literals are from the enumeration {@link Android.tipo_permiso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permiso</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permiso</em>' attribute list.
	 * @see Android.tipo_permiso
	 * @see Android.AndroidPackage#getAplicacion_Permiso()
	 * @model
	 * @generated
	 */
	EList<tipo_permiso> getPermiso();

	/**
	 * Returns the value of the '<em><b>Min SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min SDK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min SDK</em>' attribute.
	 * @see #setMinSDK(Integer)
	 * @see Android.AndroidPackage#getAplicacion_MinSDK()
	 * @model
	 * @generated
	 */
	Integer getMinSDK();

	/**
	 * Sets the value of the '{@link Android.Aplicacion#getMinSDK <em>Min SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min SDK</em>' attribute.
	 * @see #getMinSDK()
	 * @generated
	 */
	void setMinSDK(Integer value);

	/**
	 * Returns the value of the '<em><b>Target SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target SDK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target SDK</em>' attribute.
	 * @see #setTargetSDK(Integer)
	 * @see Android.AndroidPackage#getAplicacion_TargetSDK()
	 * @model
	 * @generated
	 */
	Integer getTargetSDK();

	/**
	 * Sets the value of the '{@link Android.Aplicacion#getTargetSDK <em>Target SDK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target SDK</em>' attribute.
	 * @see #getTargetSDK()
	 * @generated
	 */
	void setTargetSDK(Integer value);

	/**
	 * Returns the value of the '<em><b>Paquete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paquete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquete</em>' attribute.
	 * @see #setPaquete(String)
	 * @see Android.AndroidPackage#getAplicacion_Paquete()
	 * @model
	 * @generated
	 */
	String getPaquete();

	/**
	 * Sets the value of the '{@link Android.Aplicacion#getPaquete <em>Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paquete</em>' attribute.
	 * @see #getPaquete()
	 * @generated
	 */
	void setPaquete(String value);

	/**
	 * Returns the value of the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Code</em>' attribute.
	 * @see #setVersionCode(Integer)
	 * @see Android.AndroidPackage#getAplicacion_VersionCode()
	 * @model
	 * @generated
	 */
	Integer getVersionCode();

	/**
	 * Sets the value of the '{@link Android.Aplicacion#getVersionCode <em>Version Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Code</em>' attribute.
	 * @see #getVersionCode()
	 * @generated
	 */
	void setVersionCode(Integer value);

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
	 * @see Android.AndroidPackage#getAplicacion_VersionName()
	 * @model
	 * @generated
	 */
	String getVersionName();

	/**
	 * Sets the value of the '{@link Android.Aplicacion#getVersionName <em>Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Name</em>' attribute.
	 * @see #getVersionName()
	 * @generated
	 */
	void setVersionName(String value);

} // Aplicacion
