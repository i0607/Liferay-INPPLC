package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.product.navigation.personal.menu.util.PersonalApplicationURLUtil;
import com.liferay.product.navigation.user.personal.bar.web.internal.constants.ProductNavigationUserPersonalBarWebKeys;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-product-navigation.tld");
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
      out.write('	');
if (
 themeDisplay.isSignedIn() ) {
      out.write("\n");
      out.write("\t\t<span class=\"user-avatar-link\">\n");
      out.write("\t\t\t");
      //  liferay-product-navigation:personal-menu
      com.liferay.product.navigation.taglib.servlet.taglib.ProductNavigationPersonalMenuTag _jspx_th_liferay$1product$1navigation_personal$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.product.navigation.taglib.servlet.taglib.ProductNavigationPersonalMenuTag.class) : new com.liferay.product.navigation.taglib.servlet.taglib.ProductNavigationPersonalMenuTag();
      _jspx_th_liferay$1product$1navigation_personal$1menu_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1product$1navigation_personal$1menu_0.setParent(null);
      _jspx_th_liferay$1product$1navigation_personal$1menu_0.setSize("lg");
      _jspx_th_liferay$1product$1navigation_personal$1menu_0.setUser( user );
      int _jspx_eval_liferay$1product$1navigation_personal$1menu_0 = _jspx_th_liferay$1product$1navigation_personal$1menu_0.doStartTag();
      if (_jspx_th_liferay$1product$1navigation_personal$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1product$1navigation_personal$1menu_0);
        _jspx_th_liferay$1product$1navigation_personal$1menu_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1product$1navigation_personal$1menu_0);
      _jspx_th_liferay$1product$1navigation_personal$1menu_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");

			int notificationsCount = GetterUtil.getInteger(request.getAttribute(ProductNavigationUserPersonalBarWebKeys.NOTIFICATIONS_COUNT));
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 notificationsCount > 0 ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				String notificaitonsPortletId = PortletProviderUtil.getPortletId(UserNotificationEvent.class.getName(), PortletProvider.Action.VIEW);

				String notificationsURL = PersonalApplicationURLUtil.getPersonalApplicationURL(request, notificaitonsPortletId);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
      _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_0.setParent(null);
      _jspx_th_aui_a_0.setHref( (notificationsURL != null) ? notificationsURL : null );
      int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
      if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:badge
        com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag _jspx_th_clay_badge_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag();
        _jspx_th_clay_badge_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_badge_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_0);
        _jspx_th_clay_badge_0.setCssClass("panel-notifications-count");
        _jspx_th_clay_badge_0.setDisplayType("danger");
        _jspx_th_clay_badge_0.setLabel( String.valueOf(notificationsCount) );
        int _jspx_eval_clay_badge_0 = _jspx_th_clay_badge_0.doStartTag();
        if (_jspx_th_clay_badge_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_0);
          _jspx_th_clay_badge_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_0);
        _jspx_th_clay_badge_0.release();
        out.write("\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
        _jspx_th_aui_a_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
      _jspx_th_aui_a_0.release();
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</span>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else if (
 themeDisplay.isShowSignInIcon() ) {
      out.write("\n");
      out.write("\t\t<span class=\"sign-in text-default\" role=\"presentation\">\n");
      out.write("\t\t\t");
      //  aui:icon
      com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
      _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_icon_0.setParent(null);
      _jspx_th_aui_icon_0.setCssClass("sign-in text-default");
      _jspx_th_aui_icon_0.setData(
					HashMapBuilder.<String, Object>put(
						"redirect", String.valueOf(PortalUtil.isLoginRedirectRequired(request))
					).build()
				);
      _jspx_th_aui_icon_0.setImage("user");
      _jspx_th_aui_icon_0.setLabel("sign-in");
      _jspx_th_aui_icon_0.setMarkupView("lexicon");
      _jspx_th_aui_icon_0.setUrl( themeDisplay.getURLSignIn() );
      int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
      if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
        _jspx_th_aui_icon_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
      _jspx_th_aui_icon_0.release();
      out.write("\n");
      out.write("\t\t</span>\n");
      out.write("\n");
      out.write("\t\t");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setSandbox( true );
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\tvar signInLink = document.querySelector('.sign-in > a');\n");
          out.write("\n");
          out.write("\t\t\tif (signInLink && signInLink.dataset.redirect === 'false') {\n");
          out.write("\t\t\t\tvar signInURL = '");
          out.print( themeDisplay.getURLSignIn() );
          out.write("';\n");
          out.write("\n");
          out.write("\t\t\t\tvar modalSignInURL = Liferay.Util.addParams(\n");
          out.write("\t\t\t\t\t'windowState=exclusive',\n");
          out.write("\t\t\t\t\tsignInURL\n");
          out.write("\t\t\t\t);\n");
          out.write("\n");
          out.write("\t\t\t\tvar setModalContent = function (html) {\n");
          out.write("\t\t\t\t\tvar modalBody = document.querySelector('.liferay-modal-body');\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (modalBody) {\n");
          out.write("\t\t\t\t\t\tvar fragment = document\n");
          out.write("\t\t\t\t\t\t\t.createRange()\n");
          out.write("\t\t\t\t\t\t\t.createContextualFragment(html);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tmodalBody.innerHTML = '';\n");
          out.write("\n");
          out.write("\t\t\t\t\t\tmodalBody.appendChild(fragment);\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\t\tvar loading = false;\n");
          out.write("\t\t\t\tvar redirect = false;\n");
          out.write("\t\t\t\tvar html = '';\n");
          out.write("\t\t\t\tvar modalOpen = false;\n");
          out.write("\n");
          out.write("\t\t\t\tvar fetchModalSignIn = function () {\n");
          out.write("\t\t\t\t\tif (loading || html) {\n");
          out.write("\t\t\t\t\t\treturn;\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\tloading = true;\n");
          out.write("\n");
          out.write("\t\t\t\t\tLiferay.Util.fetch(modalSignInURL)\n");
          out.write("\t\t\t\t\t\t.then((response) => {\n");
          out.write("\t\t\t\t\t\t\treturn response.text();\n");
          out.write("\t\t\t\t\t\t})\n");
          out.write("\t\t\t\t\t\t.then((response) => {\n");
          out.write("\t\t\t\t\t\t\tif (!loading) {\n");
          out.write("\t\t\t\t\t\t\t\treturn;\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tloading = false;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tif (!response) {\n");
          out.write("\t\t\t\t\t\t\t\tredirect = true;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\treturn;\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\thtml = response;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tif (modalOpen) {\n");
          out.write("\t\t\t\t\t\t\t\tsetModalContent(response);\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t})\n");
          out.write("\t\t\t\t\t\t.catch(() => {\n");
          out.write("\t\t\t\t\t\t\tredirect = true;\n");
          out.write("\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\t\tsignInLink.addEventListener('mouseover', fetchModalSignIn);\n");
          out.write("\t\t\t\tsignInLink.addEventListener('focus', fetchModalSignIn);\n");
          out.write("\n");
          out.write("\t\t\t\tsignInLink.addEventListener('click', (event) => {\n");
          out.write("\t\t\t\t\tevent.preventDefault();\n");
          out.write("\n");
          out.write("\t\t\t\t\tif (redirect) {\n");
          out.write("\t\t\t\t\t\tLiferay.Util.navigate(signInURL);\n");
          out.write("\n");
          out.write("\t\t\t\t\t\treturn;\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\tLiferay.Util.openModal({\n");
          out.write("\t\t\t\t\t\tbodyHTML: html ? html : '<span class=\"loading-animation\">',\n");
          out.write("\t\t\t\t\t\tcontainerProps: {\n");
          out.write("\t\t\t\t\t\t\tclassName: '',\n");
          out.write("\t\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t\theight: '400px',\n");
          out.write("\t\t\t\t\t\tonClose: function () {\n");
          out.write("\t\t\t\t\t\t\tloading = false;\n");
          out.write("\t\t\t\t\t\t\tredirect = false;\n");
          out.write("\t\t\t\t\t\t\thtml = '';\n");
          out.write("\t\t\t\t\t\t\tmodalOpen = false;\n");
          out.write("\t\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t\tonOpen: function () {\n");
          out.write("\t\t\t\t\t\t\tmodalOpen = true;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tif (html && document.querySelector('.loading-animation')) {\n");
          out.write("\t\t\t\t\t\t\t\tsetModalContent(html);\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t\tsize: 'md',\n");
          out.write("\t\t\t\t\t\ttitle: '");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("\t\t\t\t\t});\n");
          out.write("\t\t\t\t});\n");
          out.write("\t\t\t}\n");
          out.write("\t\t");
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
      out.write('\n');
      out.write('	');
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    _jspx_th_liferay$1ui_message_0.setKey("sign-in");
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
}
