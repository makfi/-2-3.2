package com.company;
import java.text.DecimalFormat;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("#.##");
        double mas[] = new double[10], average=0;
        int temp=0, temp2=0, imax=0, imin=0;
        System.out.print("Массив: ");
	    Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mas[i] =random.nextDouble() * (random.nextInt(50)-25);
            System.out.printf("%s   ", df.format(mas[i]));
            if(mas[imax]<mas[i]) imax=i;
            if(mas[imin]>mas[i]) imin=i;
            average+=mas[i];
        }
        average/=10;
        System.out.printf("\n\nМаксимальное: %s\nМинимальное: %s\nСреднее: %s\n\nРезультат: ", df.format(mas[imax]), df.format(mas[imin]), df.format(average));
        for (int i = 0; i < 10; i++) {
            if (temp==1) temp2=1;
            if ((i==imax) || (i==imin)) temp++;
            if (temp==1 & temp2==1) mas[i]=average;
            System.out.printf("%s   ", df.format(mas[i]));
        }
    }
}
