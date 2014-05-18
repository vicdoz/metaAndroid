package android.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import android.diagram.part.AndroidVisualIDRegistry;

/**
 * @generated
 */
public class AndroidEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (AndroidVisualIDRegistry.getVisualID(view)) {

			case MetaAppEditPart.VISUAL_ID:
				return new MetaAppEditPart(view);

			case LayoutEditPart.VISUAL_ID:
				return new LayoutEditPart(view);

			case LayoutNameEditPart.VISUAL_ID:
				return new LayoutNameEditPart(view);

			case TextFieldEditPart.VISUAL_ID:
				return new TextFieldEditPart(view);

			case TextFieldNameEditPart.VISUAL_ID:
				return new TextFieldNameEditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case CreateStringEditPart.VISUAL_ID:
				return new CreateStringEditPart(view);

			case CreateStringNameEditPart.VISUAL_ID:
				return new CreateStringNameEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case AplicationEditPart.VISUAL_ID:
				return new AplicationEditPart(view);

			case AplicationNameEditPart.VISUAL_ID:
				return new AplicationNameEditPart(view);

			case ActionEditPart.VISUAL_ID:
				return new ActionEditPart(view);

			case DialogEditPart.VISUAL_ID:
				return new DialogEditPart(view);

			case DialogTextEditPart.VISUAL_ID:
				return new DialogTextEditPart(view);

			case ItemEditPart.VISUAL_ID:
				return new ItemEditPart(view);

			case ItemTittleEditPart.VISUAL_ID:
				return new ItemTittleEditPart(view);

			case MenuEditPart.VISUAL_ID:
				return new MenuEditPart(view);

			case MenuIdEditPart.VISUAL_ID:
				return new MenuIdEditPart(view);

			case TextViewEditPart.VISUAL_ID:
				return new TextViewEditPart(view);

			case TextViewNameEditPart.VISUAL_ID:
				return new TextViewNameEditPart(view);

			case AplicationRunEditPart.VISUAL_ID:
				return new AplicationRunEditPart(view);

			case LayoutContainsEditPart.VISUAL_ID:
				return new LayoutContainsEditPart(view);

			case ActivityShowEditPart.VISUAL_ID:
				return new ActivityShowEditPart(view);

			case MenuHasItemEditPart.VISUAL_ID:
				return new MenuHasItemEditPart(view);

			case AplicationCreatesEditPart.VISUAL_ID:
				return new AplicationCreatesEditPart(view);

			case ActionShowsEditPart.VISUAL_ID:
				return new ActionShowsEditPart(view);

			case AplicationContainsEditPart.VISUAL_ID:
				return new AplicationContainsEditPart(view);

			case ButtonTriggersEditPart.VISUAL_ID:
				return new ButtonTriggersEditPart(view);

			case ActivityMuestraEditPart.VISUAL_ID:
				return new ActivityMuestraEditPart(view);

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
