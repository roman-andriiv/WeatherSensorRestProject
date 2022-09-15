# "Weather Sensor" REST Application



Project Description:

Meteorological sensor. This sensor measures the ambient temperature and can detect whether it is raining or not. 
We simulate the sensor using WeatherSensorClient module. Getting data from the sensor and saving it to the database using the 
WeatherSensorRestApplication. Also, "WeatherSensorClient" module is able to draw a graph (by 'DrawChart' class) based on the temperatures received from the server. 


Technology stack used : ✅Java ✅Spring (Core, MVC, Boot, Web, REST, Data JPA, Validation) ✅Hibernate ✅PostgreSQL ✅Maven
✅XChart (to draw a graph)
<br />

Screenshots:

- Register new sensor:

![Screenshot 2022-09-15 152846](https://user-images.githubusercontent.com/63511356/190417498-8df1a1f1-e38a-4ca0-9553-c12ca942be6f.png)

- Add new measurement:

![Screenshot 2022-09-15 152846](https://user-images.githubusercontent.com/63511356/190418597-a6846954-ba2a-4058-ac73-53645fe955be.png)

- Return the all measurements from the database:

![Screenshot 2022-09-15 152846](https://user-images.githubusercontent.com/63511356/190419873-1b3f0b2d-99fd-4a8f-92fc-d1ea3a5c55d4.png)

- Return count of rainy days from the database:

![Screenshot 2022-09-15 152846](https://user-images.githubusercontent.com/63511356/190421350-4e959cc3-1023-485c-b8e3-c0325b734d44.png)

- The graph from  the testing temperature data (generated in 'WeatherSensorClient' module)

![Screenshot 2022-09-15 152846](https://user-images.githubusercontent.com/63511356/190422430-e9ec780b-bbcb-4a28-837d-ed1f81d3e9ae.png)