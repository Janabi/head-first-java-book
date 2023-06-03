import java.io.*;
// a functionality that will be discussed later on in the Java API
class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader((System.in)));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }
}

// A class that responsible to set the location cells and check the prompt value where it hits or miss or kill
// The finally check if you hit the location cell for a third time.
// The only bug where it is going to be fix in the net chapter is that you throw the same hit value over and over again
// and for the third time you will win the game!!
class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); // convert a string into an integer
        String result = "miss";
        for (int cell: locationCells) { // the advanced for loop
            if (cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println("The result is " + result);
        return result;
    }
}

public class ChapterFive {
    public static void main(String[] args) {
        // here were the game lunched and start going on
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom dotCom = new SimpleDotCom();
        int randomNumber = (int) (Math.random() * 5);

        int[] cellLocations = {randomNumber, randomNumber + 1, randomNumber + 2};
        dotCom.setLocationCells(cellLocations);
        boolean isAlive = true;

        // it could be while(isAlive) or while(isAlive == true)
        while (isAlive) {
            String guess = helper.getUserInput("Enter a number");
            String result = dotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " number of guess to win the game");
            }
        }
    }
}
