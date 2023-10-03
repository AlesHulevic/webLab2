package p2;
import java.util.Scanner;

public class City
{
    String nazva="";
    int naselniectva = 0;
    double plosca=0.0;

    public City()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Увядзіце назву горада: ");
        this.nazva=scan.nextLine();
        System.out.println("Увядзіце насельніцтва горада: ");
        this.naselniectva=scan.nextInt();
        System.out.println("Увядзіце плошчу горада (км2): ");
        this.plosca=scan.nextDouble();
    }
    public City(String name, int population, double square)
    {
        this.nazva=name;
        this.naselniectva=population;
        this.plosca=square;
    }
    public City(int zero)
    {
        this.nazva="nazva";
        this.naselniectva=0;
        this.plosca=0.0;
    }
    public void Show()
    {
        System.out.println("Інфармацыя пра горад: \n" + this.nazva);
        System.out.println(this.naselniectva);
        System.out.println(this.plosca);
    }
    public void Show_Name()
    {
        System.out.println("Назва годада: " +this.nazva);
    }
    public void Show_Population()
    {
        System.out.println("Насельніцтва годада: " + this.naselniectva);
    }


    public int Get_Population()
    {
        return this.naselniectva;
    }
    public double Get_Square()
    {
        return this.plosca;
    }

}


