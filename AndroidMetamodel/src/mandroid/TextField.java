/**
 */
package mandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mandroid.TextField#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends Widget {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * The literals are from the enumeration {@link mandroid.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see mandroid.InputType
	 * @see #setInput(InputType)
	 * @see mandroid.MandroidPackage#getTextField_Input()
	 * @model
	 * @generated
	 */
	InputType getInput();

	/**
	 * Sets the value of the '{@link mandroid.TextField#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see mandroid.InputType
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputType value);

} // TextField
