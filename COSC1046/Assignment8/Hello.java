
public class Hello {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		StringBuilder s2 = new StringBuilder("Hello");
		
		long s1_Beginning = System.nanoTime();
		for(int i = 0; i < 50000; i++) {
			s1.concat("Hello");
		}
		long s1_Ending = System.nanoTime();
		
		float s1_Time = (s1_Ending - s1_Beginning) / 1000.0f;
		
		System.out.printf("It took %.3f milliseconds.\n", s1_Time);
		
		
		long s2_Beginning = System.nanoTime();
		for(int i = 0; i < 50000; i++) {
			s2.append("Hello");
		}
		long s2_Ending = System.nanoTime();
		
		float s2_Time = (s2_Ending - s2_Beginning) / 1000.0f;
		
		System.out.printf("It took %.3f milliseconds.\n", s2_Time);
		
		System.out.printf("The String took %.3f milliseconds longer then the StringBuilder.", s1_Time - s2_Time);
		
	}
}
