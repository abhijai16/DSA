package Algorithms;

//* Use to find the element which has frequency of more than n/2 times. */

//! Other method is to sort the array and return the middle element as the the occurrence should be more than n/2 therefore middle will be covered by it too.

public class BoyrsMooreVotingAlgo{

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        
        int result = findMajorityElement(nums);
        
        if(result != -1){
            System.out.println("The majority element is: " + result);
        }
        else{
            System.out.println("No majority element found.");
        }
    }

    public static int findMajorityElement(int[] nums) {
        // Handle empty array edge case
        if(nums == null || nums.length == 0){
            return -1; // Indicating no majority element exists
        }

        int candidate = 0;
        int count = 0;

        // Phase 1: Find the candidate
        for(int num : nums){
            if(count == 0){
                candidate = num;
                count = 1;
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        // Phase 2: Verify the candidate
        int actualCount = 0;
        for(int num : nums){
            if(num == candidate){
                actualCount++;
            }
        }

        // Check if the candidate's frequency is strictly greater than N / 2
        if(actualCount > nums.length/2){
            return candidate;
        }
        else{
            return -1; // Indicating no majority element exists
        }
    }
}

