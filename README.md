# head-first-java-book

## Dive in A Quick Dip
- In this chapter, It was mainly discussing about the history of JAVA, How JAVA works behind the hood, and a simple syntax that could run a JAVA program.😎
- Let us start the following major chapter's topics:
    * How Java works behind the hood by the following steps:
        **Source Code** 👉 **Compiler** 👉 **Output Code (bytecodes)** 👉 **JAVA Virtual Machine**
        * **Source Code** -> the java code that you have written so far.
        * **Compiler** -> to check if there is any error and satisfied that your code will run successfully, Also it would create a bytecodes file.
        * **Output Code (bytecodes)** -> This could help reading and executing any JAVA bytecode file at any operating system.
    
    * simple syntax that could run a JAVA program:
        - Any statement in Java must end with semicolon.
        - varaible is declared by the type and name.
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