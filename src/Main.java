// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println( "Переменная dog = " + dog + " Переменная cat = " + cat + " Переменная paper = " + paper);
    //task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println( "Переменная dog = " + dog + " Переменная cat = " + cat + " Переменная paper = " + paper);
     //task 3
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper  - 7639;
        System.out.println( "Переменная dog = " + dog + " Переменная cat = " + cat + " Переменная paper = " + paper);
    //task 4
        var friend = 19;
        System.out.println("Переменная friend = " + friend);
        friend = friend + 2;
        System.out.println("Переменная friend = " + friend);
        friend = friend / 7;
        System.out.println("Переменная friend = " + friend);
    //task 5
        var frog = 3.5;
        System.out.println("Переменная frog = " + frog);
        frog = frog * 10;
        System.out.println("Переменная frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Переменная frog = " + frog);
        frog = frog + 4;
        System.out.println("Переменная frog = " + frog);
    //task 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров = " + totalWeight + " кг.");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров = " + weightDifference + " кг.");
     //task 7
        weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров = " + weightDifference + " кг.");
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе боксеров = " + weightDifference + " кг.");
    //task 8.1
        var totalHours = 640;
        var hoursForEmployee = 8;
        var totalEmployeers = totalHours / hoursForEmployee;
        System.out.println("Всего работников в компании - " + totalEmployeers+ " человек.");
    //task 8.2
        var newEmployeers = 94;
        totalEmployeers = totalEmployeers + newEmployeers;
        totalHours = totalEmployeers * hoursForEmployee;
        System.out.println("Если в компании работает " + totalEmployeers + " человек, то всего " + totalHours +" часов может быть поделено между сотрудниками");
    }
}