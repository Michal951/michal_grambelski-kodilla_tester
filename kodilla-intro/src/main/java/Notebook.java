public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 1000) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 1000){
            System.out.println("This notebook dont cost too much.");
        } else if (this.price >=600 && this.price <=1000){
            System.out.println("This notebook is not expensive.");
        }
        }
        public  void checkWeight(){
        if (this.weight < 1000) {
            System.out.println("The device is light.");
        } else if (this.weight >= 1000 && this.weight <=1700){
            System.out.println("The device is not very heavy.");
        } else if (this.weight > 1800){
            System.out.println("The device is very heavy.");

        }

            if (this.year < 2015 && this.price <1000 ) {
                System.out.println("This device does not cost much considering the year of manufacture");
            } else if (this.year>2015 && this.price <=2500) {
            System.out.println("This device does not cost much considering the year of manufacture");
        } else if (this.year>2010 && this.price <2000 ){
            System.out.println("This device does not cost much considering the year of manufacture");
            }

        }
}