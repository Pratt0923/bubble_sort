import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Bubble_sort {

    public static void main(String[] args) {
      System.out.println("the array right now is: " + transform_array(args));
    };

    public static ArrayList<Integer> transform_array(String[] args) {
      ArrayList<Integer> array;
      array = new ArrayList<Integer>();
        for (String item : args) {
            Integer element = Integer.parseInt(item);
            array.add(element);
        }
        bubble_sort(array);
        return array;
    }

    public static ArrayList<Integer> bubble_sort(ArrayList<Integer> array) {
      while (check_if_sorted(array) == false) {
        int i = 0;
        while ((i + 1) < array.size()) {
          if (array.get(i) > array.get(i + 1)) {
            Collections.swap(array, i, (i+1));
          }
          i += 1;
        }
      };
    return array;
  }

  public static Boolean check_if_sorted(ArrayList<Integer> array) {
    for (int i = 0; (i + 1) < array.size(); i++) {
        if (array.get(i) > array.get(i + 1)) {
            return false;
        }
    }
    return true;
  }
}
