<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>

<title>確認</title>
</head>

<body>
<s:form action="download">
名前：<s:property value="name"/><br/>
メールアドレス：<s:property value="email"/><br/>
年齢：<s:property value="age"/></br>
好きなキャラクター：<s:property value="characterName"/></br>

<s:hidden name="name"/>
<s:hidden name="email"/>
<s:hidden name="age"/>
<s:hidden name="character"/>


<s:submit value="戻る" />
</s:form>
</body>
</html>