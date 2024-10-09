

In order to make my life easier - I decided to auto-generate and auto-commit the readme file using the following steps -

1. Copied the generate-readme.sh file from root to the git hooks folder (You will have to create hte pre-commit.d folder)
~~~
    cp generate-readme.sh .git/hooks/pre-commit.d/generate-readme.sh
~~~
2. Added the following line to the .git/hooks/pre-commit file (You will have to create this file if not present already)
~~~
    .git/hooks/pre-commit.d/generate-readme.sh
~~~
3. Ensure that pre-commit file is executable
~~~
    chmod +x pre-commit
~~~
4. Next time whenever I commit my main files - the readme file changes automatically turn up under commit changes.


5. Alternatively to manually generate readme you can also run the following command from your terminal
~~~
    ./generate-readme.sh
~~~
