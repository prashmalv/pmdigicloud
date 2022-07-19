package practice;

import java.io.IOException;

public class LaunchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for (int i=0;i<=200;i++) {
				Thread.sleep(61000);
				Runtime.getRuntime().exec(new String[]{"cmd", "/c","start msedge https://youtu.be/Vo2pUNCvIS0"});
				Thread.sleep(61000);
				Runtime.getRuntime().exec(new String[]{"cmd", "/c","start msedge https://youtu.be/tx0fsepY9bI"});
				Thread.sleep(61000);
				Runtime.getRuntime().exec(new String[]{"cmd", "/c","start msedge https://youtu.be/k6V9fLWtsfc"});
			}
			} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
