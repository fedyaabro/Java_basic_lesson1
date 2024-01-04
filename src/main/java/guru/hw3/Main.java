package guru.hw3;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    //  примитивные типы данных + обертки
    //целочисленные типы
    byte aByte = 0; // -127 +127 8bit
    Byte byteWrapper = 0; // -127 +127 8bit
    short aShort = 0;// -32768 +32767 16bit
    Short shortWrapper = 0;
    int aInt = 0; // (-2^32) ...(-2^32-1) 32b
    Integer intWrapper = 0;
    long aLong = 0; //
    //числа с плавающей точкой
    float aFloat = 0.0F;
    Float floatWrapper = 0.0F;
    double aDouble = 0.0;
    Double doubleWrapper = 0.0;
    //Символьный
    char aChar = 'a';
    Character charWrapper = 'a';
    //Логический
    boolean aBoolean = true;
    Boolean booleanWripper = true;
    
    //Присвоения
    String name = "Вьше";
    //Арифметические + - /  * % ++ --
    System.out.println(4.0 + 3);
    
    int a = 10;
    int b = 20;
    int c = 25;
    int d = 25;
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("b / a = " + (b / a));
    System.out.println("b % a = " + (b % a));
    System.out.println("c % a = " + (c % a));
    System.out.println("a++   = " +  (++a));
    System.out.println("b--   = " +  (--a));
    // Проверьте разницу в d++ и ++d
    
    /**Постфиксная и префиксная запись инкрементов и дикрементов - очень интересно, но понятно не сразу**/
    System.out.println("d++   = " +  (d++));
    System.out.println("++d   = " +  (++d));
    
    //Сравнения > < >= <= != ==
    /**Нельза стравнивать == данные объектого типа, например String - нужно использовать equals**/
    System.out.println(3>=2);
    //Логические операторы &, &&, |, ||, !
    /** && не вычесляет остаток выражения, если результат уже известен**/
    String myName = "Fedor";
    Integer myAge = 29;
    
    System.out.println(myName.equals("Fedor") && myAge == 29);
    System.out.println(myName.equals("Fedor") || myAge == 27);
    System.out.println(!(myName.equals("Fedor") || myAge == 27));
    
    //Условный оператор if/else
    Character sex = 'm';
    String childName;
    
    if(a >= b){
      System.out.println("a > b");
    } else{
      System.out.println("b > a");
    }
    
    if(sex == 'm'){
      childName = "Valentin";
    }else {
      childName = "Valentina";
    }
    System.out.println(childName);
    
    //тернарный оператор
    childName = sex == 'm'
      ? "Valentin"
      : "Valentina";
    System.out.println(childName);
    
    //Строка ( и бесконечность объектных/ссылочных типов данных)
    String toBePrint = "HelloWorld";
    //Список
    List<String> teachers = List.of("1","2");
    
    //Ключевое слово new - для создания объектов исключение String и примитивные типы данных
    
    
    
    
  }
}