# Input athlete's name
n = input("Enter athlete's name : ")

# Input scores of 5 mathes
print("Enter the score obtained in 5 different matches : ")

S1 = int(input())
S2 = int(input())
S3 = int(input())
S4 = int(input())
S5 = int(input())

# Calculate the average score
a = (S1 + S2 + S3 + S4 + S5) / 5

# Determine and print performance category based on average
if a >= 80:
    print("Elite Performance")
elif a >= 50 and a < 80:
    print("Standard Performance")
else:
    print("Needs Intensive Training")
