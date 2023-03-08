import java.util.Objects;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
//2.Maak in je main methode een Integer array genaamd `numeric` die je vult met de
// nummers 1,2,3,4,5,6,7,8,9,0.
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        //3.Maak in je main methode een String array genaamd `alphabetic` die je vult met de String varianten
        // van de nummers uit
        String[] alphabetic = {"een", "twee","drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
//Maak in de main methode van de Main class een boolean variabele genaamd `play` met de waarde `true`. Maak een String

        // variabele genaamd `ongeldig` waarin je de String "ongeldige invoer" zet. Als laatst maak je nog
        // een nieuw Scanner

        //object aan met `Scanner scanner = new Scanner(System.in)`


        Translator Translator = new Translator(numeric, alphabetic);
        boolean play = true;
        String ongeldig = "ongeldige invoer";
                Scanner scanner = new Scanner(System.in);
        //Vervolgens maak je een while-loop die doorgaat zolang `play` true is.

        While (play== true);{
            System.out.println("Type x om te stoppen");
            System.out.println("type v om te vertalen");
            String input = Scanner.nextline();
//syntax voor strings
            if (Objects.equals(input, b:"x")){
                play == false;
            }
//hij blijft true, hier wil je vragen of iemand een cijfer invoert
            else if(Objects.equals(input, b:"y")){

                // hij blijft true, hier wil je vragen of iemand een cijfer invoert
                System.out.println("voer een cijfer in van 0 t/m 9");
                //integer of int om het cijfer dat is ingevoerd op te halen
                int inputGrade = scanner.nextInt();
                scanner.nextLine();

                if (inputGrade < 10){
                    String result = Translator.translate (inputGrade);}
                 else   {
                    System.out.println("voer een cijfer tussen de 0 en 9 in");
                }
                 else {
                    System.out.println("ongeldig invoer, voer een x of v in");

                }



                }
            }

        }

                     }
}
