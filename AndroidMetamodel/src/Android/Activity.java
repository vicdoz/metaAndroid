/**
 */
package Android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.Activity#getApp <em>App</em>}</li>
 *   <li>{@link Android.Activity#getControla <em>Controla</em>}</li>
 *   <li>{@link Android.Activity#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Android.Activity#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Android.Activity#isIsmain <em>Ismain</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>App</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Android.Aplicacion#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' container reference.
	 * @see #setApp(Aplicacion)
	 * @see Android.AndroidPackage#getActivity_App()
	 * @see Android.Aplicacion#getActividades
	 * @model opposite="actividades" required="true" transient="false"
	 * @generated
	 */
	Aplicacion getApp();

	/**
	 * Sets the value of the '{@link Android.Activity#getApp <em>App</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' container reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(Aplicacion value);

	/**
	 * Returns the value of the '<em><b>Controla</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Controlador#getEsControladaPor <em>Es Controlada Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controla</em>' reference.
	 * @see #setControla(Controlador)
	 * @see Android.AndroidPackage#getActivity_Controla()
	 * @see Android.Controlador#getEsControladaPor
	 * @model opposite="esControladaPor" required="true"
	 * @generated
	 */
	Controlador getControla();

	/**
	 * Sets the value of the '{@link Android.Activity#getControla <em>Controla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controla</em>' reference.
	 * @see #getControla()
	 * @generated
	 */
	void setControla(Controlador value);

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
	 * @see Android.AndroidPackage#getActivity_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Android.Activity#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see Android.AndroidPackage#getActivity_Paquete()
	 * @model
	 * @generated
	 */
	String getPaquete();

	/**
	 * Sets the value of the '{@link Android.Activity#getPaquete <em>Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paquete</em>' attribute.
	 * @see #getPaquete()
	 * @generated
	 */
	void setPaquete(String value);

	/**
	 * Returns the value of the '<em><b>Ismain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ismain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismain</em>' attribute.
	 * @see #setIsmain(boolean)
	 * @see Android.AndroidPackage#getActivity_Ismain()
	 * @model
	 * @generated
	 */
	boolean isIsmain();

	/**
	 * Sets the value of the '{@link Android.Activity#isIsmain <em>Ismain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ismain</em>' attribute.
	 * @see #isIsmain()
	 * @generated
	 */
	void setIsmain(boolean value);

} // Activity
