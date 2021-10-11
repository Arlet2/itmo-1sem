#include <iostream>
#include <cmath>
using namespace std;
void print_message(const int* a,const int N)
{
    // печать ТОЛЬКО информационных битов, то есть не степени двойки
    for(int i=2;i<N;i++)
        if(i != 7 && i != 3)
            cout << a[i];
}
int main()
{
    const int N = 7;
    const int COUNT_S = 3;
    string str;
    cin >> str;
    int a[N];
    // превращение строки в цифры кода
    for(int i=0;i<N;i++)
        a[i] = str[i] - '0';
    int s[COUNT_S];
    for(int i=0;i<COUNT_S;i++)
    {
        s[i] = 0;
        // начинаем от степени двойки и берём элементы в количестве этой степени
        // и делаем ещё один отступ от них в количестве степени двойки
        for(int j=(int)pow(2,i)-1;j<N;j+=(int)pow(2,i)*2)
        {
            for(int z=0;z<(int)pow(2,i);z++)
                // делаем xor с выбранными элементами
                s[i] ^= a[j+z];
        }
    }
    // если синдром последовательности равен 0
    if(s[0] == s[1] && s[1] == s[2] && s[0] == 0)
    {
        cout << "MESSAGE IS CORRECT.\nMESSAGE: ";
        print_message(a,N);
    }
    else 
    {   
        int incorrect_i=0;
        // считаем некорректный бит путём инверсии синдрома последовательности
        for(int i=COUNT_S-1;i>=0;i--)
            incorrect_i += s[i]*pow(2,i);
        // отнимаем 1, так как первый бит - 1
        incorrect_i--;

        // инверсия некорректного бита
        if(a[incorrect_i] == 0)
            a[incorrect_i] = 1;
        else
            a[incorrect_i] = 0;
        cout << "INCORRECT ";
        switch(incorrect_i)
        {
            // по номеру бита определяем его название
            case 0:
                cout << "R1";
                break;
            case 1:
                cout << "R2";
                break;
            case 2:
                cout << "I1";
                break;
            case 3:
                cout << "R3";
                break;
            case 4:
                cout << "I2";
                break;
            case 5:
                cout << "I3";
                break;
            case 6:
                cout << "I4";
                break;
                cout << "I5";
            case 7:
                cout << "I6";
                break;
            default:
                break;
        }
        cout << endl;
        cout << "MESSAGE WAS INCORRECT.\nMESSAGE: ";
        print_message(a,N);
    }
}