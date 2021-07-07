public class MaxCirclrSubarraySum {

	public static void main(String[] args) {
		
		int a[] = {1,4,6,4,-3,8,-1};
        int n = 7;
        if(n==1){
             System.out.println("Maximum circular sum is " +a[0]);
        }
        else{
        
        System.out.println("Maximum circular sum is " +Integer.max(kadane(a,n), reverseKadane(a,n)));
        }
	}

	private static int reverseKadane(int[] a, int n) {
		int res = 0;
        int x =  a[0];
        for(int i = 0; i < n; i++){
            res = Math.max(a[i],res+a[i]);
            x= Math.max(x,res);
        }
        return x;
	}

	private static int kadane(int[] a, int n) {
		int total = 0;
	      //taking the total sum of the array elements
	        for(int i = 0; i< n; i++){
	            total +=a[i];
	             
	        }
	      // inverting the array
	        for(int i = 0; i<n ; i++){
	            a[i] = -a[i];
	        }
	      // finding min sum subarray
	        int k = kadane(a,n);

	        int ress = total+k;
	       // to handel the case in which all elements are negative
	        if(total == -k ){
	            return total;
	        }
	        else{
	        return ress;
	        }
	}
		

}