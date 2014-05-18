package android.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class ActivityMuestraItemSemanticEditPolicy extends
		AndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityMuestraItemSemanticEditPolicy() {
		super(AndroidElementTypes.ActivityMuestra_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
