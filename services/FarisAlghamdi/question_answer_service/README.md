## Question Answer Service

## Introduction

This is a CRUD application for questions and answers. A question can be posted, 
updated or deleted. Answers to the questions can also be posted, updated or deleted.
Answers to a question can also be queried.

## Tech Stack

The service is build using spring boot which is a Java framework for building micorservices.
The database engine for ensuring persistent data is Postgres. 

## Hosting

The service will be run locally for the meantime but eventually it 
should be hosted in ASW EC2 servers.

## End Points (few examples)

**1. GET All Questions Endpoint Format**

```shell script
/questions
```
```json
{
    "content": [
        {
            "createdAt": "2020-05-03T22:12:53.977+0000",
            "updatedAt": "2020-05-03T22:12:53.977+0000",
            "id": 1000,
            "title": "Who was steve jobs?",
            "description": "I would like to know who Steve Jobs was and why he is so famous."
        },
        {
            "createdAt": "2020-05-03T22:54:00.105+0000",
            "updatedAt": "2020-05-03T22:54:00.105+0000",
            "id": 1051,
            "title": "How do you apply for tax refund?",
            "description": "I would like to know how to apply for my tax refunds."
        },
        {
            "createdAt": "2020-05-03T22:54:54.400+0000",
            "updatedAt": "2020-05-03T22:54:54.400+0000",
            "id": 1052,
            "title": "How old was Bill Gates when he founded Microsoft?",
            "description": "I would like to know how old Bill Gates was when he founded Microsoft and what made it possible."
        },
        {
            "createdAt": "2020-05-03T22:56:08.874+0000",
            "updatedAt": "2020-05-03T22:56:08.874+0000",
            "id": 1053,
            "title": "How much is 50 dollars in euros?",
            "description": "How much in euros do you get after converting 50 dollars"
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 20,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 1,
    "totalElements": 4,
    "last": true,
    "size": 20,
    "number": 0,
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "first": true,
    "numberOfElements": 4,
    "empty": false
}
```

**2. GET Paginated Questions Endpoint Format**

```python
/questions?page=0&size=2
```
**3. GET sorted Questions Endpoint Format**
```python
/questions?sort=sort=createdAt
```
**4. POST new Questions Endpoint Format**
```python
/questions
```

## Testing

The service's was tested on postman by sending requests and validating the responses.