# Tic Tac Toe - Java Console Game 🎮

A simple 2-player Tic Tac Toe game implemented in Java using a 3x3 character array. The game runs in the console and allows two players to take turns marking their positions until someone wins or the game ends in a draw.

---

## 📌 Features

- 2-player turn-based gameplay (`X` and `O`)
- Input validation with exception handling
- Prevents invalid or out-of-bounds moves
- Displays game board after each move
- Declares a winner when three symbols align (row, column, or diagonal)
- Clean and readable board output

---

## 🛠 Technologies Used

- Java (Core)
- Scanner for user input
- 2D Arrays for game board
- Try-Catch blocks for exception handling

---

## 🎮 Game Rules

* Players take turns to enter row and column numbers (0–2) to place their mark (`X` or `O`).
* A player wins if they successfully place three of their marks in a row, column, or diagonal.
* If a move is invalid (out of bounds or cell occupied), the player is prompted to try again.
* The game ends when there's a win or no more moves are left (tie condition can be added).

---

## ✅ Example Gameplay

```
| | | |
| | | |
| | | |
Player X Enter position you want to insert: 0 0

|X| | |
| | | |
| | | |
Player O Enter position you want to insert: 1 1

|X| | |
| |O| |
| | | |
Player X Enter position you want to insert: 0 1

|X|X| |
| |O| |
| | | |
Player O Enter position you want to insert: 2 2

|X|X| |
| |O| |
| | |O|
Player X Enter position you want to insert: 0 2

|X|X|X|
| |O| |
| | |O|
...
GAME OVER: Player X has won
```

---

## 📦 Future Improvements

* Add draw (tie) detection
* GUI version using JavaFX or Swing
* Single-player mode with AI
* Replay/Restart functionality
