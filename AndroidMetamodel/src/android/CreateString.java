/**
 */
package android;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.CreateString#getStored <em>Stored</em>}</li>
 *   <li>{@link android.CreateString#getName <em>Name</em>}</li>
 *   <li>{@link android.CreateString#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getCreateString()
 * @model
 * @generated
 */
public interface CreateString extends EObject {
	/**
	 * Returns the value of the '<em><b>Stored</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link android.Aplication#getCreates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored</em>' container reference.
	 * @see #setStored(Aplication)
	 * @see android.AndroidPackage#getCreateString_Stored()
	 * @see android.Aplication#getCreates
	 * @model opposite="creates" required="true" transient="false"
	 * @generated
	 */
	Aplication getStored();

	/**
	 * Sets the value of the '{@link android.CreateString#getStored <em>Stored</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stored</em>' container reference.
	 * @see #getStored()
	 * @generated
	 */
	void setStored(Aplication value);

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
	 * @see android.AndroidPackage#getCreateString_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link android.CreateString#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see android.AndroidPackage#getCreateString_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link android.CreateString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CreateString
