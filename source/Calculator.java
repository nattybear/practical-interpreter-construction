class Calculator
{
  public static String expression = "";
  public static int currentCharPosition = 0;
  public static char Look;

  public static void GetChar()
  {
    if (currentCharPosition < expression.length())
      Look = expression.charAt(currentCharPosition);

    currentCharPosition++;
  }

  public static void main(String args[])
  {
    expression = "1+";
    GetChar();
    System.out.println(Look);
    GetChar();
    System.out.println(Look);
  }
}
