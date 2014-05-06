/**
 */
package Android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.Dialogo#getEsMostradoEnUnaAccion <em>Es Mostrado En Una Accion</em>}</li>
 *   <li>{@link Android.Dialogo#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link Android.Dialogo#getTexto <em>Texto</em>}</li>
 *   <li>{@link Android.Dialogo#getImagen <em>Imagen</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getDialogo()
 * @model
 * @generated
 */
public interface Dialogo extends EObject {
	/**
	 * Returns the value of the '<em><b>Es Mostrado En Una Accion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.accion#getMuestra <em>Muestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Mostrado En Una Accion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Mostrado En Una Accion</em>' reference.
	 * @see #setEsMostradoEnUnaAccion(accion)
	 * @see Android.AndroidPackage#getDialogo_EsMostradoEnUnaAccion()
	 * @see Android.accion#getMuestra
	 * @model opposite="muestra" required="true"
	 * @generated
	 */
	accion getEsMostradoEnUnaAccion();

	/**
	 * Sets the value of the '{@link Android.Dialogo#getEsMostradoEnUnaAccion <em>Es Mostrado En Una Accion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Mostrado En Una Accion</em>' reference.
	 * @see #getEsMostradoEnUnaAccion()
	 * @generated
	 */
	void setEsMostradoEnUnaAccion(accion value);

	/**
	 * Returns the value of the '<em><b>Duracion</b></em>' attribute.
	 * The literals are from the enumeration {@link Android.duracionDialogo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duracion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duracion</em>' attribute.
	 * @see Android.duracionDialogo
	 * @see #setDuracion(duracionDialogo)
	 * @see Android.AndroidPackage#getDialogo_Duracion()
	 * @model
	 * @generated
	 */
	duracionDialogo getDuracion();

	/**
	 * Sets the value of the '{@link Android.Dialogo#getDuracion <em>Duracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duracion</em>' attribute.
	 * @see Android.duracionDialogo
	 * @see #getDuracion()
	 * @generated
	 */
	void setDuracion(duracionDialogo value);

	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see Android.AndroidPackage#getDialogo_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link Android.Dialogo#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

	/**
	 * Returns the value of the '<em><b>Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagen</em>' attribute.
	 * @see #setImagen(String)
	 * @see Android.AndroidPackage#getDialogo_Imagen()
	 * @model
	 * @generated
	 */
	String getImagen();

	/**
	 * Sets the value of the '{@link Android.Dialogo#getImagen <em>Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagen</em>' attribute.
	 * @see #getImagen()
	 * @generated
	 */
	void setImagen(String value);

} // Dialogo
