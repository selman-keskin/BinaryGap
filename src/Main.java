import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int x = s.binaryGap(1041);
		
		System.out.println(x);
	}
	
	
}

class Solution { 
	
	public int solution(int N) 
	{
		int countZero = 0;
		Integer maxCountZeroList = 0;
		
		List<Integer> countZeroList = new ArrayList<Integer>();
				
		String nBin = Integer.toBinaryString(N);
		for (int i=1;i<nBin.length();i++) {

			if(nBin.charAt(i) == '1')
			{
				countZeroList.add(countZero);
				countZero = 0;
			}
			else
			{
				countZero++;
			}

		}

		if(countZeroList.size() > 0) 
		{
			maxCountZeroList = Collections.max(countZeroList);
		}
		return maxCountZeroList;
	}
	
	public static int binaryGap(int n) {
	    n >>>= Integer.numberOfTrailingZeros(n);
	    int steps = 0;
	    while ((n & (n + 1)) != 0) {
	        n |= n >>> 1;
	        steps++;
	    }
	    return steps;
	}
}