
public class Demo1_1 {
	public static void main(String []args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		System.out.println(s1==s2);		//true
		System.out.println(s1==s3);		//false
	}
}
