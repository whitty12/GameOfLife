# GameOfLife
Game of Life Zero Player Game

**Dependencies:**
- Java

**Initialization:**
The board is an orthogonal grid. I chose to start with a 100x100 grid. The board is randomly intialized with each cell being either populated (filled with a color) or unpopulated (not filled with a color). Populated cells will be referred to as "Alive" and unpopulated cells will be referred to as "Dead". 
Players can click on a cell to set it to live or dead as well as pause or reset the board. The number of generations should be set to 0 at the start of the game OR upon a reset of the board.

**Interactions:**
- If a cell is alive, it will remain the same if there are 2-3 neighbors in the 8x8 grid around it.
- If there is <2 neighbors, it will die.
- If there is >3 neighbors, it will die.
- If there is exactly 3 neighbors, a cell will be alive again.

**User Interactions:**
- Users can stop, start or pause the board.
- Users can click on cells to change which ones are alive or dead.
- Users can reset the board.
- Users can clear the board.
- A counter should display how many generations has passed.
- The game will play automatically with no user input if they do not pause upon loading.

**Classes:**
- Cell
- Board
- Game
- Controller

**Board Methods:**
-initializeBoard()
-getBoardState()
-updateBoard()
-resetBoard()
-incrementGeneration()
-displayGeneration()
  
**Cell Methods:**
- newCell()
- getCell()
- fillCell()
- isLiveCell()
- checkNeighborCells()
- setLivingOrDead()
- getNumLiveNeighbors()

**Expected Issues:**
- Overflow error: When checking the eight neighbors around the cell, if a cell is on the edge of the board, it will not have eight members. 
