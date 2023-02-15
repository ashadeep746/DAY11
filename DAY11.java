public class DAY11 {
    public int one(int num , int num1){
        int sum= num+num1;
        return sum;
    }
    public static int two(int num , int num1){
        int add=num+num1;
        return add;
    }
    public static void main(String[] args) {
        DAY11 N = new DAY11();
        DAY11 N1 =new DAY11();
        System.out.println(N.one(10,20));
        System.out.println(N1.two(10,10));
    }
}
