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

<title>アンケート</title>
<body>
<a>下記フォームに入力をしてください。</a><br><br>

<s:actionerror />
<s:form action="ResearchConfirm">
<s:textfield label="名前" name="name"/>
<s:textfield label="メールアドレス" name="email"/>
<s:textfield label="年齢" name="age"/>
<s:radio label="好きなキャラクター" name="character" list="#{'1':'スヌーピー', '2':'アンパンマン', '3':'ふなっしー'}"/>
<s:submit type="image" src="images/snoopy_2.png"/>

<s:hidden name="characterName"/>

<s:submit value="確認"/>
</s:form>
</body>

</head>
</html>