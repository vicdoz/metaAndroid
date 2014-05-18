/**
 */
package android;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.TextField#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends Widget {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * The literals are from the enumeration {@link android.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see android.InputType
	 * @see #setInput(InputType)
	 * @see android.AndroidPackage#getTextField_Input()
	 * @model
	 * @generated
	 */
	InputType getInput();

	/**
	 * Sets the value of the '{@link android.TextField#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see android.InputType
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputType value);

} // TextField
