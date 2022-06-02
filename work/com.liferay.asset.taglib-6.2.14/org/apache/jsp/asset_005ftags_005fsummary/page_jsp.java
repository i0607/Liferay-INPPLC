package org.apache.jsp.asset_005ftags_005fsummary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetTagServiceUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import java.util.List;
import javax.portlet.PortletURL;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/asset_tags_summary/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/resources/WEB-INF/liferay-frontend.tld");
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

String[] assetTagNames = StringUtil.split((String)request.getAttribute("liferay-asset:asset-tags-summary:assetTagNames"));
String className = (String)request.getAttribute("liferay-asset:asset-tags-summary:className");
long classPK = GetterUtil.getLong((String)request.getAttribute("liferay-asset:asset-tags-summary:classPK"));
String message = GetterUtil.getString((String)request.getAttribute("liferay-asset:asset-tags-summary:message"));
String paramName = GetterUtil.getString((String)request.getAttribute("liferay-asset:asset-tags-summary:paramName"), "tag");
PortletURL portletURL = (PortletURL)request.getAttribute("liferay-asset:asset-tags-summary:portletURL");

if (assetTagNames.length == 0) {
	List<AssetTag> tags = (List<AssetTag>)request.getAttribute("liferay-asset:asset-tags-summary:assetTags");

	if (ListUtil.isEmpty(tags)) {
		tags = AssetTagServiceUtil.getTags(className, classPK);
	}

	assetTagNames = ListUtil.toArray(tags, AssetTag.NAME_ACCESSOR);
}

      out.write('\n');
      out.write('\n');
if (
 assetTagNames.length > 0 ) {
      out.write("\n");
      out.write("\t<span class=\"taglib-asset-tags-summary\">\n");
      out.write("\t\t");
      out.print( Validator.isNotNull(message) ? (LanguageUtil.get(resourceBundle, message) + ": ") : "" );
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
if (
 portletURL != null ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				for (int i = 0; i < assetTagNames.length; i++) {
					portletURL.setParameter(paramName, assetTagNames[i]);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a class=\"label label-lg label-secondary text-uppercase\" href=\"");
      out.print( HtmlUtil.escape(portletURL.toString()) );
      out.write('"');
      out.write('>');
      out.print( assetTagNames[i] );
      out.write("</a>\n");
      out.write("\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				for (int i = 0; i < assetTagNames.length; i++) {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  clay:label
      com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag _jspx_th_clay_label_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.LabelTag();
      _jspx_th_clay_label_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_label_0.setParent(null);
      _jspx_th_clay_label_0.setDisplayType("secondary");
      _jspx_th_clay_label_0.setLabel( assetTagNames[i] );
      _jspx_th_clay_label_0.setLarge( true );
      _jspx_th_clay_label_0.setTranslated( false );
      int _jspx_eval_clay_label_0 = _jspx_th_clay_label_0.doStartTag();
      if (_jspx_th_clay_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
        _jspx_th_clay_label_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_label_0);
      _jspx_th_clay_label_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t</span>\n");
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
}
