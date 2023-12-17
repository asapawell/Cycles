public class Execrcise2 {
    public static void main(String[] args){
        long population = 10000000;
        //int boost = 0;
        for (int i = 0; i < 10; i++){
            // добавим += boost, чтобы в boost записывалось новое значение и суммировалось
            population = population + (int)(population * 0.014 - population * 0.008);
            }
        System.out.printf("Численность населения через 10 лет: %d",population);
        }
    }
