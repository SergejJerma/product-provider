# Product provider backend dalis (RESTful)

Sukurta prodūktų siūlytojo back-end dalis, kuri pasiūlo klientui banko produktus, įvertinus kliento pateiktą informaciją


### Back-end
```
Java 11
Spring Boot 
Gradle
Lombok 
```

## Klasės
Programoje yra dvi POJO klasės - Product, ClientRequst bei enum'ai EProduct, EAgeGroup, EIncomeGroup.

## Veikimas
Servisas paleidžiamas iš .jar failo
* [product-provider-0.0.1-SNAPSHOT.jar](https://github.com/SergejJerma/product-provider/blob/master/product-provider-0.0.1-SNAPSHOT.zip) 
```
java -jar product-provider-0.0.1-SNAPSHOT.jar
```
API: dokumentacijai naudojamas Swagger UI http://localhost:8085/swagger-ui.html#

request body
```
{
  "ageGroup": "3",
  "incomeGroup": "4",
  "isStudent": true
}
```
response body
```
[
  {
    "name": "Current Account"
  },
  {
    "name": "Current Account Plus"
  },
  {
    "name": "Gold Credit Card"
  },
  {
    "name": "Student Account"
  },
  {
    "name": "Senior Account"
  },
  {
    "name": "Credit Card"
  }
]
```
  
## Testai
ClientServise pilnai padengtas testais.
