package test.program;

import java.util.Arrays;
import java.util.Comparator;

public class HackerEarth {

	int val = 10;
	public static void main(String[] args) {
		HackerEarth e = new HackerEarth();
		System.out.println(e.val);
		
		
//		var xyFile:File = File.createTempFile();
		String [] testStrings = {"three", "one", "apple", };
		

		Arrays.sort(testStrings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1.length() - o2.length());
//				return (int) o1.compareTo(o2);
			}
			
		});
		for(String s : testStrings)
		System.out.println(s);
		
		Arrays.sort(testStrings, (s1, s2) -> s1.length() - s2.length());
		for(String s : testStrings)
		System.out.println(s);
		
		float f = 3.996f;
		System.out.println(f);
	}

}
