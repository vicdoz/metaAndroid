/**
 */
package android;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link android.Button#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see android.AndroidPackage#getButton()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxActions minActions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxActions='self.triggers -> size() <= 2' minActions='self.triggers -> size() > 1'"
 * @generated
 */
public interface Button extends Widget {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link android.Action}.
	 * It is bidirectional and its opposite is '{@link android.Action#getButtonOwner <em>Button Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see android.AndroidPackage#getButton_Triggers()
	 * @see android.Action#getButtonOwner
	 * @model opposite="buttonOwner"
	 * @generated
	 */
	EList<Action> getTriggers();

} // Button
