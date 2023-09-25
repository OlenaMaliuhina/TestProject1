package firstapp;
public class Main {
    public static void main(String[] args) {
        // 1. Написати програму, яка виведе в консоль довільний текст:
        System.out.println("Hello and welcome!");

        //  2. Написати програму, яка конвертує градусы Цельсія у Фаренгейти и Кельвіни
        Double celsius, kelvin, fahrenheit;
        celsius = 36.0;
        fahrenheit = 1.8*celsius + 32;
        kelvin = celsius + 273.16;
        System.out.println(celsius + " Celsius: "+ fahrenheit + " Fahrenheit; "+ + kelvin+ " Kelvin ");
        //"X Celsius: Y Fahrenheit; Z Kelvin"

        // 3. Написати програму, яка обчислює площу прямокутного трикутника, початкові значення сторін можна задати довільно.
        int side1=5, side2=3;
        double square;
        square=0.5*side1*side2;
        System.out.println("side1: "+ side1 + "  "+ " side2: "+side2);
        System.out.println("Square "+" = "+square);

        /* test comment */
    }
}
