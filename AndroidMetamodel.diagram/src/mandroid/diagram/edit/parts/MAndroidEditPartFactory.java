package mandroid.diagram.edit.parts;

import mandroid.diagram.part.MAndroidVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MAndroidEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MAndroidVisualIDRegistry.getVisualID(view)) {

			case AplicationEditPart.VISUAL_ID:
				return new AplicationEditPart(view);

			case LayoutEditPart.VISUAL_ID:
				return new LayoutEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case TextViewEditPart.VISUAL_ID:
				return new TextViewEditPart(view);

			case TextViewNameEditPart.VISUAL_ID:
				return new TextViewNameEditPart(view);

			case TextFieldEditPart.VISUAL_ID:
				return new TextFieldEditPart(view);

			case TextFieldNameEditPart.VISUAL_ID:
				return new TextFieldNameEditPart(view);

			case LayoutLayOnEditPart.VISUAL_ID:
				return new LayoutLayOnEditPart(view);

			case ActivityRunsInEditPart.VISUAL_ID:
				return new ActivityRunsInEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
