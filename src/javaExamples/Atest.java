package javaExamples;

import java.util.SortedMap;
import java.util.TreeMap;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Atest {
	public static void main(String[] args) {
		SortedMap<Integer, String> mapDomains = new TreeMap<>();
		mapDomains.put(5, "Australia"); 
		mapDomains.put(1, "International");
		mapDomains.put(4, "America");
		mapDomains.put(1000, "United Kingdom");
		mapDomains.put(4, "Japan");
		
		mapDomains.put(2, "United States");
		mapDomains.put(4, "Russia");
		System.out.println(mapDomains);
	}

}
