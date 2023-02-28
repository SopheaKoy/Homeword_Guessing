import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuestName();
    }
    private static void GuestName(){
        int sum =0 ;
        int result = 0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name=sc.nextLine().toUpperCase();
            for (int i = 0 ;i<name.length();i++) {
                switch (name.charAt(i)) {
                    case 'A', 'J', 'S'->
                        result += 1;
                    case 'B', 'K', 'T'->
                        result += 2;
                    case 'C', 'L', 'U'->
                        result += 3;
                    case 'D', 'M', 'V'->
                        result += 4;
                    case 'E', 'N', 'W'->
                        result += 5;
                    case 'F', 'O', 'X'->
                        result += 6;
                    case 'G', 'P', 'Y'->
                        result += 7;
                    case 'H', 'Q', 'Z'->
                        result += 8;
                    case 'I', 'R'->
                        result += 9;
                    default->
                        result+=0;
                }
        }
        System.out.println("Result : "+result);
            if(result>10){
                char[] chars =String.valueOf(result).toCharArray();
                for (int i = 0 ;i< chars.length;i++) {
                    sum=sum+Character.getNumericValue(chars[i]);
                }
                System.out.println("Chapter : " +sum);
            }
    }
}