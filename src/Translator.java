import java.util.HashMap;


public class Translator {
    //6.Maak in de Translator class een `HashMap<Integer,String>` variabele met de naam `numericAlpha`.
    HashMap<Integer, String> numericAlpha = new HashMap<>();

//7. Maak in de Translator class een constructor die de volgende parameters krijgt:
// `(String[] alphabetic, Integer[] numeric)`.

//8. Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de
// numeric/alphabetic array
    public Translator(String[], Integer[] Numeric, alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }


        //  for (int i = 0; i < numeric.Length; i++){
        //  numericAlpha.put(numeric[i], alphabetic[i]);}
//


        public String Translate (Integer number){
            String result = numericAlpha.get(number);
            return result;
        }
    }
}
