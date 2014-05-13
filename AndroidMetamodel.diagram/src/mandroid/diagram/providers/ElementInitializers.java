package mandroid.diagram.providers;

import mandroid.diagram.part.MAndroidDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MAndroidDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MAndroidDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
