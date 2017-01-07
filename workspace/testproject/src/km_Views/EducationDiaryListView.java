package km_Views;

public class EducationDiaryDayListView {
	private int educationDiaryList;
	private int week;
	private ClassView studentClass;
	private StudentView student;
	private EducationDiaryView diary;
	
	public EducationDiaryDayListView(){}
	public EducationDiaryDayListView(km_Entities.EducationDiaryList diaryList){}
	public EducationDiaryDayListView(int educationDiaryList, int week, ClassView studentClass, StudentView student,
			EducationDiaryView diary) {
		super();
		this.educationDiaryList = educationDiaryList;
		this.week = week;
		this.studentClass = studentClass;
		this.student = student;
		this.diary = diary;
	}

	public km_Entities.EducationDiaryList parseEducationDiaryList(){return null;}
	public int getEducationDiaryList() {
		return educationDiaryList;
	}
	public void setEducationDiaryList(int educationDiaryList) {
		this.educationDiaryList = educationDiaryList;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public ClassView getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(ClassView studentClass) {
		this.studentClass = studentClass;
	}
	public StudentView getStudent() {
		return student;
	}
	public void setStudent(StudentView student) {
		this.student = student;
	}
	public EducationDiaryView getDiary() {
		return diary;
	}
	public void setDiary(EducationDiaryView diary) {
		this.diary = diary;
	}
	
	
}
