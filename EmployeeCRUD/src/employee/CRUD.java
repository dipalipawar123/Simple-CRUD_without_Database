package employee;

import java.util.*;

public class CRUD {
	public static void main(String[] args) {
		
	     
		List<Employee> e = new ArrayList<Employee>();
		Scanner s =new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.println("Enter your choice");
			ch=s.nextInt();
			switch (ch) {
			case 1:
	            System.out.print("Enter ID : ");
                int ID = s.nextInt();
                System.out.print("Enter First_Name : ");
                String First_Name = s1.nextLine();
                System.out.print("Enter Last_Name : ");
                String Last_Name = s1.nextLine();
                System.out.print("Enter Email : ");
                String email = s1.nextLine();
                System.out.print("Enter Age : ");
                int Age = s.nextInt();
                
                
                e.add(new Employee(ID, First_Name,Last_Name,email,Age));
                System.out.println("---------------------");
                System.out.println("Record Inserted Sucessfully");
                System.out.println("---------------------");
				break;
			case 2:
	            System.out.println("---------------------");
                Iterator < Employee > i = e.iterator();
                while (i.hasNext()) {
                    Employee e1 = i.next();
                    System.out.println(e1);
                }
                System.out.println("---------------------");
                break;
			case 3:
	             boolean found = false;
                 System.out.print("Enter ID to Search : ");
                 int id = s.nextInt();
                 System.out.println("---------------------");
                 i = e.iterator();
                 while (i.hasNext()) {
                     Employee e1 = i.next();
                    if (e1.getID() == id) {
                            System.out.println(e1);
                         found = true;
                     }
                 }
                 if (!found) {
                     System.out.println("Record Not Found");
                 }
                 System.out.println("---------------------");
                 break;
			case 4:
	            found = false;
                System.out.print("Enter ID to Delete : ");
                ID = s.nextInt();
                System.out.println("---------------------");
                i = e.iterator();
                while (i.hasNext()) {
                    Employee e1 = i.next();
                    if (e1.getID() == ID) {
                        i.remove();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Record Not Found");
                } else {
                    System.out.println("Record is Deleted Sucessfully");
                }
                System.out.println("---------------------");
			case 5:
	            found = false;
                System.out.print("Enter ID to Update : ");
                ID = s.nextInt();
                ListIterator < Employee > li = e.listIterator();
                while (li.hasNext()) {
                    Employee e1 = li.next();
                    if (e1.getID() == ID ){
                        System.out.print("Enter new First_Name : ");
                        First_Name = s1.nextLine();
                        System.out.print("Enter new Last_Name : ");
                        Last_Name = s1.nextLine();
                        System.out.print("Enter new AGE : ");
                        System.out.print("Enter new Email : ");
                        email = s1.nextLine();
                        Age = s.nextInt();
                            li.set(new Employee(ID,First_Name,Last_Name,email,Age));
                        found = true;
                        
                  
                    }
                }
                System.out.println("---------------------");
                if (!found) {
                    System.out.println("Record Not Found");
                } 
                else {
                    System.out.println("Record is Updated Sucessfully");
                }
                System.out.println("---------------------");
            
			}
		}while(ch!=0);
	}

}
