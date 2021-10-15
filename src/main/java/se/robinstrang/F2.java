package se.robinstrang;
/*
kriv en funktion som heter CanBuyBeer
Den ska RETURNERA en boolean (true eller false)
Inparametrar: age (int)
              location char (K betyder krogen, S betyder systemet)  
REGLERNA ÄR JU:
Om man är äldre än/lika med 18 och    på krogen       
Om man är äldre än/lika med 20 och    på systemet
Skriv kod som anropar matar in värden och sen anropar funktionen!
*/
public class F2 {
    public void BeerCalculator(){
        System.out.println("Svara på några frågor innan du köper öl.");
        System.out.println("Vill du gå på krogen (K) eller systembolaget (S)?");
        char location = System.console().readLine().charAt(0);
        System.out.println("Hur gammal är du?");
        int age = Integer.parseInt(System.console().readLine());
        boolean allowed = CanBuyBeer(location,age);
        System.out.println(allowed);
    }

    public boolean CanBuyBeer(char location, int age){
        if (location == 'K' && age>=18){
            return true;
        }
        if (location == 'S' && age>=20){
            return true;
        }
        else {
            return false;
        }
    }
}