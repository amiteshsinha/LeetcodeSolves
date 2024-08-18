#!/bin/bash

# Set the path to the main README.md
MAIN_README="README.md"

# The prefix path to remove
PREFIX_TO_REMOVE="src/main/java/com/leetcode"

# Start with a header
echo "# Project Title" > $MAIN_README
echo "" >> $MAIN_README
echo "## Subdirectory READMEs" >> $MAIN_README
echo "" >> $MAIN_README

# Get the absolute path of the current directory
base_dir=$(pwd)

# Find all README.md files in subdirectories, excluding the main README.md
find . -type f -name "*.md" ! -path "./README.md" | while read -r filepath; do
    # Convert to an absolute path
    abs_filepath=$(cd "$(dirname "$filepath")"; pwd)/$(basename "$filepath")

    # Get the relative path from the base directory
    relative_path="${abs_filepath#$base_dir/}"

    # Remove the prefix path if it exists
    relative_path_without_prefix=${relative_path#"$PREFIX_TO_REMOVE"}

    # Add a link to the subdirectory's README.md, removing the prefix from the path
    echo "- [${relative_path_without_prefix%/README.md}]($relative_path)" >> $MAIN_README
done