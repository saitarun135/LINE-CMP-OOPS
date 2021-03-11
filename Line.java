import java.util.Scanner;
	public class Line{
		public static void main(String args[]){
			int x1,y1,x2,y2;
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

		Double line1=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		Double line2=Math.sqrt((a2-a1)^2+(b2-b1)^2);
		System.out.println("The length of a line-1 is :" +line1);
		System.out.println("The length of a line-2 is :" +line2);
				Double d1=(line1);
				Double d2=(line2);
				boolean equals=d1.equals(d2);
				if( equals == true) {
					System.out.println("Both lines are same");
						}
				else {
					System.out.println("Both lines are not same");
					}
		  }
	}
	
