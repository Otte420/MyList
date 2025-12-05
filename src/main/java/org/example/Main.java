package org.example;
import org.example.List.List;

public class Main
{
    static void main()
    {
        var myList = new List();
        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(9);

        for(int i = 0; i < myList.size(); i++)
        {
            try
            {
                System.out.println(myList.get(i));
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("zu weit");
            }

        }
    }
}
