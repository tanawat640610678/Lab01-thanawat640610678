public class AirPurifier {

    int temperature;
    int bettery;
    int price;
    String color;

    void displayAirPurifier(){
        System.out.println("Air Purifier Benefits");
        System.out.println("1.Helps to eliminate dust and mist");
        System.out.println("2.Help reduce, eliminate and kill viruses in the air");
        System.out.println("3.Help get rid of gas or unpleasant smell");
        System.out.println("4.Good for people with respiratory diseases");
        System.out.println("air purifier is: "+color);
        System.out.println("Temperature: "+temperature +" C");
        System.out.println("Bettery: "+bettery+"%");
        System.out.println("price: "+price+"$");
    }

    AirPurifier() {
        this("White", 25, 100, 300);
    }

    AirPurifier( String _color , int _temperature ,int _bettery , int _price){

      this.color = _color;
      this.temperature = _temperature;
      this.bettery = _bettery;
      this.price = _price;
    }


}
