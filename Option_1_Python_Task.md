
# Hypothetical student's code
'''
class Solution:
       def groupAnagrams(self, strs):
      result = {}
      for i in strs:
         x = "".join(sorted())
         if x in result:
            result[x].append(i)
         else:
            result[x] = [i]
      return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
'''

# Hypothetical student's name is Mike
# Good start so far Mike, I see the where the code is going however there are some slight issues with the code that we need to adjust 
# so we can have a well functiong code.
# Correctness:
# When sorting the string you did not pass the string variable, this is a TypeError.
# There are indentation errors from line 3 to line 11 of your code this the number one reason why the code wll not run
#  
# Efficiency:
# The efficiency is quite good. It has a time complexity of O(n * m * log m),where n is the length of the strs list and
# m is the average length of the strings in strs. Well done in this aspect
#
# Documentation:
# There are no comments includeD for better readability. 
# Comments can help explain the purpose of specific lines of code or provide additional context.
#
# Style:
# Your code does not follow commonly accepted PEP 8 best practice. No spacing and there indentation issues.
# It is best practise to leave two lines below a function in terms of PEP 8, when naming your functions and variables 
# best practise to use the snake case where you would use an underscore between two or more words.
# May I kindly suggest you read up on PEP8
#
# Overall:
# While your function has some errors you did well on this task however take note of the above suggestions.
#
#



# Corrected code
class Solution:
       # Use snake case to name the variables
       def group_anagrams(self, strings):
           # Initialise an empty dictionary to hold the results
           result = {}

           # Iterate through the list and sort it
           for i in strings:
               x = "".join(sorted(i))
               

               if x in result:
                  result[x].append(i)
               else:
                    result[x] = [i]
           

           return list(result.values())

# Create a list of strings with a descriptive variable name
strings = ["eat", "tea", "tan", "ate", "nat", "bat"]

ob1 = Solution()
# Call the function with the variable name instead of the list of strings
print(ob1.group_anagrams(strings))
