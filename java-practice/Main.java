public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = method(a);
        System.out.println(a +" " +b);
    }

    public static boolean method(boolean b){
        b = false;
        return b;
    }
}