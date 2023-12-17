import java.util.Scanner;
public class Exercise_4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float deposit = in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int month = in.nextInt();
//        создаем переменную период, в нее записываем переменную month, для того чтобы в последнем методе вывода
//        у нас вывелся не ноль, а месяц. если оставим переменную month, то цикл while всегда будет уменьшать значение по
//        условию.
        int period = month;
        float percent = 7;
        float one = 1;

        while (period > 0){
            deposit += (deposit * percent * (one / 12) / 100);
            period--;
        }
        System.out.printf("После %d месяцев сумма вклада составит: %f",month, deposit);
        in.close();
    }
}
