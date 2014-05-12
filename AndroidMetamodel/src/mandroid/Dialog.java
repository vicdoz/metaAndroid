/**
 */
package mandroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mandroid.Dialog#getActionOwner <em>Action Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getDialog()
 * @model
 * @generated
 */
public interface Dialog extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mandroid.Action#getShows <em>Shows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Owner</em>' container reference.
	 * @see #setActionOwner(Action)
	 * @see mandroid.MandroidPackage#getDialog_ActionOwner()
	 * @see mandroid.Action#getShows
	 * @model opposite="shows" required="true" transient="false"
	 * @generated
	 */
	Action getActionOwner();

	/**
	 * Sets the value of the '{@link mandroid.Dialog#getActionOwner <em>Action Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Owner</em>' container reference.
	 * @see #getActionOwner()
	 * @generated
	 */
	void setActionOwner(Action value);

} // Dialog
