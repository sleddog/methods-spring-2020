
// Solution to Kattis 'Faktor' Problem.
// Problem Description: https://open.kattis.com/problems/faktor
// Courtney Yovich, CSCI 494 - Industry Methods - Assignment 2

#include <iostream>

int citationsNeeded(int articles, int impact) {
	int numNeeded = (articles * (impact - 1)) + 1;
	return numNeeded;
}

int main() {
	int numArticles{};
	int impFactor{};
	std::cin >> numArticles >> impFactor;

	int result = citationsNeeded(numArticles, impFactor);
	std::cout << result;
	return 0;

}