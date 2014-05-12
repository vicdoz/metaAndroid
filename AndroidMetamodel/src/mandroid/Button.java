/**
 */
package mandroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mandroid.Button#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Widget {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference.
	 * @see #setTriggers(Action)
	 * @see mandroid.MandroidPackage#getButton_Triggers()
	 * @model
	 * @generated
	 */
	Action getTriggers();

	/**
	 * Sets the value of the '{@link mandroid.Button#getTriggers <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Action value);

} // Button
