package SYP.firstGame;

import java.io.*;
import java.util.*;
public class GameHelper {
    private  static final String alpabet = "abcdefg";
    private int gridLength=7;
    private int gridSize = 49;
    private int [] grid =new int[gridSize];
    private int comCount = 0;
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return  null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }
    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String[comSize];    //хранит координаты типа f6
        String temp = null;                             //временная строка для конкатенации
        int [] coords = new int[comSize];               //координаты текущего "сайта"
        int attempts = 0;                               //счётчик текущих попыток
        boolean success = false;                        //нашли подходящее местоположение?
        int location = 0;                               //текущее начальное местоположение
        comCount++;                                     //энный сайт для размещений
        int incr = 1;                                   //устанавливаем горизонтальный инкремент
        if ((comCount % 2)==1) {                        //если нечётный (размещаем вертикально)
            incr = gridLength;                          //устанавливаем вертикальный инкремент
        }
        while (!success & attempts++ < 200) {           //главный поисковый цикл (32)
            location = (int) (Math.random()*gridSize);  //получаем стартовую точку
            System.out.println("Пробуем " + location);
            int x = 0;                                  //энная позиция в "сайте", который нужно разместить
            success=true;                               //предполагаем успешный исход
            while (success && x< comSize) {             //ишем соседнюю неиспользованную ячейку
                if(grid[location] ==0 ) {               //если ещё не ипользуется
                    coords[x++] = location;             //сохраняем местоположение
                    location+=incr;                     //пробуем "следующую" соседнюю ячейку
                    if(location>=gridSize) {            //вышли за рамки - низ
                        success=false;                  //неудача
                    }
                    if (x>0 && (location % gridLength == 0)) {  //вышли за рамки - правый край
                        success = false;                //неудача
                    }
                } else {
                    System.out.println("используется " + location);
                    success = false;
                }
            }
        }
        int x =0;
        int row =0;
        int column =0;
        while (x < comSize) {
            grid[coords[x]]=1;                          //помечаем ячейки на главной сетке как "использованные"
            row = (int) (coords[x] / gridLength);       //получаем значение строки
            column = coords[x]% gridLength;             //получаем числовое значение столбца
            temp = String.valueOf(alpabet.charAt((column)));    //преобразуем его в строковый символ
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" coord "+x+" = " + alphaCells.get(x-1));
        }
        return alphaCells;
    }
}