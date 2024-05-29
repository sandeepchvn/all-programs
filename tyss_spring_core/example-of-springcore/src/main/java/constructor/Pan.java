package constructor;

public class Pan {
	private int num;
	private String addres;
	public Pan(int num, String addres) {
		super();
		this.num = num;
		this.addres = addres;
		System.out.println("hiii");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
}
