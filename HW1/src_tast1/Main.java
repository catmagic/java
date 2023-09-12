// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        try{
            int number = scanner.nextInt();
            if(number<=0)
            {
                throw new InvalidNumberException("Некорректное число");
            }
            System.out.print("Число корректно");
        }
        catch(InvalidNumberException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
}
