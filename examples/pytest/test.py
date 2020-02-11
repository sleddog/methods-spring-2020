import unittest
from fizzbuzz import fizzbuzz


class TestFizzBuzz(unittest.TestCase):
    def test_fizzbuzz_15(self):
        x = fizzbuzz(15)
        self.assertEqual(x, "FizzBuzz")

    def test_fizzbuzz_15(self):
        x = fizzbuzz(5)
        self.assertEqual(x, "Buzzsdfsdfg")

    def test_fizzbuzz_1(self):
        x = fizzbuzz(1)
        self.assertEqual(x, 1)


class TestStringMethods(unittest.TestCase):

    def test_upper(self):
        self.assertEqual('foo'.upper(), 'FOO')

    def test_isupper(self):
        self.assertTrue('FOO'.isupper())
        self.assertFalse('Foo'.isupper())

    def test_split(self):
        s = 'hello world'
        self.assertEqual(s.split(), ['hello', 'world'])
        # check that s.split fails when the separator is not a string
        with self.assertRaises(TypeError):
            s.split(2)


if __name__ == '__main__':
    unittest.main()
