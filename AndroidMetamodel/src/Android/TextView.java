/**
 */
package Android;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.TextView#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getTextView()
 * @model
 * @generated
 */
public interface TextView extends Widget {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(Integer)
	 * @see Android.AndroidPackage#getTextView_Text()
	 * @model
	 * @generated
	 */
	Integer getText();

	/**
	 * Sets the value of the '{@link Android.TextView#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(Integer value);

} // TextView
