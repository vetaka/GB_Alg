package geekbrains.couse2;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        if (array.length == 0) {
            System.out.println("Отсутствует 1");
            return;}
        int sumCheck=array[0]+array[array.length-1];
        int sumLR;
        for (int i = 0; i < array.length/2+1 ; i++) {
           sumLR = array[i] + array[array.length-1-i];
           if (sumLR != sumCheck) {
               if (i+1 != array[i]) //если элемент(слева) не равен i+1
               {
                   System.out.println("Отсутствует "+(i + 1));

               } else
                   System.out.println("Отсутствует "+ (array[array.length-1-i]+1));
           return;
           }
        }
    
    }
}
