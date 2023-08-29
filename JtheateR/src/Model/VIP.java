package Model;

public class VIP extends Member{
	
	private String email;
	private String generateVIPID;
	private String generateLounge;
	private Integer queueVIP;
	
	public VIP(String name, String gender, String phoneNumber, String memberStatus, Integer poin, String email,
			String generateVIPID, String generateLounge, Integer queueVIP) {
		super(name, gender, phoneNumber, memberStatus, poin);
		this.email = email;
		this.generateVIPID = generateVIPID;
		this.generateLounge = generateLounge;
		this.queueVIP = queueVIP;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenerateVIPID() {
		return generateVIPID;
	}
	public void setGenerateVIPID(String generateVIPID) {
		this.generateVIPID = generateVIPID;
	}
	public String getGenerateLounge() {
		return generateLounge;
	}
	public void setGenerateLounge(String generateLounge) {
		this.generateLounge = generateLounge;
	}
	public Integer getQueueVIP() {
		return queueVIP;
	}
	public void setQueueVIP(Integer queueVIP) {
		this.queueVIP = queueVIP;
	}
	@Override
	public Integer calculatePoint() {
		int finalPoin = getPoin() + (getName().length()*2);
		return finalPoin;
	}
	
	

}
