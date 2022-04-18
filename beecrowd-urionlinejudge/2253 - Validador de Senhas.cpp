#include <iostream>
#include <cstdio>
using namespace std;

bool isLetraMaiuscula(char c) {
	return (c >= 'A' && c <= 'Z');
}

bool isLetraMinuscula(char c) {
	return (c >= 'a' && c <= 'z');
}

bool isEspaco(char c) {
	return (c == ' ');   
}

bool isLetra(char c) {
	return isLetraMinuscula(c) || isLetraMaiuscula(c);
}

bool isDigit(char c) {
    return c >= '0' && c <= '9';
}

bool isValid(string senha) {
	int t = senha.size();
	int qtdDigitos = 0, qtdLetrasMaiusculas = 0, qtdLetrasMinusculas = 0;
	for(int i = 0; i < t; i++) {
	    if (isDigit(senha[i])) qtdDigitos++;
	    else if (isLetraMaiuscula(senha[i])) qtdLetrasMaiusculas++;
	    else if (isLetraMinuscula(senha[i])) qtdLetrasMinusculas++;
	    else return false;
	}
	return (qtdDigitos > 0 && qtdLetrasMaiusculas > 0 && qtdLetrasMinusculas > 0 && t >= 6 && t <= 32);
}


int main(int argc, char *argv[]) {
	string senha;
    
	while(getline(cin, senha)){
		if (isValid(senha)) printf("Senha valida.\n");
		else printf("Senha invalida.\n");
	}
	return 0;
}