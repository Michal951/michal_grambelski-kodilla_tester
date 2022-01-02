public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2500, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        Notebook oldNotebook = new Notebook(1600, 899, 2010);

        notebookParameters(notebook);

        notebookParameters(heavyNotebook);

        notebookParameters(oldNotebook);
    }

    static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
    }
}