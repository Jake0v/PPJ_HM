java.util.Scanner scanner = new java.util.Scanner(System.in);

void main() {

    /* Task 1

    int num = scanner.nextInt();

    int d1 = (num % 10);
    int d2 = (num / 10 % 10);
    int d3 = (num / 100);

    IO.println("" + d1 + d2 + d3);
    */

    /* Task 2

    IO.println("Type in your birthday date in a string of numbers: day/month/year, write zero before single numbers"); // my BD: 10042007
    int BD = scanner.nextInt();

    int d8 = (BD % 10);
    int d7 = (BD / 10 % 10);
    int d6 = (BD / 100 % 10);
    int d5 = (BD / 1000 % 10);
    int d4 = (BD /10000 % 10);
    int d3 = (BD /100000 % 10);
    int d2 = (BD /1000000 % 10);
    int d1 = (BD /10000000);

    IO.println("Day: " + d1 + d2 + " Month: " + d3 + d4 + " Year: " + d5 + d6 + d7 + d8);
    */

    /* Task 3

    char symbols = '!'; //1
    char letters = 'H'; //4
    char moreSymbols = '&'; //3
    IO.println(symbols + letters + more_symbols);
    */

    /* Task 4

    boolean student = false;

    if(student){
        IO.println("You are a student");
        IO.println("You can't be a teacher");
    }else{
        IO.println("You are a teacher");
        IO.println("You can't be a student");
    }
    */

    /* Task 5

    boolean isItRaining = false;

    if(isItRaining){
        IO.println("It is raining right now.");
    }else{
        IO.println("It is not raining right now");
    }
    */

    /* Task 6

    boolean isItRaining = true;
    boolean isItSunny = false;

    if(isItRaining == false && isItSunny == true){
        IO.println("Sunny");
    }else if (isItRaining == true && isItSunny == false){
        IO.println("Sloppy");
    }

    if(isItRaining == true && isItSunny == true){
        IO.println("Rainbow");
    }else if(isItRaining == false && isItSunny == false){
        IO.println("Cloudy");
    }
    */

    // Task 7

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    IO.println(a + " " + b + " " + c);

    int tempNum;

    if(a > b){
        tempNum = a; // we store a in tempNum
        a = b; // we store b in a
        b = tempNum; // we store tempNum in b
    } // a <= b

    if(a > c){
        tempNum = a;
        a = c;
        c = tempNum;
    } // a <= c

    if(b > c){
        tempNum = b;
        b = c;
        c = tempNum;
    } // b <= c

    IO.println(a + " " + b + " " + c);

    /* My first try of Task 7:

    if(x > z && x > y){
        int c = x;
    } else if(y > z && y > x){
        int c = y;
    } else if(z > x && z > y){
        int c = z;
    } // to store the biggest number in c

    if(x < z && x < y){
        int a = x;
    } else if(y < z && y < x){
        int a = y;
    } else if(z < x && z < y){
        int a = z;
    } // to store the smallest number in a
    */
}
