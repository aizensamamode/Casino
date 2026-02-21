Date 21/02/2026

In creating play.java file, Ive encountered hardship to how can the three item can be randomize and show to the terminal
im thinking how can i roll this things. im wondering if should i use array or 

problem encounter this day

for (int i = 0; i < 3; i++) {
    spinIndexes[i] = rand.nextInt(emojis.length); // pick random index for this spin
    spinResults[i] = emojis[spinIndexes[i]];     // get emoji for this spin
}

so the first spin is at 0 and will eventually goes up after executing this two things inside of it
and it will execute 3 times based on the statements inside the for loop

first spin spinIndexes[0] = random.nextInt(emojis.length); 
first it will run the random method check the length of emoji which is 3 and will random select to those 3
then it will give back the value it got the the spinIndexes and go on the next

spinResults[i] = emojis[spinIndexes[i]];
first goes and the the value of spinIndexes[i] which is zero on the first run and store it in will indicated or direct it to emoji
to whatever spinIndex get and store it in spinResult so spinResult now have one emojis value

