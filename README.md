````markdown
# Chess Game in Java

## Overview
This project is a fully functional **Chess Game** implemented in Java, developed using **Swing** for the graphical user interface. The game allows two players to compete locally with a clean and interactive UI. It follows all standard chess rules, including check, checkmate, and stalemate.

---

## Features

- **Standard Chess Rules**: Supports all rules like castling, en passant, and pawn promotion.
- **Interactive GUI**: Built using Java Swing, featuring a visually appealing and user-friendly design.
- **Turn-Based Gameplay**: Players alternate turns, with the system highlighting legal moves.
- **Check & Checkmate Detection**: Ensures a valid and competitive chess experience.
- **Local Two-Player Mode**: Designed for competitive matches on a single system.

---

## File Structure

```plaintext
.
├── .idea/
├── Assets/
│   ├── black_bishop.png
│   ├── black_king.png
│   ├── black_knight.png
│   ├── black_pawn.png
│   ├── black_queen.png
│   ├── black_rook.png
│   ├── white_bishop.png
│   ├── white_king.png
│   ├── white_knight.png
│   ├── white_pawn.png
│   ├── white_queen.png
│   └── white_rook.png
├── src/
│   ├── Bishop.java
│   ├── ChessBoard.java
│   ├── ChessGame.java
│   ├── ChessGameGUI.java
│   ├── ChessSquareComponent.java
│   ├── King.java
│   ├── Knight.java
│   ├── Main.java
│   ├── Pawn.java
│   ├── Piece.java
│   ├── PieceColor.java
│   ├── Position.java
│   ├── Queen.java
│   └── Rook.java
├── .gitignore
├── Chess.iml
└── README.md
````

---

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or later.
- **IntelliJ IDEA**: Recommended IDE for seamless development.

---

## Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/your-username/java-chess-game.git
   cd java-chess-game
   ```

2. **Open in IntelliJ IDEA**:

   - Open IntelliJ IDEA and select **Open**.
   - Navigate to the project folder and open it.
   - Wait for the IDE to load all dependencies and set up the project.

3. **Run the Program**:

   - Locate the `Main.java` file in the `src/` directory.
   - Run the file to launch the chess game.

---

## How to Play

1. Start the program by running `Main.java`.
2. The chessboard will appear, and the game begins with White's turn.
3. Select a piece by clicking on it. Legal moves will be highlighted.
4. Click on a highlighted square to move the piece.
5. The game alternates between White and Black until:
   - **Checkmate**: A king is under attack with no possible escape.
   - **Stalemate**: A player has no legal moves but their king is not in check.
   - **Draw**: Based on standard chess rules.

---

## Screenshots

### Chess Game UI

*Add a screenshot of the game here:*

```markdown
![Chess Game UI](Assets/chessboard.png)
```

---

## Future Enhancements

- **Save and Load Game**: Add functionality to save and load games.
- **Timed Matches**: Introduce a chess clock for timed gameplay.
- **Undo Moves**: Allow players to undo previous moves.

---

## Contributing

Contributions are welcome! To contribute:

1. Fork this repository.
2. Create a new branch (`feature/new-feature`).
3. Commit your changes.
4. Push to the branch and open a pull request.

---

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code.

---

## Acknowledgments

- Java Swing documentation for GUI development.

---

## Author

Developed by **[Yuvaneshwarran R](https://github.com/yuvaneshwararan)**. Reach out for questions or collaboration opportunities!

