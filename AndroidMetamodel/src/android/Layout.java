/**
 */
package android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Layout#getName <em>Name</em>}</li>
 *   <li>{@link android.Layout#getType <em>Type</em>}</li>
 *   <li>{@link android.Layout#getContains <em>Contains</em>}</li>
 *   <li>{@link android.Layout#getLayOn <em>Lay On</em>}</li>
 *   <li>{@link android.Layout#getEsMostrado <em>Es Mostrado</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see android.AndroidPackage#getLayout_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link android.Layout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link android.LayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see android.LayoutType
	 * @see #setType(LayoutType)
	 * @see android.AndroidPackage#getLayout_Type()
	 * @model
	 * @generated
	 */
	LayoutType getType();

	/**
	 * Sets the value of the '{@link android.Layout#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see android.LayoutType
	 * @see #getType()
	 * @generated
	 */
	void setType(LayoutType value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link android.Widget}.
	 * It is bidirectional and its opposite is '{@link android.Widget#getLayoutOwner <em>Layout Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see android.AndroidPackage#getLayout_Contains()
	 * @see android.Widget#getLayoutOwner
	 * @model opposite="layoutOwner" containment="true"
	 * @generated
	 */
	EList<Widget> getContains();

	/**
	 * Returns the value of the '<em><b>Lay On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link android.Aplication#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lay On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lay On</em>' container reference.
	 * @see #setLayOn(Aplication)
	 * @see android.AndroidPackage#getLayout_LayOn()
	 * @see android.Aplication#getContains
	 * @model opposite="contains" required="true" transient="false"
	 * @generated
	 */
	Aplication getLayOn();

	/**
	 * Sets the value of the '{@link android.Layout#getLayOn <em>Lay On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lay On</em>' container reference.
	 * @see #getLayOn()
	 * @generated
	 */
	void setLayOn(Aplication value);

	/**
	 * Returns the value of the '<em><b>Es Mostrado</b></em>' reference list.
	 * The list contents are of type {@link android.Activity}.
	 * It is bidirectional and its opposite is '{@link android.Activity#getMuestra <em>Muestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Mostrado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Mostrado</em>' reference list.
	 * @see android.AndroidPackage#getLayout_EsMostrado()
	 * @see android.Activity#getMuestra
	 * @model opposite="muestra"
	 * @generated
	 */
	EList<Activity> getEsMostrado();

} // Layout
