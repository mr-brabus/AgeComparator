import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 55;
        int katyaAge = 55;
        int mishaAge = 55;

        int min = -1;
        int middle = -1;
        int max = -1;


        // Находим минимальный возраст
        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {

            min = vasyaAge;

        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;

        } else {
            min = mishaAge;
        }
        // Находим максимальный возраст
        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else {
            max = mishaAge;

            //Находим средний возраст
        }
        if (min != vasyaAge && max != vasyaAge) {
            middle = vasyaAge;

        } else if (min != katyaAge && max != katyaAge) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }
        System.out.println("Минимальный возраст " + min);
        System.out.println("Средний возраст " + middle);
        System.out.println("Максимальный возраст " + max);
    }
}
