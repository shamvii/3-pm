public class Droid
{
  int batteryLevel;

  public Droid()
  {
    batteryLevel = 100;
  }
//functions of droid
  public void activate()
  {
    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is" + batteryLevel);
  }



  public void chargeBattery(int hours)
  {
    System.out.println("Droid Charging.....");
    batteryLevel = batteryLevel + hours;
    if (batteryLevel > 100)
    {
      batteryLevel = 100;
      System.out.println("Battery level is" + batteryLevel);
    }
    else{

      System.out.println("batteryLevel is" + batteryLevel);
    }
  }

  public int checkBatteryLevel()
  {
    System.out.println("Battery Level currently is : ");
    return batteryLevel;
  }

  public void hover(int feet)
  {
    if(feet > 2){
      System.out.println("Error! I cannot hover above 2 feet!");
    }
    else{
      System.out.println("Hovering.....");
    }
    batteryLevel = batteryLevel - 20;
    System.out.println("Battery level is :" + batteryLevel);
  }

  public static void main(String[] args)
  {
    Droid MyDroid = new Droid();
    MyDroid.activate();
    MyDroid.chargeBattery(5);
    MyDroid.hover(1);
  }

}