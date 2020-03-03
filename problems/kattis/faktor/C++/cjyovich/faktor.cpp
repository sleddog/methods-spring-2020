
// Solution to Kattis 'Faktor' Problem.
// Problem Description: https://open.kattis.com/problems/faktor
// Courtney Yovich, CSCI 494 - Industry Methods - Assignment 2 + 3

#include <iostream>
#define CATCH_CONFIG_RUNNER
#include "catch.hpp"

int citationsNeeded(int articles, int impact) {
	int numNeeded = (articles * (impact - 1)) + 1;
	return numNeeded;
}

TEST_CASE("Number of Articles and Impact Factor", "Reviewers Needed") {
	REQUIRE(citationsNeeded(38, 24) == 875);
	REQUIRE(citationsNeeded(1, 100) == 100);
}

int main() {
	int numArticles{};
	int impFactor{};
	std::cin >> numArticles >> impFactor;

	int result = citationsNeeded(numArticles, impFactor);
	std::cout << result;
	return 0;

}