package firstprj;

 class op1 implements operation
{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
 class op2 implements operation
 {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b)*2;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b)*2;
	}

	@Override
	public double mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b*2;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b*2;
	}
	 
 }
 public class operation1class
 {
	 public static void main(String args[])
	 {
	 op1 simple=new op1();
	 System.out.println(simple.sum(3,2));
	 System.out.println(simple.sub(3,2));
	 System.out.println(simple.mul(3,2));
	 System.out.println(simple.div(3,2));
	 op2 simple2=new op2();
	 System.out.println(simple2.sum(3,2));
	 System.out.println(simple2.sub(3,2));
	 System.out.println(simple2.mul(3,2));
	 System.out.println(simple2.div(3,2));
	 }
 }
