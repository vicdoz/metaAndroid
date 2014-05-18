package android.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import android.diagram.part.AndroidVisualIDRegistry;

/**
 * @generated
 */
public class AndroidNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4011;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof AndroidNavigatorItem) {
			AndroidNavigatorItem item = (AndroidNavigatorItem) element;
			return AndroidVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
