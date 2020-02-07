package sweets;


public class Donuts extends Sweets
{
    int total_donuts;
    int total_weight;
    int arr_donuts[]=new int[Students.totalStudent];
    String Studentname[]=new String[Students.totalStudent];
    private int max;
    public Donuts(int total,int total_weight,int donutWeight)
    {
        super(total,total_weight);
        this.total_weight=donutWeight;
    }
    public void distribution(int c[],String name[])
    {
        for (int i=0;i<c.length;i++)
        {
            arr_donuts[i]=c[i];
            Studentname[i]=name[i];
        }
    }
    public int getTotal_donuts()
    {
        for (int i=0;i<arr_donuts.length;i++)
            total_donuts+=arr_donuts[i];
        return total_donuts;
    }
    public int getMaximum()
    {
        max=arr_donuts[0];
        for (int i=1;i<arr_donuts.length;i++)
        {
            if(arr_donuts[i]>max)
                max=arr_donuts[i];
        }
        return max;
    }
    public void printDonutInfo()
    {
        System.out.println("Donuts");
        System.out.println("Total weight of sweets="+total_weight);
        System.out.println("Total donuts="+getTotal_donuts());
        System.out.println("Max donut get by a student="+getMaximum());
        System.out.println("Distribution of donuts among students:");
        for (int i=0;i<arr_donuts.length;i++)
        {
            System.out.println(Studentname[i]+" has "+arr_donuts[i]);
        }
    }
    public void printAfterSorting(String s)
    {
        for(int i=0;i<arr_donuts.length;i++)
        {
            for (int j=0;j<arr_donuts.length-i-1;j++)
            {
                if(arr_donuts[j]>arr_donuts[j+1])
                {
                    int temp=arr_donuts[j];
                    arr_donuts[j]=arr_donuts[j+1];
                    arr_donuts[j+1]=temp;
                    String temp1= Studentname[j];
                    Studentname[j]=Studentname[j+1];
                    Studentname[j+1]=temp1;
                }
            }
        }
        System.out.println("After sorting");
        for (int i=0;i<arr_donuts.length;i++)
        {
            System.out.println(Studentname[i]+" has "+arr_donuts[i]);
        }
    }}
