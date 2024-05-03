import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Country c=new Country();
		// Write code here
    	while(true){
    	    System.out.println("1.Add\n2.Search\n3.Exit\nEnter your choice");
    		int choice =Integer.parseInt(sc.nextLine());
    		if(choice==1){
    		    System.out.println("Enter the country name");
    		    String name = sc.nextLine();
    		    System.out.println("Enter the capital name");
    		    String cap = sc.nextLine();
    		    c.add(name,cap);
    		}else if(choice==2){
    		    if(!c.getCountryMap().isEmpty()){
        		    System.out.println("Enter the country name");
        		    String name = sc.nextLine();
        		    System.out.println(c.search(name));
    		    }else{
    		        System.out.println("The map is empty");
    		    }
    		}else if(choice==3){
    		    System.out.println("Thank you for using the application");
    		    break;
    		}
    	}
		
	}
}