package Exception_Handling;
public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("1");
        int c;
        try{
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
        }
        System.out.println("2");
        int[] arr={1,2,3};
        try{
            System.out.println(arr[3]+"");
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println(e.toString()+"");
        }
        //System.out.println("3");
        finally{
            //int d=arr[3];
            System.out.println("finally");
        }
        
    }
}
