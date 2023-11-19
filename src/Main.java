public class Main {
    public static void main(String[] args) {
        System.out.println("***isPalindrome");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("**isPalindrome2");
        System.out.println(isPalindrome2(-1221));
        System.out.println(isPalindrome2(707));
        System.out.println(isPalindrome2(11212));
        System.out.println("***isPerfectNumber");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("***numberToWords");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    //Main ends here

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static boolean isPalindrome(int num) {
        //stringe çevir
        if(num<0){
            num=-num;
        };
        String str=Integer.toString(num);
        String strRev=reverseString(str);
        int numRev=Integer.valueOf(strRev);
        return num==numRev;

//function isPalindrome(num){
//    if(num<0){
//    num=num*-1
//}
//return (String(num).split("").reverse().join("")) == num ? true : false
//
//}
//isPalindrome(101)

    }

    public static boolean isPalindrome2(int num) {
        num=Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        String reversed = "";
        for(int i=digits.length-1;i>=0;i--){
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(num));
    }

    //public static boolean isPerfectNumber(int num) {
//function isPerfectNumber(num){
//let arr=[]
//for(let i=1;i<num;i++){
//    if(num%i===0){arr.push(i)}
//}
//let arrtotal=arr.reduce((toplam,s)=>toplam+=s,0)
//return arrtotal===num
//}isPerfectNumber(12)
    //}
    public static boolean isPerfectNumber(int num) {
        if(num<0){
            return false;
        }
        int total =0;
        for (int i=1;i<=num/2;i++){
            if(num%i==0){
                total+=i;
            }
        }
        return num==total;

    }

    public static String numberToWords(int num) {
        if(num<0){
            return "invalid value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText="";
        for(char digit:digits){
            switch(digit){
                case '0':
                    numToText+="Zero ";
                    break;
                case '1':
                    numToText+="One ";
                    break;
                case '2':
                    numToText+="Two ";
                    break;
                case '3':
                    numToText+="Three ";
                    break;
                case '4':
                    numToText+="Four ";
                    break;
                case '5':
                    numToText+="Five ";
                    break;
                case '6':
                    numToText+="Six ";
                    break;
                case '7':
                    numToText+="Seven ";
                    break;
                case '8':
                    numToText+="Eight ";
                    break;
                case '9':
                    numToText+="Nine ";
                    break;
            }
        }
        return numToText;
    }
}