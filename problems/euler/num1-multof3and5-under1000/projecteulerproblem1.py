def main():
    x = 0
    total = 0
    while x < 1000:
        if x % 3 == 0:
            total += x

        elif x % 5 == 0:
            total += x
        x+=1
    return  total
import unittest
class TestStringMethods(unittest.TestCase): 
      
    def setUp(self): 
        pass
  
    # Returns True if the string contains 4 a. 
    def test_strings_a(self): 
        self.assertEqual(main(), 233168)
if __name__ == '__main__':
    print(main())
    unittest.main()

# Code looks good to me, nothing unnecessary is added.  Maybe add some comments to explain the thought process.
# +10
