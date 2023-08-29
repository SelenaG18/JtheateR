package Model;

public class Regular extends Member{
	
	private String generateRegularID;
	private Integer queueRegular;
	
	
	public Regular(String name, String gender, String phoneNumber, String memberStatus, Integer poin,
			String generateRegularID, Integer queueRegular) {
		super(name, gender, phoneNumber, memberStatus, poin);
		this.generateRegularID = generateRegularID;
		this.queueRegular = queueRegular;
	}
	public String getGenerateRegularID() {
		return generateRegularID;
	}
	public void setGenerateRegularID(String generateRegularID) {
		this.generateRegularID = generateRegularID;
	}
	public Integer getQueueRegular() {
		return queueRegular;
	}
	public void setQueueRegular(Integer queueRegular) {
		this.queueRegular = queueRegular;
	}
	@Override
	public Integer calculatePoint() {
		int finalPoin = getPoin() + getName().length();
		return finalPoin;
	}

	

}
