// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        try{
            if(number2==0)
            {
                throw new DivisionByZeroException("Деление на ноль недопустимо"");
            }
            System.out.print( number1/number2);
        }
        catch(DivisionByZeroException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
}
