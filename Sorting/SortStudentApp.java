import java.util.*;
class SortStudentApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        
        SortStudents ss = new SortStudents(size);

        for(int i = 0; i < size; i++)
        {
            Students student = new Students();
            System.out.print("Enter student "+(i + 1)+" id : ");
            int id = scan.nextInt();
            student.setId(id);
            scan.nextLine();
            System.out.print("\nEnter student "+(i + 1)+" first name : ");
            String fnm = scan.nextLine();
            student.setFirstName(fnm);
            System.out.print("\nEnter student "+(i + 1)+" last name : ");
            String lnm = scan.nextLine();
            student.setLastName(lnm);
            System.out.print("\nEnter student "+(i + 1)+" major : ");
            String major = scan.nextLine();
            student.setMajor(major);

            ss.insert(student);
            System.out.println();
        }

        System.out.println("Students before sorting by their last name : ");
        System.out.println();
        System.out.println("===============================================================================");
        System.out.println("Id\t\tFirst Name\t\tLast Name\t\tMajor");
        System.out.println("===============================================================================");
        ss.display();

        System.out.println("Students after sorting by their last name : ");
        System.out.println();
        System.out.println("===============================================================================");
        System.out.println("Id\t\tFirst Name\t\tLast Name\t\tMajor");
        System.out.println("===============================================================================");
        ss.sortStudentsByLastName();
        ss.display();

    }
}