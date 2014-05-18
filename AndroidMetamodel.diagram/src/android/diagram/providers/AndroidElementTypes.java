package android.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import android.AndroidPackage;
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
import android.diagram.part.AndroidDiagramEditorPlugin;

/**
 * @generated
 */
public class AndroidElementTypes {

	/**
	 * @generated
	 */
	private AndroidElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			AndroidDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType MetaApp_1000 = getElementType("AndroidMetamodel.diagram.MetaApp_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Layout_2008 = getElementType("AndroidMetamodel.diagram.Layout_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TextField_2009 = getElementType("AndroidMetamodel.diagram.TextField_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Button_2006 = getElementType("AndroidMetamodel.diagram.Button_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CreateString_2002 = getElementType("AndroidMetamodel.diagram.CreateString_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2010 = getElementType("AndroidMetamodel.diagram.Activity_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aplication_2001 = getElementType("AndroidMetamodel.diagram.Aplication_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_2003 = getElementType("AndroidMetamodel.diagram.Action_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dialog_2007 = getElementType("AndroidMetamodel.diagram.Dialog_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Item_2005 = getElementType("AndroidMetamodel.diagram.Item_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Menu_2011 = getElementType("AndroidMetamodel.diagram.Menu_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TextView_2012 = getElementType("AndroidMetamodel.diagram.TextView_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AplicationRun_4001 = getElementType("AndroidMetamodel.diagram.AplicationRun_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LayoutContains_4002 = getElementType("AndroidMetamodel.diagram.LayoutContains_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityShow_4003 = getElementType("AndroidMetamodel.diagram.ActivityShow_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MenuHasItem_4004 = getElementType("AndroidMetamodel.diagram.MenuHasItem_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AplicationCreates_4005 = getElementType("AndroidMetamodel.diagram.AplicationCreates_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionShows_4006 = getElementType("AndroidMetamodel.diagram.ActionShows_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AplicationContains_4007 = getElementType("AndroidMetamodel.diagram.AplicationContains_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ButtonTriggers_4008 = getElementType("AndroidMetamodel.diagram.ButtonTriggers_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityMuestra_4009 = getElementType("AndroidMetamodel.diagram.ActivityMuestra_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MetaApp_1000, AndroidPackage.eINSTANCE.getMetaApp());

			elements.put(Layout_2008, AndroidPackage.eINSTANCE.getLayout());

			elements.put(TextField_2009,
					AndroidPackage.eINSTANCE.getTextField());

			elements.put(Button_2006, AndroidPackage.eINSTANCE.getButton());

			elements.put(CreateString_2002,
					AndroidPackage.eINSTANCE.getCreateString());

			elements.put(Activity_2010, AndroidPackage.eINSTANCE.getActivity());

			elements.put(Aplication_2001,
					AndroidPackage.eINSTANCE.getAplication());

			elements.put(Action_2003, AndroidPackage.eINSTANCE.getAction());

			elements.put(Dialog_2007, AndroidPackage.eINSTANCE.getDialog());

			elements.put(Item_2005, AndroidPackage.eINSTANCE.getItem());

			elements.put(Menu_2011, AndroidPackage.eINSTANCE.getMenu());

			elements.put(TextView_2012, AndroidPackage.eINSTANCE.getTextView());

			elements.put(AplicationRun_4001,
					AndroidPackage.eINSTANCE.getAplication_Run());

			elements.put(LayoutContains_4002,
					AndroidPackage.eINSTANCE.getLayout_Contains());

			elements.put(ActivityShow_4003,
					AndroidPackage.eINSTANCE.getActivity_Show());

			elements.put(MenuHasItem_4004,
					AndroidPackage.eINSTANCE.getMenu_HasItem());

			elements.put(AplicationCreates_4005,
					AndroidPackage.eINSTANCE.getAplication_Creates());

			elements.put(ActionShows_4006,
					AndroidPackage.eINSTANCE.getAction_Shows());

			elements.put(AplicationContains_4007,
					AndroidPackage.eINSTANCE.getAplication_Contains());

			elements.put(ButtonTriggers_4008,
					AndroidPackage.eINSTANCE.getButton_Triggers());

			elements.put(ActivityMuestra_4009,
					AndroidPackage.eINSTANCE.getActivity_Muestra());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MetaApp_1000);
			KNOWN_ELEMENT_TYPES.add(Layout_2008);
			KNOWN_ELEMENT_TYPES.add(TextField_2009);
			KNOWN_ELEMENT_TYPES.add(Button_2006);
			KNOWN_ELEMENT_TYPES.add(CreateString_2002);
			KNOWN_ELEMENT_TYPES.add(Activity_2010);
			KNOWN_ELEMENT_TYPES.add(Aplication_2001);
			KNOWN_ELEMENT_TYPES.add(Action_2003);
			KNOWN_ELEMENT_TYPES.add(Dialog_2007);
			KNOWN_ELEMENT_TYPES.add(Item_2005);
			KNOWN_ELEMENT_TYPES.add(Menu_2011);
			KNOWN_ELEMENT_TYPES.add(TextView_2012);
			KNOWN_ELEMENT_TYPES.add(AplicationRun_4001);
			KNOWN_ELEMENT_TYPES.add(LayoutContains_4002);
			KNOWN_ELEMENT_TYPES.add(ActivityShow_4003);
			KNOWN_ELEMENT_TYPES.add(MenuHasItem_4004);
			KNOWN_ELEMENT_TYPES.add(AplicationCreates_4005);
			KNOWN_ELEMENT_TYPES.add(ActionShows_4006);
			KNOWN_ELEMENT_TYPES.add(AplicationContains_4007);
			KNOWN_ELEMENT_TYPES.add(ButtonTriggers_4008);
			KNOWN_ELEMENT_TYPES.add(ActivityMuestra_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MetaAppEditPart.VISUAL_ID:
			return MetaApp_1000;
		case LayoutEditPart.VISUAL_ID:
			return Layout_2008;
		case TextFieldEditPart.VISUAL_ID:
			return TextField_2009;
		case ButtonEditPart.VISUAL_ID:
			return Button_2006;
		case CreateStringEditPart.VISUAL_ID:
			return CreateString_2002;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2010;
		case AplicationEditPart.VISUAL_ID:
			return Aplication_2001;
		case ActionEditPart.VISUAL_ID:
			return Action_2003;
		case DialogEditPart.VISUAL_ID:
			return Dialog_2007;
		case ItemEditPart.VISUAL_ID:
			return Item_2005;
		case MenuEditPart.VISUAL_ID:
			return Menu_2011;
		case TextViewEditPart.VISUAL_ID:
			return TextView_2012;
		case AplicationRunEditPart.VISUAL_ID:
			return AplicationRun_4001;
		case LayoutContainsEditPart.VISUAL_ID:
			return LayoutContains_4002;
		case ActivityShowEditPart.VISUAL_ID:
			return ActivityShow_4003;
		case MenuHasItemEditPart.VISUAL_ID:
			return MenuHasItem_4004;
		case AplicationCreatesEditPart.VISUAL_ID:
			return AplicationCreates_4005;
		case ActionShowsEditPart.VISUAL_ID:
			return ActionShows_4006;
		case AplicationContainsEditPart.VISUAL_ID:
			return AplicationContains_4007;
		case ButtonTriggersEditPart.VISUAL_ID:
			return ButtonTriggers_4008;
		case ActivityMuestraEditPart.VISUAL_ID:
			return ActivityMuestra_4009;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return android.diagram.providers.AndroidElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return android.diagram.providers.AndroidElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return android.diagram.providers.AndroidElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
