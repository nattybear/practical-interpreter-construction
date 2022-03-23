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

  public static int GetNum()
  {
    int number = new Integer(Look+"").intValue();
    GetChar();

    return number;
  }

  public static void Init()
  {
    GetChar();
  }

  public static void MatchAndEat(char chr)
  {
    if (Look == chr)
      GetChar();
    else {
      System.out.println("Error: Unexpected character.");
      System.exit(0);
    }
  }

  public static int Term()
  {
    return GetNum();
  }

  public static int Add()
  {
    MatchAndEat('+');
    return Term();
  }

  public static int Subtract()
  {
    MatchAndEat('-');
    return Term();
  }

  public static int ArithmeticExpression()
  {
    int result = Term();
    while ((Look == '+') || (Look == '-'))
    {
      switch (Look)
      {
        case '+':
          result = result + Add();
          break;
        case '-':
          result = result - Subtract();
          break;
      }
    }
    return result;
  }

  public static void main(String args[])
  {
    expression = "9+2+5-3";
    Init();
    int result = ArithmeticExpression();
    System.out.println("Result: " + result);
  }
}
