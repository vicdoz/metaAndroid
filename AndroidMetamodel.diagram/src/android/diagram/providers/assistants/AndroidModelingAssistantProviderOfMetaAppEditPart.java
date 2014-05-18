package android.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import android.diagram.providers.AndroidElementTypes;
import android.diagram.providers.AndroidModelingAssistantProvider;

/**
 * @generated
 */
public class AndroidModelingAssistantProviderOfMetaAppEditPart extends
		AndroidModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(AndroidElementTypes.Layout_2008);
		types.add(AndroidElementTypes.TextField_2009);
		types.add(AndroidElementTypes.Button_2006);
		types.add(AndroidElementTypes.CreateString_2002);
		types.add(AndroidElementTypes.Activity_2010);
		types.add(AndroidElementTypes.Aplication_2001);
		types.add(AndroidElementTypes.Action_2003);
		types.add(AndroidElementTypes.Dialog_2007);
		types.add(AndroidElementTypes.Item_2005);
		types.add(AndroidElementTypes.Menu_2011);
		types.add(AndroidElementTypes.TextView_2012);
		return types;
	}

}
