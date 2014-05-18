package android.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import android.AndroidPackage;
import android.MetaApp;
import android.diagram.edit.parts.ActionEditPart;
import android.diagram.edit.parts.ActivityEditPart;
import android.diagram.edit.parts.ActivityNameEditPart;
import android.diagram.edit.parts.AplicationEditPart;
import android.diagram.edit.parts.AplicationNameEditPart;
import android.diagram.edit.parts.ButtonEditPart;
import android.diagram.edit.parts.ButtonNameEditPart;
import android.diagram.edit.parts.CreateStringEditPart;
import android.diagram.edit.parts.CreateStringNameEditPart;
import android.diagram.edit.parts.DialogEditPart;
import android.diagram.edit.parts.DialogTextEditPart;
import android.diagram.edit.parts.ItemEditPart;
import android.diagram.edit.parts.ItemTittleEditPart;
import android.diagram.edit.parts.LayoutEditPart;
import android.diagram.edit.parts.LayoutNameEditPart;
import android.diagram.edit.parts.MenuEditPart;
import android.diagram.edit.parts.MenuIdEditPart;
import android.diagram.edit.parts.MetaAppEditPart;
import android.diagram.edit.parts.TextFieldEditPart;
import android.diagram.edit.parts.TextFieldNameEditPart;
import android.diagram.edit.parts.TextViewEditPart;
import android.diagram.edit.parts.TextViewNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AndroidVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "AndroidMetamodel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MetaAppEditPart.MODEL_ID.equals(view.getType())) {
				return MetaAppEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return android.diagram.part.AndroidVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				AndroidDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AndroidPackage.eINSTANCE.getMetaApp().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MetaApp) domainElement)) {
			return MetaAppEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = android.diagram.part.AndroidVisualIDRegistry
				.getModelID(containerView);
		if (!MetaAppEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MetaAppEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = android.diagram.part.AndroidVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MetaAppEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MetaAppEditPart.VISUAL_ID:
			if (AndroidPackage.eINSTANCE.getLayout().isSuperTypeOf(
					domainElement.eClass())) {
				return LayoutEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getTextField().isSuperTypeOf(
					domainElement.eClass())) {
				return TextFieldEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getCreateString().isSuperTypeOf(
					domainElement.eClass())) {
				return CreateStringEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getAplication().isSuperTypeOf(
					domainElement.eClass())) {
				return AplicationEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getDialog().isSuperTypeOf(
					domainElement.eClass())) {
				return DialogEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getItem().isSuperTypeOf(
					domainElement.eClass())) {
				return ItemEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getMenu().isSuperTypeOf(
					domainElement.eClass())) {
				return MenuEditPart.VISUAL_ID;
			}
			if (AndroidPackage.eINSTANCE.getTextView().isSuperTypeOf(
					domainElement.eClass())) {
				return TextViewEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = android.diagram.part.AndroidVisualIDRegistry
				.getModelID(containerView);
		if (!MetaAppEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MetaAppEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = android.diagram.part.AndroidVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MetaAppEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MetaAppEditPart.VISUAL_ID:
			if (LayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateStringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DialogEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ItemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayoutEditPart.VISUAL_ID:
			if (LayoutNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextFieldEditPart.VISUAL_ID:
			if (TextFieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateStringEditPart.VISUAL_ID:
			if (CreateStringNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AplicationEditPart.VISUAL_ID:
			if (AplicationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DialogEditPart.VISUAL_ID:
			if (DialogTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ItemEditPart.VISUAL_ID:
			if (ItemTittleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuEditPart.VISUAL_ID:
			if (MenuIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextViewEditPart.VISUAL_ID:
			if (TextViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MetaApp element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MetaAppEditPart.VISUAL_ID:
			return false;
		case AplicationEditPart.VISUAL_ID:
		case CreateStringEditPart.VISUAL_ID:
		case ActionEditPart.VISUAL_ID:
		case ItemEditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case DialogEditPart.VISUAL_ID:
		case LayoutEditPart.VISUAL_ID:
		case TextFieldEditPart.VISUAL_ID:
		case ActivityEditPart.VISUAL_ID:
		case MenuEditPart.VISUAL_ID:
		case TextViewEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return android.diagram.part.AndroidVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return android.diagram.part.AndroidVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return android.diagram.part.AndroidVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return android.diagram.part.AndroidVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return android.diagram.part.AndroidVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return android.diagram.part.AndroidVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
