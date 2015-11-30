package part1;

public class Hello{

	private String replyMsg;

	public String getReplyMsg() {
		return replyMsg;
	}

	public void setReplyMsg(String replyMsg) {
		this.replyMsg = replyMsg;
	}

	public String execute(){
		this.setReplyMsg("Struts2の世界にようこそ");
		return "success";
	}

}