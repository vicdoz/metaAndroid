package mandroid.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mandroid.MandroidPackage;
import mandroid.diagram.edit.parts.ActivityEditPart;
import mandroid.diagram.edit.parts.ActivityRunsInEditPart;
import mandroid.diagram.edit.parts.AplicationEditPart;
import mandroid.diagram.edit.parts.ButtonEditPart;
import mandroid.diagram.edit.parts.LayoutEditPart;
import mandroid.diagram.edit.parts.LayoutLayOnEditPart;
import mandroid.diagram.edit.parts.TextFieldEditPart;
import mandroid.diagram.edit.parts.TextViewEditPart;
import mandroid.diagram.part.MAndroidDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MAndroidElementTypes {

	/**
	 * @generated
	 */
	private MAndroidElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MAndroidDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Aplication_1000 = getElementType("AndroidMetamodel.diagram.Aplication_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Layout_2001 = getElementType("AndroidMetamodel.diagram.Layout_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Activity_2002 = getElementType("AndroidMetamodel.diagram.Activity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Button_4001 = getElementType("AndroidMetamodel.diagram.Button_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TextView_4002 = getElementType("AndroidMetamodel.diagram.TextView_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TextField_4003 = getElementType("AndroidMetamodel.diagram.TextField_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LayoutLayOn_4004 = getElementType("AndroidMetamodel.diagram.LayoutLayOn_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActivityRunsIn_4005 = getElementType("AndroidMetamodel.diagram.ActivityRunsIn_4005"); //$NON-NLS-1$

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

			elements.put(Aplication_1000,
					MandroidPackage.eINSTANCE.getAplication());

			elements.put(Layout_2001, MandroidPackage.eINSTANCE.getLayout());

			elements.put(Activity_2002, MandroidPackage.eINSTANCE.getActivity());

			elements.put(Button_4001, MandroidPackage.eINSTANCE.getButton());

			elements.put(TextView_4002, MandroidPackage.eINSTANCE.getTextView());

			elements.put(TextField_4003,
					MandroidPackage.eINSTANCE.getTextField());

			elements.put(LayoutLayOn_4004,
					MandroidPackage.eINSTANCE.getLayout_LayOn());

			elements.put(ActivityRunsIn_4005,
					MandroidPackage.eINSTANCE.getActivity_RunsIn());
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
			KNOWN_ELEMENT_TYPES.add(Aplication_1000);
			KNOWN_ELEMENT_TYPES.add(Layout_2001);
			KNOWN_ELEMENT_TYPES.add(Activity_2002);
			KNOWN_ELEMENT_TYPES.add(Button_4001);
			KNOWN_ELEMENT_TYPES.add(TextView_4002);
			KNOWN_ELEMENT_TYPES.add(TextField_4003);
			KNOWN_ELEMENT_TYPES.add(LayoutLayOn_4004);
			KNOWN_ELEMENT_TYPES.add(ActivityRunsIn_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case AplicationEditPart.VISUAL_ID:
			return Aplication_1000;
		case LayoutEditPart.VISUAL_ID:
			return Layout_2001;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2002;
		case ButtonEditPart.VISUAL_ID:
			return Button_4001;
		case TextViewEditPart.VISUAL_ID:
			return TextView_4002;
		case TextFieldEditPart.VISUAL_ID:
			return TextField_4003;
		case LayoutLayOnEditPart.VISUAL_ID:
			return LayoutLayOn_4004;
		case ActivityRunsInEditPart.VISUAL_ID:
			return ActivityRunsIn_4005;
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
			return mandroid.diagram.providers.MAndroidElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return mandroid.diagram.providers.MAndroidElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return mandroid.diagram.providers.MAndroidElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
