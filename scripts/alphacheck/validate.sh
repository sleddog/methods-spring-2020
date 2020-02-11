#!/bin/bash

## Perform the check operation using sort on the passed in filename
sort -c $1

## Check the return value of the previous command
if [ $? -eq 0 ]
then
  echo "Files are the same"
  exit 0
else
  echo "Files are NOT the same"
  exit 1
fi
