
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor==1){
            return Integer.MIN_VALUE;
        }

        long divid = Math.abs((long) dividend);
        long dsor = Math.abs((long)divisor);
        int result = 0;
        while ( divid >= dsor  ){
            long temp = dsor;
            int multiply = 1;
            while (divid >= temp << 1 ){
                 temp = temp <<1 ;
                 multiply = multiply <<1 ;
            }

            divid = divid- temp;
            result += multiply;

        }

        if ( dividend <1 ^ divisor <1 ){

             return  -result;
        }
        return result;
    }

}





public class Main{

}