package Leetcode.Easy;

public abstract class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int firstBadVersion(int n) 
	{
	    int lo = 1, hi = n;
	    while (lo < hi) 
	    {
	        int med = lo + (hi -  lo)/2;
	        
	        if (isBadVersion(med)) 
	        {
	            hi = med;
	        } 
	        
	        else 
	        {
	            lo = med + 1;
	        }
	    }
	    return lo;
	}
	
	public boolean isBadVersion(int i)
	{
		return true;
	}
	
	
}


