
public class Demo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello_word_java_persion";
		System.out.println(s1.charAt(1)); //e
		System.out.println(s1.length());	//23
		System.out.println(s1.indexOf("o"));	//字母o第一次出现的位置
		System.out.println(s1.indexOf("ll"));	//字母ll第一次出现的位置
		System.out.println(s1.endsWith("o"));	//判断是否以o结尾
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.substring(6)); //从第几个开始截取到最后
		System.out.println(s1.substring(6,10)); //从第6个开始截取到10
		String a[] = s1.split("_");	//以_分割为字符串数组
		print(a);
		char [] cs = s1.toCharArray();	//转化为数组
		print(cs);
		
	}
	static void print(char[] cs) {
		for(int i=0;i<cs.length;i++) {
			System.out.print(cs[i]+" ");
		}
		System.out.println();
	}
	static void print(String[] cs) {
		for(int i=0;i<cs.length;i++) {
			System.out.print(cs[i]+" ");
		}
		System.out.println();
	}

}
