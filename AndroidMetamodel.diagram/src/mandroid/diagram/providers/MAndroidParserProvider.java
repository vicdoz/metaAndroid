package mandroid.diagram.providers;

import mandroid.MandroidPackage;
import mandroid.diagram.edit.parts.ActivityNameEditPart;
import mandroid.diagram.edit.parts.ButtonNameEditPart;
import mandroid.diagram.edit.parts.TextFieldNameEditPart;
import mandroid.diagram.edit.parts.TextViewNameEditPart;
import mandroid.diagram.parsers.MessageFormatParser;
import mandroid.diagram.part.MAndroidVisualIDRegistry;

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

/**
 * @generated
 */
public class MAndroidParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser activityName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5001Parser() {
		if (activityName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MandroidPackage.eINSTANCE
					.getActivity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5001Parser = parser;
		}
		return activityName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser buttonName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getButtonName_6001Parser() {
		if (buttonName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MandroidPackage.eINSTANCE
					.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_6001Parser = parser;
		}
		return buttonName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser textViewName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getTextViewName_6002Parser() {
		if (textViewName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { MandroidPackage.eINSTANCE
					.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textViewName_6002Parser = parser;
		}
		return textViewName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser textFieldName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getTextFieldName_6003Parser() {
		if (textFieldName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { MandroidPackage.eINSTANCE
					.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textFieldName_6003Parser = parser;
		}
		return textFieldName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5001Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_6001Parser();
		case TextViewNameEditPart.VISUAL_ID:
			return getTextViewName_6002Parser();
		case TextFieldNameEditPart.VISUAL_ID:
			return getTextFieldName_6003Parser();
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
			return getParser(MAndroidVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MAndroidVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MAndroidElementTypes.getElement(hint) == null) {
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
