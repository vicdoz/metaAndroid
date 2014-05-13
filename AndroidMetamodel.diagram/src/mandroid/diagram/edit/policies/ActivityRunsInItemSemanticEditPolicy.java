package mandroid.diagram.edit.policies;

import mandroid.diagram.providers.MAndroidElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ActivityRunsInItemSemanticEditPolicy extends
		MAndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityRunsInItemSemanticEditPolicy() {
		super(MAndroidElementTypes.ActivityRunsIn_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
