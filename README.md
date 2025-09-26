# Notes_App
This is a console-based Java program that works as a simple notes manager. It allows the user to create multiple text files for different notes, add or append content to them, and read saved notes by entering the file name.
The program makes use of FileWriter for writing data and FileReader/BufferedReader for reading data, which helps in understanding how file handling works in Java.

Features:
  -Create a new file by entering a custom name.
  -Add or append notes to the file.
  -Read notes from any existing file by entering its name.
  -Uses .trim() to prevent accidental spaces in file names.
  -Handles errors gracefully using exception handling (try-catch).

Sample Output:


--- Notes Manager ---
1. Create/Add notes to a file
2. Read notes from a file    
3. Exit
Choose an option: 1
Enter file name (without .txt): Greetings
Enter your notes (type 'END' to finish):
Hello
Good Afternoon...
How are you?
END
Notes saved in Greetings.txt

--- Notes Manager ---
1. Create/Add notes to a file
2. Read notes from a file
3. Exit
Choose an option: 2
Enter file name to read (without .txt): Greetings

--- Contents of Greetings.txt ---
Hello
Good Afternoon...
How are you?
-------------------------------

--- Notes Manager ---
1. Create/Add notes to a file
2. Read notes from a file
3. Exit
Choose an option: 3 
Exiting...
