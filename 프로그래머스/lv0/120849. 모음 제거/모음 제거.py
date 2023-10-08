def solution(my_string):

    c = ['a','e','i','o','u']
    
    #for
    #if c in my_string -> replace
    for i in c:
            my_string = my_string.replace(i,'')

    return my_string