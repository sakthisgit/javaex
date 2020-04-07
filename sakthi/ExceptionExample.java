import java.io.IOException;
import java.io.InputStreamReader;


class MyException extends Exception {

        // Checked exception
        public void readInput() throws IOException {
            
            InputStreamReader reader = new InputStreamReader(System.in);
            reader.read();           

        }


        public boolean checkStatus(int marks) throws MyException{
             if(marks < 50){
                 throw new MyException();
             }   

            return true;
        }

}




public class ExceptionExample {
    

    public static void main(String[] args) throws IOException {

        MyException myException = new MyException();
        myException.readInput();


        
       
    
    // try catch method
        try{
            
            System.out.println("My name is "+args[0]);
            myException.checkStatus(10);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Pass with parameter");
        }catch(MyException e){
            System.out.println("Marks less than 50");
        }
        
        catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Guarentee to execute atleast once even progrm terminates");
        }

        

    }

}