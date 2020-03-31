from flask import Flask, escape, request

app = Flask(__name__)

@app.route('/')
def randomFacts():
    animal = request.args.get("animal", "human")
    return f'Random facts about: {escape(animal)}!'