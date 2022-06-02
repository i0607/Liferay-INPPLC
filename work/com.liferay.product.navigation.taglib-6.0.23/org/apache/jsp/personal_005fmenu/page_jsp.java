package org.apache.jsp.personal_005fmenu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.product.navigation.control.menu.ProductNavigationControlMenuCategory;
import com.liferay.product.navigation.control.menu.ProductNavigationControlMenuEntry;
import com.liferay.product.navigation.control.menu.util.ProductNavigationControlMenuEntryRegistry;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.List;
import java.util.Map;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.product.navigation.personal.menu.constants.PersonalMenuPortletKeys;
import javax.portlet.PortletRequest;
import javax.portlet.ResourceURL;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/personal_menu/init.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

String namespace = StringUtil.randomId() + StringPool.UNDERLINE;

long color = (long)request.getAttribute("liferay-product-navigation:personal-menu:color");
String label = (String)request.getAttribute("liferay-product-navigation:personal-menu:label");
String size = (String)request.getAttribute("liferay-product-navigation:personal-menu:size");
User user2 = (User)request.getAttribute("liferay-product-navigation:personal-menu:user");

String userStickerCssClasses = "sticker";

if (size != null) {
	userStickerCssClasses += " sticker-" + size;
}

String impersonateStickerCssClasses = "sticker";

if (size != null) {
	impersonateStickerCssClasses += " sticker-sm";
}

      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.dropdown-menu-personal-menu {\n");
      out.write("\t\tmax-height: none;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.dropdown-menu-personal-menu .dropdown-item-indicator {\n");
      out.write("\t\tpadding-right: 0.5rem;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tdiv.personal-menu-dropdown .btn {\n");
      out.write("\t\tborder-radius: 5000px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tdiv.personal-menu-dropdown .dropdown-item {\n");
      out.write("\t\tcolor: #6B6C7E;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"personal-menu-dropdown\" id=\"");
      out.print( namespace );
      out.write("personal_menu_dropdown\">\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 Validator.isNotNull(label) ) {
      out.write("\n");
      out.write("\t\t\t<div>");
      out.print( label );
      out.write("</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t<button aria-expanded=\"true\" aria-haspopup=\"true\" class=\"btn btn-unstyled dropdown-toggle\" id=\"");
      out.print( namespace );
      out.write("personal_menu_dropdown_toggle\" ref=\"triggerButton\" type=\"button\">\n");
      out.write("\t\t\t\t<span class=\"");
      out.print( userStickerCssClasses );
      out.write("\">\n");
      out.write("\t\t\t\t\t");
      //  liferay-ui:user-portrait
      com.liferay.taglib.ui.UserPortraitTag _jspx_th_liferay$1ui_user$1portrait_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.UserPortraitTag.class) : new com.liferay.taglib.ui.UserPortraitTag();
      _jspx_th_liferay$1ui_user$1portrait_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_user$1portrait_0.setParent(null);
      _jspx_th_liferay$1ui_user$1portrait_0.setCssClass("sticker-user-icon");
      _jspx_th_liferay$1ui_user$1portrait_0.setSize( size );
      _jspx_th_liferay$1ui_user$1portrait_0.setUser( user2 );
      int _jspx_eval_liferay$1ui_user$1portrait_0 = _jspx_th_liferay$1ui_user$1portrait_0.doStartTag();
      if (_jspx_th_liferay$1ui_user$1portrait_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
        _jspx_th_liferay$1ui_user$1portrait_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_user$1portrait_0);
      _jspx_th_liferay$1ui_user$1portrait_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 themeDisplay.isImpersonated() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"");
      out.print( impersonateStickerCssClasses );
      out.write(" sticker-bottom-right sticker-circle sticker-outside sticker-user-icon\" id=\"impersonate-user-sticker\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sticker-overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_aui_icon_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("\n");
      out.write("\t");

	ResourceURL resourceURL = PortletURLFactoryUtil.create(request, PersonalMenuPortletKeys.PERSONAL_MENU, PortletRequest.RESOURCE_PHASE);

	resourceURL.setParameter("currentURL", themeDisplay.getURLCurrent());
	resourceURL.setParameter("portletId", themeDisplay.getPpid());
	resourceURL.setResourceID("/product_navigation_personal_menu/get_personal_menu_items");

	Map<String, Object> props = HashMapBuilder.<String, Object>put(
		"color", color
	).put(
		"isImpersonated", themeDisplay.isImpersonated()
	).put(
		"itemsURL", resourceURL.toString()
	).put(
		"label", label
	).put(
		"size", size
	).build();

	if (user2.getPortraitId() > 0) {
		props.put("userPortraitURL", user2.getPortraitURL(themeDisplay));
	}
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_0.setPageContext(_jspx_page_context);
      _jspx_th_react_component_0.setParent(null);
      _jspx_th_react_component_0.setModule("personal_menu/js/PersonalMenu.es");
      _jspx_th_react_component_0.setProps( props );
      int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
      if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
      _jspx_th_react_component_0.release();
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

  private boolean _jspx_meth_aui_icon_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
    _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_0.setParent(null);
    _jspx_th_aui_icon_0.setId("impersonate-user-icon");
    _jspx_th_aui_icon_0.setImage("user");
    _jspx_th_aui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
    if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
      _jspx_th_aui_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
    _jspx_th_aui_icon_0.release();
    return false;
  }
}
