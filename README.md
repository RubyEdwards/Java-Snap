# Java-Snap

## Overview

This is my first project with Java. I've used OOP principles to create a simple game of Snap! There are two versions in the code - a single player and multiplayer version.

---

## Versions

### Single Player

- A new game is created with one parameter, the name of your game - e.g. Snap("snap")
- You "win" automatically once two cards in a row have the same suit

### Multiplayer

- A new game is created with three parameters: the name of your game, and two Players - e.g. Snap("snap", playerOne, playerTwo)
- To win, you must enter "snap" within 2 seconds once two cards in a row have the same suit
- If nothing is entered, the wrong thing is entered, or the time runs out, you lose
