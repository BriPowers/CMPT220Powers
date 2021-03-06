/**
*File: driver_proj1
*author: Brian Powers
*course: CMPT 220
*assignment: Project 1
*due days: October 4, 2016
*version: "1.8.0_101"

*This program counts the length of a string using methods
*/
import java.util.*;

public class driver_proj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	int FVS = input.nextInt();
	int SVS = input.nextInt();
	int i = 0;
	double[] vFirst = new double[FVS];
	double[] vSecond = new double[SVS];
	
	
	while(i < FVS) {
	  vFirst[i] = input.nextDouble();
	  i++;
	}
	i = 0;
    while(i < SVS) {
	  vSecond[i] = input.nextDouble();
	  i++;
	}
	double[] cResult = convolve(vFirst, vSecond);
	
	for(i = 0; i < (vFirst.length + vSecond.length) - 1;i++){
	  System.out.print(cResult[i] + " ");
    }
  }
  public static double[] convolve(double[] vFirst,double[] vSecond){
    double[] result = new double[(vFirst.length + vSecond.length) - 1]; 
	for (int indx = 0; indx < (vFirst.length + vSecond.length) - 1 ; indx++ ){
	  result[indx] = 0;
	  for (int shiftindex = 0;shiftindex < vSecond.length;shiftindex++){
    	if ((indx - shiftindex >= 0)
		&& (indx - shiftindex < vFirst.length)){
		  result[indx] += vFirst[indx - shiftindex] * vSecond[shiftindex];
	    }
	  }
	}
	return result;
  }
}