from flask import Flask, render_template, request
from random import randint
import datetime

app = Flask(__name__)

responses = ['All signs point to maybe', 'Nobody knows', 'Maybe', 'I think so', '42', 'NO!', 'You are not well', 'Probably',
             'I guess so?', 'You can certainly try!', 'As if!', 'Your mom goes to college', "It's definitely a possibility"]

@app.route("/")
def home():
    return render_template("home.html")

@app.route("/question", methods=['GET'])
def question():

    if request.method == 'GET':
        if 'question' in request.args:

                #request.args.get('question'):

            if request.args.get('question') == '':
                return {
                    'The answer to the ultimate question of life, the universe and everything': '42',
                }

            else:

                value = randint(0, 5)

                return {
                    "question": request.args.get('question'),
                    "response": responses[value],
                    "date": datetime.datetime.now(),
                }
        else:
            return {
                'error': 'Unknown parameter key'
            }

if __name__ == '__main__':
  app.run()
