package Leetcode.Medium;
import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(strs);

	}

	public static List<List<String>> groupAnagrams(String[] strs) 
	{
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) 
		{
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			
			if (map.containsKey(key))
				map.get(key).add(strs[i]);
			else 
			{
				List<String> temp = new LinkedList<String>();
				temp.add(strs[i]);
				map.put(key, temp);
			}
		}

		List<List<String>> ans = new LinkedList<List<String>>();
		for (String key : map.keySet()) 
		{
			List<String> temp = new LinkedList<String>(map.get(key));
			Collections.sort(temp);
			ans.add(temp);
		}
		
		return ans;
	}

}
