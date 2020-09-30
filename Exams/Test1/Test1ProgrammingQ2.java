import java.util.ArrayList;
import java.util.Arrays;

public class Test1ProgrammingQ2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 3, 1, 5}));

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 4, 6}));

        System.out.println(union(list1 , list2));

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (Integer number : list1){
            if(!temp.contains(number)){
                temp.add(number);
            }
        }

        for (Integer number : list2){
            if(!temp.contains(number)){
                temp.add(number);
            }
        }

        return temp;
    }
}
