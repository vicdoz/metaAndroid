/**
 */
package mandroid;

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
 * @see mandroid.MandroidFactory
 * @model kind="package"
 * @generated
 */
public interface MandroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mandroid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mandroid/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mandroid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MandroidPackage eINSTANCE = mandroid.impl.MandroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link mandroid.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.ActivityImpl
	 * @see mandroid.impl.MandroidPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Runs In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RUNS_IN = 2;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MAIN = 3;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MUESTRA = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SHOW = 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.WidgetImpl
	 * @see mandroid.impl.MandroidPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Layout Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LAYOUT_OWNER = 3;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.LayoutImpl
	 * @see mandroid.impl.MandroidPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Lay On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAY_ON = 2;

	/**
	 * The feature id for the '<em><b>Es Mostrado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ES_MOSTRADO = 3;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.ButtonImpl
	 * @see mandroid.impl.MandroidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Layout Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_OWNER = WIDGET__LAYOUT_OWNER;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TRIGGERS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.TextViewImpl
	 * @see mandroid.impl.MandroidPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__NAME = WIDGET__NAME;

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
	int TEXT_VIEW__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Layout Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LAYOUT_OWNER = WIDGET__LAYOUT_OWNER;

	/**
	 * The number of structural features of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.AplicationImpl <em>Aplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.AplicationImpl
	 * @see mandroid.impl.MandroidPackageImpl#getAplication()
	 * @generated
	 */
	int APLICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Min SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__MIN_SDK = 2;

	/**
	 * The feature id for the '<em><b>Target SDK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__TARGET_SDK = 3;

	/**
	 * The feature id for the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__VERSION_CODE = 4;

	/**
	 * The feature id for the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__VERSION_NAME = 5;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__PERMISSIONS = 6;

	/**
	 * The feature id for the '<em><b>Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__RUN = 7;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__CONTAINS = 8;

	/**
	 * The feature id for the '<em><b>Has Strings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION__HAS_STRINGS = 9;

	/**
	 * The number of structural features of the '<em>Aplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Aplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.TextFieldImpl
	 * @see mandroid.impl.MandroidPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TEXT = WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Layout Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LAYOUT_OWNER = WIDGET__LAYOUT_OWNER;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__INPUT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = WIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.ActionImpl
	 * @see mandroid.impl.MandroidPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Shows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SHOWS = 0;

	/**
	 * The feature id for the '<em><b>Button Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BUTTON_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.DialogImpl <em>Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.DialogImpl
	 * @see mandroid.impl.MandroidPackageImpl#getDialog()
	 * @generated
	 */
	int DIALOG = 8;

	/**
	 * The feature id for the '<em><b>Action Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__ACTION_OWNER = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__TIME = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.StringsImpl <em>Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.StringsImpl
	 * @see mandroid.impl.MandroidPackageImpl#getStrings()
	 * @generated
	 */
	int STRINGS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.MenuImpl
	 * @see mandroid.impl.MandroidPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ID = 0;

	/**
	 * The feature id for the '<em><b>Has Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__HAS_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.impl.ItemImpl
	 * @see mandroid.impl.MandroidPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Show As Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SHOW_AS_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mandroid.Permissions <em>Permissions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.Permissions
	 * @see mandroid.impl.MandroidPackageImpl#getPermissions()
	 * @generated
	 */
	int PERMISSIONS = 12;

	/**
	 * The meta object id for the '{@link mandroid.LayoutType <em>Layout Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.LayoutType
	 * @see mandroid.impl.MandroidPackageImpl#getLayoutType()
	 * @generated
	 */
	int LAYOUT_TYPE = 13;

	/**
	 * The meta object id for the '{@link mandroid.Length <em>Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.Length
	 * @see mandroid.impl.MandroidPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 14;

	/**
	 * The meta object id for the '{@link mandroid.TypeAction <em>Type Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.TypeAction
	 * @see mandroid.impl.MandroidPackageImpl#getTypeAction()
	 * @generated
	 */
	int TYPE_ACTION = 15;

	/**
	 * The meta object id for the '{@link mandroid.InputType <em>Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.InputType
	 * @see mandroid.impl.MandroidPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 16;

	/**
	 * The meta object id for the '{@link mandroid.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mandroid.ActionType
	 * @see mandroid.impl.MandroidPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link mandroid.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see mandroid.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mandroid.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Activity#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see mandroid.Activity#getPackage()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Package();

	/**
	 * Returns the meta object for the container reference '{@link mandroid.Activity#getRunsIn <em>Runs In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Runs In</em>'.
	 * @see mandroid.Activity#getRunsIn()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_RunsIn();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Activity#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see mandroid.Activity#isMain()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Main();

	/**
	 * Returns the meta object for the reference '{@link mandroid.Activity#getMuestra <em>Muestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Muestra</em>'.
	 * @see mandroid.Activity#getMuestra()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Muestra();

	/**
	 * Returns the meta object for the containment reference '{@link mandroid.Activity#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show</em>'.
	 * @see mandroid.Activity#getShow()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Show();

	/**
	 * Returns the meta object for class '{@link mandroid.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see mandroid.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mandroid.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Widget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mandroid.Widget#getId()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Id();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Widget#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mandroid.Widget#getText()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Text();

	/**
	 * Returns the meta object for the container reference '{@link mandroid.Widget#getLayoutOwner <em>Layout Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Layout Owner</em>'.
	 * @see mandroid.Widget#getLayoutOwner()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_LayoutOwner();

	/**
	 * Returns the meta object for class '{@link mandroid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see mandroid.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Layout#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mandroid.Layout#getType()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link mandroid.Layout#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see mandroid.Layout#getContains()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Contains();

	/**
	 * Returns the meta object for the container reference '{@link mandroid.Layout#getLayOn <em>Lay On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lay On</em>'.
	 * @see mandroid.Layout#getLayOn()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_LayOn();

	/**
	 * Returns the meta object for the reference list '{@link mandroid.Layout#getEsMostrado <em>Es Mostrado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Es Mostrado</em>'.
	 * @see mandroid.Layout#getEsMostrado()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_EsMostrado();

	/**
	 * Returns the meta object for class '{@link mandroid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see mandroid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link mandroid.Button#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers</em>'.
	 * @see mandroid.Button#getTriggers()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Triggers();

	/**
	 * Returns the meta object for class '{@link mandroid.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see mandroid.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for class '{@link mandroid.Aplication <em>Aplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplication</em>'.
	 * @see mandroid.Aplication
	 * @generated
	 */
	EClass getAplication();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Aplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mandroid.Aplication#getName()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Aplication#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see mandroid.Aplication#getPackage()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_Package();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Aplication#getMinSDK <em>Min SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min SDK</em>'.
	 * @see mandroid.Aplication#getMinSDK()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_MinSDK();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Aplication#getTargetSDK <em>Target SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target SDK</em>'.
	 * @see mandroid.Aplication#getTargetSDK()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_TargetSDK();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Aplication#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see mandroid.Aplication#getVersionCode()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Aplication#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see mandroid.Aplication#getVersionName()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_VersionName();

	/**
	 * Returns the meta object for the attribute list '{@link mandroid.Aplication#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permissions</em>'.
	 * @see mandroid.Aplication#getPermissions()
	 * @see #getAplication()
	 * @generated
	 */
	EAttribute getAplication_Permissions();

	/**
	 * Returns the meta object for the containment reference list '{@link mandroid.Aplication#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run</em>'.
	 * @see mandroid.Aplication#getRun()
	 * @see #getAplication()
	 * @generated
	 */
	EReference getAplication_Run();

	/**
	 * Returns the meta object for the containment reference list '{@link mandroid.Aplication#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see mandroid.Aplication#getContains()
	 * @see #getAplication()
	 * @generated
	 */
	EReference getAplication_Contains();

	/**
	 * Returns the meta object for the reference list '{@link mandroid.Aplication#getHasStrings <em>Has Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Strings</em>'.
	 * @see mandroid.Aplication#getHasStrings()
	 * @see #getAplication()
	 * @generated
	 */
	EReference getAplication_HasStrings();

	/**
	 * Returns the meta object for class '{@link mandroid.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see mandroid.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.TextField#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see mandroid.TextField#getInput()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Input();

	/**
	 * Returns the meta object for class '{@link mandroid.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see mandroid.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link mandroid.Action#getShows <em>Shows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shows</em>'.
	 * @see mandroid.Action#getShows()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Shows();

	/**
	 * Returns the meta object for the reference '{@link mandroid.Action#getButtonOwner <em>Button Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Button Owner</em>'.
	 * @see mandroid.Action#getButtonOwner()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ButtonOwner();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mandroid.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for class '{@link mandroid.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog</em>'.
	 * @see mandroid.Dialog
	 * @generated
	 */
	EClass getDialog();

	/**
	 * Returns the meta object for the container reference '{@link mandroid.Dialog#getActionOwner <em>Action Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action Owner</em>'.
	 * @see mandroid.Dialog#getActionOwner()
	 * @see #getDialog()
	 * @generated
	 */
	EReference getDialog_ActionOwner();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Dialog#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see mandroid.Dialog#getTime()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Time();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Dialog#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mandroid.Dialog#getText()
	 * @see #getDialog()
	 * @generated
	 */
	EAttribute getDialog_Text();

	/**
	 * Returns the meta object for class '{@link mandroid.Strings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strings</em>'.
	 * @see mandroid.Strings
	 * @generated
	 */
	EClass getStrings();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Strings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mandroid.Strings#getName()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Name();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Strings#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mandroid.Strings#getValue()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Value();

	/**
	 * Returns the meta object for class '{@link mandroid.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see mandroid.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Menu#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mandroid.Menu#getId()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link mandroid.Menu#getHasItem <em>Has Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Item</em>'.
	 * @see mandroid.Menu#getHasItem()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_HasItem();

	/**
	 * Returns the meta object for class '{@link mandroid.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see mandroid.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mandroid.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Item#getShowAsAction <em>Show As Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show As Action</em>'.
	 * @see mandroid.Item#getShowAsAction()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ShowAsAction();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Item#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see mandroid.Item#getOrder()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Order();

	/**
	 * Returns the meta object for the attribute '{@link mandroid.Item#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mandroid.Item#getTitle()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Title();

	/**
	 * Returns the meta object for enum '{@link mandroid.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permissions</em>'.
	 * @see mandroid.Permissions
	 * @generated
	 */
	EEnum getPermissions();

	/**
	 * Returns the meta object for enum '{@link mandroid.LayoutType <em>Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Type</em>'.
	 * @see mandroid.LayoutType
	 * @generated
	 */
	EEnum getLayoutType();

	/**
	 * Returns the meta object for enum '{@link mandroid.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Length</em>'.
	 * @see mandroid.Length
	 * @generated
	 */
	EEnum getLength();

	/**
	 * Returns the meta object for enum '{@link mandroid.TypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Action</em>'.
	 * @see mandroid.TypeAction
	 * @generated
	 */
	EEnum getTypeAction();

	/**
	 * Returns the meta object for enum '{@link mandroid.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Type</em>'.
	 * @see mandroid.InputType
	 * @generated
	 */
	EEnum getInputType();

	/**
	 * Returns the meta object for enum '{@link mandroid.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see mandroid.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MandroidFactory getMandroidFactory();

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
		 * The meta object literal for the '{@link mandroid.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.ActivityImpl
		 * @see mandroid.impl.MandroidPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PACKAGE = eINSTANCE.getActivity_Package();

		/**
		 * The meta object literal for the '<em><b>Runs In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RUNS_IN = eINSTANCE.getActivity_RunsIn();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__MAIN = eINSTANCE.getActivity_Main();

		/**
		 * The meta object literal for the '<em><b>Muestra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__MUESTRA = eINSTANCE.getActivity_Muestra();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SHOW = eINSTANCE.getActivity_Show();

		/**
		 * The meta object literal for the '{@link mandroid.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.WidgetImpl
		 * @see mandroid.impl.MandroidPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TEXT = eINSTANCE.getWidget_Text();

		/**
		 * The meta object literal for the '<em><b>Layout Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__LAYOUT_OWNER = eINSTANCE.getWidget_LayoutOwner();

		/**
		 * The meta object literal for the '{@link mandroid.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.LayoutImpl
		 * @see mandroid.impl.MandroidPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__TYPE = eINSTANCE.getLayout_Type();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__CONTAINS = eINSTANCE.getLayout_Contains();

		/**
		 * The meta object literal for the '<em><b>Lay On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__LAY_ON = eINSTANCE.getLayout_LayOn();

		/**
		 * The meta object literal for the '<em><b>Es Mostrado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ES_MOSTRADO = eINSTANCE.getLayout_EsMostrado();

		/**
		 * The meta object literal for the '{@link mandroid.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.ButtonImpl
		 * @see mandroid.impl.MandroidPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TRIGGERS = eINSTANCE.getButton_Triggers();

		/**
		 * The meta object literal for the '{@link mandroid.impl.TextViewImpl <em>Text View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.TextViewImpl
		 * @see mandroid.impl.MandroidPackageImpl#getTextView()
		 * @generated
		 */
		EClass TEXT_VIEW = eINSTANCE.getTextView();

		/**
		 * The meta object literal for the '{@link mandroid.impl.AplicationImpl <em>Aplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.AplicationImpl
		 * @see mandroid.impl.MandroidPackageImpl#getAplication()
		 * @generated
		 */
		EClass APLICATION = eINSTANCE.getAplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__NAME = eINSTANCE.getAplication_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__PACKAGE = eINSTANCE.getAplication_Package();

		/**
		 * The meta object literal for the '<em><b>Min SDK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__MIN_SDK = eINSTANCE.getAplication_MinSDK();

		/**
		 * The meta object literal for the '<em><b>Target SDK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__TARGET_SDK = eINSTANCE.getAplication_TargetSDK();

		/**
		 * The meta object literal for the '<em><b>Version Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__VERSION_CODE = eINSTANCE.getAplication_VersionCode();

		/**
		 * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__VERSION_NAME = eINSTANCE.getAplication_VersionName();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICATION__PERMISSIONS = eINSTANCE.getAplication_Permissions();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICATION__RUN = eINSTANCE.getAplication_Run();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICATION__CONTAINS = eINSTANCE.getAplication_Contains();

		/**
		 * The meta object literal for the '<em><b>Has Strings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICATION__HAS_STRINGS = eINSTANCE.getAplication_HasStrings();

		/**
		 * The meta object literal for the '{@link mandroid.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.TextFieldImpl
		 * @see mandroid.impl.MandroidPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__INPUT = eINSTANCE.getTextField_Input();

		/**
		 * The meta object literal for the '{@link mandroid.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.ActionImpl
		 * @see mandroid.impl.MandroidPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Shows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SHOWS = eINSTANCE.getAction_Shows();

		/**
		 * The meta object literal for the '<em><b>Button Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__BUTTON_OWNER = eINSTANCE.getAction_ButtonOwner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '{@link mandroid.impl.DialogImpl <em>Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.DialogImpl
		 * @see mandroid.impl.MandroidPackageImpl#getDialog()
		 * @generated
		 */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
		 * The meta object literal for the '<em><b>Action Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOG__ACTION_OWNER = eINSTANCE.getDialog_ActionOwner();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__TIME = eINSTANCE.getDialog_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOG__TEXT = eINSTANCE.getDialog_Text();

		/**
		 * The meta object literal for the '{@link mandroid.impl.StringsImpl <em>Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.StringsImpl
		 * @see mandroid.impl.MandroidPackageImpl#getStrings()
		 * @generated
		 */
		EClass STRINGS = eINSTANCE.getStrings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__NAME = eINSTANCE.getStrings_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__VALUE = eINSTANCE.getStrings_Value();

		/**
		 * The meta object literal for the '{@link mandroid.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.MenuImpl
		 * @see mandroid.impl.MandroidPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__ID = eINSTANCE.getMenu_Id();

		/**
		 * The meta object literal for the '<em><b>Has Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__HAS_ITEM = eINSTANCE.getMenu_HasItem();

		/**
		 * The meta object literal for the '{@link mandroid.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.impl.ItemImpl
		 * @see mandroid.impl.MandroidPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

		/**
		 * The meta object literal for the '<em><b>Show As Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SHOW_AS_ACTION = eINSTANCE.getItem_ShowAsAction();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ORDER = eINSTANCE.getItem_Order();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TITLE = eINSTANCE.getItem_Title();

		/**
		 * The meta object literal for the '{@link mandroid.Permissions <em>Permissions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.Permissions
		 * @see mandroid.impl.MandroidPackageImpl#getPermissions()
		 * @generated
		 */
		EEnum PERMISSIONS = eINSTANCE.getPermissions();

		/**
		 * The meta object literal for the '{@link mandroid.LayoutType <em>Layout Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.LayoutType
		 * @see mandroid.impl.MandroidPackageImpl#getLayoutType()
		 * @generated
		 */
		EEnum LAYOUT_TYPE = eINSTANCE.getLayoutType();

		/**
		 * The meta object literal for the '{@link mandroid.Length <em>Length</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.Length
		 * @see mandroid.impl.MandroidPackageImpl#getLength()
		 * @generated
		 */
		EEnum LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link mandroid.TypeAction <em>Type Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.TypeAction
		 * @see mandroid.impl.MandroidPackageImpl#getTypeAction()
		 * @generated
		 */
		EEnum TYPE_ACTION = eINSTANCE.getTypeAction();

		/**
		 * The meta object literal for the '{@link mandroid.InputType <em>Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.InputType
		 * @see mandroid.impl.MandroidPackageImpl#getInputType()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '{@link mandroid.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mandroid.ActionType
		 * @see mandroid.impl.MandroidPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

	}

} //MandroidPackage
