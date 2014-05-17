/**
 */
package android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Action#getType <em>Type</em>}</li>
 *   <li>{@link android.Action#getButtonOwner <em>Button Owner</em>}</li>
 *   <li>{@link android.Action#getShows <em>Shows</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link android.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see android.ActionType
	 * @see #setType(ActionType)
	 * @see android.AndroidPackage#getAction_Type()
	 * @model
	 * @generated
	 */
	ActionType getType();

	/**
	 * Sets the value of the '{@link android.Action#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see android.ActionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Button Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link android.Button#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Owner</em>' container reference.
	 * @see #setButtonOwner(Button)
	 * @see android.AndroidPackage#getAction_ButtonOwner()
	 * @see android.Button#getTriggers
	 * @model opposite="triggers" required="true" transient="false"
	 * @generated
	 */
	Button getButtonOwner();

	/**
	 * Sets the value of the '{@link android.Action#getButtonOwner <em>Button Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Owner</em>' container reference.
	 * @see #getButtonOwner()
	 * @generated
	 */
	void setButtonOwner(Button value);

	/**
	 * Returns the value of the '<em><b>Shows</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link android.Dialog#getActionOwner <em>Action Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows</em>' containment reference.
	 * @see #setShows(Dialog)
	 * @see android.AndroidPackage#getAction_Shows()
	 * @see android.Dialog#getActionOwner
	 * @model opposite="actionOwner" containment="true" required="true"
	 * @generated
	 */
	Dialog getShows();

	/**
	 * Sets the value of the '{@link android.Action#getShows <em>Shows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shows</em>' containment reference.
	 * @see #getShows()
	 * @generated
	 */
	void setShows(Dialog value);

} // Action
