import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        int sum;  
        String str;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the String: ");  
        str = sc.nextLine();  
        sum = sumValue(str);  
        System.out.println("The sum of input is: " + sum);  
    }
    
    public static final String[] TYPES ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    
    //method of sum"
    public static int sumValue(String str)  
    {  
        String strcomma = str.replace(",", "");
        System.out.print( "\n Comma Free " + strcomma);
        String strNew = strcomma.replaceAll("[^a-z0-9]", "");   
        System.out.print( "\n Special Character  " + strNew);
        int sum = 0; 
        int strsum = 0;
        int length = strNew.length();
        System.out.print( " Length " + length);
        System.out.print( " New String " + strNew);
        if(length == 0){
            sum = 0;
        }
        
        for (int i = 0; i < strNew.length(); i++) {
            char value = strNew.charAt(i);
            System.out.println("\n1 " + value);
            String charToStr = "" + value;
            System.out.println("\n2 " + charToStr);
            String lower = charToStr.toLowerCase();
            System.out.println("\n3 " + lower);
            if(Arrays.asList(TYPES).contains(lower))
            {
                System.out.println("\n4 " + lower);
                strsum = strsum + Arrays.asList(TYPES).indexOf(lower) + 1;
                System.out.println("\n5 " + strsum);
            }else{
                System.out.println("\n6 " + lower);
                int dd = Character.getNumericValue(value);
                System.out.println("\n7 " + dd);
                sum = sum + dd;
                System.out.println("\n8 " + sum);
            }
            
        }
        
        System.out.println("Str Sum " + strsum);
        int finalvalue = sum + 2 + strsum;
        System.out.println("Output :::" + finalvalue);
        return finalvalue;  
    }  
    
}
