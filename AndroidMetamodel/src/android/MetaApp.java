/**
 */
package android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.MetaApp#getCreateApp <em>Create App</em>}</li>
 *   <li>{@link android.MetaApp#getCreateActivity <em>Create Activity</em>}</li>
 *   <li>{@link android.MetaApp#getCreateMenu <em>Create Menu</em>}</li>
 *   <li>{@link android.MetaApp#getCreate_String <em>Create String</em>}</li>
 *   <li>{@link android.MetaApp#getCreateLayout <em>Create Layout</em>}</li>
 *   <li>{@link android.MetaApp#getCreateItem <em>Create Item</em>}</li>
 *   <li>{@link android.MetaApp#getCreateWidget <em>Create Widget</em>}</li>
 *   <li>{@link android.MetaApp#getCreateAction <em>Create Action</em>}</li>
 *   <li>{@link android.MetaApp#getCreateDialog <em>Create Dialog</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getMetaApp()
 * @model
 * @generated
 */
public interface MetaApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Create App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create App</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create App</em>' containment reference.
	 * @see #setCreateApp(Aplication)
	 * @see android.AndroidPackage#getMetaApp_CreateApp()
	 * @model containment="true"
	 * @generated
	 */
	Aplication getCreateApp();

	/**
	 * Sets the value of the '{@link android.MetaApp#getCreateApp <em>Create App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create App</em>' containment reference.
	 * @see #getCreateApp()
	 * @generated
	 */
	void setCreateApp(Aplication value);

	/**
	 * Returns the value of the '<em><b>Create Activity</b></em>' containment reference list.
	 * The list contents are of type {@link android.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Activity</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getCreateActivity();

	/**
	 * Returns the value of the '<em><b>Create Menu</b></em>' containment reference list.
	 * The list contents are of type {@link android.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Menu</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateMenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getCreateMenu();

	/**
	 * Returns the value of the '<em><b>Create String</b></em>' containment reference list.
	 * The list contents are of type {@link android.CreateString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create String</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create String</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_Create_String()
	 * @model containment="true"
	 * @generated
	 */
	EList<CreateString> getCreate_String();

	/**
	 * Returns the value of the '<em><b>Create Layout</b></em>' containment reference list.
	 * The list contents are of type {@link android.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Layout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Layout</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateLayout()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layout> getCreateLayout();

	/**
	 * Returns the value of the '<em><b>Create Item</b></em>' containment reference list.
	 * The list contents are of type {@link android.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Item</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getCreateItem();

	/**
	 * Returns the value of the '<em><b>Create Widget</b></em>' containment reference list.
	 * The list contents are of type {@link android.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Widget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Widget</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateWidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getCreateWidget();

	/**
	 * Returns the value of the '<em><b>Create Action</b></em>' containment reference list.
	 * The list contents are of type {@link android.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Action</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getCreateAction();

	/**
	 * Returns the value of the '<em><b>Create Dialog</b></em>' containment reference list.
	 * The list contents are of type {@link android.Dialog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Dialog</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Dialog</em>' containment reference list.
	 * @see android.AndroidPackage#getMetaApp_CreateDialog()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dialog> getCreateDialog();

} // MetaApp
