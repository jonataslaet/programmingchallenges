#include <iostream>
#include <string>
#include <string.h>
using namespace std;

int main(int argc, char *argv[])
{
	int t, cont, contIniMai, contIniMin;
	string word, wordOrig;
	cin >> word;
	wordOrig = word;
	t = word.size();

	contIniMai = 0;
	contIniMin = 0;
	if (word[0] == (toupper(word[0])))
	{
		contIniMai = 1;
	}
	else
	{
		contIniMin = 1;
	}
	cont = 0;
	for (int i = 1; i < t; i++)
	{
		if (word[i] == (toupper(word[i])))
		{
			word[i] = (tolower(word[i]));
			cont++;
		}
	}
	if (cont+contIniMai+contIniMin != t)
	{
		cout << wordOrig << endl;
	}
	else
	{
		if (contIniMai == 1) word[0] = tolower(word[0]);
		else word[0] = toupper(word[0]);
		cout << word << endl;
	}
	return 0;
}