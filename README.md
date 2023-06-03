# head-first-java-book

## Dive in A Quick Dip
- In this chapter, It was mainly discussing about the history of JAVA, How JAVA works behind the hood, and a simple syntax that could run a JAVA program.😎
- Let us start the following major chapter's topics:
    * How Java works behind the hood by the following steps:
        **Source Code** 👉 **Compiler** 👉 **Output Code (bytecode)*
        * 👉 **JAVA Virtual Machine**
        * **Source Code** -> the java code that you have written so far.
        * **Compiler** -> to check if there is any error and satisfied that your code will run successfully, Also it would create a bytecode file.
        * **Output Code (bytecode)** -> This could help reading and executing any JAVA bytecode file at any operating system.
    
    * simple syntax that could run a JAVA program:
        - Any statement in Java must end with semicolon.
        - variable is declared by the type and name.
        - Any Java program must have one <mark>main() method</mark> that could start the program form it.
        - classes and methods must have opening and closing curly brackets.
        - if and loop statements must have a conditional statement, which end up in boolean result type.
        - assignment operator is one equal sign (=).
        - equal operator is double equal sign (==).
        - <mark>**Print**</mark> is to print a statement at the same line, while <mark>**Println**</mark> means to print the statement in a new line.

## Classes and Objects
- In this chapter, It is focusing on basic structure of classes and objects, also the importance of them in OOP.

- Let us start with some notes that could be considered from this chapter:
    * **Classes**
        - All java codes are built by classes and they considered as a ***Blueprint***.
        - The class would later on invoked to describe or create an object instance from that class.
        - You may need to create a test class that would explicitly test out all the core functionality of your App.
        - An ***abstract superclass*** can be inherited all of its variable instances and methods to another classes.

    * **Objects**
        - It can know about itself by having a ***variable instances***.
        - It can do a certain behaviors by calling or invoking ***methods***.
        - Literally Java is defined as an objects talking to each others.
    
    * **Garbage-Collectible Heap** 
        - Once you create an object instance of certain class, JAVA would already allocate a memory space in the HEAP to store this instance.
        - The more variable instances and methods the object has, the more it needs a space to allocate.
        - This will be described deeply in later chapters.

    * **Manifest**
        - When you put all your app files into a JAVA archive like a .jar file.
        - Jar file is considered as a simple text file formatted as a ***manifest***.

## Primitives and References
- In this chapter, it mainly talks about the variables and their types and how we can utilize it.

- Two types of instance variables are:
    * Primitive
    * Reference

- ***Note***
    Each variable must has it owns type and unique name (The name must not match any reserve words in JAVA Language).
    - Generally you can assign a value into a variable by the following:
        * literal value using assignment operator.
        * assign the variable value from another variable of the same type.
        * use an arithmetic operator to assign a variable from another ones.

    - Rules of writing a variable name:
        * It must start with a letter, underscore or a dollar sign ($).
        * it cannot start with a number at all but you can use any number after the first letter.
        * It cannot be any one of reserved word in JAVA Like String, Integer, ..etc.

    - Reserved Word 👉 means any keyword that is recognized by the complier.

    - Object reference variable holds bits that has a way (pointer or address) to access an object.

    - we can differentiate between them, the primitive represents a bits value into the variable, meanwhile the reference variable a bits represent a way or pointer (Remote Control) to get to the object.

    -  Explain the Object creation (ex. Dog myDog = new Dog())
        * Dog myDog 👉 allocate a space for a reference variable that holds a name is **myDog** 
        * new Dog() 👉 allocate a space for a new instance of a Dog object in a heap.
        * Dog myDog = new Dog() 👉 Link the reference variable and the instance object together.

    - Life on Garbage Collectable Heap:
        * We create two instance variables of certain type and refer it as a way to get their type instance where they are living in the heap.
        * then we create a third instance of the same reference of object in the heap for instance variable of B.
        * therefore, we have three variables that are linked to only two object in the heap.
        * if we refer a first variable to the second object in the heap, then the third will be abandoned and refer to be nullable (null reference).

    - Arrays are like a tray of variables whether primitive or reference.
    - Arrays are always objects, whether they hold a tray of primitive or reference variables.

    - How to make an array of an Object (ex. ***Dog*** reference Object):
        Declare an array variable would look like the following:
        ```
            Dog[] pets; 
        ```
        Create a new instance of Array of Dog object that have a length of seven elements, and assign it to a previous declared array variable.
        ```
            pets = new Dog[7];
        ```

        Then creating a new **Dog** object in the **heap** and assign it a reference variable for the first element of the **pets** array variable.
        ```
            pets[0] = new Dog();
        ```

        What about the rest of six elements? will remain null value, until they will be assigned.

    - ***IMPLICIT WIDENING*** 👉 you cannot put for example an **byte** variable into element of **integer** array.
    - **Reference variable** 👉 like a remote control and using a dot operator (.) with methods or variables like pressing a button to access them.


## Methods use instance variables
- state affects behavior and behavior effects state.
- The object usually has an instance variable as a state and its methods to declare the behave of this state.
- The behaviors might varies based on the measurement (value) of the instance variable (state).
- Based on what it said in the book **"A method uses parameters. A caller passes arguments"**.
- What it means that when we initialize a method, we put as many parameter as we want, based on our criteria. However, invoking of this method will need to pass arguments to it.
- Methods could return back a value based on a type (Primitive or Reference) of value that you are going to return instead of void (return nothing).
- You can through more than on parameter in the method, the assigned type of these parameter must match what the developer passed as an argument in it.
- You can make a copy of the declare and assigned variable by passing it value in the argument of a method but this does not mean they will be linked together, whenever you are going to change one of them, it won't reflect the other one.
- **Getter** and **Setter** or what they also called as a **Accessors** and **Mutators**. As they named, the **setter** is a method were it get at least one parameter and set a value of instance variable. On the other hand, the **getter** will get the value of an instance variable.
- Encapsulation:
    * It is a way to protect an instance variable from setting a non sense or unacceptable values, therefore we force the developer to use the setter method where it gets all of its check points.
    * This could be accomplished by one of method accessors where it called Private.
    * ***Method Accessors*** are like Private (no body can access it only inside the class itself), and Public where anyone can use it.

- All instance variable has a default value even if you do not assign it to a value (ex: all reference variables will have a null value by default).
- Instance variable VS. local variable
    * **Instance variable** those who are inside a class and they always have a default value once they only declared.
    * **Local variables** those who are within a method and they cannot be used immediately once they declared because they don't have a default value.
- Use comparison operator (==) to compare two primitive variables but you use equals() method to compare between reference variable.
- The only way to use (==) with reference variable if they all refer to the same object in the heap.

## Writing a program
- Here we will be focusing on building more advance and strength methods.
- Developing a class:
    * Trying to know what the class is supposed to do generally.
    * List all of the instance variables and methods of these classes.
    * Write a prep code for all procedural flow of the app.
    * Write down the test code with putting all the scenario that might happen.
    * Implement the code (class).
    * Test all methods and their criteria.
    * continually debugging and reimplementing.
- How to write a proper class by using the following three methodologies:
    * **Prep code** 👉 it is more like a pseudocode to help the developer to focus on the procedure rather than the language syntax.
    * **Test code** 👉 A class that will contain all criteria and scenarios that might happen when we run the program and what the action it might take.
    * **Real code** 👉 The actual implementation of the program where it starts with the main() method.
- ***Extreme Programming (XP)*** 👉 important software development methodology.
    - work regularly.
    - set a schedule before every release.
    - release must be small and frequent.
    - programs in pair.
    - keep it simple.
    - always refactor the code.
    - write the test code first.
    - Don't put anything that not related to what you are doing.
- Choose for loop if you know exactly how many you are going to repeat the process, otherwise, go for a while loop.
- Use Integer.parseInt() if you want to convert the sting of digits (ex: "1", "2",...etc) into an Integer (number) type of value.
- However, if you try something rather than the digits the program will crash.
- Use break if a certain condition has been accomplished to leave the loop.
- Pre/Post Increment/Decrement 👉 Both are a shortcut of decrease and increase a certain variable by one. However, the difference is that if you assign a variable with an pre increment of another one (int x = ++z;), the value of x will be higher by one value. On the other hand, the post increment of the previous example will keep value the same as before.
- Doing the conversion of types to prevent a crashing of the program will compile it, since we will rely on the integer type later.
- The enhanced loop in Java, for example (for (String name: nameArray)), means the following:
    - declare a name variable and initialize it as a null.
    - assign the each element of the nameArray value.
    - run the body statements of the array.
    - repeat that again until you reach out the last element of the array.
- Casting a primitive variable of larger values into a smaller one will sometimes make a weird result.
```
long y = 39;
int x = (int) y; // will keep the value as 39
```
```
long y = 55500;
short x = (short) y; // will make a weird result of -10036
```
```
float f = 3.14f;
int x = (int) f; // will get a result of 3
```

## Get to know the Java API
- Java Language has a hundreds of pre-build classes that have a functionality you might need while developing.
- These might be called as a library.
- A ready-baked code that you just need to call them without rebuild from a scratch.
- Best solution for the issue that we faced on a previous chapter, is once we get a hit of one of dot com locations, we will remove that location from a list. This could be accomplish by shrinking the array of removing one element from it.
- ***ArrayList*** from a Java API that we could use. It has a following baked functionality:
```
add(Object element); // to add an object at the end of the list
remove(int index); // to remove a certain element by its index
remove(Object element); // to remove a certain element by passing it through an argument
contains(Object element); // would return 'true' if the object exist within the array
isEmpty(); // return 'true' if the array is empty
indexOf(Object element); // return either the number of index for this element if it is exist or return -1 if it does not
size(); // return a number of elements in the array
get(int index); // return the element value by passing its index position as an argument
```

- Why should we use **ArrayList** over default **Array**:
    * The default **Array** must to know the size of it before you start to use it, however, for the **ArrayList** you don't need that at all.
    * If you want to assign a value for a specific location, you need to know the index of it but in **ArrayList** you just need to call out add() method and it will be by default pushing this element to the end of the list, no matter what the size it reaches.
    * **Array** use a syntax that you will not need to use it anywhere in Java, like having an opening and closing brackets to pass the index of selected element (ex: arr[1])
    * **ArrayList** is using a parameterized type in Java 5.0, that it will discussed later.

- Not operator (!= and !) 👉 when you would like to select all except one scenario, you will use not equal operator.
- Short circuit Operators (&&, ||) 👉 
    * && when both sides are true, it would not go to the another side if the first one is false
    * || when one of the sides are true, it would not go tp the another side if the first one is true and it would consider the entire statement as a true result.
    * The useful thing about leaving out from the first result, to check if you might still not have been assigned a value to a reference variable and you will need to call one its method.
- Non Short Circuit Operators (&, |) 👉 they are the same as the short circuit operator but they go to check for both sides no matter how the result it could be for the first one.
- To call out a certain pre-build class, you will need to know which package does this one belongs to.
- You have to know the full name of the class to use it in your code without any spelling mistakes (ex: java.util.ArrayList). 
- There are two ways to tell java that you are going to use a certain pre-build classes from packages:
    * Import 👉 put the import at the top of the code file and you can use it anywhere you want (ex: import java.util.ArrayList)
    * Type 👉 type the full name of the package and its class in anywhere you want to use locally 
        (ex: java.util.ArrrayList<Dog> list = new java.util.ArrayList<Dog>()).
    one you declare and initialize a variable, when you pass a type of a method parameter, and when you return a type from a method.
- javax means that this package starts as an extension standard and then got promoted into a library.
- Type parameter in the **ArrayList** can declare the element type of the array (ex: ArrayList<Button>).