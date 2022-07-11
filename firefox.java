package week1.day2;

public class firefox {
	String browserName = "Firefox";
	float version = 100.2f;
	boolean visible = true;
	int year = 1998;
	char logo = 'm';
		
	public void edge() {
		float version = 100.5f;
		String name = "Edge";
		System.out.println("Edge Version :"+version+"V");
		System.out.println("Name :" +name );
	}
	public void chrome() {
		int speed = 100;
		System.out.println("Chrome Speed :" +speed+"MBps" );
	}
	public static void main(String[] args) {
	firefox Detailsoffirefox=new firefox();
	Detailsoffirefox.edge();
	Detailsoffirefox.chrome();

	}

}
