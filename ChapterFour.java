// will be using the same example from chapter three but a bit different approach and syntax
class Author {
    private String author;
    private String[] books = new String[2];

    public void setAuthor(String authorName) {
        if (authorName.length() >= 100) {
            System.out.println("Thats a bit too long name!!!");
        }
        author = authorName;
    }
    public void setBooks(String bookName, int index) {
        books[index] = bookName;
    }

    public String getAuthorName() {
        return author;
    }

    public String[] getBooksName() {
        return books;
    }

    public void printOutStatement() {
        System.out.println("The author name is " + getAuthorName() + " and wrote the following books:");
        byte x = 0;
        String[] authorBooks = getBooksName();
        while(x < authorBooks.length) {
            System.out.println(authorBooks[x]);
            x++;
        }
    }
}

public class ChapterFour {
    public static void main(String[] args) {
        // try to make an instance of this object and access their methods and variables
        Author author = new Author();
        author.setAuthor("Spencer Johnson");
        author.setBooks("Who moved my cheese", 0);
        author.setBooks("Out of the maze", 1);
        author.printOutStatement();

        // declare an array of ChapterFour reference variable
        Author[] authors = new Author[2];
        authors[0] = new Author();
        authors[1] = new Author();

        // assign the author and books instance variables to each element of chapterFours array
        authors[0].setAuthor("Mark Manson");
        authors[0].setBooks("The subtle art of not giving a F", 0);
        authors[0].setBooks("Everything is F", 1);

        authors[1].setAuthor("Stephenie Meyer");
        authors[1].setBooks("The chemist", 0);
        authors[1].setBooks("Twilight", 1);

        int y = 0;
        while(y < authors.length) {
            System.out.println();
            authors[y].printOutStatement();
            y = y + 1;
        }
    }
}


