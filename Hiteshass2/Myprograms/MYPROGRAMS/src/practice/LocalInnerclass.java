package practice;

public class LocalInnerclass {
	static String name="Hitesh";
		void show() {
			class inner{
				String clg="kgce";
				void show()
				{
					System.out.println("clg name is :"+clg);
					System.out.println("name is :"+name);
				}
			}
			inner n=new inner();
			n.show();
		}
		public static void main(String[]args)
		{
			LocalInnerclass l=new LocalInnerclass();
			l.show();
		}
}
