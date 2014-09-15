/**
 * Created by ykli1013 on 9/14/14.
 */
public class LookAndSay {

    public static void main(String[] args){
        System.out.println(generate("13112221"));

    }

    public static String generate(String input){
        StringBuffer output = new StringBuffer();
        int counter = 1;
        for(int i = 0; i<input.length();i++){
            //last number
            if(i == input.length()-1){
                    output.append(counter);
                    output.append(input.charAt(i));
            }else{
                if(input.charAt(i)==input.charAt(i+1)){
                    counter++;
                }else{
                    output.append(counter);
                    output.append(input.charAt(i));
                    counter = 1;
                }
            }



        }

        return output.toString();
    }
}
