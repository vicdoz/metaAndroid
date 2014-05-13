package mandroid.diagram.providers;

import mandroid.diagram.edit.parts.AplicationEditPart;
import mandroid.diagram.edit.parts.MAndroidEditPartFactory;
import mandroid.diagram.part.MAndroidVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class MAndroidEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public MAndroidEditPartProvider() {
		super(new MAndroidEditPartFactory(),
				MAndroidVisualIDRegistry.TYPED_INSTANCE,
				AplicationEditPart.MODEL_ID);
	}

}
