<%@ page import="ta.Discipline" %>



<div class="fieldcontain ${hasErrors(bean: disciplineInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="discipline.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" required="" value="${disciplineInstance?.code}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: disciplineInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="discipline.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${disciplineInstance?.name}"/>

</div>

