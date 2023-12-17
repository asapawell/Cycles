import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада:");
        float deposit = in.nextFloat();
//        в депозит начисляем процент из цикла, то есть переменная deposit счетчик
        System.out.print("Введите срок вклада в месяцах:");
        float month = in.nextInt();
        float percent = 7;
//создаем переменную с единицей, с типом float. во-первых программа не будет ругаться на некорректный тип данных
//если подставим единицу в формулу, то будет ошибка тк подсавили целый тип данных int
//во вторых единицу сделал для того чтобы расчитывался процент за 1! месяц, тк у нас цикл. если подставить 2
//то уже будет некорректный расчет
        float one = 1;
        for (int i = 0; i < month; i++){
            deposit += (deposit * percent * (one / 12) / 100);
        }
        System.out.printf("После %f месяцев сумма вклада составит: %f",month, deposit);
        in.close();



    }
}
