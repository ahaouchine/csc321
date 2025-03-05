
#aziz haouchine
#csc321
#lab#8



import random

# Choose a number between 0 and 9
number = random.randint(0, 9)

# Ask the user to guess the number
guess = int(input("Guess a number between 0 and 9: "))

# Check the user's guess
if guess < number:
    print("Too low! Try again next time.")
elif guess > number:
    print("Too high! Try again next time.")
else:
    print("Congratulations! You guessed the correct number!")

# For loop to print out a statement multiple times
for _ in range(5):
    print("if you miss your name in a comment program! you get -5% in your grade ")

# While loop to print out a statement multiple times
favorite_food = "Pizza"
count = 0
while count < 3:
    print(f"I love {favorite_food}!")
    count += 1




