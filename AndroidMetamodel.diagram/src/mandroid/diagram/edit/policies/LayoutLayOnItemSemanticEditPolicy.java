package mandroid.diagram.edit.policies;

import mandroid.diagram.providers.MAndroidElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class LayoutLayOnItemSemanticEditPolicy extends
		MAndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LayoutLayOnItemSemanticEditPolicy() {
		super(MAndroidElementTypes.LayoutLayOn_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
