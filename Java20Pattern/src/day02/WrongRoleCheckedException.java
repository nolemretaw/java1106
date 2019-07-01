package day02;

//自定义编译期异常
public class WrongRoleCheckedException extends Exception {

	public WrongRoleCheckedException(String message) {
		super(message);
	}

}
