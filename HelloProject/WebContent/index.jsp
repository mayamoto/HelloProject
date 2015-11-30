<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>

<title>Hello Project</title>

  <body>
  	<a>下のリンクをクリックしてください！</a><br><br>
    <a href="Hello.action">こんにちは！</a></br>
    <a href="Research.action">アンケート</a></br>
    <br></br>
    <s:submit type="image" src="images/snoopy.png"/>
    <s:property value="replyMsg"/>
  </body>
</head>