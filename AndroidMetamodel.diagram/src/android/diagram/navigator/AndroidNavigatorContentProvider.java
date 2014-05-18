package android.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import android.diagram.part.AndroidVisualIDRegistry;
import android.diagram.part.Messages;

/**
 * @generated
 */
public class AndroidNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public AndroidNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<AndroidNavigatorItem> result = new ArrayList<AndroidNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, MetaAppEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof AndroidNavigatorGroup) {
			AndroidNavigatorGroup group = (AndroidNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof AndroidNavigatorItem) {
			AndroidNavigatorItem navigatorItem = (AndroidNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (AndroidVisualIDRegistry.getVisualID(view)) {

		case MetaAppEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			AndroidNavigatorGroup links = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_MetaApp_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(LayoutEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(TextFieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(CreateStringEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(DialogEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ItemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(MenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(TextViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationRunEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(LayoutContainsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActivityShowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(MenuHasItemEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationCreatesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActionShowsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationContainsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ButtonTriggersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActivityMuestraEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case AplicationEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup outgoinglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Aplication_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationRunEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationCreatesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationContainsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CreateStringEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_CreateString_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationCreatesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ActionEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup outgoinglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Action_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Action_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActionShowsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ButtonTriggersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ItemEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Item_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(MenuHasItemEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ButtonEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Button_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup outgoinglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Button_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(LayoutContainsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ButtonTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DialogEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Dialog_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActionShowsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LayoutEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup outgoinglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Layout_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Layout_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(LayoutContainsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationContainsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActivityMuestraEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TextFieldEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_TextField_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(LayoutContainsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ActivityEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup outgoinglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationRunEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActivityShowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActivityMuestraEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MenuEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Menu_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup outgoinglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_Menu_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(ActivityShowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(MenuHasItemEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TextViewEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Node sv = (Node) view;
			AndroidNavigatorGroup incominglinks = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_TextView_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(LayoutContainsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AplicationRunEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_AplicationRun_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_AplicationRun_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LayoutContainsEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_LayoutContains_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_LayoutContains_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(TextFieldEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(TextViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(LayoutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityShowEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ActivityShow_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ActivityShow_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(MenuEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MenuHasItemEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_MenuHasItem_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_MenuHasItem_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ItemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(MenuEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AplicationCreatesEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_AplicationCreates_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_AplicationCreates_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(CreateStringEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActionShowsEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ActionShows_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ActionShows_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(DialogEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AplicationContainsEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_AplicationContains_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_AplicationContains_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(LayoutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry
							.getType(AplicationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ButtonTriggersEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ButtonTriggers_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ButtonTriggers_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityMuestraEditPart.VISUAL_ID: {
			LinkedList<AndroidAbstractNavigatorItem> result = new LinkedList<AndroidAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AndroidNavigatorGroup target = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ActivityMuestra_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AndroidNavigatorGroup source = new AndroidNavigatorGroup(
					Messages.NavigatorGroupName_ActivityMuestra_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(LayoutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					AndroidVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MetaAppEditPart.MODEL_ID.equals(AndroidVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<AndroidNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<AndroidNavigatorItem> result = new ArrayList<AndroidNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new AndroidNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof AndroidAbstractNavigatorItem) {
			AndroidAbstractNavigatorItem abstractNavigatorItem = (AndroidAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
