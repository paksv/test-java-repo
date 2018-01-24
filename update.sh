#!/bin/sh
source version.txt
((version+=1))
echo version=$version > version.txt
git add -m
git commit -m "version=$version"
git push