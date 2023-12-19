public class Exercise_2 {
    public static void main(String[] args) {
        long population = 10000000;
        int born = 14;
        int death = 8;
        for (int i = 1; i <= 10; i++) {
            if (born > 7) {
                born -= 1;
            }
            if (death > 6){
                death -= 1;
            }
            population += population * (born - death) / 1000;
        }
        System.out.printf("Численность населения составила: %d",population);


    }
    }
