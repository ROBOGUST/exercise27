package se.robinstrang;
/*
Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25
(OBS! För att metoden ska vara återanvändbar - den ska ta tre parametrar . Och RETURNERA ett tal). 
DVS Ingen input/output i funktionen
*/
public class F1 {
    public void Metoder(){
        
        System.out.println("Mata in 3 tal så skriver jag ut det lägsta:");
        int tal1 = Integer.parseInt(System.console().readLine());
        int tal2 = Integer.parseInt(System.console().readLine());
        int tal3 = Integer.parseInt(System.console().readLine());
        WichIsLowest(tal1,tal2,tal3);
    }

    public int WichIsLowest(int tal1, int tal2, int tal3){
        if (tal1 > tal2 && tal1 > tal3){
            return tal1;
        }
        if (tal2 > tal1 && tal2 > tal3){
            return tal2;
        }
        else {
            return tal3;
        }
    }
}
