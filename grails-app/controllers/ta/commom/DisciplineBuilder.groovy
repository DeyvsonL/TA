package ta.commom

import ta.Discipline

class DisciplineBuilder implements IDisciplineBuilder {

	private Discipline _Discipline

	public void createDiscipline() {
		_Discipline = new Discipline()
	}

	public Discipline getDiscipline() {
		return _Discipline
	}

	@Override
	String getDisciplineName() {
		return _Discipline.name
	}

	@Override
	String getDisciplineCode() {
		return _Discipline.code
	}

	@Override
	void setDisciplineName(String name) {
		_Discipline.name = name
	}

	@Override
	void setDisciplineCode(String code) {
		_Discipline.code = code
	}
}