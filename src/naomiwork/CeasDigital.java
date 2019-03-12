package naomiwork;

public class CeasDigital {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			long seconds = System.currentTimeMillis() / 1000;
			long minutes = seconds / 60;
			long hours = minutes / 60;
			long days = hours / 24;
			System.out.println(hours + ":" + minutes + ":" + seconds);
			Thread.sleep(1000);
		}
	}
}
