package Oops.Interface;
interface Inter1{
     int x = 112;
//   public abstract void method1();
    void method1();
}
interface Inter2{
    int x = 115;
    void method3();
}
public class Test1 implements Inter1 {

//    if interface is blank it is known as marker interface
//    if interface has only one method it is kknown as functional interface
    public static void main(String[] args) {
        System.out.println("main entry point");
        System.out.println(Inter1.x);


    }
    public void method1(){
        System.out.println("this is my method1");
    }
    public void method3(){
        System.out.println("this my method3");
    }
}
