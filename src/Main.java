public class Main {

    public static void main(String[] args) {
        String[] rainbow = {"Красный", "Оранжевый", "Желтый", "Зеленый","Голубой","Синий","Фиолетовый"};
        int j = rainbow.length - 1 / 2;
        for (int i = 0; i < j; i++) {
            j--;
            String storage = rainbow[i];
            rainbow[i] = rainbow[j];
            rainbow[j] = storage;
        }
        for (int i = 0; i < rainbow.length; i++) {
            System.out.println( rainbow[i]);
        }

        System.out.println("-------------------------\n");


     String [] hor = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int [] [] ver = {
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8},
        };
for (int a = 0; a < ver.length; a++){
    for (int b = 0; b < ver[a].length; b++){
        System.out.print("|" + hor[a] + ver[a][b]);
    }System.out.print("|\n-------------------------\n");
}

    }
    }

