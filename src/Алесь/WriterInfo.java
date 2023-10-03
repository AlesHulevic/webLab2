package Алесь;
import java.util.Scanner;
import p2.City;

public class WriterInfo {
    static void Harady_milonniki(City mas[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Хочаце самастойна ўвесці дадзеныя (1) ці толькі пераверыць працаздольнасць (2)?");
        int switc=scan.nextInt();
        if (switc==1)
        {
            for(int i=0; i<5; i++)
            {
                mas[i]=new City();
            }
        }
        if (switc==2)
        {
            mas[0]=new City("Бабруйск",100000, 200);
            mas[1]=new City("Варшава",5000000, 1500);
            mas[2]=new City("Менск",2000000, 1000);
            mas[3]=new City("Горадня",300000, 300);
            mas[4]=new City("Ворша",50000, 100);
        }
        double ahulnaja_plosca=0;
        int kolkasc=0;

        for(int i=0; i<5;i++)
        {
            if(mas[i].Get_Population()>=1000000)
            {
                ahulnaja_plosca+=mas[i].Get_Square();
                kolkasc++;
            }
        }
        System.out.println("AAA");
        System.out.println("Агульная плошча гарадоў-мільённікаў: " + ahulnaja_plosca);
        System.out.println("Колькасць гарадоў-мільённікаў: " + kolkasc);
    }
    public static void main(String[] args)
    {


        // City N = new City();
        //N.Show();
        //N.Show_Name();
        // N.Show_Population();
        City []mas = new City[5];
        Harady_milonniki(mas);




    }
}
