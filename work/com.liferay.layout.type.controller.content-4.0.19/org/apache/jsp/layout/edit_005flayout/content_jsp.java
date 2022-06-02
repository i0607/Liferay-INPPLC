package org.apache.jsp.layout.edit_005flayout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.layout.content.page.editor.constants.ContentPageEditorPortletKeys;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/layout/edit_layout/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet-ext.tld");
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
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1ui_success_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1ui_success_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1ui_success_2(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');

String portletResource = ParamUtil.getString(request, "portletResource");

      out.write('\n');
      out.write('\n');
if (
 Validator.isNotNull(portletResource) ) {
      out.write('\n');
      out.write('	');
      //  liferay-ui:success
      com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
      _jspx_th_liferay$1ui_success_3.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_success_3.setParent(null);
      _jspx_th_liferay$1ui_success_3.setKey( portletResource + "requestProcessed" );
      _jspx_th_liferay$1ui_success_3.setMessage("your-request-completed-successfully");
      int _jspx_eval_liferay$1ui_success_3 = _jspx_th_liferay$1ui_success_3.doStartTag();
      if (_jspx_th_liferay$1ui_success_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_3);
        _jspx_th_liferay$1ui_success_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_3);
      _jspx_th_liferay$1ui_success_3.release();
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"layout-content portlet-layout\" id=\"main-content\" role=\"main\">\n");
      out.write("\t");
      //  liferay-portlet:runtime
      com.liferay.taglib.portletext.RuntimeTag _jspx_th_liferay$1portlet_runtime_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portletext.RuntimeTag.class) : new com.liferay.taglib.portletext.RuntimeTag();
      _jspx_th_liferay$1portlet_runtime_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_runtime_0.setParent(null);
      _jspx_th_liferay$1portlet_runtime_0.setPortletName( ContentPageEditorPortletKeys.CONTENT_PAGE_EDITOR_PORTLET );
      int _jspx_eval_liferay$1portlet_runtime_0 = _jspx_th_liferay$1portlet_runtime_0.doStartTag();
      if (_jspx_th_liferay$1portlet_runtime_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_runtime_0);
        _jspx_th_liferay$1portlet_runtime_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_runtime_0);
      _jspx_th_liferay$1portlet_runtime_0.release();
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      if (_jspx_meth_liferay$1ui_layout$1common_0(_jspx_page_context))
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

  private boolean _jspx_meth_liferay$1ui_success_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
    _jspx_th_liferay$1ui_success_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_success_0.setParent(null);
    _jspx_th_liferay$1ui_success_0.setKey("layoutAdded");
    _jspx_th_liferay$1ui_success_0.setMessage("the-page-was-created-successfully");
    int _jspx_eval_liferay$1ui_success_0 = _jspx_th_liferay$1ui_success_0.doStartTag();
    if (_jspx_th_liferay$1ui_success_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
      _jspx_th_liferay$1ui_success_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
    _jspx_th_liferay$1ui_success_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_success_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
    _jspx_th_liferay$1ui_success_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_success_1.setParent(null);
    _jspx_th_liferay$1ui_success_1.setKey("layoutPageTemplateAdded");
    _jspx_th_liferay$1ui_success_1.setMessage("the-page-template-was-created-successfully");
    int _jspx_eval_liferay$1ui_success_1 = _jspx_th_liferay$1ui_success_1.doStartTag();
    if (_jspx_th_liferay$1ui_success_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_1);
      _jspx_th_liferay$1ui_success_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_1);
    _jspx_th_liferay$1ui_success_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_success_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
    _jspx_th_liferay$1ui_success_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_success_2.setParent(null);
    _jspx_th_liferay$1ui_success_2.setKey("layoutPublished");
    _jspx_th_liferay$1ui_success_2.setMessage("the-page-was-published-successfully");
    int _jspx_eval_liferay$1ui_success_2 = _jspx_th_liferay$1ui_success_2.doStartTag();
    if (_jspx_th_liferay$1ui_success_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_2);
      _jspx_th_liferay$1ui_success_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_2);
    _jspx_th_liferay$1ui_success_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_layout$1common_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:layout-common
    com.liferay.taglib.ui.LayoutCommonTag _jspx_th_liferay$1ui_layout$1common_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.LayoutCommonTag.class) : new com.liferay.taglib.ui.LayoutCommonTag();
    _jspx_th_liferay$1ui_layout$1common_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_layout$1common_0.setParent(null);
    int _jspx_eval_liferay$1ui_layout$1common_0 = _jspx_th_liferay$1ui_layout$1common_0.doStartTag();
    if (_jspx_th_liferay$1ui_layout$1common_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_layout$1common_0);
      _jspx_th_liferay$1ui_layout$1common_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_layout$1common_0);
    _jspx_th_liferay$1ui_layout$1common_0.release();
    return false;
  }
}
