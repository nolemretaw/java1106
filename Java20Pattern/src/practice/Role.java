package practice;
//½ÇÉ«
public class Role {
	private String name;
	private String weapon;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public Role(String name, String weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}
	public Role() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Role [name=" + name + ", weapon=" + weapon + "]";
	}
	
}
