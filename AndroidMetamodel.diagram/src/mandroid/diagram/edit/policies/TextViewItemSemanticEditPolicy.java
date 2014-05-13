package mandroid.diagram.edit.policies;

import mandroid.diagram.providers.MAndroidElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class TextViewItemSemanticEditPolicy extends
		MAndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TextViewItemSemanticEditPolicy() {
		super(MAndroidElementTypes.TextView_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
