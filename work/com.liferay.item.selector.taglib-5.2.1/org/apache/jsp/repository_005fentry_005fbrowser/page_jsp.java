package org.apache.jsp.repository_005fentry_005fbrowser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.util.DLUtil;
import com.liferay.item.selector.ItemSelectorReturnTypeResolver;
import com.liferay.item.selector.taglib.internal.configuration.util.FFItemSelectorSingleFileUploaderConfigurationUtil;
import com.liferay.item.selector.taglib.internal.dao.search.RepositoryEntryResultRowSplitter;
import com.liferay.item.selector.taglib.internal.display.context.GroupSelectorDisplayContext;
import com.liferay.item.selector.taglib.internal.security.permission.resource.DLFolderPermission;
import com.liferay.item.selector.taglib.internal.servlet.ServletContextUtil;
import com.liferay.item.selector.taglib.internal.util.ItemSelectorRepositoryEntryBrowserUtil;
import com.liferay.petra.portlet.url.builder.PortletURLBuilder;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileShortcut;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.portlet.PortletURL;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.taglib.internal.display.context.ItemSelectorRepositoryEntryManagementToolbarDisplayContext;
import com.liferay.item.selector.taglib.internal.display.context.RepositoryEntryBrowserDisplayContext;
import com.liferay.item.selector.taglib.internal.util.EntryURLUtil;
import com.liferay.portal.kernel.servlet.BrowserSnifferUtil;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/repository_entry_browser/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-document-library.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/react.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class) : new com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag();
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
        _jspx_th_liferay$1frontend_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_defineObjects_0);
      _jspx_th_liferay$1frontend_defineObjects_0.release();
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.lang.String npmResolvedPackageName = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      npmResolvedPackageName = (java.lang.String) _jspx_page_context.findAttribute("npmResolvedPackageName");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.DefineObjectsTag.class) : new com.liferay.taglib.portlet.DefineObjectsTag();
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
        _jspx_th_portlet_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
      _jspx_th_portlet_defineObjects_0.release();
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

String randomNamespace = PortalUtil.generateRandomKey(request, "taglib_ui_repository_entry_browse_page") + StringPool.UNDERLINE;

String displayStyle = GetterUtil.getString(request.getAttribute("liferay-item-selector:repository-entry-browser:displayStyle"));
PortletURL editImageURL = (PortletURL)request.getAttribute("liferay-item-selector:repository-entry-browser:editImageURL");
String emptyResultsMessage = GetterUtil.getString(request.getAttribute("liferay-item-selector:repository-entry-browser:emptyResultsMessage"));
ItemSelectorReturnType existingFileEntryReturnType = (ItemSelectorReturnType)request.getAttribute("liferay-item-selector:repository-entry-browser:existingFileEntryReturnType");
List<String> extensions = (List)request.getAttribute("liferay-item-selector:repository-entry-browser:extensions");
String itemSelectedEventName = GetterUtil.getString(request.getAttribute("liferay-item-selector:repository-entry-browser:itemSelectedEventName"));
ItemSelectorReturnTypeResolver<?, FileEntry> itemSelectorReturnTypeResolver = (ItemSelectorReturnTypeResolver<?, FileEntry>)request.getAttribute("liferay-item-selector:repository-entry-browser:itemSelectorReturnTypeResolver");
long maxFileSize = GetterUtil.getLong(request.getAttribute("liferay-item-selector:repository-entry-browser:maxFileSize"));
String mimeTypeRestriction = GetterUtil.getString(request.getAttribute("liferay-item-selector:repository-entry-browser:mimeTypeRestriction"));
PortletURL portletURL = (PortletURL)request.getAttribute("liferay-item-selector:repository-entry-browser:portletURL");
List<FileEntry> repositoryEntries = (List<FileEntry>)request.getAttribute("liferay-item-selector:repository-entry-browser:repositoryEntries");
int repositoryEntriesCount = GetterUtil.getInteger(request.getAttribute("liferay-item-selector:repository-entry-browser:repositoryEntriesCount"));
boolean showBreadcrumb = GetterUtil.getBoolean(request.getAttribute("liferay-item-selector:repository-entry-browser:showBreadcrumb"));
boolean showDragAndDropZone = GetterUtil.getBoolean(request.getAttribute("liferay-item-selector:repository-entry-browser:showDragAndDropZone"));
boolean showSearch = GetterUtil.getBoolean(request.getAttribute("liferay-item-selector:repository-entry-browser:showSearch"));
String tabName = GetterUtil.getString(request.getAttribute("liferay-item-selector:repository-entry-browser:tabName"));
PortletURL uploadURL = (PortletURL)request.getAttribute("liferay-item-selector:repository-entry-browser:uploadURL");

String keywords = ParamUtil.getString(request, "keywords");

boolean showSearchInfo = false;

if (Validator.isNotNull(keywords)) {
	showSearchInfo = true;
}

String returnType = ItemSelectorRepositoryEntryBrowserUtil.getItemSelectorReturnTypeClassName(itemSelectorReturnTypeResolver, existingFileEntryReturnType);

if (uploadURL != null) {
	uploadURL.setParameter("returnType", returnType);
}

      out.write('\n');
      out.write('\n');
      //  liferay-util:html-top
      com.liferay.taglib.util.HtmlTopTag _jspx_th_liferay$1util_html$1top_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.HtmlTopTag.class) : new com.liferay.taglib.util.HtmlTopTag();
      _jspx_th_liferay$1util_html$1top_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_html$1top_0.setParent(null);
      int _jspx_eval_liferay$1util_html$1top_0 = _jspx_th_liferay$1util_html$1top_0.doStartTag();
      if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_html$1top_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_html$1top_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t<link href=\"");
          out.print( ServletContextUtil.getContextPath() + "/repository_entry_browser/css/main.css" );
          out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
          int evalDoAfterBody = _jspx_th_liferay$1util_html$1top_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_html$1top_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_html$1top_0);
        _jspx_th_liferay$1util_html$1top_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_html$1top_0);
      _jspx_th_liferay$1util_html$1top_0.release();
      out.write('\n');
      out.write('\n');

RepositoryEntryBrowserDisplayContext repositoryEntryBrowserDisplayContext = new RepositoryEntryBrowserDisplayContext(request);

ItemSelectorRepositoryEntryManagementToolbarDisplayContext itemSelectorRepositoryEntryManagementToolbarDisplayContext = new ItemSelectorRepositoryEntryManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, repositoryEntryBrowserDisplayContext);

if (FFItemSelectorSingleFileUploaderConfigurationUtil.enabled()) {
	emptyResultsMessage = null;
}

SearchContainer<?> searchContainer = new SearchContainer(renderRequest, itemSelectorRepositoryEntryManagementToolbarDisplayContext.getCurrentSortingURL(), null, emptyResultsMessage);

      out.write('\n');
      out.write('\n');
      //  clay:management-toolbar
      com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag _jspx_th_clay_management$1toolbar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag();
      _jspx_th_clay_management$1toolbar_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_management$1toolbar_0.setParent(null);
      _jspx_th_clay_management$1toolbar_0.setClearResultsURL( String.valueOf(itemSelectorRepositoryEntryManagementToolbarDisplayContext.getClearResultsURL()) );
      _jspx_th_clay_management$1toolbar_0.setCreationMenu( itemSelectorRepositoryEntryManagementToolbarDisplayContext.getCreationMenu() );
      _jspx_th_clay_management$1toolbar_0.setDisabled( itemSelectorRepositoryEntryManagementToolbarDisplayContext.isDisabled() );
      _jspx_th_clay_management$1toolbar_0.setFilterDropdownItems( itemSelectorRepositoryEntryManagementToolbarDisplayContext.getFilterDropdownItems() );
      _jspx_th_clay_management$1toolbar_0.setFilterLabelItems( itemSelectorRepositoryEntryManagementToolbarDisplayContext.getFilterLabelItems() );
      _jspx_th_clay_management$1toolbar_0.setItemsTotal( repositoryEntriesCount );
      _jspx_th_clay_management$1toolbar_0.setSearchActionURL( String.valueOf(itemSelectorRepositoryEntryManagementToolbarDisplayContext.getSearchURL()) );
      _jspx_th_clay_management$1toolbar_0.setSearchFormMethod("POST");
      _jspx_th_clay_management$1toolbar_0.setSearchFormName("searchFm");
      _jspx_th_clay_management$1toolbar_0.setSelectable( false );
      _jspx_th_clay_management$1toolbar_0.setShowCreationMenu( itemSelectorRepositoryEntryManagementToolbarDisplayContext.isShowCreationMenu() );
      _jspx_th_clay_management$1toolbar_0.setShowInfoButton( false );
      _jspx_th_clay_management$1toolbar_0.setShowSearch( showSearch );
      _jspx_th_clay_management$1toolbar_0.setSortingOrder( itemSelectorRepositoryEntryManagementToolbarDisplayContext.getOrderByType() );
      _jspx_th_clay_management$1toolbar_0.setSortingURL( String.valueOf(itemSelectorRepositoryEntryManagementToolbarDisplayContext.getSortingURL()) );
      _jspx_th_clay_management$1toolbar_0.setViewTypeItems( itemSelectorRepositoryEntryManagementToolbarDisplayContext.getViewTypes() );
      int _jspx_eval_clay_management$1toolbar_0 = _jspx_th_clay_management$1toolbar_0.doStartTag();
      if (_jspx_th_clay_management$1toolbar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_management$1toolbar_0);
        _jspx_th_clay_management$1toolbar_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_management$1toolbar_0);
      _jspx_th_clay_management$1toolbar_0.release();
      out.write('\n');
      out.write('\n');
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      _jspx_th_clay_container$1fluid_0.setCssClass("item-selector lfr-item-viewer");
      _jspx_th_clay_container$1fluid_0.setDynamicAttribute(null, "id",  randomNamespace + "ItemSelectorContainer" );
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
if (
 showSearchInfo ) {
        out.write("\n");
        out.write("\t\t");
        //  liferay-util:include
        com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
        _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1util_include_0.setPage("/repository_entry_browser/search_info.jsp");
        _jspx_th_liferay$1util_include_0.setServletContext( application );
        int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
        if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
          _jspx_th_liferay$1util_include_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
        _jspx_th_liferay$1util_include_0.release();
        out.write('\n');
        out.write('	');
}
        out.write("\n");
        out.write("\n");
        out.write("\t<div class=\"message-container\"></div>\n");
        out.write("\n");
        out.write("\t");

	long folderId = ParamUtil.getLong(request, "folderId");
	
        out.write("\n");
        out.write("\n");
        out.write("\t");
if (
 showBreadcrumb && !showSearchInfo ) {
        out.write("\n");
        out.write("\n");
        out.write("\t\t");

		ItemSelectorRepositoryEntryBrowserUtil.addPortletBreadcrumbEntries(folderId, displayStyle, request, liferayPortletRequest, liferayPortletResponse, PortletURLUtil.clone(portletURL, liferayPortletResponse));
		
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
        //  liferay-ui:breadcrumb
        com.liferay.taglib.ui.BreadcrumbTag _jspx_th_liferay$1ui_breadcrumb_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.BreadcrumbTag.class) : new com.liferay.taglib.ui.BreadcrumbTag();
        _jspx_th_liferay$1ui_breadcrumb_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1ui_breadcrumb_0.setShowCurrentGroup( false );
        _jspx_th_liferay$1ui_breadcrumb_0.setShowGuestGroup( false );
        _jspx_th_liferay$1ui_breadcrumb_0.setShowLayout( false );
        _jspx_th_liferay$1ui_breadcrumb_0.setShowParentGroups( false );
        int _jspx_eval_liferay$1ui_breadcrumb_0 = _jspx_th_liferay$1ui_breadcrumb_0.doStartTag();
        if (_jspx_th_liferay$1ui_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_breadcrumb_0);
          _jspx_th_liferay$1ui_breadcrumb_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_breadcrumb_0);
        _jspx_th_liferay$1ui_breadcrumb_0.release();
        out.write('\n');
        out.write('	');
}
        out.write("\n");
        out.write("\n");
        out.write("\t");
if (
 showDragAndDropZone && !showSearchInfo && DLFolderPermission.contains(permissionChecker, scopeGroupId, folderId, ActionKeys.ADD_DOCUMENT) ) {
        out.write("\n");
        out.write("\t\t");
        out.write("\n");
        out.write("\t\t\t");
if (
 FFItemSelectorSingleFileUploaderConfigurationUtil.enabled() ) {
        out.write("\n");
        out.write("\t\t\t\t<div class=\"dropzone-wrapper ");
        out.print( (repositoryEntriesCount == 0) ? "dropzone-wrapper-search-container-empty" : StringPool.BLANK );
        out.write("\">\n");
        out.write("\t\t\t\t\t<div class=\"dropzone dropzone-disabled\"><span aria-hidden=\"true\" class=\"loading-animation loading-animation-sm\"></span></div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  react:component
        com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
        _jspx_th_react_component_0.setPageContext(_jspx_page_context);
        _jspx_th_react_component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_react_component_0.setData(
							HashMapBuilder.<String, Object>put(
								"closeCaption", LanguageUtil.get(request, tabName)
							).put(
								"editImageURL",
								() -> {
									if (editImageURL != null) {
										return editImageURL.toString();
									}

									return null;
								}
							).put(
								"itemSelectedEventName", itemSelectedEventName
							).put(
								"maxFileSize", maxFileSize
							).put(
								"mimeTypeRestriction", mimeTypeRestriction
							).put(
								"uploadItemReturnType", HtmlUtil.escapeAttribute(returnType)
							).put(
								"uploadItemURL", uploadURL.toString()
							).put(
								"validExtensions", StringUtil.merge(extensions)
							).build()
						);
        _jspx_th_react_component_0.setModule("item_selector_uploader/js/SingleFileUploader");
        int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
        if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
          _jspx_th_react_component_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        out.write("\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t");
        out.write("\n");
        out.write("\t\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t\t");
        //  liferay-util:buffer
        com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
        _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1util_buffer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1util_buffer_0.setVar("selectFileHTML");
        int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_liferay$1util_buffer_0.doInitBody();
          }
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<input accept=\"");
            out.print( ListUtil.isEmpty(extensions) ? "*" : StringUtil.merge(extensions) );
            out.write("\" class=\"input-file\" id=\"");
            out.print( randomNamespace );
            out.write("InputFile\" type=\"file\" />\n");
            out.write("\n");
            out.write("\t\t\t\t\t<label class=\"btn btn-secondary\" for=\"");
            out.print( randomNamespace );
            out.write("InputFile\">");
            if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_buffer_0, _jspx_page_context))
              return;
            out.write("</label>\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_liferay$1util_buffer_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_liferay$1util_buffer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_0);
          _jspx_th_liferay$1util_buffer_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_0);
        _jspx_th_liferay$1util_buffer_0.release();
        java.lang.String selectFileHTML = null;
        selectFileHTML = (java.lang.String) _jspx_page_context.findAttribute("selectFileHTML");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t<div class=\"drop-enabled drop-zone\">\n");
        out.write("\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
if (
 BrowserSnifferUtil.isMobile(request) ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        out.print( selectFileHTML );
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<strong>");
        //  liferay-ui:message
        com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
        _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1ui_message_1.setArguments( selectFileHTML );
        _jspx_th_liferay$1ui_message_1.setKey("drag-and-drop-to-upload-or-x");
        int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
        if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
          _jspx_th_liferay$1ui_message_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
        _jspx_th_liferay$1ui_message_1.release();
        out.write("</strong>\n");
        out.write("\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t");
        out.write("\n");
        out.write("\t\t");
}
        out.write('\n');
        out.write('	');
}
        out.write("\n");
        out.write("\n");
        out.write("\t");
if (
 (existingFileEntryReturnType != null) || (itemSelectorReturnTypeResolver != null) ) {
        out.write("\n");
        out.write("\t\t");
        //  liferay-ui:search-container
        com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay$1ui_search$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerTag.class) : new com.liferay.taglib.ui.SearchContainerTag();
        _jspx_th_liferay$1ui_search$1container_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1container_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_liferay$1ui_search$1container_0.setCssClass( displayStyle.equals("list") ? "main-content-body mt-4" : StringPool.BLANK );
        _jspx_th_liferay$1ui_search$1container_0.setSearchContainer( searchContainer );
        _jspx_th_liferay$1ui_search$1container_0.setTotal( repositoryEntriesCount );
        _jspx_th_liferay$1ui_search$1container_0.setVar("listSearchContainer");
        int _jspx_eval_liferay$1ui_search$1container_0 = _jspx_th_liferay$1ui_search$1container_0.doStartTag();
        if (_jspx_eval_liferay$1ui_search$1container_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Integer total = null;
          com.liferay.portal.kernel.dao.search.SearchContainer listSearchContainer = null;
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          listSearchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("listSearchContainer");
          out.write("\n");
          out.write("\t\t\t");
          //  liferay-ui:search-container-results
          java.util.List results = null;
          java.lang.Integer deprecatedTotal = null;
          com.liferay.taglib.ui.SearchContainerResultsTag _jspx_th_liferay$1ui_search$1container$1results_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerResultsTag.class) : new com.liferay.taglib.ui.SearchContainerResultsTag();
          _jspx_th_liferay$1ui_search$1container$1results_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1container$1results_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container$1results_0.setResults( repositoryEntries );
          int _jspx_eval_liferay$1ui_search$1container$1results_0 = _jspx_th_liferay$1ui_search$1container$1results_0.doStartTag();
          results = (java.util.List) _jspx_page_context.findAttribute("results");
          deprecatedTotal = (java.lang.Integer) _jspx_page_context.findAttribute("deprecatedTotal");
          if (_jspx_th_liferay$1ui_search$1container$1results_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1results_0);
            _jspx_th_liferay$1ui_search$1container$1results_0.release();
            return;
          }
          results = (java.util.List) _jspx_page_context.findAttribute("results");
          deprecatedTotal = (java.lang.Integer) _jspx_page_context.findAttribute("deprecatedTotal");
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1results_0);
          _jspx_th_liferay$1ui_search$1container$1results_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
          //  liferay-ui:search-container-row
          com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay$1ui_search$1container$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerRowTag.class) : new com.liferay.taglib.ui.SearchContainerRowTag();
          _jspx_th_liferay$1ui_search$1container$1row_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1container$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container$1row_0.setClassName("com.liferay.portal.kernel.repository.model.RepositoryEntry");
          _jspx_th_liferay$1ui_search$1container$1row_0.setModelVar("repositoryEntry");
          int _jspx_eval_liferay$1ui_search$1container$1row_0 = _jspx_th_liferay$1ui_search$1container$1row_0.doStartTag();
          if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            com.liferay.portal.kernel.repository.model.RepositoryEntry repositoryEntry = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_search$1container$1row_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_search$1container$1row_0.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            repositoryEntry = (com.liferay.portal.kernel.repository.model.RepositoryEntry) _jspx_page_context.findAttribute("repositoryEntry");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            do {
              out.write("\n");
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t");
if (
 displayStyle.equals("list") ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");

						FileEntry fileEntry = null;
						FileShortcut fileShortcut = null;
						Folder folder = null;

						if (repositoryEntry instanceof FileEntry) {
							fileEntry = (FileEntry)repositoryEntry;
						}
						else if (repositoryEntry instanceof FileShortcut) {
							fileShortcut = (FileShortcut)repositoryEntry;

							fileEntry = DLAppLocalServiceUtil.getFileEntry(fileShortcut.getToFileEntryId());
						}
						else {
							folder = (Folder)repositoryEntry;
						}
						
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 fileEntry != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							FileVersion latestFileVersion = fileEntry.getLatestFileVersion();

							String title = fileEntry.getTitle();

							JSONObject itemMedatadaJSONObject = ItemSelectorRepositoryEntryBrowserUtil.getItemMetadataJSONObject(fileEntry, locale);

							String thumbnailSrc = DLURLHelperUtil.getThumbnailSrc(fileEntry, themeDisplay);
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setName("title");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_0 = _jspx_th_liferay$1ui_search$1container$1column$1text_0.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_0.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<a class=\"item-preview\" data-metadata=\"");
                  out.print( HtmlUtil.escapeAttribute(itemMedatadaJSONObject.toString()) );
                  out.write("\" data-returnType=\"");
                  out.print( HtmlUtil.escapeAttribute(ItemSelectorRepositoryEntryBrowserUtil.getItemSelectorReturnTypeClassName(itemSelectorReturnTypeResolver, existingFileEntryReturnType)) );
                  out.write("\" data-url=\"");
                  out.print( HtmlUtil.escapeAttribute(DLURLHelperUtil.getPreviewURL(fileEntry, latestFileVersion, themeDisplay, StringPool.BLANK)) );
                  out.write("\" data-value=\"");
                  out.print( HtmlUtil.escapeAttribute(ItemSelectorRepositoryEntryBrowserUtil.getValue(itemSelectorReturnTypeResolver, existingFileEntryReturnType, fileEntry, themeDisplay)) );
                  out.write("\" href=\"");
                  out.print( Validator.isNotNull(thumbnailSrc) ? HtmlUtil.escapeHREF(DLURLHelperUtil.getImagePreviewURL(fileEntry, themeDisplay)) : themeDisplay.getPathThemeImages() + "/file_system/large/default.png" );
                  out.write("\" title=\"");
                  out.print( HtmlUtil.escapeAttribute(title) );
                  out.write("\">\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");

									String iconCssClass = DLUtil.getFileIconCssClass(fileEntry.getExtension());
									
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
if (
 Validator.isNotNull(iconCssClass) ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:icon
                  com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
                  _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_0);
                  _jspx_th_liferay$1ui_icon_0.setIcon( iconCssClass );
                  _jspx_th_liferay$1ui_icon_0.setMarkupView("lexicon");
                  int _jspx_eval_liferay$1ui_icon_0 = _jspx_th_liferay$1ui_icon_0.doStartTag();
                  if (_jspx_th_liferay$1ui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
                    _jspx_th_liferay$1ui_icon_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_0);
                  _jspx_th_liferay$1ui_icon_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"taglib-text\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  out.print( HtmlUtil.escape(title) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t</a>\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_0);
                _jspx_th_liferay$1ui_search$1container$1column$1text_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setName("location");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_1 = _jspx_th_liferay$1ui_search$1container$1column$1text_1.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_1.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_1);
                  _jspx_th_clay_icon_0.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(fileEntry.getGroupId()) );
                  int _jspx_eval_clay_icon_0 = _jspx_th_clay_icon_0.doStartTag();
                  if (_jspx_th_clay_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
                    _jspx_th_clay_icon_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
                  _jspx_th_clay_icon_0.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(fileEntry.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_1);
                _jspx_th_liferay$1ui_search$1container$1column$1text_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_1);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setName("size");
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setValue( LanguageUtil.formatStorageSize(fileEntry.getSize(), locale) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_2 = _jspx_th_liferay$1ui_search$1container$1column$1text_2.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_2);
                _jspx_th_liferay$1ui_search$1container$1column$1text_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_2);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-status
              com.liferay.taglib.ui.SearchContainerColumnStatusTag _jspx_th_liferay$1ui_search$1container$1column$1status_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnStatusTag.class) : new com.liferay.taglib.ui.SearchContainerColumnStatusTag();
              _jspx_th_liferay$1ui_search$1container$1column$1status_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1status_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1status_0.setName("status");
              _jspx_th_liferay$1ui_search$1container$1column$1status_0.setStatus( latestFileVersion.getStatus() );
              int _jspx_eval_liferay$1ui_search$1container$1column$1status_0 = _jspx_th_liferay$1ui_search$1container$1column$1status_0.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1status_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1status_0);
                _jspx_th_liferay$1ui_search$1container$1column$1status_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1status_0);
              _jspx_th_liferay$1ui_search$1container$1column$1status_0.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setName("modified-date");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_3 = _jspx_th_liferay$1ui_search$1container$1column$1text_3.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_3.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_3);
                  _jspx_th_liferay$1ui_message_2.setArguments( new String[] {LanguageUtil.getTimeDescription(locale, System.currentTimeMillis() - fileEntry.getModifiedDate().getTime(), true), HtmlUtil.escape(fileEntry.getUserName())} );
                  _jspx_th_liferay$1ui_message_2.setKey("x-ago-by-x");
                  _jspx_th_liferay$1ui_message_2.setTranslateArguments( false );
                  int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
                  if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                    _jspx_th_liferay$1ui_message_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                  _jspx_th_liferay$1ui_message_2.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_3);
                _jspx_th_liferay$1ui_search$1container$1column$1text_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_3);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_4 = _jspx_th_liferay$1ui_search$1container$1column$1text_4.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_4.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  clay:button
                  com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
                  _jspx_th_clay_button_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_4);
                  _jspx_th_clay_button_0.setBorderless( true );
                  _jspx_th_clay_button_0.setCssClass("component-action icon-view");
                  _jspx_th_clay_button_0.setDisplayType("secondary");
                  _jspx_th_clay_button_0.setIcon("view");
                  int _jspx_eval_clay_button_0 = _jspx_th_clay_button_0.doStartTag();
                  if (_jspx_th_clay_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
                    _jspx_th_clay_button_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
                  _jspx_th_clay_button_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_4);
                _jspx_th_liferay$1ui_search$1container$1column$1text_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_4);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 folder != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");

							PortletURL viewFolderURL = EntryURLUtil.getFolderPortletURL(folder, liferayPortletRequest, liferayPortletResponse, portletURL);
							
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.setName("title");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_5 = _jspx_th_liferay$1ui_search$1container$1column$1text_5.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_5.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<a href=\"");
                  out.print( HtmlUtil.escapeHREF(viewFolderURL.toString()) );
                  out.write("\" title=\"");
                  out.print( HtmlUtil.escapeAttribute(folder.getName()) );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_5, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"taglib-text\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  out.print( HtmlUtil.escape(folder.getName()) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t</a>\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_5);
                _jspx_th_liferay$1ui_search$1container$1column$1text_5.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_5);
              _jspx_th_liferay$1ui_search$1container$1column$1text_5.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.setName("location");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_6 = _jspx_th_liferay$1ui_search$1container$1column$1text_6.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_6.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_6);
                  _jspx_th_clay_icon_1.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(folder.getGroupId()) );
                  int _jspx_eval_clay_icon_1 = _jspx_th_clay_icon_1.doStartTag();
                  if (_jspx_th_clay_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
                    _jspx_th_clay_icon_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
                  _jspx_th_clay_icon_1.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(folder.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_6);
                _jspx_th_liferay$1ui_search$1container$1column$1text_6.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_6);
              _jspx_th_liferay$1ui_search$1container$1column$1text_6.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_search$1container$1column$1text_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_search$1container$1column$1text_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.setName("modified-date");
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_9 = _jspx_th_liferay$1ui_search$1container$1column$1text_9.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_9.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_9);
                  _jspx_th_liferay$1ui_message_3.setArguments( new String[] {LanguageUtil.getTimeDescription(locale, System.currentTimeMillis() - folder.getModifiedDate().getTime(), true), HtmlUtil.escape(folder.getUserName())} );
                  _jspx_th_liferay$1ui_message_3.setKey("x-ago-by-x");
                  _jspx_th_liferay$1ui_message_3.setTranslateArguments( false );
                  int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
                  if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
                    _jspx_th_liferay$1ui_message_3.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
                  _jspx_th_liferay$1ui_message_3.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_9);
                _jspx_th_liferay$1ui_search$1container$1column$1text_9.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_9);
              _jspx_th_liferay$1ui_search$1container$1column$1text_9.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_search$1container$1column$1text_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");

						FileEntry fileEntry = null;
						Folder folder = null;

						if (repositoryEntry instanceof FileEntry) {
							fileEntry = (FileEntry)repositoryEntry;
						}
						else if (repositoryEntry instanceof FileShortcut) {
							FileShortcut fileShortcut = (FileShortcut)repositoryEntry;

							fileEntry = DLAppLocalServiceUtil.getFileEntry(fileShortcut.getToFileEntryId());
						}
						else {
							folder = (Folder)repositoryEntry;
						}
						
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
if (
 displayStyle.equals("icon") ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");

								row.setCssClass("card-page-item card-page-item-directory");
								
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
if (
 folder != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");

									PortletURL viewFolderURL = EntryURLUtil.getFolderPortletURL(folder, liferayPortletRequest, liferayPortletResponse, portletURL);
									
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.setColspan( 3 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_11 = _jspx_th_liferay$1ui_search$1container$1column$1text_11.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_11.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"card card-horizontal card-interactive card-interactive-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card-row\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:content-col
                  com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                  _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_11);
                  int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
                  if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    //  clay:sticker
                    com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag _jspx_th_clay_sticker_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag();
                    _jspx_th_clay_sticker_0.setPageContext(_jspx_page_context);
                    _jspx_th_clay_sticker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
                    _jspx_th_clay_sticker_0.setDisplayType("secondary");
                    _jspx_th_clay_sticker_0.setIcon("folder");
                    _jspx_th_clay_sticker_0.setInline( true );
                    int _jspx_eval_clay_sticker_0 = _jspx_th_clay_sticker_0.doStartTag();
                    if (_jspx_th_clay_sticker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
                      _jspx_th_clay_sticker_0.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
                    _jspx_th_clay_sticker_0.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
                    _jspx_th_clay_content$1col_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
                  _jspx_th_clay_content$1col_0.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"autofit-col autofit-col-expand autofit-col-gutters\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"card-title text-truncate\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_11);
                  _jspx_th_aui_a_0.setHref( viewFolderURL.toString() );
                  _jspx_th_aui_a_0.setTitle( HtmlUtil.escapeAttribute(folder.getName()) );
                  int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
                  if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    out.print( HtmlUtil.escape(folder.getName()) );
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
                    _jspx_th_aui_a_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
                  _jspx_th_aui_a_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</p>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_2.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_11);
                  _jspx_th_clay_icon_2.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(folder.getGroupId()) );
                  int _jspx_eval_clay_icon_2 = _jspx_th_clay_icon_2.doStartTag();
                  if (_jspx_th_clay_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_2);
                    _jspx_th_clay_icon_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_2);
                  _jspx_th_clay_icon_2.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(folder.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_11);
                _jspx_th_liferay$1ui_search$1container$1column$1text_11.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_11);
              _jspx_th_liferay$1ui_search$1container$1column$1text_11.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
if (
 fileEntry != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");

									FileVersion latestFileVersion = fileEntry.getLatestFileVersion();

									String title = fileEntry.getTitle();

									JSONObject itemMedatadaJSONObject = ItemSelectorRepositoryEntryBrowserUtil.getItemMetadataJSONObject(fileEntry, locale);

									Map<String, Object> data = HashMapBuilder.<String, Object>put(
										"description", fileEntry.getDescription()
									).put(
										"fileEntryId", fileEntry.getFileEntryId()
									).build();

									String thumbnailSrc = DLURLHelperUtil.getThumbnailSrc(fileEntry, themeDisplay);

									if (Validator.isNotNull(thumbnailSrc)) {
										data.put("href", DLURLHelperUtil.getImagePreviewURL(fileEntry, themeDisplay));
									}
									else {
										data.put("href", themeDisplay.getPathThemeImages() + "/file_system/large/default.png");
									}

									data.put("metadata", itemMedatadaJSONObject.toString());
									data.put("returnType", ItemSelectorRepositoryEntryBrowserUtil.getItemSelectorReturnTypeClassName(itemSelectorReturnTypeResolver, existingFileEntryReturnType));
									data.put("title", title);
									data.put("type", repositoryEntryBrowserDisplayContext.getType(latestFileVersion));
									data.put("url", DLURLHelperUtil.getPreviewURL(fileEntry, latestFileVersion, themeDisplay, StringPool.BLANK));
									data.put("value", ItemSelectorRepositoryEntryBrowserUtil.getValue(itemSelectorReturnTypeResolver, existingFileEntryReturnType, fileEntry, themeDisplay));
									
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_12 = _jspx_th_liferay$1ui_search$1container$1column$1text_12.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_12.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
if (
 Validator.isNull(thumbnailSrc) ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-frontend:icon-vertical-card
                  com.liferay.frontend.taglib.servlet.taglib.IconVerticalCardTag _jspx_th_liferay$1frontend_icon$1vertical$1card_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.IconVerticalCardTag.class) : new com.liferay.frontend.taglib.servlet.taglib.IconVerticalCardTag();
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_12);
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setActionJsp( repositoryEntryBrowserDisplayContext.isPreviewable(latestFileVersion) ? "/repository_entry_browser/action_button_preview.jsp" : StringPool.BLANK );
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setActionJspServletContext( application );
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setCardCssClass("card-interactive");
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setCssClass( (repositoryEntryBrowserDisplayContext.isPreviewable(latestFileVersion) ? "item-preview-editable" : StringPool.BLANK) + " item-preview file-card form-check form-check-card" );
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setData( data );
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setIcon("documents-and-media");
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.setTitle( title );
                  int _jspx_eval_liferay$1frontend_icon$1vertical$1card_0 = _jspx_th_liferay$1frontend_icon$1vertical$1card_0.doStartTag();
                  if (_jspx_eval_liferay$1frontend_icon$1vertical$1card_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-frontend:vertical-card-footer
                    com.liferay.frontend.taglib.servlet.taglib.VerticalCardFooterTag _jspx_th_liferay$1frontend_vertical$1card$1footer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.VerticalCardFooterTag.class) : new com.liferay.frontend.taglib.servlet.taglib.VerticalCardFooterTag();
                    _jspx_th_liferay$1frontend_vertical$1card$1footer_0.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1frontend_vertical$1card$1footer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_icon$1vertical$1card_0);
                    int _jspx_eval_liferay$1frontend_vertical$1card$1footer_0 = _jspx_th_liferay$1frontend_vertical$1card$1footer_0.doStartTag();
                    if (_jspx_eval_liferay$1frontend_vertical$1card$1footer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1footer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_th_liferay$1frontend_vertical$1card$1footer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_liferay$1frontend_vertical$1card$1footer_0.doInitBody();
                      }
                      do {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        //  clay:icon
                        com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                        _jspx_th_clay_icon_3.setPageContext(_jspx_page_context);
                        _jspx_th_clay_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_vertical$1card$1footer_0);
                        _jspx_th_clay_icon_3.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(fileEntry.getGroupId()) );
                        int _jspx_eval_clay_icon_3 = _jspx_th_clay_icon_3.doStartTag();
                        if (_jspx_th_clay_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_3);
                          _jspx_th_clay_icon_3.release();
                          return;
                        }
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_3);
                        _jspx_th_clay_icon_3.release();
                        out.write("\n");
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<small>");
                        out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(fileEntry.getGroupId(), locale) );
                        out.write("</small>\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_liferay$1frontend_vertical$1card$1footer_0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1footer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                        out = _jspx_page_context.popBody();
                    }
                    if (_jspx_th_liferay$1frontend_vertical$1card$1footer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1footer_0);
                      _jspx_th_liferay$1frontend_vertical$1card$1footer_0.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1footer_0);
                    _jspx_th_liferay$1frontend_vertical$1card$1footer_0.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-frontend:vertical-card-sticker-bottom
                    com.liferay.frontend.taglib.servlet.taglib.VerticalCardStickerBottomTag _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.VerticalCardStickerBottomTag.class) : new com.liferay.frontend.taglib.servlet.taglib.VerticalCardStickerBottomTag();
                    _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_icon$1vertical$1card_0);
                    int _jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_0 = _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.doStartTag();
                    if (_jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.doInitBody();
                      }
                      do {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        //  liferay-document-library:mime-type-sticker
                        com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag _jspx_th_liferay$1document$1library_mime$1type$1sticker_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag.class) : new com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag();
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.setPageContext(_jspx_page_context);
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0);
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.setCssClass("sticker-bottom-left sticker-secondary");
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.setFileVersion( latestFileVersion );
                        int _jspx_eval_liferay$1document$1library_mime$1type$1sticker_0 = _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.doStartTag();
                        if (_jspx_th_liferay$1document$1library_mime$1type$1sticker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1document$1library_mime$1type$1sticker_0);
                          _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.release();
                          return;
                        }
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1document$1library_mime$1type$1sticker_0);
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_0.release();
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                        out = _jspx_page_context.popBody();
                    }
                    if (_jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0);
                      _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0);
                    _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_0.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_liferay$1frontend_icon$1vertical$1card_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_icon$1vertical$1card_0);
                    _jspx_th_liferay$1frontend_icon$1vertical$1card_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_icon$1vertical$1card_0);
                  _jspx_th_liferay$1frontend_icon$1vertical$1card_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
else {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-frontend:vertical-card
                  com.liferay.frontend.taglib.servlet.taglib.VerticalCardTag _jspx_th_liferay$1frontend_vertical$1card_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.VerticalCardTag.class) : new com.liferay.frontend.taglib.servlet.taglib.VerticalCardTag();
                  _jspx_th_liferay$1frontend_vertical$1card_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1frontend_vertical$1card_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_12);
                  _jspx_th_liferay$1frontend_vertical$1card_0.setActionJsp( repositoryEntryBrowserDisplayContext.isPreviewable(latestFileVersion) ? "/repository_entry_browser/action_button_preview.jsp" : StringPool.BLANK );
                  _jspx_th_liferay$1frontend_vertical$1card_0.setActionJspServletContext( application );
                  _jspx_th_liferay$1frontend_vertical$1card_0.setCardCssClass("card-interactive");
                  _jspx_th_liferay$1frontend_vertical$1card_0.setCssClass( (repositoryEntryBrowserDisplayContext.isPreviewable(latestFileVersion) ? "item-preview-editable" : StringPool.BLANK) + " item-preview form-check form-check-card image-card" );
                  _jspx_th_liferay$1frontend_vertical$1card_0.setData( data );
                  _jspx_th_liferay$1frontend_vertical$1card_0.setImageUrl( thumbnailSrc );
                  _jspx_th_liferay$1frontend_vertical$1card_0.setTitle( title );
                  int _jspx_eval_liferay$1frontend_vertical$1card_0 = _jspx_th_liferay$1frontend_vertical$1card_0.doStartTag();
                  if (_jspx_eval_liferay$1frontend_vertical$1card_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-frontend:vertical-card-footer
                    com.liferay.frontend.taglib.servlet.taglib.VerticalCardFooterTag _jspx_th_liferay$1frontend_vertical$1card$1footer_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.VerticalCardFooterTag.class) : new com.liferay.frontend.taglib.servlet.taglib.VerticalCardFooterTag();
                    _jspx_th_liferay$1frontend_vertical$1card$1footer_1.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1frontend_vertical$1card$1footer_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_vertical$1card_0);
                    int _jspx_eval_liferay$1frontend_vertical$1card$1footer_1 = _jspx_th_liferay$1frontend_vertical$1card$1footer_1.doStartTag();
                    if (_jspx_eval_liferay$1frontend_vertical$1card$1footer_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1footer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_th_liferay$1frontend_vertical$1card$1footer_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_liferay$1frontend_vertical$1card$1footer_1.doInitBody();
                      }
                      do {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        //  clay:icon
                        com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                        _jspx_th_clay_icon_4.setPageContext(_jspx_page_context);
                        _jspx_th_clay_icon_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_vertical$1card$1footer_1);
                        _jspx_th_clay_icon_4.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(fileEntry.getGroupId()) );
                        int _jspx_eval_clay_icon_4 = _jspx_th_clay_icon_4.doStartTag();
                        if (_jspx_th_clay_icon_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_4);
                          _jspx_th_clay_icon_4.release();
                          return;
                        }
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_4);
                        _jspx_th_clay_icon_4.release();
                        out.write("\n");
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<small>");
                        out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(fileEntry.getGroupId(), locale) );
                        out.write("</small>\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_liferay$1frontend_vertical$1card$1footer_1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1footer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                        out = _jspx_page_context.popBody();
                    }
                    if (_jspx_th_liferay$1frontend_vertical$1card$1footer_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1footer_1);
                      _jspx_th_liferay$1frontend_vertical$1card$1footer_1.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1footer_1);
                    _jspx_th_liferay$1frontend_vertical$1card$1footer_1.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-frontend:vertical-card-sticker-bottom
                    com.liferay.frontend.taglib.servlet.taglib.VerticalCardStickerBottomTag _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.VerticalCardStickerBottomTag.class) : new com.liferay.frontend.taglib.servlet.taglib.VerticalCardStickerBottomTag();
                    _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_vertical$1card_0);
                    int _jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_1 = _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.doStartTag();
                    if (_jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.doInitBody();
                      }
                      do {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        //  liferay-document-library:mime-type-sticker
                        com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag _jspx_th_liferay$1document$1library_mime$1type$1sticker_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag.class) : new com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag();
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.setPageContext(_jspx_page_context);
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1);
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.setCssClass("sticker-bottom-left sticker-secondary");
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.setFileVersion( latestFileVersion );
                        int _jspx_eval_liferay$1document$1library_mime$1type$1sticker_1 = _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.doStartTag();
                        if (_jspx_th_liferay$1document$1library_mime$1type$1sticker_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1document$1library_mime$1type$1sticker_1);
                          _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.release();
                          return;
                        }
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1document$1library_mime$1type$1sticker_1);
                        _jspx_th_liferay$1document$1library_mime$1type$1sticker_1.release();
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_liferay$1frontend_vertical$1card$1sticker$1bottom_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                        out = _jspx_page_context.popBody();
                    }
                    if (_jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1);
                      _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1);
                    _jspx_th_liferay$1frontend_vertical$1card$1sticker$1bottom_1.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_liferay$1frontend_vertical$1card_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card_0);
                    _jspx_th_liferay$1frontend_vertical$1card_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_vertical$1card_0);
                  _jspx_th_liferay$1frontend_vertical$1card_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_12.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_12);
                _jspx_th_liferay$1ui_search$1container$1column$1text_12.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_12);
              _jspx_th_liferay$1ui_search$1container$1column$1text_12.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
if (
 folder != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");

									PortletURL viewFolderURL = EntryURLUtil.getFolderPortletURL(folder, liferayPortletRequest, liferayPortletResponse, portletURL);
									
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1ui_search$1container$1column$1icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.setColspan( 3 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_13 = _jspx_th_liferay$1ui_search$1container$1column$1text_13.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_13.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<h5>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
                  out.print( HtmlUtil.escapeAttribute(viewFolderURL.toString()) );
                  out.write("\" title=\"");
                  out.print( folder.getName() );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>");
                  out.print( HtmlUtil.escape(folder.getName()) );
                  out.write("</strong>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</h5>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_13, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_5.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_13);
                  _jspx_th_clay_icon_5.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(folder.getGroupId()) );
                  int _jspx_eval_clay_icon_5 = _jspx_th_clay_icon_5.doStartTag();
                  if (_jspx_th_clay_icon_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_5);
                    _jspx_th_clay_icon_5.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_5);
                  _jspx_th_clay_icon_5.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(folder.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_13, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_13);
                  _jspx_th_liferay$1ui_message_6.setArguments( new String[] {LanguageUtil.getTimeDescription(locale, System.currentTimeMillis() - folder.getCreateDate().getTime(), true), HtmlUtil.escape(folder.getUserName())} );
                  _jspx_th_liferay$1ui_message_6.setKey("x-ago-by-x");
                  _jspx_th_liferay$1ui_message_6.setTranslateArguments( false );
                  int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
                  if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
                    _jspx_th_liferay$1ui_message_6.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
                  _jspx_th_liferay$1ui_message_6.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_13.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_13);
                _jspx_th_liferay$1ui_search$1container$1column$1text_13.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_13);
              _jspx_th_liferay$1ui_search$1container$1column$1text_13.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
if (
 fileEntry != null ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");

									row.setCssClass("item-selector-list-row " + row.getCssClass());

									FileVersion latestFileVersion = fileEntry.getLatestFileVersion();

									String title = fileEntry.getTitle();

									JSONObject itemMedatadaJSONObject = ItemSelectorRepositoryEntryBrowserUtil.getItemMetadataJSONObject(fileEntry, locale);

									String thumbnailSrc = DLURLHelperUtil.getThumbnailSrc(fileEntry, themeDisplay);
									
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 Validator.isNotNull(thumbnailSrc) ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-image
              com.liferay.taglib.ui.SearchContainerColumnImageTag _jspx_th_liferay$1ui_search$1container$1column$1image_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnImageTag.class) : new com.liferay.taglib.ui.SearchContainerColumnImageTag();
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.setSrc( DLURLHelperUtil.getThumbnailSrc(fileEntry, themeDisplay) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1image_0 = _jspx_th_liferay$1ui_search$1container$1column$1image_0.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1image_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1image_0);
                _jspx_th_liferay$1ui_search$1container$1column$1image_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1image_0);
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_14 = _jspx_th_liferay$1ui_search$1container$1column$1text_14.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_14.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-document-library:mime-type-sticker
                  com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag _jspx_th_liferay$1document$1library_mime$1type$1sticker_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag.class) : new com.liferay.document.library.taglib.servlet.taglib.MimeTypeStickerTag();
                  _jspx_th_liferay$1document$1library_mime$1type$1sticker_2.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1document$1library_mime$1type$1sticker_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_14);
                  _jspx_th_liferay$1document$1library_mime$1type$1sticker_2.setFileVersion( latestFileVersion );
                  int _jspx_eval_liferay$1document$1library_mime$1type$1sticker_2 = _jspx_th_liferay$1document$1library_mime$1type$1sticker_2.doStartTag();
                  if (_jspx_th_liferay$1document$1library_mime$1type$1sticker_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1document$1library_mime$1type$1sticker_2);
                    _jspx_th_liferay$1document$1library_mime$1type$1sticker_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1document$1library_mime$1type$1sticker_2);
                  _jspx_th_liferay$1document$1library_mime$1type$1sticker_2.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_14.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_14);
                _jspx_th_liferay$1ui_search$1container$1column$1text_14.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_14);
              _jspx_th_liferay$1ui_search$1container$1column$1text_14.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_15.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_15.setColspan( 2 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_15 = _jspx_th_liferay$1ui_search$1container$1column$1text_15.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_15.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item-preview\" data-href=\"");
                  out.print( Validator.isNotNull(thumbnailSrc) ? HtmlUtil.escapeHREF(DLURLHelperUtil.getImagePreviewURL(fileEntry, themeDisplay)) : themeDisplay.getPathThemeImages() + "/file_system/large/default.png" );
                  out.write("\" data-metadata=\"");
                  out.print( HtmlUtil.escapeAttribute(itemMedatadaJSONObject.toString()) );
                  out.write("\" data-returnType=\"");
                  out.print( HtmlUtil.escapeAttribute(ItemSelectorRepositoryEntryBrowserUtil.getItemSelectorReturnTypeClassName(itemSelectorReturnTypeResolver, existingFileEntryReturnType)) );
                  out.write("\" data-title=\"");
                  out.print( HtmlUtil.escapeAttribute(title) );
                  out.write("\" data-url=\"");
                  out.print( HtmlUtil.escapeAttribute(DLURLHelperUtil.getPreviewURL(fileEntry, latestFileVersion, themeDisplay, StringPool.BLANK)) );
                  out.write("\" data-value=\"");
                  out.print( HtmlUtil.escapeAttribute(ItemSelectorRepositoryEntryBrowserUtil.getValue(itemSelectorReturnTypeResolver, existingFileEntryReturnType, fileEntry, themeDisplay)) );
                  out.write("\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<h5>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>");
                  out.print( title );
                  out.write("</strong>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</h5>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
if (
 repositoryEntryBrowserDisplayContext.isSearchEverywhere() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_15, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-secondary\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  clay:icon
                  com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                  _jspx_th_clay_icon_6.setPageContext(_jspx_page_context);
                  _jspx_th_clay_icon_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_15);
                  _jspx_th_clay_icon_6.setSymbol( repositoryEntryBrowserDisplayContext.getGroupCssIcon(fileEntry.getGroupId()) );
                  int _jspx_eval_clay_icon_6 = _jspx_th_clay_icon_6.doStartTag();
                  if (_jspx_th_clay_icon_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_6);
                    _jspx_th_clay_icon_6.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_6);
                  _jspx_th_clay_icon_6.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<small>");
                  out.print( repositoryEntryBrowserDisplayContext.getGroupLabel(fileEntry.getGroupId(), locale) );
                  out.write("</small>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_15, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  out.print( String.valueOf(fileEntry.getVersion()) );
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1column$1text_15, _jspx_page_context))
                    return;
                  out.write(":\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_15);
                  _jspx_th_liferay$1ui_message_10.setArguments( new String[] {LanguageUtil.getTimeDescription(locale, System.currentTimeMillis() - fileEntry.getModifiedDate().getTime(), true), HtmlUtil.escape(latestFileVersion.getUserName())} );
                  _jspx_th_liferay$1ui_message_10.setKey("x-ago-by-x");
                  _jspx_th_liferay$1ui_message_10.setTranslateArguments( false );
                  int _jspx_eval_liferay$1ui_message_10 = _jspx_th_liferay$1ui_message_10.doStartTag();
                  if (_jspx_th_liferay$1ui_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
                    _jspx_th_liferay$1ui_message_10.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
                  _jspx_th_liferay$1ui_message_10.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_15.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_15);
                _jspx_th_liferay$1ui_search$1container$1column$1text_15.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_15);
              _jspx_th_liferay$1ui_search$1container$1column$1text_15.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_16 = _jspx_th_liferay$1ui_search$1container$1column$1text_16.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_16.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  clay:button
                  com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
                  _jspx_th_clay_button_1.setPageContext(_jspx_page_context);
                  _jspx_th_clay_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_16);
                  _jspx_th_clay_button_1.setBorderless( true );
                  _jspx_th_clay_button_1.setCssClass("component-action icon-view");
                  _jspx_th_clay_button_1.setDisplayType("secondary");
                  _jspx_th_clay_button_1.setIcon("view");
                  int _jspx_eval_clay_button_1 = _jspx_th_clay_button_1.doStartTag();
                  if (_jspx_th_clay_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
                    _jspx_th_clay_button_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
                  _jspx_th_clay_button_1.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_16.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_16);
                _jspx_th_liferay$1ui_search$1container$1column$1text_16.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_16);
              _jspx_th_liferay$1ui_search$1container$1column$1text_16.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              out.write(' ');
}
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
}
              out.write("\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1row_0.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              repositoryEntry = (com.liferay.portal.kernel.repository.model.RepositoryEntry) _jspx_page_context.findAttribute("repositoryEntry");
              row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_liferay$1ui_search$1container$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1row_0);
            _jspx_th_liferay$1ui_search$1container$1row_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1row_0);
          _jspx_th_liferay$1ui_search$1container$1row_0.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t");
          //  liferay-ui:search-iterator
          com.liferay.taglib.ui.SearchIteratorTag _jspx_th_liferay$1ui_search$1iterator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchIteratorTag.class) : new com.liferay.taglib.ui.SearchIteratorTag();
          _jspx_th_liferay$1ui_search$1iterator_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1iterator_0.setDisplayStyle( displayStyle );
          _jspx_th_liferay$1ui_search$1iterator_0.setMarkupView("lexicon");
          _jspx_th_liferay$1ui_search$1iterator_0.setResultRowSplitter( new RepositoryEntryResultRowSplitter() );
          _jspx_th_liferay$1ui_search$1iterator_0.setSearchContainer( searchContainer );
          int _jspx_eval_liferay$1ui_search$1iterator_0 = _jspx_th_liferay$1ui_search$1iterator_0.doStartTag();
          if (_jspx_th_liferay$1ui_search$1iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
            _jspx_th_liferay$1ui_search$1iterator_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
          _jspx_th_liferay$1ui_search$1iterator_0.release();
          out.write("\n");
          out.write("\t\t");
        }
        if (_jspx_th_liferay$1ui_search$1container_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
        _jspx_th_liferay$1ui_search$1container_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
if (
 !showSearchInfo && (uploadURL != null) ) {
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_liferay$1ui_drop$1here$1info_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_container$1fluid_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t");
}
        out.write('\n');
        out.write('	');
}
        out.write("\n");
        out.write("\n");
        out.write("\t<div class=\"item-selector-preview-container\"></div>\n");
      }
      if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setRequire( npmResolvedPackageName + "/repository_entry_browser/js/ItemSelectorRepositoryEntryBrowser.es as ItemSelectorRepositoryEntryBrowser" );
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\tvar itemSelector = new ItemSelectorRepositoryEntryBrowser.default({\n");
          out.write("\t\tcloseCaption: '");
          out.print( UnicodeLanguageUtil.get(request, tabName) );
          out.write("',\n");
          out.write("\n");
          out.write("\t\t");
if (
 editImageURL != null ) {
          out.write("\n");
          out.write("\t\t\teditImageURL: '");
          out.print( editImageURL.toString() );
          out.write("',\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\tffItemSelectorSingleFileUploaderEnabled: ");
          out.print( FFItemSelectorSingleFileUploaderConfigurationUtil.enabled() );
          out.write(",\n");
          out.write("\n");
          out.write("\t\tmaxFileSize: '");
          out.print( maxFileSize );
          out.write("',\n");
          out.write("\n");
          out.write("\t\trootNode: '#");
          out.print( randomNamespace );
          out.write("ItemSelectorContainer',\n");
          out.write("\n");
          out.write("\t\tvalidExtensions:\n");
          out.write("\t\t\t'");
          out.print( ListUtil.isEmpty(extensions) ? "*" : StringUtil.merge(extensions) );
          out.write("',\n");
          out.write("\n");
          out.write("\t\t");
if (
 (uploadURL != null) && !FFItemSelectorSingleFileUploaderConfigurationUtil.enabled() ) {
          out.write("\n");
          out.write("\t\t\tuploadItemReturnType: '");
          out.print( HtmlUtil.escapeAttribute(returnType) );
          out.write("',\n");
          out.write("\t\t\tuploadItemURL: '");
          out.print( uploadURL.toString() );
          out.write("',\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\t});\n");
          out.write("\n");
          out.write("\titemSelector.on('selectedItem', (event) => {\n");
          out.write("\t\tLiferay.Util.getOpener().Liferay.fire(\n");
          out.write("\t\t\t'");
          out.print( itemSelectedEventName );
          out.write("',\n");
          out.write("\t\t\tevent\n");
          out.write("\t\t);\n");
          out.write("\t});\n");
          int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
        _jspx_th_aui_script_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
      _jspx_th_aui_script_0.release();
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_buffer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_0);
    _jspx_th_liferay$1ui_message_0.setKey("select-file");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
    _jspx_th_liferay$1ui_message_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon
    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
    _jspx_th_liferay$1ui_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_5);
    _jspx_th_liferay$1ui_icon_1.setIcon("folder");
    _jspx_th_liferay$1ui_icon_1.setMarkupView("lexicon");
    int _jspx_eval_liferay$1ui_icon_1 = _jspx_th_liferay$1ui_icon_1.doStartTag();
    if (_jspx_th_liferay$1ui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
      _jspx_th_liferay$1ui_icon_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
    _jspx_th_liferay$1ui_icon_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
    _jspx_th_liferay$1ui_search$1container$1column$1text_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_7.setName("size");
    _jspx_th_liferay$1ui_search$1container$1column$1text_7.setValue("--");
    int _jspx_eval_liferay$1ui_search$1container$1column$1text_7 = _jspx_th_liferay$1ui_search$1container$1column$1text_7.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_7);
      _jspx_th_liferay$1ui_search$1container$1column$1text_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_7);
    _jspx_th_liferay$1ui_search$1container$1column$1text_7.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
    _jspx_th_liferay$1ui_search$1container$1column$1text_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_8.setName("status");
    _jspx_th_liferay$1ui_search$1container$1column$1text_8.setValue("--");
    int _jspx_eval_liferay$1ui_search$1container$1column$1text_8 = _jspx_th_liferay$1ui_search$1container$1column$1text_8.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_8);
      _jspx_th_liferay$1ui_search$1container$1column$1text_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_8);
    _jspx_th_liferay$1ui_search$1container$1column$1text_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
    _jspx_th_liferay$1ui_search$1container$1column$1text_10.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_10.setValue("--");
    int _jspx_eval_liferay$1ui_search$1container$1column$1text_10 = _jspx_th_liferay$1ui_search$1container$1column$1text_10.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_10);
      _jspx_th_liferay$1ui_search$1container$1column$1text_10.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_10);
    _jspx_th_liferay$1ui_search$1container$1column$1text_10.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-icon
    com.liferay.taglib.ui.SearchContainerColumnIconTag _jspx_th_liferay$1ui_search$1container$1column$1icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnIconTag.class) : new com.liferay.taglib.ui.SearchContainerColumnIconTag();
    _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setIcon("folder");
    int _jspx_eval_liferay$1ui_search$1container$1column$1icon_0 = _jspx_th_liferay$1ui_search$1container$1column$1icon_0.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1icon_0);
      _jspx_th_liferay$1ui_search$1container$1column$1icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1icon_0);
    _jspx_th_liferay$1ui_search$1container$1column$1icon_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_13);
    _jspx_th_liferay$1ui_message_4.setKey("location");
    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
    _jspx_th_liferay$1ui_message_4.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_13);
    _jspx_th_liferay$1ui_message_5.setKey("created");
    int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
    if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
      _jspx_th_liferay$1ui_message_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
    _jspx_th_liferay$1ui_message_5.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_15);
    _jspx_th_liferay$1ui_message_7.setKey("location");
    int _jspx_eval_liferay$1ui_message_7 = _jspx_th_liferay$1ui_message_7.doStartTag();
    if (_jspx_th_liferay$1ui_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
      _jspx_th_liferay$1ui_message_7.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_7);
    _jspx_th_liferay$1ui_message_7.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_15);
    _jspx_th_liferay$1ui_message_8.setKey("version");
    int _jspx_eval_liferay$1ui_message_8 = _jspx_th_liferay$1ui_message_8.doStartTag();
    if (_jspx_th_liferay$1ui_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
      _jspx_th_liferay$1ui_message_8.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
    _jspx_th_liferay$1ui_message_8.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1column$1text_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_15);
    _jspx_th_liferay$1ui_message_9.setKey("last-updated");
    int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
    if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
      _jspx_th_liferay$1ui_message_9.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
    _jspx_th_liferay$1ui_message_9.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_drop$1here$1info_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_container$1fluid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:drop-here-info
    com.liferay.taglib.ui.DropHereInfoTag _jspx_th_liferay$1ui_drop$1here$1info_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.DropHereInfoTag.class) : new com.liferay.taglib.ui.DropHereInfoTag();
    _jspx_th_liferay$1ui_drop$1here$1info_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_drop$1here$1info_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
    _jspx_th_liferay$1ui_drop$1here$1info_0.setMessage("drop-files-here");
    int _jspx_eval_liferay$1ui_drop$1here$1info_0 = _jspx_th_liferay$1ui_drop$1here$1info_0.doStartTag();
    if (_jspx_th_liferay$1ui_drop$1here$1info_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_drop$1here$1info_0);
      _jspx_th_liferay$1ui_drop$1here$1info_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_drop$1here$1info_0);
    _jspx_th_liferay$1ui_drop$1here$1info_0.release();
    return false;
  }
}
