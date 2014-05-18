package android.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import android.diagram.edit.parts.AndroidEditPartFactory;
import android.diagram.edit.parts.MetaAppEditPart;
import android.diagram.part.AndroidVisualIDRegistry;

/**
 * @generated
 */
public class AndroidEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public AndroidEditPartProvider() {
		super(new AndroidEditPartFactory(),
				AndroidVisualIDRegistry.TYPED_INSTANCE,
				MetaAppEditPart.MODEL_ID);
	}

}
