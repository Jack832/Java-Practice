class portfol
{

public static void main(String arg[])
{
    //part1 : defining stocks ,stokes name and price in array
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the no of stocks");
    int no=sc.nextInt();
    String a[]=new String [no];    
    int b[]=new int [no];
    int c[]=new int [no];
    for(int p=0;p<no;p++)
    {
    System.out.println("enter the name of stocks");
    a[p]=sc.next();
    System.out.println("enter the shares of stocks");
    b[p]=sc.nextInt();
    System.out.println("enter the value of share");
    c[p]=sc.nextInt();
    }
    porfol ap=new porfol(int b[]);
//part2: send your array to portfol for totol

    
//part3: class 2 to have total dada
class stock
{
portfol(int k[])
{
for(h=0;h<no;h++)
{
int a +=k[h];
}
