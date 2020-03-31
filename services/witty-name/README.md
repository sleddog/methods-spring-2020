# Group Name
Witty Name

## Group Members
- jailarie (Jamie Winter)
- cjyovich (Courtney Yovich)
- jjg-akers (Joseph Akers)


### Project Title

The Okayest Magic Eight Ball (www.okayestmagic8ball.com)

#### Project Description

Our project is to create the okayest magic eight ball. The user will enter a question, click submit, ant the eight ball will return a randomly chosen non commital response such as "sure", "probably", and "I think so?". 


Where will it be hosted (esus, personal website, google, AWS, Azure, etc...)?
    We will be hosting on AWS.
    
What will the endpoint look like? Include a few example requests and responses.
    The user will make a GET request when they submit their question (must end with a '?') to the eight ball and will respond with randomly selected JSON
    
    request: www.okayestmagic8ball.com/?question=who+am+i?
    respons: www.okayestmagic8ball.com/i+think+so?
    
What language/framework/tech stack you will use?
    We are planning to use a Flask framework, utilizing Python.
    
Show how it can be tested (cURL requests, javascript client i.e. react app, etc...)
        cURL requests: curl -X GET www.okayestmagic8ball.com/?question=who+am+i?
        unit testing