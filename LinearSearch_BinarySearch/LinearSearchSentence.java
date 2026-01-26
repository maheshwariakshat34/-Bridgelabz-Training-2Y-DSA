package ClassQuestion;

public class LinearSearchSentence {
    public static void main(String[] args) {
        String [] sentence={
                "Java is object oriented programming",
                "I love programming",
                "Jai Shree Ram"

        };
        String word="Ram";
        boolean found=false;
        for(int i=0;i<sentence.length;i++){
            if(sentence[i].contains(word)){
                System.out.print(sentence[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.print("not found");
        }
    }
}
