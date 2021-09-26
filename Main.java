import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        Database Database = new Database();
        int input = 0;
        String inputstring;
        int inputint;
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Food Management - @ 2021 by <Student ID - Student Name >");
        while(input!=5)
        {
            System.out.println("Select the options below: ");
            System.out.println("1. Add a new food ");
            System.out.println("2. Search a food by name ");
            System.out.println("3. Remove the food by ID ");
            System.out.println("4. Print the food list in the descending order of expired date ");
            System.out.println("5. Quit ");
            System.out.print("Enter: ");
            try
            {
                input = Integer.parseInt(sb.readLine());
                switch(input)
                {
                    case 1: System.out.print("Add: "); inputstring = sb.readLine(); Database.add(inputstring); break;
                    case 2: System.out.print("Scan: "); inputstring = sb.readLine(); Database.scan(inputstring); break;
                    case 3: System.out.print("Remove id: "); inputint = Integer.parseInt(sb.readLine()); Database.remove(inputint); break;
                    case 4: Database.printall(); break;
                }
            }
            catch(Exception e)
            {
                System.out.println("Error input");
                continue;
            }
        }
    }
}
