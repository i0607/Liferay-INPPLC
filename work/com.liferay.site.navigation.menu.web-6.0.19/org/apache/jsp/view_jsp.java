package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.item.selector.constants.ItemSelectorPortletKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.theme.NavItem;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.site.navigation.constants.SiteNavigationConstants;
import com.liferay.site.navigation.menu.web.internal.constants.SiteNavigationMenuWebKeys;
import com.liferay.site.navigation.menu.web.internal.display.context.SiteNavigationMenuDisplayContext;
import com.liferay.site.navigation.model.SiteNavigationMenu;
import com.liferay.site.navigation.model.SiteNavigationMenuItem;
import com.liferay.site.navigation.service.SiteNavigationMenuItemLocalServiceUtil;
import com.liferay.site.navigation.service.SiteNavigationMenuLocalServiceUtil;
import com.liferay.site.navigation.type.SiteNavigationMenuItemType;
import com.liferay.site.navigation.type.SiteNavigationMenuItemTypeRegistry;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-site-navigation.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-template.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/init-ext.jsp");
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

String portletResource = ParamUtil.getString(request, "portletResource");

SiteNavigationMenuDisplayContext siteNavigationMenuDisplayContext = new SiteNavigationMenuDisplayContext(request);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuId() > 0 ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		SiteNavigationMenu siteNavigationMenu = SiteNavigationMenuLocalServiceUtil.fetchSiteNavigationMenu(siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuId());
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 siteNavigationMenu != null ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-site-navigation:navigation-menu
      com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag _jspx_th_liferay$1site$1navigation_navigation$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag.class) : new com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag();
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setParent(null);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setDdmTemplateGroupId( siteNavigationMenuDisplayContext.getDisplayStyleGroupId() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setDdmTemplateKey( siteNavigationMenuDisplayContext.getDDMTemplateKey() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setDisplayDepth( siteNavigationMenuDisplayContext.getDisplayDepth() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setExpandedLevels( siteNavigationMenuDisplayContext.getExpandedLevels() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setPreview( siteNavigationMenuDisplayContext.isPreview() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setRootItemId( siteNavigationMenuDisplayContext.getRootMenuItemId() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setRootItemLevel( siteNavigationMenuDisplayContext.getRootMenuItemLevel() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setRootItemType( siteNavigationMenuDisplayContext.getRootMenuItemType() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.setSiteNavigationMenuId( siteNavigationMenu.getSiteNavigationMenuId() );
      int _jspx_eval_liferay$1site$1navigation_navigation$1menu_0 = _jspx_th_liferay$1site$1navigation_navigation$1menu_0.doStartTag();
      if (_jspx_th_liferay$1site$1navigation_navigation$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_navigation$1menu_0);
        _jspx_th_liferay$1site$1navigation_navigation$1menu_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_navigation$1menu_0);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_0.release();
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else if (
 (siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PRIVATE_PAGES_HIERARCHY) || (siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PUBLIC_PAGES_HIERARCHY) ) {
      out.write("\n");
      out.write("\t\t");
      //  liferay-site-navigation:navigation-menu
      com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag _jspx_th_liferay$1site$1navigation_navigation$1menu_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag.class) : new com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag();
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setParent(null);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setDdmTemplateGroupId( siteNavigationMenuDisplayContext.getDisplayStyleGroupId() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setDdmTemplateKey( siteNavigationMenuDisplayContext.getDDMTemplateKey() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setDisplayDepth( siteNavigationMenuDisplayContext.getDisplayDepth() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setExpandedLevels( siteNavigationMenuDisplayContext.getExpandedLevels() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setPreview( siteNavigationMenuDisplayContext.isPreview() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setRootItemId( siteNavigationMenuDisplayContext.getRootMenuItemId() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setRootItemLevel( siteNavigationMenuDisplayContext.getRootMenuItemLevel() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setRootItemType( siteNavigationMenuDisplayContext.getRootMenuItemType() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.setSiteNavigationMenuId( 0 );
      int _jspx_eval_liferay$1site$1navigation_navigation$1menu_1 = _jspx_th_liferay$1site$1navigation_navigation$1menu_1.doStartTag();
      if (_jspx_th_liferay$1site$1navigation_navigation$1menu_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_navigation$1menu_1);
        _jspx_th_liferay$1site$1navigation_navigation$1menu_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_navigation$1menu_1);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_1.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else if (
 (siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_PRIMARY) || (siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_SECONDARY) || (siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType() == SiteNavigationConstants.TYPE_SOCIAL) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		SiteNavigationMenu siteNavigationMenu = SiteNavigationMenuLocalServiceUtil.fetchSiteNavigationMenu(themeDisplay.getScopeGroupId(), siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuType());
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 siteNavigationMenu != null ) {
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-site-navigation:navigation-menu
      com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag _jspx_th_liferay$1site$1navigation_navigation$1menu_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag.class) : new com.liferay.site.navigation.taglib.servlet.taglib.NavigationMenuTag();
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setParent(null);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setDdmTemplateGroupId( siteNavigationMenuDisplayContext.getDisplayStyleGroupId() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setDdmTemplateKey( siteNavigationMenuDisplayContext.getDDMTemplateKey() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setDisplayDepth( siteNavigationMenuDisplayContext.getDisplayDepth() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setExpandedLevels( siteNavigationMenuDisplayContext.getExpandedLevels() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setPreview( siteNavigationMenuDisplayContext.isPreview() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setRootItemId( siteNavigationMenuDisplayContext.getRootMenuItemId() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setRootItemLevel( siteNavigationMenuDisplayContext.getRootMenuItemLevel() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setRootItemType( siteNavigationMenuDisplayContext.getRootMenuItemType() );
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.setSiteNavigationMenuId( siteNavigationMenu.getSiteNavigationMenuId() );
      int _jspx_eval_liferay$1site$1navigation_navigation$1menu_2 = _jspx_th_liferay$1site$1navigation_navigation$1menu_2.doStartTag();
      if (_jspx_th_liferay$1site$1navigation_navigation$1menu_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_navigation$1menu_2);
        _jspx_th_liferay$1site$1navigation_navigation$1menu_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1site$1navigation_navigation$1menu_2);
      _jspx_th_liferay$1site$1navigation_navigation$1menu_2.release();
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_1.setParent(null);
      _jspx_th_liferay$1ui_message_1.setArguments( siteNavigationMenuDisplayContext.getSelectSiteNavigationMenuTypeLabel() );
      _jspx_th_liferay$1ui_message_1.setKey("there-is-no-x-available-for-the-current-site");
      int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
      if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
        _jspx_th_liferay$1ui_message_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t<div class=\"alert alert-info text-center\">\n");
      out.write("\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
      _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_0.setParent(null);
      _jspx_th_aui_a_0.setHref("javascript:;");
      _jspx_th_aui_a_0.setOnClick( portletDisplay.getURLConfigurationJS() );
      int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
      if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_a_0, _jspx_page_context))
          return;
      }
      if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
        _jspx_th_aui_a_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
      _jspx_th_aui_a_0.release();
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      out.write('\n');
}
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("the-selected-menu-does-not-exist");
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_0);
    _jspx_th_liferay$1ui_message_2.setKey("configure");
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
}
