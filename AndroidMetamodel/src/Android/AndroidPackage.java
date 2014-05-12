/**
 */
package Android;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Android.AndroidFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 * @generated
 */
public interface AndroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Android";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Android";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Android";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidPackage eINSTANCE = Android.impl.AndroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link Android.impl.AplicacionImpl <em>Aplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.AplicacionImpl
	 * @see Android.impl.AndroidPackageImpl#getAplicacion()
	 * @generated
	 */
	int APLICACION = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__ACTIVIDADES = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Permiso</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__PERMISO = 3;

	/**
	 * The feature id for the '<em><b>Min SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__MIN_SDK = 4;

	/**
	 * The feature id for the '<em><b>Target SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__TARGET_SDK = 5;

	/**
	 * The feature id for the '<em><b>Paquete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__PAQUETE = 6;

	/**
	 * The feature id for the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__VERSION_CODE = 7;

	/**
	 * The feature id for the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__VERSION_NAME = 8;

	/**
	 * The number of structural features of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.ActivityImpl
	 * @see Android.impl.AndroidPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>App</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__APP = 0;

	/**
	 * The feature id for the '<em><b>Controla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTROLA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Paquete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PAQUETE = 3;

	/**
	 * The feature id for the '<em><b>Ismain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ISMAIN = 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.LayoutImpl
	 * @see Android.impl.AndroidPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Padre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADRE = 0;

	/**
	 * The feature id for the '<em><b>Hijo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HIJO = 1;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__WIDGET = 2;

	/**
	 * The feature id for the '<em><b>Pertenece Aapp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PERTENECE_AAPP = 3;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ACTIVITIES = 4;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TIPO = 5;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.ControladorImpl <em>Controlador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.ControladorImpl
	 * @see Android.impl.AndroidPackageImpl#getControlador()
	 * @generated
	 */
	int CONTROLADOR = 3;

	/**
	 * The feature id for the '<em><b>Es Controlada Por</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR__ES_CONTROLADA_POR = 0;

	/**
	 * The feature id for the '<em><b>Maneja Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR__MANEJA_WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Hace Accion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR__HACE_ACCION = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR__NOMBRE = 3;

	/**
	 * The number of structural features of the '<em>Controlador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Controlador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLADOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.EClass0Impl <em>EClass0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.EClass0Impl
	 * @see Android.impl.AndroidPackageImpl#getEClass0()
	 * @generated
	 */
	int ECLASS0 = 4;

	/**
	 * The number of structural features of the '<em>EClass0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS0_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EClass0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS0_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.WidgetImpl
	 * @see Android.impl.AndroidPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 5;

	/**
	 * The feature id for the '<em><b>Pertenece Alayout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__PERTENECE_ALAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Es Controlado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ES_CONTROLADO_POR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = 2;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.BotonImpl <em>Boton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.BotonImpl
	 * @see Android.impl.AndroidPackageImpl#getBoton()
	 * @generated
	 */
	int BOTON = 6;

	/**
	 * The feature id for the '<em><b>Pertenece Alayout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__PERTENECE_ALAYOUT = WIDGET__PERTENECE_ALAYOUT;

	/**
	 * The feature id for the '<em><b>Es Controlado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__ES_CONTROLADO_POR = WIDGET__ES_CONTROLADO_POR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__ACCION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__TEXTO = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Android.impl.EditTextImpl <em>Edit Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.EditTextImpl
	 * @see Android.impl.AndroidPackageImpl#getEditText()
	 * @generated
	 */
	int EDIT_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Pertenece Alayout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__PERTENECE_ALAYOUT = WIDGET__PERTENECE_ALAYOUT;

	/**
	 * The feature id for the '<em><b>Es Controlado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__ES_CONTROLADO_POR = WIDGET__ES_CONTROLADO_POR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TIPO = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Android.impl.accionImpl <em>accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.accionImpl
	 * @see Android.impl.AndroidPackageImpl#getaccion()
	 * @generated
	 */
	int ACCION = 8;

	/**
	 * The feature id for the '<em><b>Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__CLICK = 0;

	/**
	 * The feature id for the '<em><b>Long Click</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__LONG_CLICK = 1;

	/**
	 * The feature id for the '<em><b>Pertenece A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__PERTENECE_A = 2;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__MUESTRA = 3;

	/**
	 * The feature id for the '<em><b>Es Accionado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ES_ACCIONADO_POR = 4;

	/**
	 * The number of structural features of the '<em>accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.DialogoImpl <em>Dialogo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.DialogoImpl
	 * @see Android.impl.AndroidPackageImpl#getDialogo()
	 * @generated
	 */
	int DIALOGO = 9;

	/**
	 * The feature id for the '<em><b>Es Mostrado En Una Accion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGO__ES_MOSTRADO_EN_UNA_ACCION = 0;

	/**
	 * The feature id for the '<em><b>Duracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGO__DURACION = 1;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGO__TEXTO = 2;

	/**
	 * The feature id for the '<em><b>Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGO__IMAGEN = 3;

	/**
	 * The number of structural features of the '<em>Dialogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dialogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.permisoImpl <em>permiso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.permisoImpl
	 * @see Android.impl.AndroidPackageImpl#getpermiso()
	 * @generated
	 */
	int PERMISO = 10;

	/**
	 * The feature id for the '<em><b>Da Permiso A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__DA_PERMISO_A = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>permiso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>permiso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Android.impl.containersImpl <em>containers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.containersImpl
	 * @see Android.impl.AndroidPackageImpl#getcontainers()
	 * @generated
	 */
	int CONTAINERS = 11;

	/**
	 * The feature id for the '<em><b>Pertenece Alayout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__PERTENECE_ALAYOUT = WIDGET__PERTENECE_ALAYOUT;

	/**
	 * The feature id for the '<em><b>Es Controlado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__ES_CONTROLADO_POR = WIDGET__ES_CONTROLADO_POR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>containers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>containers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Android.impl.objectsImpl <em>objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.objectsImpl
	 * @see Android.impl.AndroidPackageImpl#getobjects()
	 * @generated
	 */
	int OBJECTS = 12;

	/**
	 * The feature id for the '<em><b>Pertenece Alayout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS__PERTENECE_ALAYOUT = WIDGET__PERTENECE_ALAYOUT;

	/**
	 * The feature id for the '<em><b>Es Controlado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS__ES_CONTROLADO_POR = WIDGET__ES_CONTROLADO_POR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Android.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.impl.TextViewImpl
	 * @see Android.impl.AndroidPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Pertenece Alayout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__PERTENECE_ALAYOUT = WIDGET__PERTENECE_ALAYOUT;

	/**
	 * The feature id for the '<em><b>Es Controlado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__ES_CONTROLADO_POR = WIDGET__ES_CONTROLADO_POR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Android.tipoLayout <em>tipo Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.tipoLayout
	 * @see Android.impl.AndroidPackageImpl#gettipoLayout()
	 * @generated
	 */
	int TIPO_LAYOUT = 14;

	/**
	 * The meta object id for the '{@link Android.tipo_permiso <em>tipo permiso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.tipo_permiso
	 * @see Android.impl.AndroidPackageImpl#gettipo_permiso()
	 * @generated
	 */
	int TIPO_PERMISO = 15;

	/**
	 * The meta object id for the '{@link Android.tipoEntradaTexto <em>tipo Entrada Texto</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.tipoEntradaTexto
	 * @see Android.impl.AndroidPackageImpl#gettipoEntradaTexto()
	 * @generated
	 */
	int TIPO_ENTRADA_TEXTO = 16;

	/**
	 * The meta object id for the '{@link Android.duracionDialogo <em>duracion Dialogo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Android.duracionDialogo
	 * @see Android.impl.AndroidPackageImpl#getduracionDialogo()
	 * @generated
	 */
	int DURACION_DIALOGO = 17;


	/**
	 * Returns the meta object for class '{@link Android.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacion</em>'.
	 * @see Android.Aplicacion
	 * @generated
	 */
	EClass getAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link Android.Aplicacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Android.Aplicacion#getNombre()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link Android.Aplicacion#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividades</em>'.
	 * @see Android.Aplicacion#getActividades()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Actividades();

	/**
	 * Returns the meta object for the containment reference list '{@link Android.Aplicacion#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layout</em>'.
	 * @see Android.Aplicacion#getLayout()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Layout();

	/**
	 * Returns the meta object for the attribute list '{@link Android.Aplicacion#getPermiso <em>Permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permiso</em>'.
	 * @see Android.Aplicacion#getPermiso()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Permiso();

	/**
	 * Returns the meta object for the attribute '{@link Android.Aplicacion#getMinSDK <em>Min SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min SDK</em>'.
	 * @see Android.Aplicacion#getMinSDK()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_MinSDK();

	/**
	 * Returns the meta object for the attribute '{@link Android.Aplicacion#getTargetSDK <em>Target SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target SDK</em>'.
	 * @see Android.Aplicacion#getTargetSDK()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_TargetSDK();

	/**
	 * Returns the meta object for the attribute '{@link Android.Aplicacion#getPaquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paquete</em>'.
	 * @see Android.Aplicacion#getPaquete()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Paquete();

	/**
	 * Returns the meta object for the attribute '{@link Android.Aplicacion#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see Android.Aplicacion#getVersionCode()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link Android.Aplicacion#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see Android.Aplicacion#getVersionName()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_VersionName();

	/**
	 * Returns the meta object for class '{@link Android.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see Android.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the container reference '{@link Android.Activity#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>App</em>'.
	 * @see Android.Activity#getApp()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_App();

	/**
	 * Returns the meta object for the reference '{@link Android.Activity#getControla <em>Controla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controla</em>'.
	 * @see Android.Activity#getControla()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Controla();

	/**
	 * Returns the meta object for the attribute '{@link Android.Activity#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Android.Activity#getNombre()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link Android.Activity#getPaquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paquete</em>'.
	 * @see Android.Activity#getPaquete()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Paquete();

	/**
	 * Returns the meta object for the attribute '{@link Android.Activity#isIsmain <em>Ismain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ismain</em>'.
	 * @see Android.Activity#isIsmain()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Ismain();

	/**
	 * Returns the meta object for class '{@link Android.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see Android.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the reference '{@link Android.Layout#getPadre <em>Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Padre</em>'.
	 * @see Android.Layout#getPadre()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Padre();

	/**
	 * Returns the meta object for the reference list '{@link Android.Layout#getHijo <em>Hijo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hijo</em>'.
	 * @see Android.Layout#getHijo()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Hijo();

	/**
	 * Returns the meta object for the reference '{@link Android.Layout#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Widget</em>'.
	 * @see Android.Layout#getWidget()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Widget();

	/**
	 * Returns the meta object for the container reference '{@link Android.Layout#getPerteneceAapp <em>Pertenece Aapp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pertenece Aapp</em>'.
	 * @see Android.Layout#getPerteneceAapp()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PerteneceAapp();

	/**
	 * Returns the meta object for the reference list '{@link Android.Layout#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see Android.Layout#getActivities()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Activities();

	/**
	 * Returns the meta object for the attribute '{@link Android.Layout#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Android.Layout#getTipo()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Tipo();

	/**
	 * Returns the meta object for class '{@link Android.Controlador <em>Controlador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlador</em>'.
	 * @see Android.Controlador
	 * @generated
	 */
	EClass getControlador();

	/**
	 * Returns the meta object for the reference '{@link Android.Controlador#getEsControladaPor <em>Es Controlada Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Es Controlada Por</em>'.
	 * @see Android.Controlador#getEsControladaPor()
	 * @see #getControlador()
	 * @generated
	 */
	EReference getControlador_EsControladaPor();

	/**
	 * Returns the meta object for the reference '{@link Android.Controlador#getManejaWidget <em>Maneja Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maneja Widget</em>'.
	 * @see Android.Controlador#getManejaWidget()
	 * @see #getControlador()
	 * @generated
	 */
	EReference getControlador_ManejaWidget();

	/**
	 * Returns the meta object for the reference list '{@link Android.Controlador#getHaceAccion <em>Hace Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hace Accion</em>'.
	 * @see Android.Controlador#getHaceAccion()
	 * @see #getControlador()
	 * @generated
	 */
	EReference getControlador_HaceAccion();

	/**
	 * Returns the meta object for the attribute '{@link Android.Controlador#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Android.Controlador#getNombre()
	 * @see #getControlador()
	 * @generated
	 */
	EAttribute getControlador_Nombre();

	/**
	 * Returns the meta object for class '{@link Android.EClass0 <em>EClass0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass0</em>'.
	 * @see Android.EClass0
	 * @generated
	 */
	EClass getEClass0();

	/**
	 * Returns the meta object for class '{@link Android.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see Android.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the reference '{@link Android.Widget#getPerteneceAlayout <em>Pertenece Alayout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pertenece Alayout</em>'.
	 * @see Android.Widget#getPerteneceAlayout()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_PerteneceAlayout();

	/**
	 * Returns the meta object for the reference list '{@link Android.Widget#getEsControladoPor <em>Es Controlado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Es Controlado Por</em>'.
	 * @see Android.Widget#getEsControladoPor()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_EsControladoPor();

	/**
	 * Returns the meta object for the attribute '{@link Android.Widget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Android.Widget#getId()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Id();

	/**
	 * Returns the meta object for class '{@link Android.Boton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton</em>'.
	 * @see Android.Boton
	 * @generated
	 */
	EClass getBoton();

	/**
	 * Returns the meta object for the reference list '{@link Android.Boton#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accion</em>'.
	 * @see Android.Boton#getAccion()
	 * @see #getBoton()
	 * @generated
	 */
	EReference getBoton_Accion();

	/**
	 * Returns the meta object for the attribute '{@link Android.Boton#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see Android.Boton#getTexto()
	 * @see #getBoton()
	 * @generated
	 */
	EAttribute getBoton_Texto();

	/**
	 * Returns the meta object for class '{@link Android.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Text</em>'.
	 * @see Android.EditText
	 * @generated
	 */
	EClass getEditText();

	/**
	 * Returns the meta object for the attribute '{@link Android.EditText#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Android.EditText#getTipo()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Tipo();

	/**
	 * Returns the meta object for class '{@link Android.accion <em>accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>accion</em>'.
	 * @see Android.accion
	 * @generated
	 */
	EClass getaccion();

	/**
	 * Returns the meta object for the attribute '{@link Android.accion#isClick <em>Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Click</em>'.
	 * @see Android.accion#isClick()
	 * @see #getaccion()
	 * @generated
	 */
	EAttribute getaccion_Click();

	/**
	 * Returns the meta object for the attribute '{@link Android.accion#isLongClick <em>Long Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Click</em>'.
	 * @see Android.accion#isLongClick()
	 * @see #getaccion()
	 * @generated
	 */
	EAttribute getaccion_LongClick();

	/**
	 * Returns the meta object for the reference '{@link Android.accion#getPerteneceA <em>Pertenece A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pertenece A</em>'.
	 * @see Android.accion#getPerteneceA()
	 * @see #getaccion()
	 * @generated
	 */
	EReference getaccion_PerteneceA();

	/**
	 * Returns the meta object for the reference '{@link Android.accion#getMuestra <em>Muestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Muestra</em>'.
	 * @see Android.accion#getMuestra()
	 * @see #getaccion()
	 * @generated
	 */
	EReference getaccion_Muestra();

	/**
	 * Returns the meta object for the reference list '{@link Android.accion#getEsAccionadoPor <em>Es Accionado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Es Accionado Por</em>'.
	 * @see Android.accion#getEsAccionadoPor()
	 * @see #getaccion()
	 * @generated
	 */
	EReference getaccion_EsAccionadoPor();

	/**
	 * Returns the meta object for class '{@link Android.Dialogo <em>Dialogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogo</em>'.
	 * @see Android.Dialogo
	 * @generated
	 */
	EClass getDialogo();

	/**
	 * Returns the meta object for the reference '{@link Android.Dialogo#getEsMostradoEnUnaAccion <em>Es Mostrado En Una Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Es Mostrado En Una Accion</em>'.
	 * @see Android.Dialogo#getEsMostradoEnUnaAccion()
	 * @see #getDialogo()
	 * @generated
	 */
	EReference getDialogo_EsMostradoEnUnaAccion();

	/**
	 * Returns the meta object for the attribute '{@link Android.Dialogo#getDuracion <em>Duracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duracion</em>'.
	 * @see Android.Dialogo#getDuracion()
	 * @see #getDialogo()
	 * @generated
	 */
	EAttribute getDialogo_Duracion();

	/**
	 * Returns the meta object for the attribute '{@link Android.Dialogo#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see Android.Dialogo#getTexto()
	 * @see #getDialogo()
	 * @generated
	 */
	EAttribute getDialogo_Texto();

	/**
	 * Returns the meta object for the attribute '{@link Android.Dialogo#getImagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imagen</em>'.
	 * @see Android.Dialogo#getImagen()
	 * @see #getDialogo()
	 * @generated
	 */
	EAttribute getDialogo_Imagen();

	/**
	 * Returns the meta object for class '{@link Android.permiso <em>permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>permiso</em>'.
	 * @see Android.permiso
	 * @generated
	 */
	EClass getpermiso();

	/**
	 * Returns the meta object for the reference '{@link Android.permiso#getDaPermisoA <em>Da Permiso A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Da Permiso A</em>'.
	 * @see Android.permiso#getDaPermisoA()
	 * @see #getpermiso()
	 * @generated
	 */
	EReference getpermiso_DaPermisoA();

	/**
	 * Returns the meta object for the reference '{@link Android.permiso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nombre</em>'.
	 * @see Android.permiso#getNombre()
	 * @see #getpermiso()
	 * @generated
	 */
	EReference getpermiso_Nombre();

	/**
	 * Returns the meta object for class '{@link Android.containers <em>containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>containers</em>'.
	 * @see Android.containers
	 * @generated
	 */
	EClass getcontainers();

	/**
	 * Returns the meta object for class '{@link Android.objects <em>objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>objects</em>'.
	 * @see Android.objects
	 * @generated
	 */
	EClass getobjects();

	/**
	 * Returns the meta object for class '{@link Android.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see Android.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for the attribute '{@link Android.TextView#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Android.TextView#getText()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Text();

	/**
	 * Returns the meta object for enum '{@link Android.tipoLayout <em>tipo Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>tipo Layout</em>'.
	 * @see Android.tipoLayout
	 * @generated
	 */
	EEnum gettipoLayout();

	/**
	 * Returns the meta object for enum '{@link Android.tipo_permiso <em>tipo permiso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>tipo permiso</em>'.
	 * @see Android.tipo_permiso
	 * @generated
	 */
	EEnum gettipo_permiso();

	/**
	 * Returns the meta object for enum '{@link Android.tipoEntradaTexto <em>tipo Entrada Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>tipo Entrada Texto</em>'.
	 * @see Android.tipoEntradaTexto
	 * @generated
	 */
	EEnum gettipoEntradaTexto();

	/**
	 * Returns the meta object for enum '{@link Android.duracionDialogo <em>duracion Dialogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>duracion Dialogo</em>'.
	 * @see Android.duracionDialogo
	 * @generated
	 */
	EEnum getduracionDialogo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndroidFactory getAndroidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Android.impl.AplicacionImpl <em>Aplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.AplicacionImpl
		 * @see Android.impl.AndroidPackageImpl#getAplicacion()
		 * @generated
		 */
		EClass APLICACION = eINSTANCE.getAplicacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__NOMBRE = eINSTANCE.getAplicacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__ACTIVIDADES = eINSTANCE.getAplicacion_Actividades();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__LAYOUT = eINSTANCE.getAplicacion_Layout();

		/**
		 * The meta object literal for the '<em><b>Permiso</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__PERMISO = eINSTANCE.getAplicacion_Permiso();

		/**
		 * The meta object literal for the '<em><b>Min SDK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__MIN_SDK = eINSTANCE.getAplicacion_MinSDK();

		/**
		 * The meta object literal for the '<em><b>Target SDK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__TARGET_SDK = eINSTANCE.getAplicacion_TargetSDK();

		/**
		 * The meta object literal for the '<em><b>Paquete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__PAQUETE = eINSTANCE.getAplicacion_Paquete();

		/**
		 * The meta object literal for the '<em><b>Version Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__VERSION_CODE = eINSTANCE.getAplicacion_VersionCode();

		/**
		 * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__VERSION_NAME = eINSTANCE.getAplicacion_VersionName();

		/**
		 * The meta object literal for the '{@link Android.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.ActivityImpl
		 * @see Android.impl.AndroidPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__APP = eINSTANCE.getActivity_App();

		/**
		 * The meta object literal for the '<em><b>Controla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CONTROLA = eINSTANCE.getActivity_Controla();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NOMBRE = eINSTANCE.getActivity_Nombre();

		/**
		 * The meta object literal for the '<em><b>Paquete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PAQUETE = eINSTANCE.getActivity_Paquete();

		/**
		 * The meta object literal for the '<em><b>Ismain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ISMAIN = eINSTANCE.getActivity_Ismain();

		/**
		 * The meta object literal for the '{@link Android.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.LayoutImpl
		 * @see Android.impl.AndroidPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Padre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PADRE = eINSTANCE.getLayout_Padre();

		/**
		 * The meta object literal for the '<em><b>Hijo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__HIJO = eINSTANCE.getLayout_Hijo();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__WIDGET = eINSTANCE.getLayout_Widget();

		/**
		 * The meta object literal for the '<em><b>Pertenece Aapp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PERTENECE_AAPP = eINSTANCE.getLayout_PerteneceAapp();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ACTIVITIES = eINSTANCE.getLayout_Activities();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__TIPO = eINSTANCE.getLayout_Tipo();

		/**
		 * The meta object literal for the '{@link Android.impl.ControladorImpl <em>Controlador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.ControladorImpl
		 * @see Android.impl.AndroidPackageImpl#getControlador()
		 * @generated
		 */
		EClass CONTROLADOR = eINSTANCE.getControlador();

		/**
		 * The meta object literal for the '<em><b>Es Controlada Por</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLADOR__ES_CONTROLADA_POR = eINSTANCE.getControlador_EsControladaPor();

		/**
		 * The meta object literal for the '<em><b>Maneja Widget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLADOR__MANEJA_WIDGET = eINSTANCE.getControlador_ManejaWidget();

		/**
		 * The meta object literal for the '<em><b>Hace Accion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLADOR__HACE_ACCION = eINSTANCE.getControlador_HaceAccion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLADOR__NOMBRE = eINSTANCE.getControlador_Nombre();

		/**
		 * The meta object literal for the '{@link Android.impl.EClass0Impl <em>EClass0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.EClass0Impl
		 * @see Android.impl.AndroidPackageImpl#getEClass0()
		 * @generated
		 */
		EClass ECLASS0 = eINSTANCE.getEClass0();

		/**
		 * The meta object literal for the '{@link Android.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.WidgetImpl
		 * @see Android.impl.AndroidPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Pertenece Alayout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__PERTENECE_ALAYOUT = eINSTANCE.getWidget_PerteneceAlayout();

		/**
		 * The meta object literal for the '<em><b>Es Controlado Por</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ES_CONTROLADO_POR = eINSTANCE.getWidget_EsControladoPor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

		/**
		 * The meta object literal for the '{@link Android.impl.BotonImpl <em>Boton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.BotonImpl
		 * @see Android.impl.AndroidPackageImpl#getBoton()
		 * @generated
		 */
		EClass BOTON = eINSTANCE.getBoton();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTON__ACCION = eINSTANCE.getBoton_Accion();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTON__TEXTO = eINSTANCE.getBoton_Texto();

		/**
		 * The meta object literal for the '{@link Android.impl.EditTextImpl <em>Edit Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.EditTextImpl
		 * @see Android.impl.AndroidPackageImpl#getEditText()
		 * @generated
		 */
		EClass EDIT_TEXT = eINSTANCE.getEditText();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_TEXT__TIPO = eINSTANCE.getEditText_Tipo();

		/**
		 * The meta object literal for the '{@link Android.impl.accionImpl <em>accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.accionImpl
		 * @see Android.impl.AndroidPackageImpl#getaccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getaccion();

		/**
		 * The meta object literal for the '<em><b>Click</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__CLICK = eINSTANCE.getaccion_Click();

		/**
		 * The meta object literal for the '<em><b>Long Click</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__LONG_CLICK = eINSTANCE.getaccion_LongClick();

		/**
		 * The meta object literal for the '<em><b>Pertenece A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__PERTENECE_A = eINSTANCE.getaccion_PerteneceA();

		/**
		 * The meta object literal for the '<em><b>Muestra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__MUESTRA = eINSTANCE.getaccion_Muestra();

		/**
		 * The meta object literal for the '<em><b>Es Accionado Por</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__ES_ACCIONADO_POR = eINSTANCE.getaccion_EsAccionadoPor();

		/**
		 * The meta object literal for the '{@link Android.impl.DialogoImpl <em>Dialogo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.DialogoImpl
		 * @see Android.impl.AndroidPackageImpl#getDialogo()
		 * @generated
		 */
		EClass DIALOGO = eINSTANCE.getDialogo();

		/**
		 * The meta object literal for the '<em><b>Es Mostrado En Una Accion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGO__ES_MOSTRADO_EN_UNA_ACCION = eINSTANCE.getDialogo_EsMostradoEnUnaAccion();

		/**
		 * The meta object literal for the '<em><b>Duracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGO__DURACION = eINSTANCE.getDialogo_Duracion();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGO__TEXTO = eINSTANCE.getDialogo_Texto();

		/**
		 * The meta object literal for the '<em><b>Imagen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGO__IMAGEN = eINSTANCE.getDialogo_Imagen();

		/**
		 * The meta object literal for the '{@link Android.impl.permisoImpl <em>permiso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.permisoImpl
		 * @see Android.impl.AndroidPackageImpl#getpermiso()
		 * @generated
		 */
		EClass PERMISO = eINSTANCE.getpermiso();

		/**
		 * The meta object literal for the '<em><b>Da Permiso A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISO__DA_PERMISO_A = eINSTANCE.getpermiso_DaPermisoA();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISO__NOMBRE = eINSTANCE.getpermiso_Nombre();

		/**
		 * The meta object literal for the '{@link Android.impl.containersImpl <em>containers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.containersImpl
		 * @see Android.impl.AndroidPackageImpl#getcontainers()
		 * @generated
		 */
		EClass CONTAINERS = eINSTANCE.getcontainers();

		/**
		 * The meta object literal for the '{@link Android.impl.objectsImpl <em>objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.objectsImpl
		 * @see Android.impl.AndroidPackageImpl#getobjects()
		 * @generated
		 */
		EClass OBJECTS = eINSTANCE.getobjects();

		/**
		 * The meta object literal for the '{@link Android.impl.TextViewImpl <em>Text View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.impl.TextViewImpl
		 * @see Android.impl.AndroidPackageImpl#getTextView()
		 * @generated
		 */
		EClass TEXT_VIEW = eINSTANCE.getTextView();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW__TEXT = eINSTANCE.getTextView_Text();

		/**
		 * The meta object literal for the '{@link Android.tipoLayout <em>tipo Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.tipoLayout
		 * @see Android.impl.AndroidPackageImpl#gettipoLayout()
		 * @generated
		 */
		EEnum TIPO_LAYOUT = eINSTANCE.gettipoLayout();

		/**
		 * The meta object literal for the '{@link Android.tipo_permiso <em>tipo permiso</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.tipo_permiso
		 * @see Android.impl.AndroidPackageImpl#gettipo_permiso()
		 * @generated
		 */
		EEnum TIPO_PERMISO = eINSTANCE.gettipo_permiso();

		/**
		 * The meta object literal for the '{@link Android.tipoEntradaTexto <em>tipo Entrada Texto</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.tipoEntradaTexto
		 * @see Android.impl.AndroidPackageImpl#gettipoEntradaTexto()
		 * @generated
		 */
		EEnum TIPO_ENTRADA_TEXTO = eINSTANCE.gettipoEntradaTexto();

		/**
		 * The meta object literal for the '{@link Android.duracionDialogo <em>duracion Dialogo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Android.duracionDialogo
		 * @see Android.impl.AndroidPackageImpl#getduracionDialogo()
		 * @generated
		 */
		EEnum DURACION_DIALOGO = eINSTANCE.getduracionDialogo();

	}

} //AndroidPackage
