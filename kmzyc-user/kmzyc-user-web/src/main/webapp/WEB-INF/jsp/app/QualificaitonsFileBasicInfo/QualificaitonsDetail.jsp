<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.pltfm.sys.util.StaticParams"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>修改采购商管理</title>
		<link href="/etc/css/style_app.css" type="text/css" rel="stylesheet">
		<link href="/etc/css/opendiv-normal.css" rel="stylesheet"type="text/css" />
			<link type="text/css" href="/etc/js/ueditor/themes/default/css/ueditor.css"/>
		
</script>
		<script type="text/javascript" src="/etc/js/jquery-1.8.3.js">
</script>
		<script type="text/javascript" src="/etc/js/jquery.validate.js">
</script>
		<script type="text/javascript" src="/etc/js/jquery.metadata.js">
</script>
		<script type="text/javascript" src="/etc/js/messages_cn.js">
</script>
		<Script src="/etc/js/97dater/WdatePicker.js"></Script>
		<script src="/etc/js/dialog.js">
</script>
	 <script type="text/javascript" src="/etc/js/ueditor/ueditor.config.js">  </script>
	 	 <script type="text/javascript" src="/etc/js/ueditor/ueditor.all.js">  </script>
 

		<script type="text/javascript">
 
   
 


</script>
	</head>

	<body>
		<!-- 导航栏 -->
		<s:set name="parent_name" value="'采购商管理'" scope="request" />
		<s:set name="name" value="'采购资格管理'" scope="request" />
		<s:set name="son_name" value="'详情'" scope="request" />
		<jsp:include page="/WEB-INF/jsp/common/title.jsp"></jsp:include>
		<div style="height: 90%; overflow-y: scroll;">
			<INPUT TYPE="hidden" name="isEnable" value="1">
			<s:form action="/qualificaitonsFile/qualificaitonsFile_qualificaitonsFileEdit.action" id="qualificaitonsFileEditForm"
				method="POST" namespace='qualificaitonsFileEditForm'  name="qualificaitonsFileEditForm">
				<s:token/>
				<!-- 数据编辑区域 -->
				<table width="80%" class="edit_table" cellpadding="3"
					cellspacing="0" border="1" bordercolor="#C7D3E2"
					style="border-collapse: collapse">
					<!-- error message -->
					<s:if test="rtnMessage != null">
						<tr>
							<td colspan="2" align="center">
								<font color="red"><s:property value='rtnMessage' /> </font>

							</td>
						</tr>
					</s:if>
					
						<tr>
						<td width="20%" align="right">
							 用户名：
						</td>
						<td width="80%">
						 <s:property value='qualificaitonsDO.userName' />

						</td>
					</tr>
					<tr>
						<td width="20%" align="right">
							 资格类型：
						</td>
						<td width="80%">
			
               <s:if test="qualificaitonsDO.type==0">普通</s:if>
		    <s:if test="qualificaitonsDO.type==1">OTC</s:if>
		     <s:if test="qualificaitonsDO.type==2">医疗器械</s:if>
		       <s:if test="qualificaitonsDO.type==3">处方药</s:if>		 

						</td>
					</tr>
							<tr>
						<td width="20%" align="right">
							 创建日期：
						</td>
						<td width="80%">
						 	<s:date name="qualificaitonsDO.createDate"  format="yyyy-MM-dd HH:mm:ss" />	
						</td>
					</tr>
					
							<tr>
						<td width="20%" align="right">
						  修改日期：
						</td>
						<td width="80%">
				 	<s:date name="qualificaitonsDO.modifyDate"  format="yyyy-MM-dd HH:mm:ss" />	
						</td>
					</tr>
					
							<TR>
					 <td width="20%" align="right"> 有效日期：</td>
 	 	 
 	 	 <td width="80%">
 	 	 	<s:date name="qualificaitonsDO.validDate"  format="yyyy-MM-dd" />	
 	 	 </td>
					</TR>
			 
			 
					<tr >
						<td width="20%" align="right">
							 状态：
						</td>
						<td width="80%">
						
						      <s:if test="qualificaitonsDO.status==0">无效</s:if>
		    <s:if test="qualificaitonsDO.status==1">有效</s:if>
	  

 						</td>
					</tr>
			 
			
					 

				 
				 
					
				</table>


				<!-- 底部 按钮条 -->
				<table width="60%" class="edit_bottom" height="30" border="0"
					cellpadding="0" cellspacing="0">
					<tr>
						<td align="left">
				  
							<input class="backBtn" onclick="gotoList()" type="button"
								value=" ">
						</td>
						<td width="20%" align="center"></td>
					</tr>
				</table>

				<br>
				<br>

			</s:form>
		</div>
		<SCRIPT LANGUAGE="JavaScript">
<!--
function gotoList(){
    location.href="/qualificaitons/qualificaitons_pageList.action";
}

 



</SCRIPT>
	</BODY>
</HTML>