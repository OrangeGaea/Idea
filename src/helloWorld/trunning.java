package helloWorld;

import java.util.Arrays;
public class trunning {
    public int radNum(int [] num){
        num = new int[5];
        for(int i = 0; i<5;i++){
            num[i]=(int)(Math.random() * 100);
        }
        Arrays.toString(num);
        System.out.println(num);
        return num[5];
    }
    public static void main(String [] args){
      trunning a = new trunning();
      int num[]={100,50,45,12,1222};
      System.out.println(num);
    }
}
