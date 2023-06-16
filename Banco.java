import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String clientName = "Deivid Vieira";
		String accountType = "Checking";
		double accountBalance = 2500.00;
		
		String clientData = """
				************************************
				 Initial Customer Data:
				
				 Name:                %s
				 Account Type:        %s
				 Opening Balance:     R$ %.2f
				************************************
				""".formatted(clientName, accountType, accountBalance);
		
		System.out.println(clientData);
		
		int operation = 0;
		double receiveValue = 0, transferValue = 0;
		
		String options = """
				
				Operations
				
				1 - Check Balance
				2 - Receive Value
				3 - Transfer Value
				4 - Exit
				
				Choose an Operation:  """;
		
		while (operation != 4) {
			System.out.println(options);
			operation = input.nextInt();
			
			switch(operation) {
			case 1:
				System.out.println(">>> Current Balance: R$ " + accountBalance);
				break;
			case 2:
				System.out.println("Inform the value to receive: R$ ");
				receiveValue = input.nextDouble();
				accountBalance += receiveValue;
				System.out.println("Updated Balance: R$ " + accountBalance);
				break;
			case 3:
				System.out.println("Inform the value to transfer: R$ ");
				transferValue = input.nextDouble();
				if (accountBalance >= transferValue) {
					accountBalance -= transferValue;
					System.out.println("Updated Balance: R$ " + accountBalance);
				}else {
					System.out.println("There is not enough balance to carry out this operation.");
				}
				break;
			case 4:
				break;
			default:
				System.out.println(">>> Invalid Option");
				break;
			}
		}
		System.out.println(">>> Operations Finished.");
	}
}
