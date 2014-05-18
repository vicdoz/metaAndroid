/**
 */
package android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Activity#getName <em>Name</em>}</li>
 *   <li>{@link android.Activity#getPackage <em>Package</em>}</li>
 *   <li>{@link android.Activity#isMain <em>Main</em>}</li>
 *   <li>{@link android.Activity#getShow <em>Show</em>}</li>
 *   <li>{@link android.Activity#getRunsIn <em>Runs In</em>}</li>
 *   <li>{@link android.Activity#getMuestra <em>Muestra</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getActivity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameActivity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameActivity='self.runsIn.run -> select(c|c.package = self.package and c.name = self.name) -> size() = 1'"
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
	 * @see android.AndroidPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link android.Activity#getName <em>Name</em>}' attribute.
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
	 * @see android.AndroidPackage#getActivity_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link android.Activity#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

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
	 * @see android.AndroidPackage#getActivity_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link android.Activity#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link android.Menu#getIsShowed <em>Is Showed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' reference.
	 * @see #setShow(Menu)
	 * @see android.AndroidPackage#getActivity_Show()
	 * @see android.Menu#getIsShowed
	 * @model opposite="isShowed"
	 * @generated
	 */
	Menu getShow();

	/**
	 * Sets the value of the '{@link android.Activity#getShow <em>Show</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' reference.
	 * @see #getShow()
	 * @generated
	 */
	void setShow(Menu value);

	/**
	 * Returns the value of the '<em><b>Runs In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link android.Aplication#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs In</em>' reference.
	 * @see #setRunsIn(Aplication)
	 * @see android.AndroidPackage#getActivity_RunsIn()
	 * @see android.Aplication#getRun
	 * @model opposite="run" required="true"
	 * @generated
	 */
	Aplication getRunsIn();

	/**
	 * Sets the value of the '{@link android.Activity#getRunsIn <em>Runs In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs In</em>' reference.
	 * @see #getRunsIn()
	 * @generated
	 */
	void setRunsIn(Aplication value);

	/**
	 * Returns the value of the '<em><b>Muestra</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link android.Layout#getEsMostrado <em>Es Mostrado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Muestra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Muestra</em>' reference.
	 * @see #setMuestra(Layout)
	 * @see android.AndroidPackage#getActivity_Muestra()
	 * @see android.Layout#getEsMostrado
	 * @model opposite="esMostrado" required="true"
	 * @generated
	 */
	Layout getMuestra();

	/**
	 * Sets the value of the '{@link android.Activity#getMuestra <em>Muestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Muestra</em>' reference.
	 * @see #getMuestra()
	 * @generated
	 */
	void setMuestra(Layout value);

} // Activity
