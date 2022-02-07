import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Client {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("localhost",4999);
		String num;
		Scanner ins=new Scanner(System.in);
		System.out.println("Welcome to Computer Hardware Management");
		System.out.println("What is your name");
		num=ins.nextLine();

		PrintWriter pr=new PrintWriter(s.getOutputStream());
		pr.println(num);
		pr.flush();
		
		InputStreamReader in=new InputStreamReader(s.getInputStream());
		BufferedReader bf=new BufferedReader(in);
		String str=bf.readLine();
		System.out.println("Server:"+str+" "+num);
		
		System.out.println("Want to view Price of Product and Detail if so write Yes ,Else write No to do shopping.");
		num=ins.nextLine();
		pr.println(num);
		pr.flush();
		
		str=bf.readLine();
		System.out.println("Server:"+str);
		
		System.out.println("What do you want(Mouse,Keyboard,CPU) One product at a time like Mouse");
		num=ins.nextLine();
		pr.println(num);
		pr.flush();
		
		str=bf.readLine();
		System.out.println("Server:"+str);
		
		System.out.println("How much quantity you want?");
		num=ins.nextLine();
		pr.println(num);
		pr.flush();
		
		str=bf.readLine();
		System.out.println("Server:"+str);
		
		
		
		System.out.println("Pay the bill (By writing total amount)");
		num=ins.nextLine();
		pr.println(num);
		pr.flush();
		
		str=bf.readLine();
		System.out.println("Server:"+str);
		
		System.out.println("Enter name of product you want to search(For Example Mouse,Keyboard and CPU)");
		System.out.println("Or No if you donot want to search");
		num=ins.nextLine();
		pr.println(num);
		pr.flush();
		
		str=bf.readLine();
		System.out.println("Server:"+str);
		
		str=bf.readLine();
		System.out.println("Server:"+str);
	}
}