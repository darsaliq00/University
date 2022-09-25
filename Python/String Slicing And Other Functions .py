mystr = "saliq is learning python"
print(mystr)
# this is string sclicing
print(mystr[0:4])
print(mystr[0:6])
#to check length of string
print(len(mystr))
print(mystr[0:24])
#this will give  error
'print(mystr[57])' #this is also comment symbol ('  ')
# this will print whole string without error
print(mystr[0:100])
print(mystr[0:]) #here 2nd place is blanck it will automatically print whole string
print(mystr[:24])# here first place is blanck it will automatically recognise it as zero
print(mystr[::])#here it will also print all but will consider it as 1 by default
# to skip 1 character in between and print
print(mystr[::2])
print(mystr[::3])#to skip 2 charascters in between
print(mystr[::9])
#this is advance slicing

'we can also consider counting from backward using - symbol then -1 will b "n "of python'
print(mystr[-1])
print(mystr[1:2:-1])
print(mystr[1:2:-2])
#advance
print(type(mystr)) # to know is it string or nt
print(mystr.isalnum())# sialnum is it alpha numeric
print(mystr.endswith("boy")) # this will check weather string ends with boy or not
print(mystr.endswith("python")) #this will check weather string ends with python or not
print(mystr.count("a"))#to count how many times (a) is used
print(mystr.capitalize()) # it will captilize first alphabit
print(mystr.find("is")) # it will find the location of (is)
print(mystr.lower()) # will convert string first digit with lower case
print(mystr.upper()) # will convert string first digit with upper case
print(mystr.replace("saliq", "mehran")) # it will rewplace saliq in  string with mehran
