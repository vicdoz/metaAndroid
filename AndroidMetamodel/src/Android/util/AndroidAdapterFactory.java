/**
 */
package Android.util;

import Android.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Android.AndroidPackage
 * @generated
 */
public class AndroidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AndroidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AndroidPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndroidSwitch<Adapter> modelSwitch =
		new AndroidSwitch<Adapter>() {
			@Override
			public Adapter caseAplicacion(Aplicacion object) {
				return createAplicacionAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseControlador(Controlador object) {
				return createControladorAdapter();
			}
			@Override
			public Adapter caseEClass0(EClass0 object) {
				return createEClass0Adapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseBoton(Boton object) {
				return createBotonAdapter();
			}
			@Override
			public Adapter caseEditText(EditText object) {
				return createEditTextAdapter();
			}
			@Override
			public Adapter caseaccion(accion object) {
				return createaccionAdapter();
			}
			@Override
			public Adapter caseDialogo(Dialogo object) {
				return createDialogoAdapter();
			}
			@Override
			public Adapter casepermiso(permiso object) {
				return createpermisoAdapter();
			}
			@Override
			public Adapter casecontainers(containers object) {
				return createcontainersAdapter();
			}
			@Override
			public Adapter caseobjects(objects object) {
				return createobjectsAdapter();
			}
			@Override
			public Adapter caseTextView(TextView object) {
				return createTextViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Android.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Aplicacion
	 * @generated
	 */
	public Adapter createAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.Controlador <em>Controlador</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Controlador
	 * @generated
	 */
	public Adapter createControladorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.EClass0 <em>EClass0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.EClass0
	 * @generated
	 */
	public Adapter createEClass0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.Boton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Boton
	 * @generated
	 */
	public Adapter createBotonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.EditText
	 * @generated
	 */
	public Adapter createEditTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.accion <em>accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.accion
	 * @generated
	 */
	public Adapter createaccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.Dialogo <em>Dialogo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.Dialogo
	 * @generated
	 */
	public Adapter createDialogoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.permiso <em>permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.permiso
	 * @generated
	 */
	public Adapter createpermisoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.containers <em>containers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.containers
	 * @generated
	 */
	public Adapter createcontainersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.objects <em>objects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.objects
	 * @generated
	 */
	public Adapter createobjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Android.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Android.TextView
	 * @generated
	 */
	public Adapter createTextViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AndroidAdapterFactory
