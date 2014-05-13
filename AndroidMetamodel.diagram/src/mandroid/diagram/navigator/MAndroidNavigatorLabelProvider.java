package mandroid.diagram.navigator;

import mandroid.Aplication;
import mandroid.Layout;
import mandroid.diagram.edit.parts.ActivityEditPart;
import mandroid.diagram.edit.parts.ActivityNameEditPart;
import mandroid.diagram.edit.parts.ActivityRunsInEditPart;
import mandroid.diagram.edit.parts.AplicationEditPart;
import mandroid.diagram.edit.parts.ButtonEditPart;
import mandroid.diagram.edit.parts.ButtonNameEditPart;
import mandroid.diagram.edit.parts.LayoutEditPart;
import mandroid.diagram.edit.parts.LayoutLayOnEditPart;
import mandroid.diagram.edit.parts.TextFieldEditPart;
import mandroid.diagram.edit.parts.TextFieldNameEditPart;
import mandroid.diagram.edit.parts.TextViewEditPart;
import mandroid.diagram.edit.parts.TextViewNameEditPart;
import mandroid.diagram.part.MAndroidDiagramEditorPlugin;
import mandroid.diagram.part.MAndroidVisualIDRegistry;
import mandroid.diagram.providers.MAndroidElementTypes;
import mandroid.diagram.providers.MAndroidParserProvider;

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

/**
 * @generated
 */
public class MAndroidNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MAndroidDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MAndroidDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MAndroidNavigatorItem
				&& !isOwnView(((MAndroidNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MAndroidNavigatorGroup) {
			MAndroidNavigatorGroup group = (MAndroidNavigatorGroup) element;
			return MAndroidDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MAndroidNavigatorItem) {
			MAndroidNavigatorItem navigatorItem = (MAndroidNavigatorItem) element;
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
		switch (MAndroidVisualIDRegistry.getVisualID(view)) {
		case AplicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://mandroid/1.0?Aplication", MAndroidElementTypes.Aplication_1000); //$NON-NLS-1$
		case LayoutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mandroid/1.0?Layout", MAndroidElementTypes.Layout_2001); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mandroid/1.0?Activity", MAndroidElementTypes.Activity_2002); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mandroid/1.0?Button", MAndroidElementTypes.Button_4001); //$NON-NLS-1$
		case TextViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mandroid/1.0?TextView", MAndroidElementTypes.TextView_4002); //$NON-NLS-1$
		case TextFieldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mandroid/1.0?TextField", MAndroidElementTypes.TextField_4003); //$NON-NLS-1$
		case LayoutLayOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mandroid/1.0?Layout?layOn", MAndroidElementTypes.LayoutLayOn_4004); //$NON-NLS-1$
		case ActivityRunsInEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mandroid/1.0?Activity?runsIn", MAndroidElementTypes.ActivityRunsIn_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MAndroidDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MAndroidElementTypes.isKnownElementType(elementType)) {
			image = MAndroidElementTypes.getImage(elementType);
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
		if (element instanceof MAndroidNavigatorGroup) {
			MAndroidNavigatorGroup group = (MAndroidNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MAndroidNavigatorItem) {
			MAndroidNavigatorItem navigatorItem = (MAndroidNavigatorItem) element;
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
		switch (MAndroidVisualIDRegistry.getVisualID(view)) {
		case AplicationEditPart.VISUAL_ID:
			return getAplication_1000Text(view);
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2001Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_4001Text(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_4002Text(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_4003Text(view);
		case LayoutLayOnEditPart.VISUAL_ID:
			return getLayoutLayOn_4004Text(view);
		case ActivityRunsInEditPart.VISUAL_ID:
			return getActivityRunsIn_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAplication_1000Text(View view) {
		Aplication domainModelElement = (Aplication) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MAndroidDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayout_2001Text(View view) {
		Layout domainModelElement = (Layout) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			MAndroidDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_2002Text(View view) {
		IParser parser = MAndroidParserProvider.getParser(
				MAndroidElementTypes.Activity_2002,
				view.getElement() != null ? view.getElement() : view,
				MAndroidVisualIDRegistry
						.getType(ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MAndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getButton_4001Text(View view) {
		IParser parser = MAndroidParserProvider.getParser(
				MAndroidElementTypes.Button_4001,
				view.getElement() != null ? view.getElement() : view,
				MAndroidVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MAndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextView_4002Text(View view) {
		IParser parser = MAndroidParserProvider.getParser(
				MAndroidElementTypes.TextView_4002,
				view.getElement() != null ? view.getElement() : view,
				MAndroidVisualIDRegistry
						.getType(TextViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MAndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextField_4003Text(View view) {
		IParser parser = MAndroidParserProvider.getParser(
				MAndroidElementTypes.TextField_4003,
				view.getElement() != null ? view.getElement() : view,
				MAndroidVisualIDRegistry
						.getType(TextFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MAndroidDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayoutLayOn_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActivityRunsIn_4005Text(View view) {
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
		return AplicationEditPart.MODEL_ID.equals(MAndroidVisualIDRegistry
				.getModelID(view));
	}

}
