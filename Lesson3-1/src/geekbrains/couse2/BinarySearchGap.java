package geekbrains.couse2;

public class BinarySearchGap {;
    public static int search(Integer[] arrWithoutOneNum){
    int start = 0;
    if (arrWithoutOneNum.length == 0) return 1;
    int end = arrWithoutOneNum.length-1;
    int base;

    while (end != start+1) {
        base = (start + end)/2;
        if (arrWithoutOneNum[base] == base+1) { //сдвига нет
            start = base;// начало вправо
            //System.out.println(start + " " + end);
        } else {
            end = base;// конец влево
            //System.out.println(start + " " + end);
        }
    }
    return arrWithoutOneNum[start]+1;
    }

}
