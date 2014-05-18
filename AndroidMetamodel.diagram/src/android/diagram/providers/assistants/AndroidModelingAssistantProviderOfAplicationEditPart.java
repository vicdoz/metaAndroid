package android.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import android.diagram.edit.parts.ActivityEditPart;
import android.diagram.edit.parts.AplicationEditPart;
import android.diagram.edit.parts.CreateStringEditPart;
import android.diagram.edit.parts.LayoutEditPart;
import android.diagram.providers.AndroidElementTypes;
import android.diagram.providers.AndroidModelingAssistantProvider;

/**
 * @generated
 */
public class AndroidModelingAssistantProviderOfAplicationEditPart extends
		AndroidModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AplicationEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(AplicationEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(AndroidElementTypes.AplicationRun_4001);
		types.add(AndroidElementTypes.AplicationCreates_4005);
		types.add(AndroidElementTypes.AplicationContains_4007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(AplicationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			AplicationEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(AndroidElementTypes.AplicationRun_4001);
		}
		if (targetEditPart instanceof CreateStringEditPart) {
			types.add(AndroidElementTypes.AplicationCreates_4005);
		}
		if (targetEditPart instanceof LayoutEditPart) {
			types.add(AndroidElementTypes.AplicationContains_4007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AplicationEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(AplicationEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AndroidElementTypes.AplicationRun_4001) {
			types.add(AndroidElementTypes.Activity_2010);
		} else if (relationshipType == AndroidElementTypes.AplicationCreates_4005) {
			types.add(AndroidElementTypes.CreateString_2002);
		} else if (relationshipType == AndroidElementTypes.AplicationContains_4007) {
			types.add(AndroidElementTypes.Layout_2008);
		}
		return types;
	}

}
