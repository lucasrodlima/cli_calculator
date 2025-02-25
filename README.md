A simple command-line interface (CLI) calculator written in Java. This calculator allows you to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.
Features

    Addition: Add two numbers.

    Subtraction: Subtract one number from another.

    Multiplication: Multiply two numbers.

    Division: Divide one number by another.

    Interactive: Continuously perform operations until you choose to quit.

How to Use

    Follow the Prompts:

        Enter the first number.

        Enter the second number.

        Select an operation by typing the corresponding number:

            1 for Addition

            2 for Subtraction

            3 for Multiplication

            4 for Division

        The result will be displayed.

        Press Enter to continue or type 0 to quit.

Example

      Enter a number:
      5
      Enter another number:
      3
      1. Add
      2. Subtract
      3. Multiply
      4. Divide
      Select an operation by typing a number.
      1
      Result is: 8.0
      Type 0 to quit the application or press Enter to continue.

Code Overview

The calculator is implemented in a single Java class Calculator. It uses a while loop to continuously prompt the user for input and perform calculations until the user decides to quit.
Main Components

    Scanner: Used to read user input from the command line.

    Switch Statement: Handles the selection of arithmetic operations.

    Loop: Allows the user to perform multiple calculations in one session.
