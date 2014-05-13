package mandroid.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import mandroid.diagram.providers.MAndroidElementTypes;
import mandroid.diagram.providers.MAndroidModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MAndroidModelingAssistantProviderOfAplicationEditPart extends
		MAndroidModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MAndroidElementTypes.Layout_2001);
		types.add(MAndroidElementTypes.Activity_2002);
		return types;
	}

}
