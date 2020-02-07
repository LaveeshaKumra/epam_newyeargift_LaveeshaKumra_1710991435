package sweets;


public class Chocolates extends Sweets
{
    int total_chocolates;
    int total_weight;
    int d_choco[]=new int[Students.totalStudent];
    String name[]=new String[Students.totalStudent];
    private int maximum;
    public Chocolates(int total,int Tweight,int totalweightofChocolate)
    {
        super(total,Tweight);
        this.total_weight=totalweightofChocolate;
    }
    public void distribution(int c[],String name[])
    {
        for (int i=0;i<c.length;i++)
        {
            d_choco[i]=c[i];
            name[i]=name[i];
        }
    }
    public int totalChocolates()
    {
        for (int i=0;i<d_choco.length;i++)
            total_chocolates+=d_choco[i];
        return total_chocolates;
    }
    public int getMaximum()
    {
        maximum=d_choco[0];
        for (int i=1;i<d_choco.length;i++)
        {
            if(d_choco[i]>maximum)
                maximum=d_choco[i];
        }
        return maximum;
    }
    public void printChocolateInfo()
    {
        System.out.println("Chocolates");
        System.out.println("Total weight of Chocolates ="+total_weight);
        System.out.println("Total No. of Chocolates="+totalChocolates());
        System.out.println("Maximum chocolates given to a student="+getMaximum());
        System.out.println("Distribution:");
        for (int i=0;i<d_choco.length;i++)
        {
            System.out.println(name[i]+" has "+d_choco[i]);
        }
    }
    public void printAfterSorting(String s)
    {
        for(int i=0;i<d_choco.length;i++)
        {
            for (int j=0;j<d_choco.length-i-1;j++)
            {
                if(d_choco[j]>d_choco[j+1])
                {
                    int temp=d_choco[j];
                    d_choco[j]=d_choco[j+1];
                    d_choco[j+1]=temp;
                    String temp1= name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp1;
                }
            }
        }
        System.out.println("After sorting");
        for (int i=0;i<d_choco.length;i++)
        {
            System.out.println(name[i]+" has "+d_choco[i]);
        }
    }}
