# JANUARY 11 TASK

name file : therealproject.excalidraw

THIS FILE IS FOR EXPLAINING HOW WILL THE PROCESS WILL GO BASE ON 
EXCALIDRAW

------------------------------------------------------------------------

[BANK MONEY 1]

The (bank money 1) will show after the code run. It will be the first thing that will show. 

What is bank money?
The bank class will be look liek gcash where the money of player comes from

-additional info-

In the bank player will not input a number on the screen it will be automatically have money based on the program. So the programmer will set it manually so when you open it it will have the money. user can go back here everytime he enter back in casino menu

-PRESS ENTER-
after the user press enter it will go direct to casino menu 1. to input the name but if player had alrdy name it will go to casino menu 2.

so if player dont have name go to casino menu 1 which is automatic if the game did just started. but later on if player had alrdy name it will go to casino menu 2.



------------------------------------------------------------------------

[casino menu 1]

will show for the player to input a name and put a name in the account

-PRESS ENTER-
when player press enter it will go to casino menu 2

------------------------------------------------------------------------

[casino menu 2]

this display the user name from casino menu 1 variable
this display user money

[PLAY]  - lead to game section
[DEPOSIT] - lead to deposit/widraw
[WIDRAW] - lead to widraw/deposit
[BACK] - lead to bank money

------------------------------------------------------------------------

[GAME CASINO]

1.) SHOWS SPIN
2.) SHOW BACK

SHOWS PLAYER MONEY

WHEN PLAYER ENTER (1).IT WILL GO TO SPIN METHOD

[SPIN METHOD]
will have a loop inside it will just stop if player enter [back]
but aslong as the user pressing enter it will redo it


it will have 3 variable 
var = lost   / this will have 30% percentage
var = win    / this will have 40% percentage
var = bigwin / this will have 10% percentage

I will use loop to add this 

static Main [] storage_of_items = {
        new Main("LOST", 30),
        new Main("WIN",40),
        new Main("BIGWIN", 10)
    }; 

    CHECK SPIN-WITH-PERCENTAGE FOR REFERENCE

    IF PLAYER GET LOST PLAYERMONEY -= 5;
    IF PLAYER GET WIN PLAYERMONEY += 5;
    IF PLAYER GET BIGWIN PLAYERMONEY += 15;



-------------------------------------------------------------------------
[WIDRAW / DEPOSIT]
DO WHILE TRUE
IF DEPOSIT
SHOW 

PLAYERMONEY : 
BANK MONEY  :
DEPOSIT: AMOUT-DEPOSIT

SCAN VAR AMOUT-DEPOSIT

IF BANKMONEY > AMOUT-DEPOSIT
YOU DONT HAVE THAT AMOUNT

ELSE
BANKMONEY -= AMOUNT DEPOSIT
PLAYERMONEY += AMOUNT DEPOSIT
AMOUNT DEPOSIT = 0
RETURN

AFTER RETURN IT WILL GO BACK TO CASINO

-------------------------------------------------------------------------
[WIDRAW / DEPOSIT]
DO WHILE TRUE
IF WIDRAW 

PLAYERMONEY :
BANK MONEY  :
WIDRAW      :

IF WIDRAW > PLAYERMONEY
YOU DONT HAVE THAT AMOUNT

ELSE
PLAYERMONEY -= WIDRAW
BANKMONEY += WIDRAW
WIDRAW = 0
RETURN

THIS WILL GO BACK TO CASINO








