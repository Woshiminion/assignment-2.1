import java.util.Scanner;

class Coordinates{
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("X1 value");
        double x1 = sc.nextDouble();
        System.out.println("Y1 value");
        double y1 = sc.nextDouble();
        System.out.println("X2 value");
        double x2 = sc.nextDouble();
        System.out.println("Y2 value");
        double y2 = sc.nextDouble();
        double A = Math.sqrt((x2-x1)*(x2-x1)+(y2-x1)*(y2-y1));
        System.out.println("dist:" + A);
        
        
        
        
        
        
        
        
        
        
        
    }
}