/**
 */
package android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Menu#getId <em>Id</em>}</li>
 *   <li>{@link android.Menu#getIsShowed <em>Is Showed</em>}</li>
 *   <li>{@link android.Menu#getHasItem <em>Has Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see android.AndroidPackage#getMenu_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link android.Menu#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Showed</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link android.Activity#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Showed</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Showed</em>' reference.
	 * @see #setIsShowed(Activity)
	 * @see android.AndroidPackage#getMenu_IsShowed()
	 * @see android.Activity#getShow
	 * @model opposite="show" required="true"
	 * @generated
	 */
	Activity getIsShowed();

	/**
	 * Sets the value of the '{@link android.Menu#getIsShowed <em>Is Showed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Showed</em>' reference.
	 * @see #getIsShowed()
	 * @generated
	 */
	void setIsShowed(Activity value);

	/**
	 * Returns the value of the '<em><b>Has Item</b></em>' reference list.
	 * The list contents are of type {@link android.Item}.
	 * It is bidirectional and its opposite is '{@link android.Item#getMenuOwner <em>Menu Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Item</em>' reference list.
	 * @see android.AndroidPackage#getMenu_HasItem()
	 * @see android.Item#getMenuOwner
	 * @model opposite="menuOwner"
	 * @generated
	 */
	EList<Item> getHasItem();

} // Menu
