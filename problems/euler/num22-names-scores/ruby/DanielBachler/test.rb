require_relative "solution"
require "test/unit"

class TestSolution < Test::Unit::TestCase

    def test_simple
        # Test against example given in readme
        assert_equal({"PAMELA"=>240}, problem(["ALEX", "LUIS", "JAMES", "BRIAN", "PAMELA"], ["PAMELA"]))
        # Test with lower case, should be differnt
        assert_equal({"pamela"=>1200}, problem(["alex", "luis", "james", "brian", "pamela"], ["pamela"]))
    end

    def test_failure
        # Lower case should not get uppercase answer
        assert_not_equal({"pamela"=>240}, problem(["alex", "luis", "james", "brian", "pamela"], ["pamela"]))
    end
end