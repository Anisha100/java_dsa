class Consubstring
{
  int Countsub(String S)
  { int count=0;
    char Str[]=S.toCharArray();
    for(int i=0;i<Str.length;i++)
    {
      if(Str[i]=='1')
      {
        count++;
      }
    }
    return (count*(count-1)/2);
  }
  public static void main(String args[])
  {
   Consubstring obj=new Consubstring();
        String S = "001001010101001";
    System.out.println(obj.Countsub(S));
    }
}
  
