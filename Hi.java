public class Hi {

    public void add(int a, int b){
        System.out.println("Hi class.");
        System.out.println("Sum: "+ (a+b));
    }
    public static void main(String[] args) {
        System.out.println("Hello World from main().");
        Hi h = new Hi();
        h.add(10,20);
    }

}
