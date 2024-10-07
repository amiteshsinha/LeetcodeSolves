#!/bin/bash

# Set the path to the main README.md
MAIN_README="README.md"

# The prefix path to remove
PREFIX_TO_REMOVE="src/main/java/com/leetcode"

# Start with a header
echo "# Leetcode Solves" > $MAIN_README
echo "" >> $MAIN_README
echo "My leetcode [profile](https://leetcode.com/u/amiteshsinha88/)" >> $MAIN_README
echo "" >> $MAIN_README
echo "This git repo is a collection of all the leetcode problems I have solved till date. It will always be a work in progress. What each of the
following links
contain - " >> $MAIN_README
echo "1. Link to the original leetcode problem"  >> $MAIN_README
echo "2. All my approaches"  >> $MAIN_README
echo "3. Test cases for the problem"  >> $MAIN_README
echo "" >> $MAIN_README
echo "I have also added a file on how to generate the readme file automatically on every problem commit"  >> $MAIN_README
echo "" >> $MAIN_README
echo "## Leetcode problems : " >> $MAIN_README
echo "" >> $MAIN_README

# Get the absolute path of the current directory
base_dir=$(pwd)

counter=1

# Find all README.md files in subdirectories, excluding the main README.md
find . -type f -name "*.md" ! -path "./README.md" | while read -r filepath; do
    # Convert to an absolute path
    abs_filepath=$(cd "$(dirname "$filepath")"; pwd)/$(basename "$filepath")

    # Get the relative path from the base directory
    relative_path="${abs_filepath#$base_dir/}"

    # Remove the prefix path if it exists
    relative_path_without_prefix=${relative_path#"$PREFIX_TO_REMOVE"}

    # Remove the .md suffix from the relative path
    relative_path_without_md=${relative_path_without_prefix%.md}

    # Add a link to the subdirectory's README.md, removing the prefix from the path
    echo "$counter. [${relative_path_without_md%/README.md}]($relative_path)" >> $MAIN_README

    # Increment the counter
    ((counter++))
done
