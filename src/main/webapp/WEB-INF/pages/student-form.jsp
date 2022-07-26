<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta CHARSET="UTF-8">
    <title>Student form</title>
</head>

<body>
    <%--@elvariable id="student" type="com.spring.demo.springmvcjspdemo.model.Student"--%>
    <form:form action="processForm" modelAttribute="student">

        First name = <form:input path="firstName"/>

        <br><br>

        Last name = <form:input path="lastName"/>

        <br><br>

        Country:

        <%--<form:select path="country">
            <form:option value="Brazil" label="Brazil"/>
            <form:option value="France" label="France"/>
            <form:option value="Germany" label="Germany"/>
            <form:option value="India" label="India"/>
        </form:select>--%>

        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>

        <br><br>

        Java <form:radiobutton path="favouriteLanguage" value="Java" />
        C# <form:radiobutton path="favouriteLanguage" value="C#" />
        PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />

        <br><br>

        OS:

        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>

        <br><br>

        <input type="submit" value="Submit">

    </form:form>
</body>
</html>