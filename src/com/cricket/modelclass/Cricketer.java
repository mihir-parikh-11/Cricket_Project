package com.cricket.modelclass;

public class Cricketer {

	private long id;
	private String cricketerName;
	private String teamName;
	private String birthDate;
	private long phoneNumber;
	private String typeOfCricketer;

	public Cricketer(long id, String cricketerName, String teamName, String birthDate, long phoneNumber,
			String typeOfCricketer) {
		super();
		this.id = id;
		this.cricketerName = cricketerName;
		this.teamName = teamName;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.typeOfCricketer = typeOfCricketer;
	}

	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", cricketerName=" + cricketerName + ", teamName=" + teamName + ", birthDate="
				+ birthDate + ", phoneNumber=" + phoneNumber + ", typeOfCricketer=" + typeOfCricketer + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCricketerName() {
		return cricketerName;
	}

	public void setCricketerName(String cricketerName) {
		this.cricketerName = cricketerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTypeOfCricketer() {
		return typeOfCricketer;
	}

	public void setTypeOfCricketer(String typeOfCricketer) {
		this.typeOfCricketer = typeOfCricketer;
	}

}
