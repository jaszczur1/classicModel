<%-- 
    Document   : newjsp
    Created on : 2019-01-29, 23:18:00
    Author     : michal
--%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<f:view xmlns="http://www.w3c.org/1999/xhtml"
        xmlns:f="http://java.sun.com/jsf/core"
        xmlns:h="http://java.sun.com/jsf/html"/>


<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>hello world!
        </h1>
        
        
        <form:select path="testcik"> 
      <c:forEach items="${test1}" var="f">

          <form:option value="${f}">${f}</form:option>

        </c:forEach>
        </form:select>
        
    </body>
</html>
