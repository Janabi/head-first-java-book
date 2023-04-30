class Job {
    // variable instances
    String title;
    int salary;
    int ranking;

    // methods or functions
    void printOutStatement() {
        System.out.println("The " + title + " has a ranking of " + ranking + " out of 25, with a salary around " + salary + "USD");
    }
}

// a test class that contain a main method where the app start and test the other objects
class ChapterTwo {
    public static void main(String[] args) {
        Job firstJob = new Job();
        // we can use or access all public variable and method by using the (.) DOT OPERATOR 
        firstJob.title = "Software Engineer";
        firstJob.ranking = 23;
        firstJob.salary = 120000;
        firstJob.printOutStatement();

        Job secondJob = new Job();
        secondJob.title = "Surgeon";
        secondJob.ranking = 4;
        secondJob.salary = 208000;
        secondJob.printOutStatement();

        Job thirdJob = new Job();
        thirdJob.title = "Petrolumn Engineer";
        thirdJob.ranking = 17;
        thirdJob.salary = 130850;
        thirdJob.printOutStatement();
    }
}