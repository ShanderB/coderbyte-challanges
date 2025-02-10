Java River Puzzle Project
Write a Java application consisting of multiple classes to validate the solution of the "Wolf, Goat, and Cabbage" game. You will receive a CSV file containing sequences of moves, and your task is to determine if each sequence successfully solves the puzzle without breaking any rules. The game rules are below:

You need to transport a wolf, goat, and cabbage across a river using a boat that can carry only one of them at a time.
The wolf cannot be left alone with the goat on either side of the river, or it will eat the goat.
The goat cannot be left alone with the cabbage on either side of the river, or it will eat the cabbage.
The boat can carry only one of them at a time along with the boatman.
The valid moves are: you can take one of them across the river or cross alone.
You need to create the following classes and methods below:

GameState (GameState.java):

This class should manage state and track items on the left and right sides of the river along with tracking the current position of the boat.
You should also implement a method to move items and check the validity of the game state.

Validator (Validator.java):
Create a class named Validator to validate the game based on a given sequence of moves.
It should return true if the sequence of moves results in a successful outcome.

CSV Reader (CsvReader.java):
Create a class named CsvReader that reads sequences of moves from a CSV file.
