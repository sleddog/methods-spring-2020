FROM golang:alpine AS builder

RUN apk update

RUN mkdir /app

ADD . /app

WORKDIR /app

RUN go build -o main .

#EXPOSE 8080

#CMD ["/app/main"]


# final stage

FROM alpine

RUN mkdir -p /app/static

COPY --from=builder /app/main /app/

COPY --from=builder /app/static /app/static

WORKDIR /app

EXPOSE 8080

CMD ["/app/main"]