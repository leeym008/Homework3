import java.util.*;
public class B04 {
        public static void main(String[] args) {
	
	Scanner Input = new Scanner(System.in);
	
	System.out.printf("Input : ");
	double Money=Input.nextInt();
	double Output;
	
	if (Money > 80000000)
	Output = Money*0.37;
	else if (Money > 40000000)
	Output = Money*0.28;
	else if (Money > 10000000)
	Output = Money*0.19;
	else
	Output = Money*0.095;
	
	System.out.printf("Output : %f \n",Output);
	
	}
}
