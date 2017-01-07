package km_Views;

public class EducationDiaryDayView {
	private int educationDiaryID;
	//day
	private int dayID;
	private String dayName;
	
	//activity
	private int activityID;
	private String activityDescription;
	private String activityDuration;
	
	public EducationDiaryDayView(){}
	public EducationDiaryDayView(km_Entities.EducationDiaryDay educationDiaryDay){}
	public EducationDiaryDayView(int educationDiaryID, int dayID, String dayName, int activityID,
			String activityDescription, String activityDuration) {
		super();
		this.educationDiaryID = educationDiaryID;
		this.dayID = dayID;
		this.dayName = dayName;
		this.activityID = activityID;
		this.activityDescription = activityDescription;
		this.activityDuration = activityDuration;
	}
	
	public km_Entities.EducationDiaryDay parseEducationDiaryDay(){return null;}
	public km_Entities.Day parseDay(){return null;}
	public km_Entities.Activity parseActivity(){return null;}
	
	public int getEducationDiaryID() {
		return educationDiaryID;
	}
	public void setEducationDiaryID(int educationDiaryID) {
		this.educationDiaryID = educationDiaryID;
	}
	public int getDayID() {
		return dayID;
	}
	public void setDayID(int dayID) {
		this.dayID = dayID;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public int getActivityID() {
		return activityID;
	}
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}
	public String getActivityDescription() {
		return activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}
	public String getActivityDuration() {
		return activityDuration;
	}
	public void setActivityDuration(String activityDuration) {
		this.activityDuration = activityDuration;
	}
	
	
}
