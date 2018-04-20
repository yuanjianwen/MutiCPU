
class testThread implements Runnable{
	private String name;
	public  testThread(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		int i = 0;
		// TODO Auto-generated method stub
		while (true) {
			i++;
			
			String st = i+"";
			st.hashCode();
			System.out.println(this.name + st.hashCode());
		}
			
	}
	
}

public class MutiCPUTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5000; i++) {
			new Thread(new testThread("thread "+i+": ")).start();
		}

	}

}
