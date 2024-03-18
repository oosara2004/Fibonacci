import java.util.Scanner;
public class Methods{
public static void main(String[] args) {
    // take an input from the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter n:");
    int n = scanner.nextInt();
    // call the method & print the final results
    System.out.println("The fibonacc of "+n+" = "+fibonacci(n));
}
// creat a method can return a value            hint : public static (type) able to return a value but (void) can't!
public static int fibonacci(int fibo){
// if n = 0 or 1 will return spasific value otherwise will use mathimatical equation
    if (fibo==0) return 0;
    else if (fibo==1) return 1;
    else return fibonacci(fibo-1)+fibonacci(fibo-2);
}
}
