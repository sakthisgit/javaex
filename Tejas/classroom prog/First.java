class Myclass{

                static String name="Sakthi";
                int i=1;
                static int t=1;

                public void display(){
                    System.out.println(name);
                }

}




class First{

    static{
        System.out.println("Static Method");
    }

     public static void main(String[] a){


        Myclass my = new Myclass();
        my.i++;
        System.out.println(my.i);

        Myclass my1 = new Myclass();        
        System.out.println(my1.i);
       

        System.out.println(my.t);
        Myclass.t++;
        System.out.println(my1.t);
        System.out.println(my.t);

        String name=new String("sakthi");
        String name1=new String("sakthi");
        System.out.println(name+"    "+name1);
        if(name==name1)
            System.out.println("True");
        else    
            System.out.println("False");


     }

}
