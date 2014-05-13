package mandroid.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mandroid.diagram.edit.parts.LayoutEditPart;
import mandroid.diagram.providers.MAndroidElementTypes;
import mandroid.diagram.providers.MAndroidModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MAndroidModelingAssistantProviderOfLayoutEditPart extends
		MAndroidModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((LayoutEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(LayoutEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MAndroidElementTypes.Button_4001);
		types.add(MAndroidElementTypes.TextView_4002);
		types.add(MAndroidElementTypes.TextField_4003);
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
		return doGetRelTypesOnSourceAndTarget((LayoutEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			LayoutEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof LayoutEditPart) {
			types.add(MAndroidElementTypes.Button_4001);
		}
		if (targetEditPart instanceof LayoutEditPart) {
			types.add(MAndroidElementTypes.TextView_4002);
		}
		if (targetEditPart instanceof LayoutEditPart) {
			types.add(MAndroidElementTypes.TextField_4003);
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
		return doGetTypesForTarget((LayoutEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(LayoutEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MAndroidElementTypes.Button_4001) {
			types.add(MAndroidElementTypes.Layout_2001);
		} else if (relationshipType == MAndroidElementTypes.TextView_4002) {
			types.add(MAndroidElementTypes.Layout_2001);
		} else if (relationshipType == MAndroidElementTypes.TextField_4003) {
			types.add(MAndroidElementTypes.Layout_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((LayoutEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(LayoutEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MAndroidElementTypes.Button_4001);
		types.add(MAndroidElementTypes.TextView_4002);
		types.add(MAndroidElementTypes.TextField_4003);
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
		return doGetTypesForSource((LayoutEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(LayoutEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MAndroidElementTypes.Button_4001) {
			types.add(MAndroidElementTypes.Layout_2001);
		} else if (relationshipType == MAndroidElementTypes.TextView_4002) {
			types.add(MAndroidElementTypes.Layout_2001);
		} else if (relationshipType == MAndroidElementTypes.TextField_4003) {
			types.add(MAndroidElementTypes.Layout_2001);
		}
		return types;
	}

}
