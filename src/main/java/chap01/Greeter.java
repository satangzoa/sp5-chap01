package chap01;

public class Greeter {
	private String format;
	
	public String greet(String guest) {
		return String.format(format, guest);
		// return String.format("%s, 안녕하세요!", guest);는 위와 같다
		//return String.format("%s, 안녕하세요!", "Spring");는 위와 같다
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	
}
