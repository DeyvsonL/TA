<%@ page import="ta.Evaluation" %>



<div class="fieldcontain ${hasErrors(bean: evaluationInstance, field: 'title', 'error')} required">
    <label for="title">
        <g:message code="evaluation.title.label" default="Title"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="title" required="" value="${evaluationInstance?.title}"/>

</div>

