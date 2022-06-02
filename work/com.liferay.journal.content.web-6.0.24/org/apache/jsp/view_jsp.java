package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.AssetRendererFactoryRegistryUtil;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.model.DDMTemplate;
import com.liferay.journal.constants.JournalContentPortletKeys;
import com.liferay.journal.content.asset.addon.entry.ContentMetadataAssetAddonEntry;
import com.liferay.journal.content.asset.addon.entry.UserToolAssetAddonEntry;
import com.liferay.journal.content.web.internal.display.context.JournalContentDisplayContext;
import com.liferay.journal.content.web.internal.servlet.taglib.clay.JournalArticleVerticalCard;
import com.liferay.journal.content.web.internal.servlet.taglib.clay.JournalDDMTemplateVerticalCard;
import com.liferay.journal.exception.NoSuchArticleException;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.petra.portlet.url.builder.PortletURLBuilder;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.AUIUtil;
import java.text.Format;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.portlet.WindowState;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(13);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-asset.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-journal.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
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

JournalContentDisplayContext journalContentDisplayContext = (JournalContentDisplayContext)request.getAttribute(JournalContentDisplayContext.getRequestAttributeName(portletDisplay.getId()));

Format dateFormatDateTime = FastDateFormatFactoryUtil.getDateTime(locale, timeZone);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1util_dynamic$1include_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');

JournalArticle article = journalContentDisplayContext.getArticle();
JournalArticleDisplay articleDisplay = journalContentDisplayContext.getArticleDisplay();

journalContentDisplayContext.incrementViewCounter();

AssetRendererFactory<JournalArticle> assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClass(JournalArticle.class);

if (journalContentDisplayContext.isShowArticle()) {
	renderResponse.setTitle(articleDisplay.getTitle());
}

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 article == null ) {
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNull(journalContentDisplayContext.getArticleId()) ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-info text-center\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 journalContentDisplayContext.isShowSelectArticleLink() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
      _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_0.setParent(null);
      _jspx_th_aui_a_0.setHref("javascript:;");
      _jspx_th_aui_a_0.setOnClick( portletDisplay.getURLConfigurationJS() );
      int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
      if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_a_0, _jspx_page_context))
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
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				JournalArticle selectedArticle = journalContentDisplayContext.getSelectedArticle();
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-warning text-center\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 (selectedArticle != null) && selectedArticle.isInTrash() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_2.setParent(null);
      _jspx_th_liferay$1ui_message_2.setArguments( HtmlUtil.escape(selectedArticle.getTitle(locale)) );
      _jspx_th_liferay$1ui_message_2.setKey("the-web-content-article-x-was-moved-to-the-recycle-bin");
      int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
      if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
        _jspx_th_liferay$1ui_message_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else if (
 (selectedArticle != null) && (selectedArticle.getDDMStructure() == null) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_3.setParent(null);
      _jspx_th_liferay$1ui_message_3.setArguments( HtmlUtil.escape(selectedArticle.getTitle(locale)) );
      _jspx_th_liferay$1ui_message_3.setKey("is-temporarily-unavailable");
      int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
      if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
        _jspx_th_liferay$1ui_message_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
      _jspx_th_liferay$1ui_message_3.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 journalContentDisplayContext.isShowSelectArticleLink() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
      _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_0.setParent(null);
      _jspx_th_liferay$1util_buffer_0.setVar("selectJournalArticleLink");
      int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  aui:a
          com.liferay.taglib.aui.ATag _jspx_th_aui_a_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
          _jspx_th_aui_a_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_a_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_0);
          _jspx_th_aui_a_1.setHref("javascript:;");
          _jspx_th_aui_a_1.setLabel("select-another");
          _jspx_th_aui_a_1.setOnClick( portletDisplay.getURLConfigurationJS() );
          int _jspx_eval_aui_a_1 = _jspx_th_aui_a_1.doStartTag();
          if (_jspx_th_aui_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_1);
            _jspx_th_aui_a_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_1);
          _jspx_th_aui_a_1.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t");
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
      java.lang.String selectJournalArticleLink = null;
      selectJournalArticleLink = (java.lang.String) _jspx_page_context.findAttribute("selectJournalArticleLink");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
if (
 journalContentDisplayContext.hasRestorePermission() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									AssetRenderer<JournalArticle> assetRenderer = assetRendererFactory.getAssetRenderer(selectedArticle, 0);
									
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("restoreJournalArticle");
      _jspx_th_portlet_actionURL_0.setVar("restoreJournalArticleURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_0.setName("classPK");
        _jspx_th_portlet_param_0.setValue( String.valueOf(assetRenderer.getClassPK()) );
        int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
        if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
          _jspx_th_portlet_param_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
        _jspx_th_portlet_param_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_1.setName("redirect");
        _jspx_th_portlet_param_1.setValue( currentURL );
        int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
        if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
          _jspx_th_portlet_param_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
        _jspx_th_portlet_param_1.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String restoreJournalArticleURL = null;
      restoreJournalArticleURL = (java.lang.String) _jspx_page_context.findAttribute("restoreJournalArticleURL");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
      _jspx_th_liferay$1util_buffer_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_1.setParent(null);
      _jspx_th_liferay$1util_buffer_1.setVar("restoreJournalArticleLink");
      int _jspx_eval_liferay$1util_buffer_1 = _jspx_th_liferay$1util_buffer_1.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          //  aui:a
          com.liferay.taglib.aui.ATag _jspx_th_aui_a_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
          _jspx_th_aui_a_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_a_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_1);
          _jspx_th_aui_a_2.setHref( restoreJournalArticleURL );
          _jspx_th_aui_a_2.setLabel("undo");
          int _jspx_eval_aui_a_2 = _jspx_th_aui_a_2.doStartTag();
          if (_jspx_th_aui_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_2);
            _jspx_th_aui_a_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_2);
          _jspx_th_aui_a_2.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_1);
        _jspx_th_liferay$1util_buffer_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_1);
      _jspx_th_liferay$1util_buffer_1.release();
      java.lang.String restoreJournalArticleLink = null;
      restoreJournalArticleLink = (java.lang.String) _jspx_page_context.findAttribute("restoreJournalArticleLink");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_5.setParent(null);
      _jspx_th_liferay$1ui_message_5.setArguments( new String[] {restoreJournalArticleLink, selectJournalArticleLink} );
      _jspx_th_liferay$1ui_message_5.setKey("do-you-want-to-x-or-x-web-content");
      int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
      if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
        _jspx_th_liferay$1ui_message_5.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
      _jspx_th_liferay$1ui_message_5.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_6.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_6.setParent(null);
      _jspx_th_liferay$1ui_message_6.setArguments( selectJournalArticleLink );
      _jspx_th_liferay$1ui_message_6.setKey("do-you-want-to-x-web-content");
      int _jspx_eval_liferay$1ui_message_6 = _jspx_th_liferay$1ui_message_6.doStartTag();
      if (_jspx_th_liferay$1ui_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
        _jspx_th_liferay$1ui_message_6.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_6);
      _jspx_th_liferay$1ui_message_6.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
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
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 !journalContentDisplayContext.hasViewPermission() ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"alert alert-danger\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else if (
 Validator.isNotNull(journalContentDisplayContext.getArticleId()) ) {
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 journalContentDisplayContext.isExpired() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_8.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_8.setParent(null);
      _jspx_th_liferay$1ui_message_8.setArguments( HtmlUtil.escape(article.getTitle(locale)) );
      _jspx_th_liferay$1ui_message_8.setKey("x-is-expired");
      int _jspx_eval_liferay$1ui_message_8 = _jspx_th_liferay$1ui_message_8.doStartTag();
      if (_jspx_th_liferay$1ui_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
        _jspx_th_liferay$1ui_message_8.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_8);
      _jspx_th_liferay$1ui_message_8.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
else if (
 article.getDDMStructure() == null ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_9.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_9.setParent(null);
      _jspx_th_liferay$1ui_message_9.setArguments( HtmlUtil.escape(article.getTitle(locale)) );
      _jspx_th_liferay$1ui_message_9.setKey("is-temporarily-unavailable");
      int _jspx_eval_liferay$1ui_message_9 = _jspx_th_liferay$1ui_message_9.doStartTag();
      if (_jspx_th_liferay$1ui_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
        _jspx_th_liferay$1ui_message_9.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_9);
      _jspx_th_liferay$1ui_message_9.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
else if (
 !journalContentDisplayContext.isPreview() && !article.isApproved() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

						AssetRenderer<JournalArticle> assetRenderer = assetRendererFactory.getAssetRenderer(article.getResourcePrimKey());
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
      _jspx_th_liferay$1util_buffer_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_2.setParent(null);
      _jspx_th_liferay$1util_buffer_2.setVar("scheduledOrNotApprovedMessage");
      int _jspx_eval_liferay$1util_buffer_2 = _jspx_th_liferay$1util_buffer_2.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
if (
 article.isScheduled() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_10.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_2);
          _jspx_th_liferay$1ui_message_10.setArguments( new Object[] {HtmlUtil.escape(article.getTitle(locale)), dateFormatDateTime.format(article.getDisplayDate())} );
          _jspx_th_liferay$1ui_message_10.setKey("x-is-scheduled-and-will-be-displayed-on-x");
          int _jspx_eval_liferay$1ui_message_10 = _jspx_th_liferay$1ui_message_10.doStartTag();
          if (_jspx_th_liferay$1ui_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
            _jspx_th_liferay$1ui_message_10.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_10);
          _jspx_th_liferay$1ui_message_10.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_11.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_2);
          _jspx_th_liferay$1ui_message_11.setArguments( HtmlUtil.escape(article.getTitle(locale)) );
          _jspx_th_liferay$1ui_message_11.setKey("x-is-not-approved");
          int _jspx_eval_liferay$1ui_message_11 = _jspx_th_liferay$1ui_message_11.doStartTag();
          if (_jspx_th_liferay$1ui_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
            _jspx_th_liferay$1ui_message_11.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_11);
          _jspx_th_liferay$1ui_message_11.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_2);
        _jspx_th_liferay$1util_buffer_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_2);
      _jspx_th_liferay$1util_buffer_2.release();
      java.lang.String scheduledOrNotApprovedMessage = null;
      scheduledOrNotApprovedMessage = (java.lang.String) _jspx_page_context.findAttribute("scheduledOrNotApprovedMessage");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"alert alert-warning\">\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
if (
 assetRenderer.hasEditPermission(permissionChecker) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print( assetRenderer.getURLEdit(liferayPortletRequest, liferayPortletResponse, WindowState.NORMAL, currentURLObj) );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print( scheduledOrNotApprovedMessage );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print( scheduledOrNotApprovedMessage );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
else if (
 articleDisplay != null ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

						AssetRenderer<JournalArticle> assetRenderer = assetRendererFactory.getAssetRenderer(article.getResourcePrimKey());

						Map<String, Object> data = HashMapBuilder.<String, Object>put(
							"fragments-editor-item-id", PortalUtil.getClassNameId(JournalArticle.class) + "-" + assetRenderer.getClassPK()
						).put(
							"fragments-editor-item-type", "fragments-editor-mapped-item"
						).build();
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"");
      out.print( journalContentDisplayContext.isPreview() ? "p-1 preview-asset-entry" : StringPool.BLANK );
      out.write('"');
      out.write(' ');
      out.print( AUIUtil.buildData(data) );
      out.write(">\n");
      out.write("\t\t\t\t\t\t\t");
      //  liferay-journal:journal-article-display
      com.liferay.journal.taglib.servlet.taglib.JournalArticleDisplayTag _jspx_th_liferay$1journal_journal$1article$1display_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.journal.taglib.servlet.taglib.JournalArticleDisplayTag.class) : new com.liferay.journal.taglib.servlet.taglib.JournalArticleDisplayTag();
      _jspx_th_liferay$1journal_journal$1article$1display_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1journal_journal$1article$1display_0.setParent(null);
      _jspx_th_liferay$1journal_journal$1article$1display_0.setArticleDisplay( articleDisplay );
      int _jspx_eval_liferay$1journal_journal$1article$1display_0 = _jspx_th_liferay$1journal_journal$1article$1display_0.doStartTag();
      if (_jspx_th_liferay$1journal_journal$1article$1display_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1journal_journal$1article$1display_0);
        _jspx_th_liferay$1journal_journal$1article$1display_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1journal_journal$1article$1display_0);
      _jspx_th_liferay$1journal_journal$1article$1display_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
if (
 articleDisplay.isPaginate() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      //  liferay-ui:page-iterator
      com.liferay.taglib.ui.PageIteratorTag _jspx_th_liferay$1ui_page$1iterator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.PageIteratorTag.class) : new com.liferay.taglib.ui.PageIteratorTag();
      _jspx_th_liferay$1ui_page$1iterator_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_page$1iterator_0.setParent(null);
      _jspx_th_liferay$1ui_page$1iterator_0.setCur( articleDisplay.getCurrentPage() );
      _jspx_th_liferay$1ui_page$1iterator_0.setCurParam("page");
      _jspx_th_liferay$1ui_page$1iterator_0.setDelta( 1 );
      _jspx_th_liferay$1ui_page$1iterator_0.setId("articleDisplayPages");
      _jspx_th_liferay$1ui_page$1iterator_0.setMaxPages( 25 );
      _jspx_th_liferay$1ui_page$1iterator_0.setPortletURL( renderResponse.createRenderURL() );
      _jspx_th_liferay$1ui_page$1iterator_0.setTotal( articleDisplay.getNumberOfPages() );
      _jspx_th_liferay$1ui_page$1iterator_0.setType("article");
      int _jspx_eval_liferay$1ui_page$1iterator_0 = _jspx_th_liferay$1ui_page$1iterator_0.doStartTag();
      if (_jspx_th_liferay$1ui_page$1iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_page$1iterator_0);
        _jspx_th_liferay$1ui_page$1iterator_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_page$1iterator_0);
      _jspx_th_liferay$1ui_page$1iterator_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write('\n');
      out.write('	');
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
if (
 (articleDisplay != null) && journalContentDisplayContext.hasViewPermission() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t");

	ContentMetadataAssetAddonEntry relatedAssetsContentMetadataAssetAddonEntry = journalContentDisplayContext.getContentMetadataAssetAddonEntry("enableRelatedAssets");
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 relatedAssetsContentMetadataAssetAddonEntry != null ) {
      out.write("\n");
      out.write("\t\t<div class=\"asset-links content-metadata-asset-addon-entries mb-4\">\n");
      out.write("\t\t\t");
      //  liferay-asset:asset-addon-entry-display
      com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag();
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.setParent(null);
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.setAssetAddonEntries( Collections.singletonList(relatedAssetsContentMetadataAssetAddonEntry) );
      int _jspx_eval_liferay$1asset_asset$1addon$1entry$1display_0 = _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.doStartTag();
      if (_jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_0);
        _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_0);
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_0.release();
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t");

	ContentMetadataAssetAddonEntry ratingsContentMetadataAssetAddonEntry = journalContentDisplayContext.getContentMetadataAssetAddonEntry("enableRatings");

	List<UserToolAssetAddonEntry> selectedUserToolAssetAddonEntries = journalContentDisplayContext.getSelectedUserToolAssetAddonEntries();
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 ListUtil.isNotEmpty(selectedUserToolAssetAddonEntries) || (ratingsContentMetadataAssetAddonEntry != null) ) {
      out.write("\n");
      out.write("\t\t<hr class=\"separator\" />\n");
      out.write("\n");
      out.write("\t\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_0.setParent(null);
      _jspx_th_clay_content$1row_0.setCssClass("mb-4 user-tool-asset-addon-entries");
      _jspx_th_clay_content$1row_0.setFloatElements("");
      _jspx_th_clay_content$1row_0.setVerticalAlign("center");
      int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
      if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t");
if (
 ratingsContentMetadataAssetAddonEntry != null ) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  clay:content-row
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
        _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
        if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t");
          //  liferay-asset:asset-addon-entry-display
          com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag();
          _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
          _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.setAssetAddonEntries( Collections.singletonList(ratingsContentMetadataAssetAddonEntry) );
          int _jspx_eval_liferay$1asset_asset$1addon$1entry$1display_1 = _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.doStartTag();
          if (_jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_1);
            _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_1);
          _jspx_th_liferay$1asset_asset$1addon$1entry$1display_1.release();
          out.write("\n");
          out.write("\t\t\t\t");
        }
        if (_jspx_th_clay_content$1row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
          _jspx_th_clay_content$1row_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
        _jspx_th_clay_content$1row_1.release();
        out.write("\n");
        out.write("\t\t\t");
}
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");
if (
 ListUtil.isNotEmpty(selectedUserToolAssetAddonEntries) ) {
        out.write("\n");
        out.write("\t\t\t\t");
        //  liferay-asset:asset-addon-entry-display
        com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag();
        _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.setAssetAddonEntries( selectedUserToolAssetAddonEntries );
        int _jspx_eval_liferay$1asset_asset$1addon$1entry$1display_2 = _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.doStartTag();
        if (_jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_2);
          _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_2);
        _jspx_th_liferay$1asset_asset$1addon$1entry$1display_2.release();
        out.write("\n");
        out.write("\t\t\t");
}
        out.write("\n");
        out.write("\t\t");
      }
      if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
      _jspx_th_clay_content$1row_0.release();
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("\n");
      out.write("\t");

	List<ContentMetadataAssetAddonEntry> commentsContentMetadataAssetAddonEntries = journalContentDisplayContext.getCommentsContentMetadataAssetAddonEntries();
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 ListUtil.isNotEmpty(commentsContentMetadataAssetAddonEntries) ) {
      out.write("\n");
      out.write("\t\t<hr class=\"separator\" />\n");
      out.write("\n");
      out.write("\t\t<div class=\"asset-links content-metadata-asset-addon-entries mb-4\">\n");
      out.write("\t\t\t");
      //  liferay-asset:asset-addon-entry-display
      com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag.class) : new com.liferay.asset.taglib.servlet.taglib.AssetAddonEntryDisplayTag();
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.setParent(null);
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.setAssetAddonEntries( commentsContentMetadataAssetAddonEntries );
      int _jspx_eval_liferay$1asset_asset$1addon$1entry$1display_3 = _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.doStartTag();
      if (_jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_3);
        _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1asset_asset$1addon$1entry$1display_3);
      _jspx_th_liferay$1asset_asset$1addon$1entry$1display_3.release();
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
}
      out.write('\n');
}
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1util_dynamic$1include_1(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_liferay$1util_dynamic$1include_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:dynamic-include
    com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
    _jspx_th_liferay$1util_dynamic$1include_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_dynamic$1include_0.setParent(null);
    _jspx_th_liferay$1util_dynamic$1include_0.setKey("com.liferay.journal.content.web#/view.jsp#pre");
    int _jspx_eval_liferay$1util_dynamic$1include_0 = _jspx_th_liferay$1util_dynamic$1include_0.doStartTag();
    if (_jspx_th_liferay$1util_dynamic$1include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
      _jspx_th_liferay$1util_dynamic$1include_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
    _jspx_th_liferay$1util_dynamic$1include_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("this-application-is-not-visible-to-users-yet");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_a_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_0);
    _jspx_th_liferay$1ui_message_1.setKey("select-web-content-to-make-it-visible");
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

  private boolean _jspx_meth_liferay$1ui_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent(null);
    _jspx_th_liferay$1ui_message_4.setKey("the-selected-web-content-no-longer-exists");
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

  private boolean _jspx_meth_liferay$1ui_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_7.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_7.setParent(null);
    _jspx_th_liferay$1ui_message_7.setKey("you-do-not-have-the-roles-required-to-access-this-web-content-entry");
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

  private boolean _jspx_meth_liferay$1util_dynamic$1include_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:dynamic-include
    com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
    _jspx_th_liferay$1util_dynamic$1include_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_dynamic$1include_1.setParent(null);
    _jspx_th_liferay$1util_dynamic$1include_1.setKey("com.liferay.journal.content.web#/view.jsp#post");
    int _jspx_eval_liferay$1util_dynamic$1include_1 = _jspx_th_liferay$1util_dynamic$1include_1.doStartTag();
    if (_jspx_th_liferay$1util_dynamic$1include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_1);
      _jspx_th_liferay$1util_dynamic$1include_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_1);
    _jspx_th_liferay$1util_dynamic$1include_1.release();
    return false;
  }
}
