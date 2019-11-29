#!/bin/sh
source version.txt
((version+=1))
echo version=$version > version.txt
git add version.txt
git commit -m "version=$version"
git push