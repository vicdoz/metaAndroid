package android.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import android.diagram.providers.AndroidElementTypes;

/**
 * @generated
 */
public class AndroidPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAndroid1Group());
	}

	/**
	 * Creates "android" palette tool group
	 * @generated
	 */
	private PaletteContainer createAndroid1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Android1Group_title);
		paletteContainer.setId("createAndroid1Group"); //$NON-NLS-1$
		paletteContainer.add(createLayout1CreationTool());
		paletteContainer.add(createButton2CreationTool());
		paletteContainer.add(createTextField3CreationTool());
		paletteContainer.add(createTextView4CreationTool());
		paletteContainer.add(createAplication5CreationTool());
		paletteContainer.add(createCreateString6CreationTool());
		paletteContainer.add(createActivity7CreationTool());
		paletteContainer.add(createMenu8CreationTool());
		paletteContainer.add(createItem9CreationTool());
		paletteContainer.add(createAction10CreationTool());
		paletteContainer.add(createDialog11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayout1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Layout1CreationTool_title,
				Messages.Layout1CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Layout_2008));
		entry.setId("createLayout1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Layout_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createButton2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Button2CreationTool_title,
				Messages.Button2CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Button_2006));
		entry.setId("createButton2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Button_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTextField3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TextField3CreationTool_title,
				Messages.TextField3CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.TextField_2009));
		entry.setId("createTextField3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.TextField_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTextView4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TextView4CreationTool_title,
				Messages.TextView4CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.TextView_2012));
		entry.setId("createTextView4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.TextView_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAplication5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Aplication5CreationTool_title,
				Messages.Aplication5CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Aplication_2001));
		entry.setId("createAplication5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Aplication_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateString6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateString6CreationTool_title,
				Messages.CreateString6CreationTool_desc,
				Collections
						.singletonList(AndroidElementTypes.CreateString_2002));
		entry.setId("createCreateString6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.CreateString_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Activity7CreationTool_title,
				Messages.Activity7CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Activity_2010));
		entry.setId("createActivity7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Activity_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenu8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Menu8CreationTool_title,
				Messages.Menu8CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Menu_2011));
		entry.setId("createMenu8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Menu_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createItem9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Item9CreationTool_title,
				Messages.Item9CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Item_2005));
		entry.setId("createItem9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Item_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Action10CreationTool_title,
				Messages.Action10CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Action_2003));
		entry.setId("createAction10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Action_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDialog11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Dialog11CreationTool_title,
				Messages.Dialog11CreationTool_desc,
				Collections.singletonList(AndroidElementTypes.Dialog_2007));
		entry.setId("createDialog11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AndroidElementTypes
				.getImageDescriptor(AndroidElementTypes.Dialog_2007));
		entry.setLargeIcon(entry.getSmallIcon());
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
