package mandroid.diagram.part;

import java.util.Collections;
import java.util.List;

import mandroid.diagram.providers.MAndroidElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MAndroidPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMandroid1Group());
	}

	/**
	 * Creates "mandroid" palette tool group
	 * @generated
	 */
	private PaletteContainer createMandroid1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Mandroid1Group_title);
		paletteContainer.setId("createMandroid1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createWidget2CreationTool());
		paletteContainer.add(createLayout3CreationTool());
		paletteContainer.add(createLayoutContains4CreationTool());
		paletteContainer.add(createButton5CreationTool());
		paletteContainer.add(createTextView6CreationTool());
		paletteContainer.add(createAplication7CreationTool());
		paletteContainer.add(createAplicationRun8CreationTool());
		paletteContainer.add(createTextField9CreationTool());
		paletteContainer.add(createAction10CreationTool());
		paletteContainer.add(createActionShows11CreationTool());
		paletteContainer.add(createDialog12CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Activity1CreationTool_title,
				Messages.Activity1CreationTool_desc,
				Collections.singletonList(MAndroidElementTypes.Layout_2001));
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.Layout_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWidget2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Widget2CreationTool_title,
				Messages.Widget2CreationTool_desc,
				Collections.singletonList(MAndroidElementTypes.Activity_2002));
		entry.setId("createWidget2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.Activity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayout3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Layout3CreationTool_title,
				Messages.Layout3CreationTool_desc,
				Collections.singletonList(MAndroidElementTypes.Button_4001));
		entry.setId("createLayout3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.Button_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayoutContains4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LayoutContains4CreationTool_title,
				Messages.LayoutContains4CreationTool_desc,
				Collections.singletonList(MAndroidElementTypes.TextView_4002));
		entry.setId("createLayoutContains4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.TextView_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createButton5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Button5CreationTool_title,
				Messages.Button5CreationTool_desc,
				Collections.singletonList(MAndroidElementTypes.TextField_4003));
		entry.setId("createButton5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.TextField_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTextView6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TextView6CreationTool_title,
				Messages.TextView6CreationTool_desc,
				Collections
						.singletonList(MAndroidElementTypes.LayoutLayOn_4004));
		entry.setId("createTextView6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.LayoutLayOn_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAplication7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Aplication7CreationTool_title,
				Messages.Aplication7CreationTool_desc,
				Collections
						.singletonList(MAndroidElementTypes.ActivityRunsIn_4005));
		entry.setId("createAplication7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MAndroidElementTypes
				.getImageDescriptor(MAndroidElementTypes.ActivityRunsIn_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAplicationRun8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AplicationRun8CreationTool_title,
				Messages.AplicationRun8CreationTool_desc, null, null) {
		};
		entry.setId("createAplicationRun8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTextField9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.TextField9CreationTool_title,
				Messages.TextField9CreationTool_desc, null, null) {
		};
		entry.setId("createTextField9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction10CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Action10CreationTool_title,
				Messages.Action10CreationTool_desc, null, null) {
		};
		entry.setId("createAction10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionShows11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ActionShows11CreationTool_title,
				Messages.ActionShows11CreationTool_desc, null, null) {
		};
		entry.setId("createActionShows11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDialog12CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Dialog12CreationTool_title,
				Messages.Dialog12CreationTool_desc, null, null) {
		};
		entry.setId("createDialog12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
