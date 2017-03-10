package helloWorld;

//含参方法调用
import java.util.Arrays;
public class hello {
  public static void  main(String[] agrs) {
      hello a = new hello();
     int [] scores =new int [] {78,89,54,56,45,12,23,19};
     int count = a.sort(scores);
     System.out.println("count="+count);
    }

    private int sort(int [] scores){
      Arrays.sort(scores);
      System.out.println(Arrays.toString(scores));
      return scores.length;
    }
}

