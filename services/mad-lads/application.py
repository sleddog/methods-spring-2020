from flask import Flask, escape, request

app = Flask(__name__)

@app.route('/')
def randomFacts():
    animal = request.args.get("animal", "human")
    facts = {"Cows": 'Cows painted with zebra-like stripes can avoid being bitten by flies.', "cows": 'Cows painted with zebra-like stripes can avoid being bitten by flies.',
             "Mantis shrimp": 'The mantis shrimp has the worlds fastest punch.', "mantis shrimp": 'The mantis shrimp has the worlds fastest punch.',
             "Zebra": 'Zebra stripes act as a natural bug repellant.', "zebra": 'Zebra stripes act as a natural bug repellant.'
	     "African Elephants": "are bigger than Asian elephants","african elephants": "are bigger than Asian elephants",
	     "Whitetail Deer": "eat peoples gardens" , "whitetail deer": "eat peoples’ gardens",
	     "Peregrine Falcons": "are the fastest birds on the planet","peregrine falcons": "are the fastest birds on the planet",
	     "Crocodiles": "can have a bite force of 2000 pounds","crocodiles": "can have a bite force of 2000 pounds",
	     "Ostriches": "can run 45 mph", "ostriches": "can run 45 mph",
	     "Baby Bearded Dragons": "eat 80% insects and 20% salads","baby bearded dragons": "eat 80% insects and 20% salads",
	     "Adult Bearded Dragons": "eat 20% insects and 80% salads","adult bearded dragons": "eat 20% insects and 80% salads",
	     "Salamanders": "love to hide under wet logs","salamanders": "love to hide under wet logs",
	     "Flying Squirrels": "don’t actually fly, they glide", "flying squirrels": "don’t actually fly, they glide",
	     "Florida Panthers": "will sometimes kill and eat young alligators","florida panthers": "will sometimes kill and eat young alligators",
	     "Fishing Cats": "actually swim and they have webbed feet","fishing cats": "actually swim and they have webbed feet",
	     "The Bumblebee Bat": "is the smallest bat in the world","the bumblebee bat": "is the smallest bat in the world",
	     "Kittis Hog-Nosed Bat": "is known as the bumblebee bat","kittis hog-nosed bat": "is known as the bumblebee bat",
	     "Giraffes": "have purple tongues", "giraffes": "have purple tongues", 
	     "Bison":  "are the biggest land animals in North America","bison":  "are the biggest land animals in North America",
	     "Red Squirrels": "get poofy things on top of their ears to keep their ears warm during winter","red squirrels": "get poofy things on top of their ears to keep their ears warm during winter",
	     "African Servals": "love to pounce on birds or mice","african servals": "love to pounce on birds or mice",
	     "Cheetah": "can not purr they whine/squeak","cheetah": "can not purr they whine/squeak",
	     "Cheetahs": "can run 70 mph","cheetahs": "can run 70 mph",
	     "Dung Beetles": "roll a bunch of poop together to eat it or save it and eat it later","dung beetles": "roll a bunch of poop together to eat it or save it and eat it later",
	     "Termites": "actually have big pinchers to protect themselves", "termites": "actually have big pinchers to protect themselves"}

    return f'Random facts about: {escape(animal)}!'

