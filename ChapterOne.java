// This the 'Dive in A Quick Dip'
public class ChapterOne {
    public static void main(String[] args) {
        // everything in Java is an Object
        // result of conditional test must be a boolean (You need a comparison operator)
        int x = 1; // declare and assgin a variable x to 5
        System.out.println("Before the while loop");
        while (x <= 5) {
            x = x + 2;
            System.out.println("Inside the while loop with holding a Variable x is " + x);
        }
        System.out.println("After the while loop");

        if (x >= 5) {
            System.out.println("I am here inside the IF statement");
        }

        String[] wordListOne = {"dog", "human", "cat", "animal"};
        String[] wordListTwo = {"cute", "incridable", "awesome", "kind", "adorable"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;

        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);

        String phrase = wordListOne[randOne] + " is " + wordListTwo[randTwo];

        System.out.println("The final phrase is: " + phrase);
    }
}