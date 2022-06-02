package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.item.selector.criteria.group.criterion.GroupItemSelectorCriterion;
import com.liferay.petra.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupServiceUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.site.constants.SiteWebKeys;
import com.liferay.site.item.selector.display.context.SitesItemSelectorViewDisplayContext;
import com.liferay.site.item.selector.web.internal.constants.SitesItemSelectorWebKeys;
import com.liferay.site.item.selector.web.internal.display.context.SitesItemSelectorViewManagementToolbarDisplayContext;
import com.liferay.site.item.selector.web.internal.servlet.taglib.clay.SiteVerticalCard;
import com.liferay.site.util.GroupURLProvider;
import java.util.List;
import java.util.Map;

public final class view_005fsites_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(8);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
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

SitesItemSelectorViewDisplayContext siteItemSelectorViewDisplayContext = (SitesItemSelectorViewDisplayContext)request.getAttribute(SitesItemSelectorWebKeys.SITES_ITEM_SELECTOR_DISPLAY_CONTEXT);
GroupURLProvider groupURLProvider = (GroupURLProvider)request.getAttribute(SiteWebKeys.GROUP_URL_PROVIDER);

String displayStyle = siteItemSelectorViewDisplayContext.getDisplayStyle();

GroupItemSelectorCriterion groupItemSelectorCriterion = siteItemSelectorViewDisplayContext.getGroupItemSelectorCriterion();

String target = ParamUtil.getString(request, "target", groupItemSelectorCriterion.getTarget());

      out.write('\n');
      out.write('\n');
      //  clay:management-toolbar
      com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag _jspx_th_clay_management$1toolbar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ManagementToolbarTag();
      _jspx_th_clay_management$1toolbar_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_management$1toolbar_0.setParent(null);
      _jspx_th_clay_management$1toolbar_0.setManagementToolbarDisplayContext( new SitesItemSelectorViewManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, siteItemSelectorViewDisplayContext) );
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
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction( siteItemSelectorViewDisplayContext.getPortletURL() );
      _jspx_th_aui_form_0.setCssClass("container-fluid container-fluid-max-xl");
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("selectGroupFm");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
if (
 siteItemSelectorViewDisplayContext.isShowChildSitesLink() ) {
        out.write("\n");
        out.write("\t\t<div id=\"breadcrumb\">\n");
        out.write("\t\t\t");
        //  liferay-ui:breadcrumb
        com.liferay.taglib.ui.BreadcrumbTag _jspx_th_liferay$1ui_breadcrumb_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.BreadcrumbTag.class) : new com.liferay.taglib.ui.BreadcrumbTag();
        _jspx_th_liferay$1ui_breadcrumb_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_breadcrumb_0.setShowCurrentGroup( false );
        _jspx_th_liferay$1ui_breadcrumb_0.setShowGuestGroup( false );
        _jspx_th_liferay$1ui_breadcrumb_0.setShowLayout( false );
        _jspx_th_liferay$1ui_breadcrumb_0.setShowPortletBreadcrumb( true );
        int _jspx_eval_liferay$1ui_breadcrumb_0 = _jspx_th_liferay$1ui_breadcrumb_0.doStartTag();
        if (_jspx_th_liferay$1ui_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_breadcrumb_0);
          _jspx_th_liferay$1ui_breadcrumb_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_breadcrumb_0);
        _jspx_th_liferay$1ui_breadcrumb_0.release();
        out.write("\n");
        out.write("\t\t</div>\n");
        out.write("\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-ui:search-container
        com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay$1ui_search$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerTag.class) : new com.liferay.taglib.ui.SearchContainerTag();
        _jspx_th_liferay$1ui_search$1container_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1container_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ui_search$1container_0.setSearchContainer( siteItemSelectorViewDisplayContext.getGroupSearch() );
        int _jspx_eval_liferay$1ui_search$1container_0 = _jspx_th_liferay$1ui_search$1container_0.doStartTag();
        if (_jspx_eval_liferay$1ui_search$1container_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Integer total = null;
          com.liferay.portal.kernel.dao.search.SearchContainer searchContainer = null;
          total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
          searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:search-container-row
          com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay$1ui_search$1container$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerRowTag.class) : new com.liferay.taglib.ui.SearchContainerRowTag();
          _jspx_th_liferay$1ui_search$1container$1row_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1container$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container$1row_0.setClassName("com.liferay.portal.kernel.model.Group");
          _jspx_th_liferay$1ui_search$1container$1row_0.setEscapedModel( true );
          _jspx_th_liferay$1ui_search$1container$1row_0.setKeyProperty("groupId");
          _jspx_th_liferay$1ui_search$1container$1row_0.setModelVar("group");
          _jspx_th_liferay$1ui_search$1container$1row_0.setRowIdProperty("friendlyURL");
          _jspx_th_liferay$1ui_search$1container$1row_0.setRowVar("row");
          int _jspx_eval_liferay$1ui_search$1container$1row_0 = _jspx_th_liferay$1ui_search$1container$1row_0.doStartTag();
          if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Integer index = null;
            com.liferay.portal.kernel.model.Group group = null;
            com.liferay.portal.kernel.dao.search.ResultRow row = null;
            if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_liferay$1ui_search$1container$1row_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_liferay$1ui_search$1container$1row_0.doInitBody();
            }
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            group = (com.liferay.portal.kernel.model.Group) _jspx_page_context.findAttribute("group");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            do {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");

			List<Group> childGroups = GroupServiceUtil.getGroups(group.getCompanyId(), group.getGroupId(), true);

			Map<String, Object> data = HashMapBuilder.<String, Object>put(
				"groupdescriptivename", group.getDescriptiveName(locale)
			).put(
				"groupid", group.getGroupId()
			).put(
				"groupscopelabel", LanguageUtil.get(resourceBundle, group.getScopeLabel(themeDisplay))
			).put(
				"grouptarget", target
			).put(
				"grouptype", LanguageUtil.get(resourceBundle, group.getTypeLabel())
			).put(
				"url", groupURLProvider.getGroupURL(group, liferayPortletRequest)
			).put(
				"uuid", group.getUuid()
			).build();

			String childGroupsHREF = null;

			if (!childGroups.isEmpty()) {
				childGroupsHREF = PortletURLBuilder.create(
					siteItemSelectorViewDisplayContext.getPortletURL()
				).setParameter(
					"groupId", group.getGroupId()
				).buildString();
			}
			
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
if (
 displayStyle.equals("descriptive") ) {
              out.write("\n");
              out.write("\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(group.getLogoURL(themeDisplay, false)) ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-image
              com.liferay.taglib.ui.SearchContainerColumnImageTag _jspx_th_liferay$1ui_search$1container$1column$1image_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnImageTag.class) : new com.liferay.taglib.ui.SearchContainerColumnImageTag();
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.setSrc( group.getLogoURL(themeDisplay, false) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1image_0 = _jspx_th_liferay$1ui_search$1container$1column$1image_0.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1image_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1image_0);
                _jspx_th_liferay$1ui_search$1container$1column$1image_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1image_0);
              _jspx_th_liferay$1ui_search$1container$1column$1image_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t\t");
}
else {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-icon
              com.liferay.taglib.ui.SearchContainerColumnIconTag _jspx_th_liferay$1ui_search$1container$1column$1icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnIconTag.class) : new com.liferay.taglib.ui.SearchContainerColumnIconTag();
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.setIcon( group.getIconCssClass() );
              int _jspx_eval_liferay$1ui_search$1container$1column$1icon_0 = _jspx_th_liferay$1ui_search$1container$1column$1icon_0.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1icon_0);
                _jspx_th_liferay$1ui_search$1container$1column$1icon_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1icon_0);
              _jspx_th_liferay$1ui_search$1container$1column$1icon_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_0.setColspan( 2 );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_0 = _jspx_th_liferay$1ui_search$1container$1column$1text_0.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_0.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<h5>\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
if (
 group.isActive() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_0);
                  _jspx_th_aui_a_0.setCssClass("selector-button");
                  _jspx_th_aui_a_0.setData( data );
                  _jspx_th_aui_a_0.setHref("javascript:;");
                  int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
                  if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    out.print( HtmlUtil.escape(siteItemSelectorViewDisplayContext.getGroupName(group)) );
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
                    _jspx_th_aui_a_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
                  _jspx_th_aui_a_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
}
else {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t<span class=\"disabled selector-button text-muted\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_0);
                  _jspx_th_liferay$1ui_message_0.setArguments( HtmlUtil.escape(siteItemSelectorViewDisplayContext.getGroupName(group)) );
                  _jspx_th_liferay$1ui_message_0.setKey("x-inactive");
                  int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
                  if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
                    _jspx_th_liferay$1ui_message_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
                  _jspx_th_liferay$1ui_message_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
if (
 groupItemSelectorCriterion.isAllowNavigation() && group.isActive() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_1.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_0);
                  _jspx_th_aui_a_1.setHref( groupURLProvider.getGroupURL(group, liferayPortletRequest) );
                  _jspx_th_aui_a_1.setTarget("_blank");
                  int _jspx_eval_aui_a_1 = _jspx_th_aui_a_1.doStartTag();
                  if (_jspx_th_aui_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_1);
                    _jspx_th_aui_a_1.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_1);
                  _jspx_th_aui_a_1.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t</h5>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<h6 class=\"text-default\">\n");
                  out.write("\t\t\t\t\t\t\t<span>");
                  out.print( LanguageUtil.get(request, group.getScopeLabel(themeDisplay)) );
                  out.write("</span>\n");
                  out.write("\t\t\t\t\t\t</h6>\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
if (
 siteItemSelectorViewDisplayContext.isShowChildSitesLink() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t<h6>\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_2.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_0);
                  _jspx_th_aui_a_2.setCssClass( !childGroups.isEmpty() ? "text-default" : "disabled text-muted" );
                  _jspx_th_aui_a_2.setHref( childGroupsHREF );
                  int _jspx_eval_aui_a_2 = _jspx_th_aui_a_2.doStartTag();
                  if (_jspx_eval_aui_a_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                    //  liferay-ui:message
                    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_2);
                    _jspx_th_liferay$1ui_message_1.setArguments( String.valueOf(childGroups.size()) );
                    _jspx_th_liferay$1ui_message_1.setKey("x-child-sites");
                    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
                    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
                      _jspx_th_liferay$1ui_message_1.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
                    _jspx_th_liferay$1ui_message_1.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_aui_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_2);
                    _jspx_th_aui_a_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_2);
                  _jspx_th_aui_a_2.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t</h6>\n");
                  out.write("\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t");
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
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
}
else if (
 displayStyle.equals("icon") ) {
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");

					row.setCssClass("card-page-item card-page-item-directory " + row.getCssClass());

					Map<String, Object> linkData = HashMapBuilder.<String, Object>put(
						"prevent-selection", true
					).build();

					SiteVerticalCard siteVerticalCard = new SiteVerticalCard(group, liferayPortletRequest);
					
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_1 = _jspx_th_liferay$1ui_search$1container$1column$1text_1.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_1.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t<div class=\"card card-horizontal\">\n");
                  out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  clay:content-row
                  com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
                  _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
                  _jspx_th_clay_content$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_1);
                  _jspx_th_clay_content$1row_0.setCssClass("card-row");
                  int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
                  if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                    //  clay:content-col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                    _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
                    _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
                    int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
                    if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      //  clay:sticker
                      com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag _jspx_th_clay_sticker_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.StickerTag();
                      _jspx_th_clay_sticker_0.setPageContext(_jspx_page_context);
                      _jspx_th_clay_sticker_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
                      _jspx_th_clay_sticker_0.setDisplayType("secondary");
                      int _jspx_eval_clay_sticker_0 = _jspx_th_clay_sticker_0.doStartTag();
                      if (_jspx_eval_clay_sticker_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t");
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 Validator.isNotNull(siteVerticalCard.getImageSrc()) ) {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sticker-overlay\">\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"\" class=\"sticker-img\" src=\"");
                        out.print( siteVerticalCard.getImageSrc() );
                        out.write("\" />\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
}
else {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        //  clay:icon
                        com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
                        _jspx_th_clay_icon_0.setPageContext(_jspx_page_context);
                        _jspx_th_clay_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sticker_0);
                        _jspx_th_clay_icon_0.setSymbol( group.getIconCssClass() );
                        int _jspx_eval_clay_icon_0 = _jspx_th_clay_icon_0.doStartTag();
                        if (_jspx_th_clay_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
                          _jspx_th_clay_icon_0.release();
                          return;
                        }
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
                        _jspx_th_clay_icon_0.release();
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t");
                      }
                      if (_jspx_th_clay_sticker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
                        _jspx_th_clay_sticker_0.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sticker_0);
                      _jspx_th_clay_sticker_0.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
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
                    out.write("\t\t\t\t\t\t\t\t\t");
                    //  clay:content-col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                    _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
                    _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
                    _jspx_th_clay_content$1col_1.setExpand( true );
                    _jspx_th_clay_content$1col_1.setGutters( true );
                    int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
                    if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
if (
 group.isActive() ) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                      //  aui:a
                      com.liferay.taglib.aui.ATag _jspx_th_aui_a_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                      _jspx_th_aui_a_3.setPageContext(_jspx_page_context);
                      _jspx_th_aui_a_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                      _jspx_th_aui_a_3.setCssClass("card-title selector-button text-truncate");
                      _jspx_th_aui_a_3.setData( data );
                      _jspx_th_aui_a_3.setHref("javascript:;");
                      _jspx_th_aui_a_3.setTitle( siteVerticalCard.getSubtitle() );
                      int _jspx_eval_aui_a_3 = _jspx_th_aui_a_3.doStartTag();
                      if (_jspx_eval_aui_a_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                        out.print( siteVerticalCard.getTitle() );
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                      }
                      if (_jspx_th_aui_a_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_3);
                        _jspx_th_aui_a_3.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_3);
                      _jspx_th_aui_a_3.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
else {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"card-title disabled selector-button text-muted text-truncate\">\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                      //  liferay-ui:message
                      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                      _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
                      _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                      _jspx_th_liferay$1ui_message_2.setArguments( siteVerticalCard.getTitle() );
                      _jspx_th_liferay$1ui_message_2.setKey("x-inactive");
                      int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
                      if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                        _jspx_th_liferay$1ui_message_2.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
                      _jspx_th_liferay$1ui_message_2.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
}
                      out.write("\n");
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
if (
 siteItemSelectorViewDisplayContext.isShowChildSitesLink() ) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  aui:a
                      com.liferay.taglib.aui.ATag _jspx_th_aui_a_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                      _jspx_th_aui_a_4.setPageContext(_jspx_page_context);
                      _jspx_th_aui_a_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
                      _jspx_th_aui_a_4.setCssClass( "card-subtitle text-truncate " + (!childGroups.isEmpty() ? "text-default" : "text-muted") );
                      _jspx_th_aui_a_4.setData( linkData );
                      _jspx_th_aui_a_4.setHref( childGroupsHREF );
                      _jspx_th_aui_a_4.setTitle( siteVerticalCard.getSubtitle() );
                      int _jspx_eval_aui_a_4 = _jspx_th_aui_a_4.doStartTag();
                      if (_jspx_eval_aui_a_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                        out.print( siteVerticalCard.getSubtitle() );
                        out.write("\n");
                        out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      }
                      if (_jspx_th_aui_a_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_4);
                        _jspx_th_aui_a_4.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_4);
                      _jspx_th_aui_a_4.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
}
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                      _jspx_th_clay_content$1col_1.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                    _jspx_th_clay_content$1col_1.release();
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
if (
 groupItemSelectorCriterion.isAllowNavigation() && group.isActive() ) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    //  clay:content-col
                    com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
                    _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
                    _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
                    int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
                    if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  aui:a
                      com.liferay.taglib.aui.ATag _jspx_th_aui_a_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                      _jspx_th_aui_a_5.setPageContext(_jspx_page_context);
                      _jspx_th_aui_a_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_2);
                      _jspx_th_aui_a_5.setCssClass("btn btn-outline-borderless btn-outline-secondary");
                      _jspx_th_aui_a_5.setHref( siteVerticalCard.getHref() );
                      _jspx_th_aui_a_5.setTarget("_blank");
                      int _jspx_eval_aui_a_5 = _jspx_th_aui_a_5.doStartTag();
                      if (_jspx_th_aui_a_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_5);
                        _jspx_th_aui_a_5.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_5);
                      _jspx_th_aui_a_5.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_clay_content$1col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
                      _jspx_th_clay_content$1col_2.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
                    _jspx_th_clay_content$1col_2.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
}
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
                    _jspx_th_clay_content$1row_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
                  _jspx_th_clay_content$1row_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t");
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
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t\t");
}
else if (
 displayStyle.equals("list") ) {
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setName("name");
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.setTruncate( true );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_2 = _jspx_th_liferay$1ui_search$1container$1column$1text_2.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_2.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
if (
 group.isActive() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_6.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_2);
                  _jspx_th_aui_a_6.setCssClass("selector-button");
                  _jspx_th_aui_a_6.setData( data );
                  _jspx_th_aui_a_6.setHref("javascript:;");
                  int _jspx_eval_aui_a_6 = _jspx_th_aui_a_6.doStartTag();
                  if (_jspx_eval_aui_a_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                    out.print( HtmlUtil.escape(siteItemSelectorViewDisplayContext.getGroupName(group)) );
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_aui_a_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_6);
                    _jspx_th_aui_a_6.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_6);
                  _jspx_th_aui_a_6.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
}
else {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<span class=\"disabled selector-button text-muted\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  liferay-ui:message
                  com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                  _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_2);
                  _jspx_th_liferay$1ui_message_3.setArguments( HtmlUtil.escape(siteItemSelectorViewDisplayContext.getGroupName(group)) );
                  _jspx_th_liferay$1ui_message_3.setKey("x-inactive");
                  int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
                  if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
                    _jspx_th_liferay$1ui_message_3.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
                  _jspx_th_liferay$1ui_message_3.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t</span>\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
if (
 groupItemSelectorCriterion.isAllowNavigation() && group.isActive() ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_7.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_2);
                  _jspx_th_aui_a_7.setHref( groupURLProvider.getGroupURL(group, liferayPortletRequest) );
                  _jspx_th_aui_a_7.setTarget("_blank");
                  int _jspx_eval_aui_a_7 = _jspx_th_aui_a_7.doStartTag();
                  if (_jspx_th_aui_a_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_7);
                    _jspx_th_aui_a_7.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_7);
                  _jspx_th_aui_a_7.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1column$1text_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_2);
                _jspx_th_liferay$1ui_search$1container$1column$1text_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_2);
              _jspx_th_liferay$1ui_search$1container$1column$1text_2.release();
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
if (
 siteItemSelectorViewDisplayContext.isShowChildSitesLink() ) {
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setName("child-sites");
              _jspx_th_liferay$1ui_search$1container$1column$1text_3.setTruncate( true );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_3 = _jspx_th_liferay$1ui_search$1container$1column$1text_3.doStartTag();
              if (_jspx_eval_liferay$1ui_search$1container$1column$1text_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_liferay$1ui_search$1container$1column$1text_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_liferay$1ui_search$1container$1column$1text_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_liferay$1ui_search$1container$1column$1text_3.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  aui:a
                  com.liferay.taglib.aui.ATag _jspx_th_aui_a_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
                  _jspx_th_aui_a_8.setPageContext(_jspx_page_context);
                  _jspx_th_aui_a_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1column$1text_3);
                  _jspx_th_aui_a_8.setCssClass( !childGroups.isEmpty() ? "text-default" : "disabled text-muted" );
                  _jspx_th_aui_a_8.setHref( childGroupsHREF );
                  int _jspx_eval_aui_a_8 = _jspx_th_aui_a_8.doStartTag();
                  if (_jspx_eval_aui_a_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  liferay-ui:message
                    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
                    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_8);
                    _jspx_th_liferay$1ui_message_4.setArguments( String.valueOf(childGroups.size()) );
                    _jspx_th_liferay$1ui_message_4.setKey("x-child-sites");
                    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
                    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
                      _jspx_th_liferay$1ui_message_4.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
                    _jspx_th_liferay$1ui_message_4.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_aui_a_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_8);
                    _jspx_th_aui_a_8.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_8);
                  _jspx_th_aui_a_8.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
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
              out.write("\t\t\t\t\t");
}
              out.write("\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
              //  liferay-ui:search-container-column-text
              com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setPageContext(_jspx_page_context);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setName("type");
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.setValue( LanguageUtil.get(request, group.getScopeLabel(themeDisplay)) );
              int _jspx_eval_liferay$1ui_search$1container$1column$1text_4 = _jspx_th_liferay$1ui_search$1container$1column$1text_4.doStartTag();
              if (_jspx_th_liferay$1ui_search$1container$1column$1text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_4);
                _jspx_th_liferay$1ui_search$1container$1column$1text_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_4);
              _jspx_th_liferay$1ui_search$1container$1column$1text_4.release();
              out.write("\n");
              out.write("\t\t\t\t");
              out.write("\n");
              out.write("\t\t\t");
}
              out.write("\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1row_0.doAfterBody();
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              group = (com.liferay.portal.kernel.model.Group) _jspx_page_context.findAttribute("group");
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
          out.write("\t\t");
          //  liferay-ui:search-iterator
          com.liferay.taglib.ui.SearchIteratorTag _jspx_th_liferay$1ui_search$1iterator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchIteratorTag.class) : new com.liferay.taglib.ui.SearchIteratorTag();
          _jspx_th_liferay$1ui_search$1iterator_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_search$1iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1iterator_0.setDisplayStyle( displayStyle );
          _jspx_th_liferay$1ui_search$1iterator_0.setMarkupView("lexicon");
          int _jspx_eval_liferay$1ui_search$1iterator_0 = _jspx_th_liferay$1ui_search$1iterator_0.doStartTag();
          if (_jspx_th_liferay$1ui_search$1iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
            _jspx_th_liferay$1ui_search$1iterator_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
          _jspx_th_liferay$1ui_search$1iterator_0.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_liferay$1ui_search$1container_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
          _jspx_th_liferay$1ui_search$1container_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
        _jspx_th_liferay$1ui_search$1container_0.release();
        out.write('\n');
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
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
}
