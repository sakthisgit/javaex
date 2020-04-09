abstract class car
{
abstract void speed();

}
abstract class brand extends car{

	abstract void brand();

}
abstract class color extends brand{

	abstract void color();

}

public class vehicle extends color{

	        void speed()
			        {
					                System.out.println("Maruti car speed very slow");
							        }
		        void brand()
				        {
						                System.out.println("Maruti is car big brand in india");
								        }
			        void color()
					        {
							                System.out.println("Silver colour is best for maruti car");
									        }

				        public static void main (String[]args)
						        {
								                vehicle  a=new vehicle();
										                a.brand();
												                a.color();
														                a.speed();
																        }
}

