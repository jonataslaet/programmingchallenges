#include <iostream>
#include <string>
using namespace std;

int ehConsoante(char palavra)
{
	if (tolower(palavra) != 'y' && tolower(palavra) != 'a' && tolower(palavra) != 'e' && tolower(palavra) != 'i' && tolower(palavra) != 'o' && tolower(palavra) != 'u')
	{
		return 1;
	}
	return 0;
}
int main(int argc, char *argv[])
{
	int t;
	string palavra, resposta;
	cin >> palavra;
	t = palavra.size();
	resposta.push_back('.');

	//Delete all the vowes
	for(int i = 0; i < t; i++)
	{
		//Se for vogal
		if (!ehConsoante(palavra[i]))
		{
			palavra.erase(palavra.begin() + i);
			t--;
			i--;
		}
	}
	t = palavra.size();
	for(int i = 0; i < t; i++)
	{
		if (palavra[i] == (toupper(palavra[i]))) palavra[i] = tolower(palavra[i]);
		palavra.insert(palavra.begin()+i, '.');
		i++;
		t++;
	}
	cout << palavra << endl;
	return 0;
}