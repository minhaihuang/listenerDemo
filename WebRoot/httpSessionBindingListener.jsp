<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="minhaihuang.listener.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <!-- 这是用来测试session的HttpSessionBindingListener（绑定与解绑）的监听器 -->
	<%
	 Person person=new Person();
	 session.setAttribute("person", person);
	 %>
</body>
</html>