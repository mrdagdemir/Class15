package comsyntaxclass15;

public class MethodDemo1 {

    void method1(){
        System.out.println("i can use print statements in a void type method");
        int num=0;
        //return "balla"; becaue void means not data will be returned from this method
    }

    public static void main(String[] args) {
        MethodDemo1 methodsDemo1=new MethodDemo1();
        // int x=methodsDemo1.method1(); methods with void return type can't be assigned to
        //variables
    }
}
