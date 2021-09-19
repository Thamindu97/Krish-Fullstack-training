public class ReverseSentence{

     public static void main(String []args){
        
        String sentence = "Here we start the training";
        String reversedSentence = "";
        
        for ( int i = sentence.length() - 1; i >= 0; i--)
        {
            reversedSentence = reversedSentence + sentence.charAt(i);
        }
        
        System.out.println("Reversed Sentence : " + reversedSentence);
     }
}