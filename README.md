## Inleiding
Welkom bij de derde huiswerkopdracht die jullie gaan maken voor de Backend leerlijn! Je hebt als het goed is hoofdstuk 
2.7 t/m hoofdstuk 2.9 gelezen op EdHub en je hebt de derde les van de cursus Java gevolgd. In deze opdracht ga je oefenen 
met arrays, collecties en loops. Dit ga je doen door het maken van een nummer-vertaler.

## Clonen van dit project
1. Clone dit project naar je eigen computer door een nieuw project te maken met de optie `Project from 
2. version control` of `get from VCS`, zoals je in de git-workshop geleerd hebt.
3. Ontkoppel de remote met `git remote remove origin`.
4. Maak een nieuwe repository op je eigen github pagina en koppel die aan dit project met `git remote add origin 
5. [link naar jou github repo]`
6. Zorg dat je main-branch ook echt "main" heet met `git branch -M main`.
7. Push vervolgens je de (originele) main branch naar je eigen github met `git push -u origin main`.
8. Maak nu een nieuwe huiswerk-branch aan om je huiswerk op te maken met `git checkout -b [naam van je nieuwe branch]`


## Opdrachtbeschrijving

Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.).
Je gaat die getallen vertalen door gebruik te maken van een HashMap.
Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap.
Vervolgens vraag je de gebruiker om een input van 0 t/m 9 te geven en ga je dat "vertalen" door simpelweg de waarde uit 
de HashMap te vragen met de bijbehorende sleutel
en dat terug te geven aan de gebruiker.


## Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:
- In je main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en 
- een Scanner object;
- Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2 arrays als parameter en 
- een translate functie;
- De logica van de applicatie wordt gedraaid in een while(boolean)-loop in je main methode.

## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, 
kun je onderstaand stappenplan gebruiken:
1. Open de Main class in de `src`-map. Als het goed is zie je hier een `public static void main (String[] args)` methode.
2. Maak in je main methode een Integer array genaamd `numeric` die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.
3. Maak in je main methode een String array genaamd `alphabetic` die je vult met de String varianten van de nummers uit 
4. stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
5. Maak een nieuwe class aan en noem deze `Translator`.
6. Maak in de Translator class een `HashMap<Integer,String>` variabele met de naam `numericAlpha`.
7. Maak in de Translator class een constructor die de volgende parameters krijgt: `(String[] alphabetic, Integer[] numeric)`.
8. Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de numeric/alphabetic array 
9. (maakt niet uit welke, ze zijn even lang).
10. Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit `numeric` en `alphabetic`. 
11. Gebruik de `i` variabele uit je for-loop om de correcte waardes uit de arrays te halen.
12. De constructor is klaar. Nu ga je deze aanroepen met de juiste argumenten in de main methode van de Main class, 
13. oftewel: maak in main een nieuw object aan van het type Translator.
14. Maak in de Translator class een nieuwe methode genaamd `translate(Integer number)` die een String returnt.
15. In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij 
16. de sleutel (key) van `number`
17. Maak in de main methode van de Main class een boolean variabele genaamd `play` met de waarde `true`. Maak een String
18. variabele genaamd `ongeldig` waarin je de String "ongeldige invoer" zet. Als laatst maak je nog een nieuw Scanner
19. object aan met `Scanner scanner = new Scanner(System.in)`.
20. Vervolgens maak je een while-loop die doorgaat zolang `play` true is.
21. Print in de while-loop `"Type 'x' om te stoppen \nType 'v' om te vertalen"` en maak een String variabele genaamd `input` 
22. waarin je de waarde van `scanner.nextLine()` opslaat.
23. Maak in de body van de while-loop een if/else if/else statement.
    1. __if__: Als de `input` "x" is, dan zet je `play` naar false.
    2. __else if__: Als de `input` "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9",
       vervolgens sla je het resultaat van `scanner.nextInt()` op in een variabele `int number`, 
       voeg nog een `scanner.nextLine();` toe op de volgende regel (scanner.nextInt doet dit namelijk niet
       van zichzelf)
       en als laatste check je met een if-statement of
        1. __if__: `number` kleiner is dan 10, dan sla je de waarde van `translator.translate(number)` op in `String result` 
        2. en print je
           `"De vertaling van " + number + " is " + result`.
        3. __else__: anders dan print je `ongeldig`
    4. __else__: Als de `input` dus iets anders dan "x" of "v" is, dan print je `ongeldig` 
 
## Bonus
1. maak een methode genaamd "randomNumberGenerator" die een hashset met 4 random nummers returned. _Tip:_ Gebruik een
2. while-loop en de java.util.Random class om random nummers aan de set toe te voegen, zolang de set korter is dan 4.
3. maak een methode die een HashSet als parameter inneemt en een string van 4 nummers returned. _Tip:_ Maak een lege String 
4. variable (of StringBuilder). Gebruik een for-loop om door de HashSet te loopen om zo elke element uit de Set toe te voegen 
5. aan de String (of StringBuilder).
6. voeg de string van 4 nummers als parameter toe bij het aanroepen van de methode "feedback".
**Bonus-bonus:** maak de methode zo dat je vaker kan raden.
 
