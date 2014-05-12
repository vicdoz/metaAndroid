/**
 */
package mandroid;

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
 *   <li>{@link mandroid.Layout#getType <em>Type</em>}</li>
 *   <li>{@link mandroid.Layout#getContains <em>Contains</em>}</li>
 *   <li>{@link mandroid.Layout#getLayOn <em>Lay On</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mandroid.LayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mandroid.LayoutType
	 * @see #setType(LayoutType)
	 * @see mandroid.MandroidPackage#getLayout_Type()
	 * @model
	 * @generated
	 */
	LayoutType getType();

	/**
	 * Sets the value of the '{@link mandroid.Layout#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mandroid.LayoutType
	 * @see #getType()
	 * @generated
	 */
	void setType(LayoutType value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link mandroid.Widget}.
	 * It is bidirectional and its opposite is '{@link mandroid.Widget#getLayoutOwner <em>Layout Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see mandroid.MandroidPackage#getLayout_Contains()
	 * @see mandroid.Widget#getLayoutOwner
	 * @model opposite="layoutOwner" containment="true"
	 * @generated
	 */
	EList<Widget> getContains();

	/**
	 * Returns the value of the '<em><b>Lay On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mandroid.Aplication#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lay On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lay On</em>' container reference.
	 * @see #setLayOn(Aplication)
	 * @see mandroid.MandroidPackage#getLayout_LayOn()
	 * @see mandroid.Aplication#getContains
	 * @model opposite="contains" transient="false"
	 * @generated
	 */
	Aplication getLayOn();

	/**
	 * Sets the value of the '{@link mandroid.Layout#getLayOn <em>Lay On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lay On</em>' container reference.
	 * @see #getLayOn()
	 * @generated
	 */
	void setLayOn(Aplication value);

} // Layout
