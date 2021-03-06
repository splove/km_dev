<%@ page language="java" import="java.util.*,com.kmzyc.zkconfig.ConfigurationUtil" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"  %>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/common/wapTemplate.jsp">
    	<jsp:param name="titlePrefix" value="wap绑定管理"></jsp:param>
    </jsp:include>
    
    <!-- 单独引用myhome.css -->
    <link rel="stylesheet" href="<%=ConfigurationUtil.getString("cssAndJsPath")%>reswap/css/default/new2/css/myhome.css"/>
</head>
<body class="l-w1000">
	<!--顶部登陆条-->
	<jsp:include page="/html/common/wap/portal-head.jsp">
	     	<jsp:param name="pageTitle" value="绑定管理"></jsp:param>
	</jsp:include>
	<!-- 绑定管理 -->
	<tiles:insertDefinition name="wapBindManageContent"/>
    <!--底部-->
	<%@ include file="/html/common/wap/portal-foot.jsp" %>  
</body>
</html>
