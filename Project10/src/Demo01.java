
public class Demo01 {

	static int i;
	{
		i++;
	}
	public static void main(String[] args) {
		Demo01 d1=new Demo01();
		Demo01 d2=new Demo01();
		Demo01 d3=new Demo01();
		Demo01 d4=new Demo01();
		System.out.println(i);
	}
}
