# mad-lads
## Dan Bachler, Wyatt Benson, Tysen Radovich, Ben Barnett

# Link to SwaggerHub API Spec

[SwaggerHub](https://app.swaggerhub.com/apis/DanielBachler/mad-lads/1.0.0)

# Hosting

The application will be hosted on Dan's webserver at danbachler.com

# Endpoint

There is one endpoint in this API, which is animalType.  Specifying an animal type returns a random fact about that animal.  
Mantis shrimp-The mantis shrimp has the world's fastest punch.
Cows -Cows painted with zebra-like stripes can avoid being bitten by flies.
Grizzly bear- A grizzly bear's bite is strong enough to crush a bowling ball.
Zebra - Zebra stripes act as a natural bug repellant.
Failure to input an animal, or putting in an unknown animal causes the random fact to instead be a human based insult.

# Language and Framework

The language and framework we will be using is Python using Flask for the web app

# Testing

To test the application there will be a unit-testing-esque file that runs cURL requests against the server and expects a certain outcome.
