public class ChapterThree {
    String author;
    String[] books = new String[2];
    public static void main(String[] args) {
        // try to make an instance of this object and access their methods and variables
        ChapterThree chapterThree = new ChapterThree();
        chapterThree.author = "Spencer Johnson";
        chapterThree.books[0] = "Who moved my cheese";
        chapterThree.books[1] = "Out of the maze";
        chapterThree.printOut();

        // declare an array of ChapterThree reference variable
        ChapterThree[] chapterThrees = new ChapterThree[2];
        chapterThrees[0] = new ChapterThree();
        chapterThrees[1] = new ChapterThree();

        // assign the author and books instance variables to each element of chapterThrees array
        chapterThrees[0].author = "Mark Manson";
        chapterThrees[0].books[0] = "The subtle art of not giving a F";
        chapterThrees[0].books[1] = "Everything is F";

        chapterThrees[1].author = "Stephenie Meyer";
        chapterThrees[1].books[0] = "The chemist";
        chapterThrees[1].books[1] = "Twilight";

        int y = 0;
        while(y < chapterThrees.length) {
            chapterThrees[y].printOut();
            y = y + 1;
        }
    }

    public void printOut() {
        System.out.println("The author " + author + " has These following books:");
        byte x = 0;
        while (x < books.length) {
            System.out.println(books[x]);
            x++;
        }
        System.out.println();
    }
}
