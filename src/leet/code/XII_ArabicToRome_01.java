package leet.code;
import java.util.Map;
import java.util.TreeMap;
/*
больше трех букв быть не может
слева на право от большого к маленькому. Если меньшее число стоит левее большего
разбить входящий int на разряды 789 = 700 + 80 + 9 = 7*10^2 + 8*10^1 + 9*10^0, =[7,8,9]
ищем в мапе 100 - это у нас 1*10^2, т.е. это x*10^2. По 10^2 находим С, а X это сколько раз нам надо его взять. 200=2раза L, 300=3раза L, 400=4раза, тут запрет - если x>3, то берем след. бакет (хэш мапа не сохраняет порядок, нужна сортед мапа? отставить, это интерфейс, берем три мапу)
eсли х<=3, то arabicNum.get(10^)
*/

public class XII_ArabicToRome_01 {
    public static Map<Integer, Character> arabicNum = new TreeMap<Integer, Character>() {
    };

    static {
        arabicNum.put(1,'I');
        arabicNum.put(4,'V');
        arabicNum.put(5,'V');
        arabicNum.put(10,'X');
        arabicNum.put(50,'L');
        arabicNum.put(100,'C');
        arabicNum.put(500,'D');
        arabicNum.put(1000,'M');
    }

    public static void convertArabic(int arabic){
        String romeNumber="";
        String tmpStr="";
        String string = Integer.toString(arabic);
        char[] characters= string.toCharArray();
        for(int i=0; i<characters.length; i++) {
            int temp = (int) (((int)characters[i]-48)*Math.pow(10,(characters.length-i-1))); //еще вариант как получить из char int -> Integer.parseInt(Character.toString(characters[i]));
            if(temp<=300){
                for (int j=0; j<(int)characters[i]-48; j++){
                    tmpStr = String.valueOf(arabicNum.get((int)Math.pow(10,(characters.length-i-1))));
                    romeNumber=romeNumber+tmpStr;
                }
            }
            else if(temp==400){

            }
            tmpStr = String.valueOf(arabicNum.get((int)Math.pow(10,(characters.length-i-1))));
            System.out.println("temp="+temp);
            romeNumber=romeNumber+tmpStr;
        }
        System.out.println(characters[0]);
        System.out.println(romeNumber);
    }

    public static void main(String[] args) {
        convertArabic(789);
    }
}
