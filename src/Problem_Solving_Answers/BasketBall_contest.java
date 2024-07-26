package Problem_Solving_Answers;
import java.util.*;
/*
 Problem Statement:
You are competing in a basketball contest. In this contest the score for each successful shot depends on both the distance from the  basket and the player's position. The ball is shot N times, successfully. You are given an array A containing the distance of a player from basket for N shots. The index of array represents the  position of the player. Score is calculated by multiplying the position with the distance from the basket.

Your task is to find and return an integer value, representing the maximum possible score you can achieve by choosing a contiguous subarray of size K from the given array.

Note:

* A subarray is a contiguous part of array.

* Assume 1 based indexing.

* The array contains both negative and positive values.

* Assume the player is standing on a cartesian plane.

Input Format

- input1:An integer value N representing the number of shots made by the player 

- input2 : An integer K representing the size of subarray

- input3 : An array of integers 

Sample Input

5
2
1 2 3 4 5

Sample Output

14
 */
public class BasketBall_contest {
	    public static int maxScore(int N, int K, int[] arr) {
	        int ans = 0;  // Initialize the maximum score

	        // Loop through the array to find all possible subarrays of size K
	        for (int i = 0; i <= N - K; i++) {
	            int sum = 0;  // Initialize the sum for the current subarray

	            // Calculate the sum of products for the subarray
	            for (int ind = 1; ind <= K; ind++) {
	                sum += arr[i + ind - 1] * ind;
	            }

	            // Update the maximum score if the current sum is greater
	            if (sum > ans) {
	                ans = sum;
	            }
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        
	        int N = s.nextInt();
	        int K = s.nextInt();
	        s.nextLine();
	        int[] A = new int[N];
	        String inputLine=s.nextLine().trim();
	        String[] inputArray=inputLine.split("\\s+");
	        if (inputArray.length != N) {
	            System.out.println("Error: Number of elements in the input does not match N.");
	            return;
	        }
	        for(int i=0;i<N;i++){
	            A[i]=Integer.parseInt(inputArray[i]);
	        }

	        // Calculate and print the maximum score
	        System.out.println(maxScore(N, K, A));  // Output: 14
	    }
	}


