import java.util.Scanner;
import java.util.Vector;

import Model.Member;
import Model.Regular;
import Model.VIP;

public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<Member> memberList = new Vector<>();
	
	public Main() {
		
		programMenu();

	}

	void programMenu() {
		
		memberList.add(new Regular("syalum", "Female", "081318912394", "Regular", 2, "R00005", 9));
		
		int menu = 4;
		
		while (menu != 0) {
			System.out.println("JtheateR");
			System.out.println("========");
			System.out.println("1. Add new member");
			System.out.println("2. View all members");
			System.out.println("3. Watch a movie");
			System.out.println("0. Exit");
			System.out.print(">> ");
			try {
				menu = scan.nextInt();
			} catch (Exception e) {
				
			} scan.nextLine();
			
			switch (menu) {
			case 1:
				addMember();
				System.out.println("\nPress Enter to Continue ...");
				scan.nextLine();
				break;
			case 2:
				viewMember();
				System.out.println("\nPress Enter to Continue ...");
				scan.nextLine();
				break;
			case 3:
				watchMovie();
				System.out.println("\nPress Enter to Continue ...");
				scan.nextLine();
				break;
			case 0:
				System.out.println("Thankyou for using this apps!");
				break;
			default:
				break;
			}
		}
		
	}

	void addMember() {
		
		String name = "",gender = "", phoneNumber = "", memberStatus = "", email = "", 
				generateVIPID = "", generateLounge = "", generateRegularID = "";
		Integer queueVIP = 0, queueRegular = 0, poin = 0;
		
		while (true) {
			System.out.print("Input your name [5 - 12 characters] : ");
			name = scan.nextLine();
			
			if(name.length()>= 5 && name.length()<=12) {
				break;
			}
		}
		
		while (true) {
			System.out.print("Input your gender [Male / Female] (case sensitive) : ");
			gender = scan.nextLine();
			
			if(gender.equals("Male") || gender.equals("Female")) {
				break;
			}
		}
		
		while (true) {
			System.out.print("Input your phone number [must be 12 characters and numeric]  : ");
			phoneNumber = scan.nextLine();
			
			if(phoneNumber.length()==12) {
				//ini dijadiin is digit kl masi ada waktu
				break;
			}
		}
		
		while (true) {
			System.out.print("Input your status [VIP / Regular] (case sensitive) : ");
			memberStatus = scan.nextLine();
			
			if(memberStatus.equals("VIP") || memberStatus.equals("Regular")) {
				break;
			}
		}
		
		if (memberStatus.equals("VIP")) {
			
			while (true) {
				System.out.print("Input your email [Must ends with '@gmail.com'] : ");
				email = scan.nextLine();
				
				if(email.endsWith("@gmail.com")) {
					break;
				}
			}
			
			double a = 0,b = 0,c = 0,d = 0,e = 0;
			
			a = Math.random()*10;
			b = Math.random()*10;
			c = Math.random()*10;
			d = Math.random()*10;
			e = Math.random()*10;
			generateVIPID = "V" + (int)a + (int)b + (int)c + (int)d + (int)e;
			
			double f = Math.random()*4;
			double g = Math.random()*4;
			double h = Math.random()*4;
			generateLounge = "Lounge " + (int)f + (int)g + (int)h;
			
			queueVIP = 0;
			
			memberList.add(new VIP(name, gender, phoneNumber, memberStatus, poin, email, generateVIPID, generateLounge, queueVIP));
			
		} else if (memberStatus.equals("Regular")){
			
			double a = 0,b = 0,c = 0,d = 0,e = 0;
			
			a = Math.random()*10;
			b = Math.random()*10;
			c = Math.random()*10;
			d = Math.random()*10;
			e = Math.random()*10;
			generateRegularID = "R" + (int)a + (int)b + (int)c + (int)d + (int)e;
			
			queueRegular = memberList.size()+1;

			memberList.add(new Regular(name, gender, phoneNumber, memberStatus, poin, generateRegularID, queueRegular));
			System.out.println();
		}
		
		System.out.println("A new member has been added");
	}

	void viewMember() {

		if (memberList.size()==0) {
			System.out.println("Currently, there are no member...");
		} else {
			
			System.out.println("============================================================================================================================");
			System.out.printf("| %-49s %-20s %-49s |\n", "", "JtheateR Member List", "");
			System.out.println("============================================================================================================================");
			System.out.printf("| %-3s | %-12s | %-6s | %-12s | %-7s | %-6s | %-6s | %-26s | %-10s | %-5s |\n", "No", "Name", "Gender", "Phone Number", "Status", "ID", "Points", "Email", "Lounge","Queue");
			System.out.println("============================================================================================================================");
			
			int numb = 0;
			
			for (Member member : memberList) {
				numb++;
				System.out.printf("| %-3s | %-12s | %-6s | %-12s | %-7s | ", numb, member.getName(), member.getGender(), member.getPhoneNumber(), member.getMemberStatus());
				
				if (member instanceof VIP) {
					System.out.printf("%-6s | %-6s | %-26s | %-10s | %-5s |\n", ((VIP)member).getGenerateVIPID(), ((VIP)member).getPoin(), ((VIP)member).getEmail(), ((VIP)member).getGenerateLounge(),((VIP)member).getQueueVIP());
				} else if (member instanceof Regular){
					System.out.printf("%-6s | %-6s | %-26s | %-10s | %-5s |\n", ((Regular)member).getGenerateRegularID(), ((Regular)member).getPoin(), "-", "-",((Regular)member).getQueueRegular());
				}

			}
		
			System.out.println("============================================================================================================================");

		}
		
	}

	void watchMovie() {
		if (memberList.size()==0) {
			System.out.println("Currently, there are no member...");
		} else {
			
			String input = "";
			int temp = 0;
			
			viewMember();
			
			System.out.print("\nInput your ID : ");
			input = scan.nextLine();
				
			for (Member i : memberList) {
//				if (((VIP)i).getGenerateVIPID().equals(input)) {
//					i.setPoin(i.calculatePoint());
//					temp++;
//				} else if (((Regular)i).getGenerateRegularID().equals(input)) {
//					i.setPoin(i.calculatePoint());
//					temp++;
//				}
				if(i instanceof VIP) {
					if (((VIP)i).getGenerateVIPID().equals(input)) {
						i.setPoin(i.calculatePoint());
						temp++;
					}
				} else {
					if (((Regular)i).getGenerateRegularID().equals(input)) {
						i.setPoin(i.calculatePoint());
						temp++;
					}
				}
				
			}
			
			if (temp == 0) {
				System.out.println("There are no member with that ID");
			} else {
				System.out.println("Thankyou for watching");
			}
			
			
			
		}
	}

	public static void main(String[] args) {

		new Main();

	}

}
