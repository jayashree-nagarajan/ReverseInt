public class ReverseInt {
    public int reverse(int x){
        String number = String.valueOf(x);
        String result="";
        int x1,l;
        l=number.length();
        try{
        if(number.charAt(0)=='+' || number.charAt(0)=='-'){
            l--;
            result=result+number.charAt(0);
            number = number.replace(number.charAt(0),' ');
            number = number.strip();
            x = Integer.parseInt(number);
        }
        while(l>0){

                x1 = x%10;
                x = x/10;
                l--;
                result = result+String.valueOf(x1);

            }

            return Integer.parseInt(result);
        }
        catch (NumberFormatException e){
            return 0;
        }

    }
    public static void main(String[] args){
        ReverseInt r =new ReverseInt();
        System.out.println("output"+r.reverse(-2147483648));
    }
}
