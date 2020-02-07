import sweets.Chocolates;
import sweets.Donuts;

import java.util.Scanner;

public class App
{
    public static void main(String[] args){
        Donuts Donut=new Donuts(100,1000,500);
        Chocolates chocolates=new Chocolates(100,2000,400);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student's name , number of donut and number of chocolate/candy respectively for each student (Total students=20): ");
        String name[]=new String[20];
        int donut[]=new int[20];
        int choco[]=new int[20];
        for (int i=0;i<20;i++)
        {
            name[i]=s.next();
            donut[i]=s.nextInt();
            choco[i]=s.nextInt();
        }
        Donut.distribution(donut,name);
        chocolates.distribution(choco,name);
        Donut.printDonutInfo();
        Donut.printAfterSorting("sort");
        chocolates.printChocolateInfo();
        chocolates.printAfterSorting("sort");
    }
}
