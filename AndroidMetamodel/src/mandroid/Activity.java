/**
 */
package mandroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mandroid.Activity#getName <em>Name</em>}</li>
 *   <li>{@link mandroid.Activity#getPackage <em>Package</em>}</li>
 *   <li>{@link mandroid.Activity#getRunsIn <em>Runs In</em>}</li>
 *   <li>{@link mandroid.Activity#isMain <em>Main</em>}</li>
 *   <li>{@link mandroid.Activity#getMuestra <em>Muestra</em>}</li>
 *   <li>{@link mandroid.Activity#getShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @see mandroid.MandroidPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
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
	 * @see mandroid.MandroidPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mandroid.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see mandroid.MandroidPackage#getActivity_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link mandroid.Activity#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Runs In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mandroid.Aplication#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs In</em>' container reference.
	 * @see #setRunsIn(Aplication)
	 * @see mandroid.MandroidPackage#getActivity_RunsIn()
	 * @see mandroid.Aplication#getRun
	 * @model opposite="run" required="true" transient="false"
	 * @generated
	 */
	Aplication getRunsIn();

	/**
	 * Sets the value of the '{@link mandroid.Activity#getRunsIn <em>Runs In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs In</em>' container reference.
	 * @see #getRunsIn()
	 * @generated
	 */
	void setRunsIn(Aplication value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see mandroid.MandroidPackage#getActivity_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link mandroid.Activity#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Muestra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mandroid.Layout#getEsMostrado <em>Es Mostrado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Muestra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Muestra</em>' reference.
	 * @see #setMuestra(Layout)
	 * @see mandroid.MandroidPackage#getActivity_Muestra()
	 * @see mandroid.Layout#getEsMostrado
	 * @model opposite="esMostrado"
	 * @generated
	 */
	Layout getMuestra();

	/**
	 * Sets the value of the '{@link mandroid.Activity#getMuestra <em>Muestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Muestra</em>' reference.
	 * @see #getMuestra()
	 * @generated
	 */
	void setMuestra(Layout value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' containment reference.
	 * @see #setShow(Menu)
	 * @see mandroid.MandroidPackage#getActivity_Show()
	 * @model containment="true"
	 * @generated
	 */
	Menu getShow();

	/**
	 * Sets the value of the '{@link mandroid.Activity#getShow <em>Show</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' containment reference.
	 * @see #getShow()
	 * @generated
	 */
	void setShow(Menu value);

} // Activity
