package android.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import android.Action;
import android.Activity;
import android.Aplication;
import android.Button;
import android.CreateString;
import android.Dialog;
import android.Item;
import android.Layout;
import android.Menu;
import android.Widget;
import android.diagram.part.AndroidDiagramEditorPlugin;
import android.diagram.part.AndroidVisualIDRegistry;
import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class AndroidBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected AndroidBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						AndroidVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = AndroidElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = AndroidDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			AndroidDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateAplicationRun_4001(Aplication source,
				Activity target) {
			if (source != null) {
				if (source.getRun().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getRunsIn() != null)) {
				return false;
			}

			return canExistAplicationRun_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLayoutContains_4002(Layout source, Widget target) {
			if (source != null) {
				if (source.getContains().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getLayoutOwner() != null)) {
				return false;
			}

			return canExistLayoutContains_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActivityShow_4003(Activity source, Menu target) {
			if (source != null) {
				if (source.getShow() != null) {
					return false;
				}
			}
			if (target != null && (target.getIsShowed() != null)) {
				return false;
			}

			return canExistActivityShow_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMenuHasItem_4004(Menu source, Item target) {
			if (source != null) {
				if (source.getHasItem().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getMenuOwner() != null)) {
				return false;
			}

			return canExistMenuHasItem_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAplicationCreates_4005(Aplication source,
				CreateString target) {
			if (source != null) {
				if (source.getCreates().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getStored() != null)) {
				return false;
			}

			return canExistAplicationCreates_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActionShows_4006(Action source, Dialog target) {
			if (source != null) {
				if (source.getShows() != null) {
					return false;
				}
			}
			if (target != null && (target.getActionOwner() != null)) {
				return false;
			}

			return canExistActionShows_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAplicationContains_4007(Aplication source,
				Layout target) {
			if (source != null) {
				if (source.getContains().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getLayOn() != null)) {
				return false;
			}

			return canExistAplicationContains_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateButtonTriggers_4008(Button source, Action target) {
			if (source != null) {
				if (source.getTriggers().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getButtonOwner() != null)) {
				return false;
			}

			return canExistButtonTriggers_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateActivityMuestra_4009(Activity source,
				Layout target) {
			if (source != null) {
				if (source.getMuestra() != null) {
					return false;
				}
			}
			if (target != null && (target.getEsMostrado().contains(target))) {
				return false;
			}

			return canExistActivityMuestra_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistAplicationRun_4001(Aplication source,
				Activity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLayoutContains_4002(Layout source, Widget target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActivityShow_4003(Activity source, Menu target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMenuHasItem_4004(Menu source, Item target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAplicationCreates_4005(Aplication source,
				CreateString target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActionShows_4006(Action source, Dialog target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAplicationContains_4007(Aplication source,
				Layout target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistButtonTriggers_4008(Button source, Action target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistActivityMuestra_4009(Activity source,
				Layout target) {
			return true;
		}
	}

}
