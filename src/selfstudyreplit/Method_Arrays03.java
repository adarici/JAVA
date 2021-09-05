package selfstudyreplit;

public class Method_Arrays03 {
   /*
    Write a method which accepts a String as parameter and 
    prints the sum of the digits, present in the given string.

input : ade1r4d3 
output : 8
         Hint :
         Use Character.isDigit()
         Integer.valueOf()
    */
    static int findSum(String str){
      
        String temp = "0";
        int sum = 0;
 
       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            if (Character.isDigit(ch))
                temp += ch;
            else {
               
                sum += Integer.valueOf(temp);
 
               temp = "0";
            }
        }
 
        return sum + Integer.parseInt(temp);
    }
 
    public static void main(String[] args)
    {
 
        String str = "ade1r4d3";
 
        System.out.println(findSum(str));
    }
}