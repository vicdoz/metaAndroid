package mandroid.diagram.part;

import mandroid.Aplication;
import mandroid.MandroidPackage;
import mandroid.diagram.edit.parts.ActivityEditPart;
import mandroid.diagram.edit.parts.ActivityNameEditPart;
import mandroid.diagram.edit.parts.AplicationEditPart;
import mandroid.diagram.edit.parts.ButtonEditPart;
import mandroid.diagram.edit.parts.ButtonNameEditPart;
import mandroid.diagram.edit.parts.LayoutEditPart;
import mandroid.diagram.edit.parts.TextFieldEditPart;
import mandroid.diagram.edit.parts.TextFieldNameEditPart;
import mandroid.diagram.edit.parts.TextViewEditPart;
import mandroid.diagram.edit.parts.TextViewNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MAndroidVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "AndroidMetamodel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (AplicationEditPart.MODEL_ID.equals(view.getType())) {
				return AplicationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mandroid.diagram.part.MAndroidVisualIDRegistry.getVisualID(view
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
				MAndroidDiagramEditorPlugin.getInstance().logError(
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
		if (MandroidPackage.eINSTANCE.getAplication().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Aplication) domainElement)) {
			return AplicationEditPart.VISUAL_ID;
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
		String containerModelID = mandroid.diagram.part.MAndroidVisualIDRegistry
				.getModelID(containerView);
		if (!AplicationEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (AplicationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mandroid.diagram.part.MAndroidVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AplicationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case AplicationEditPart.VISUAL_ID:
			if (MandroidPackage.eINSTANCE.getLayout().isSuperTypeOf(
					domainElement.eClass())) {
				return LayoutEditPart.VISUAL_ID;
			}
			if (MandroidPackage.eINSTANCE.getActivity().isSuperTypeOf(
					domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mandroid.diagram.part.MAndroidVisualIDRegistry
				.getModelID(containerView);
		if (!AplicationEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (AplicationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mandroid.diagram.part.MAndroidVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AplicationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case AplicationEditPart.VISUAL_ID:
			if (LayoutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextViewEditPart.VISUAL_ID:
			if (TextViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextFieldEditPart.VISUAL_ID:
			if (TextFieldNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (MandroidPackage.eINSTANCE.getButton().isSuperTypeOf(
				domainElement.eClass())) {
			return ButtonEditPart.VISUAL_ID;
		}
		if (MandroidPackage.eINSTANCE.getTextView().isSuperTypeOf(
				domainElement.eClass())) {
			return TextViewEditPart.VISUAL_ID;
		}
		if (MandroidPackage.eINSTANCE.getTextField().isSuperTypeOf(
				domainElement.eClass())) {
			return TextFieldEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Aplication element) {
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
		case AplicationEditPart.VISUAL_ID:
			return false;
		case LayoutEditPart.VISUAL_ID:
		case ActivityEditPart.VISUAL_ID:
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
			return mandroid.diagram.part.MAndroidVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return mandroid.diagram.part.MAndroidVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mandroid.diagram.part.MAndroidVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return mandroid.diagram.part.MAndroidVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return mandroid.diagram.part.MAndroidVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return mandroid.diagram.part.MAndroidVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
