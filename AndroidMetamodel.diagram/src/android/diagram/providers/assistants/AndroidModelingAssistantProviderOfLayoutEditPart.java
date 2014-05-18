package android.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import android.diagram.edit.parts.ButtonEditPart;
import android.diagram.edit.parts.LayoutEditPart;
import android.diagram.edit.parts.TextFieldEditPart;
import android.diagram.edit.parts.TextViewEditPart;
import android.diagram.providers.AndroidElementTypes;
import android.diagram.providers.AndroidModelingAssistantProvider;

/**
 * @generated
 */
public class AndroidModelingAssistantProviderOfLayoutEditPart extends
		AndroidModelingAssistantProvider {

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
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(AndroidElementTypes.LayoutContains_4002);
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
		if (targetEditPart instanceof TextFieldEditPart) {
			types.add(AndroidElementTypes.LayoutContains_4002);
		}
		if (targetEditPart instanceof ButtonEditPart) {
			types.add(AndroidElementTypes.LayoutContains_4002);
		}
		if (targetEditPart instanceof TextViewEditPart) {
			types.add(AndroidElementTypes.LayoutContains_4002);
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
		if (relationshipType == AndroidElementTypes.LayoutContains_4002) {
			types.add(AndroidElementTypes.TextField_2009);
			types.add(AndroidElementTypes.Button_2006);
			types.add(AndroidElementTypes.TextView_2012);
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
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AndroidElementTypes.AplicationContains_4007);
		types.add(AndroidElementTypes.ActivityMuestra_4009);
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
		if (relationshipType == AndroidElementTypes.AplicationContains_4007) {
			types.add(AndroidElementTypes.Aplication_2001);
		} else if (relationshipType == AndroidElementTypes.ActivityMuestra_4009) {
			types.add(AndroidElementTypes.Activity_2010);
		}
		return types;
	}

}
