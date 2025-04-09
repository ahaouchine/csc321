#aziz haouchine
#csc321
#lab#12




# Function to calculate the area of a rectangle
def rectangle_area(base, height):
    return base * height

# Function to calculate the area of a circle
def circle_area(radius):
    pi = 3.14
    return pi * (radius ** 2)

# Body of the program starts
base = float(input("Enter the base of the rectangle: "))
height = float(input("Enter the height of the rectangle: "))

rect_area = rectangle_area(base, height)

print(f"The area of the rectangle is: {rect_area:.2f}")

print()  

radius = float(input("Enter the radius of the circle: "))

circ_area = circle_area(radius)

print(f"The area of the circle is: {circ_area:.2f}")




