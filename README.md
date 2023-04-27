##### eilmadc-c4-dentistappoinment-springrestjpamsql-ex02
# C4 ex02 - Technical Test: Dentist Appoinments 

### Testing: Create an API with Spring JPA mysql.
![image](https://user-images.githubusercontent.com/57563030/234865331-71aef782-a9f8-4a1b-ac32-7e1da2ffbef1.png)
![image](https://user-images.githubusercontent.com/57563030/234865492-e4a20125-6498-4f8a-b8f7-8c344b93bd03.png)

## Creating Project:

Its a **Spring Maven War** Project with the following dependencies related in **pom.xml**:

         <dependencies>
          <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-data-jpa</artifactId>
          </dependency>
          <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-web</artifactId>
          </dependency>

          <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-devtools</artifactId>
           <scope>runtime</scope>
           <optional>true</optional>
          </dependency>
          <dependency>
           <groupId>com.mysql</groupId>
           <artifactId>mysql-connector-j</artifactId>
           <scope>runtime</scope>
          </dependency>
          <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-tomcat</artifactId>
           <scope>provided</scope>
          </dependency>
          <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-test</artifactId>
           <scope>test</scope>
          </dependency>
         </dependencies>


## Data model ER
![ex02 Dentists-Appoinments drawio](https://user-images.githubusercontent.com/57563030/234975430-9346abcc-0dd6-4e0c-96c9-1153486c874a.png)

## Postman Collection

Link: https://www.postman.com/eilmadc/workspace/eilmadc-ws/collection/17239322-40388baa-840c-4693-a709-3268fbe372cf?action=share&creator=17239322

![image](https://user-images.githubusercontent.com/57563030/234870200-55164c00-17b9-4015-adb6-ce3b0b64ec71.png)

## Endpoints Requirements without login
### 1. Read an Client/Dentist - GetById
   - **method:** GET
   - **endpoint:** localhost:8181/api/clients/{id}
   - **example:** localhost:8181/api/clients/5
   - **response:**
   
   ![image](https://user-images.githubusercontent.com/57563030/234977309-66cebdf2-f93a-4a7e-8d8e-fa6ae00e190d.png)


### 2. Update Client/Dentist data profile
   - **method:** PUT
   - **endpoint:** localhost:8181/api/clients/{id}
   - **example:** localhost:8181/api/clients/3
   - **response:**

![image](https://user-images.githubusercontent.com/57563030/234978232-c572952a-8d9f-4854-913d-9b20aec67fbc.png)

### 3. Create an Appoinment
   - **method:** POST
   - **endpoint:** localhost:8181/api/appoinments
   - **example:** localhost:8181/api/appoinments
   - **response:**

![image](https://user-images.githubusercontent.com/57563030/234978831-acdfbf42-24c1-4560-9e46-646d73b77355.png)

### 4. Update an Appoinment
   - **method:** PUT
   - **endpoint:** localhost:8181/api/appoinments/{id}
   - **example:** localhost:8181/api/appoinments/3
   - **response:**
   
   ![image](https://user-images.githubusercontent.com/57563030/234979241-0c253a86-df9f-4cfd-af7c-7e6054c8dc81.png)

### 5. Delete an Appoinment (by id)
   - **method:** DELETE
   - **endpoint:** localhost:8181/api/clients/{id}
   - **example:** localhost:8181/api/clients/4
   - **response:**
   
   ![image](https://user-images.githubusercontent.com/57563030/234980357-68497a38-524d-4845-9ed4-bddb58cf626f.png) 

### 6. Read all appointments for an client (by id)
   - **method:** GET
   - **endpoint:** localhost:8181/api/appoinments/clients/{id}
   - **example:** localhost:8181/api/appoinments/clients/5
   - **response:**
   
   ![image](https://user-images.githubusercontent.com/57563030/234979946-a9c11dd5-89c7-4d95-ae8d-4ba39bba584d.png)

### 7. Read all appointments for an dentist (by id)
   - **method:** GET
   - **endpoint:** localhost:8181/api/appoinments/dentists/{id}
   - **example:** localhost:8181/api/appoinments/dentists/2
   - **response:**

   ![image](https://user-images.githubusercontent.com/57563030/234981052-d8d0daa4-9bbf-44e3-b762-0aee88d788a7.png)
   
### 8. Read all Clients
   - **method:** GET
   - **endpoint:** localhost:8181/api/clients
   - **example:** localhost:8181/api/clients
   - **response:**
   
  ![image](https://user-images.githubusercontent.com/57563030/234981725-571853da-608c-48a6-9698-766463c2c675.png)
 
  
### 9. EXTRA Read an appointment
   - **method:** GET
   - **endpoint:** localhost:8181/api/appoinments/{id}
   - **example:** localhost:8181/api/appoinments/5
   - **response:**

   ![image](https://user-images.githubusercontent.com/57563030/234981378-490d6a37-9a7e-43e0-8fa0-bb1d8fbd4b32.png)

### 10. EXTRA Update an dentist in appoinment
   - **method:** PUT
   - **endpoint:** localhost:8181/api/appoinments/{id}
   - **example:** localhost:8181/api/appoinments/5
   - **response:**
   
![image](https://user-images.githubusercontent.com/57563030/234982200-d6ac12a1-a0bc-4f62-840e-ec4192ae4c15.png)

### 11. EXTRA Read all appointments for an dentist (by id)
   - **method:** GET
   - **endpoint:** localhost:8181/api/appoinments/dentist/{id}
   - **example:** localhost:8181/api/appoinments/dentist/5
   - **response:**
   
![image](https://user-images.githubusercontent.com/57563030/234982607-60514375-60cd-4a2e-b460-c25cebcabf4c.png)

