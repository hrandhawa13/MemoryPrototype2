# MemoryPrototype2
# Object oriented porgramming, inheritance, interfaces, Multi thread client server, Java, GUI, Listeners, javax.swing

This is the second prototype of memory game. It is the extended version of MemoryPrototype1.
It is a multi thread server client cards game with GUI.
A server has all the data and once the server starts running, it waits for 2 clients to connect. Once it makes connection with 2 different clients, it starts running the game.
Each player can select 2 cards and then the control is switched to other player. If the 2 cards match, current player gets one point other wise the cards are flipped back to their initial state. 
A player can only quit the game if it is their turn to play.If player chooses to quit they lose.
A session of game ends if the client quits or if all the cards are matched.
If all the cards match then the winner is decided by higher score.

Next prototype will include additional features like sounds, chat box between 2 players.
