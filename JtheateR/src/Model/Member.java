package Model;

public abstract class Member {
	
	private String name;
	private String gender;
	private String phoneNumber;
	private String memberStatus;
	private Integer poin;

	public Member(String name, String gender, String phoneNumber, String memberStatus, Integer poin) {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.memberStatus = memberStatus;
		this.poin = poin;
	}
	
	public Integer getPoin() {
		return poin;
	}

	public void setPoin(Integer poin) {
		this.poin = poin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	
	public abstract Integer calculatePoint();

}
