# m320

## Kompetenzen

- They are all located in <u>"src/main/java"</u>  

  
## Project

### Description
My Project is a songs library. Then main functions are that the user can add songs and artists. The songs can be formed into playlists and artists have albums.
The main idea is that the song that is being added and an artist get assigned to each other immediately.
There should be a function for showing statistics of the listened song's duration.

### Set up
Backend of the project is in <u>/src/main/java/project.songsLibrary</u>  
The frontend of the project is located in <u>/src/main/project-frontend-songsLibrary</u>  
Class Diagramms are located in the backend project folder: <u>../project.songsLibrary/Diagrams</u>

- To start the **backend** do  
`mvn clean`  
`mvn spring-boot:run`
- To start the **frontend** do `yarn dev`

To create Database container:  
```shell
docker run --name projectM320 -e POSTGRES_PASSWORD=songs -e POSTGRES_USER=library -p 5432:5432 -d postgres:16
```

### Design Pattern:  
My application is based on a builder design pattern in java. It is based on that entities are being created with their properties and relationships.  
All entities are constructed and created on their own and no implementation is really done much. As an example: creating entities like Songs, Artists, Playlist, Album and their relations make it a builder design pattern.
