# First REST API Spring Project

This project is a RESTful API built with Spring Boot for managing products. It demonstrates the implementation of CRUD operations (Create, Read, Update, Delete), exception handling, and H2 database integration.

## Technologies
* Java 17
* Spring Boot 3.2.0
* H2 Database (In-Memory)
* Swagger UI (OpenAPI 3.0) for testing

---

##  How to Run
1.  Clone the repository.
2.  Open the project in IntelliJ IDEA.
3.  Run `FirstRestApiSpringApplication`.
4.  Open Swagger UI in your browser: `http://localhost:8080/swagger-ui/index.html`
5.  Open H2 Console (optional): `http://localhost:8080/console`

---

##  API Endpoints & Tasks

### Task 2.A: Create a Product (POST)
**Endpoint:** `POST /api/v1/products`
Creates a new product by providing a name. The ID is auto-generated.

* **Request Body:**
    ```json
    {
      "name": "First product"
    }
    ```
* **Response (201 Created):**
    ```json
    {
      "name": "First product"
    }
    ```
**Screenshot:**
![img.png](img.png)

---

### Task 2.B: Get Product by ID (GET)
**Endpoint:** `GET /api/v1/products/{id}`
Retrieves a specific product using its unique ID.

* **Test:** Input ID `1`.
* **Response (200 OK):** Returns the product details.

**Screenshot: Postman**
![img_4.png](img_4.png)

**Screenshot: Swagger**
![img_3.png](img_3.png)

---

### Task 2.C & 2.D: Exception Handling (404 Not Found)
If a user tries to find a product that does not exist, the API returns a custom error message instead of a generic server error.

* **Test:** Input ID `1`(in swagger ui) (which does not exist).
* **Response (404 Not Found):**
    ```json
    {
      "message": "Product with 1 not found"
    }
    ```

**Screenshot: Swagger UI**
![img_5.png](img_5.png)

* **Test:** Input ID `25`(in postman) (which does not exist).
* **Response (404 Not Found):**
    ```json
    {
      "message": "Product with id 25 not found"
    }
    ```

**Screenshot: Postman**
![img_6.png](img_6.png)


---

### Task 2.E: Update a Product (PUT)
**Endpoint:** `PUT /api/v1/products/{id}`
Updates the name of an existing product.

Create a new product by providing a name. The ID is auto-generated.

* **Request Body:**
    ```json
    {
      "name": "First product"
    }
    ```
* **Response (201 Created):**
    ```json
    {
      "name": "First product"
    }
    ```
**Screenshot:**
![img_7.png](img_7.png)

**Endpoint:** `GET /api/v1/products/{id}`
Check if the product actually exists.

* **Test:** Input ID `1`.
* **Response (200 OK):** Returns the product details.

**Screenshot: Postman**
![img_8.png](img_8.png)

* **Test:** Update Product ID `1`.
* **Request Body:**
    ```json
    {
      "name": "Our first prodduct... (edited)"
    }
    ```
* **Response (200 OK):** The product name is updated in the database.

**Screenshot:**
![img_9.png](img_9.png)

**Endpoint:** `GET /api/v1/products/{id}`
Check if the product was successfully edited.

* **Test:** Input ID `1`.
* **Response (200 OK):** Returns the product details.

**Screenshot: Postman**
![img_10.png](img_10.png)

---

### Task 2.F: Delete & Find All
**1. Find All Products**
**Endpoint:** `GET /api/v1/products`
Returns a list of all products currently in the database.

* **Response body:**
    ```json
    [
       {
          "name": "Product 1"
       },
       {
          "name": "Product 2"
       },
       {
          "name": "Product 3"
       }
    ]
    ```

**Screenshot: Swagger UI**
![img_13.png](img_13.png)


**2.A Delete a Product that does not exit**
**Endpoint:** `DELETE /api/v1/products/{id}`
Trying to remove a product that was not created.

* **Test:** Delete ID `9`.
* **Response (404 Not Found):**
    ```json
    {
      "message": "Product with id 9 not found"
    }
    ```

**Screenshot: Swagger UI**
![img_14.png](img_14.png)

**2.B Delete a Product that exists**
**Endpoint:** `DELETE /api/v1/products/{id}`
Removes a product permanently.

* **Test:** Delete ID `3`.
* **Response (204 No Content):** Product is successfully removed.

**Screenshot: Swagger UI**
![img_15.png](img_15.png)


**1. Check updated list**
**Endpoint:** `GET /api/v1/products`
Returns a list of all products currently in the database.

* **Response body:**
    ```json
    [
       {
          "name": "Product 1"
       },
       {
          "name": "Product 2"
       }
    ]
    ```

**Screenshot: Swagger UI**
![img_16.png](img_16.png)
---

---

### Task 2.G: H2 Database Connection (The Final Step)
**Goal:** Verify that the application is connected to a real H2 database and that data is saved in the `PRODUCTS` table.
![H2DatabaseConsole.png](H2DatabaseConsole.png)







