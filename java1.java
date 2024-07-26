def add_and_check_even(a, b):
    result = a + b
    if result % 2 == 0:
        return f"{result} is an even number"
    else:
        return f"{result} is an odd number"

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
