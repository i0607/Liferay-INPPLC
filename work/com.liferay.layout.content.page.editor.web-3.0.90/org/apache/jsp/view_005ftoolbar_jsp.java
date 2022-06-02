package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.layout.content.page.editor.web.internal.constants.ContentPageEditorWebKeys;
import com.liferay.layout.content.page.editor.web.internal.display.context.ContentPageEditorDisplayContext;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

public final class view_005ftoolbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/init.jsp");
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

ContentPageEditorDisplayContext contentPageEditorDisplayContext = (ContentPageEditorDisplayContext)request.getAttribute(ContentPageEditorWebKeys.LIFERAY_SHARED_CONTENT_PAGE_EDITOR_DISPLAY_CONTEXT);

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"management-bar navbar navbar-expand-md page-editor__toolbar ");
      out.print( contentPageEditorDisplayContext.isMasterLayout() ? "page-editor__toolbar--master-layout" : StringPool.BLANK );
      out.write("\" id=\"");
      out.print( contentPageEditorDisplayContext.getPortletNamespace() );
      out.write("pageEditorToolbar\">\n");
      out.write("\t");
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t<ul class=\"navbar-nav start\">\n");
        out.write("\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t<div class=\"dropdown\">\n");
        out.write("\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_0.setCssClass("dropdown-toggle");
        _jspx_th_clay_button_0.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_0.setDisplayType("secondary");
        _jspx_th_clay_button_0.setIcon("en-us");
        _jspx_th_clay_button_0.setMonospaced( true );
        _jspx_th_clay_button_0.setSmall( true );
        int _jspx_eval_clay_button_0 = _jspx_th_clay_button_0.doStartTag();
        if (_jspx_th_clay_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
          _jspx_th_clay_button_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_0);
        _jspx_th_clay_button_0.release();
        out.write("\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t</ul>\n");
        out.write("\n");
        out.write("\t\t<ul class=\"middle navbar-nav\">\n");
        out.write("\t\t\t<li class=\"nav-item\"></li>\n");
        out.write("\t\t</ul>\n");
        out.write("\n");
        out.write("\t\t<ul class=\"end navbar-nav\">\n");
        out.write("\t\t\t<li class=\"nav-item\"></li>\n");
        out.write("\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t<div class=\"btn-group flex-nowrap\" role=\"group\">\n");
        out.write("\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_1.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_1.setDisplayType("secondary");
        _jspx_th_clay_button_1.setIcon("undo");
        _jspx_th_clay_button_1.setMonospaced( true );
        _jspx_th_clay_button_1.setSmall( true );
        _jspx_th_clay_button_1.setDynamicAttribute(null, "title",  LanguageUtil.get(request, "undo") );
        int _jspx_eval_clay_button_1 = _jspx_th_clay_button_1.doStartTag();
        if (_jspx_th_clay_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
          _jspx_th_clay_button_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_1);
        _jspx_th_clay_button_1.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_2.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_2.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_2.setDisplayType("secondary");
        _jspx_th_clay_button_2.setIcon("redo");
        _jspx_th_clay_button_2.setMonospaced( true );
        _jspx_th_clay_button_2.setSmall( true );
        _jspx_th_clay_button_2.setDynamicAttribute(null, "title",  LanguageUtil.get(request, "redo") );
        int _jspx_eval_clay_button_2 = _jspx_th_clay_button_2.doStartTag();
        if (_jspx_th_clay_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_2);
          _jspx_th_clay_button_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_2);
        _jspx_th_clay_button_2.release();
        out.write("\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t<span class=\"d-none d-sm-block\">\n");
        out.write("\t\t\t\t\t<div class=\"dropdown ml-2\">\n");
        out.write("\t\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_3.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_3.setCssClass("dropdown-toggle");
        _jspx_th_clay_button_3.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_3.setDisplayType("secondary");
        _jspx_th_clay_button_3.setIcon("time");
        _jspx_th_clay_button_3.setMonospaced( true );
        _jspx_th_clay_button_3.setSmall( true );
        _jspx_th_clay_button_3.setDynamicAttribute(null, "title",  LanguageUtil.get(request, "history") );
        int _jspx_eval_clay_button_3 = _jspx_th_clay_button_3.doStartTag();
        if (_jspx_th_clay_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_3);
          _jspx_th_clay_button_3.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_3);
        _jspx_th_clay_button_3.release();
        out.write("\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t</span>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t<div class=\"dropdown\">\n");
        out.write("\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_4.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_4.setCssClass("dropdown-toggle form-control-select page-editor__edit-mode-selector text-left");
        _jspx_th_clay_button_4.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_4.setDisplayType("secondary");
        _jspx_th_clay_button_4.setSmall( true );
        int _jspx_eval_clay_button_4 = _jspx_th_clay_button_4.doStartTag();
        if (_jspx_eval_clay_button_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_4, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t");
        }
        if (_jspx_th_clay_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_4);
          _jspx_th_clay_button_4.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_4);
        _jspx_th_clay_button_4.release();
        out.write("\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t<ul class=\"navbar-nav\">\n");
        out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_5.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_5.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_5.setDisplayType("secondary");
        _jspx_th_clay_button_5.setIcon("view");
        _jspx_th_clay_button_5.setMonospaced( true );
        _jspx_th_clay_button_5.setSmall( true );
        _jspx_th_clay_button_5.setDynamicAttribute(null, "title",  LanguageUtil.get(request, "view") );
        int _jspx_eval_clay_button_5 = _jspx_th_clay_button_5.doStartTag();
        if (_jspx_th_clay_button_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_5);
          _jspx_th_clay_button_5.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_5);
        _jspx_th_clay_button_5.release();
        out.write("\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("\n");
        out.write("\t\t\t\t\t");
if (
 contentPageEditorDisplayContext.isContentLayout() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_6.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_6.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_6.setDisplayType("secondary");
        _jspx_th_clay_button_6.setIcon("page-template");
        _jspx_th_clay_button_6.setMonospaced( true );
        _jspx_th_clay_button_6.setSmall( true );
        _jspx_th_clay_button_6.setDynamicAttribute(null, "title",  LanguageUtil.get(request, "create-page-template") );
        int _jspx_eval_clay_button_6 = _jspx_th_clay_button_6.doStartTag();
        if (_jspx_th_clay_button_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_6);
          _jspx_th_clay_button_6.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_6);
        _jspx_th_clay_button_6.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</li>\n");
        out.write("\n");
        out.write("\t\t\t");
if (
 contentPageEditorDisplayContext.isSingleSegmentsExperienceMode() ) {
        out.write("\n");
        out.write("\t\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_7.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_7.setCssClass("mr-3");
        _jspx_th_clay_button_7.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_7.setDisplayType("secondary");
        _jspx_th_clay_button_7.setSmall( true );
        int _jspx_eval_clay_button_7 = _jspx_th_clay_button_7.doStartTag();
        if (_jspx_eval_clay_button_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_7, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t");
        }
        if (_jspx_th_clay_button_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_7);
          _jspx_th_clay_button_7.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_7);
        _jspx_th_clay_button_7.release();
        out.write("\n");
        out.write("\t\t\t\t</li>\n");
        out.write("\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t<li class=\"nav-item\">\n");
        out.write("\t\t\t\t");
        //  clay:button
        com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag _jspx_th_clay_button_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ButtonTag();
        _jspx_th_clay_button_8.setPageContext(_jspx_page_context);
        _jspx_th_clay_button_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_button_8.setDynamicAttribute(null, "disabled",  true );
        _jspx_th_clay_button_8.setDisplayType("primary");
        _jspx_th_clay_button_8.setSmall( true );
        int _jspx_eval_clay_button_8 = _jspx_th_clay_button_8.doStartTag();
        if (_jspx_eval_clay_button_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
if (
 contentPageEditorDisplayContext.isMasterLayout() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_8, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
else if (
 contentPageEditorDisplayContext.isSingleSegmentsExperienceMode() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_8, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
else if (
 contentPageEditorDisplayContext.isWorkflowEnabled() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_8, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_button_8, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t");
        }
        if (_jspx_th_clay_button_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_8);
          _jspx_th_clay_button_8.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_button_8);
        _jspx_th_clay_button_8.release();
        out.write("\n");
        out.write("\t\t\t</li>\n");
        out.write("\t\t</ul>\n");
        out.write("\t");
      }
      if (_jspx_th_clay_container$1fluid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_container$1fluid_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_0);
      _jspx_th_clay_container$1fluid_0.release();
      out.write("\n");
      out.write("</div>");
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_4);
    _jspx_th_liferay$1ui_message_0.setKey("page-design");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_7);
    _jspx_th_liferay$1ui_message_1.setKey("discard-variant");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_8);
    _jspx_th_liferay$1ui_message_2.setKey("publish-master");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
    _jspx_th_liferay$1ui_message_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_8);
    _jspx_th_liferay$1ui_message_3.setKey("save-variant");
    int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
    if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
      _jspx_th_liferay$1ui_message_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
    _jspx_th_liferay$1ui_message_3.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_8);
    _jspx_th_liferay$1ui_message_4.setKey("submit-for-publication");
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

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_button_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_button_8);
    _jspx_th_liferay$1ui_message_5.setKey("publish");
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
}
