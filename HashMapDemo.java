package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//creating class name as HashMapDemo
public class HashMapDemo {

	//creating main method
	public static void main(String[] args) {
		
		//Creating HashMap object and adding key value pairs in it
		HashMap<String,String> hashMap = new HashMap<>();
		
		// Adding values to HashMap as ("keys", "values")
		hashMap.put("Pallavi","Rekha");
		hashMap.put("Swojanya","Sirisha");
		hashMap.put("Ramya","Pooja");
		hashMap.put("Vanisri","Danush");
		hashMap.put("Tarani","Chandrika");
		hashMap.put("Amala","Bhawani");
		
		//displays the set of haspMap 
		System.out.println(hashMap);
		
		//Retrieving all the keys present in the HashMap using the Set 
	    //keySet() method returns all the keys in HashMap
        Set<String> key = hashMap.keySet(); 
          System.out.println("Displaying the keys:");
            for(String keys :key){     //to get the keys 
                 System.out.println(keys);
      }
      
        //Retrieving all the values present in the HashMap using the Set
        // values() method return all the values in HashMap
        Collection<String> values=hashMap.values();//to get values
        System.out.println("Displaying the values:");
            for(String value :values){
               System.out.println(value);
      }
      
       // Synchronizing HashMap  
       Map map = Collections.synchronizedMap(hashMap);
      
         System.out.println(" After Synchronizing :");
         // Synchronizing on HashMap, not on Set
         synchronized(hashMap) {
         Iterator<String> iterator = key.iterator();
          // here it must  be in synchronized block
          while (iterator.hasNext()){ 
          	System.out.println(iterator.next()); 
          }
      }

  
      
     
	}

}