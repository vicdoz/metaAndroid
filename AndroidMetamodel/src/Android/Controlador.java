/**
 */
package Android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.Controlador#getEsControladaPor <em>Es Controlada Por</em>}</li>
 *   <li>{@link Android.Controlador#getManejaWidget <em>Maneja Widget</em>}</li>
 *   <li>{@link Android.Controlador#getHaceAccion <em>Hace Accion</em>}</li>
 *   <li>{@link Android.Controlador#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getControlador()
 * @model
 * @generated
 */
public interface Controlador extends EObject {
	/**
	 * Returns the value of the '<em><b>Es Controlada Por</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Activity#getControla <em>Controla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Controlada Por</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Controlada Por</em>' reference.
	 * @see #setEsControladaPor(Activity)
	 * @see Android.AndroidPackage#getControlador_EsControladaPor()
	 * @see Android.Activity#getControla
	 * @model opposite="controla" required="true"
	 * @generated
	 */
	Activity getEsControladaPor();

	/**
	 * Sets the value of the '{@link Android.Controlador#getEsControladaPor <em>Es Controlada Por</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Controlada Por</em>' reference.
	 * @see #getEsControladaPor()
	 * @generated
	 */
	void setEsControladaPor(Activity value);

	/**
	 * Returns the value of the '<em><b>Maneja Widget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Widget#getEsControladoPor <em>Es Controlado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maneja Widget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maneja Widget</em>' reference.
	 * @see #setManejaWidget(Widget)
	 * @see Android.AndroidPackage#getControlador_ManejaWidget()
	 * @see Android.Widget#getEsControladoPor
	 * @model opposite="esControladoPor" required="true"
	 * @generated
	 */
	Widget getManejaWidget();

	/**
	 * Sets the value of the '{@link Android.Controlador#getManejaWidget <em>Maneja Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maneja Widget</em>' reference.
	 * @see #getManejaWidget()
	 * @generated
	 */
	void setManejaWidget(Widget value);

	/**
	 * Returns the value of the '<em><b>Hace Accion</b></em>' reference list.
	 * The list contents are of type {@link Android.accion}.
	 * It is bidirectional and its opposite is '{@link Android.accion#getPerteneceA <em>Pertenece A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hace Accion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hace Accion</em>' reference list.
	 * @see Android.AndroidPackage#getControlador_HaceAccion()
	 * @see Android.accion#getPerteneceA
	 * @model opposite="perteneceA"
	 * @generated
	 */
	EList<accion> getHaceAccion();

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
	 * @see Android.AndroidPackage#getControlador_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Android.Controlador#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Controlador
