/**
 */
package Android.impl;

import Android.Activity;
import Android.AndroidFactory;
import Android.AndroidPackage;
import Android.Aplicacion;
import Android.Boton;
import Android.Controlador;
import Android.Dialogo;
import Android.EClass0;
import Android.EditText;
import Android.Layout;
import Android.TextView;
import Android.Widget;
import Android.accion;
import Android.containers;
import Android.duracionDialogo;
import Android.objects;
import Android.permiso;
import Android.tipoEntradaTexto;
import Android.tipoLayout;
import Android.tipo_permiso;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidPackageImpl extends EPackageImpl implements AndroidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controladorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClass0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permisoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoLayoutEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipo_permisoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoEntradaTextoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum duracionDialogoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Android.AndroidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AndroidPackageImpl() {
		super(eNS_URI, AndroidFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AndroidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AndroidPackage init() {
		if (isInited) return (AndroidPackage)EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI);

		// Obtain or create and register package
		AndroidPackageImpl theAndroidPackage = (AndroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AndroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AndroidPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAndroidPackage.createPackageContents();

		// Initialize created meta-data
		theAndroidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAndroidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AndroidPackage.eNS_URI, theAndroidPackage);
		return theAndroidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicacion() {
		return aplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Nombre() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Actividades() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Layout() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Permiso() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_MinSDK() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_TargetSDK() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Paquete() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_VersionCode() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_VersionName() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_App() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Controla() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Nombre() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Paquete() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Padre() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Hijo() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Widget() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_PerteneceAapp() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Activities() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Tipo() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlador() {
		return controladorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlador_EsControladaPor() {
		return (EReference)controladorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlador_ManejaWidget() {
		return (EReference)controladorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlador_HaceAccion() {
		return (EReference)controladorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlador_Nombre() {
		return (EAttribute)controladorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass0() {
		return eClass0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_PerteneceAlayout() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_EsControladoPor() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Id() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoton() {
		return botonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoton_Accion() {
		return (EReference)botonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoton_Texto() {
		return (EAttribute)botonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditText() {
		return editTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditText_Tipo() {
		return (EAttribute)editTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccion() {
		return accionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaccion_Click() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaccion_LongClick() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccion_PerteneceA() {
		return (EReference)accionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccion_Muestra() {
		return (EReference)accionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccion_EsAccionadoPor() {
		return (EReference)accionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogo() {
		return dialogoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogo_EsMostradoEnUnaAccion() {
		return (EReference)dialogoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogo_Duracion() {
		return (EAttribute)dialogoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogo_Texto() {
		return (EAttribute)dialogoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogo_Imagen() {
		return (EAttribute)dialogoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpermiso() {
		return permisoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpermiso_DaPermisoA() {
		return (EReference)permisoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpermiso_Nombre() {
		return (EReference)permisoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcontainers() {
		return containersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getobjects() {
		return objectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextView() {
		return textViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextView_Text() {
		return (EAttribute)textViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettipoLayout() {
		return tipoLayoutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettipo_permiso() {
		return tipo_permisoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettipoEntradaTexto() {
		return tipoEntradaTextoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getduracionDialogo() {
		return duracionDialogoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidFactory getAndroidFactory() {
		return (AndroidFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aplicacionEClass = createEClass(APLICACION);
		createEAttribute(aplicacionEClass, APLICACION__NOMBRE);
		createEReference(aplicacionEClass, APLICACION__ACTIVIDADES);
		createEReference(aplicacionEClass, APLICACION__LAYOUT);
		createEAttribute(aplicacionEClass, APLICACION__PERMISO);
		createEAttribute(aplicacionEClass, APLICACION__MIN_SDK);
		createEAttribute(aplicacionEClass, APLICACION__TARGET_SDK);
		createEAttribute(aplicacionEClass, APLICACION__PAQUETE);
		createEAttribute(aplicacionEClass, APLICACION__VERSION_CODE);
		createEAttribute(aplicacionEClass, APLICACION__VERSION_NAME);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__APP);
		createEReference(activityEClass, ACTIVITY__CONTROLA);
		createEAttribute(activityEClass, ACTIVITY__NOMBRE);
		createEAttribute(activityEClass, ACTIVITY__PAQUETE);

		layoutEClass = createEClass(LAYOUT);
		createEReference(layoutEClass, LAYOUT__PADRE);
		createEReference(layoutEClass, LAYOUT__HIJO);
		createEReference(layoutEClass, LAYOUT__WIDGET);
		createEReference(layoutEClass, LAYOUT__PERTENECE_AAPP);
		createEReference(layoutEClass, LAYOUT__ACTIVITIES);
		createEAttribute(layoutEClass, LAYOUT__TIPO);

		controladorEClass = createEClass(CONTROLADOR);
		createEReference(controladorEClass, CONTROLADOR__ES_CONTROLADA_POR);
		createEReference(controladorEClass, CONTROLADOR__MANEJA_WIDGET);
		createEReference(controladorEClass, CONTROLADOR__HACE_ACCION);
		createEAttribute(controladorEClass, CONTROLADOR__NOMBRE);

		eClass0EClass = createEClass(ECLASS0);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__PERTENECE_ALAYOUT);
		createEReference(widgetEClass, WIDGET__ES_CONTROLADO_POR);
		createEAttribute(widgetEClass, WIDGET__ID);

		botonEClass = createEClass(BOTON);
		createEReference(botonEClass, BOTON__ACCION);
		createEAttribute(botonEClass, BOTON__TEXTO);

		editTextEClass = createEClass(EDIT_TEXT);
		createEAttribute(editTextEClass, EDIT_TEXT__TIPO);

		accionEClass = createEClass(ACCION);
		createEAttribute(accionEClass, ACCION__CLICK);
		createEAttribute(accionEClass, ACCION__LONG_CLICK);
		createEReference(accionEClass, ACCION__PERTENECE_A);
		createEReference(accionEClass, ACCION__MUESTRA);
		createEReference(accionEClass, ACCION__ES_ACCIONADO_POR);

		dialogoEClass = createEClass(DIALOGO);
		createEReference(dialogoEClass, DIALOGO__ES_MOSTRADO_EN_UNA_ACCION);
		createEAttribute(dialogoEClass, DIALOGO__DURACION);
		createEAttribute(dialogoEClass, DIALOGO__TEXTO);
		createEAttribute(dialogoEClass, DIALOGO__IMAGEN);

		permisoEClass = createEClass(PERMISO);
		createEReference(permisoEClass, PERMISO__DA_PERMISO_A);
		createEReference(permisoEClass, PERMISO__NOMBRE);

		containersEClass = createEClass(CONTAINERS);

		objectsEClass = createEClass(OBJECTS);

		textViewEClass = createEClass(TEXT_VIEW);
		createEAttribute(textViewEClass, TEXT_VIEW__TEXT);

		// Create enums
		tipoLayoutEEnum = createEEnum(TIPO_LAYOUT);
		tipo_permisoEEnum = createEEnum(TIPO_PERMISO);
		tipoEntradaTextoEEnum = createEEnum(TIPO_ENTRADA_TEXTO);
		duracionDialogoEEnum = createEEnum(DURACION_DIALOGO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		botonEClass.getESuperTypes().add(this.getWidget());
		editTextEClass.getESuperTypes().add(this.getWidget());
		containersEClass.getESuperTypes().add(this.getWidget());
		objectsEClass.getESuperTypes().add(this.getWidget());
		textViewEClass.getESuperTypes().add(this.getWidget());

		// Initialize classes, features, and operations; add parameters
		initEClass(aplicacionEClass, Aplicacion.class, "Aplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAplicacion_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Actividades(), this.getActivity(), this.getActivity_App(), "actividades", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Layout(), this.getLayout(), this.getLayout_PerteneceAapp(), "layout", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Permiso(), this.gettipo_permiso(), "permiso", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_MinSDK(), ecorePackage.getEIntegerObject(), "minSDK", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_TargetSDK(), ecorePackage.getEIntegerObject(), "targetSDK", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Paquete(), ecorePackage.getEString(), "paquete", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_VersionCode(), ecorePackage.getEIntegerObject(), "versionCode", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_VersionName(), ecorePackage.getEString(), "versionName", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_App(), this.getAplicacion(), this.getAplicacion_Actividades(), "app", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Controla(), this.getControlador(), this.getControlador_EsControladaPor(), "controla", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Paquete(), ecorePackage.getEString(), "paquete", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayout_Padre(), this.getLayout(), this.getLayout_Hijo(), "padre", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Hijo(), this.getLayout(), this.getLayout_Padre(), "hijo", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Widget(), this.getWidget(), this.getWidget_PerteneceAlayout(), "widget", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_PerteneceAapp(), this.getAplicacion(), this.getAplicacion_Layout(), "perteneceAapp", null, 1, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Activities(), this.getActivity(), null, "activities", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Tipo(), this.gettipoLayout(), "tipo", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controladorEClass, Controlador.class, "Controlador", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlador_EsControladaPor(), this.getActivity(), this.getActivity_Controla(), "esControladaPor", null, 1, 1, Controlador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlador_ManejaWidget(), this.getWidget(), this.getWidget_EsControladoPor(), "manejaWidget", null, 1, 1, Controlador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlador_HaceAccion(), this.getaccion(), this.getaccion_PerteneceA(), "haceAccion", null, 0, -1, Controlador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlador_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Controlador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClass0EClass, EClass0.class, "EClass0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_PerteneceAlayout(), this.getLayout(), this.getLayout_Widget(), "perteneceAlayout", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_EsControladoPor(), this.getControlador(), this.getControlador_ManejaWidget(), "esControladoPor", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Id(), ecorePackage.getEString(), "id", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botonEClass, Boton.class, "Boton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoton_Accion(), this.getaccion(), this.getaccion_EsAccionadoPor(), "accion", null, 1, -1, Boton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoton_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Boton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editTextEClass, EditText.class, "EditText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEditText_Tipo(), this.gettipoEntradaTexto(), "tipo", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accionEClass, accion.class, "accion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getaccion_Click(), ecorePackage.getEBoolean(), "click", null, 0, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getaccion_LongClick(), ecorePackage.getEBoolean(), "longClick", null, 0, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getaccion_PerteneceA(), this.getControlador(), this.getControlador_HaceAccion(), "perteneceA", null, 1, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getaccion_Muestra(), this.getDialogo(), this.getDialogo_EsMostradoEnUnaAccion(), "muestra", null, 0, 1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getaccion_EsAccionadoPor(), this.getBoton(), this.getBoton_Accion(), "esAccionadoPor", null, 1, -1, accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogoEClass, Dialogo.class, "Dialogo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogo_EsMostradoEnUnaAccion(), this.getaccion(), this.getaccion_Muestra(), "esMostradoEnUnaAccion", null, 1, 1, Dialogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogo_Duracion(), this.getduracionDialogo(), "Duracion", null, 0, 1, Dialogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogo_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Dialogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogo_Imagen(), ecorePackage.getEString(), "Imagen", null, 0, 1, Dialogo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permisoEClass, permiso.class, "permiso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getpermiso_DaPermisoA(), this.getAplicacion(), null, "daPermisoA", null, 1, 1, permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpermiso_Nombre(), this.getpermiso(), null, "nombre", null, 0, 1, permiso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containersEClass, containers.class, "containers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectsEClass, objects.class, "objects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textViewEClass, TextView.class, "TextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextView_Text(), ecorePackage.getEIntegerObject(), "text", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoLayoutEEnum, tipoLayout.class, "tipoLayout");
		addEEnumLiteral(tipoLayoutEEnum, tipoLayout.HORIZONTAL);
		addEEnumLiteral(tipoLayoutEEnum, tipoLayout.VERTICAL);
		addEEnumLiteral(tipoLayoutEEnum, tipoLayout.RELATIVE);

		initEEnum(tipo_permisoEEnum, tipo_permiso.class, "tipo_permiso");
		addEEnumLiteral(tipo_permisoEEnum, tipo_permiso.INTERNET);
		addEEnumLiteral(tipo_permisoEEnum, tipo_permiso.FINE_LOCATION);
		addEEnumLiteral(tipo_permisoEEnum, tipo_permiso.COARSE_LOCATION);

		initEEnum(tipoEntradaTextoEEnum, tipoEntradaTexto.class, "tipoEntradaTexto");
		addEEnumLiteral(tipoEntradaTextoEEnum, tipoEntradaTexto.NORMAL);
		addEEnumLiteral(tipoEntradaTextoEEnum, tipoEntradaTexto.PASSWORD);
		addEEnumLiteral(tipoEntradaTextoEEnum, tipoEntradaTexto.MAIL);
		addEEnumLiteral(tipoEntradaTextoEEnum, tipoEntradaTexto.TELEFONO);

		initEEnum(duracionDialogoEEnum, duracionDialogo.class, "duracionDialogo");
		addEEnumLiteral(duracionDialogoEEnum, duracionDialogo.SHORT);
		addEEnumLiteral(duracionDialogoEEnum, duracionDialogo.LONG);

		// Create resource
		createResource(eNS_URI);
	}

} //AndroidPackageImpl
