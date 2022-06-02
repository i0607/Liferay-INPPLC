package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.configuration.admin.category.ConfigurationCategory;
import com.liferay.configuration.admin.constants.ConfigurationAdminPortletKeys;
import com.liferay.configuration.admin.display.ConfigurationFormRenderer;
import com.liferay.configuration.admin.display.ConfigurationScreen;
import com.liferay.configuration.admin.menu.ConfigurationMenuItem;
import com.liferay.configuration.admin.web.internal.constants.ConfigurationAdminWebKeys;
import com.liferay.configuration.admin.web.internal.display.ConfigurationCategoryDisplay;
import com.liferay.configuration.admin.web.internal.display.ConfigurationCategoryMenuDisplay;
import com.liferay.configuration.admin.web.internal.display.ConfigurationCategorySectionDisplay;
import com.liferay.configuration.admin.web.internal.display.ConfigurationEntry;
import com.liferay.configuration.admin.web.internal.display.ConfigurationModelConfigurationEntry;
import com.liferay.configuration.admin.web.internal.display.ConfigurationScopeDisplay;
import com.liferay.configuration.admin.web.internal.display.context.ConfigurationScopeDisplayContext;
import com.liferay.configuration.admin.web.internal.display.context.ConfigurationScopeDisplayContextFactory;
import com.liferay.configuration.admin.web.internal.model.ConfigurationModel;
import com.liferay.configuration.admin.web.internal.util.ConfigurationCategoryUtil;
import com.liferay.configuration.admin.web.internal.util.ConfigurationEntryIterator;
import com.liferay.configuration.admin.web.internal.util.ConfigurationEntryRetriever;
import com.liferay.configuration.admin.web.internal.util.ConfigurationModelIterator;
import com.liferay.configuration.admin.web.internal.util.ResourceBundleLoaderProvider;
import com.liferay.petra.portlet.url.builder.PortletURLBuilder;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import com.liferay.portal.configuration.persistence.listener.ConfigurationModelListenerException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoader;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.List;
import java.util.ResourceBundle;
import javax.portlet.PortletURL;
import org.osgi.service.cm.Configuration;
import org.osgi.service.metatype.AttributeDefinition;

public final class edit_005fconfiguration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String redirect = ParamUtil.getString(request, "redirect");

PortletURL portletURL = renderResponse.createRenderURL();

if (Validator.isNull(redirect)) {
	redirect = portletURL.toString();
}

String bindRedirectURL = currentURL;

ConfigurationModel configurationModel = (ConfigurationModel)request.getAttribute(ConfigurationAdminWebKeys.CONFIGURATION_MODEL);

PortletURL viewFactoryInstancesURL = PortletURLBuilder.createRenderURL(
	renderResponse
).setMVCRenderCommandName(
	"/configuration_admin/view_factory_instances"
).setParameter(
	"factoryPid", configurationModel.getFactoryPid()
).buildPortletURL();

if (configurationModel.isFactory()) {
	bindRedirectURL = viewFactoryInstancesURL.toString();
}

PortalUtil.addPortletBreadcrumbEntry(request, portletDisplay.getPortletDisplayName(), String.valueOf(renderResponse.createRenderURL()));

ConfigurationCategoryMenuDisplay configurationCategoryMenuDisplay = (ConfigurationCategoryMenuDisplay)request.getAttribute(ConfigurationAdminWebKeys.CONFIGURATION_CATEGORY_MENU_DISPLAY);

ConfigurationCategoryDisplay configurationCategoryDisplay = configurationCategoryMenuDisplay.getConfigurationCategoryDisplay();

String categoryDisplayName = configurationCategoryDisplay.getCategoryLabel(locale);

String viewCategoryHREF = ConfigurationCategoryUtil.getHREF(configurationCategoryMenuDisplay, liferayPortletResponse, renderRequest, renderResponse);

PortalUtil.addPortletBreadcrumbEntry(request, categoryDisplayName, viewCategoryHREF);

ResourceBundleLoaderProvider resourceBundleLoaderProvider = (ResourceBundleLoaderProvider)request.getAttribute(ConfigurationAdminWebKeys.RESOURCE_BUNDLE_LOADER_PROVIDER);

ResourceBundleLoader resourceBundleLoader = resourceBundleLoaderProvider.getResourceBundleLoader(configurationModel.getBundleSymbolicName());

ResourceBundle componentResourceBundle = resourceBundleLoader.loadResourceBundle(PortalUtil.getLocale(request));

String configurationModelName = (componentResourceBundle != null) ? LanguageUtil.get(componentResourceBundle, configurationModel.getName()) : configurationModel.getName();

if (configurationModel.isFactory()) {
	PortalUtil.addPortletBreadcrumbEntry(request, configurationModelName, viewFactoryInstancesURL.toString());
}

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle(categoryDisplayName);

      out.write('\n');
      out.write('\n');
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_0.setParent(null);
      _jspx_th_liferay$1ui_error_0.setException( ConfigurationModelListenerException.class );
      int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
      if (_jspx_eval_liferay$1ui_error_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object errorException = null;
        if (_jspx_eval_liferay$1ui_error_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1ui_error_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1ui_error_0.doInitBody();
        }
        errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t");

	ConfigurationModelListenerException cmle = (ConfigurationModelListenerException)errorException;
	
          out.write("\n");
          out.write("\n");
          out.write("\t");
          //  liferay-ui:message
          com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
          _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_error_0);
          _jspx_th_liferay$1ui_message_0.setKey( cmle.causeMessage );
          _jspx_th_liferay$1ui_message_0.setLocalizeKey( false );
          int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
          if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
            _jspx_th_liferay$1ui_message_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
          _jspx_th_liferay$1ui_message_0.release();
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay$1ui_error_0.doAfterBody();
          errorException = (java.lang.Object) _jspx_page_context.findAttribute("errorException");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1ui_error_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
        _jspx_th_liferay$1ui_error_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
      _jspx_th_liferay$1ui_error_0.release();
      out.write('\n');
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setName("/configuration_admin/bind_configuration");
      _jspx_th_portlet_actionURL_0.setVar("bindConfigurationActionURL");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String bindConfigurationActionURL = null;
      bindConfigurationActionURL = (java.lang.String) _jspx_page_context.findAttribute("bindConfigurationActionURL");
      out.write('\n');
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_1.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_1.setParent(null);
      _jspx_th_portlet_actionURL_1.setName("/configuration_admin/delete_configuration");
      _jspx_th_portlet_actionURL_1.setVar("deleteConfigurationActionURL");
      int _jspx_eval_portlet_actionURL_1 = _jspx_th_portlet_actionURL_1.doStartTag();
      if (_jspx_th_portlet_actionURL_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
        _jspx_th_portlet_actionURL_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_1);
      _jspx_th_portlet_actionURL_1.release();
      java.lang.String deleteConfigurationActionURL = null;
      deleteConfigurationActionURL = (java.lang.String) _jspx_page_context.findAttribute("deleteConfigurationActionURL");
      out.write('\n');
      out.write('\n');
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_0.setParent(null);
      int _jspx_eval_clay_container$1fluid_0 = _jspx_th_clay_container$1fluid_0.doStartTag();
      if (_jspx_eval_clay_container$1fluid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  clay:col
        com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
        _jspx_th_clay_col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_0);
        _jspx_th_clay_col_0.setSize("12");
        int _jspx_eval_clay_col_0 = _jspx_th_clay_col_0.doStartTag();
        if (_jspx_eval_clay_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  liferay-ui:breadcrumb
          com.liferay.taglib.ui.BreadcrumbTag _jspx_th_liferay$1ui_breadcrumb_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.BreadcrumbTag.class) : new com.liferay.taglib.ui.BreadcrumbTag();
          _jspx_th_liferay$1ui_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ui_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_0);
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
        if (_jspx_th_clay_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
          _jspx_th_clay_col_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_0);
        _jspx_th_clay_col_0.release();
        out.write('\n');
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
      //  clay:container-fluid
      com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag _jspx_th_clay_container$1fluid_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContainerFluidTag();
      _jspx_th_clay_container$1fluid_1.setPageContext(_jspx_page_context);
      _jspx_th_clay_container$1fluid_1.setParent(null);
      int _jspx_eval_clay_container$1fluid_1 = _jspx_th_clay_container$1fluid_1.doStartTag();
      if (_jspx_eval_clay_container$1fluid_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  clay:row
        com.liferay.frontend.taglib.clay.servlet.taglib.RowTag _jspx_th_clay_row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.RowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.RowTag();
        _jspx_th_clay_row_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_container$1fluid_1);
        int _jspx_eval_clay_row_0 = _jspx_th_clay_row_0.doStartTag();
        if (_jspx_eval_clay_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_1.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
          _jspx_th_clay_col_1.setMd("3");
          int _jspx_eval_clay_col_1 = _jspx_th_clay_col_1.doStartTag();
          if (_jspx_eval_clay_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  liferay-util:include
            com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
            _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_1);
            _jspx_th_liferay$1util_include_0.setPage("/configuration_category_menu.jsp");
            _jspx_th_liferay$1util_include_0.setServletContext( application );
            int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
            if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
              _jspx_th_liferay$1util_include_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
            _jspx_th_liferay$1util_include_0.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
            _jspx_th_clay_col_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_1);
          _jspx_th_clay_col_1.release();
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
          //  clay:col
          com.liferay.frontend.taglib.clay.servlet.taglib.ColTag _jspx_th_clay_col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ColTag();
          _jspx_th_clay_col_2.setPageContext(_jspx_page_context);
          _jspx_th_clay_col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_row_0);
          _jspx_th_clay_col_2.setMd("9");
          int _jspx_eval_clay_col_2 = _jspx_th_clay_col_2.doStartTag();
          if (_jspx_eval_clay_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t");
            //  clay:sheet
            com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag _jspx_th_clay_sheet_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.SheetTag();
            _jspx_th_clay_sheet_0.setPageContext(_jspx_page_context);
            _jspx_th_clay_sheet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_col_2);
            _jspx_th_clay_sheet_0.setSize("full");
            int _jspx_eval_clay_sheet_0 = _jspx_th_clay_sheet_0.doStartTag();
            if (_jspx_eval_clay_sheet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t");
              //  aui:form
              com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
              _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
              _jspx_th_aui_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_sheet_0);
              _jspx_th_aui_form_0.setAction( bindConfigurationActionURL );
              _jspx_th_aui_form_0.setMethod("post");
              _jspx_th_aui_form_0.setName("fm");
              int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
              if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:input
                com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_aui_input_0.setName("redirect");
                _jspx_th_aui_input_0.setType("hidden");
                _jspx_th_aui_input_0.setValue( bindRedirectURL );
                int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
                if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
                  _jspx_th_aui_input_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
                _jspx_th_aui_input_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:input
                com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
                _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_aui_input_1.setName("factoryPid");
                _jspx_th_aui_input_1.setType("hidden");
                _jspx_th_aui_input_1.setValue( configurationModel.getFactoryPid() );
                int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
                if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
                  _jspx_th_aui_input_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
                _jspx_th_aui_input_1.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  aui:input
                com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
                _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
                _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_aui_input_2.setName("pid");
                _jspx_th_aui_input_2.setType("hidden");
                _jspx_th_aui_input_2.setValue( configurationModel.getID() );
                int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
                if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
                  _jspx_th_aui_input_2.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
                _jspx_th_aui_input_2.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");

					String configurationTitle = null;

					ConfigurationScopeDisplayContext configurationScopeDisplayContext = ConfigurationScopeDisplayContextFactory.create(renderRequest);

					if (configurationModel.isFactory()) {
						if (configurationModel.hasScopeConfiguration(configurationScopeDisplayContext.getScope())) {
							configurationTitle = configurationModel.getLabel();
						}
						else {
							configurationTitle = LanguageUtil.get(request, "add");
						}
					}
					else {
						configurationTitle = (componentResourceBundle != null) ? LanguageUtil.format(componentResourceBundle, configurationModel.getName(), configurationModel.getNameArguments()) : configurationModel.getName();
					}
					
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t<h2>\n");
                out.write("\t\t\t\t\t\t");
                out.print( HtmlUtil.escape(configurationTitle) );
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t\t");
if (
 configurationModel.hasScopeConfiguration(configurationScopeDisplayContext.getScope()) ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t");
                //  liferay-ui:icon-menu
                com.liferay.taglib.ui.IconMenuTag _jspx_th_liferay$1ui_icon$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconMenuTag.class) : new com.liferay.taglib.ui.IconMenuTag();
                _jspx_th_liferay$1ui_icon$1menu_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1ui_icon$1menu_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_liferay$1ui_icon$1menu_0.setCssClass("float-right");
                _jspx_th_liferay$1ui_icon$1menu_0.setDirection("right");
                _jspx_th_liferay$1ui_icon$1menu_0.setMarkupView("lexicon");
                _jspx_th_liferay$1ui_icon$1menu_0.setShowWhenSingleIcon( true );
                int _jspx_eval_liferay$1ui_icon$1menu_0 = _jspx_th_liferay$1ui_icon$1menu_0.doStartTag();
                if (_jspx_eval_liferay$1ui_icon$1menu_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_liferay$1ui_icon$1menu_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_th_liferay$1ui_icon$1menu_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_liferay$1ui_icon$1menu_0.doInitBody();
                  }
                  do {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
if (
 configurationModel.isFactory() ) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    //  portlet:actionURL
                    com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
                    _jspx_th_portlet_actionURL_2.setPageContext(_jspx_page_context);
                    _jspx_th_portlet_actionURL_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_portlet_actionURL_2.setName("/configuration_admin/delete_configuration");
                    _jspx_th_portlet_actionURL_2.setVar("deleteConfigActionURL");
                    int _jspx_eval_portlet_actionURL_2 = _jspx_th_portlet_actionURL_2.doStartTag();
                    if (_jspx_eval_portlet_actionURL_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_2);
                      _jspx_th_portlet_param_0.setName("redirect");
                      _jspx_th_portlet_param_0.setValue( currentURL );
                      int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
                      if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
                        _jspx_th_portlet_param_0.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
                      _jspx_th_portlet_param_0.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_1.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_2);
                      _jspx_th_portlet_param_1.setName("factoryPid");
                      _jspx_th_portlet_param_1.setValue( configurationModel.getFactoryPid() );
                      int _jspx_eval_portlet_param_1 = _jspx_th_portlet_param_1.doStartTag();
                      if (_jspx_th_portlet_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
                        _jspx_th_portlet_param_1.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_1);
                      _jspx_th_portlet_param_1.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_2.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_2);
                      _jspx_th_portlet_param_2.setName("pid");
                      _jspx_th_portlet_param_2.setValue( configurationModel.getID() );
                      int _jspx_eval_portlet_param_2 = _jspx_th_portlet_param_2.doStartTag();
                      if (_jspx_th_portlet_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
                        _jspx_th_portlet_param_2.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_2);
                      _jspx_th_portlet_param_2.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_portlet_actionURL_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_2);
                      _jspx_th_portlet_actionURL_2.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_2);
                    _jspx_th_portlet_actionURL_2.release();
                    java.lang.String deleteConfigActionURL = null;
                    deleteConfigActionURL = (java.lang.String) _jspx_page_context.findAttribute("deleteConfigActionURL");
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-ui:icon
                    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
                    _jspx_th_liferay$1ui_icon_0.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1ui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_liferay$1ui_icon_0.setMessage("delete");
                    _jspx_th_liferay$1ui_icon_0.setMethod("post");
                    _jspx_th_liferay$1ui_icon_0.setUrl( deleteConfigActionURL );
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
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
}
else {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    //  portlet:actionURL
                    com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
                    _jspx_th_portlet_actionURL_3.setPageContext(_jspx_page_context);
                    _jspx_th_portlet_actionURL_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_portlet_actionURL_3.setName("/configuration_admin/delete_configuration");
                    _jspx_th_portlet_actionURL_3.setVar("deleteConfigActionURL");
                    int _jspx_eval_portlet_actionURL_3 = _jspx_th_portlet_actionURL_3.doStartTag();
                    if (_jspx_eval_portlet_actionURL_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_3.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_3);
                      _jspx_th_portlet_param_3.setName("redirect");
                      _jspx_th_portlet_param_3.setValue( currentURL );
                      int _jspx_eval_portlet_param_3 = _jspx_th_portlet_param_3.doStartTag();
                      if (_jspx_th_portlet_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
                        _jspx_th_portlet_param_3.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_3);
                      _jspx_th_portlet_param_3.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_4.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_3);
                      _jspx_th_portlet_param_4.setName("factoryPid");
                      _jspx_th_portlet_param_4.setValue( configurationModel.getFactoryPid() );
                      int _jspx_eval_portlet_param_4 = _jspx_th_portlet_param_4.doStartTag();
                      if (_jspx_th_portlet_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
                        _jspx_th_portlet_param_4.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_4);
                      _jspx_th_portlet_param_4.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_5.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_3);
                      _jspx_th_portlet_param_5.setName("pid");
                      _jspx_th_portlet_param_5.setValue( configurationModel.getID() );
                      int _jspx_eval_portlet_param_5 = _jspx_th_portlet_param_5.doStartTag();
                      if (_jspx_th_portlet_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_5);
                        _jspx_th_portlet_param_5.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_5);
                      _jspx_th_portlet_param_5.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_portlet_actionURL_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_3);
                      _jspx_th_portlet_actionURL_3.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_3);
                    _jspx_th_portlet_actionURL_3.release();
                    java.lang.String deleteConfigActionURL = null;
                    deleteConfigActionURL = (java.lang.String) _jspx_page_context.findAttribute("deleteConfigActionURL");
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-ui:icon
                    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
                    _jspx_th_liferay$1ui_icon_1.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1ui_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_liferay$1ui_icon_1.setMessage("reset-default-values");
                    _jspx_th_liferay$1ui_icon_1.setMethod("post");
                    _jspx_th_liferay$1ui_icon_1.setUrl( deleteConfigActionURL );
                    int _jspx_eval_liferay$1ui_icon_1 = _jspx_th_liferay$1ui_icon_1.doStartTag();
                    if (_jspx_th_liferay$1ui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
                      _jspx_th_liferay$1ui_icon_1.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_1);
                    _jspx_th_liferay$1ui_icon_1.release();
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
}
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  portlet:resourceURL
                    com.liferay.taglib.portlet.ResourceURLTag _jspx_th_portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
                    _jspx_th_portlet_resourceURL_0.setPageContext(_jspx_page_context);
                    _jspx_th_portlet_resourceURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_portlet_resourceURL_0.setId("/configuration_admin/export_configuration");
                    _jspx_th_portlet_resourceURL_0.setVar("exportURL");
                    int _jspx_eval_portlet_resourceURL_0 = _jspx_th_portlet_resourceURL_0.doStartTag();
                    if (_jspx_eval_portlet_resourceURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_6.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_0);
                      _jspx_th_portlet_param_6.setName("factoryPid");
                      _jspx_th_portlet_param_6.setValue( configurationModel.getFactoryPid() );
                      int _jspx_eval_portlet_param_6 = _jspx_th_portlet_param_6.doStartTag();
                      if (_jspx_th_portlet_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_6);
                        _jspx_th_portlet_param_6.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_6);
                      _jspx_th_portlet_param_6.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t\t");
                      //  portlet:param
                      com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
                      _jspx_th_portlet_param_7.setPageContext(_jspx_page_context);
                      _jspx_th_portlet_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_resourceURL_0);
                      _jspx_th_portlet_param_7.setName("pid");
                      _jspx_th_portlet_param_7.setValue( configurationModel.getID() );
                      int _jspx_eval_portlet_param_7 = _jspx_th_portlet_param_7.doStartTag();
                      if (_jspx_th_portlet_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_7);
                        _jspx_th_portlet_param_7.release();
                        return;
                      }
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_7);
                      _jspx_th_portlet_param_7.release();
                      out.write("\n");
                      out.write("\t\t\t\t\t\t\t\t");
                    }
                    if (_jspx_th_portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
                      _jspx_th_portlet_resourceURL_0.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_resourceURL_0);
                    _jspx_th_portlet_resourceURL_0.release();
                    java.lang.String exportURL = null;
                    exportURL = (java.lang.String) _jspx_page_context.findAttribute("exportURL");
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
                    //  liferay-ui:icon
                    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
                    _jspx_th_liferay$1ui_icon_2.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1ui_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_liferay$1ui_icon_2.setMessage("export");
                    _jspx_th_liferay$1ui_icon_2.setMethod("get");
                    _jspx_th_liferay$1ui_icon_2.setUrl( exportURL );
                    int _jspx_eval_liferay$1ui_icon_2 = _jspx_th_liferay$1ui_icon_2.doStartTag();
                    if (_jspx_th_liferay$1ui_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
                      _jspx_th_liferay$1ui_icon_2.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_2);
                    _jspx_th_liferay$1ui_icon_2.release();
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");

								List<ConfigurationMenuItem> configurationMenuItems = (List<ConfigurationMenuItem>)request.getAttribute(ConfigurationAdminWebKeys.CONFIGURATION_MENU_ITEMS);
								
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
if (
 ListUtil.isNotEmpty(configurationMenuItems) ) {
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");

									for (ConfigurationMenuItem configurationMenuItem : configurationMenuItems) {
										Configuration configuration = configurationModel.getConfiguration();
									
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    //  liferay-ui:icon
                    com.liferay.taglib.ui.IconTag _jspx_th_liferay$1ui_icon_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconTag.class) : new com.liferay.taglib.ui.IconTag();
                    _jspx_th_liferay$1ui_icon_3.setPageContext(_jspx_page_context);
                    _jspx_th_liferay$1ui_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_icon$1menu_0);
                    _jspx_th_liferay$1ui_icon_3.setMessage( configurationMenuItem.getLabel(locale) );
                    _jspx_th_liferay$1ui_icon_3.setUrl( configurationMenuItem.getURL(renderRequest, renderResponse, configurationModel.getID(), configurationModel.getFactoryPid(), configuration.getProperties()) );
                    _jspx_th_liferay$1ui_icon_3.setUseDialog( true );
                    int _jspx_eval_liferay$1ui_icon_3 = _jspx_th_liferay$1ui_icon_3.doStartTag();
                    if (_jspx_th_liferay$1ui_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
                      _jspx_th_liferay$1ui_icon_3.release();
                      return;
                    }
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon_3);
                    _jspx_th_liferay$1ui_icon_3.release();
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");

									}
									
                    out.write("\n");
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t");
}
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                    int evalDoAfterBody = _jspx_th_liferay$1ui_icon$1menu_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_liferay$1ui_icon$1menu_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                }
                if (_jspx_th_liferay$1ui_icon$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1menu_0);
                  _jspx_th_liferay$1ui_icon$1menu_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1menu_0);
                _jspx_th_liferay$1ui_icon$1menu_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t\t</h2>\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
if (
 configurationModel.hasScopeConfiguration(configurationScopeDisplayContext.getScope()) && configurationModel.isReadOnly() ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  aui:alert
                com.liferay.taglib.aui.AlertTag _jspx_th_aui_alert_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.AlertTag.class) : new com.liferay.taglib.aui.AlertTag();
                _jspx_th_aui_alert_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_alert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_aui_alert_0.setCloseable( false );
                _jspx_th_aui_alert_0.setId("readonlyAlert");
                _jspx_th_aui_alert_0.setType("info");
                int _jspx_eval_aui_alert_0 = _jspx_th_aui_alert_0.doStartTag();
                if (_jspx_eval_aui_alert_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_alert_0, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                }
                if (_jspx_th_aui_alert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_alert_0);
                  _jspx_th_aui_alert_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_alert_0);
                _jspx_th_aui_alert_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
}
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
if (
 !configurationModel.hasScopeConfiguration(configurationScopeDisplayContext.getScope()) ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  aui:alert
                com.liferay.taglib.aui.AlertTag _jspx_th_aui_alert_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.AlertTag.class) : new com.liferay.taglib.aui.AlertTag();
                _jspx_th_aui_alert_1.setPageContext(_jspx_page_context);
                _jspx_th_aui_alert_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_aui_alert_1.setCloseable( false );
                _jspx_th_aui_alert_1.setId("errorAlert");
                _jspx_th_aui_alert_1.setType("info");
                int _jspx_eval_aui_alert_1 = _jspx_th_aui_alert_1.doStartTag();
                if (_jspx_eval_aui_alert_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_alert_1, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                }
                if (_jspx_th_aui_alert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_alert_1);
                  _jspx_th_aui_alert_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_alert_1);
                _jspx_th_aui_alert_1.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
}
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  liferay-util:dynamic-include
                com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
                _jspx_th_liferay$1util_dynamic$1include_0.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_dynamic$1include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_liferay$1util_dynamic$1include_0.setKey( "com.liferay.configuration.admin.web#/edit_configuration.jsp#" + configurationModel.getFactoryPid() + "#pre" );
                int _jspx_eval_liferay$1util_dynamic$1include_0 = _jspx_th_liferay$1util_dynamic$1include_0.doStartTag();
                if (_jspx_th_liferay$1util_dynamic$1include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
                  _jspx_th_liferay$1util_dynamic$1include_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_0);
                _jspx_th_liferay$1util_dynamic$1include_0.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");

					String configurationModelDescription = (componentResourceBundle != null) ? LanguageUtil.format(componentResourceBundle, configurationModel.getDescription(), configurationModel.getDescriptionArguments()) : configurationModel.getDescription();
					
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
if (
 !Validator.isBlank(configurationModelDescription) ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t<p class=\"text-default\">\n");
                out.write("\t\t\t\t\t\t\t<strong>");
                out.print( configurationModelDescription );
                out.write("</strong>\n");
                out.write("\t\t\t\t\t\t</p>\n");
                out.write("\t\t\t\t\t");
}
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");

					ConfigurationFormRenderer configurationFormRenderer = (ConfigurationFormRenderer)request.getAttribute(ConfigurationAdminWebKeys.CONFIGURATION_FORM_RENDERER);

					configurationFormRenderer.render(request, PipingServletResponseFactory.createPipingServletResponse(pageContext));
					
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
                //  liferay-util:dynamic-include
                com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.DynamicIncludeTag.class) : new com.liferay.taglib.util.DynamicIncludeTag();
                _jspx_th_liferay$1util_dynamic$1include_1.setPageContext(_jspx_page_context);
                _jspx_th_liferay$1util_dynamic$1include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                _jspx_th_liferay$1util_dynamic$1include_1.setKey( "com.liferay.configuration.admin.web#/edit_configuration.jsp#" + configurationModel.getFactoryPid() + "#post" );
                int _jspx_eval_liferay$1util_dynamic$1include_1 = _jspx_th_liferay$1util_dynamic$1include_1.doStartTag();
                if (_jspx_th_liferay$1util_dynamic$1include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_1);
                  _jspx_th_liferay$1util_dynamic$1include_1.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_dynamic$1include_1);
                _jspx_th_liferay$1util_dynamic$1include_1.release();
                out.write("\n");
                out.write("\n");
                out.write("\t\t\t\t\t");
if (
 !configurationModel.isReadOnly() ) {
                out.write("\n");
                out.write("\t\t\t\t\t\t");
                //  aui:button-row
                com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_button$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonRowTag.class) : new com.liferay.taglib.aui.ButtonRowTag();
                _jspx_th_aui_button$1row_0.setPageContext(_jspx_page_context);
                _jspx_th_aui_button$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
                int _jspx_eval_aui_button$1row_0 = _jspx_th_aui_button$1row_0.doStartTag();
                if (_jspx_eval_aui_button$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
if (
 configurationModel.hasScopeConfiguration(configurationScopeDisplayContext.getScope()) ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_aui_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_button$1row_0, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
}
else {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_aui_button_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_button$1row_0, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
                  //  aui:button
                  com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
                  _jspx_th_aui_button_2.setPageContext(_jspx_page_context);
                  _jspx_th_aui_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
                  _jspx_th_aui_button_2.setHref( redirect );
                  _jspx_th_aui_button_2.setName("cancel");
                  _jspx_th_aui_button_2.setType("cancel");
                  int _jspx_eval_aui_button_2 = _jspx_th_aui_button_2.doStartTag();
                  if (_jspx_th_aui_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
                    _jspx_th_aui_button_2.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_2);
                  _jspx_th_aui_button_2.release();
                  out.write("\n");
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t");
if (
 Validator.isNotNull(configurationModel.getLiferayLearnMessageKey()) && Validator.isNotNull(configurationModel.getLiferayLearnMessageResource()) ) {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t<div class=\"btn float-right\">\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  liferay-learn:message
                  com.liferay.learn.taglib.servlet.taglib.MessageTag _jspx_th_liferay$1learn_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.learn.taglib.servlet.taglib.MessageTag.class) : new com.liferay.learn.taglib.servlet.taglib.MessageTag();
                  _jspx_th_liferay$1learn_message_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1learn_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
                  _jspx_th_liferay$1learn_message_0.setKey( configurationModel.getLiferayLearnMessageKey() );
                  _jspx_th_liferay$1learn_message_0.setResource( configurationModel.getLiferayLearnMessageResource() );
                  int _jspx_eval_liferay$1learn_message_0 = _jspx_th_liferay$1learn_message_0.doStartTag();
                  if (_jspx_th_liferay$1learn_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_0);
                    _jspx_th_liferay$1learn_message_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1learn_message_0);
                  _jspx_th_liferay$1learn_message_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t</div>\n");
                  out.write("\t\t\t\t\t\t\t");
}
                  out.write("\n");
                  out.write("\t\t\t\t\t\t");
                }
                if (_jspx_th_aui_button$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
                  _jspx_th_aui_button$1row_0.release();
                  return;
                }
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
                _jspx_th_aui_button$1row_0.release();
                out.write("\n");
                out.write("\t\t\t\t\t");
}
                out.write("\n");
                out.write("\t\t\t\t");
              }
              if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
                _jspx_th_aui_form_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
              _jspx_th_aui_form_0.release();
              out.write("\n");
              out.write("\t\t\t");
            }
            if (_jspx_th_clay_sheet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
              _jspx_th_clay_sheet_0.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_sheet_0);
            _jspx_th_clay_sheet_0.release();
            out.write("\n");
            out.write("\t\t");
          }
          if (_jspx_th_clay_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
            _jspx_th_clay_col_2.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_col_2);
          _jspx_th_clay_col_2.release();
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_clay_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
          _jspx_th_clay_row_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_row_0);
        _jspx_th_clay_row_0.release();
        out.write('\n');
      }
      if (_jspx_th_clay_container$1fluid_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
        _jspx_th_clay_container$1fluid_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_container$1fluid_1);
      _jspx_th_clay_container$1fluid_1.release();
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_alert_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_alert_0);
    _jspx_th_liferay$1ui_message_1.setKey("this-configuration-is-read-only");
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

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_alert_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_alert_1);
    _jspx_th_liferay$1ui_message_2.setKey("this-configuration-is-not-saved-yet.-the-values-shown-are-the-default");
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

  private boolean _jspx_meth_aui_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_button$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
    _jspx_th_aui_button_0.setName("update");
    _jspx_th_aui_button_0.setType("submit");
    _jspx_th_aui_button_0.setValue("update");
    int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
    if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
      _jspx_th_aui_button_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
    _jspx_th_aui_button_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_button$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
    _jspx_th_aui_button_1.setName("save");
    _jspx_th_aui_button_1.setType("submit");
    _jspx_th_aui_button_1.setValue("save");
    int _jspx_eval_aui_button_1 = _jspx_th_aui_button_1.doStartTag();
    if (_jspx_th_aui_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
      _jspx_th_aui_button_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_1);
    _jspx_th_aui_button_1.release();
    return false;
  }
}
