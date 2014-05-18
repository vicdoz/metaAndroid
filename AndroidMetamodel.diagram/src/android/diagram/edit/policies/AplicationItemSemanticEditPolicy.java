package android.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import android.diagram.edit.commands.AplicationContainsCreateCommand;
import android.diagram.edit.commands.AplicationContainsReorientCommand;
import android.diagram.edit.commands.AplicationCreatesCreateCommand;
import android.diagram.edit.commands.AplicationCreatesReorientCommand;
import android.diagram.edit.commands.AplicationRunCreateCommand;
import android.diagram.edit.commands.AplicationRunReorientCommand;
import android.diagram.edit.parts.AplicationContainsEditPart;
import android.diagram.edit.parts.AplicationCreatesEditPart;
import android.diagram.edit.parts.AplicationRunEditPart;
import android.diagram.part.AndroidVisualIDRegistry;
import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class AplicationItemSemanticEditPolicy extends
		AndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AplicationItemSemanticEditPolicy() {
		super(AndroidElementTypes.Aplication_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (AndroidVisualIDRegistry.getVisualID(outgoingLink) == AplicationRunEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AndroidVisualIDRegistry.getVisualID(outgoingLink) == AplicationCreatesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AndroidVisualIDRegistry.getVisualID(outgoingLink) == AplicationContainsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AndroidElementTypes.AplicationRun_4001 == req.getElementType()) {
			return getGEFWrapper(new AplicationRunCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AndroidElementTypes.AplicationCreates_4005 == req.getElementType()) {
			return getGEFWrapper(new AplicationCreatesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AndroidElementTypes.AplicationContains_4007 == req.getElementType()) {
			return getGEFWrapper(new AplicationContainsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AndroidElementTypes.AplicationRun_4001 == req.getElementType()) {
			return null;
		}
		if (AndroidElementTypes.AplicationCreates_4005 == req.getElementType()) {
			return null;
		}
		if (AndroidElementTypes.AplicationContains_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AplicationRunEditPart.VISUAL_ID:
			return getGEFWrapper(new AplicationRunReorientCommand(req));
		case AplicationCreatesEditPart.VISUAL_ID:
			return getGEFWrapper(new AplicationCreatesReorientCommand(req));
		case AplicationContainsEditPart.VISUAL_ID:
			return getGEFWrapper(new AplicationContainsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
