package android.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import android.Action;
import android.Activity;
import android.AndroidPackage;
import android.Aplication;
import android.Button;
import android.CreateString;
import android.Dialog;
import android.Item;
import android.Layout;
import android.Menu;
import android.MetaApp;
import android.TextField;
import android.TextView;
import android.Widget;
import android.diagram.edit.parts.ActionEditPart;
import android.diagram.edit.parts.ActionShowsEditPart;
import android.diagram.edit.parts.ActivityEditPart;
import android.diagram.edit.parts.ActivityMuestraEditPart;
import android.diagram.edit.parts.ActivityShowEditPart;
import android.diagram.edit.parts.AplicationContainsEditPart;
import android.diagram.edit.parts.AplicationCreatesEditPart;
import android.diagram.edit.parts.AplicationEditPart;
import android.diagram.edit.parts.AplicationRunEditPart;
import android.diagram.edit.parts.ButtonEditPart;
import android.diagram.edit.parts.ButtonTriggersEditPart;
import android.diagram.edit.parts.CreateStringEditPart;
import android.diagram.edit.parts.DialogEditPart;
import android.diagram.edit.parts.ItemEditPart;
import android.diagram.edit.parts.LayoutContainsEditPart;
import android.diagram.edit.parts.LayoutEditPart;
import android.diagram.edit.parts.MenuEditPart;
import android.diagram.edit.parts.MenuHasItemEditPart;
import android.diagram.edit.parts.MetaAppEditPart;
import android.diagram.edit.parts.TextFieldEditPart;
import android.diagram.edit.parts.TextViewEditPart;
import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class AndroidDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<AndroidNodeDescriptor> getSemanticChildren(View view) {
		switch (AndroidVisualIDRegistry.getVisualID(view)) {
		case MetaAppEditPart.VISUAL_ID:
			return getMetaApp_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidNodeDescriptor> getMetaApp_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MetaApp modelElement = (MetaApp) view.getElement();
		LinkedList<AndroidNodeDescriptor> result = new LinkedList<AndroidNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCreateLayout().iterator(); it
				.hasNext();) {
			Layout childElement = (Layout) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LayoutEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCreateWidget().iterator(); it
				.hasNext();) {
			Widget childElement = (Widget) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextFieldEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextViewEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCreate_String().iterator(); it
				.hasNext();) {
			CreateString childElement = (CreateString) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CreateStringEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCreateActivity().iterator(); it
				.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Aplication childElement = modelElement.getCreateApp();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AplicationEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getCreateAction().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActionEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCreateDialog().iterator(); it
				.hasNext();) {
			Dialog childElement = (Dialog) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DialogEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCreateItem().iterator(); it
				.hasNext();) {
			Item childElement = (Item) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ItemEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCreateMenu().iterator(); it
				.hasNext();) {
			Menu childElement = (Menu) it.next();
			int visualID = AndroidVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MenuEditPart.VISUAL_ID) {
				result.add(new AndroidNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getContainedLinks(View view) {
		switch (AndroidVisualIDRegistry.getVisualID(view)) {
		case MetaAppEditPart.VISUAL_ID:
			return getMetaApp_1000ContainedLinks(view);
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2008ContainedLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_2009ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_2006ContainedLinks(view);
		case CreateStringEditPart.VISUAL_ID:
			return getCreateString_2002ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2010ContainedLinks(view);
		case AplicationEditPart.VISUAL_ID:
			return getAplication_2001ContainedLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2003ContainedLinks(view);
		case DialogEditPart.VISUAL_ID:
			return getDialog_2007ContainedLinks(view);
		case ItemEditPart.VISUAL_ID:
			return getItem_2005ContainedLinks(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_2011ContainedLinks(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_2012ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getIncomingLinks(View view) {
		switch (AndroidVisualIDRegistry.getVisualID(view)) {
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2008IncomingLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_2009IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_2006IncomingLinks(view);
		case CreateStringEditPart.VISUAL_ID:
			return getCreateString_2002IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2010IncomingLinks(view);
		case AplicationEditPart.VISUAL_ID:
			return getAplication_2001IncomingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2003IncomingLinks(view);
		case DialogEditPart.VISUAL_ID:
			return getDialog_2007IncomingLinks(view);
		case ItemEditPart.VISUAL_ID:
			return getItem_2005IncomingLinks(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_2011IncomingLinks(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_2012IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getOutgoingLinks(View view) {
		switch (AndroidVisualIDRegistry.getVisualID(view)) {
		case LayoutEditPart.VISUAL_ID:
			return getLayout_2008OutgoingLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_2009OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_2006OutgoingLinks(view);
		case CreateStringEditPart.VISUAL_ID:
			return getCreateString_2002OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2010OutgoingLinks(view);
		case AplicationEditPart.VISUAL_ID:
			return getAplication_2001OutgoingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_2003OutgoingLinks(view);
		case DialogEditPart.VISUAL_ID:
			return getDialog_2007OutgoingLinks(view);
		case ItemEditPart.VISUAL_ID:
			return getItem_2005OutgoingLinks(view);
		case MenuEditPart.VISUAL_ID:
			return getMenu_2011OutgoingLinks(view);
		case TextViewEditPart.VISUAL_ID:
			return getTextView_2012OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getMetaApp_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getLayout_2008ContainedLinks(
			View view) {
		Layout modelElement = (Layout) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Layout_Contains_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getTextField_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getButton_2006ContainedLinks(
			View view) {
		Button modelElement = (Button) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Button_Triggers_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getCreateString_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getActivity_2010ContainedLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Activity_Show_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Activity_Muestra_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getAplication_2001ContainedLinks(
			View view) {
		Aplication modelElement = (Aplication) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Aplication_Run_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Aplication_Creates_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Aplication_Contains_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getAction_2003ContainedLinks(
			View view) {
		Action modelElement = (Action) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Shows_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getDialog_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getItem_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getMenu_2011ContainedLinks(
			View view) {
		Menu modelElement = (Menu) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Menu_HasItem_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getTextView_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getLayout_2008IncomingLinks(
			View view) {
		Layout modelElement = (Layout) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aplication_Contains_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Activity_Muestra_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getTextField_2009IncomingLinks(
			View view) {
		TextField modelElement = (TextField) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Layout_Contains_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getButton_2006IncomingLinks(
			View view) {
		Button modelElement = (Button) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Layout_Contains_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getCreateString_2002IncomingLinks(
			View view) {
		CreateString modelElement = (CreateString) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aplication_Creates_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getActivity_2010IncomingLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aplication_Run_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getAplication_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getAction_2003IncomingLinks(
			View view) {
		Action modelElement = (Action) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Button_Triggers_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getDialog_2007IncomingLinks(
			View view) {
		Dialog modelElement = (Dialog) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Shows_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getItem_2005IncomingLinks(
			View view) {
		Item modelElement = (Item) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Menu_HasItem_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getMenu_2011IncomingLinks(
			View view) {
		Menu modelElement = (Menu) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Activity_Show_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getTextView_2012IncomingLinks(
			View view) {
		TextView modelElement = (TextView) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Layout_Contains_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getLayout_2008OutgoingLinks(
			View view) {
		Layout modelElement = (Layout) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Layout_Contains_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getTextField_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getButton_2006OutgoingLinks(
			View view) {
		Button modelElement = (Button) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Button_Triggers_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getCreateString_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getActivity_2010OutgoingLinks(
			View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Activity_Show_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Activity_Muestra_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getAplication_2001OutgoingLinks(
			View view) {
		Aplication modelElement = (Aplication) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Aplication_Run_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Aplication_Creates_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Aplication_Contains_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getAction_2003OutgoingLinks(
			View view) {
		Action modelElement = (Action) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Shows_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getDialog_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getItem_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getMenu_2011OutgoingLinks(
			View view) {
		Menu modelElement = (Menu) view.getElement();
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Menu_HasItem_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AndroidLinkDescriptor> getTextView_2012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Aplication_Run_4001(
			Activity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getAplication_Run()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.AplicationRun_4001,
						AplicationRunEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Layout_Contains_4002(
			Widget target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getLayout_Contains()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.LayoutContains_4002,
						LayoutContainsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Activity_Show_4003(
			Menu target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getActivity_Show()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.ActivityShow_4003,
						ActivityShowEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Menu_HasItem_4004(
			Item target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getMenu_HasItem()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.MenuHasItem_4004,
						MenuHasItemEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Aplication_Creates_4005(
			CreateString target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getAplication_Creates()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.AplicationCreates_4005,
						AplicationCreatesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Action_Shows_4006(
			Dialog target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getAction_Shows()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.ActionShows_4006,
						ActionShowsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Aplication_Contains_4007(
			Layout target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getAplication_Contains()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.AplicationContains_4007,
						AplicationContainsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Button_Triggers_4008(
			Action target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getButton_Triggers()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.ButtonTriggers_4008,
						ButtonTriggersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getIncomingFeatureModelFacetLinks_Activity_Muestra_4009(
			Layout target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AndroidPackage.eINSTANCE
					.getActivity_Muestra()) {
				result.add(new AndroidLinkDescriptor(setting.getEObject(),
						target, AndroidElementTypes.ActivityMuestra_4009,
						ActivityMuestraEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Aplication_Run_4001(
			Aplication source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		for (Iterator<?> destinations = source.getRun().iterator(); destinations
				.hasNext();) {
			Activity destination = (Activity) destinations.next();
			result.add(new AndroidLinkDescriptor(source, destination,
					AndroidElementTypes.AplicationRun_4001,
					AplicationRunEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Layout_Contains_4002(
			Layout source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		for (Iterator<?> destinations = source.getContains().iterator(); destinations
				.hasNext();) {
			Widget destination = (Widget) destinations.next();
			result.add(new AndroidLinkDescriptor(source, destination,
					AndroidElementTypes.LayoutContains_4002,
					LayoutContainsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Activity_Show_4003(
			Activity source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Menu destination = source.getShow();
		if (destination == null) {
			return result;
		}
		result.add(new AndroidLinkDescriptor(source, destination,
				AndroidElementTypes.ActivityShow_4003,
				ActivityShowEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Menu_HasItem_4004(
			Menu source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasItem().iterator(); destinations
				.hasNext();) {
			Item destination = (Item) destinations.next();
			result.add(new AndroidLinkDescriptor(source, destination,
					AndroidElementTypes.MenuHasItem_4004,
					MenuHasItemEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Aplication_Creates_4005(
			Aplication source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		for (Iterator<?> destinations = source.getCreates().iterator(); destinations
				.hasNext();) {
			CreateString destination = (CreateString) destinations.next();
			result.add(new AndroidLinkDescriptor(source, destination,
					AndroidElementTypes.AplicationCreates_4005,
					AplicationCreatesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Action_Shows_4006(
			Action source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Dialog destination = source.getShows();
		if (destination == null) {
			return result;
		}
		result.add(new AndroidLinkDescriptor(source, destination,
				AndroidElementTypes.ActionShows_4006,
				ActionShowsEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Aplication_Contains_4007(
			Aplication source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		for (Iterator<?> destinations = source.getContains().iterator(); destinations
				.hasNext();) {
			Layout destination = (Layout) destinations.next();
			result.add(new AndroidLinkDescriptor(source, destination,
					AndroidElementTypes.AplicationContains_4007,
					AplicationContainsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Button_Triggers_4008(
			Button source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriggers().iterator(); destinations
				.hasNext();) {
			Action destination = (Action) destinations.next();
			result.add(new AndroidLinkDescriptor(source, destination,
					AndroidElementTypes.ButtonTriggers_4008,
					ButtonTriggersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AndroidLinkDescriptor> getOutgoingFeatureModelFacetLinks_Activity_Muestra_4009(
			Activity source) {
		LinkedList<AndroidLinkDescriptor> result = new LinkedList<AndroidLinkDescriptor>();
		Layout destination = source.getMuestra();
		if (destination == null) {
			return result;
		}
		result.add(new AndroidLinkDescriptor(source, destination,
				AndroidElementTypes.ActivityMuestra_4009,
				ActivityMuestraEditPart.VISUAL_ID));
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
		public List<AndroidNodeDescriptor> getSemanticChildren(View view) {
			return AndroidDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AndroidLinkDescriptor> getContainedLinks(View view) {
			return AndroidDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AndroidLinkDescriptor> getIncomingLinks(View view) {
			return AndroidDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AndroidLinkDescriptor> getOutgoingLinks(View view) {
			return AndroidDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
