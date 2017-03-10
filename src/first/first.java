package first;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/1/4.
 */

public class first {


    private static void test1() {
        int one = 10;
        int two = 20;
        int three = 0;
        three = one + two;
        System.out.println("three = one + two ==>" + three);
        three +=one;
        System.out.println("three += one ==>"+three);
        three-=one;
        System.out.println("three -= one ==>"+three);
        three *= one;
        System.out.println("three *= one ==>"+three);
        three /= one;
        System.out.println("three /= one ==>"+three);
        three %= one;
        System.out.println("three %= one ==>"+three);
    }

    private static void test2() {
        boolean a = true; // a同意
        boolean b = false; // b反对
        boolean c = false; // c反对
        boolean d = true; // d同意
        System.out.println((a && b )+"未通过");
        System.out.println((a || b )+"通过");
        System.out.println((!a )+"未通过");
        System.out.println((a ^ b )+"通过");
    }

    private static void test3(){
        int score=68;
        String mark = (score>60) ? "及格" : "不及格";
        System.out.println("考试成绩如何："+mark);
    }

    private static void test4(){
        int m = 5;
        int n = 7;
        int x = (m*8/(n+2))%m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("x:" + x);
    }
private static void test5(){
    int one = 21 ;
    //int two = one % 2;
    if(one % 2 == 0)
        System.out.println("one="+one+",是偶数");
    //if(two == 1)
    else
        System.out.println("one="+one+",是奇数");
}
private static void test6(){
    int age=25;
    if(age > 60)
        System.out.println("老年");
    else if(age <= 60 && age >40)
        System.out.println("中年");
    else if(40>age&&age>18)
        System.out.println("少年");
    else
        System.out.println("童年");
}
private  void test7(){
    int score = 94;
    String sex = "女";

    if(score > 80){
        if(sex.equals("女")){
            System.out.println("进入女子组决赛");
        }else{
            System.out.println("进入决赛");
        }
    }else{
        System.out.println("未进入决赛");
    }
}
private static void test8(){
    char today='日';
    switch(today){
        case('一'):
        case('三'):
        case('五'):
            System.out.println("吃包子");
        case('二'):
        case('四'):
            System.out.println("吃油条");
        case('日'):
            System.out.println("吃主席套餐");
    }
}

private static void test9(){
    int sum = 0; // 保存不能被3整除的数之和
    for (int i = 1; i<=100 ; i++ ) {
        if (i % 3 != 0) {
            sum = sum + i; // 累加求和
        }
    }
    System.out.println("1到100之间不能被3整除的数之和为：" + sum);
}
private static void test10(){
    int i ;
    int sum = 0;
    for(i=1;i<11;i++){
        sum += i;
        if(sum>20) {
            System.out.println("sum>20");
            break;
        }
    }
    System.out.println("sum="+sum);
}

private static void test11(){
    int i;
    int sum=0;
    for(i = 0;i<=10;i++){
        if(i % 2 != 0){
            continue;
        }
        sum += i;

    }
    System.out.println("sum="+sum);
}

    private static void test12() {
        // 变量保存成绩
        int score = 53;

        // 变量保存加分次数
        int count = 0;


        //打印输出加分前成绩

        System.out.println("加分前成绩：" + score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        for (count=0;score< 60;count++){
           score += 1;

        }
       System.out.println("加分后成绩:"+ score);
        //打印输出加分后成绩，以及加分次数
       System.out.print("共加了" + count + "次！");
    }

//定义数组
    private static void test13(){
    int [] score = {1,2,3,4,5};
    System.out.print("第二个成绩是:"+score[1]);
    }

//定义数组
    private static void test14(){
    //    String [] subjects= new String[]{"C","C++","C#","Java"};
        //等同于下面的代码
        String subjects [] = new String[]{"C","C++","C#","Java"};
        System.out.print("第4个科目是："+subjects[3]);
    }

    //循环输出数组
private static void test15(){
        String strings [] = new String [] {"a","b","c","d","e"};
        int i;
        for(i=0;i<5;i++){
            System.out.println("数组的第" + i + "个值为" + strings[i]);
        }
}

//输出数组中的最大值、最小值和平均值
    private static void test16(){
    int num [] = new int[]{10,555,20,15,39,60,88,1,20,56}; //数组长度为7
    int max=num[0];
    int min=num[0];
    double avr;
    int sum = 0;
    for(int i=1;i<num.length;i++){
        //max=max>num[i]?max:num[i];
        //min=min<num[i]?max:num[i];
        sum += num[i];
        if(num[i]>max){
            max=num[i];
        }
        if(num[i]<min){
            min=num[i];
        }
    }
        System.out.println("最大是："+max);
        System.out.println("最小是："+min);
        System.out.println("平均值是："+sum/num.length);
    }

//Arrays操作数组
 //import java.util.Arrays;
    private static void test17(){

        String [] strings = new String []{"ac","bf","ddc","z"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }

//输出二维数组
    private static void test18(){
        String [][] names =  {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
        for(int i=0; i<names.length;i++){
            for(int j=0; j<names[i].length;j++){
                System.out.println(names[i][j]);
            }
            System.out.println();
        }
    }

   //输出最大年龄,无参有返回值
    private static int test19(){
        int [] ages =new int []{18,23,21,19,25,29,17};
        int max=ages[0];
        for(int i = 0; i<ages.length;i++){
            if(max<ages[i]){
                max = ages[i];
            }
        }
        System.out.println(max);
        return max;
    }

    // /带参无返回值方法的使用--计算平均分
    public double test20(double num1,double num2){
    double num3= (num1 + num2)/2;
        System.out.println(num3);
    return num3;
    }

    //带参带返回值方法的使用
    private int test21(int []scores){
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        return scores.length;
    }

    public static void main(String[] args) {
  //  test11();
    //方法调用
        first a = new first();
    //    int max = a.test19();
        int [] scores = {99,65,22,88,76};
        int count= a.test21(scores);
        System.out.println("共有"+count+"个成绩信息！");

    }
}

