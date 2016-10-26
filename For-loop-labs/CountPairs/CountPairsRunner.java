package CountPairs;

public class CountPairsRunner {

	public static void main(String[] args) {
            
            CountPairs test = new CountPairs();
            
		System.out.println(test.CountPairs("ddogccatppig"));
                
		System.out.println(test.CountPairs("dogcatpig"));
                
		System.out.println(test.CountPairs("xxyyzz"));
		System.out.println(test.CountPairs("a"));
                
		System.out.println(test.CountPairs("abc"));
                
		System.out.println(test.CountPairs("aabb"));
                
		System.out.println(test.CountPairs("dogcatpigaabbcc"));
                
		System.out.println(test.CountPairs("aabbccdogcatpig"));
                
		System.out.println(test.CountPairs("dogabbcccatpig"));
                
		System.out.println(test.CountPairs("aaaa"));
                
		System.out.println(test.CountPairs("AAAAAAAAA"));
                
	}
	
	
}