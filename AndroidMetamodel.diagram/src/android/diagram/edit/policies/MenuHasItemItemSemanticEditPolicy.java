package android.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class MenuHasItemItemSemanticEditPolicy extends
		AndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MenuHasItemItemSemanticEditPolicy() {
		super(AndroidElementTypes.MenuHasItem_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
