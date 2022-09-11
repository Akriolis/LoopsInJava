import java.lang.reflect.Array;

public class LoopsJava {
    // while loops

    public static int typeGoogol(){
        String googol = "1";
        int len = googol.length();
        while(len <= 100){
            googol = googol + "0";
            len = googol.length();
        }
        System.out.println(googol);
        return len;
    }

    public static int rollDice(int sizes){
        int output = (int) (Math.random() * sizes) + 1;
        return output;
    }

    public static int keepRolling(){
        int roll1 = rollDice(6);
        int roll2 = rollDice(6);
        int roll3 = rollDice(6);
        int roll4 = rollDice(6);
        int roll5 = rollDice(6);
        int count = 1;
        while (!(roll1 == roll2 && roll3 == roll4 && roll1 == roll5)){
            roll1 = rollDice(6);
            roll2 = rollDice(6);
            roll3 = rollDice(6);
            roll4 = rollDice(6);
            roll5 = rollDice(6);
            count++; // loop increment
        }
        return count;
    }

    public static String result (int x){
        String result = "Bingo! It took "+x+" tries!";
        return result;
    }

    // for loop
    public static String raiseAlarm(int numOfWarnings){
        String output = "";
        for (int i = 1; i <= numOfWarnings; i++){
            output = "Warning # " + i;
            System.out.println(output);
        } return output;
    }

    // loop counters

    public static int countBlocks (int levels) {
        int total = 0;
        for (int i = levels; i >= 0; i -= 2) {
            int blocksForLevel = i * i;
            total += blocksForLevel;
        } return total;
    }

    public static int countBlocks2 (int levels) {
        int total = 0;
        for (int i = 0; i <= levels; i++) {
            int blocksForLevel = i * i;
            total += blocksForLevel;
        } return total;
    }

    public static int countBlocks3 (int levels){
        int total = 0;
        int i = levels;
        while (i >= 0){
            int blockForLevel = i * i;
            total += blockForLevel;
            i = i - 2;
        } return total;
    }

    // i-- decrement
    // i++ (i=i+1), i-- (i=i-1), i-=5(i = i - 5), i+=5 (i=i+5)
    // i*=3 (i=i*3), i/=2(i = i /2)

    public static boolean rollASix(){
        int dice = rollDice(6);
        while (dice!=6){
            dice = rollDice(6);
            if (dice == 3)
                break;
            }
        if (dice == 6){
            return true;
        } else {
            return false;
        }
    }

    public static String result (boolean x){
        String result = "";
        if (x == true){
            result = "You won!";
        } else{
            result = "You lose!";
        } return result;
    }

    public static boolean play(){
        boolean wannaPlay = true;

        if (wannaPlay){
            return true;
        } else {
            return false;
        }
    }

    public static int martingale(){
        int money = 1000;
        int target = 1200;
        int bet = 10;
        while (money > bet && money < target){
            boolean win = play();
            if (win){
                money += bet;
                bet = 10;
            } else {
                money -= bet;
                bet *= 2;
                {
                    if (money >= target){
                        break;
                    }
                }
            }
        } return money;
    }

    // how to declare an array
    static int [] numbers = {1,2,3,4,5,6,7,9,10};

    static double [] doubles = {1.0,2.0,3.4,5.7};

    public static double calculateAverage(double [] temperatures){
        int size = temperatures.length;
        double total = 0;
        for(int i = 0; i < size; i++){
            total += temperatures[i];
        } double average = total / size;
        return average;
    }

    static double [] speed = {7.85,5.33,2.18,0.2};

    public static double search (double [] speed){
        int size = speed.length;
        double min = speed [0];
        for (int i=1; i<size; i++){
            if (speed[i] < min){
                min = speed[i];
            }
        } return min;
    }
    static String [] myNames = {"Billy", "Bob", "Booba", "LongCatJohnson","Esmeralda", "Ivan"};

    public static String findLongestName (String [] names){
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i<size; i++){
            if (names[i].length() > longestName.length()){
                longestName = names[i];
            }
        } return longestName;
    }

    // 2D arrays

    public static double englishAverage (int [] [] grades){
        int subjects = grades.length;
        int total = 0;
        for (int i = 0; i < 5; i++){
            total += grades[1][i];

        } double average = total / (double) subjects;
        return average;
    }

    public static double personalAverage (int [] [] Sandra){
        int total = 0;
        for (int i = 0; i < 4; i++){
            total += Sandra[i][2];

        } double average = total / 4.0;
        return average;
    }

    // nested loops
    /*
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            System.out.println("Hi!");
        }
     }
     */

    public static void main(String[] args) {
        System.out.println(typeGoogol());
        System.out.println(keepRolling());
        System.out.println(result(keepRolling()));
        raiseAlarm(5);
        System.out.println(countBlocks(10));
        System.out.println(countBlocks2(10));
        System.out.println(result(rollASix()));
        //System.out.println(numbers[1]);

        String [] newsOutlet = {"abc", "bbc", "CNN", "NBC", "FOX", "sky"};
        double lucky = (Math.random() * newsOutlet.length);
        int luckyInt = (int) lucky;
        System.out.println(newsOutlet[luckyInt]);

        System.out.println(calculateAverage(doubles));

        System.out.println(findLongestName(myNames));

        int [] gradesInEnglish = {93,70,98,90,75};
        int [] sandraGrades = {99,98,95,99};


    }
}
