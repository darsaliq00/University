# Dictionary is nothing but key value pairs
dl = {} >>> its empty dictionary
print(dl) >>>> output = {}

# Dictionary is nothing but key value pairs
d1 = {}
# print(type(d1))
d2 = {"Harry":"Burger","Rohan":"Fish","SkillF":"Roti","Shubham":{"B":"maggie", "L":"roti", "D":"Chicken"}}

# print(d2["Shubham"])
it will print {'B': 'maggie', 'L': 'roti', 'D': 'Chicken'}

# print(d2["Shubham"]["B"])            it will print the value of B only
and the output will b maggie

if i want to add more data in d2 dictionary 

# d2["Ankit"] = "Junk Food"
and the output will b {'Harry': 'Burger', 'Rohan': 'Fish', 'SkillF': 'Roti', 'Shubham': {'B': 'maggie', 'L': 'roti', 'D': 'Chicken'}, 'Ankit': 'Junk Food'}
>>if i want to add more  
# d2[420] = "Kebabs"
# print(d2)  o/p {'Harry': 'Burger', 'Rohan': 'Fish', 'SkillF': 'Roti', 'Shubham': {'B': 'maggie', 'L': 'roti', 'D': 'Chicken'}, 'Ankit': 'Junk Food', 420: 'Kebabs'}
# del d2[420] >>> it will delete the [420] value in d2 i.e will delete kebabs
>>>>>>>if i want to copy
print (d2.copy()) >> it will return us the copy of dictionary

now if i will do  
d3=d2 here it will understand d2 as d3 (here it will not create new dictionary d3)
and then if i will

del d3["harry"] >>> it will delete it from bothd2 and d3 thats why we use ___.copy()
# d3 = d2.copy()
# del d3["Harry"]

# d2.update({"Leena":"Toffee"})
# print(d2.keys()) here it will print only keys >>> o/p  dict_keys(['Harry', 'Rohan', 'SkillF', 'Shubham'])
# print(d2.items()) it will print all the items in d2 >>> o/p dict_items([('Harry', 'Burger'), ('Rohan', 'Fish'), ('SkillF', 'Roti'), ('Shubham', {'B': 'maggie', 'L': 'roti', 'D': 'Chicken'})])




###raw code####
# Dictionary is nothing but key value pairs
d1 = {}
# print(type(d1))
d2 = {"Harry":"Burger",
      "Rohan":"Fish",
      "SkillF":"Roti",
      "Shubham":{"B":"maggie", "L":"roti", "D":"Chicken"}}
# d2["Ankit"] = "Junk Food"
# d2[420] = "Kebabs"
# print(d2)
# del d2[420]
# print(d2["Shubham"])
# d3 = d2.copy()
# del d3["Harry"]
# d2.update({"Leena":"Toffee"})
# print(d2.keys())
# print(d2.items())

