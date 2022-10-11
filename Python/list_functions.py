list = ['harry', 'ram', 'Aakash', 'shyam', 5, 4.85] #example
if i will type:> print(list) it will print all elements in list
if i will type:> print(list[0]) it will print harry
if i will type:> print(list[1]) it will print ram
  if i will type:> print(list[3]) it will print shyam
    
    
    numbers= [ 4,6,8,33,15,25,26,16,17,19,10,27,24,30,46,37]
   //  if i will type(like method above) :> print(nuumbers) it will print whole number string(whole numbers list)
  /// if i will type:> print(numbers[0]) it will print 4
    and other is same
   
  
  
  
  
  #sorting numbers in list
    numbers= [ 4,6,8,33,15,25,26,16,17,19,10,27,24,30,46,37]
    numbers.sort() >>>> it will sort numbers in order
    print(numbers)
    
    >>> now to print in reverse order<<<<
    
numbers.sort()
numbers.reverse() >>>it will print numbers in reverse order
print(numbers)
                                                                                     
>>>>>>>>>>>>>>>>>>>>>>>>Lists in Python<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

[]                                             # list with no member, empty list
[1, 2, 3]                                    # list of integers 
[1, 2.5, 3.7, 9]                           # list of numbers (integers and floating point)
['a', 'b', 'c']                               # lisst of characters
['a', 1, 'b', 3.5, 'zero']                # list of mixed value types
['One', 'Two', 'Three']               # list of strings 



>>>>>>>>>>>>>>>>>>>>>>>># List Methods :<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
l1=[1,8,4,3,15,20,25,89,65]       #l1 is a list
print(l1)

l1.sort()
print(l1)      #l1 after sorting
l1.reverse()
print(l1)      #l1 after reversing all elements


>>>>>>>>>>>>>>>>>>>>>>>>>list slicing<<<<<<<<<<<<<<<<<<<<<<<
seq = list1[start_index:stop_index]
e.g

numbers=[1,5,3,7,6]
print(numbers[0:5]) it will print the list [ 5 is due to there are 5 elements in this list] 5 is the length of list
print(numbers[:5]) if i will not type 0 it will consider it as 0 automatically
print(numbers[:])  if i will not type 0 and 5 it will consider it as 0 and 5  automatically
print(numbers[:]) it will print the default list
print(numbers[1:]) it will neglect first number (0th place) because the length starts from 0 and we are not typing it i.e its not printing 0th place number and will print other numbers {output(5,3,7,6)}
print(numbers[1:4]) it will not print first munber (0th) reason for zero is above and fifth number (4th) will not print becaause the length is 5 and we typed 4 i.e it ended list at 7 (i.e forth number)
it will not change the list but sort changes original list
print(numbers) old list will print

 
  
  >>>>>>>>>>>>>>>>>>>>extended slice<<<<<<<<<<<<<<<<<<<<<
  numbers=[1,5,3,7,6]
  
  print(numbers[::1]) here it will normally print the string
  print(numbers[::2]) here it will jump one number i.e will skip one number i.e >>> output will b [1, 3, 6]<<<
  print(numbers[::3]) here it will jump two number i.e will skip two number i.e >>> output will b  [1, 7] <<<<<<<
 >>>>    negative slicing<<<<<<<
print(numbers[::-1]) here it wll reverse the list i.e >>>> output will b [6, 7, 3, 5, 1] <<<<
print(numbers[::-3])    here it wll reverse the list o/p[6, 7, 3, 5, 1] and will then skip/jump two numbers i.e o/p [6, 5]
 dont use negative numbers other than -1 or it will confuse u
 
print(len(numbers)) length of string                o/p 5
print(max(numbers)) big number in list              o/p  7
print(min(number)) small number in  string          o/p 1

>>>>>>>>>>>>>>>>add number at end of string<<<<<<<<<<<<<<<
numbers.append(8) # it will add 8 at the end of string
print(numbers)    o/p [1, 5, 3, 7, 6, 8]

now if i will
numbers.append(8)
numbers.append(9) 
numbers.append(55)
print(numbers)       o/p will b [1, 5, 3, 7, 6, 8, 8, 9, 55]

  >>>>>>>>>>>>>>insert number between the string <<<<<<<<<<<<
  numbers.insert(1, 67)  # here 1 i.e first argument means in which address i want to insert number and 2nd argument i.e 67 means the nmber i want to insert
  print(numbers)          #output will b [1, 67, 5, 3, 7, 6]
  
  numbers.insert(2, 67)
   print(numbers)  #output will b [1, 5, 67, 3, 7, 6]
    
    >>>>to remove a element <<<
   numbers.remove(3) it will remove 3 i.e element (here number) 3 in the list
  print(numbers)   output [1, 5, 7, 6] >>>> original elements are [1, 5, 3, 7, 6 ] >>>
  
  numbers.pop() <<<< it will remove last element  output will b [1, 5, 3, 7] <<<
  
  example  
 https://cwh-full-next-space.fra1.digitaloceanspaces.com/videos/python-tutorials-for-absolute-beginners-9/liststep3.webp
    
    
   >>>>>>>>>>>>>>>>>>>>>> # List Methods :- <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
list1=[1,2,3,6,,5,4]     #list1 is a list

list1.append(7)    # This will add 7 in the last of list 
list1.insert(3,8)    # This will add 8 at 3 index in list
list1.remove(1)    #This will remove 1 from the list 
list1.pop(2)          #This will delete and return index 2 value.








# >>>>>>>>>>>>>>>>Tuples in Python :<<<<<<<<<<<<<<<<<  
a=()  or tp= ()  # It's an example of empty tuple
x=(1,)   # Tuple with single value i.e. 1 
tup1 = (1,2,3,4,5)
tup1 = ('harry', 5, 'demo', 5.8)



# Swapping of two numbers :
a = 10
b = 15
temp = a
a = b
b = temp 
print (a, b)

# now simple method using python
a = 10 
b = 15
print(a,b)     #It will give output as: 10 15
a,b = b,a 
print(a,b)     #It will give output as: 15 10


grocery = ["Harpic", "vim bar", "deodrant", "Bhindi",
           "Lollypop", 56]
# print(grocery[5])
numbers = [2, 7, 9, 11, 3]
# numbers.remove(9)
# numbers.pop()
# numbers.sort()
# numbers = []
# numbers.reverse()
# numbers.append(1)
# numbers.append(72)
w numbers.append(5)
# numbers.insert(2, 67)
# print(numbers)
# 3, 11, 9, 7, 2
# print(numbers)
# numbers[1] = 98
# print(numbers)
# Mutable - can change
# Immutable - cannot change
# tp = (1,)
# print(tp)
a= 1
b = 8
a, b = b,a
# temp = a
# a = b
# b = temp
print(a, b)

