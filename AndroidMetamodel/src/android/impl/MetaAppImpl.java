/**
 */
package android.impl;

import android.Action;
import android.Activity;
import android.AndroidPackage;
import android.Aplication;
import android.CreateString;
import android.Dialog;
import android.Item;
import android.Layout;
import android.Menu;
import android.MetaApp;
import android.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link android.impl.MetaAppImpl#getCreateApp <em>Create App</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateActivity <em>Create Activity</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateMenu <em>Create Menu</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreate_String <em>Create String</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateLayout <em>Create Layout</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateItem <em>Create Item</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateWidget <em>Create Widget</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateAction <em>Create Action</em>}</li>
 *   <li>{@link android.impl.MetaAppImpl#getCreateDialog <em>Create Dialog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaAppImpl extends MinimalEObjectImpl.Container implements MetaApp {
	/**
	 * The cached value of the '{@link #getCreateApp() <em>Create App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateApp()
	 * @generated
	 * @ordered
	 */
	protected Aplication createApp;

	/**
	 * The cached value of the '{@link #getCreateActivity() <em>Create Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> createActivity;

	/**
	 * The cached value of the '{@link #getCreateMenu() <em>Create Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> createMenu;

	/**
	 * The cached value of the '{@link #getCreate_String() <em>Create String</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate_String()
	 * @generated
	 * @ordered
	 */
	protected EList<CreateString> create_String;

	/**
	 * The cached value of the '{@link #getCreateLayout() <em>Create Layout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateLayout()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> createLayout;

	/**
	 * The cached value of the '{@link #getCreateItem() <em>Create Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> createItem;

	/**
	 * The cached value of the '{@link #getCreateWidget() <em>Create Widget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateWidget()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> createWidget;

	/**
	 * The cached value of the '{@link #getCreateAction() <em>Create Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> createAction;

	/**
	 * The cached value of the '{@link #getCreateDialog() <em>Create Dialog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDialog()
	 * @generated
	 * @ordered
	 */
	protected EList<Dialog> createDialog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.META_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplication getCreateApp() {
		return createApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateApp(Aplication newCreateApp, NotificationChain msgs) {
		Aplication oldCreateApp = createApp;
		createApp = newCreateApp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidPackage.META_APP__CREATE_APP, oldCreateApp, newCreateApp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateApp(Aplication newCreateApp) {
		if (newCreateApp != createApp) {
			NotificationChain msgs = null;
			if (createApp != null)
				msgs = ((InternalEObject)createApp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidPackage.META_APP__CREATE_APP, null, msgs);
			if (newCreateApp != null)
				msgs = ((InternalEObject)newCreateApp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidPackage.META_APP__CREATE_APP, null, msgs);
			msgs = basicSetCreateApp(newCreateApp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.META_APP__CREATE_APP, newCreateApp, newCreateApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getCreateActivity() {
		if (createActivity == null) {
			createActivity = new EObjectContainmentEList<Activity>(Activity.class, this, AndroidPackage.META_APP__CREATE_ACTIVITY);
		}
		return createActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getCreateMenu() {
		if (createMenu == null) {
			createMenu = new EObjectContainmentEList<Menu>(Menu.class, this, AndroidPackage.META_APP__CREATE_MENU);
		}
		return createMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateString> getCreate_String() {
		if (create_String == null) {
			create_String = new EObjectContainmentEList<CreateString>(CreateString.class, this, AndroidPackage.META_APP__CREATE_STRING);
		}
		return create_String;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getCreateLayout() {
		if (createLayout == null) {
			createLayout = new EObjectContainmentEList<Layout>(Layout.class, this, AndroidPackage.META_APP__CREATE_LAYOUT);
		}
		return createLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getCreateItem() {
		if (createItem == null) {
			createItem = new EObjectContainmentEList<Item>(Item.class, this, AndroidPackage.META_APP__CREATE_ITEM);
		}
		return createItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getCreateWidget() {
		if (createWidget == null) {
			createWidget = new EObjectContainmentEList<Widget>(Widget.class, this, AndroidPackage.META_APP__CREATE_WIDGET);
		}
		return createWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getCreateAction() {
		if (createAction == null) {
			createAction = new EObjectContainmentEList<Action>(Action.class, this, AndroidPackage.META_APP__CREATE_ACTION);
		}
		return createAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dialog> getCreateDialog() {
		if (createDialog == null) {
			createDialog = new EObjectContainmentEList<Dialog>(Dialog.class, this, AndroidPackage.META_APP__CREATE_DIALOG);
		}
		return createDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidPackage.META_APP__CREATE_APP:
				return basicSetCreateApp(null, msgs);
			case AndroidPackage.META_APP__CREATE_ACTIVITY:
				return ((InternalEList<?>)getCreateActivity()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_MENU:
				return ((InternalEList<?>)getCreateMenu()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_STRING:
				return ((InternalEList<?>)getCreate_String()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_LAYOUT:
				return ((InternalEList<?>)getCreateLayout()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_ITEM:
				return ((InternalEList<?>)getCreateItem()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_WIDGET:
				return ((InternalEList<?>)getCreateWidget()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_ACTION:
				return ((InternalEList<?>)getCreateAction()).basicRemove(otherEnd, msgs);
			case AndroidPackage.META_APP__CREATE_DIALOG:
				return ((InternalEList<?>)getCreateDialog()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidPackage.META_APP__CREATE_APP:
				return getCreateApp();
			case AndroidPackage.META_APP__CREATE_ACTIVITY:
				return getCreateActivity();
			case AndroidPackage.META_APP__CREATE_MENU:
				return getCreateMenu();
			case AndroidPackage.META_APP__CREATE_STRING:
				return getCreate_String();
			case AndroidPackage.META_APP__CREATE_LAYOUT:
				return getCreateLayout();
			case AndroidPackage.META_APP__CREATE_ITEM:
				return getCreateItem();
			case AndroidPackage.META_APP__CREATE_WIDGET:
				return getCreateWidget();
			case AndroidPackage.META_APP__CREATE_ACTION:
				return getCreateAction();
			case AndroidPackage.META_APP__CREATE_DIALOG:
				return getCreateDialog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AndroidPackage.META_APP__CREATE_APP:
				setCreateApp((Aplication)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_ACTIVITY:
				getCreateActivity().clear();
				getCreateActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_MENU:
				getCreateMenu().clear();
				getCreateMenu().addAll((Collection<? extends Menu>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_STRING:
				getCreate_String().clear();
				getCreate_String().addAll((Collection<? extends CreateString>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_LAYOUT:
				getCreateLayout().clear();
				getCreateLayout().addAll((Collection<? extends Layout>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_ITEM:
				getCreateItem().clear();
				getCreateItem().addAll((Collection<? extends Item>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_WIDGET:
				getCreateWidget().clear();
				getCreateWidget().addAll((Collection<? extends Widget>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_ACTION:
				getCreateAction().clear();
				getCreateAction().addAll((Collection<? extends Action>)newValue);
				return;
			case AndroidPackage.META_APP__CREATE_DIALOG:
				getCreateDialog().clear();
				getCreateDialog().addAll((Collection<? extends Dialog>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AndroidPackage.META_APP__CREATE_APP:
				setCreateApp((Aplication)null);
				return;
			case AndroidPackage.META_APP__CREATE_ACTIVITY:
				getCreateActivity().clear();
				return;
			case AndroidPackage.META_APP__CREATE_MENU:
				getCreateMenu().clear();
				return;
			case AndroidPackage.META_APP__CREATE_STRING:
				getCreate_String().clear();
				return;
			case AndroidPackage.META_APP__CREATE_LAYOUT:
				getCreateLayout().clear();
				return;
			case AndroidPackage.META_APP__CREATE_ITEM:
				getCreateItem().clear();
				return;
			case AndroidPackage.META_APP__CREATE_WIDGET:
				getCreateWidget().clear();
				return;
			case AndroidPackage.META_APP__CREATE_ACTION:
				getCreateAction().clear();
				return;
			case AndroidPackage.META_APP__CREATE_DIALOG:
				getCreateDialog().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AndroidPackage.META_APP__CREATE_APP:
				return createApp != null;
			case AndroidPackage.META_APP__CREATE_ACTIVITY:
				return createActivity != null && !createActivity.isEmpty();
			case AndroidPackage.META_APP__CREATE_MENU:
				return createMenu != null && !createMenu.isEmpty();
			case AndroidPackage.META_APP__CREATE_STRING:
				return create_String != null && !create_String.isEmpty();
			case AndroidPackage.META_APP__CREATE_LAYOUT:
				return createLayout != null && !createLayout.isEmpty();
			case AndroidPackage.META_APP__CREATE_ITEM:
				return createItem != null && !createItem.isEmpty();
			case AndroidPackage.META_APP__CREATE_WIDGET:
				return createWidget != null && !createWidget.isEmpty();
			case AndroidPackage.META_APP__CREATE_ACTION:
				return createAction != null && !createAction.isEmpty();
			case AndroidPackage.META_APP__CREATE_DIALOG:
				return createDialog != null && !createDialog.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaAppImpl
