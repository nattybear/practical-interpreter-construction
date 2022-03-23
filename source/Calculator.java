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

  public static void main(String args[])
  {
    int result = 0;
    expression = "1+2";
    System.out.println("Expression: " + expression);
    Init();
    int firstNumber = GetNum();
    char operator = Look;
    GetChar();
    int secondNumber = GetNum();
    System.out.println("First Number: " + firstNumber);
    System.out.println("Operator: " + operator);
    System.out.println("Second Number: " + secondNumber);
    int sum = firstNumber + secondNumber;
    System.out.println("SUM of Those Two Number: " + sum);
  }
}
