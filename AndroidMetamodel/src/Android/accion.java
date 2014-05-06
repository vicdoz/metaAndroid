/**
 */
package Android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.accion#isClick <em>Click</em>}</li>
 *   <li>{@link Android.accion#isLongClick <em>Long Click</em>}</li>
 *   <li>{@link Android.accion#getPerteneceA <em>Pertenece A</em>}</li>
 *   <li>{@link Android.accion#getMuestra <em>Muestra</em>}</li>
 *   <li>{@link Android.accion#getEsAccionadoPor <em>Es Accionado Por</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getaccion()
 * @model
 * @generated
 */
public interface accion extends EObject {
	/**
	 * Returns the value of the '<em><b>Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Click</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Click</em>' attribute.
	 * @see #setClick(boolean)
	 * @see Android.AndroidPackage#getaccion_Click()
	 * @model
	 * @generated
	 */
	boolean isClick();

	/**
	 * Sets the value of the '{@link Android.accion#isClick <em>Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Click</em>' attribute.
	 * @see #isClick()
	 * @generated
	 */
	void setClick(boolean value);

	/**
	 * Returns the value of the '<em><b>Long Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Click</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Click</em>' attribute.
	 * @see #setLongClick(boolean)
	 * @see Android.AndroidPackage#getaccion_LongClick()
	 * @model
	 * @generated
	 */
	boolean isLongClick();

	/**
	 * Sets the value of the '{@link Android.accion#isLongClick <em>Long Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Click</em>' attribute.
	 * @see #isLongClick()
	 * @generated
	 */
	void setLongClick(boolean value);

	/**
	 * Returns the value of the '<em><b>Pertenece A</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Controlador#getHaceAccion <em>Hace Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pertenece A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pertenece A</em>' reference.
	 * @see #setPerteneceA(Controlador)
	 * @see Android.AndroidPackage#getaccion_PerteneceA()
	 * @see Android.Controlador#getHaceAccion
	 * @model opposite="haceAccion" required="true"
	 * @generated
	 */
	Controlador getPerteneceA();

	/**
	 * Sets the value of the '{@link Android.accion#getPerteneceA <em>Pertenece A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pertenece A</em>' reference.
	 * @see #getPerteneceA()
	 * @generated
	 */
	void setPerteneceA(Controlador value);

	/**
	 * Returns the value of the '<em><b>Muestra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Dialogo#getEsMostradoEnUnaAccion <em>Es Mostrado En Una Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Muestra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Muestra</em>' reference.
	 * @see #setMuestra(Dialogo)
	 * @see Android.AndroidPackage#getaccion_Muestra()
	 * @see Android.Dialogo#getEsMostradoEnUnaAccion
	 * @model opposite="esMostradoEnUnaAccion"
	 * @generated
	 */
	Dialogo getMuestra();

	/**
	 * Sets the value of the '{@link Android.accion#getMuestra <em>Muestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Muestra</em>' reference.
	 * @see #getMuestra()
	 * @generated
	 */
	void setMuestra(Dialogo value);

	/**
	 * Returns the value of the '<em><b>Es Accionado Por</b></em>' reference list.
	 * The list contents are of type {@link Android.Boton}.
	 * It is bidirectional and its opposite is '{@link Android.Boton#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Accionado Por</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Accionado Por</em>' reference list.
	 * @see Android.AndroidPackage#getaccion_EsAccionadoPor()
	 * @see Android.Boton#getAccion
	 * @model opposite="accion" required="true"
	 * @generated
	 */
	EList<Boton> getEsAccionadoPor();

} // accion
