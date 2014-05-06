/**
 */
package Android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>permiso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.permiso#getDaPermisoA <em>Da Permiso A</em>}</li>
 *   <li>{@link Android.permiso#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getpermiso()
 * @model
 * @generated
 */
public interface permiso extends EObject {
	/**
	 * Returns the value of the '<em><b>Da Permiso A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Da Permiso A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Da Permiso A</em>' reference.
	 * @see #setDaPermisoA(Aplicacion)
	 * @see Android.AndroidPackage#getpermiso_DaPermisoA()
	 * @model required="true"
	 * @generated
	 */
	Aplicacion getDaPermisoA();

	/**
	 * Sets the value of the '{@link Android.permiso#getDaPermisoA <em>Da Permiso A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Da Permiso A</em>' reference.
	 * @see #getDaPermisoA()
	 * @generated
	 */
	void setDaPermisoA(Aplicacion value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' reference.
	 * @see #setNombre(permiso)
	 * @see Android.AndroidPackage#getpermiso_Nombre()
	 * @model
	 * @generated
	 */
	permiso getNombre();

	/**
	 * Sets the value of the '{@link Android.permiso#getNombre <em>Nombre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' reference.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(permiso value);

} // permiso
