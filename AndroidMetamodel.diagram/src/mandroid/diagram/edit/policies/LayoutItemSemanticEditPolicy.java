package mandroid.diagram.edit.policies;

import java.util.Iterator;

import mandroid.diagram.edit.commands.ButtonCreateCommand;
import mandroid.diagram.edit.commands.ButtonReorientCommand;
import mandroid.diagram.edit.commands.LayoutLayOnCreateCommand;
import mandroid.diagram.edit.commands.LayoutLayOnReorientCommand;
import mandroid.diagram.edit.commands.TextFieldCreateCommand;
import mandroid.diagram.edit.commands.TextFieldReorientCommand;
import mandroid.diagram.edit.commands.TextViewCreateCommand;
import mandroid.diagram.edit.commands.TextViewReorientCommand;
import mandroid.diagram.edit.parts.ButtonEditPart;
import mandroid.diagram.edit.parts.LayoutLayOnEditPart;
import mandroid.diagram.edit.parts.TextFieldEditPart;
import mandroid.diagram.edit.parts.TextViewEditPart;
import mandroid.diagram.part.MAndroidVisualIDRegistry;
import mandroid.diagram.providers.MAndroidElementTypes;

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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LayoutItemSemanticEditPolicy extends
		MAndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LayoutItemSemanticEditPolicy() {
		super(MAndroidElementTypes.Layout_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MAndroidVisualIDRegistry.getVisualID(incomingLink) == ButtonEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MAndroidVisualIDRegistry.getVisualID(incomingLink) == TextViewEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MAndroidVisualIDRegistry.getVisualID(incomingLink) == TextFieldEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MAndroidVisualIDRegistry.getVisualID(outgoingLink) == ButtonEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MAndroidVisualIDRegistry.getVisualID(outgoingLink) == TextViewEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MAndroidVisualIDRegistry.getVisualID(outgoingLink) == TextFieldEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MAndroidVisualIDRegistry.getVisualID(outgoingLink) == LayoutLayOnEditPart.VISUAL_ID) {
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
		if (MAndroidElementTypes.Button_4001 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (MAndroidElementTypes.TextView_4002 == req.getElementType()) {
			return getGEFWrapper(new TextViewCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MAndroidElementTypes.TextField_4003 == req.getElementType()) {
			return getGEFWrapper(new TextFieldCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MAndroidElementTypes.LayoutLayOn_4004 == req.getElementType()) {
			return getGEFWrapper(new LayoutLayOnCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MAndroidElementTypes.Button_4001 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (MAndroidElementTypes.TextView_4002 == req.getElementType()) {
			return getGEFWrapper(new TextViewCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MAndroidElementTypes.TextField_4003 == req.getElementType()) {
			return getGEFWrapper(new TextFieldCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (MAndroidElementTypes.LayoutLayOn_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ButtonEditPart.VISUAL_ID:
			return getGEFWrapper(new ButtonReorientCommand(req));
		case TextViewEditPart.VISUAL_ID:
			return getGEFWrapper(new TextViewReorientCommand(req));
		case TextFieldEditPart.VISUAL_ID:
			return getGEFWrapper(new TextFieldReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
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
		case LayoutLayOnEditPart.VISUAL_ID:
			return getGEFWrapper(new LayoutLayOnReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
