package se.robinstrang;
/*
Write a Java method to count all words in a string. 
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
*/
public class F3 {
    public void MetoderTwo(){
        System.out.println("Skriv vad du vill, jag räknar antalet ord");
        String text = System.console().readLine();
        int CountWords = WordCounter(text);
        System.out.println("Det du skrev innehåller: " + CountWords + " ord.");
    }

    public int WordCounter(String input){
        String [] ArrayText = input.split(" ");
        int Words = 0;
        for (String Arraycounter : ArrayText){
        Words++;
        }
        return Words;
    }
}