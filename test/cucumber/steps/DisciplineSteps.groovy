package steps

/**
 * Created by Deyvson on 18/04/2015.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

import ta.*
import pages.*
import static cucumber.api.groovy.EN.*

Given(~'^I do not have a Discipline with the code "([^"]*)"$') { String code ->
    discipline = Discipline.findByCode(code)
    assert discipline == null
}

Given(~'^I do not have a Discipline with the name "([^"]*)"$') { String name ->
    discipline = Discipline.findByName(name)
    assert discipline == null
}

When(~'^I create the Discipline "([^"]*)" with the name "([^"]*)"$') { String code, String name ->
    def dcController = new DisciplineController()
    dcController.builder.createDiscipline()
    dcController.builder.setDisciplineCode(code)
    dcController.builder.setDisciplineName(name)
    def discipline = dcController.builder.getDiscipline()

    dcController.saveDiscipline(discipline)
}

Then(~'^I gonna be the Discipline of code "([^"]*)" whit the name "([^"]*)"$'){ String code, String name ->
    discipline = Discipline.findByCode(code)
    disciplineII = Discipline.findByName(name)
    assert discipline != null
    assert disciplineII != null
    assert discipline.equals(disciplineII)
}

Given(~'^i am on register Discipline page$') { ->
    to DisciplinePage
    at DisciplinePage
}

When(~'^I fill in field code with "([^"]*)"$') { String code ->
    page.code.value(code)
}

When(~'^I fill in field name with "([^"]*)"$') { String name ->
    page.name.value(name)
}

When(~'^ I press "([^"]*)" $') { String pressed ->
    page.click(pressed)
}

Then(~'I should see the Discipline of code "([^"]*)" with the name "([^"]*)" in the page listDiscipline$') { String value, String valueII ->
    assert(page.code.equals(value))
    assert(page.name.equals(valueII))
}