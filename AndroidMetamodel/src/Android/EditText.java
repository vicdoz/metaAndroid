/**
 */
package Android;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.EditText#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getEditText()
 * @model
 * @generated
 */
public interface EditText extends Widget {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link Android.tipoEntradaTexto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see Android.tipoEntradaTexto
	 * @see #setTipo(tipoEntradaTexto)
	 * @see Android.AndroidPackage#getEditText_Tipo()
	 * @model
	 * @generated
	 */
	tipoEntradaTexto getTipo();

	/**
	 * Sets the value of the '{@link Android.EditText#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see Android.tipoEntradaTexto
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(tipoEntradaTexto value);

} // EditText
