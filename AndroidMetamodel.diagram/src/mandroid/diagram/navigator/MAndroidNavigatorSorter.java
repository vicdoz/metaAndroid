package mandroid.diagram.navigator;

import mandroid.diagram.part.MAndroidVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MAndroidNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MAndroidNavigatorItem) {
			MAndroidNavigatorItem item = (MAndroidNavigatorItem) element;
			return MAndroidVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
