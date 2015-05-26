package steps

import ta.Evaluation
import ta.EvaluationController

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

/*
Given the system has no evaluation entitled "Git evaluation" stored
When I create an evaluation entitled "Git evaluation"
Then the evaluation "Git evaluation" should be stored in the system
*/

//Given the system has no evaluation entitled "Git evaluation" stored
Given (~'^the system has no evaluation entitled "([^"]*)" stored$') { String evaluationTitle ->
	assert Evaluation.findByTitle(evaluationTitle) == null
}

//When I create an evaluation entitled "Git evaluation"
When (~'^I create an evaluation entitled "([^"]*)"$') { String evaluationTitle ->
	def evController = new EvaluationController()
	evController.builder.createEvaluation()
	evController.builder.setEvaluationTitle(evaluationTitle)
	def evaluation = evController.builder.getEvaluation()

	evController.saveEvaluation(evaluation)
}

//Then the evaluation "Git evaluation" should be stored in the system
Then (~'^the evaluation "([^"]*)" should be stored in the system$') { String evaluationTitle ->
	assert Evaluation.findByTitle(evaluationTitle) != null
}