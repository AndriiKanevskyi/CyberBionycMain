/*
Завдання 4

Створіть проект. Використовуючи логічний тип даних, створіть програму,
в якій буде логічне твердження, наприклад, «трава зелена» і поряд виведіть значення змінної, істинний цей вираз або хибний.
 */
public class exercise2_4 {
    public static void main(String[] args) {

       final boolean ukraineIsVictory =true; // це не помилка


        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("||" + "УкраЇна переможе - і це однозначно: "+ukraineIsVictory+" ");
            }
           System.out.println("||" + "УкраЇна переможе - і це однозначно: "+ukraineIsVictory+"||");
        }

    }
}
