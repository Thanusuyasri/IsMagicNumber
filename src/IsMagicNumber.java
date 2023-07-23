import java.util.Scanner;

public class IsMagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while(num>0 || sum>0)
        {
            if(num == 0)
            {
                num = sum;
                sum = 0;
            }
            int temp = num%10;
            sum += temp;
            num /= 10;
        }
        int result = (sum == 1)?1:0;
        System.out.println(result);
    }
}
