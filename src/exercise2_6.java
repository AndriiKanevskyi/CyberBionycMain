/*
Завдання 6
Використовуючи IntelliJ IDEA, створіть проект.
Створіть необхідну кількість змінних типу char, кожній змінній надайте значення одного символу у форматі UNICODE.
Виведіть у консоль фразу «Добридень, ВАШЕ_ІМ'Я!».
 */
public class exercise2_6 {
    public static void main(String[] args) {

        char dhigh = '\u0414';
        char o ='\u043E';
        char b ='\u0431';
        char r ='\u0440';
        char y ='\u0438';
        char e ='\u0435';
        char n ='\u043d';
        char soft ='\u044c';
        char comma = '\u002C';
        char space ='\u0020';
        char ahigh ='\u0410';
        char dlow ='\u0434';
        char i ='\u0456';
        char j ='\u0439';
        char wykryknyk ='\u0021';
        System.out.println(""+dhigh+o+b+r+y+dlow+e+n+soft+comma+space+ahigh+n+dlow+r+i+j+wykryknyk);
    }
}
