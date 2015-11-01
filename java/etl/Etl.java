import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {

      // Map to contain transformed load
      Map<String, Integer> shiny = new  HashMap<String, Integer>();

      // Iterate over old legacy map to lookup key and value
      for(Integer keyOld: old.keySet()){

         // Iterate over old legacy values per key to get new keys for the new shiny map
         for(int i=0; i<old.get(keyOld).size();i++){
            if(!shiny.containsKey(old.get(keyOld).get(i).toLowerCase())){
               shiny.put(old.get(keyOld).get(i).toLowerCase(), keyOld);
            } // if loop ends here
         } // for-loop iterating over old map value for a key ends here
      } // for-loop iterating over old map ends here

      return shiny;
   }
}

