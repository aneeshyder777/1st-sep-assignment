//program to print prime numbers between 100 and 200
public class PrimeNumbers {
   public static void main(String[] args) {
      int high, low, i;//declare three variables
      boolean my_temp;
      low = 100;//assign lower limit
      high = 200;//assign upper limit
      System.out.println("The starting and ending numbers are defined as " + low + " and " +high);
      System.out.println("The prime numbers between the interval " +low + " and " + high + " are:");
      while (low < high) {
         my_temp = false;
         for(i = 2; i <= low/2; ++i) {
            if(low % i == 0) {
               my_temp = true;
               break;
            }
         }
         if (!my_temp && low != 0 && low != 1)
            System.out.print(low + " ");
           ++low;
      }
   }
}