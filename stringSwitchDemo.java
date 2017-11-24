public class stringSwitchDemo {
  public static int getMonthNumber(String Month){
    int MonthNumber=0;
    if (Month==null){
      return MonthNumber;
    }
    switch (Month.toLowerCase()){
      case "january": MonthNumber =1;
      break;
      case "febuary": MonthNumber = 2;
      break;
      case "march": MonthNumber =3;
      break;
      case "april": MonthNumber = 4;
      break;
      case "may": MonthNumber =5;
      break;
      case "june": MonthNumber = 6;
      break;
      case "july": MonthNumber =7;
      break;
      case "august": MonthNumber = 8;
      break;
      case "september": MonthNumber = 9;
      break;
      case "october": MonthNumber =10;
      break;
      case "november": MonthNumber = 11;
      break;
      case "december": MonthNumber = 12;
      break;
      default: MonthNumber=0;
        break;
    }
    return MonthNumber;
  }
  public static void main(String [] args){
    String month="August";
    int returnedmonthNumber=
      stringSwitchDemo.getMonthNumber(month);
    if (returnedmonthNumber== 0){
      System.out.println("invalid month");
    }
    else{
      System.out.println(returnedmonthNumber);
    }
  }
}
      
    