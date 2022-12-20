public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    } // Задачи 1 - 3
    public static void task2() {

        // Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    } // Задачи 4 - 5
    public static void task3() {

        // Задание 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeighBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeighBoxers + " кг");

        var boxerWeightDifference = (weightSecondBoxer - weightFirstBoxer) % totalWeighBoxers;
        System.out.println("Разница между весами бойцов " + boxerWeightDifference + " кг!");

        // Задание 7
        var boxerWeightDifference1 = weightSecondBoxer - weightFirstBoxer;                          // использовали операцию вычитания
        System.out.println(boxerWeightDifference1);

        var boxerWeightDifference2 = (weightSecondBoxer - weightFirstBoxer) % totalWeighBoxers;     //использовали операцию остаток от деления
        System.out.println(boxerWeightDifference2);

        // Задание 8
        var workingHours = 640;
        var hoursPerWorker = 8;
        var numOfWorkers = workingHours / hoursPerWorker;
        System.out.println("Всего работников в компании - " + numOfWorkers + " человек");

        var newNumOfWorkers = numOfWorkers + 94;
        var newWorkingHours = newNumOfWorkers * 8;
        System.out.println("Если в компании работает " + newNumOfWorkers + " человека, то всего " + newWorkingHours + " часа работы может быть поделено между сотрудниками");
    } // Задачи 6 - 8
}