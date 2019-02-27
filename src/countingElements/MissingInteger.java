package countingElements;
/*
Codility: https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class MissingInteger {
	
    public int solution(int[] A) {
        int result = 0;    
        boolean [] bitmap = new boolean[A.length+2];
        for(int i=0; i < A.length; i++){
            if(A[i] >= 0 && A[i] <= A.length && !bitmap[A[i]]){
                bitmap[A[i]] = true;
            }
        }
        for(int i=1; i < bitmap.length; i++){
            if(!bitmap[i]){
                result = i;
                break;
            }
        }
        return result;
    }
}
