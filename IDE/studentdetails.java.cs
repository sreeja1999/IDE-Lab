import java.util.*;

class StudentDetails{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long phone;
        int marks[] = new int[6];
        String name,address;
        System.out.print("Enter Name : ");
        name = in.nextLine();
        System.out.print("Enter Address : ");
        address = in.nextLine();
        System.out.print("Enter PhoneNumber : ");
        phone = in.nextLong();
        for(int i=0;i<6;i++){
            System.out.print("Enter Marks(Out Of 15) in Subject-"+(i+1)+" : ");
            marks[i] = in.nextInt();
        }
        int total = 0;
        System.out.println("Details : \nName : "+name+"\nAddress : "+address+"\nPhone : "+phone);
        for(int i=0;i<6;i++){
            System.out.println("Marks in Subject-"+i+" : " + marks[i]);
            total+=marks[i];
        }
        System.out.println("Average Marks : " + total/6);
        System.out.println("Percentage : " + (total*100)/90 + "%");
        
    }
}