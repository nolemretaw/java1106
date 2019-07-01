package day02;
//自定义异常
public class WrongWeaponCheckedException extends RuntimeException {

	public WrongWeaponCheckedException(String message) {
		super(message);
	}

}
