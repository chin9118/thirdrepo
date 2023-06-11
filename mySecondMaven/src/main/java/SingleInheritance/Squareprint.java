package SingleInheritance;

public class Squareprint implements CirclePrint {
	public void print()
	{
		System.out.println("square");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Squareprint obj=new Squareprint();
obj.print();
RectanglePrint obj1=new RectanglePrint();
obj1.print();
	}

}
