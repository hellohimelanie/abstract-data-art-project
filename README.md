# Unit 4 - Abstract Art Project

## Introduction

Data visualizations are powerful tools to present information and convey patterns and relationships. Sometimes visualizations are charts or graphs, and other times they are more abstract pieces of art. Your goal is to create a visual representation relating at least two categories from your dataset that engages your viewer and encourages them to learn more about your chosen topic.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data visualization program:

- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use methods in the Math class** – Use one or more methods in the Math class in your program, such as to perform calculations on the values in your dataset and display the results, choose random values from the dataset, or display images or shapes at random locations.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
  Note: This may be abstract! Others do not necessarily need to know what the story or pattern is right away, but you do need to be able to explain it to them.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## Dataset

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type.

Dataset: https://docs.google.com/spreadsheets/d 1oh7pk05XvhD4noaJoeZmJJvKQjdJStWb8uS9QJbcR4E/edit?usp=sharing

- **Breeds** (String) - names of the breed of cats
- **Origins** (String) - names of origin of the breed
- **Maximum Life Span** (int) - the maximum lifespan of each breed

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML Diagram for my project](![alt text](image-1.png))

## Video Demo

Record a short video of your abstract art animation to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![Thumbnail for my projet](![alt text](image-2.png))]
([youtube-URL-here](https://youtu.be/6VbmEC2hwKA))

## Description

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

For my project I used the cats dataset. In my code, the cats dataset was used to store information of the breed, the origin, and the maximum lifespan. I used the maximum life span to calculate the average by adding up the total and dividing it by the number of lifespans there are for each breed. Then I used it in another method to decide the textbox color when displaying a cat. Whenever a cat is displayed on a text box with it's information such as it's breed, origin, and lifespan, it decides whether it's lifespan is more than average or if it's anything else using if else statements. If it's more then the color of the textbox is pink. If it's less then it's using purple. That method is then used in a bigger method where it's used to actually draw it on the theater. Once drawn, the font gets set to a smaller size so everything can fit and it chooses a random number to decide how many breeds of cats it should show. Each time a cat is displayed it plays a note and pauses before moving on to the next. 
