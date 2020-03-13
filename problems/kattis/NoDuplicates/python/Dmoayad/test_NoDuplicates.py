import unittest
from unittest.mock import patch
from NoDuplicates import noDup

class Test(unittest.TestCase):
    @patch('builtins.input', return_value='The sentence exceeded the limit of 80 characters')
    def test_long_input(self, input):
        self.assertTrue(noDup(), 't'*81)

    @patch('builtins.input', return_value='No')
    def test_duplicated(self, input):
        self.assertTrue(noDup(), 'IN THE RAIN AND THE SNOW')

    @patch('builtins.input', return_value='Yes')
    def test_non_duplicated(self, input):
        self.assertTrue(noDup(), 'THE RAIN IN SPAIN')


if __name__ == '__main__':
    unittest.main()