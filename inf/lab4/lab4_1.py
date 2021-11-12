import time

# Функции для считывания с json

# принимает итератор на строчку, которая начинается на "
# возвращает строку без "", итератор указывает на кавычку
def read_string(it) -> str:
    c = next(it)
    value = ""
    while c != '\"':
        value += c
        c = next(it)
    return value
# принимает итератор, который стоит на [
# возвращает список, итератор стоит на ]
def read_list(it) -> list:
    result_list = []
    c = next(it)
    while True:
        if c == ' ' or c == ',':
            c = next(it)
            continue
        if c == ']':
            break
        if c == '[':
            result_list.append(read_list(it))
        elif c == '{':
            result_list.append(read_dict(it))
        elif c == '\"':
            result_list.append(read_string(it))
        elif c.isdigit() or c == '.':
            res = read_number(it,c)
            result_list.append(res[0])
            c = res[1]
            continue
        c = next(it)
    return result_list
# принимает итератор, который стоит на {
# возвращает словарь, итератор стоит на }
def read_dict(it) -> dict:
    result_dict = {}
    c = next(it)
    while True:
        if c == ' ':
            c = next(it)
            continue
        if c == '}':
            break
        if c == '\"':
            key = read_string(it)
            c = next(it)
            while c == ' ' or c == ':':
                c = next(it)
            if c.isdigit() or c == '.':
                result = read_number(it,c)
                value = result[0]
                c = result[1]
            elif c == '\"':
                value = read_string(it)
                c = next(it)
            elif c == '[':
                value = read_list(it)
            elif c == '{':
                value = read_dict(it)
            else:
                continue
            result_dict[key] = value
            continue
        c = next(it)
    return result_dict
# принимает итератор и его текущую позицию (цифру или точку)
# возвращает список(число,следующий символ), итератор стоит на следующем символе!!!
def read_number(it,digit) -> list:
    value = digit
    c = next(it)
    while c.isdigit() or c == '.':
        value+=c
        c = next(it)
    if '.' in value:
        if value.count('.') == 1:
            value = float(value)
        else:
            raise ValueError("Too many points in Number")
    else:
        value = int(value)
    return [value,c]

# функции для преобразования в yaml
# создание count пробелов
def create_spaces(count) -> str:
    return ' '*count
# функция вывода перевода в yaml
def mprint(string):
    file.write(string+'\n')
# вывод словаря
def print_dict(jdict,pr_str,isList):
    for i in jdict.keys():
        if not isinstance(jdict.get(i),dict) and not isinstance(jdict.get(i),list):
            mprint(pr_str[0]+i+": "+str(jdict.get(i)))
        elif isinstance(jdict.get(i),list):
            mprint(pr_str[0]+i+":")
            print_list(jdict.get(i),pr_str)
        else:
            mprint(pr_str[0]+i+":")
            pr_str[1] += 2
            pr_str[0] += create_spaces(2)
            print_dict(jdict.get(i),pr_str,False)
            pr_str[1]-=2
            pr_str[0]=create_spaces(pr_str[1])
        if isList:
            isList = False
            pr_str[0] = create_spaces(pr_str[1])
# вывод списка
def print_list(jlist,pr_str):
    for i in jlist:
        if not isinstance(i,dict) and not isinstance(i,list):
            mprint(pr_str[0]+"- "+str(i))
        elif isinstance(i,dict):
            pr_str[1]+=2
            pr_str[0]+="- "
            print_dict(i,pr_str,True)
            pr_str[1]-=2
            pr_str[0] = create_spaces(pr_str[1])
        else:
            pr_str[1]+=2
            pr_str[0]+="- "
            print_list(i,pr_str)
            pr_str[1]-=2
            pr_str[0]=create_spaces(pr_str[1])

t = time.time()
for i in range(10):
    file = open("schedule1.yml","w",encoding='UTF-8')
    with open("schedule.json","rt",encoding="UTF-8") as f:
        s = f.read()  
    p = iter(s)
    try:
        while True:
            c = next(p)
            if c == ' ':
                continue
            if c == '[':
                json = read_list(p)
                break
            elif c == '{':
                json = read_dict(p)
                break
    except StopIteration:
        pass

    print_dict(json,["",0],False)
    file.close()
print(float(time.time())-float(t))