import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели :");
        int n = sc.nextInt();

        switch (n){
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятничка");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресение");
                break;
             default:
                 System.out.println("В неделе 7 дней!");
                 break;
        }
    }
}
