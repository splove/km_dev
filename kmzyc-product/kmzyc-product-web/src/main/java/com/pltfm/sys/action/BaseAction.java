package com.pltfm.sys.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pltfm.sys.model.SysUser;
import com.kmzyc.commons.page.Page;

/**
 * 基于Struts2的Action基类
 * 
 * @author    
 * @since 1.0
 * @see ActionSupport, ServletRequestAware, ServletResponseAware
 */
public abstract class BaseAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = 3969174020787506280L;

	/**
	 * request对象
	 */
	private HttpServletRequest httpServletRequest;

	/**
	 * response对象
	 */
	private HttpServletResponse httpServletResponse;

	/**
	 * web根路径
	 */
	private String webPath;

	/**
	 * 分页对象
	 */
	private Page page = new Page();

	/**
	 * 当前登录的用户对象
	 */
	private SysUser loginUser;

	/**
	 * 当前登录的用户对象Id
	 */
	private Long loginUserId;

	/**
	 * operateResult.jsp 成功提示页面，转跳的URL设置
	 */
	private String redirectURL;

	/**
	 * 在构造方法中将operator从session中取出
	 */
	public BaseAction() {
		this.httpServletRequest=ServletActionContext.getRequest();
	}

	/**
	 * 将异常信息添加到actionError中
	 * 
	 * @param e
	 *            异常的处理，包括上层Dao,Service抛出的异常及Action本层抛出的异常处理
	 */
	public void actionExceptionHandle(Exception e) {
		this.addActionError(" " + "。("
				+ e.getMessage() + ")");
	}

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}

	public HttpServletResponse getHttpServletResponse() {
		return httpServletResponse;
	}

	public String getWebPath() {
		webPath = httpServletRequest.getContextPath();
		return webPath;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.httpServletResponse = httpServletResponse;
	}

	public SysUser getLoginUser() {
		return (SysUser) getHttpServletRequest().getSession().getAttribute(
				"userInfo");
	}

	public Integer getLoginUserId() {
		SysUser userObj = getLoginUser();
		if (userObj != null) {
			return userObj.getUserId();
		}
		return 0;
	}

	public String getRedirectURL() {
		return redirectURL;
	}

	public void setRedirectURL(String redirectURL) {
		this.redirectURL = redirectURL;
	}
}