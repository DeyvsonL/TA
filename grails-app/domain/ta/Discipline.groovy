package ta

class Discipline {
	String code
	String name

	static constraints = {
        code blank: false
		code blank: false
    }

	public boolean equals(Discipline discipline){
    	return this.code.equals(discipline.code) && this.name.equals(discipline.name)
	}

}