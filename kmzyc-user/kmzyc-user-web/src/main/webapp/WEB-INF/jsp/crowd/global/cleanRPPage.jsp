<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/etc/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/etc/js/jquery.validate.js"></script>
<script type="text/javascript" src="/etc/js/jquery.metadata.js"></script>
<script type="text/javascript" src="/etc/js/messages_cn.js"></script>
<link href="/etc/css/style_app.css" type="text/css" rel="stylesheet">
<title>微商红包清理</title>
</head>
<s:set name="parent_name" value="'微商518活动'" scope="request" />
<s:set name="name" value="'红包清理'" scope="request" />
<jsp:include page="/WEB-INF/jsp/common/title.jsp"></jsp:include>
<body>
	<s:form >
		<table width="98%" class="list_table" align="center" cellpadding="3"
			cellspacing="0" border="0" bordercolor="#C1C8D2">
			<tr style="border: 0px">
				<td></td>
				<td><input type="button" value="清理红包"
					style="text-align: left" id="subBtn" /></td>
			</tr>
		</table>
	</s:form>
</body>
<script type="text/javascript">	
	function ajaxSubmit() {
		$.ajax({
			type : 'post',
			dataType : 'json',
			url : "/crowd/cleanMicroRP.action",
			data : $("#globalSettingForm").serialize(),
			async : false,
			success : function(data) {
				var code = data.code;
				if (code == 0) {
					alert("保存成功");
					window.location.href = window.location.href;
				} else {
					alert(data.module);
					return;
				}
			}
		})
	}

	$(function() {
		$("#subBtn").click(function() {
				//ajaxSubmit();
			window.location.href='/crowd/cleanMicroRP.action';
		});
	})
</script>

</html>