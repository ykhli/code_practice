/**
 * Created by ykli1013 on 9/13/14.
 */
public class Array1 {

    public static void main(String[] arg){
        System.out.print(unique("abcdef"));
    }

    public static boolean unique(String input){
        for(int i = 0; i < input.length(); i++){
            if(i!=input.length()-1){
                for(int j = i+1; j < input.length(); j++){
                    if(input.charAt(i) == input.charAt(j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
