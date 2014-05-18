package android.diagram.providers;

import android.diagram.part.AndroidDiagramEditorPlugin;

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
		ElementInitializers cached = AndroidDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			AndroidDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
