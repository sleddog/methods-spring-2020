# Kattis 2048 Variation

## Description
This project is a variation of the 2048 problem from [Kattis](https://open.kattis.com/problems/2048).

This variation is puzzle game where a player slide tiles across a 4 x 4 grid with the goal of reducing the number of tiles as much as possible.  The player can slide Up, Down, Right, and Left. When tiles collide that have the same value, they will combine into a sigle tile with the value of the sum of the colliding tiles. Zeros are not counted and are treated as blank tiles.

![Game Preview](Assignment2.png)


## Installation

### Docker
If the environment where this project is to be run does not already have Golang installed, the simplest way to run it is to download and install Docker and then pull the image.

To install docker follow the appropriate link for your OS -- [Mac](https://docs.docker.com/docker-for-mac/install/), [Linux](https://docs.docker.com/install/linux/docker-ce/ubuntu/), [Windows](https://docs.docker.com/docker-for-windows/install/)

Once Docker is installed, test it is working appropriatly by running the following:

```bash
$ docker run hello-world

Hello from Docker.
This message shows that your installation appears to be working correctly.
...
```

Next, pull the image from dockerhub:

```
$ docker pull jakers85/goprojects:puzzlegame
```

Verify the the image was pulled by running:

```
$ docker images | grep puzzlegame
```
### Go
If you wold like to install Golang and run the project through a CLI download the approprieate package from [here](https://golang.org/dl/). If you are having trouble, click [here](https://golang.org/doc/install) for a more detailed "Getting Started" guide.

## Usage/ How to Run

### From Docker

To run the Docker image and start the program use the following command:

```
$ docker run -p8080:8080 --rm jakers85/goprojects:puzzlegame
```

This will start the server.

Now open a web browser and navigate to:

[http://localhost:8080](http://localhost:8080)

Enjoy!

To exit the program, return to the command prompt and enter ctrl+c

### From Golang Tools
If you have Go installed, from the command line change directories into the folder that containes the project files (main, main.go, static...etc).

Now, run the program using the following command:

```
$ ./main
```

This should start the server.

If the program does not run, verify that you are in the directory containing 'main.go' and try rebuilding the project using the following:

```
$ go build main.go
```

And running it with:

```
$ go run main.go
```

Once the server has started, open a web browser and navigate to:

[http://localhost:8080](http://localhost:8080)

To exit the program, return to the command prompt and enter ctrl+c.

## Testing

To run the unit tests, Golang must be installed. If Go is not installed on your local environment, follow the instructions above.

To run the tests enter the following commands:

```
$ go test -v
```

This should provide a result similar to

```
$ go test -v
=== RUN   TestProcessRow
=== RUN   TestProcessRow/([0_0_0_0])
=== RUN   TestProcessRow/([1_1_1_1])
=== RUN   TestProcessRow/([1_2_1_2])
=== RUN   TestProcessRow/([1_1_2_2])
=== RUN   TestProcessRow/([3_0_3_0])
=== RUN   TestProcessRow/([4_0_0_0])
=== RUN   TestProcessRow/([1_2_3_4])
=== RUN   TestProcessRow/([4_0_0_4])
=== RUN   TestProcessRow/([0_2_2_0])
=== RUN   TestProcessRow/([3_4_4_2])
--- PASS: TestProcessRow (0.00s)
    --- PASS: TestProcessRow/([0_0_0_0]) (0.00s)
    --- PASS: TestProcessRow/([1_1_1_1]) (0.00s)
    --- PASS: TestProcessRow/([1_2_1_2]) (0.00s)
    --- PASS: TestProcessRow/([1_1_2_2]) (0.00s)
    --- PASS: TestProcessRow/([3_0_3_0]) (0.00s)
    --- PASS: TestProcessRow/([4_0_0_0]) (0.00s)
    --- PASS: TestProcessRow/([1_2_3_4]) (0.00s)
    --- PASS: TestProcessRow/([4_0_0_4]) (0.00s)
    --- PASS: TestProcessRow/([0_2_2_0]) (0.00s)
    --- PASS: TestProcessRow/([3_4_4_2]) (0.00s)
PASS
ok      csci494-assignment3    0.362s
```
