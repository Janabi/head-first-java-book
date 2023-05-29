# head-first-java-book

## Dive in A Quick Dip
- In this chapter, It was mainly discussing about the history of JAVA, How JAVA works behind the hood, and a simple syntax that could run a JAVA program.😎
- Let us start the following major chapter's topics:
    * How Java works behind the hood by the following steps:
        **Source Code** 👉 **Compiler** 👉 **Output Code (bytecodes)*
        * 👉 **JAVA Virtual Machine**
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

## Primitives and References
- In this chapter, it mainly talks about the variables and their types and how we can utilise it.

- Two types of instance variables are:
    * Primitive
    * Reference

***General Note*** Each variable must has it owns type and unique name (The name must not match any reserve words in JAVA Language).
    - Generally you can assign a value into a variable by the following:
        * literal value using assginment operator.
        * assign the variable value from another vaiable of the same type.
        * use an arithmatic operator to assign a variable from another ones.

    - Rules of witing a vaiable name:
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

    - Life on Garbage Collectabile Heap:
        * We create two instance variables of certain type and refer it as a way to get their type instance where they are living in the heap.
        * then we create a third instance of the same reference of object in the heap for instance variable of B.
        * therefore, we have three variables that are linked to only two object in the heap.
        * if we refer a first variable to the second object in the heap, then the third will be abandoned and refer to be nullable (null reference).