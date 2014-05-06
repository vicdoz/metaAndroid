/**
 */
package Android;

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
 *   <li>{@link Android.Layout#getPadre <em>Padre</em>}</li>
 *   <li>{@link Android.Layout#getHijo <em>Hijo</em>}</li>
 *   <li>{@link Android.Layout#getWidget <em>Widget</em>}</li>
 *   <li>{@link Android.Layout#getPerteneceAapp <em>Pertenece Aapp</em>}</li>
 *   <li>{@link Android.Layout#getActivities <em>Activities</em>}</li>
 *   <li>{@link Android.Layout#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Android.AndroidPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Padre</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Layout#getHijo <em>Hijo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padre</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padre</em>' reference.
	 * @see #setPadre(Layout)
	 * @see Android.AndroidPackage#getLayout_Padre()
	 * @see Android.Layout#getHijo
	 * @model opposite="hijo"
	 * @generated
	 */
	Layout getPadre();

	/**
	 * Sets the value of the '{@link Android.Layout#getPadre <em>Padre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padre</em>' reference.
	 * @see #getPadre()
	 * @generated
	 */
	void setPadre(Layout value);

	/**
	 * Returns the value of the '<em><b>Hijo</b></em>' reference list.
	 * The list contents are of type {@link Android.Layout}.
	 * It is bidirectional and its opposite is '{@link Android.Layout#getPadre <em>Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hijo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hijo</em>' reference list.
	 * @see Android.AndroidPackage#getLayout_Hijo()
	 * @see Android.Layout#getPadre
	 * @model opposite="padre"
	 * @generated
	 */
	EList<Layout> getHijo();

	/**
	 * Returns the value of the '<em><b>Widget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Android.Widget#getPerteneceAlayout <em>Pertenece Alayout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' reference.
	 * @see #setWidget(Widget)
	 * @see Android.AndroidPackage#getLayout_Widget()
	 * @see Android.Widget#getPerteneceAlayout
	 * @model opposite="perteneceAlayout"
	 * @generated
	 */
	Widget getWidget();

	/**
	 * Sets the value of the '{@link Android.Layout#getWidget <em>Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget</em>' reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(Widget value);

	/**
	 * Returns the value of the '<em><b>Pertenece Aapp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Android.Aplicacion#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pertenece Aapp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pertenece Aapp</em>' container reference.
	 * @see #setPerteneceAapp(Aplicacion)
	 * @see Android.AndroidPackage#getLayout_PerteneceAapp()
	 * @see Android.Aplicacion#getLayout
	 * @model opposite="layout" required="true" transient="false"
	 * @generated
	 */
	Aplicacion getPerteneceAapp();

	/**
	 * Sets the value of the '{@link Android.Layout#getPerteneceAapp <em>Pertenece Aapp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pertenece Aapp</em>' container reference.
	 * @see #getPerteneceAapp()
	 * @generated
	 */
	void setPerteneceAapp(Aplicacion value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link Android.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see Android.AndroidPackage#getLayout_Activities()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link Android.tipoLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see Android.tipoLayout
	 * @see #setTipo(tipoLayout)
	 * @see Android.AndroidPackage#getLayout_Tipo()
	 * @model
	 * @generated
	 */
	tipoLayout getTipo();

	/**
	 * Sets the value of the '{@link Android.Layout#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see Android.tipoLayout
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(tipoLayout value);

} // Layout
