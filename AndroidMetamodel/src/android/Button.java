/**
 */
package android;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Button#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Widget {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link android.Action#getButtonOwner <em>Button Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference.
	 * @see #setTriggers(Action)
	 * @see android.AndroidPackage#getButton_Triggers()
	 * @see android.Action#getButtonOwner
	 * @model opposite="buttonOwner" containment="true"
	 * @generated
	 */
	Action getTriggers();

	/**
	 * Sets the value of the '{@link android.Button#getTriggers <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' containment reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Action value);

} // Button
