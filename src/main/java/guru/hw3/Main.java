package guru.hw3;

import java.util.List;

/** class в джаве - описание нового типа данных, пример String -  класс **/
/**Классы всегда с большой буквы, слова разделяются кемелкейсом**/
/** область видимости(то, что в фигурных скобках)**/
/**void Означает, что после выполнения кода main не будет результата**/

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    //Строка ( и бесконечность объектных/ссылочных типов данных) по хорошему,  в джаве бесконечное колличество типов данных тк каждый класс - по сути тип данных
    String toBePrint = "HelloWorld";
    //Список
    List<String> teachers = List.of("1","2");
    
    
    //Ключевое слово new - для создания объектов исключение String и примитивные типы данных
    
    String example = new String("example");
    System.out.println(example);

  }
}