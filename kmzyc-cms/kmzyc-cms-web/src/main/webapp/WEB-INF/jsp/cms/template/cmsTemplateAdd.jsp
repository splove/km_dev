<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加模板</title>
<link href="/etc/css/style_app.css" type="text/css" rel="stylesheet">
<script type="text/javascript"  src="/etc/js/jquery-1.8.3.js"></script>
<script type="text/javascript"  src="/etc/js/checkeds.js"></script>
<script src="/etc/js/dialog.js"></script>
<link href="/etc/css/opendiv-normal.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"  src="/etc/js/jquery.validate.js"></script>
<script type="text/javascript"  src="/etc/js/messages_cn.js"></script>

<link rel="stylesheet" href="/etc/js/codemirror/codemirror.css">
<link rel="stylesheet" href="/etc/js/codemirror/fullscreen.css">
<link rel="stylesheet" href="/etc/js/codemirror/erlang-dark.css">
<script src="/etc/js/codemirror/codemirror.js"></script>
<script src="/etc/js/codemirror/xml.js"></script>
<script src="/etc/js/codemirror/fullscreen.js"></script>
<script src="/etc/js/codemirror/userdefined.js"></script>
 
</head>
<body>
 
 <!-- 导航栏 -->
 <script>
 $(document).ready(function(){
 
 
 	$("#addTemplateForm").validate({
         rules: {
				"cmsTemplate.name": {required:true,unique:true,maxlength:42},
				"cmsTemplate.theme":{required:true,maxlength:42},
				"cmsTemplate.content":{required:true},
				"cmsTemplate.remark":{maxlength:84}
	        	},
	     success: function (label){
	            label.removeClass("checked").addClass("checked");
	            }
          });
 });
</script>
 

<style type="text/css">
.listTitle{height:40px;line-height:40px;background:#c7e3f1;border-bottom:1px solid #c7e3f1;vertical-align:middle;font-size:14;color:#333;margin:0}
.listTitle span{padding-left:20px;height:30px;line-height:30px;vertical-align:middle;margin-top:5px}
.listTitle span img{vertical-align:middle}
</style>
<!-- 导航栏 -->
<div width="100%" class="listTitle"  height="40">
    <span>
	<img src="/etc/images/icon_02.png"  />&nbsp;&nbsp;
		<img src="/etc/images/icon_08.png" />&nbsp;&nbsp;基础功能&nbsp;&nbsp;
		<img src="/etc/images/icon_08.png" />&nbsp;&nbsp;模板管理&nbsp;&nbsp;
		<img src="/etc/images/icon_08.png" />&nbsp;&nbsp;添加模板
	  </span>
</div>
<div  style="height:90%;" >
<s:form id="addTemplateForm" name="addTemplateForm" action="/cms/cmsTemplateAction_addTemplate.action" method="POST" enctype="multipart/form-data">
<s:token></s:token>
<input type="hidden" name="pid" value="<s:property value="pid"/>" />
<input type="hidden" value="<s:property value="path"/>" name="path"/>
<input type="hidden" name="page.pageNo" id="pageNo" value="<s:property value="pageNo"/>"/>
<!-- keyWords -->
<input type="hidden" name="keyWords.id_keyword" value="<s:property value='keyWords.id_keyword'/>">
<input type="hidden" name="keyWords.name_keyword" value="<s:property value='keyWords.name_keyword'/>">
<input type="hidden" name="keyWords.theme_keyword" value="<s:property value='keyWords.theme_keyword'/>">
<input type="hidden" name="keyWords.status_keyword" value="<s:property value='keyWords.status_keyword'/>"/>
<input type="hidden" name="keyWords.pageNo" value="<s:property value='keyWords.pageNo'/>">
<input type="hidden" name="keyWords.pageSize" value="<s:property value='keyWords.pageSize'/>"/>
<input type="hidden" name="keyWords.type_keyword" value="<s:property value='keyWords.type_keyword'/>">
<!-- hidden properties -->
<INPUT TYPE="hidden" name="isEnable" value="1">
<!-- 数据编辑区域 -->
<table width="95%" class="edit_table" cellpadding="3" cellspacing="0" border="1" bordercolor="#C7D3E2" style="border-collapse: collapse">

	<tr> 
		<th colspan="2" align="left" class="edit_title">模板信息</th>
	</tr>
	<!-- error message -->
	<tr> 
		<td width="20%" align="right"><font color="red">*</font>模板名称：</td>
		<td width="80%">
			<input name="cmsTemplate.name" id="name" type="text" value="" class="templateName"/>
		</td>
	</tr>
    <tr> 
		<td width="20%" align="right"><font color="red">*</font>模板主题：</td>
		<td width="80%"> 
			<input name="cmsTemplate.theme" id="theme" type="text" value="" class="newWidth"/>
		</td>
	</tr>
	<tr> 
		<td width="20%" align="right"><font color="red">*</font>状态：</td>
		<td width="80%">
			<select name="cmsTemplate.status">
	        <option value="0" selected="selected">有效</option>
	        <option value="1">无效</option>
	        </select>
		</td>
	</tr>
	<tr> 
		<td width="20%" align="right"><font color="red">*</font>模板类型：</td>
		<td width="80%">
			<select name="cmsTemplate.type">
	        <option value="0" selected="selected">窗口模板</option>
	        <option value="1">页面模板</option>
	        <option value="2">供应商广告模板</option>
	        <option value="3">活动模板</option>
	        <option value="4">资讯模板</option>
	        <option value="5">帮助模板</option>
	        <option value="6">移动端模板</option>
	        <option value="9">商家入驻模板</option>
	        <option value="7">窄版静态专题页模板</option>
	        <option value="8">宽版静态专题页模板</option>
	        <option value="10">广告模板</option>
	        <option value="11">招商帮助模板</option>
	      <!--    <option value="15">抽奖模板</option>
            <option value="16">抽奖窗口模板</option>-->
            <option value="17">招商入驻</option>
            <option value="18">合作模式</option>
            <option value="19">商家规则</option>
            <option value="20">商家店铺</option>
            <option value="21">活动中心</option>
            <option value="22">商户服务</option>
            <option value="24">中药城帮助中心模板</option>
            <option value="23">活动中心帮助模板</option>
            
	        </select>
		</td>
	</tr>

	<tr> 
		<td width="20%" align="right"><font color="red">*</font>模板内容：</td>
		
		<td width="80%"> 
			当光标在编辑器中，按F11键切换全屏幕编辑。ESC可退出全屏幕编辑。
		</td>
	</tr>
	<tr> 
		<td colspan="2">
			<textarea   name="cmsTemplate.content" id="content" cols="100" rows="8" style="height:300px;"><s:property value="cmsPage.content"/></textarea>
		</td>
	</tr>
	
	<tr> 
		<td width="20%" align="right">备注：</td>
		<td width="80%"> 
			<textarea name="cmsTemplate.remark" id="remark"></textarea>
		</td>
	</tr>
</table>


<!-- 底部 按钮条 -->
<table width="60%"  class="edit_bottom" height="30" border="0" cellpadding="0" cellspacing="0">
	<tr> 
		<td align="left">
			<INPUT class="saveBtn" TYPE="submit" value="">
            &nbsp;&nbsp;
			<input class="backBtn"  onclick="gotoList()" type="button" value="">
		</td>
		<td width="20%" align="center"></td>
	</tr>
</table>

<br><br>

</s:form>

</div>

</BODY>
<script type="text/javascript">
//名字惟一性
jQuery.validator.addMethod("unique", function(value, element) {
 		var ok="";
	 	$.ajax({
	 		url:"/cms/cmsTemplateAction_check.action",
	 		async:false,
	 		data:{"cmsTemplate.name":value},
        	type:'post',
	 		success:function(result)
	 		{
	 			if(result=="success")
	 			{
	 				ok="success";
	 			}
	 			else if(result=="fail")
	 			{
	 				ok="fail";
	 			}
	 		}
	 	});
	 	if(ok=="fail")
	 	{
	 		return false;
	 	}else
	 	{
	 		return true;
	 	}
}, "该名字已存在!");
//返回
 function gotoList(){
 	//var pageNo=$("#pageNo").val();
	//location.href="/cms/cmsTemplateAction_queryTemplate.action";
	var pageForm= window.document.getElementById("addTemplateForm");
 	pageForm.action="/cms/cmsTemplateAction_queryTemplate.action";
 	pageForm.submit();
 }
</script>
</HTML>