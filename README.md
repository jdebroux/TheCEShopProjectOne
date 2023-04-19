# The CE Shop interview Project #1

## Design Approach
- Create a new table in the database called user_progress to store user progress related data.  This table will be an association table connecting the user and course tables.
- In the user_progress table, we will store user_id, course_id, and completed_questions.
- The total_questions will be the total number of questions in the course and added to the course table.
- The completed_questions will be the number of questions a user has completed in the course.
- Note: courseProgress is not stored in the database.  As clean code recommends, any calculations should not be stored and should be handled on the fly.
- Create an endpoint in the Java backend to get the progress of a user in a course.
- The endpoint should take user_id and course_id as request parameters and return a UserProgress object that contains the totalQuestions, the completedQuestions, and the courseProgress.
- Use Javascript in the front-end to make a GET request to the endpoint and display the progress percentage to the user.

## Java Code
- Create a UserProgress model class to hold progress related data.
- Use JPA and create a UserProgressRepository interface to interact with the user_progress table in the database.
- Create a UserProgressService class to handle business logic related to progress.  Although in this case the logic to calculate the courseProgress will be completed in a mapstruct mapper.
- In the UserProgressService class, create a method getUserProgress that takes a UserProgressRequest object (user_id and course_id) as a parameter and returns a UserProgress object containing the total questions, completed questions, and course progress fields.
  - Use Mapstruct to map UserProgressEntity to UserProgress.
- Use Spring to create a REST endpoint to expose the getUserProgress method.

## SQL/MySQL
- I chose to utilize JPA for this design to interact with the database.
- Example screenshot of a MySQL EER Diagram for these tables can be found under resources/images.

## Javascript
- In the front-end, create a function to make a GET request to the endpoint created in the Java backend and get the progress percentage of the user in the course.
Display the progress percentage to the user.

## Dependencies Utilized
- Spring Boot
- Lombok
- Mapstruct

## Conclusion
- In this high-level solution, I have proposed adding a new table to store user progress related data, creating a Java backend endpoint to get the course progress percentage, using AngularJS in the front-end to display the progress percentage to the user. I have also provided a quick database EER example, Java code, and Javascript code snippets to help implement this feature. This approach provides a scalable and efficient solution for tracking and displaying progress to students.