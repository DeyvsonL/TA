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
}