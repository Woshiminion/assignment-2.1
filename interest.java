import java.util.Scanner;

class interest{
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Rate");
        double r =sc.nextInt();
        System.out.println("Principle");
        double p =sc.nextInt();
        System.out.println("year");
        double n =sc.nextInt();
        
        double A = p*Math.pow((1+r),n);
        System.out.println("final ammount:" + A);
        
        
        
        
        
        
    }
}