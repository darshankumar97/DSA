public class ValidParanthesis {

    public static boolean validParenthesis(String s){

        while(true){                                                        // this is toooo slow and takes too much space

            if(s.contains("()")){
               s = s.replace("()","");
            }
            else if(s.contains("{}")){                                      // Learn optimized approach
                s = s.replace("{}","");
            }
            else if (s.contains("[]")){
                s = s.replace("[]","");
            }
            else {
                return s.isEmpty();
            }
        }

    }

    public static void main(String args[]){
        String s = "[(]";
        System.out.println(validParenthesis(s));
    }    
}
