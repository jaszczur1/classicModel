<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="Spring" uri="http://www.springframework.org/tags" %>

<f:view xmlns="http://www.w3c.org/1999/xhtml"
        xmlns:f="http://java.sun.com/jsf/core"
        xmlns:h="http://java.sun.com/jsf/html"/>

<html>
    <h:head>
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
        <title>TO-DO application</title>
    </h:head>


    <body>
        <h2>Hello World!</h2>

        <c:if test="${empty edit}">
            <table>
                <tr>
                    <th>name</th>
                    <th>email</th>
                    <th>action</th>
                </tr>

                <c:forEach items="${allEmployee}" var="e">
                    <tr>
                        <td>  
                            <c:out value="${e.getFirstName()}"></c:out>
                            </td> 
                            <td>
                            <c:out value="${e.getEmail()}"></c:out>
                            </td>
                            <td>      
                                <input value="edit" TYPE='button' onClick="parent.location = 'edit?email=${e.getEmail()}'">
                                <input value="remove" type="button" onclick="parent.location = 'remove/?email=${e.getEmail()}'">
                                    </td>
                                    </tr>
                                </c:forEach>
                                </table>
                            </c:if>





                            <c:if test="${not empty editEmployee or not empty newEmployee}">



                                <form:form method="POST" modelAttribute="editEmployee">

                                    <label for="lastName">Last name</label>
                                    <form:input path="lastName" />
                                    <form:input path="firstName" />
                                    <form:input path="Email" />
<!--
                                    <form:select path="OfficeCode">
                                     
                                        <form:options items="" /> 
                                      
                                    </form:select>
-->

                                    <form:button type="submit" value="ok" method="POST" />
                                </form:form>




                            </c:if>







                            </body>
                            </html>
