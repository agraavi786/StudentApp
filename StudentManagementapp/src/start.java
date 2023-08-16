import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student.Student;

public class start {

	public static void main(String[] args) throws IOException {
		System.out.println("App is started.....");
		Scanner sc = new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 for adding student details");
			System.out.println("Press 2 for Update student details");
			System.out.println("Press 3 for Delete student details");
			System.out.println("Press 4 for exit app");
			//int a= sc.nextInt();
			int a= Integer.parseInt(br.readLine());
			if(a==1) {
				
				System.out.println("Enter Student id");
				int sid= Integer.parseInt(br.readLine());
				
				System.out.println("Enter student name");
				String sname= sc.nextLine();
				
				System.out.println("Enter student phone");
				String sphone= sc.nextLine();
				
			    System.out.println("Enter student city");
				String scity= sc.nextLine();
			   
			   Student s= new Student(sid,sname,sphone,scity);
			   System.out.println(s);
				
			}
			else if(a==2) {
				
			}
			else if(a==3) {
				
			}
			else if(a==4)
			{
				break;
			}
			else {
				
			}
			
			
			
		}
		System.out.println("Thanku using my app .. see you soon bye bye..");
	}

}
