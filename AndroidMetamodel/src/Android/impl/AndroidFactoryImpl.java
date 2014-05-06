/**
 */
package Android.impl;

import Android.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidFactoryImpl extends EFactoryImpl implements AndroidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AndroidFactory init() {
		try {
			AndroidFactory theAndroidFactory = (AndroidFactory)EPackage.Registry.INSTANCE.getEFactory(AndroidPackage.eNS_URI);
			if (theAndroidFactory != null) {
				return theAndroidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndroidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AndroidPackage.APLICACION: return createAplicacion();
			case AndroidPackage.ACTIVITY: return createActivity();
			case AndroidPackage.LAYOUT: return createLayout();
			case AndroidPackage.CONTROLADOR: return createControlador();
			case AndroidPackage.ECLASS0: return createEClass0();
			case AndroidPackage.WIDGET: return createWidget();
			case AndroidPackage.BOTON: return createBoton();
			case AndroidPackage.EDIT_TEXT: return createEditText();
			case AndroidPackage.ACCION: return createaccion();
			case AndroidPackage.DIALOGO: return createDialogo();
			case AndroidPackage.PERMISO: return createpermiso();
			case AndroidPackage.CONTAINERS: return createcontainers();
			case AndroidPackage.OBJECTS: return createobjects();
			case AndroidPackage.TEXT_VIEW: return createTextView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AndroidPackage.TIPO_LAYOUT:
				return createtipoLayoutFromString(eDataType, initialValue);
			case AndroidPackage.TIPO_PERMISO:
				return createtipo_permisoFromString(eDataType, initialValue);
			case AndroidPackage.TIPO_ENTRADA_TEXTO:
				return createtipoEntradaTextoFromString(eDataType, initialValue);
			case AndroidPackage.DURACION_DIALOGO:
				return createduracionDialogoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AndroidPackage.TIPO_LAYOUT:
				return converttipoLayoutToString(eDataType, instanceValue);
			case AndroidPackage.TIPO_PERMISO:
				return converttipo_permisoToString(eDataType, instanceValue);
			case AndroidPackage.TIPO_ENTRADA_TEXTO:
				return converttipoEntradaTextoToString(eDataType, instanceValue);
			case AndroidPackage.DURACION_DIALOGO:
				return convertduracionDialogoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion createAplicacion() {
		AplicacionImpl aplicacion = new AplicacionImpl();
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlador createControlador() {
		ControladorImpl controlador = new ControladorImpl();
		return controlador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass0 createEClass0() {
		EClass0Impl eClass0 = new EClass0Impl();
		return eClass0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boton createBoton() {
		BotonImpl boton = new BotonImpl();
		return boton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditText createEditText() {
		EditTextImpl editText = new EditTextImpl();
		return editText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accion createaccion() {
		accionImpl accion = new accionImpl();
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogo createDialogo() {
		DialogoImpl dialogo = new DialogoImpl();
		return dialogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public permiso createpermiso() {
		permisoImpl permiso = new permisoImpl();
		return permiso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public containers createcontainers() {
		containersImpl containers = new containersImpl();
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public objects createobjects() {
		objectsImpl objects = new objectsImpl();
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextView createTextView() {
		TextViewImpl textView = new TextViewImpl();
		return textView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tipoLayout createtipoLayoutFromString(EDataType eDataType, String initialValue) {
		tipoLayout result = tipoLayout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttipoLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tipo_permiso createtipo_permisoFromString(EDataType eDataType, String initialValue) {
		tipo_permiso result = tipo_permiso.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttipo_permisoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tipoEntradaTexto createtipoEntradaTextoFromString(EDataType eDataType, String initialValue) {
		tipoEntradaTexto result = tipoEntradaTexto.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttipoEntradaTextoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public duracionDialogo createduracionDialogoFromString(EDataType eDataType, String initialValue) {
		duracionDialogo result = duracionDialogo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertduracionDialogoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidPackage getAndroidPackage() {
		return (AndroidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndroidPackage getPackage() {
		return AndroidPackage.eINSTANCE;
	}

} //AndroidFactoryImpl
