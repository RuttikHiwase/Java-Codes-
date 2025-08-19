class LargestOfThreeNumbers{
  public static void main(String args[])
{
   int num1=23,num2=67,num3=77;
   if(num1 >= num2 && num1 >= num3)
   {
      System.out.println("Num1 is greater");
}
   else if(num2 >= num1 && num2 >= num3)
  {
      System.out.println("Num2 is greater");
  }
else{
   System.out.println("Num3 is greater");
}}}