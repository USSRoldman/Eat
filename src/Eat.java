import java.util.Arrays;

public class Eat {
    public static void main(String[] args) {
        int countOfMany = 199;
        if (countOfMany >= 500) {
            System.out.println("Пицца");
        } else if (countOfMany >= 300) {
            System.out.println("Шаурма");
        } else if (countOfMany >= 200) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Доширак");
        }
    }
}
