#from datetime import datetime
from flask import Flask, render_template, url_for, flash, redirect
from flask_sqlalchemy import SQLAlchemy
import random

app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///test.db'
db = SQLAlchemy(app)

class Todo(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    content = db.Column(db.String(200), nullable=False)
    completed = db.Column(db.Integer, default=0)
    #date_created = db.Column(db.DateTime, default=datetime.utcnow)

    def __repr__(self):
        return '<Task %r>' % self.id

@app.route('/')
#def index():

def generation():
    file_name = ('/Users/mrfur/Desktop/494/env/namesfixed.csv')
    infile = open(file_name, 'r')
    first = infile.readline()
    x = random.randint(1,560)
    z = 0
    for line in infile:
        z += 1
        cells = line.split(',')
        if z == x:
            break
    name = cells[0]
    return render_template('index.html', name=name)
    #print(name)
#generation('/Users/mrfur/Desktop/494/env/namesfixed.csv')



@app.route("/about")
def about():
    file_name = ('/Users/mrfur/Desktop/494/env/namesfixed.csv')
    infile = open(file_name, 'r')
    first = infile.readline()
    x = random.randint(1,560)
    z = 0
    for line in infile:
        z += 1
        cells = line.split(',')
        if z == x:
            break
    name = cells[0]
    return render_template('index.html', name=name)

    

if __name__ == "__main__":
    app.run(debug=True)


