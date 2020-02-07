package sweets;
abstract class Sweets implements Students//ABSTRACT CLASS BECAUSE OF ABSTRACT METHOD
{
    int total;
    int total_weight;

    Sweets(){}
    Sweets(int total,int total_weight)
    {
        this.total_weight=total_weight;
        this.total=total;
    }
    abstract void distribution(int c[],String n[]);
    private void getTotal_weight()
    {
        System.out.println(total_weight);
    }
}
