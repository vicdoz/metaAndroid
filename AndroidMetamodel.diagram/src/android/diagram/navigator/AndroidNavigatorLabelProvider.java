package android.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import android.Action;
import android.diagram.edit.parts.ActionEditPart;
import android.diagram.edit.parts.ActionShowsEditPart;
import android.diagram.edit.parts.ActivityEditPart;
import android.diagram.edit.parts.ActivityMuestraEditPart;
import android.diagram.edit.parts.ActivityNameEditPart;
import android.diagram.edit.parts.ActivityShowEditPart;
import android.diagram.edit.parts.AplicationContainsEditPart;
import android.diagram.edit.parts.AplicationCreatesEditPart;
import android.diagram.edit.parts.AplicationEditPart;
import android.diagram.edit.parts.AplicationNameEditPart;
import android.diagram.edit.parts.AplicationRunEditPart;
import android.diagram.edit.parts.ButtonEditPart;
import android.diagram.edit.parts.ButtonNameEditPart;
import android.diagram.edit.parts.ButtonTriggersEditPart;
import android.diagram.edit.parts.CreateStringEditPart;
import android.diagram.edit.parts.CreateStringNameEditPart;
import android.diagram.edit.parts.DialogEditPart;
import android.diagram.edit.parts.DialogTextEditPart;
import android.diagram.edit.parts.ItemEditPart;
import android.diagram.edit.parts.ItemTittleEditPart;
import android.diagram.edit.parts.LayoutContainsEditPart;
import android.diagram.edit.parts.LayoutEditPart;
import android.diagram.edit.parts.LayoutNameEditPart;
import android.diagram.edit.parts.MenuEditPart;
import android.diagram.edit.parts.MenuHasItemEditPart;
import android.diagram.edit.parts.MenuIdEditPart;
import android.diagram.edit.parts.MetaAppEditPart;
import android.diagram.edit.parts.TextFieldEditPart;
import android.diagram.edit.parts.TextFieldNameEditPart;
import android.diagram.edit.parts.TextViewEditPart;
import android.diagram.edit.parts.TextViewNameEditPart;
import android.diagram.part.AndroidDiagramEditorPlugin;
import android.diagram.part.AndroidVisualIDRegistry;
import android.diagram.providers.AndroidElementTypes;
import android.diagram.providers.AndroidParserProvider;

/**
 * @generated
 */
public class AndroidNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		AndroidDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		AndroidDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof AndroidNavigatorItem
				&& !isOwnView(((AndroidNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof AndroidNavigatorGroup) {
			AndroidNavigatorGroup group = (AndroidNavigatorGroup) element;
			return AndroidDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof AndroidNavigatorItem) {
			AndroidNavigatorItem navigatorItem = (AndroidNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (AndroidVisualIDRegistry.getVisualID(view)) {
		case MetaAppEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://android/1.0?MetaApp", AndroidElementTypes.MetaApp_1000); //$NON-NLS-1$
		case AplicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Aplication", AndroidElementTypes.Aplication_2001); //$NON-NLS-1$
		case CreateStringEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?CreateString", AndroidElementTypes.CreateString_2002); //$NON-NLS-1$
		case ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Action", AndroidElementTypes.Action_2003); //$NON-NLS-1$
		case ItemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Item", AndroidElementTypes.Item_2005); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Button", AndroidElementTypes.Button_2006); //$NON-NLS-1$
		case DialogEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Dialog", AndroidElementTypes.Dialog_2007); //$NON-NLS-1$
		case LayoutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Layout", AndroidElementTypes.Layout_2008); //$NON-NLS-1$
		case TextFieldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?TextField", AndroidElementTypes.TextField_2009); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Activity", AndroidElementTypes.Activity_2010); //$NON-NLS-1$
		case MenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?Menu", AndroidElementTypes.Menu_2011); //$NON-NLS-1$
		case TextViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://android/1.0?TextView", AndroidElementTypes.TextView_2012); //$NON-NLS-1$
		case AplicationRunEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Aplication?run", AndroidElementTypes.AplicationRun_4001); //$NON-NLS-1$
		case LayoutContainsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Layout?contains", AndroidElementTypes.LayoutContains_4002); //$NON-NLS-1$
		case ActivityShowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Activity?show", AndroidElementTypes.ActivityShow_4003); //$NON-NLS-1$
		case MenuHasItemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Menu?hasItem", AndroidElementTypes.MenuHasItem_4004); //$NON-NLS-1$
		case AplicationCreatesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Aplication?creates", AndroidElementTypes.AplicationCreates_4005); //$NON-NLS-1$
		case ActionShowsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Action?shows", AndroidElementTypes.ActionShows_4006); //$NON-NLS-1$
		case AplicationContainsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Aplication?contains", AndroidElementTypes.AplicationContains_4007); //$NON-NLS-1$
		case ButtonTriggersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Button?triggers", AndroidElementTypes.ButtonTriggers_4008); //$NON-NLS-1$
		case ActivityMuestraEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://android/1.0?Activity?muestra", AndroidElementTypes.ActivityMuestra_4009); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AndroidDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& AndroidElementTypes.isKnownElementType(elementType)) {
			image = AndroidElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof AndroidNavigatorGroup) {
			AndroidNavigatorGroup group = (AndroidNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AndroidNavigatorItem) {
			AndroidNavigatorItem navigatorItem = (AndroidNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (AndroidVisualIDRegistry.getVisualID(view)) {
		case MetaAppEditPart.VISUAL_ID:
			return getMetaApp_1000Text(view);
		case AplicationEditPart.VISUAL_ID:
			return getAplication_2001Text(view);
		case CreateStringEditPart.VISUAL_ID:
			return getCreateString_2002Text(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2003Text(view);
		case ItemEditPart.VISUAL_ID:
			return getItem_2005Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_2006Text(view);
		case DialogEditPart.VISUAL_ID:
			return getDialog_2007Text(view);
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2008Text(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_2009Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2010Text(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_2011Text(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_2012Text(view);
		case AplicationRunEditPart.VISUAL_ID:
			return getAplicationRun_4001Text(view);
		case LayoutContainsEditPart.VISUAL_ID:
			return getLayoutContains_4002Text(view);
		case ActivityShowEditPart.VISUAL_ID:
			return getActivityShow_4003Text(view);
		case MenuHasItemEditPart.VISUAL_ID:
			return getMenuHasItem_4004Text(view);
		case AplicationCreatesEditPart.VISUAL_ID:
			return getAplicationCreates_4005Text(view);
		case ActionShowsEditPart.VISUAL_ID:
			return getActionShows_4006Text(view);
		case AplicationContainsEditPart.VISUAL_ID:
			return getAplicationContains_4007Text(view);
		case ButtonTriggersEditPart.VISUAL_ID:
			return getButtonTriggers_4008Text(view);
		case ActivityMuestraEditPart.VISUAL_ID:
			return getActivityMuestra_4009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMetaApp_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAplication_2001Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.Aplication_2001,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry
						.getType(AplicationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreateString_2002Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.CreateString_2002,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry
						.getType(CreateStringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_2003Text(View view) {
		Action domainModelElement = (Action) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getItem_2005Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.Item_2005,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry.getType(ItemTittleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getButton_2006Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.Button_2006,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDialog_2007Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.Dialog_2007,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry.getType(DialogTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayout_2008Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.Layout_2008,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry.getType(LayoutNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextField_2009Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.TextField_2009,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry
						.getType(TextFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_2010Text(View view) {
		IParser parser = AndroidParserProvider
				.getParser(AndroidElementTypes.Activity_2010,
						view.getElement() != null ? view.getElement() : view,
						AndroidVisualIDRegistry
								.getType(ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenu_2011Text(View view) {
		IParser parser = AndroidParserProvider.getParser(
				AndroidElementTypes.Menu_2011,
				view.getElement() != null ? view.getElement() : view,
				AndroidVisualIDRegistry.getType(MenuIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextView_2012Text(View view) {
		IParser parser = AndroidParserProvider
				.getParser(AndroidElementTypes.TextView_2012,
						view.getElement() != null ? view.getElement() : view,
						AndroidVisualIDRegistry
								.getType(TextViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAplicationRun_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLayoutContains_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityShow_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMenuHasItem_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAplicationCreates_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActionShows_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAplicationContains_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getButtonTriggers_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityMuestra_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MetaAppEditPart.MODEL_ID.equals(AndroidVisualIDRegistry
				.getModelID(view));
	}

}
