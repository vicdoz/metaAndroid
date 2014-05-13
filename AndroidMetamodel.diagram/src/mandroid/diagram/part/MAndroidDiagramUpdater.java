package mandroid.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mandroid.Activity;
import mandroid.Aplication;
import mandroid.Button;
import mandroid.Layout;
import mandroid.MandroidPackage;
import mandroid.TextField;
import mandroid.TextView;
import mandroid.diagram.edit.parts.ActivityEditPart;
import mandroid.diagram.edit.parts.ActivityRunsInEditPart;
import mandroid.diagram.edit.parts.AplicationEditPart;
import mandroid.diagram.edit.parts.ButtonEditPart;
import mandroid.diagram.edit.parts.LayoutEditPart;
import mandroid.diagram.edit.parts.LayoutLayOnEditPart;
import mandroid.diagram.edit.parts.TextFieldEditPart;
import mandroid.diagram.edit.parts.TextViewEditPart;
import mandroid.diagram.providers.MAndroidElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MAndroidDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MAndroidNodeDescriptor> getSemanticChildren(View view) {
		switch (MAndroidVisualIDRegistry.getVisualID(view)) {
		case AplicationEditPart.VISUAL_ID:
			return getAplication_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidNodeDescriptor> getAplication_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Aplication modelElement = (Aplication) view.getElement();
		LinkedList<MAndroidNodeDescriptor> result = new LinkedList<MAndroidNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContains().iterator(); it
				.hasNext();) {
			Layout childElement = (Layout) it.next();
			int visualID = MAndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LayoutEditPart.VISUAL_ID) {
				result.add(new MAndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRun().iterator(); it.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = MAndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new MAndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getContainedLinks(View view) {
		switch (MAndroidVisualIDRegistry.getVisualID(view)) {
		case AplicationEditPart.VISUAL_ID:
			return getAplication_1000ContainedLinks(view);
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2001ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_4001ContainedLinks(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_4002ContainedLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getIncomingLinks(View view) {
		switch (MAndroidVisualIDRegistry.getVisualID(view)) {
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2001IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_4001IncomingLinks(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_4002IncomingLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getOutgoingLinks(View view) {
		switch (MAndroidVisualIDRegistry.getVisualID(view)) {
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2001OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2002OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_4001OutgoingLinks(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_4002OutgoingLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getAplication_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getLayout_2001ContainedLinks(
			View view) {
		Layout modelElement = (Layout) view.getElement();
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Button_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TextView_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TextField_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Layout_LayOn_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getActivity_2002ContainedLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Activity_RunsIn_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getButton_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getTextView_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getTextField_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getLayout_2001IncomingLinks(
			View view) {
		Layout modelElement = (Layout) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Button_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TextView_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TextField_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getActivity_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getButton_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getTextView_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getTextField_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getLayout_2001OutgoingLinks(
			View view) {
		Layout modelElement = (Layout) view.getElement();
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Button_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TextView_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TextField_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Layout_LayOn_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getActivity_2002OutgoingLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Activity_RunsIn_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getButton_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getTextView_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MAndroidLinkDescriptor> getTextField_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getContainedTypeModelFacetLinks_Button_4001(
			Layout container) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Button) {
				continue;
			}
			Button link = (Button) linkObject;
			if (ButtonEditPart.VISUAL_ID != MAndroidVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Layout dst = link.getLayoutOwner();
			result.add(new MAndroidLinkDescriptor(container, dst, link,
					MAndroidElementTypes.Button_4001, ButtonEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getContainedTypeModelFacetLinks_TextView_4002(
			Layout container) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TextView) {
				continue;
			}
			TextView link = (TextView) linkObject;
			if (TextViewEditPart.VISUAL_ID != MAndroidVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Layout dst = link.getLayoutOwner();
			result.add(new MAndroidLinkDescriptor(container, dst, link,
					MAndroidElementTypes.TextView_4002,
					TextViewEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getContainedTypeModelFacetLinks_TextField_4003(
			Layout container) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		for (Iterator<?> links = container.getContains().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TextField) {
				continue;
			}
			TextField link = (TextField) linkObject;
			if (TextFieldEditPart.VISUAL_ID != MAndroidVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Layout dst = link.getLayoutOwner();
			result.add(new MAndroidLinkDescriptor(container, dst, link,
					MAndroidElementTypes.TextField_4003,
					TextFieldEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getIncomingTypeModelFacetLinks_Button_4001(
			Layout target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MandroidPackage.eINSTANCE
					.getWidget_LayoutOwner()
					|| false == setting.getEObject() instanceof Button) {
				continue;
			}
			Button link = (Button) setting.getEObject();
			if (ButtonEditPart.VISUAL_ID != MAndroidVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Layout) {
				continue;
			}
			Layout container = (Layout) link.eContainer();
			result.add(new MAndroidLinkDescriptor(container, target, link,
					MAndroidElementTypes.Button_4001, ButtonEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getIncomingTypeModelFacetLinks_TextView_4002(
			Layout target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MandroidPackage.eINSTANCE
					.getWidget_LayoutOwner()
					|| false == setting.getEObject() instanceof TextView) {
				continue;
			}
			TextView link = (TextView) setting.getEObject();
			if (TextViewEditPart.VISUAL_ID != MAndroidVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Layout) {
				continue;
			}
			Layout container = (Layout) link.eContainer();
			result.add(new MAndroidLinkDescriptor(container, target, link,
					MAndroidElementTypes.TextView_4002,
					TextViewEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getIncomingTypeModelFacetLinks_TextField_4003(
			Layout target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MandroidPackage.eINSTANCE
					.getWidget_LayoutOwner()
					|| false == setting.getEObject() instanceof TextField) {
				continue;
			}
			TextField link = (TextField) setting.getEObject();
			if (TextFieldEditPart.VISUAL_ID != MAndroidVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Layout) {
				continue;
			}
			Layout container = (Layout) link.eContainer();
			result.add(new MAndroidLinkDescriptor(container, target, link,
					MAndroidElementTypes.TextField_4003,
					TextFieldEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Layout_LayOn_4004(
			Layout source) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		Aplication destination = source.getLayOn();
		if (destination == null) {
			return result;
		}
		result.add(new MAndroidLinkDescriptor(source, destination,
				MAndroidElementTypes.LayoutLayOn_4004,
				LayoutLayOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MAndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Activity_RunsIn_4005(
			Activity source) {
		LinkedList<MAndroidLinkDescriptor> result = new LinkedList<MAndroidLinkDescriptor>();
		Aplication destination = source.getRunsIn();
		if (destination == null) {
			return result;
		}
		result.add(new MAndroidLinkDescriptor(source, destination,
				MAndroidElementTypes.ActivityRunsIn_4005,
				ActivityRunsInEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MAndroidNodeDescriptor> getSemanticChildren(View view) {
			return MAndroidDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MAndroidLinkDescriptor> getContainedLinks(View view) {
			return MAndroidDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MAndroidLinkDescriptor> getIncomingLinks(View view) {
			return MAndroidDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MAndroidLinkDescriptor> getOutgoingLinks(View view) {
			return MAndroidDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
