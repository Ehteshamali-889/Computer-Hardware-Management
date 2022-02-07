import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args) throws IOException{
		int total=0;
		int temp=0;
		ServerSocket ss=new ServerSocket(4999);
				
		Socket s=ss.accept();
		
		PrintWriter pr=new PrintWriter(s.getOutputStream());

		System.out.println("Welcome to Computer Hardware Management");
		InputStreamReader in=new InputStreamReader(s.getInputStream());
		BufferedReader bf=new BufferedReader(in);
		String str=bf.readLine();
		System.out.println("Client:"+str);
		
		pr.println("You are welcome");
		pr.flush();
		
		str=bf.readLine();
		if(str.equalsIgnoreCase("Yes")) {
			pr.println("Mouse Rs500 Keyboard Rs 1000 CPU Rs 5000");
		}
		else {
			pr.println("Happy Shopping");
		}
		pr.flush();
		System.out.println("Total value:"+total);
		
		str=bf.readLine();
		if(str.equalsIgnoreCase("Mouse")) {
			total=500;
		}
		else if(str.equalsIgnoreCase("Keyboard")) {
			total=1000;
		}
		else if(str.equalsIgnoreCase("CPU")) {
			total=5000;
		}
		
		System.out.println("Client:"+str);
		
		pr.println("total:"+total);
		pr.flush();
		
		str=bf.readLine();
		temp=Integer.parseInt(str);
		total=total*temp;
		System.out.println("Total value:"+total);
		
		pr.println("Total expenditure:"+total);
		pr.flush();
		
		str=bf.readLine();
		System.out.println("Paid Amount:"+str);
		
		pr.println("Amount Paid:"+str);
		pr.flush();
		
		str=bf.readLine();
		if(str.equalsIgnoreCase("Mouse")) {
			pr.println("Mouse Rs500");
		}
		else if(str.equalsIgnoreCase("Keyboard")) {
			pr.println("Keyboard Rs 1000");
		}
		else if(str.equalsIgnoreCase("CPU")) {
			pr.println("CPU Rs 5000");
		}
		else {
			pr.println("You typed no so nothing displayed");
		}
		pr.flush();
		
		
		pr.println("Thanks for running the application.Come back soon.");
		pr.flush();
	}
}