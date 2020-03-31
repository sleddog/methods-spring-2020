#define CATCH_CONFIG_RUNNER
#include "catch.hpp"
#include "faktor.cpp"


TEST_CASE("Number of Articles and Impact Factor", "Reviewers Needed") {
	REQUIRE(citationsNeeded(38, 24) == 875);
	REQUIRE(citationsNeeded(1, 100) == 100);
}