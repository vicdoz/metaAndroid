/**
 */
package mandroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mandroid.Action#getShows <em>Shows</em>}</li>
 *   <li>{@link mandroid.Action#getButtonOwner <em>Button Owner</em>}</li>
 *   <li>{@link mandroid.Action#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Shows</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mandroid.Dialog#getActionOwner <em>Action Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows</em>' containment reference.
	 * @see #setShows(Dialog)
	 * @see mandroid.MandroidPackage#getAction_Shows()
	 * @see mandroid.Dialog#getActionOwner
	 * @model opposite="actionOwner" containment="true" required="true"
	 * @generated
	 */
	Dialog getShows();

	/**
	 * Sets the value of the '{@link mandroid.Action#getShows <em>Shows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shows</em>' containment reference.
	 * @see #getShows()
	 * @generated
	 */
	void setShows(Dialog value);

	/**
	 * Returns the value of the '<em><b>Button Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Owner</em>' reference.
	 * @see #setButtonOwner(Button)
	 * @see mandroid.MandroidPackage#getAction_ButtonOwner()
	 * @model
	 * @generated
	 */
	Button getButtonOwner();

	/**
	 * Sets the value of the '{@link mandroid.Action#getButtonOwner <em>Button Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Owner</em>' reference.
	 * @see #getButtonOwner()
	 * @generated
	 */
	void setButtonOwner(Button value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mandroid.TypeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mandroid.TypeAction
	 * @see #setType(TypeAction)
	 * @see mandroid.MandroidPackage#getAction_Type()
	 * @model
	 * @generated
	 */
	TypeAction getType();

	/**
	 * Sets the value of the '{@link mandroid.Action#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mandroid.TypeAction
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeAction value);

} // Action
