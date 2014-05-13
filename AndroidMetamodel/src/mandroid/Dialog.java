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
 *   <li>{@link mandroid.Dialog#getTime <em>Time</em>}</li>
 *   <li>{@link mandroid.Dialog#getText <em>Text</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The literals are from the enumeration {@link mandroid.Length}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see mandroid.Length
	 * @see #setTime(Length)
	 * @see mandroid.MandroidPackage#getDialog_Time()
	 * @model
	 * @generated
	 */
	Length getTime();

	/**
	 * Sets the value of the '{@link mandroid.Dialog#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see mandroid.Length
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Length value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see mandroid.MandroidPackage#getDialog_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link mandroid.Dialog#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Dialog
