package guru.hw3;

import java.util.List;
/** class в джаве - описание нового типа данных, пример String -  класс **/
/**Классы всегда с большой буквы, слова разделяются кемелкейсом**/
/** область видимости(то, что в фигурных скобках)**/
/**void Означает, что после выполнения кода anotherExample не будет результата**/

public class DataTypes{
  
  void simpleTypesAndWrappers() {
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
  }
  
  void mathOperators() {
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
    System.out.println("a++   = " + (++a));
    System.out.println("b--   = " + (--a));
    // Проверьте разницу в d++ и ++d
    
    /**Постфиксная и префиксная запись инкрементов и дикрементов - очень интересно, но понятно не сразу**/
    System.out.println("d++   = " + (d++));
    System.out.println("++d   = " + (++d));
  }
  
  void compareOperators() {
    //Сравнения > < >= <= != ==
    /**Нельза стравнивать == данные объектого типа, например String - нужно использовать equals**/
    System.out.println(3 >= 2);
    //Логические операторы &, &&, |, ||, !
    /** && не вычесляет остаток выражения, если результат уже известен**/
    String myName = "Fedor";
    Integer myAge = 29;
    
    System.out.println(myName.equals("Fedor") && myAge == 29);
    System.out.println(myName.equals("Fedor") || myAge == 27);
    System.out.println(!(myName.equals("Fedor") || myAge == 27));
  }
  
  void appropriationOperators(){
    //Присвоения
    String name = "Вьше";
  }
  
  void conditionalOperators(){
    //Условный оператор if/else
    Character sex = 'm';
    String childName;
    
    int a = 10;
    int b = 20;
    
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
    
    //switch/case
    int num = 8;
    switch(num){
      
      case 1:
        System.out.println("число равно 1");
        break;
      case 8:
        System.out.println("число равно 8");
        num++;
        break;
      case 9:
        System.out.println("число равно 9");
        break;
      default:
        System.out.println("число не равно 1, 8, 9");
    }
    
  }
  }
  
    
