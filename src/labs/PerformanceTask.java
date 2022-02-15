package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		int launchAngle;
		int launchVelocity;
		System.out.println("Enter the Launch Angle");
		launchAngle = inKey.nextInt();
		System.out.println("Enter the Launch Velocity");
		launchVelocity = inKey.nextInt();
	    	int b;
	    	b=0;
	    	double scope = launchAngle;
	        double min = launchVelocity;
	        	if (scope < 0);
	        	System.out.println ("Time = " + b);
	        	System.out.println ("x-pose = " + b);
	        	System.out.println ("y-pose = " + b);
	        	 for(int i = launchAngle; i < 0;  i++) {
	 	        	int num = (int) (Math.random() * scope + min);
	 	        	if (scope < 0);
	}
	        	 System.out.println ("Time = " + 1);
		        	System.out.println ("x-pose = " + launchVelocity );
		        	System.out.println ("y-pose =" + launchVelocity);
		        	 System.out.println ("Time = " + 2);
			        	System.out.println ("x-pose = " + launchAngle );
			        	System.out.println ("y-pose =" + launchAngle);
			        	 System.out.println ("Time = " + 3);
				        	System.out.println ("x-pose = " + launchVelocity );
				        	System.out.println ("y-pose =" + launchAngle);
			        	
		
	}
	
	
}
