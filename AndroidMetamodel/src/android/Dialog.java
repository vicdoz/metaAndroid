/**
 */
package android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Dialog#getTime <em>Time</em>}</li>
 *   <li>{@link android.Dialog#getText <em>Text</em>}</li>
 *   <li>{@link android.Dialog#getActionOwner <em>Action Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getDialog()
 * @model
 * @generated
 */
public interface Dialog extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The literals are from the enumeration {@link android.Length}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see android.Length
	 * @see #setTime(Length)
	 * @see android.AndroidPackage#getDialog_Time()
	 * @model
	 * @generated
	 */
	Length getTime();

	/**
	 * Sets the value of the '{@link android.Dialog#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see android.Length
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
	 * @see android.AndroidPackage#getDialog_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link android.Dialog#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Action Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link android.Action#getShows <em>Shows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Owner</em>' container reference.
	 * @see #setActionOwner(Action)
	 * @see android.AndroidPackage#getDialog_ActionOwner()
	 * @see android.Action#getShows
	 * @model opposite="shows" required="true" transient="false"
	 * @generated
	 */
	Action getActionOwner();

	/**
	 * Sets the value of the '{@link android.Dialog#getActionOwner <em>Action Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Owner</em>' container reference.
	 * @see #getActionOwner()
	 * @generated
	 */
	void setActionOwner(Action value);

} // Dialog
