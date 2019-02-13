<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
	<s:form action="HelloStrutsAction">
		<s:submit value="HelloStruts" />
	</s:form>

	<s:form action="WelcomeAction">
		<s:submit value="Welcome"/>
	</s:form>
<<<<<<< HEAD

	<s:form action="InquiryAction">
		<s:submit value="問い合わせ"/>
	</s:form>
=======
>>>>>>> f0deecaec06430166c5b22db5aa293d1fcf39f35
</body>
</html>