class Solution {
    public double myPow(double x, int n) {
        double pow=1;
      // double pow=Math.pow(x,n) ;
       long num = n; 
      if(n<0){
        num=-num;
        x=1/x;
      }
       while (num > 0) {

            if (num % 2 == 1) {
                pow = pow * x;
            }

            x = x * x;
            num = num / 2;
        }

       return pow;
    }
}
