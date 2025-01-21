# m320

## Kompetenzen

- They are all located in <u>"src/main/java"</u>  

  
## Project

Backend of the project is in <u>"/src/main/java/project.songsLibrary".</u>  
The frontend of the project is located in <u>"/src/main/project-frontend-songsLibrary".</u>

- To start the **backend** do `run`
- To start the **frontend** do `yarn dev`

To create Database container:  
```shell
docker run --name projectM320 -e POSTGRES_PASSWORD=songs -e POSTGRES_USER=library -p 5432:5432 -d postgres:16
```

Design Pattern:
I have chosen the builder pattern
