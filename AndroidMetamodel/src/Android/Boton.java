/**
 */
package Android;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.Boton#getAccion <em>Accion</em>}</li>
 *   <li>{@link Android.Boton#getTexto <em>Texto</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getBoton()
 * @model
 * @generated
 */
public interface Boton extends Widget {
	/**
	 * Returns the value of the '<em><b>Accion</b></em>' reference list.
	 * The list contents are of type {@link Android.accion}.
	 * It is bidirectional and its opposite is '{@link Android.accion#getEsAccionadoPor <em>Es Accionado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' reference list.
	 * @see Android.AndroidPackage#getBoton_Accion()
	 * @see Android.accion#getEsAccionadoPor
	 * @model opposite="esAccionadoPor" required="true"
	 * @generated
	 */
	EList<accion> getAccion();

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
	 * @see Android.AndroidPackage#getBoton_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link Android.Boton#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

} // Boton
