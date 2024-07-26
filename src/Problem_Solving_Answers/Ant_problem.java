package Problem_Solving_Answers;
import java.util.*;
/*
 Problem Statement:
There is a ant on your balcony.It wants to leave the rail so sometimes it moves right and sometimes it moves left until it gets exhausted.Given an integer array A of size N which consists of integer 1 and -1 only representing ant's moves.

Where 1 means ant moved unit distance towards the right side and -1 means it moved unit distance towards the left .Your task is to find and return the integer value representing how many times the ant reaches back to original starting position.

Note:

Assume 1-based indexing
Assume that the railing extends infinitely on the either  sides

Input Format:

input1 : An integer value N representing the number of moves made by the ant.

input2 : An integer array A consisting of the ant's moves towards either side

Sample Input

5

1 -1 1 -1 1 
 */
public class Ant_problem {
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
	        int moves=s.nextInt();
	        s.nextLine();
	        int arr[]=new int[moves+1];
	        String inputLine = s.nextLine();
	        String[] inputArray = inputLine.trim().split("\\s+");
	        for(int i=1;i<=moves;i++){
	            arr[i] = Integer.parseInt(inputArray[i - 1]);
	        }
	        int state=0;
	        int numberOftimes=0;
	        int sum=0;
	        for(int i=1;i<=moves;i++){
	            sum=arr[i]+sum;
	            if(state==sum){
	                numberOftimes++;
	            }
	        }
	        System.out.println(numberOftimes);
		}
	}

