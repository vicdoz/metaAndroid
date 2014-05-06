/**
 */
package Android;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Android.Widget#getPerteneceAlayout <em>Pertenece Alayout</em>}</li>
 *   <li>{@link Android.Widget#getEsControladoPor <em>Es Controlado Por</em>}</li>
 *   <li>{@link Android.Widget#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Pertenece Alayout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Layout#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pertenece Alayout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pertenece Alayout</em>' reference.
	 * @see #setPerteneceAlayout(Layout)
	 * @see Android.AndroidPackage#getWidget_PerteneceAlayout()
	 * @see Android.Layout#getWidget
	 * @model opposite="widget" required="true"
	 * @generated
	 */
	Layout getPerteneceAlayout();

	/**
	 * Sets the value of the '{@link Android.Widget#getPerteneceAlayout <em>Pertenece Alayout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pertenece Alayout</em>' reference.
	 * @see #getPerteneceAlayout()
	 * @generated
	 */
	void setPerteneceAlayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Es Controlado Por</b></em>' reference list.
	 * The list contents are of type {@link Android.Controlador}.
	 * It is bidirectional and its opposite is '{@link Android.Controlador#getManejaWidget <em>Maneja Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Controlado Por</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Controlado Por</em>' reference list.
	 * @see Android.AndroidPackage#getWidget_EsControladoPor()
	 * @see Android.Controlador#getManejaWidget
	 * @model opposite="manejaWidget"
	 * @generated
	 */
	EList<Controlador> getEsControladoPor();

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
	 * @see Android.AndroidPackage#getWidget_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Android.Widget#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Widget
