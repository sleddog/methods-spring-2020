import pytest
import mock

import realr2
def user_prompt():
    i = realr2.input(10)

    return 'Your number is {}'.format(i)
def user_prompt2(j):
    j = realr2.input(20)
    return 'Your number is {}'.format(j)
def doTheThing():
    print(i,j,k)
   
def test_user_prompt_ok():
    with mock.patch.object(r2.input, 'input', lambda _: "20"):
        assert user_prompt() == 10
        assert user_prompt2() == 20