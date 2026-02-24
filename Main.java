public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String languages[] = {"C", "C++", "C#", "Phyton", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);

        int a = n * 3;
        System.out.println(a);

        a = a + 0b1001;
        System.out.println(a);

        a = a + 0xFF;
        System.out.println(a);

        a = a * 6;
        System.out.println(a);

        int result = a;
        while(result > 9){
            int sum = 0;
            while(result > 0) {
                sum = sum + result % 10;
                result = result / 10;
            }
            result = sum;
        }
        System.out.println(result);

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
    }

}
