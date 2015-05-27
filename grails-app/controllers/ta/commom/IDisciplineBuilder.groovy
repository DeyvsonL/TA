package ta.commom

import ta.Discipline

public interface IDisciplineBuilder {

	public void createDiscipline()
	public Discipline getDiscipline()
	public String getDisciplineName()
	public String getDisciplineCode()
	public void setDisciplineName(String name)
	public void setDisciplineCode(String code)

}