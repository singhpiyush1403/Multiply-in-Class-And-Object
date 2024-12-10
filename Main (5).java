 class calc{
        int num1;
        int num2;
        int multiply(){
        
            int x = num1 * num2;
            return x;
            
        }
        void getData(int x, int y){
            num1 = x;
            num2 = y;
        }
        
        
    }

 public class Main {
   public static void main(String args[]){
       calc myObj = new calc();
       myObj.getData(4,7);
       
       int x= myObj.multiply();
       System.out.println(x);
   }
}