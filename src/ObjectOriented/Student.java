package ObjectOriented;

public class Student {
	
	private String name;
	private int rollno;
	private int maths;
	private int english;
	private int science;
	
	public Student(String name, int rollno, int maths, int english, int science) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.maths = maths;
		this.english = english;
		this.science = science;
	}
	
	public int getTotalMarks()
	{
		return maths+english+science;
	}
	public int getAverageMarks()
	{
		return getTotalMarks()/3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + english;
		result = prime * result + maths;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		result = prime * result + science;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (english != other.english)
			return false;
		if (maths != other.maths)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		if (science != other.science)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", maths=" + maths + ", english=" + english
				+ ", science=" + science + "]";
	}
	
	
	

}
