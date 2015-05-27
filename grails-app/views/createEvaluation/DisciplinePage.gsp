<%@ page import="ta.Discipline" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Cadastrar disciplina</title>
</head>
<body>

	<div id="messageBox">
		<p id="messageBoxText">${pageMessage}</p>
	</div>

	<g:form >
		<g:textField name="code" value="${ta.Discipline.code}" />
		<g:inputText name="name" value="${ta.Discipline.name}" />
		<g:actionSubmit name="save" value="${ta.DisciplineController.save(ta.Discipline)}"/>
	</g:form>
</body>
</html>