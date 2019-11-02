package com.company;

public class Main {

    public static void main(String[] args) {
String[] names = new String[3];
   names[0] = " Timur ";
names[1] = " Azat ";
names[2] = " Samat";
int num;
num =3;
switch (num){
    case 1:
        System.out.println(names[0]+"   доброго утра"); break;
    case 2:
        System.out.println(names[1] +"   доброго деня");  break;
    case 3:
        System.out.println(names[2] +"   доброго вечера ");  break;
    default:
        System.out.println("  привет всем");
}
     }
}
