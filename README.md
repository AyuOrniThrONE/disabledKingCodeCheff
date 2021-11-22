# disabledKingCodeCheff
Chef loves Chess and has thus invented a new piece named "Disabled King".

Let's denote the cell at the intersection of the i-th column from the left and j-th row from the top by (i,j).

If he is currently in cell (x,y), the disabled king can move to the following positions in one move (provided that he remains in the chessboard):


(x,y+1)

(x,y−1)

(x+1,y+1)

(x+1,y−1)

(x−1,y+1)

(x−1,y−1)

In short, the Disabled King cannot move horizontally.

In an N×N chessboard, the Disabled King is currently situated at the top-left corner (cell (1,1)) and wants to reach the top-right corner (cell (N,1)). Determine the minimum number of moves in which the task can be accomplished.
