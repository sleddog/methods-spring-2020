!/bin/bash

sort -c $1

if [ $? -eq 0]
then
    echo "Files are the same"
    exit 0
else
    echo "Files are not the same"
    exit 1
fi 