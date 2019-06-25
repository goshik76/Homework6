package company;

/* Создайте число. Определите, являеться  ли число трехзначным. Определите, являеться ли его последняя цифра семеркой.
Определите, являеться ли число четным.
 */

public class Main {

    public static void main(String[] args) {

       int a = 0;
        int b = 1999;
        int rn1= a + (int) (Math.random() * b);
        System.out.println("случайное число: " + rn1);

        if (rn1>99 && rn1<1000)
           System.out.println(" Число являеться трехзначным");


        if (rn1 % 10 == 7) {
            System.out.println("Посленее цифра числа  являеться  7  " + rn1 );
        }else if (rn1 % 100 == 7) {
        }else  if (rn1 == 7 ){
        } else {
            System.out.println("Не являеться") ;
        }


       if (rn1 % 2 == 0){
               System.out.println(" Число четное ");
               }
    }}