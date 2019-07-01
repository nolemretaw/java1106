package practiceDay2;

public class Properties {
	private String name;
	private String hurt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHurt() {
		return hurt;
	}
	public void setHurt(String hurt) {
		this.hurt = hurt;
	}
	public Properties() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Properties [name=" + name + ", hurt=" + hurt + "]";
	}
	
}
