import java.util.Scanner;

class AreaToRadius{
    
    public static void main(String[]args){
        double x = (double) Math.PI;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Gimme Area");
        double a = sc.nextDouble();
        
        double b = a/x;
        b = Math.sqrt(b);
        System.out.println("Radius="+b);    
        
        
        
        
    }
}