package android.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import android.AndroidPackage;
import android.diagram.edit.parts.ActivityNameEditPart;
import android.diagram.edit.parts.AplicationNameEditPart;
import android.diagram.edit.parts.ButtonNameEditPart;
import android.diagram.edit.parts.CreateStringNameEditPart;
import android.diagram.edit.parts.DialogTextEditPart;
import android.diagram.edit.parts.ItemTittleEditPart;
import android.diagram.edit.parts.LayoutNameEditPart;
import android.diagram.edit.parts.MenuIdEditPart;
import android.diagram.edit.parts.TextFieldNameEditPart;
import android.diagram.edit.parts.TextViewNameEditPart;
import android.diagram.parsers.MessageFormatParser;
import android.diagram.part.AndroidVisualIDRegistry;

/**
 * @generated
 */
public class AndroidParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser layoutName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getLayoutName_5007Parser() {
		if (layoutName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getLayout_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			layoutName_5007Parser = parser;
		}
		return layoutName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser textFieldName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getTextFieldName_5008Parser() {
		if (textFieldName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textFieldName_5008Parser = parser;
		}
		return textFieldName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser buttonName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getButtonName_5005Parser() {
		if (buttonName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5005Parser = parser;
		}
		return buttonName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser createStringName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCreateStringName_5002Parser() {
		if (createStringName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getCreateString_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createStringName_5002Parser = parser;
		}
		return createStringName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5009Parser() {
		if (activityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5009Parser = parser;
		}
		return activityName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser aplicationName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAplicationName_5001Parser() {
		if (aplicationName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getAplication_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aplicationName_5001Parser = parser;
		}
		return aplicationName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser dialogText_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDialogText_5006Parser() {
		if (dialogText_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getDialog_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dialogText_5006Parser = parser;
		}
		return dialogText_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser itemTittle_5004Parser;

	/**
	 * @generated
	 */
	private IParser getItemTittle_5004Parser() {
		if (itemTittle_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getItem_Tittle() };
			MessageFormatParser parser = new MessageFormatParser(features);
			itemTittle_5004Parser = parser;
		}
		return itemTittle_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser menuId_5010Parser;

	/**
	 * @generated
	 */
	private IParser getMenuId_5010Parser() {
		if (menuId_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getMenu_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuId_5010Parser = parser;
		}
		return menuId_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser textViewName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getTextViewName_5011Parser() {
		if (textViewName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { AndroidPackage.eINSTANCE
					.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textViewName_5011Parser = parser;
		}
		return textViewName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LayoutNameEditPart.VISUAL_ID:
			return getLayoutName_5007Parser();
		case TextFieldNameEditPart.VISUAL_ID:
			return getTextFieldName_5008Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5005Parser();
		case CreateStringNameEditPart.VISUAL_ID:
			return getCreateStringName_5002Parser();
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5009Parser();
		case AplicationNameEditPart.VISUAL_ID:
			return getAplicationName_5001Parser();
		case DialogTextEditPart.VISUAL_ID:
			return getDialogText_5006Parser();
		case ItemTittleEditPart.VISUAL_ID:
			return getItemTittle_5004Parser();
		case MenuIdEditPart.VISUAL_ID:
			return getMenuId_5010Parser();
		case TextViewNameEditPart.VISUAL_ID:
			return getTextViewName_5011Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(AndroidVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(AndroidVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (AndroidElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
