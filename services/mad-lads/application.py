from flask import Flask, escape, request

app = Flask(__name__)

@app.route('/')
def randomFacts():
    animal = request.args.get("animal", "human")
    return f'Random facts about: {escape(animal)}!'

def animal():
    African elephants: "are bigger than Asian elephants"
	whitetail deer: "eat peoples’ gardens"
	Peregrine falcons: "are the fastest birds on the planet"
	Crocodiles: "can have a bite force of 2000 pounds"
	Ostriches: "can run 45 mph"
	Baby bearded dragons: "eat 80% insects and 20% salads"
	Adult bearded dragons: "eat 20% insects and 80% salads"
	Salamanders: "love to hide under wet logs"
	Flying squirrels: "don’t actually fly, they glide"
	Florida panthers: "will sometimes kill and eat young alligators"
	Fishing cats: "actually swim and they have webbed feet"
	The bumblebee bat: "is the smallest bat in the world"
	Giraffes: "have purple tongues"
	Bison:  "are the biggest land animals in North America"
	Red squirrels: "get poofy things on top of their ears to keep their ears warm during winter"
	African servals: "love to pounce on birds or mice"
	Cheetah: "can not purr they whine/squeak"
	Cheetah: "can run 70 mph"
	Dung beetles: "roll a bunch of poop together to eat it or save it and eat it later"
	Termites: "actually have big pinchers to protect themselves."
