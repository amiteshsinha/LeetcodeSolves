

In order to make my life easier - i decided to auto-generate and auto-commit the readme file using the following steps -

1. Copied the generate-readme.sh file from root to the git hooks folder
~~~
    cp generate-readme.sh .git/hooks/pre-commit.d/generate-readme.sh
~~~
2. Added the following line to the .git/hooks/pre-commit file
~~~
    .git/hooks/pre-commit.d/generate_readme.sh
~~~
3. Ensure that pre-commit file is executable
~~~
    chmod +x pre-commit
~~~
4. Alternatively to manually generate readme you can also run the following command from your terminal
~~~
    ./generate-readme.sh
~~~
