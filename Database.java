import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Database {
    ArrayList<String> foods = new ArrayList<String>();
    ArrayList<Integer> ID = new ArrayList<Integer>();
    ArrayList<String> DATE = new ArrayList<String>();
    void add(String add)
    {
        int id = 1;
        for(String i : foods)
            id++;
        LocalDateTime date = LocalDateTime.now();
        foods.add(add);
        ID.add(id);
        DATE.add(date+"");
        System.out.println("Succes");
        return;
    }
    void scan(String scan)
    {
        for(int i=0; i< foods.size() ;i++)
        {
            if( foods.get(i).equals(scan))
            {
                System.out.println("ID "+ID.get(i)+":  "+foods.get(i)+"  "+DATE.get(i));
                return;
            }
        }
        System.out.println("This food does not exist");
        return;
    }
    void remove(int remove)
    {
        for(int i =remove-1; i<= ID.size()-2;i++)
        {
            ID.set(i, ID.get(i+1)-1);
            foods.set(i, foods.get(i+1));
            DATE.set(i, DATE.get(i+1));
        }
        ID.remove(ID.size()-1);
        foods.remove(foods.size()-1);
        DATE.remove(DATE.size()-1);
    }
    void printall()
    {
        for(int i = 0 ; i < ID.size();i++)
        {
            System.out.println("ID "+ID.get(i)+":  "+foods.get(i)+"  "+DATE.get(i));
        }
    }
}
