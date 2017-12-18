/*
 * Given a list of tickets, find itinerary in order using the given list.

Example:

Input:
"Chennai" -> "Banglore"
"Bombay" -> "Delhi"
"Goa"    -> "Chennai"
"Delhi"  -> "Goa"

Output: 
Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,
It may be assumed that the input list of tickets is not cyclic and there is one ticket from every city except final destination.
 */

package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructItineraryV2 {
	
	public static void main(String[] args) {
		 Map<String, String> tickets = new HashMap<String, String>();
		 tickets.put(" Chennai", "Banglore");
		 tickets.put("Bombay", "Delhi");
		 tickets.put("Goa", "Chennai");
		 tickets.put("Delhi", "Delhi");
		 System.out.println("Itinerary: " + reconstructItinerary(tickets).toString());
	}

	private static Object reconstructItinerary(Map<String, String> tickets) {
		if(tickets == null)
			return Collections.emptyList();
		
		List<String> result = new ArrayList<>();
		
		//create reversemap
		Map<String, String> reverse = new HashMap<String, String>();
		for(Map.Entry<String, String> ticket : tickets.entrySet())
			reverse.put(ticket.getValue(), ticket.getKey());
		
		
		return result;
	}

}
