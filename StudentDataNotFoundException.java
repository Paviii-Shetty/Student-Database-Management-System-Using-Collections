package sdbms;

public class StudentDataNotFoundException extends RuntimeException {
	private String message;
	public StudentDataNotFoundException(String message) {
		this.message=message;
}
	public String getMessage() {
		return message;
	}
}
