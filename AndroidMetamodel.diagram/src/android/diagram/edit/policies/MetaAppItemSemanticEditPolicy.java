package android.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import android.diagram.edit.commands.ActionCreateCommand;
import android.diagram.edit.commands.ActivityCreateCommand;
import android.diagram.edit.commands.AplicationCreateCommand;
import android.diagram.edit.commands.ButtonCreateCommand;
import android.diagram.edit.commands.CreateStringCreateCommand;
import android.diagram.edit.commands.DialogCreateCommand;
import android.diagram.edit.commands.ItemCreateCommand;
import android.diagram.edit.commands.LayoutCreateCommand;
import android.diagram.edit.commands.MenuCreateCommand;
import android.diagram.edit.commands.TextFieldCreateCommand;
import android.diagram.edit.commands.TextViewCreateCommand;
import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class MetaAppItemSemanticEditPolicy extends
		AndroidBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetaAppItemSemanticEditPolicy() {
		super(AndroidElementTypes.MetaApp_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AndroidElementTypes.Layout_2008 == req.getElementType()) {
			return getGEFWrapper(new LayoutCreateCommand(req));
		}
		if (AndroidElementTypes.TextField_2009 == req.getElementType()) {
			return getGEFWrapper(new TextFieldCreateCommand(req));
		}
		if (AndroidElementTypes.Button_2006 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (AndroidElementTypes.CreateString_2002 == req.getElementType()) {
			return getGEFWrapper(new CreateStringCreateCommand(req));
		}
		if (AndroidElementTypes.Activity_2010 == req.getElementType()) {
			return getGEFWrapper(new ActivityCreateCommand(req));
		}
		if (AndroidElementTypes.Aplication_2001 == req.getElementType()) {
			return getGEFWrapper(new AplicationCreateCommand(req));
		}
		if (AndroidElementTypes.Action_2003 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		if (AndroidElementTypes.Dialog_2007 == req.getElementType()) {
			return getGEFWrapper(new DialogCreateCommand(req));
		}
		if (AndroidElementTypes.Item_2005 == req.getElementType()) {
			return getGEFWrapper(new ItemCreateCommand(req));
		}
		if (AndroidElementTypes.Menu_2011 == req.getElementType()) {
			return getGEFWrapper(new MenuCreateCommand(req));
		}
		if (AndroidElementTypes.TextView_2012 == req.getElementType()) {
			return getGEFWrapper(new TextViewCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
