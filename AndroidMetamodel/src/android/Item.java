/**
 */
package android;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Item#getTittle <em>Tittle</em>}</li>
 *   <li>{@link android.Item#getOrder <em>Order</em>}</li>
 *   <li>{@link android.Item#getShowAsAction <em>Show As Action</em>}</li>
 *   <li>{@link android.Item#getId <em>Id</em>}</li>
 *   <li>{@link android.Item#getMenuOwner <em>Menu Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Tittle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tittle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tittle</em>' attribute.
	 * @see #setTittle(String)
	 * @see android.AndroidPackage#getItem_Tittle()
	 * @model
	 * @generated
	 */
	String getTittle();

	/**
	 * Sets the value of the '{@link android.Item#getTittle <em>Tittle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tittle</em>' attribute.
	 * @see #getTittle()
	 * @generated
	 */
	void setTittle(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(BigInteger)
	 * @see android.AndroidPackage#getItem_Order()
	 * @model
	 * @generated
	 */
	BigInteger getOrder();

	/**
	 * Sets the value of the '{@link android.Item#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Show As Action</b></em>' attribute.
	 * The literals are from the enumeration {@link android.TypeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show As Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show As Action</em>' attribute.
	 * @see android.TypeAction
	 * @see #setShowAsAction(TypeAction)
	 * @see android.AndroidPackage#getItem_ShowAsAction()
	 * @model
	 * @generated
	 */
	TypeAction getShowAsAction();

	/**
	 * Sets the value of the '{@link android.Item#getShowAsAction <em>Show As Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show As Action</em>' attribute.
	 * @see android.TypeAction
	 * @see #getShowAsAction()
	 * @generated
	 */
	void setShowAsAction(TypeAction value);

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
	 * @see android.AndroidPackage#getItem_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link android.Item#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Menu Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link android.Menu#getHasItem <em>Has Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Owner</em>' container reference.
	 * @see #setMenuOwner(Menu)
	 * @see android.AndroidPackage#getItem_MenuOwner()
	 * @see android.Menu#getHasItem
	 * @model opposite="hasItem" required="true" transient="false"
	 * @generated
	 */
	Menu getMenuOwner();

	/**
	 * Sets the value of the '{@link android.Item#getMenuOwner <em>Menu Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu Owner</em>' container reference.
	 * @see #getMenuOwner()
	 * @generated
	 */
	void setMenuOwner(Menu value);

} // Item
