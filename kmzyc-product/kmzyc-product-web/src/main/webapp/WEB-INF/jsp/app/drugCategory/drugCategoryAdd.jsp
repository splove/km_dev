<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.pltfm.sys.util.StaticParams"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新品牌</title>

<link href="/etc/css/style_app.css" type="text/css" rel="stylesheet">

<link href="/etc/css/opendiv-normal.css" rel="stylesheet"
	type="text/css" />
<script src="/etc/js/jquery-latest.pack.js"></script>
<script src="/etc/js/dialog.js"></script>
<Script src="/etc/js/97dater/WdatePicker.js"></Script>
<script src="/etc/js/jquery-1.8.3.js"></script>

<link href="/etc/css/validate.css" type="text/css" rel="stylesheet">
<script type="text/javascript"  src="/etc/js/validate/jquery.validate.js"></script>
<script type="text/javascript"  src="/etc/js/validate/jquery.metadata.js"></script>
<script type="text/javascript"  src="/etc/js/validate/messages_cn.js"></script>
</head>
<body>

<!-- 导航栏 -->
<s:set name="parent_name" value="'基础数据'" scope="request"/>
<s:set name="name" value="'品类管理'" scope="request"/>
<s:set name="son_name" value="'品类添加'" scope="request"/>
<jsp:include page="/WEB-INF/jsp/common/title.jsp"></jsp:include>
<s:form action="/basedata/drugCategoryAdd.action" method="POST"
	namespace='/basedata' id="frm" name="frm">
<s:token></s:token>


	<!-- 数据编辑区域 -->
	<table width="65%" class="edit_table" align="center" cellpadding="3"
		cellspacing="0" border="1" bordercolor="#C7D3E2"
		style="border-collapse: collapse; font-size: 12px;">
		<!-- error message -->
		<s:if test="rtnMessage != null">
			<tr>
				<td colspan="2" align="center"><font color="red"><s:property
					value='rtnMessage' /></font></td>
			</tr>
		</s:if>
		<tr>
			<th colspan="2" align="left" class="edit_title">基本信息</th>
		</tr>
		<tr>
			<th align="right" class="eidt_rowTitle"><font color="red">*</font>名称：</th>
			<td><input class="input_style" name="drugCate.name" maxlength="20" type="text" 
				value="<s:property value='drugCate.name'/>" /></td>
		</tr>
		<tr>
			<th align="right" class="eidt_rowTitle">是否有效：</th>
			<td>
				<select name="drugCate.status">
					<option value="1">是</option>
					<option value="0">否</option>
				</select>
			</td>
		</tr>
		<tr>
			<th align="right" class="eidt_rowTitle">备注：</th>
			<td><textarea name="drugCate.remark" cols="50" rows="4" wrap="PHYSICAL"><s:property
				value='drugCate.remark' /></textarea></td>
		</tr>
	</table>

	<!-- 底部 按钮条 -->
	<table width="55%" align="center" class="edit_bottom" height="30"
		border="0" cellpadding="0" cellspacing="0" style="font-size: 12px;">
		<tr>
			<td align="center"><INPUT class="saveBtn" TYPE="submit"
				value="">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
				<input type="button" class="backBtn" onclick="gotoList()" />
			<td width="20%" align="center"></td>
		</tr>
	</table>

	<br>
	<br>

</s:form>


<SCRIPT LANGUAGE="JavaScript"><!--
	function gotoList() {
		location.href = "/basedata/drugCategoryShow.action";
	}
	
	
$(function(){
	$("#frm").validate({
		rules: {
			"drugCate.name":{required:true,maxlength:50,unusualChar:true,checkRepeatName:true},
			"drugCate.remark":{maxlength:200,unusualChar:true}
	    	},
		success: function (label){
			label.removeClass("checked").addClass("checked");
		}
   });
	
	
	jQuery.validator.addMethod("checkRepeatName", function(value, element) {
		var flag = true;
		$.ajax({
				async:false,
				url:"/basedata/drugCategoryCheckRepeatName.action",
				type:"post",
				data:{repeatName:value},
				success:function(data){
					if(data=="repeat"){
						element.select();
						flag = false;
					}
				}
		});
		return flag;
	}, "该品类名已存在，请重新命名！");
	
});
	
</SCRIPT>


</BODY>
</HTML>


