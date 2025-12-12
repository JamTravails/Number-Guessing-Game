import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	double weight;
	double newWeight;
	int choice;
	
	System.out.println("weight converter program\n");
	
	System.out.print("choose your option.\n");
	System.out.println("1 convert lbs to kgs.");	
	System.out.println("2 convert kgs to lbs.");
	choice = scanner.nextInt();
	
	if(choice == 1){
		System.out.print("Enter your weight in lbs:");
		weight = scanner.nextDouble();
		newWeight = weight * 0.453592;
		
		System.out.printf("your weight in kgs is %.2f", newWeight);
			}
			else if(choice == 2){
			    System.out.print("Enter your weight in kgs: ");
			    weight = scanner.nextDouble();
			    newWeight = weight * 2.20462;
			    
			    System.out.printf("your weight in lbs is %.2f", newWeight);
			    }
			    else{
			        System.out.print("please select a valid option.");
			        }
		
		
scanner.close();
	}
}