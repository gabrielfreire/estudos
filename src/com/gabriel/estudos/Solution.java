package com.gabriel.estudos;

/**
 * Codility problem solution
 * @author Gabriel Freire
 *
 */
public class Solution {

	public static void main(String[] args) {

		//solution({1, 3, 14}, 2, 16);
		//minimal distance = ?
		int[] arr = {4, 7, 9, 11, 14, 21, 21, 22, 22, 23};
		System.out.println(solution(arr, 2, 16));
			
	}
	/**
	 * 
	 * @param R -> Array of bollards
	 * @param X -> the width of a boat is 2 * x
	 * @param M -> length of the wharf
	 * @return minDistance -> minimal distance between a boat and a bollard
	 */
	public static int solution(int[] R, int X, int M){
		
		int wharfWidth = M;
		int boatWidth = 2 * X;

		int[] boats = {2, 6, 14};
		int maxDistance= boats[0] - R[0];
		System.out.println("boat width is: " + boatWidth);
		for(int i = 0; i < R.length; i++){
			//get the current distance
			int currentDistance = boats[i] - R[i];
			if(R[i] > wharfWidth || boatWidth > wharfWidth || currentDistance < 0){
				return -1;
			}
			
			//compare the currentDistance with the maximumDistance. if the current is bigger than the max... set the maximum to the current
		    if(currentDistance > maxDistance){
		    	maxDistance = currentDistance;
		    }

			
		}

		//returns the max distance between a boat and a bollard
		return maxDistance;
		
	}

}
