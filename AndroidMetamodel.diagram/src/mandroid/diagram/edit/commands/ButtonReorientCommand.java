package mandroid.diagram.edit.commands;

import mandroid.Button;
import mandroid.Layout;
import mandroid.diagram.edit.policies.MAndroidBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ButtonReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ButtonReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Button) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Layout && newEnd instanceof Layout)) {
			return false;
		}
		Layout target = getLink().getLayoutOwner();
		return MAndroidBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistButton_4001(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Layout && newEnd instanceof Layout)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Layout)) {
			return false;
		}
		Layout source = (Layout) getLink().eContainer();
		return MAndroidBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistButton_4001(getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getContains().remove(getLink());
		getNewSource().getContains().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setLayoutOwner(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Button getLink() {
		return (Button) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Layout getOldSource() {
		return (Layout) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Layout getNewSource() {
		return (Layout) newEnd;
	}

	/**
	 * @generated
	 */
	protected Layout getOldTarget() {
		return (Layout) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Layout getNewTarget() {
		return (Layout) newEnd;
	}
}
