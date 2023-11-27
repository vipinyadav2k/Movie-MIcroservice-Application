# Movie-Microservice-Application (RestTemplate)
This is a microservice application project using restTemplate

-------------------------------
Movie runs on port:1906
Theatre runs on port:8080
-------------------------------

In this project I am providing the services of Movie API in the Theatre Project.

Here is an Example where I am showing the Movie Details(synchronous communication) fetched by name into the Theatre Screening:
![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/64bb4ee9-8f28-4e7f-8729-51b2535e76a9)

in the 2nd example, I am displaying the info of the movies based on theatreId: 
![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/4bee7313-9f14-4f64-aa4f-c2446f0cfd56)

1) Find Movie By ID:

   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/55634534-248e-4ad8-ad47-08b9d220f134)

2) View All movies:

   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/d6dbd5b8-6638-48a8-8966-fcb611fe4e79)

3) Delete movie with ID 3 :
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/1b91433d-1e9f-48bf-8c02-cd64932739d5)
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/89f7e5d0-24cc-4582-b827-11b9cfba38d4)

4) Find Movie by Name :

   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/ccd6bed9-b6d2-4484-a9d3-e206a74a8ef9)

Similarly all the CRUD operations have been performed in the project:

Now For the Theatre Project: 

1) Find by TheatreId:
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/05837dd9-6c04-4335-9b53-c619ff7ce709)

2) FindByTheatreNameAndTheatreCity:
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/2852650c-8597-41c0-ab19-4049bd2a187f)

3) FindByScreenId:
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/91e2e7d4-df07-40db-8662-75793c798ba0)

4) List<Screen> findByTheatreId(long theatreId):
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/d7b426c5-86e5-4134-a528-306d6bda490a)

5) FindByScreeningDate(Date screeningDate):
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/1be759ef-817b-4149-9ebe-b42932eb67a0)

6) Screening findByMovieNameAndTheatreIdAndScreeningDateAndScreeningTime:
   ![image](https://github.com/vipinyadav2k/Movie-MIcroservice-Application/assets/122339831/4ce7c19a-3b07-497a-875e-aaf8dac8d66e)




