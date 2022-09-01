// print "L" in star pattern
public class Lpattern {

	public static void main(String[] args) {
		int height=5;
		int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= height; j++)
	        {
	            if (i == height - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }

	}

}
