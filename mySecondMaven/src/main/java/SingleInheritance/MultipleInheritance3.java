package SingleInheritance;

public class MultipleInheritance3 implements MultipleInheritance2, MultipleInheritance {
	public void print()
	{
		System.out.println("Hello world");
	}
public void show()
{
	System.out.println("Hai world");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance3 obj=new MultipleInheritance3();
		obj.print();
		obj.show();
	}

}
