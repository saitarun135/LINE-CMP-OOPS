import java.util.Scanner;

public class Line{
  void EqlCmpMethod(){
     int x1 ,y1,x2,y2;
     int a1,b1,a2,b2;
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter x1 value :");
          x1=sc.nextInt();
        System.out.println("Enter x2 value :");
           x2=sc.nextInt();
        System.out.println("Enter y1 value :");
           y1=sc.nextInt();
        System.out.println("Enter y2 value :");
           y2=sc.nextInt();
        System.out.println("Enter a1 value :");
           a1=sc.nextInt();
        System.out.println("Enter a2 value :");
           a2=sc.nextInt();
        System.out.println("Enter b1 value :");
           b1=sc.nextInt();
        System.out.println("Enter b2 value :");
           b2=sc.nextInt(); 
        Double line1=Math.sqrt((Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)));
        Double line2=Math.sqrt((Math.pow((a2-a1),2))  + (Math.pow((b2-b1),2)));
           	System.out.println("The length of a line-1 is :" +line1);
           	System.out.println("The length of a line-2 is :" +line2);
    	 	Double d1=(line1);
     		Double d2=(line2);  
     		System.out.println("Equality of two lines by using 'equals method' :"  +d1.equals(d2));
     		System.out.println("Equality of two lines by using 'compareTomethod' :"  +d1.compareTo(d2));
	}
public static void main(String args[]){
   Line length = new Line();
      length.EqlCmpMethod();
	}
}
