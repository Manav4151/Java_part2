// 21CE097 Manav Patel
//Develop a Program that illustrate method overloading concept.

public class method_Overloding {

    void sum(int a, int b) {
        System.out.println("First Method call \n"+(a + b));
    }
    // Method overloding by number of arguments
    void sum(int a, int b, int c) {
        System.out.println("Three Argument method call\n"+(a + b + c));
    }
    // Method overloding by changing data type
    void sum (int x, double y){
        System.out.println("Last Method call\n"+(x+y));
    }

    public static void main(String args[]) {
        method_Overloding add = new method_Overloding();
        add.sum(20, 20);
        add.sum(20, 20, 20);
        add.sum(20, 20.8); // int & double 


    }

}
