
public class Demo1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello_word_java_persion";
		System.out.println(s1.charAt(1)); //e
		System.out.println(s1.length());	//23
		System.out.println(s1.indexOf("o"));	//��ĸo��һ�γ��ֵ�λ��
		System.out.println(s1.indexOf("ll"));	//��ĸll��һ�γ��ֵ�λ��
		System.out.println(s1.endsWith("o"));	//�ж��Ƿ���o��β
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.substring(6)); //�ӵڼ�����ʼ��ȡ�����
		System.out.println(s1.substring(6,10)); //�ӵ�6����ʼ��ȡ��10
		String a[] = s1.split("_");	//��_�ָ�Ϊ�ַ�������
		print(a);
		char [] cs = s1.toCharArray();	//ת��Ϊ����
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
