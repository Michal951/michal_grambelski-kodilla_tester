public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2500, 2020);
        System.out.println(notebook.weight + " " + notebook.price);
       notebook.checkPrice();
        notebook.checkWeight();
     Notebook heavyNotebook = new Notebook (2000, 1500, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        Notebook oldNotebook = new Notebook (1600, 899, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        }
    }


