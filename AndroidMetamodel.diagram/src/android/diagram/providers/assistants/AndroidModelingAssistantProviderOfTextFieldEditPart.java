package android.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import android.diagram.edit.parts.TextFieldEditPart;
import android.diagram.providers.AndroidElementTypes;
import android.diagram.providers.AndroidModelingAssistantProvider;

/**
 * @generated
 */
public class AndroidModelingAssistantProviderOfTextFieldEditPart extends
		AndroidModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TextFieldEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(TextFieldEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(AndroidElementTypes.LayoutContains_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TextFieldEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(TextFieldEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AndroidElementTypes.LayoutContains_4002) {
			types.add(AndroidElementTypes.Layout_2008);
		}
		return types;
	}

}
